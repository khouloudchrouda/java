package javaTest;
import java.util.Scanner;
public class MagicNumber {
public static void main(String[] args) {
		
		//displayMagichNumber(4,15);
		
		System.out.println("--------Entrer les valeurs-------- ");  
        @SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);  
        System.out.print("Enter min: ");    
        int min = in.nextInt();   
        System.out.println("Min: " + min);           
        System.out.print("Enter max: ");  
        int max = in.nextInt();  
        System.out.println("Max: " + max);  
        if (min>max) {
			System.out.println("min doit etre inferieur a max");
			return;
		}
        System.out.println("--------Resultat-------- ");
		displayMagichNumber(min,max);

	}
	public static void displayMagichNumber(int min,int max) {
		
		int i=min;
		while(i<max) {
		
			if (i % 3 ==0){
		        System.out.print("H,");
		    }
			 if (i % 5 ==0){
		        System.out.print("S,");
		    }
			 else if (!(i % 3 ==0) && !(i % 5 ==0 ))  {
				 System.out.print(i+",");
			 }
				i++;

		}
		}

		
	}



