package entities;

import java.util.Date;

public class HourContract {

	private Date Date;
	private Double valuePerHour;
	private int hours;
	
	public HourContract() {	
	}

	public HourContract(java.util.Date date, Double valuePerHour, int hours) {
		Date = date;
		this.valuePerHour = valuePerHour;
		this.hours = hours;
	}

	public Date getDate() {
		return Date;
	}

	public void setDate(Date date) {
		Date = date;
	}

	public Double getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}
	 
	public double totalValue() {
		return valuePerHour * hours;
		
	}
	 
	
	
}
