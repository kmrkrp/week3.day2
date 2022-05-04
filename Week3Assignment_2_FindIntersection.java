package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class Week3Assignment_2_FindIntersection {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> lis1 = new ArrayList<Integer>();
		List<Integer> lis2 = new ArrayList<Integer>();
		lis1.add(3);
		lis1.add(2);
		lis1.add(11);
		lis1.add(4);
		lis1.add(6);
		lis1.add(7);
		
		lis2.add(1);
		lis2.add(2);
		lis2.add(8);
		lis2.add(4);
		lis2.add(9);
		lis2.add(7);	
		int len1 = lis1.size();
		int len2 = lis2.size();
		
		for(int i=0;i<len1;i++)
		{
			int cmpval1 = lis1.get(i);
			for(int j=0;j<len2;j++)				
			{
				int cmpval2 = lis2.get(j);
				if (cmpval1 == cmpval2)
				{
					System.out.println("Value Available in both arraylist: "+cmpval1);
				}
			}
		}
	}
}
