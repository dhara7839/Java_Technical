package collection;

public class ListDemo {

	public static void main(String[] args) {

//Traverse a list
	
		Iterator<String> i = names.iterator();
		while(i.hasNext()) {
			String nm = i.next();
			System.out.println(nm);
			
			if(nm.equals("Vivek"))
				i.remove();
			
		}
		
		
		System.out.println("Name List is: "+names);
		
		//Traverse in reverse / Backward order
		
		ListIterator<String> li = names.listIterator(names.size());
		
		while(li.hasPrevious())
		{
			String nm=li.previous();
			System.out.println(nm);
		}
	}

}