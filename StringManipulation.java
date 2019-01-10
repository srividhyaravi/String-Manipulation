package Strings;
import java.util.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.lang.*;
 class StringManipulation
{
	static String s1,s2,s3,s4,s5,s7;
	static int n,m;


		 static Scanner sc=new Scanner(System.in);
		static void extract()
		{

	 	System.out.println("------------------------------------------------");
		System.out.println("Enter from where to want to start extracting string");
		n=sc.nextInt();
	 	System.out.println("Enter how many characters u want to extract");
		m=sc.nextInt();
		System.out.println(s1.substring(n,n+m));
		
		}

		
		 static void occurance()
		{
		System.out.println("Enter the word to know its occurance");

			s3=sc.next();
			int i = 0;
			Pattern p = Pattern.compile(s3);
			Matcher m = p.matcher( s1);
			while (m.find()) {
			    i++;
			}
		

		
			System.out.println("The word appeared " + i + " times");
		}
		
		 static void replace()
		{
			System.out.println("------------------------------------------------");
			System.out.print("Enter the word to be replaced  :");
			s4=sc.next();
			System.out.print("Enter new word ");
			s7=sc.next();
			System.out.println(s1.replaceAll(s4,s7));//replaces s4 by s7
		}
		

		 static void compare()
		{	Scanner sc=new Scanner(System.in);
			System.out.println("------------------------------------------------");
			System.out.println("Enter the string to be compared :");
			s5=sc.nextLine();
		if(s1.equals(s5))
			System.out.println("strings are equal\n");
		else
			System.out.println("strings are not equal\n");

		}

		  //System.out.println("------------------------------------------------");
		 static void concatenate()  
		
		{   Scanner sc=new Scanner(System.in);
			String s6;
		    System.out.println("------------------------------------------------");
			System.out.println("Enter the string to be concatenated");
			s6=sc.next();
			s1=s1+s6;
		  	System.out.println(s1);
		}

		
		 static void arrange()

		{
			System.out.println("------------------------------------------------");
			char b[] = s1.toCharArray();
			Arrays.sort(b);
			String s0=new String(b);
			System.out.println(s0);
		}
				
	public static void main(String []args)
	{
		int c;
		
		System.out.println("Enter the String :");
			s1=sc.nextLine();
		System.out.println("1.Extract a string\n2.Occurance\n3.Replace\n4.Concatenate\n5.Compare\n6.Arrange\n7.Exit\n");
			`
		
		
		while(true)
		{	System.out.println("Enter the choice");
			c=sc.nextInt();
		switch(c)
		{
			case 1:	System.out.println("Extract function");
					extract();
			break;
			case 2:	System.out.println("Occurance function");
					occurance();
			break;
			case 3 :System.out.println("Replace function");
					replace();
			break;
			case 4: System.out.println("Concatenate function");
					concatenate();
			break;
			case 5: System.out.println("Compare function");
					compare();
			break;
			case 6: System.out.println("Arrange function");
					arrange();
			break;
			case 7:
				System.exit(0);
				
			default:System.out.println("Wrong");
			break;
		}

	}
}

}



