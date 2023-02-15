import java.io.*;
import java.io.*;   
   public class PhoneDirectory {
   
      /* The data for the directory is stored in a pair of arrays.  The phone
         number associated with the name names[i] is numbers[i].  These
         arrays will grow, as necessary, to accommodate as many entries as
         are added to the directory.   The variable count keeps track of
         the number of entires in the directory. */
   
      private String[] names = new String[1];
      private String[] numbers = new String[1];
      private int count = 0;
      
      
      public  boolean changed;  // This variable is set to true whenever a change
                                // is made to the data in this directory.  The value
                                // is false when the object is created.  The only time
                                // that it is reset to false is if the load() method
                                // is used to load a phone directory from a stream.
                                // (Programs that use the directory can also set the
                                // value of changed if they want, since it's public.)
      
      
      public void load(TextReader in) throws IOException {
             // Clears any entries currently in the directory, and loads
             // a new set of directory entries from the TextReader.  The
             // data must consist of the following:  a line containing the
             // number of entries in the directory;  two lines for each
             // entry, with the name on the first line and the associated
             // number on the second line.  Note that this method might
             // throw an IllegalArgumentException if the data in the file
             // is not valid -- for example if the same name occurs twice.
             // Note that if an error does occur, then the original
             // data in the directory remains.
          int newCount = in.getlnInt();
          String[] newNames = new String[newCount + 5];
          String[] newNumbers = new String[newCount + 5];
          for (int i = 0; i < newCount; i++) {
             newNames[i] = in.getln();
             newNumbers[i] = in.getln();
          }
          count = newCount;
          names = newNames;
          numbers = newNumbers;
          changed = false;
      }
      
      
      public void save(PrintWriter out) {
            // Saves all the entries in the directory to the PrintWriter.
            // Data is written in the same format that is used in the load()
            // method.  Note that PrintWriters do not throw exceptions.
            // To test whether the data was written successfully, the
            // caller of this routine can call out.checkError().
         out.println(count);
         for (int i = 0; i < count; i++) {
            out.println(names[i]);
            out.println(numbers[i]);
         }
      }
         
   
      public String numberFor(String name) {
             // Get the phone number associated with the given name, if any.
             // If the name does not exist in the directory, null is returned.  The
             // name cannot be null.  (If it is, an IllegalArgumentException is thrown.)
         if (name == null)
            throw new IllegalArgumentException("Name cannot be null in numberFor(name)");
         int position = indexOf(name);
         if (position == -1)
            return null;
         else
            return numbers[position];
      }
      
   
      public void addNewEntry(String name, String number) {
             // Create a new entry in the directory for the given name and number.
             // An IllegalArgumentException is thrown if the name is already in
             // the directory or if either of the parameters is null.  If the
             // arrays, "names" and "numbers", that hold the data are full,
             // replace them with larger arrays.
         if (name == null)
            throw new IllegalArgumentException("Name cannot be null in addNewEntry(name,number)");
         if (number == null)
            throw new IllegalArgumentException("Number cannot be null in addNewEntry(name,number)");
         int position = indexOf(name);
         if (position != -1)
            throw new IllegalArgumentException("Name already exists in addNewEntry(name,number).");
         if (count == names.length) {
            String[] tempNames = new String[ 2*count ];
            String[] tempNumbers = new String[ 2* count];
            System.arraycopy(names, 0, tempNames, 0, count);
            System.arraycopy(numbers, 0, tempNumbers, 0, count);
            names = tempNames;
            numbers = tempNumbers;
         }
         names[count] = name;
         numbers[count] = number;
         count++;
         changed = true;
      }
      
   
      public void deleteEntry(String name) {
             // Remove the entry for the specified name from the directory, if
             // there is one.  If the specified name does not exist in the
             // directory, nothing is done and no error occurs.
         if (name == null)
            return;
         int position = indexOf(name);
         if (position == -1)
            return;
         names[position] = names[count-1];
         numbers[position] = numbers[count-1];
         count--;
         changed = true;
      }
      
   
      public void updateEntry(String name, String number) {
              // Change the number associated with the given name.  An IllegalArgumentException
              // is thrown if the name does not exist in the directory or if either of
              // the parameters is null.
         if (name == null)
            throw new IllegalArgumentException("Name cannot be null in updateEntry(name,number)");
         if (number == null)
            throw new IllegalArgumentException("Number cannot be null in updateEntry(name,number)");
         int position = indexOf(name);
         if (position == -1)
            throw new IllegalArgumentException("Name not found in updateEntry(name,number).");
         numbers[position] = number;
         changed = true;
      }
   
   
      private int indexOf(String name) {
            // Finds and returns the position of the name in the names array,
            // ignoring case.  Returns -1 if the name does not occur in the
            // array.
         for (int i = 0 ; i < count; i++) {
            if (names[i].equalsIgnoreCase(name))
               return i;
         }
         return -1;
      }
   
      
   }  // end class PhoneDirectory
   




   /*
       This program serves as an interface to a (very simplistic) phone
       directory.  The directory is implemented as an object belonging
       to the class PhoneDirectory.  This object keeps a list of names
       and associated numbers.  A name can occur at most once in the
       directory.  When the program is loaded, the data for the directory
       is loaded from a file.  The name of the file can be given on 
       the command line; otherwise, it is given by the constant
       DEFAULT_FILENAME.  If the data is changed while the program is
       running, then the file is rewritten with the changed data before
       the program terminates.
          If no file with the given name exists when the program is
        run, the user is given the option of creating a new, empty
        phone directory file.
          The user can perform a sequence of operations on the directory
        chosen from this list:  Look up a number, add an entry, delete an 
        entry, or modify an entry.  This continues until the user chooses
        to exit from the program.
   */
   
   
   
   
   public class Phones {
   
       static final String DEFAULT_FILENAME = "phones.dat";
   
       static PhoneDirectory directory;  // Holds the data for
                                         //    the phone directory.
   
   
       public static void main(String[] args) {
       
          String fileName;  // Name of file that stores the directory data.
          boolean done;  // Set to true when the user wants to exit the program.
          
          /* Get the file name from the command line, or use the
             DEFAULT_FILENAME if there is no command-line argument. */
          
          if (args.length == 0)
             fileName = DEFAULT_FILENAME;
          else
             fileName = args[0];
          
          /* Read the phone directory data from the file.  This routine
             might terminate the program if an error occurs when the
             attempt is made to end the data. */
          
          readPhoneData(fileName);
          
          /* Show user a menu of available operations, get the user's
             choice, and carry it out.  Repeat until the user selects
             the "Exit from this program" operation.  Each of the other
             four commands is carried out by calling a subroutine. */
          
          done = false;
          
          while (done == false) {
              TextIO.putln();
              TextIO.putln();
              TextIO.putln("Select the operation you want to perform:");
              TextIO.putln();
              TextIO.putln("     1.  Look up a phone number");
              TextIO.putln("     2.  Add an entry to the directory");
              TextIO.putln("     3.  Delete an entry from the directory");
              TextIO.putln("     4.  Change someone's phone number");
              TextIO.putln("     5.  Exit form this program.");
              TextIO.putln();
              TextIO.put("Enter the number of your choice: ");
              int menuOption = TextIO.getlnInt();
              switch (menuOption) {
                 case 1:
                    doLookup();
                    break;
                 case 2:
                    doAddEntry();
                    break;
                 case 3:
                    doDeleteEntry();
                    break;
                 case 4:
                    doModifyEntry();
                    break;
                 case 5:
                    done = true;
                    break;
                 default:
                    System.out.println("Illegal choice! Please try again.");
              }  // end switch
          } // end while
          
          /* If the phone directory data has been modified, write the
             changed data back to the file. */
          
          if (directory.changed == true)
             writePhoneData(fileName);
             
          TextIO.putln("\nExiting program.");
       
       } // end main()
   
   
       static void readPhoneData(String fileName) {
             // Get the data for the phone directory from the specified
             // file.  Terminate the program if an error occurs.  If the
             // file does not exist, give the user the option of creating
             // it.
          TextReader in;  // A stream for reading the data.
          try {
                // Try to create a stream for reading from the file.
                // If the file is not found, set the value of in to null.
             in = new TextReader( new FileReader(fileName) );
          }
          catch (Exception e) {
             in = null;
          }
          if (in == null) {
                  // The specified file could not be opened.  Give the
                  // user the option of creating a new, empty file.
             TextIO.putln("\nThe file \"" + fileName + "\" does not exist.");
             TextIO.put("Do you want to create the file? ");
             boolean create = TextIO.getlnBoolean();
             if (create == false) {
                TextIO.putln("Program aborted.");
                System.exit(0);
             }
             directory = new PhoneDirectory();  // A new, empty phone directory.
             try {
                   // Try to create the file.
                PrintWriter out = new PrintWriter( new FileWriter(fileName) );
                directory.save(out);
                if (out.checkError())
                   throw new Exception();
                TextIO.putln("Empty directory created.");
             }
             catch (Exception e) {
                TextIO.putln("Can't create file.");
                TextIO.putln("Program aborted.");
                System.exit(0);
             }
          }
          else {
                // The input stream was created successfully.  Get the data.
             try {
                 directory = new PhoneDirectory();  // A new, empty directory.
                 directory.load(in);  // Try to load it with data from the file.
             }
             catch (Exception e) {
                TextIO.putln("An error occurred while read data from \"" + fileName + "\":");
                TextIO.putln(e.toString());
                TextIO.putln("Program aborted.");
                System.exit(0);
             }
          }
       }  // end readPhoneData()
       
       
       static void writePhoneData(String fileName) {
            // Save the data from the phone directory to the specified file.
          PrintWriter out;
          try {
             out = new PrintWriter( new FileWriter(fileName) );
          }
          catch (Exception e) {
             TextIO.putln("\nCan't open file for output!");
             TextIO.putln("Changes have not been saved.");
             return;
          }
          directory.save(out);
          if (out.checkError()) {
             TextIO.putln("Some error occurred while saving data to a file.");
             TextIO.putln("Sorry, but your phone directory might be ruined");
          }
       }
       
       
       static void doLookup() {
              // Carry out the "Look up a phone number" command.  Get
              // a name from the user, then find and print the associated
              // number if any.
          TextIO.putln("\nLook up the name: ");
          String name = TextIO.getln();
          String number = directory.numberFor(name);
          if (number == null)
             TextIO.putln("\nNo such name in the directory.");
          else
             TextIO.putln("\nThe number for " + name + " is " + number);
       }
       
       
       static void doAddEntry() {
              // Carry out the "Add an entry to the directory" command.
              // This will only work if the name that the user specifies
              // does not already exist in the directory.  If it does,
              // print an error message and exit.  Otherwise, get the
              // number for that person from the user and add the entry
              // to the directory.
          TextIO.putln("\nAdd entry for this name: ");
          String name = TextIO.getln();
          if (directory.numberFor(name) != null) {
             TextIO.putln("That name is already in the directory.");
             TextIO.putln("Use command number 4 to change the entry for " + name);
             return;
          }
          TextIO.putln("What is the number for " + name + "? ");
          String number = TextIO.getln();
          directory.addNewEntry(name,number);
       }
       
       
       static void doDeleteEntry() {
              // Carry out the "Delete an entry from the directory" command.
              // Get the name to be deleted from the user and delete it.
              // If the name doesn't exist in the directory, print a message.
          TextIO.putln("\nDelete the entry for this name: ");
          String name = TextIO.getln();
          if (directory.numberFor(name) == null)
             TextIO.putln("There is not entry for " + name);
          else {
             directory.deleteEntry(name);
             TextIO.putln("Entry deleted.");
          }
       }
       
       
       static void doModifyEntry() {
              // Carry out the "Change someone's phone number" command.
              // Get the name from the user.  If the name does not exist
              // in the directory, print a message and exit.  Otherwise,
              // get the new number for that person and make the change.
          TextIO.putln("\nChange the number for this name: ");
          String name = TextIO.getln();
          if (directory.numberFor(name) == null) {
             TextIO.putln("That name is not in the directory.");
             TextIO.putln("Use command number 2 to add an entry for " + name);
             return;
          }
          TextIO.putln("What is the new number for " + name + "? ");
          String number = TextIO.getln();
          directory.updateEntry(name,number);
       }
   
   
   } // end class Phones

