package ejerciciosDeLogicaDeProgramacion;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class ejercioDiez {

	public static void main(String[] args) {
		HashMap<String, String> diccionario = new HashMap<>();
		diccionario.put("Bicicleta", "Bicycle");
		diccionario.put("Automovil", "Car");
		diccionario.put("Camion", "Truck");
		diccionario.put("Telefono", "Telephone");
		diccionario.put("Tren", "Train");
		diccionario.put("Cohete", "Shuttle");
		diccionario.put("Nave", "Ship");
		diccionario.put("Androide", "Android");
		diccionario.put("Computadora", "Computer");
		diccionario.put("Lavadora", "Wash Machine");
		diccionario.put("Refrigerador", "Refrigerator");
		diccionario.put("Electricidad", "Electricity");
		diccionario.put("Tiempo", "Time");
		diccionario.put("Metralleta", "Machine Gun");
		diccionario.put("Bota", "Boot");
		diccionario.put("Metal", "Metal");
		diccionario.put("Melon", "Melon");
		diccionario.put("Expedicion", "Expedition");
		diccionario.put("Enfoque", "Focus");
		diccionario.put("Acercamiento", "Zoom");
		
		int x;
		int counter = 0;
		String translate;
		String getIn;
		Scanner sc = new Scanner(System.in);
		
		for(x=0; x<5; x++) {
			Random generator = new Random();
			Object[] values = diccionario.keySet().toArray();
			Object randomValue = values[generator.nextInt(values.length)];
			
			System.out.println("Traduce " + randomValue + ": ");
			getIn = sc.nextLine();
			
			translate = diccionario.get(randomValue);
			

				if(getIn.equals(translate) ) {
					System.out.println("La traduccion es correcta \n");
					counter++;
				
				} else {
					System.out.println("La traduccion es incorrecta \n");
				}
		
		}
		
		System.out.println("Obtuviste " + counter + " respuestas correctas \n");
		System.out.println("Y " + (x-counter) + " respuestas incorrectas \n");
	}	
}

