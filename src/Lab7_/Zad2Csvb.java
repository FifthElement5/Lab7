package Lab7_;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Zad2Csvb {
    public static void main(String[] args) throws FileNotFoundException {
        // Tworzymy obiekt PrintWriter do zapisu do pliku CSV
        PrintWriter zapis = new PrintWriter("testy888.csv");

        // Zapisujemy nagłówki kolumn
        zapis.println("Kolumna1,Kolumna2,Kolumna3");

        // Zapisujemy dane, oddzielając je przecinkami
        zapis.println("jeden,3,zapisujemy do pliku");
        zapis.println("dwa,2,kolejny wiersz");

        // Zamykamy plik
        zapis.close();
    }
}
