package leetCode;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListTest {
	public static void main(String args[])
	{
		List<String> a = new LinkedList<>();
		a.add("a1");
		a.add("a2");
		a.add("a3");
		
		List<String> b = new LinkedList<>();
		b.add("b1");
		b.add("b2");
		b.add("b3");
		b.add("b4");
		
		ListIterator<String> aIter = a.listIterator();
		Iterator<String> bIter = b.iterator();
		
		while(aIter.hasNext())
		{
			aIter.next();
		}
		while(bIter.hasNext())
		{
			aIter.add(bIter.next());
		}
		
		System.out.println("The sum linkedList is "+a);
		
		Iterator<String> bIter1 = b.iterator();
		while(bIter1.hasNext())
		{
			if(bIter1.hasNext())
			{
				bIter1.next();
				bIter1.remove();
			}
			bIter1.next();

		}
		System.out.println("The b linkedList is "+b);
		
		a.removeAll(b);
		System.out.println(a);
		
	}

}
