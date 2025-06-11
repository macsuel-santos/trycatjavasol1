package trycatjavasol1;

import java.time.Instant;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import Entities.Reserva;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		int n = sc.nextInt();
		Reserva r = new Reserva();
		
		LocalDate ci = LocalDate.parse(sc.next(), fmt);
		LocalDate co = LocalDate.parse(sc.next(), fmt);
		
		
		if(!co.isAfter(ci)) {
			System.out.println("erro co antes do ci");
		}
		else {
			r = new Reserva(n, ci, co);
			System.out.println(r);
		}
		
		
		ci = LocalDate.parse(sc.next(), fmt);
		co = LocalDate.parse(sc.next(), fmt);
		
		LocalDate i = LocalDate.now();
		
		if (ci.isBefore(i) || ci.isBefore(i)) {
			System.out.println("data anterior a de hoje");
		}
		else if(!co.isAfter(ci)) {
			System.out.println("erro co antes do ci");
		}
		else {
			r.atualiza(ci, co);
			System.out.println(r);
		}
		
		
		
		
		sc.close();
		
	}

}
