package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class Numberofones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> lis = new ArrayList<String>();
		lis.add("1");
		lis.add("2");
		lis.add("3");
		lis.add("1");
		lis.add("4");
		lis.add("5");
		lis.add("1");
		lis.add("6");
		int size = lis.size();
		int count = 0;
		for (int i =0;i<size;i++)
		{
			String val = lis.get(i);
			if (val.equals("1"))
			{
				count = count+1;	
			}
		}
		
		System.out.println("Count of 1's in List is :"+count);
		

	}

}
