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
import java.util.Scanner;

/**
 *
 * @author Narita
 */
public class AuthorManager {
    
    private static String filepath = "data\\authors.txt";
   
    //add new author
    //print writer writes to file
    public static void addAuthor(String name){
        
       try{
            PrintWriter pw = new PrintWriter(new FileWriter(filepath, true));
            pw.println(name );
            pw.close();
        } catch(IOException ex){
            System.out.println("FILE NOT FOUND");
        
        }
       

    }
    //ahhhhhhhhhhhhhhhhhhhhh
    //gets whole line
    public static String getAuthors(){
    
        try {
			Scanner sc = new Scanner(new File(filepath));
			String output = "";

			while (sc.hasNextLine()) {
				output += sc.nextLine() + "\n";
                                
			}
			sc.close();
			return output;
		} catch (FileNotFoundException ex) {
			System.out.println("Author file not found");
			return null;
		}
    }
    
    public static void deleteAuthor(String name, String surname){
        try {
			Scanner sc = new Scanner(new File(filepath));
			String output = "";
			String fullname = name + " " + surname;

			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				if (!line.equalsIgnoreCase(fullname)) {
					output += line + "\n";
				}
			}
			sc.close();

			PrintWriter pw = new PrintWriter(new FileWriter(filepath, false));
			pw.print(output);
			pw.close();
		} catch (FileNotFoundException ex) {
			System.out.println("Author file not found");
		} catch (IOException ex) {
			System.out.println("Could not delete author");
		}
    
    
    
    }
    public static String[] getAuthorsAsArray() {
		try {
			Scanner sc = new Scanner(new File(filepath));
			int numAuthors = getNumAuthors();
			String[] outputArr = new String[numAuthors];
			int currentIndex = 0;
			while (sc.hasNextLine()) {
				outputArr[currentIndex] = sc.nextLine();
				currentIndex++;
			}
			sc.close();
			return outputArr;
		} catch (FileNotFoundException ex) {
			System.out.println("Authors file not found");
			return null;
		}
	}
    private static int getNumAuthors() {
		try {
			Scanner sc = new Scanner(new File(filepath));
			int count = 0;
			while (sc.hasNextLine()) {
				sc.nextLine();
				count++;
			}
			sc.close();
			return count;
		} catch (FileNotFoundException ex) {
			System.out.println("Authors file not found");
			return -1;
		}
	}
    

}
