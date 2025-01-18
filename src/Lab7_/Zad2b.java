package Lab7_;

import java.io.FileNotFoundException;
 import java.io.PrintWriter;
 
 public class Zad2b{
     public static void main(String[] args) throws FileNotFoundException{
         PrintWriter zapis = new PrintWriter("testy444.txt");
         //jedna linia
         zapis.println("jeden 1 , dwa 2 , trzy 3");
         zapis.write("cztery 4");
         zapis.close();
     }
 }

