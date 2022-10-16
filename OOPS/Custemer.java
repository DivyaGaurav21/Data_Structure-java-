package OOPS;

public class Custemer {

	//private data member
	private String cstmr_name;  
	private int cstmr_id;      
	private double amount;
	
	//public getter and setter method
	public void setName(String name){    
      this.cstmr_name = name;    
	}
	public String getName(){    
	return cstmr_name;    
	}    
//	||
	public void setId(int id) {
		this.cstmr_id=id;
	}
	public int getId() {
		return cstmr_id;
	}
//	||
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getAmount() {
		return amount;
	}
// method to find cstmr_detail
	public void bankDetail() {
		System.out.println(" name : "+cstmr_name+ "\n id: "+ cstmr_id+ "\n your amount : "+amount);
	}
	
}
