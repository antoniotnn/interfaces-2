package models.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {

	private Integer number;
	private Date date;
	private Double totalValue;
	
	private List<Installment> installments = new ArrayList<>();
	
	
	public Contract() {
		
	}


	public Contract(Integer number, Date date, Double totalValue, List<Installment> installments) {
		this.number = number;
		this.date = date;
		this.totalValue = totalValue;
		this.installments = installments;
	}

	public Integer getNumber() {
		return number;
	}

	public Date getDate() {
		return date;
	}

	public Double getTotalValue() {
		return totalValue;
	}


	
	
}
