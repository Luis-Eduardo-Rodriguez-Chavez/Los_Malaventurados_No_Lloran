package ejerciciosDeLogicaDeProgramacion;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class ejercicioNueve {

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

		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Ingresa la palabra que quieres traducir: ");
			translate = sc.nextLine();
			
			if(diccionario.containsKey(translate)) {
				System.out.println("La traduccion es: " + diccionario.get(translate) + "\n");
				
			} else {
				System.out.println("La palabra no se encuentra en el diccionario \n");
				
			}
			
		} while(!translate.equals("exit")); 


	}
}
