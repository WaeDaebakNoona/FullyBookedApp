/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import static backend.BookManager.filepath;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Narita
 */
public class editAuthorAndGenre {
    
    //private Static String filepath = "data\\authors.txt"
    
    public static String addAuthor(String name, String surname){
        
       try{
            PrintWriter pw = new PrintWriter(new FileWriter(filepath, true));
            pw.println(name + "#" + surname);
            pw.close();
        } catch(IOException ex){
            System.out.println("FILE NOT FOUND");
        
        }
        return null;

    }
    //ahhhhhhhhhhhhhhhhhhhhh
    public static String getAuthor(String name, String surname){
    
        try {
			Scanner sc = new Scanner(new File(filepath));
			String output = "";

			while (sc.hasNextLine()) {
				output += sc.nextLine() + "\n";
			}
			sc.close();
			return output;
		} catch (FileNotFoundException ex) {
			System.out.println("Students file not found");
			return null;
		}
    }
    
}
