import java.util.Scanner;
public class PhoneBook {
    

    public static void main(String[] args) {
        String[] names = new String[100]; 
        int[] phones = new int[100];
        int currentSize = 0;
        for (int i = 0; i < 7; i++) {
            currentSize = addRecord(names, phones, currentSize);
            displayAll(names, phones, currentSize);
        }
    }

   
    public static void displayAll(String[] names, int phones[], int currentSize) 
    {
        System.out.println("\n\n\nThe items currently in the phonebook are :-\n\n");

        for (int i = 0; i < currentSize; i++) 
        {
            System.out.println(names[i] + "\t" + phones[i]); 
        }

        System.out.println("\n\n");
    }

    
    public static boolean searchRecord(int[] phones, int currentSize, int phoneNumberToSearch) 
    {
        for (int i = 0; i < currentSize; i++) 
        {
            if (phones[i] == phoneNumberToSearch) 
            {
                return true; 
            }
        }

        return false; 
    }

    
    public static int addRecord(String[] names, int[] phones, int currentSize) 
    {
        Scanner scan = new Scanner(System.in); 

        System.out.println("\nEnter THE name : "); 
        String name = scan.nextLine();

        System.out.println("\nEnter phoneNum : "); 
        
        int phoneNumber = scan.nextInt();

        if (searchRecord(phones, currentSize, phoneNumber) == true) 
        {
            System.out.println("\n\nThe phoneNumber already exists in the phonebook."); 
            return currentSize; 
        }

        names[currentSize] = name; 
        phones[currentSize] = phoneNumber;

        currentSize++; 

        System.out.println("\n\nThe record " + name + " " + phoneNumber + " was succesfully saved"); 
        return currentSize; 
    }

    
}

