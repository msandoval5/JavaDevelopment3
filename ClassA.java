package ex3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.*;

import ex3.ClassB.superCoolInterface;
//import ex3.ClassB;


public class ClassA {
	
	

	public void compareLenght(String a, String b)
    {
        if (a.length() == b.length())
        {
            System.out.printf("a and b have the same lenght", a, b);
            System.out.printf("%n");
        }
        else if (a.length() > b.length())
        {
        	System.out.printf("a is longer than b", a, b);
        	System.out.printf("%n");
        }
        else
        {
        	System.out.printf("b is longer than a", b, a);
        	System.out.printf("%n");
        }

    }
	public void stringLenght(String a) {
		if (a.length() > 4) {
			char[] word = a.toCharArray();
		
			for(int i=0;i<word.length;i++) {
				System.out.print(word[i]);
				System.out.printf("%n");
			}
			
		}
		else 
			System.out.print(a);
		System.out.printf("%n");
		
	}
	
	 public <T> void SortList(String order){

         List<String> list = Arrays.asList("Text", "Computer", "Automation", "Visual Studio", "Auto Parts");
         System.out.printf("List size %n");
         System.out.print(list.size());
         System.out.printf("%n");

         if (order == "asc")
         {
             Collections.sort(list);
             for(int i=0;i< list.size();i++) {
            	 System.out.println(list.get(i)); 
            	 System.out.printf("%n");
             }
           
         }
         else if (order == "desc")
         {
        	 Collections.sort(list, Collections.reverseOrder());
        	 for(int i=0;i<= list.size();i++) {
            	 System.out.println(list.get(i)); 
            	 System.out.printf("%n");
             }
         }
         else
         {
             System.out.print("Order can be only ASC or DESC");
         }

     }
	 public <T> void removeValues(List<T> list) {
		 list.stream().filter(elem -> elem != null).forEach(item->System.out.println(item));;
		// list.forEach(item->System.out.println(item));
		 System.out.printf("%n");
		 
	 }
	 public void missingNumber() {
		 System.out.printf("Gettin rid of the duplicates %n");
		 List<Integer> list = Arrays.asList(2,2,3,4,4,5,6,7,8,10);
		 list.stream().distinct().forEach(System.out::println);
		 System.out.printf("%n");
		 
		 System.out.printf("Missing Numbers %n");
		 
		 int temp = 1;
		 
		 for(int i=0;i<10;i++)
		 {
			if(list.get(i) != temp)
			{
				for(int j= temp;j<list.get(i);j++) {
				System.out.print(j);
				System.out.printf("%n");
				} 
			}
			temp = list.get(i) + 1;
			 
		 }
	 }
	
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Text", "Computer", "Automation", "Visual Studio", "Auto Parts", null );
		ClassA a = new ClassA();
		
		a.compareLenght("Mari", "ana");
		a.stringLenght("cuatro4");
		a.missingNumber();
		a.SortList("asc");
		a.removeValues(list);

		
		System.out.printf("** Now this is ClassB **  %n");
		ClassB b = new ClassB();
		b.compareLenght("mariana", "mariana");
		
		superCoolInterface i = new Methd();
		i.showMessage();
		
		
	}
	

}
