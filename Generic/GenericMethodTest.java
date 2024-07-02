//Driver Program for generic method
package generics;

public class GenericMethodTest {
	
	public static void main(String[] args) 
	{
		GenericMethod obj = new GenericMethod();
		Integer[] intarray = { 10, 20, 30, 40 };
		String[] str = { "java", "programming", "learning" };
		Person p[]=new Person[] {new Person("Kaushal", "Pune"), new Person("Naveen", "Mumbai"),new Person("Mahir", "Delhi")};
		
		//Display Integer Array 
		obj.displayArrayElements(intarray);
		
		//Display String Array
		obj.displayArrayElements(str);
		
		//Display Person Array
		obj.displayArrayElements(p);
	}

}