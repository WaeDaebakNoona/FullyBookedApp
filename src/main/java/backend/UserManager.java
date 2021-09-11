/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Naritaa
 */
public class UserManager {
    public static String filepath = "data//users.txt";
    
    public static void addUser(String username, String password){
        try{
            PrintWriter pw = new PrintWriter(new FileWriter(filepath, true));
            pw.println(username + "#" + password);
            pw.close();
        } catch(IOException ex){
            System.out.println("FILE NOT FOUND");
        
        }
    }
    public static boolean checkUser(String username, String password){
        try {
            Scanner sc = new Scanner(new File(filepath));
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                
                Scanner lineSc = new Scanner(line).useDelimiter("#");
                String currentUsername = lineSc.next();
                String currentPassword = lineSc.next();
                if(currentUsername.equals(username) && currentPassword.equals(password)){
                    return true;
                }
                lineSc.close();
            }
            sc.close();
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
        }
            return false;
    
    }
    
}
