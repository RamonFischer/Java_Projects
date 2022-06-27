package products;

public class ImportedProduct extends Product{
	private Double customsFee;
	
	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}

	public ImportedProduct(String name, Double price, double custom) {
		super(name, price);
		customsFee = custom;
	}
	
	public Double totalValue() {
		return price + customsFee;
	}
	
	@Override
	public final String priceTag() {
		return name + ": $"+ price + String.format(" + Customs fee("+ customsFee +")=$%.2f",totalValue());
	}
	

}
