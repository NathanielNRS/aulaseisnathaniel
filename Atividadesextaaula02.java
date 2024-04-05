package testesAula;

import java.time.LocalDate;
import java.time.Period;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;

public class Atividadesextaaula02 {

	public static void main(String[] args) {
		Calendar data = Calendar.getInstance();
		int dia3 = data.get(Calendar.DAY_OF_MONTH);
		int mes3 = data.get(Calendar.MONTH);
		mes3++;
		int ano3 = data.get(Calendar.YEAR);
		
		System.out.println(dia3 +"/"+ mes3 +"/"+ ano3);
		
		LocalDate primeiraData = LocalDate.of(ano3, mes3, dia3);
		LocalDate segundaData = LocalDate.of(2025, 8, 24);
		
		Period periodo = Period.between(primeiraData, segundaData);
		
		int dia1 = periodo.getDays();
		int mes1 = periodo.getMonths();
		int ano1 = periodo.getYears();
		
		System.out.println("A diferença é de " + ano1 + " ano(s), " 
				+ mes1 + " mes(es) e "		
				+ dia1 + " dia(s). ");
	}
	public static void contaTempo(int dia, int mes, int ano) {
		
	}

}
