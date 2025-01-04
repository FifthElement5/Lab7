package Lab7_;

import java.util.ArrayList;
import java.util.Scanner;

public class Zad1c {
    public static void main(String[] args) {
    	
    	Kalkulator kalk0 = new Kalkulator();
    	System.out.println("test: " + kalk0.getListaLiczb().get(1));
        // Tworzenie obiektu z jednym argumentem
        Kalkulator kalk1 = new Kalkulator(10);
        kalk1.zliczanie('+'); 
        kalk1.wypisywanie();
        
        // Tworzenie obiektu z czterema argumentami
        Kalkulator kalk2 = new Kalkulator(1, 2, 3, 4);
        kalk2.zliczanie('*'); 
        kalk2.wypisywanie();
        
        // Tworzenie obiektu z siedmioma argumentami
        Kalkulator kalk3 = new Kalkulator(10, 1, 2, 5, 1, 2, 3);
        kalk3.zliczanie('/'); 
        kalk3.wypisywanie();
        
        int pierwszyElement2 = kalk2.getListaLiczb().get(0);
        System.out.println("Pierwszy element w kalk2: " + pierwszyElement2);
    }
}
