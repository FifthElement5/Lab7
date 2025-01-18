package Lab7_;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zad2Csv {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("testy888.csv");
        Scanner in = new Scanner(file);

        // Odczyt nagłówków 
        if (in.hasNextLine()) {
            String naglowek = in.nextLine();
            System.out.println(naglowek);
        }

        // Odczyt danych
        while (in.hasNextLine()) {
            String line = in.nextLine(); // Pobiera wiersz
            String[] dane = line.split(","); // rozdziela dane za pomocą przecinka

            // Wyświetlanie wartości 
            for (String wypis : dane) {
                System.out.print(wypis + " ");
            }
            System.out.println();
        }

        in.close();
    }
}
