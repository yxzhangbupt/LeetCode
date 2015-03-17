package leetCode;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class HashCodeTest {
	public static void main(String args[])
	{
		Set<String> word = new HashSet<>();
		long totalTime = 0;
		
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			long callTime = System.currentTimeMillis();
			word.add(in.next());
			callTime = System.currentTimeMillis();
			totalTime += callTime;
		}
		
		Iterator<String> iter = word.iterator();
		for(int i=0;i<=20&&iter.hasNext();i++)
		{
			System.out.println(iter.next());
			System.out.println("....");
			System.out.println(word.size()+"distinct words. "+totalTime+"millisecends");
		}
		
	}
}
