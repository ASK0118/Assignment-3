package Assignment3;

public class totalSalary implements Payment {  
	
	public double discount() {  
		return 0.07;
	}
	
	public double Rentprice(String selection, String choose, int day) {  //method to calculate salary per day
		double price=0;
		
				if(selection.equals("Clerk")) {    //start selection 1
						if(choose.equals("Part Time")) {	//start choose 1
								return price=10;	
						}  //end choose 1
						
						else  
							 return price=2000;
	

					} //end selection 1
						
				 if(selection.equals("Supervisor")) {  //start selection 2
							if(choose.equals("Part Time")) {  //start choose 1
									return price=30;	
							}  //end choose 1
							
							else 
								return price=2500;	
	

						}  //end selection 2
						
				 if(selection.equals("Manager")) { //start selection 3
						if(choose.equals("Part Time")) {  //start choose 1
								return price=100;
						    }
						else 
								return price=3500;	
	
					}  //end selection 3
				
				return price;
		}  //end of method Rentprice
	
	public double getPayment(String selection,String choose, int day) {  //method with 3 arguments implement form class interface to calculate total salary
		return day*Rentprice(selection,choose,day);
	}
	
	public double getPayment(String selection,String choose, int day, double discount) {  //method with 4 arguments implement form class interface to calculate total salary
		day=1;
		return day*Rentprice(selection,choose,day)*(1-discount);
	}
	
}  //end totalSalary class
