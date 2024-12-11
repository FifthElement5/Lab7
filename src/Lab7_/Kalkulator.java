package Lab7_;
import java.util.ArrayList;
import java.util.Scanner;


public class Kalkulator {
//  Deklaracja prywatnej  Listy.
    ArrayList<Integer> listaLiczb = new ArrayList<Integer>();
 
    double wynik = 0;
    
    public Kalkulator() {
    	
    }
    //deklaracja konstruktora jedno , 4 i 7 argumętowego.
    public Kalkulator(int l1) {
        listaLiczb.add(l1);
    }
    public Kalkulator(int l1, int l2, int l3, int l4) {
        listaLiczb.add(l1);
        listaLiczb.add(l2);
        listaLiczb.add(l3);
        listaLiczb.add(l4);
    }
    public Kalkulator(int l1, int l2, int l3, int l4, int l5, int l6, int l7) {
        listaLiczb.add(l1);
        listaLiczb.add(l2);
        listaLiczb.add(l3);
        listaLiczb.add(l4);
        listaLiczb.add(l5);
        listaLiczb.add(l6);
        listaLiczb.add(l7);
    }
//  konstruktor kopiujacy
    public Kalkulator (Kalkulator kalkulator) {
        for(Integer i : kalkulator.listaLiczb) {
            this.listaLiczb.add(i);
        }
    }
    //Metody liczące 
    public void zliczanie(char operator) {
        switch(operator) {
        case '+':
            for(int i = 0; i < listaLiczb.size(); i++) {
             wynik += listaLiczb.get(i);
            }
            break;
        case '-':
        	wynik = listaLiczb.get(0);
            for(int i = 1; i < listaLiczb.size(); i++) {
            	wynik -= listaLiczb.get(i); 
            }
            break;
        case '*':
        	wynik = listaLiczb.get(0);
            for(int i = 1; i < listaLiczb.size(); i++) {
            	wynik *= listaLiczb.get(i);
            }
            break;
        case'/':
            wynik = listaLiczb.get(0);
            
            for(int i =1; i < listaLiczb.size(); i++) {
                if(listaLiczb.get(i) != 0)  {
                    wynik /= listaLiczb.get(i);
                } else { 
                   System.out.println("Pamietaj selero nie dziel przez zero");
                   
                   break;
                }
            }
            break;
        }
       
    }
//  Metoda zwracająca wynik.
  
	public ArrayList<Integer> getListaLiczb() {
		return listaLiczb;
	}
	public void setListaLiczb(ArrayList<Integer> listaLiczb) {
		this.listaLiczb = listaLiczb;
	}
	public int getError() {
		return error;
	}
	public void setError(int error) {
		this.error = error;
	}
	public double getWynik() {
		return wynik;
	}
	public void setWynik(double wynik) {
		
		this.wynik = wynik;}
		
    
}
