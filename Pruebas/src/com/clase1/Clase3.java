package com.clase1;

import java.util.Scanner;

public class Clase3 {

	public static void main(String[] args) {
		
		
		Scanner reader = new Scanner(System.in);
		  int x = reader.nextInt();
		  int y = reader.nextInt();
		
		do {
			if(x>y) {
				   y++;
			  } else {
				  x++;
			  } 
		}while(x!=y);

	}

}
