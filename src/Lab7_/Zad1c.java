package Lab7_;

import java.util.ArrayList;
import java.util.Scanner;

public class Zad1c {
    public static void main(String[] args) {
    	
    	
        // Tworzenie obiektu z jednym argumentem
        Kalkulator kalk1 = new Kalkulator(10);
        kalk1.zliczanie('+'); // Wykonanie operacji dodawania
        System.out.println("Wynik: " + kalk1.getWynik());
        
        // Tworzenie obiektu z czterema argumentami
        Kalkulator kalk2 = new Kalkulator(1, 2, 3, 4);
        kalk2.zliczanie('*'); // Wykonanie operacji mnożenia
        System.out.println("Wynik: " + kalk2.getWynik());
        
        // Tworzenie obiektu z siedmioma argumentami
        Kalkulator kalk3 = new Kalkulator(10, 0, 2, 5, 1, 2, 3);
        kalk3.zliczanie('/'); // Wykonanie operacji dzielenia
        System.out.println("Wynik: " + kalk3.getWynik());
        
        int pierwszyElement2 = kalk2.getListaLiczb().get(0);
        System.out.println("Pierwszy element w kalk2: " + pierwszyElement2);
    }
}
