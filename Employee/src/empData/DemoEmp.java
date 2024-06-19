package empData;

public class DemoEmp {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		  EmpInfo epr = new EmpInfo();
		  

epr.setEname("Dipu");
epr.setEmailId("abc@gmail.com");
epr.setResaddr("Gokul");
epr.setMobileno(123456);


System.out.println(epr);  //  epr.toString() 


//System.out.println(epr.getEname() + " " + epr.getEmailId() + " " + epr.getMobileno());
	
	
EmpInfo epr1 = new EmpInfo();
	epr1.setEname("Apple");
	epr1.setResaddr("On the tree");
	
	
	System.out.println(epr1);  //epr1.toString()
	
	
	}

}
