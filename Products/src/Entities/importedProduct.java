package Entities;

public class importedProduct extends Product{
	
	private Double customsFee;
	
	public importedProduct() {
		super();
	}

	public importedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	public Double totalPrice() {
		return getPrice() + customsFee;
	}
	
	@Override
	public String priceTag() {
		return name + " $ " + totalPrice() + " (Customs Fee: " + "$ " + customsFee + ")"; 
	}
	

}