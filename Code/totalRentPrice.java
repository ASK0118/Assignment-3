package Assignment3;

import javax.swing.JTable;

public class totalRentPrice implements Payment {  
	
	public double discount() {
		JTable t = Advertisement.getTable();
		String discount="";
		double dis;
		
			if (t==null) {
				return 0.1;
			}
		
			else {
				for(int i = 0; i<t.getRowCount(); i++) { 
				discount= String.valueOf(t.getValueAt(i, 0));}
				dis = Double.parseDouble(discount)/100;
				return dis;}
	
	}
	public double Rentprice(String selection, String choose, int day) {  //method to calculate rental price per day
		JTable t = AdminVehicleInfo.getTable();
		String p="";
		double price=0;
			
		for(int i = 0; i<t.getRowCount(); i++) { 
			if (selection.equals(t.getValueAt(i, 0))&&choose.equals(t.getValueAt(i, 1))) {
			p= String.valueOf(t.getValueAt(i, 3));
			price = Double.parseDouble(p);}
			}
		
			if(day<=7) 
				return price;
		
				else
					return price= price - price* discount();}//end of method Rentprice
	
	public double getPayment(String selection,String choose, int day) {  //method with 3 arguments implement form class interface to calculate total payment
		return day*Rentprice(selection,choose,day);
	}
	
	public double getPayment(String selection, String choose, int day, double discount) {  //method with 4 arguments implement form class interface to calculate total payment
		return day*Rentprice(selection,choose,day);
	}
	
}  //end totalRentPrice class