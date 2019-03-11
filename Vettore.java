import java.util.Scanner;

public class Vettore {
    public static void main(String[] args) {
    	
    	Scanner input=new Scanner(System.in);
    	//creo un arry per memorizzare 10 numeri
    	int numeri[]= new int[10];
    	System.out.println("Inserisci 10 numeri");
    	for(int i=0; i<10;i++) {
    		numeri[i]= input.nextInt();
    	}
    	System.out.println("Il risultato e':");
    	for(int n : numeri)
    		System.out.println(n);
    	
    }
}
