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
 * @author Naritaa
 */
public class GenreManager {
    private static String filepath = "data\\genres.txt";
    
    public static void addGenre(String name){
        try{
            PrintWriter pw = new PrintWriter(new FileWriter(filepath, true));
            pw.println(name );
            pw.close();
        } catch(IOException ex){
            System.out.println("FILE NOT FOUND");
        
        }
    
    }
    public static String getGenre(){
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
    public static void deleteGenre(String name){
        try {
			Scanner sc = new Scanner(new File(filepath));
			String output = "";
			String genre = name;

			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				if (!line.equalsIgnoreCase(genre)) {
					output += line + "\n";
				}
			}
			sc.close();

			PrintWriter pw = new PrintWriter(new FileWriter(filepath, false));
			pw.print(output);
			pw.close();
		} catch (FileNotFoundException ex) {
			System.out.println("genre file not found");
		} catch (IOException ex) {
			System.out.println("Could not delete genre");
		}
    
    
    
    }
   
    ////
     public static String[] getGenresAsArray() {
		try {
			Scanner sc = new Scanner(new File(filepath));
			int numGenres = getNumegenres();
			String[] outputArr = new String[numGenres];
			int currentIndex = 0;
			while (sc.hasNextLine()) {
				outputArr[currentIndex] = sc.nextLine();
				currentIndex++;
			}
			sc.close();
			return outputArr;
		} catch (FileNotFoundException ex) {
			System.out.println("Genres file not found");
			return null;
		}
	}
    private static int getNumegenres() {
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
			System.out.println("Genres file not found");
			return -1;
		}
	}
    
}
