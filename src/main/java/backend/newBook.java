/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package backend;

/**
 *
 * @author Naritaa
 */
public class newBook {
    private static String filepathy = "data\\addBooks.txt";

    public static void addTitle(String title){    
    try {
            FileWriter fw = new FileWriter(filepathy,true);
             PrintWriter pw = new PrintWriter(fw) ;
             
                pw.println(title);
                
                pw.close();  
        } catch (IOException ex) {
            System.out.println("File not found");
        }
    }//ps title end
}//public class end
