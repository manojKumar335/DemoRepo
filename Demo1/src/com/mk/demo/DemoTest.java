package com.mk.demo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DemoTest {

	public static void main(String[] args) {
	
		reverse("abc");
		System.out.println(anagram("how are you","you wohare"));
         m();
         sum(2576);
         armstrong(54740);
         secondLargest(new int[] {76,2,35,5,54,9,11,34});
         String s="abcde";
         System.out.println(s.substring(0,2));
         Demo d=(x,y)-> x+y;
         m1(4,d);
         
	}
	 public static void reverse(String s) {
		 System.out.println(s);
	       char[] ch=s.toCharArray();
	       char[] ch1=new char[ch.length];
	       int j=s.length()-1;
	       for(int i=0;i<s.length();i++) {
	    	    ch1[i]=ch[j];
	    	     j--;
	       }
	        
	       System.out.println(new String(ch1));
	    }
   
	 public static boolean anagram(String s1,String s2) {
		s1=s1.replaceAll("\\s","");
		s2=s2.replaceAll("\\s","");
		
		if(s1.length()!=s2.length())
			return false;
		char[] ch1=s1.toLowerCase().toCharArray();
		char[] ch2=s2.toLowerCase().toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
			return Arrays.equals(ch1,ch2);
		
	 }
	 
	 public static void sum(int i) {
		 int sum=0;
		 while(i!=0) {
		 int p=i%10;
		 sum+=p;
		 i=(i-i%10)/10;
		 }
		 System.out.println("sum ::"+sum);
	 }
	 
	 public static void m() 
	    { 
	        Map<String,String> gfg = new HashMap<String,String>(); 
	     
	        // enter name/url pair 
	        gfg.put("GFG", "geeksforgeeks.org"); 
	        gfg.put("Practice", "practice.geeksforgeeks.org"); 
	        gfg.put("Code", "code.geeksforgeeks.org"); 
	        gfg.put("Quiz", "quiz.geeksforgeeks.org"); 
	          
	        // using for-each loop for iteration over Map.entrySet() 
	       /* for (Map.Entry<String,String> entry : gfg.entrySet())  
	            System.out.println("Key = " + entry.getKey() + 
	                             ", Value = " + entry.getValue()); */
	        
	      
	                             
	    } 
	 
	public static void armstrong(int i) {
	   String s=""+i;
	   char[] ch=s.toCharArray();
	   int n=ch.length;
	   int sum=0;
	   
	   for(char c:ch ) {
		   int p=Character.getNumericValue(c);
		   sum=sum+(int)Math.pow(p,n);
		   
	   }
	  boolean b= sum==i?true:false;
		System.out.println(b);	   
	}
	
	public static void secondLargest(int[] n) {
		//{2,35,5,9,11,34}
		int f=0;
		int s=0;
		for(int i:n) {
			if(i>f) {
				s=f;
				f=i;
			
				}
			if(f>i&&i>s) {
			    s=i;
					}
		}
		System.out.println("second largest ::"+s);
	}
 
	public static void m1(int x,Demo d) {
		System.out.println(x+d.m1(3, 4));
	}
}
