package com.clase1;

import java.util.Scanner;

public class Clase2 {

	public static void main(String[] args) {
		
		  Scanner reader = new Scanner(System.in);
		  int numero2 = reader.nextInt();
		  int numero1 = reader.nextInt();
		  
		  if(numero2>numero1) {
			   System.out.println(numero2+" es el mas grande");
		  } else if(numero1>numero2){
			  System.out.println(numero1+" es el mas grande");
		  } else {
			  System.out.println("Son iguales");
		  }
		 
	}

}
