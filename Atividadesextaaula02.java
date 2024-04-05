package testesAula;

import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Scanner;
public class Atividadesextaaula02 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Defina o dia, mes e ano que você deseja: ");
		int diao = teclado.nextInt();
		int meso = teclado.nextInt();
		int anoo = teclado.nextInt();
		contaTempo(diao, meso, anoo);
		
	}
	public static void contaTempo(int dia, int mes, int ano) {
		Calendar data = Calendar.getInstance();
		int dia3 = data.get(Calendar.DAY_OF_MONTH);
		int mes3 = data.get(Calendar.MONTH);
		mes3++;
		int ano3 = data.get(Calendar.YEAR);
		
		System.out.println(dia3 +"/"+ mes3 +"/"+ ano3);
		
		LocalDate primeiraData = LocalDate.of(ano3, mes3, dia3);
		LocalDate segundaData = LocalDate.of(ano, mes, dia);
		
		Period periodo = Period.between(segundaData, primeiraData);
		
		int dia1 = -periodo.getDays();
		int mes1 = -periodo.getMonths();
		int ano1 = -periodo.getYears();
		
		System.out.println("A diferença é de " + ano1 + " ano(s), " 
				+ mes1 + " mes(es) e "		
				+ dia1 + " dia(s). ");
	}

}
