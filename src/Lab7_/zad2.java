package Lab7_;
import java.io.File;
 import java.io.FileNotFoundException;
 import java.util.Scanner;
 
 public class Zad2 {
	 //odczytywanie
     public static void main(String[] args) throws FileNotFoundException {
         File file = new File("testy444.txt");
         Scanner in = new Scanner(file);
 
         while (in.hasNextLine()) {
             String zdanie = in.nextLine();  // Odczytujemy pojedynczą linię
             System.out.println(zdanie);      // Wypisujemy ją na ekranie
         }
         
         in.close();
     }
 }



