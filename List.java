

import java.util.*;


public class ListExample {
	
	public static List countryNames()
		{
			
			List cl=new ArrayList();
			cl.add("India");
			cl.add("England");
			cl.add("South Africa");
			cl.add("America");
			cl.add("Sri Lanka");
			return cl;
		}
		
	public static List NumberList()
	{
		List n=new ArrayList();
		for(int i=1;i<=10;i++)
			n.add(i);
		return n;
	}
	public static List NewNumberList()
	{
		List n=NumberList();
		List n1=new ArrayList();
		n1.add(n);
		for(int i=11;i<=15;i++)
			n1.add(i);
		return n1;
	}
	public static void main(String[] args) {
		System.out.println(countryNames());
		System.out.println(NumberList());
		System.out.println(NewNumberList());
		
	}

}