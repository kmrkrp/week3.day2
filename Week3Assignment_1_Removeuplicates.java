package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class Week3Assignment_1_Removeuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String message =  "We learn java basics as part of java sessions in java week1";
		//String message =  "My Name is MY NAME IS My name Manoj";
		 List<String> arryList = new ArrayList<String>();
		 List<String> arryListNew = new ArrayList<String>();
		 String lis[] = message.split(" ", 0);
		 String  newMessage = "";	
		 int k = 0;
		 for (String s: lis)
		 {	            
	            arryList.add(s);	
	            arryListNew.add(s);
		 }
		 int len = arryList.size();
		 for (int i=0;i<len;i++)
		 {
			 String cmpVal = arryList.get(i) ;
			 k = i+1;
			 for (int j = k;j<len;j++)
			 {
				 String secondVal = arryList.get(j) ; 
				 if(cmpVal.equalsIgnoreCase(secondVal))
				 {
					 arryListNew.set(j, "");
				 }
			 }
		 }
		 int newLen = arryListNew.size();
		 for (int l=0;l<newLen;l++)
		 {	            
                String msg = arryListNew.get(l);	           
	            newMessage = newMessage +" " + msg;	            
		 }
		 System.out.println("After Duplicate Text Removal: "+newMessage);
	}

}
