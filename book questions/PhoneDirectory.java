

/**
 *
 * @author HP
 */
public class PhoneDirectory {
    public static viod main(String[]srgs){
        
    PhoneEntry[] info = new PhoneEntry[100];  // Space for 100 entries.
        int entries = 0;  // Actual number of entries in the array.
        return null;
    }
        void addEntry(String name, String phoneNum) {
               // Add a new item at the end of the array.
           info[entries] = new PhoneEntry();
           info[entries].name = name;
           info[entries].phoneNum = phoneNum;
           entries++;
        }
        
        String getNumber(String name) {
              // Return phone number associated with name,
              // or return null if the name does not occur 
              // in the array.
           for (int index = 0; index < entries; index++) {
              if (name.equals( info[index].name ))  // Found it!
                 return info[index].phoneNum;
           }
           return null;  // Name wasn't found.
        }
        
     }

