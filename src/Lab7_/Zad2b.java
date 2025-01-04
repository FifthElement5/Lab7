package Lab7_;

import java.io.FileNotFoundException;
 import java.io.PrintWriter;
 
 public class Zad2b{
     public static void main(String[] args) throws FileNotFoundException{
         PrintWriter zapis = new PrintWriter("testy444.txt");
         //jedna linia
         zapis.println("jeden 1 , dwa 2 :zapisujemu do pliku, 2222222222");
         zapis.write("lolo");
         zapis.close();
     }
 }

