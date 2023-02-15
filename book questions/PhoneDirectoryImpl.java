
import static java.awt.SystemColor.info;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class PhoneDirectoryImpl extends PhoneDirectory {
    public class PhoneDirectory {
    
        
    PhoneEntry[] info = new PhoneEntry[100];  // Space for 100 entries.
        int entries = 0;  // Actual number of entries in the array.
        
    
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


}
