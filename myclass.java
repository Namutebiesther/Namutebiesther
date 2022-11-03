package mypackage;

import java.util.Scanner;
public class myclass {
		public static void main(String[]args) {
			String str1, str2, str3, str4, str5, str6, str7, str8; //declaration of strings
			int x=1;  //declaration of numbers or integers
			int y=2;
			int sum=x+y;
			int difference=y-x;
			str1 = "Hello little ones";  //assigning values to the declared strings
			str2 = "what is your name?";
		    str3 = "you are welcome to java world";
		    str4 = "java can print letters for you to study";
		    str5 = "java can print numbers for you to learn";
		    str6 = "java can make a calculator for you in just minutes";
		    str7 = "are you interested in designing games, java will help you do so!";
		    str8 = "hopeyou have enjoyed our first java program";
		    
		System.out.println(str1); //printing of output 
		System.out.println(str2);
		Scanner sc=new Scanner(System.in);// standard input stream
		System.out.println("Enter your name here: ");
		String str=sc.nextLine(); //reads input string from the user
		System.out.println(str3);
		System.out.println(str4);
		System.out.println("the alphabetical lettters: A, B, C, D,....,Z");
		System.out.println(str5);
		System.out.println("Numbers 1 to 10: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 ");
		System.out.println(str6);
		System.out.println("after adding our declared numbers the answer is: "+sum);
		System.out.println("after subtraction of the declared numbers, the solution is: "+ difference);
		System.out.println(str7);
		System.out.println(str8);
		
		
	}


}
