package Lab7_;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zad2Csv {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("testy888.csv");
        Scanner in = new Scanner(file);

        // Odczyt nagłówków (opcjonalne)
        if (in.hasNextLine()) {
            String naglowek = in.nextLine();
            System.out.println("Nagłówki: " + naglowek);
        }

        // Odczyt danych
        while (in.hasNextLine()) {
            String line = in.nextLine(); // Pobierz wiersz
            String[] dane = line.split(","); // Rozdziel dane za pomocą przecinka

            // Wyświetl wartości w konsoli
            for (String value : dane) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        in.close();
    }
}
