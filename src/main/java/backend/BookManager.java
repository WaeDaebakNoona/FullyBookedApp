/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import static backend.UserManager.filepath;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Naritaa
 */
public class BookManager {
    public static String filepath = "booksTextFile//users.txt";
    
    public static void addBook(String title, String author , String genre, int rating, String summary){ 

        try {
            PrintWriter pw = new PrintWriter(new FileWriter(filepath, true));
            //add more stuff here
            pw.println(title + "#" + author);
            pw.close();
        } catch (IOException ex) {
            System.out.println("File not found");
        } 
  
    }
    public static String getAuthors(){
        try {
            Scanner sc = new Scanner(new File(filepath));
            String output = "";
            
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                
                Scanner linesc = new Scanner(line).useDelimiter("#");
                
                String title = linesc.next();
                String author = linesc.next();
                //add more lines here
                
                //if(!title.equals(titleToDelete){   <--- delete book |  output += line + "\n"
                output += author + "\n";
            }
            sc.close();
            return output;
        } catch (FileNotFoundException ex) {
            System.out.println("Author not found");
        }
        return null;   
    }
    public static String getTitles(){
        try {
            Scanner sc = new Scanner(new File(filepath));
            String output = "";
            
            while(sc.hasNextLine()){
                output += sc.hasNextLine() + "\n";
                
            }
            sc.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Title not found");
        }
        return null;
    }
    
    public static void deleteBook(String titleToDelete){
       
		try {
			Scanner sc = new Scanner(new File(filepath));
			String output = "";

			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				if (!line.equalsIgnoreCase(titleToDelete)) {
					output += line + "\n";
				}
			}
			sc.close();

			PrintWriter pw = new PrintWriter(new FileWriter(filepath, false));
			pw.print(output);
			pw.close();
		} catch (FileNotFoundException ex) {
			System.out.println("Book not found");
		} catch (IOException ex) {
			System.out.println("Could not delete student");
		}
	}
    
    }
    
    

        

