package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> lis = new ArrayList<String>();
		lis.add("A");
		lis.add("B");
		lis.add("C");
		lis.add("D");
		lis.add("E");
		lis.add("A");
		lis.add("G");
		lis.add("F");
		lis.add("C");
		int size = lis.size();
		for (int i = 0;i<size;i++)
		{
			String lisVal = lis.get(i);
			int k= i+1;
			for (int j = k;j<size;j++)
					{
					String Val = lis.get(j);
					if (lisVal.equalsIgnoreCase(Val))
					{
						System.out.println("Duplicate Value in List is :"+Val);
						break;
					}
					}
				}
		}
	}


