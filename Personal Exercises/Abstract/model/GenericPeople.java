package People;

public abstract class GenericPeople {
	protected String name;
	protected Double annualBalance;
	protected Double tax;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getAnnualBalance() {
		return annualBalance;
	}
	
	public void setAnnualBalance(Double annualBalance) {
		this.annualBalance = annualBalance;
	}
	
	public Double getTax() {
		return annualBalance;
	}
	
	public void setTax(Double tax) {
		this.tax = tax;
	}
	
	public GenericPeople() {
	}
	
	public GenericPeople(String name, Double annualBalance) {
		this.name = name;
		this.annualBalance = annualBalance;
	}
	public abstract double finalIncome();
}
