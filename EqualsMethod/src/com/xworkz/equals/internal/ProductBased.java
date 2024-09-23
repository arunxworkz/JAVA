package com.xworkz.equals.internal;

public class ProductBased extends Companies{

	public ProductBased(String name, int noOfEmployees, String ceo) {
		super(name, noOfEmployees, ceo);
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj == null) {
			return false;
		}
		
			/*Companies companies = (Companies) obj; 
			  ProductBased productBased = (ProductBased) obj;
			  before checking will leads ClassCastException*/
			if(obj instanceof Companies) {
				Companies companies = (Companies) obj;
				if(this.ceo.equals(companies.ceo)) {
					System.out.println("Print this is correct");
					return true;
				}
				else {
					System.out.println("NOT equal");
					return false;
				}
			}
			else if (obj instanceof ProductBased){
				ProductBased productBased = (ProductBased) obj;
				if(this.noOfEmployees == productBased.noOfEmployees) {
					System.out.println("Print this is correct");
					return true;
				}
				else {
					System.out.println("Not correnct");
					return false;
				}
			}
			else {
				return false;
			}
		}
}
