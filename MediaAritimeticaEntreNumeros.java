/*
 * MediaAritimeticaEntreNumeros.java
 * 
 * 
 * 
 */


public class MediaAritimeticaEntreNumeros {
	
	public static void main (String[] args) {
		//Matheus de sousa do nascimento
		
		double media = 0, soma=0;
		
		for(int n =15; n<=100; n++){
			soma+=n;
		}
		media = soma/100;
		
		System.out.print("A media dos numeros entre 15 e 100 e "+ media);
	}
}

