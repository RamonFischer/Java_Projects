package People;

public class LegalEntity extends GenericPeople {
	private Integer employee;

	
	public Integer getEmployee() {
		return employee;
	}

	public void setEmployee(Integer employee) {
		this.employee = employee;
	}

	public LegalEntity(String name, Double annualBalance,int employee) {
		super(name, annualBalance);
		this.employee=employee;
	}

	@Override
	public final double finalIncome() {
		if (employee > 10) {
			return getAnnualBalance() * 0.14;
		}
		else {
			return getAnnualBalance() * 0.16;
		}
	}
		
}
