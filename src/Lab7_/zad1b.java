package Lab7_;
import java.util.ArrayList;
import java.util.Scanner;

public class zad1b {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Kalkulator kalkulator;
		char operator;
		
		System.out.println("Podaj operator: ");
		operator = scanner.next().charAt(0);
		 
		System.out.println("Podaj liczby  1 4 lub 7, zakoncz q: ");
        while (true) {
            String input = scanner.nextLine(); // Pobierz cały wiersz jako tekst

            if (input.equals("q")) { // Sprawdź, czy użytkownik wpisał "q"
                break; // Zakończ pętlę
            }

            try {
                int liczba = Integer.parseInt(input); // Spróbuj przekonwertować na liczbę
                if (liczba == 1 || liczba == 4 || liczba == 7) {
                    System.out.println("Prawidłowa liczba: " + liczba);
                } else {
                    System.out.println("Nieprawidłowa liczba, spróbuj ponownie.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Nieprawidłowe wejście, spróbuj ponownie.");
            }
        }
		
	}
}
