package People;

public class NaturalPerson extends GenericPeople {
	private double healthCare;
	private double taxHealthCare = 0.50;
	
	public double getTaxHealthCare() {
		return taxHealthCare;
	}

	public void setTaxHealthCare(double taxHealthCare) {
		this.taxHealthCare = taxHealthCare;
	}

	public double getHealthCare() {
		return healthCare;
	}

	public void setHealthCare(double healthCare) {
		this.healthCare = healthCare;
	}
	
	public NaturalPerson() {
		
	}

	public NaturalPerson(String name, Double annualBalance,Double healthCare) {
		super(name, annualBalance);
		this.healthCare=healthCare;
	}

	@Override
	public final double finalIncome() {
		if (getAnnualBalance() < 20000.0) {
			return getAnnualBalance() * 0.15 - healthCare * 0.5;
		}
		else {
			return getAnnualBalance() * 0.25 - healthCare * 0.5;
		}
	}
}
