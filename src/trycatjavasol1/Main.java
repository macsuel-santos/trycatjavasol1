package trycatjavasol1;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import Entities.Reserva;
import model.exceptions.DomainExceptions;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		try {
			int n = sc.nextInt();
		
			LocalDate ci = LocalDate.parse(sc.next(), fmt);
			LocalDate co = LocalDate.parse(sc.next(), fmt);
			
			Reserva r = new Reserva(n, ci, co);
			System.out.println(r);
			
			
			ci = LocalDate.parse(sc.next(), fmt);
			co = LocalDate.parse(sc.next(), fmt);
			
			r.atualiza(ci, co);
			
			System.out.println(r);
		
			
		}
		
		catch(DomainExceptions e) {
			System.out.println(e.getMessage());
		}
		
		catch(RuntimeException e) {
			System.out.println("Erro inesperado");
		}
		
		System.out.println("fim do programa");
		
		sc.close();
		
	}

}
