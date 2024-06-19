package empData;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferReaderExample {

	public static void main(String args[])
	{
		try {
			String name;
			int salary;
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Enter Name:");
			
			name=br.readLine();
			
			System.out.println("Enter Salary:");
			
			salary=Integer.parseInt(br.readLine());
			
			System.out.println("Name is:"+name+"Salary is:"+salary);
		}
		catch(Exception e)
		{
			System.out.println("Error");
		}
	}
}
