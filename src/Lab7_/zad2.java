package Lab7_;

public class zad2 {
	
	import java.io.File;
	import java.util.Scanner;

	public class Odczyt {
	    public static void main(String[] args) {
	        // Tworzenie obiektu File wskazującego na plik do odczytu
	        File plik = new File("ala.txt");
	        // Tworzenie obiektu Scanner do odczytu danych z pliku
	        Scanner scanner = new Scanner(plik);

	        // Odczytanie jednej linii z pliku
	        String zdanie = scanner.nextLine();
	        // Wypisanie odczytanej linii na konsoli
	        System.out.println(zdanie);

	        // Zamknięcie skanera po zakończeniu odczytu
	        scanner.close();
	    }
	}

}
