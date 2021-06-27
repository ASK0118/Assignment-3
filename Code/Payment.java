package Assignment3;

public interface Payment {
	double discount();
	double Rentprice(String selection,String choose, int day);
	double getPayment(String selection,String choose,int day);
	double getPayment(String selection,String choose, int day, double discount);
	
}
