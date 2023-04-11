package week3.Day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargestList {

	public static void main(String[] args) {
		List<Integer> Set1=new ArrayList<Integer>();
			Set1.add(3);
			Set1.add(2);
			Set1.add(11);
			Set1.add(4);
			Set1.add(6);
			Set1.add(7);
			System.out.println("The Given List is : "+Set1);
			
			 
			Collections.sort(Set1);
			System.out.println("The Sorted List is: "+Set1);
			int SiZe=Set1.size();
			int secndelement=Set1.get(SiZe-2);	
			System.out.println("The Second LArgest NUmber in a List is : "+secndelement);
				
			
			
			}	

	}


