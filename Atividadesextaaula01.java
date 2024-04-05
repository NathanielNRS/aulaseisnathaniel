package testesAula;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.GregorianCalendar;

public class Atividadesextaaula01 {

	public static void main(String[] args) {
		System.out.println("Defina a data atual se utilizando de diversos métodos.");
		datadefinida();
	}
	public static void datadefinida () {
		SimpleDateFormat data = new SimpleDateFormat ("dd/MMMM/yyyy");
		SimpleDateFormat dia = new SimpleDateFormat ("EEEE");
		SimpleDateFormat dia1 = new SimpleDateFormat ("dd");
		SimpleDateFormat mes = new SimpleDateFormat ("MMMM");
		SimpleDateFormat ano = new SimpleDateFormat ("yyyy");
		SimpleDateFormat hora = new SimpleDateFormat ("HH");
		SimpleDateFormat min = new SimpleDateFormat ("m");
		
		
		Date data1= new Date();
		System.out.println("Data formato Simples 1 = "+data.format(data1));
		System.out.println("Data formato Dia = "+dia.format(data1));
		
		System.out.println("Hoje é "+ dia.format(data1) + ", dia "+ dia1.format(data1) + " de "+ mes.format(data1) +" de "+ ano.format(data1) + ", e agora são "+ hora.format(data1) +" horas e "+ min.format(data1) +" minutos");
	}

}
