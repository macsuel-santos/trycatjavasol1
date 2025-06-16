package Entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import model.exceptions.DomainExceptions;

public class Reserva {
	private Integer quarto;
	private LocalDate checkin;
	private LocalDate checkout;
	private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	public Reserva(Integer quarto, LocalDate checkin, LocalDate checkout) throws DomainExceptions {
		if(!checkout.isAfter(checkin)) {
			throw new DomainExceptions("erro co antes do ci");
		}
		this.quarto = quarto;
		this.checkin = checkin;
		this.checkout = checkout;
	}
	
	public Reserva() {};

	public Integer getQuarto() {
		return quarto;
	}

	public LocalDate getCheckin() {
		return checkin;
	}

	public LocalDate getCheckout() {
		return checkout;
	}
	
	public Integer duracao() {
		Integer d = (int) ChronoUnit.DAYS.between(checkin, checkout);
		return d;
	}
	
	public void atualiza(LocalDate checkin, LocalDate checkout) throws DomainExceptions{
		
		LocalDate i = LocalDate.now();
		
		if (checkin.isBefore(i) || checkout.isBefore(i)) {
			throw new DomainExceptions("Data anterior a de hoje");
		}
		
		this.checkin = checkin;
		this.checkout = checkout;
		
		
	}
	
	@Override
	public String toString() {
		return "Numero do Quarto: " + quarto + "\n" + "Checkin: "+ checkin.format(fmt) + "\n" + "Checkout: " + checkout.format(fmt) + "\n" 
				+ "Duracao: " + duracao() + " dias";
	}
}
