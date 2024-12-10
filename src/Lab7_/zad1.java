package Lab7_;
import java.util.ArrayList;
import java.util.Scanner;

	
public class zad1 {
    public static void main(String[] args) {
        Scanner odczyt = new Scanner(System.in);
        ArrayList<Integer> numberList = new ArrayList<Integer>();
        Kalkulator Kalkulator;
        char operation;
        int i =0;
        int temp;
        System.out.println("Podaj działanie: ");
//      Pobieranie typu działania.
        operation = odczyt.next().charAt(0);
        temp = 1;
//      Pobieranie Liczb do działania.
        do {
            System.out.println(" Podaj liczbe nr.  "+(i + 1 )+"Lub wpisz '0' aby zakonczyć wpisywanie");
            temp = odczyt.nextInt();
            if(temp ==0 ) 
                break;
            numberList.add(temp);
            i++;
        }while(i < 7);
//      Nowy obiekt Kalkulatora w zależności od ilości liczb.
        switch(i) {
        case 1:
            Kalkulator = new Kalkulator(numberList.get(0));
            break;
        case 4:
            Kalkulator = new Kalkulator(numberList.get(0));
            Kalkulator = new Kalkulator(numberList.get(1));
            Kalkulator = new Kalkulator(numberList.get(2));
            Kalkulator = new Kalkulator(numberList.get(3));
            break;
        case 7:
            Kalkulator = new Kalkulator(numberList.get(0));
            Kalkulator = new Kalkulator(numberList.get(1));
            Kalkulator = new Kalkulator(numberList.get(2));
            Kalkulator = new Kalkulator(numberList.get(3));
            Kalkulator = new Kalkulator(numberList.get(4));
            Kalkulator = new Kalkulator(numberList.get(5));
            Kalkulator = new Kalkulator(numberList.get(6));
            break;
        default:
            System.out.println(" Niepoprawna liczba parametrów ");
            odczyt.close();
            return;
        }
        Kalkulator.zliczanie(operation);
        odczyt.close();
    }
         
    }
