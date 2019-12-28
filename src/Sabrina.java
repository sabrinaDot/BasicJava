import java.util.Scanner;

public class Sabrina {

	public static void main(String[] args) {
		//a Java program to check a number is even or odd	}
	Scanner obj = new Scanner(System.in);
	int number;
	int day;
	int numbr;
	int age;
	int month;
	
	System.out.println("enter any number : ");
	number = obj.nextInt();
	
	
	if (number % 2==0) {
		System.out.println("even"); //if the condition is true, output will be even.
		
	}else {
		System.out.println("odd"); // if the condition is false, output will be odd.
		}
	
	
	//a Java program that prints weekday based the week number(1 to 7). 
	
	
	System.out.println("what is today ?");
	day = obj.nextInt();

	switch(day) {
	case 1:
		System.out.println("today is Monday");
		break;
		
	case 2:
		System.out.println("today is Tuesday");
		break;
		
	case 3:
		System.out.println("today is Wednesday");
		break;
		
	case 4:
		System.out.println("today is Thursday");
		break;
		
	case 5:
		System.out.println("today is Friday");
		break;
		
	case 6:
		System.out.println("today is Saturday");
		break;
		
	case 7:
		System.out.println("today is Sunday");
		break;
		
	}
	
	
	// the greatest number of 3 numbers. 
	int x, y, z;
	
	System.out.println("enter the first number : ");
	x = obj.nextInt();
	
	System.out.println("enter the second number : ");
	y = obj.nextInt();
	
	System.out.println("enter the third number : ");
	z = obj.nextInt();	
	
	if (x > y && x > z) {
		System.out.println("The greatest number is " +x);	
	}
	else if (y > z && y > x) {
		System.out.println("The greatest number is " +y);
	}else	{
		System.out.println("The greatest number is " +z);
		
	}
	
	// we can do it another way (the greatest number of 3)
	
	int [] numb = new int[3];
	
	
	System.out.println("enter 3 numbers ");
	
	for (int i = 0; i <3; i++) {
		numb[i]= obj.nextInt();
	}
	int max = numb[0];
	for (int i = 0; i <3; i++) {
		
		if (max<numb[i]) {
			max = numb[i];
		}	}
	System.out.println(max);
	
	
	//a Java program to check whether number is negative, zero, or positive. 
	
	System.out.println("enter valid number");
	numbr = obj.nextInt();
	
	if (numbr>0) {
		System.out.println("positive");
	}
	else if(numbr<0) {
		System.out.println("negative");
		
		}else {
			System.out.println("zero");
		}
	
	//a program will show if the person is eligible to vote. 
	
	System.out.println("enter age");
	age = obj.nextInt();
	
	if(age>=18) {
		System.out.println("The person is eligible to vote.");
	}
	else {
		System.out.println("not eligible");
	}
	
	//a program to print month name based month number as an input using switch...Case statement.

	System.out.println("enter valid month : ");
	month = obj.nextInt();
	
	switch(month) {
	
	case 1:
		System.out.println("January");	
		break;
		
	case 2:
		System.out.println("February");
		break;
	case 3:
		System.out.println("March");	
		break;
		
	case 4:
		System.out.println("April");
		break;
	case 5:
		System.out.println("May");
		break;
		
	case 6:
		System.out.println("June");
		break;
	
	}
	}
}










