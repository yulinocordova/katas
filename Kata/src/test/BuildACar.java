package test;

public class BuildACar {

	public static void main(String[] args) {
		
		
		resolver(7,1);
		
		
		
	}
	
	public static void resolver (int longitud, int numVentana) {
		
		String primero = "_";
		
		String palote = "|";
		String slash = "\\";
		String corchete = "[]";
		
		String rueda= "o";
		String guion ="-";
		String spacio =" ";
		
		String linea1="_" ,linea2="" , linea3="";
		int num1 = longitud-2;
		int num = longitud-1;
		boolean ventana = true;
		int vent = longitud -3;
		int contador =0;
		
		String doblespacio =" ";
		
		for (int i = 2; i < longitud; i++) {
				linea1 += primero;
		}
		System.out.println(linea1);
		
		
		for (int i = 1; i <= longitud -1; i++) {
			System.out.println(i);
			if(i == 1  ) {
				linea2 += palote;
				contador++;
			}else if(i == num) {
				linea2 += slash;
				contador++;
			}else {
				//linea2 += spacio;
				int espa_dispo = (longitud-3) ;
				if(contador < numVentana*2 ) {
					
					linea2 += corchete;
					contador+=2;
					System.out.println("crea :"+contador);
				}else {
					//linea2 += doblespacio;
					contador ++;
					System.out.println("con :"+contador);
				}
			}
		}
			System.out.println("yu :"+ linea2);
		/*
		for (int i = 2; i < longitud; i++) {
			
			if(i == 0  ) {linea2 += palote;}else if(i == num) {linea2 += slash;
			}else {
				if(contador <= numVentana ) {
						
						linea2 += corchete;
						contador+=2;
				}else {
					linea2 += doblespacio;
				}
				
				
			}
		}*/
		//System.out.println(linea2);
		
		for (int i = 0; i < longitud; i++) {
			
			//primera linea
			if(i == 0 || i == num1) {
				linea1 += "-"+spacio;
			}else {
				linea1 += primero;
			}
			
			//segunda linea
			if(i == 0  ) {
				linea2 += palote;
			}else if(i == num) {
				linea2 += slash;
			}else {
				//linea2 += spacio;
				if(contador <= numVentana*2 ) {
					
					linea2 += corchete;
					contador+=2;
				}else {
					//linea2 += doblespacio;
				}
			}
			
			//tercero linea
			if(i == 0 || i != num) {
				linea3 += guion;
			}else {
				linea3 += guion;
			}
			
			
		}
		
		
		
		
		
		
		System.out.println(linea1);
		System.out.println(linea2);
		System.out.println(linea3);
		
	}
	
	
}
