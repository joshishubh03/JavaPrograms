import java.util.Scanner;

// 1. WAP to calculate area of circle 
// import java.util.Scanner;
// class Find
// {
// 	public double area(float r)
// 	{
// 		return Math.PI*r*r;
// 	}
// }
// class calculate
// {
// 	public static void main(String... args)
// 	{
// 		Scanner sc =new Scanner(System.in);
// 		System.out.println("Enter the radius");
// 		float r=sc.nextFloat();
// 		Find f=new Find();
// 		System.out.println("Area of circle is  "+f.area(r));
// 	}
// }



// 2. WAP to calculate area of rectangle
// import java.util.Scanner;
// class Find
// {
// 	public double area(float x, float y)
// 	{
// 		return x*y;
// 	}
// }
// class calculate
// {
// 	public static void main(String... args)
// 	{
// 		Scanner sc =new Scanner (System.in);
// 		System.out.println("Enter the length");
// 		float len=sc.nextFloat();
// 		System.out.println("Enter the breadth ");
// 		float b=sc.nextFloat();
// 		Find f=new Find();
// 		System.out.println("Area of rectangle is "+f.area(len,b));
// 	}
// }


// 3. WAP to calculate the percentage of students
// import java.util.Scanner;
// class Find
// {
// 	public int sum(int a,int b,int c,int d,int e)
// 	{
// 		return (a + b + c + d + e);
// 	}
// 	public float per(int s)
// 	{
// 		return s/5;
// 	}
// }
// class calculate
// {
// 	public static void main(String... args)
// 	{
// 		Scanner sc = new Scanner(System.in);
// 		System.out.println("Enter the marks of  5 subject");
// 		int m1=sc.nextInt();
// 		int m2=sc.nextInt();
// 		int m3=sc.nextInt();
// 		int m4=sc.nextInt();
// 		int m5=sc.nextInt();
// 		Find f= new Find();
// 		int sum=f.sum(m1,m2,m3,m4,m5);
// 		System.out.println("total marks is "+sum+" percentage is "+f.per(sum));
// 	}
// }




// 4. WAP to exchange value to two variable with third variable and without third variable

//a--
// import java.util.Scanner;
// class Solution 
// {
// 	private int a,b;
// 	public void swap(int a, int b)
// 	{
// 		int c=b;
// 		this.b=a;
// 		this.a=c;
// 	}
// 	public int getA()
// 	{
// 		return a;
// 	}
// 	public int getB()
// 	{
// 		return b;
// 	}
// }
// class Test
// {
// 	public static void main(String... args)
// 	{
// 		Scanner sc=new Scanner (System.in);
// 		System.out.println("Enter the value of a");
// 		int a=sc.nextInt();
// 		System.out.println("Enter the value of b");
// 		int b=sc.nextInt();
// 		Solution f=new Solution();
// 		f.swap(a,b);
// 		System.out.println("value of a is "+f.getA());
// 		System.out.println("Value of b is "+f.getB());
// 	}
// }

//b-----
// import java.util.Scanner;
// class Solution 
// {
// 	private int a,b;
// 	public void swap(int a, int b)
// 	{
// 		a=a+b;
// 		b=a-b;
// 		this.a=a-b;
// 		this.b=b;
// 	}
// 	public int getA()
// 	{
// 		return a;
// 	}
// 	public int getB()
// 	{
// 		return b;
// 	}
// }
// class Test
// {
// 	public static void main(String... args)
// 	{
// 		Scanner sc=new Scanner (System.in);
// 		System.out.println("Enter the value of a");
// 		int a=sc.nextInt();
// 		System.out.println("Enter the value of b");
// 		int b=sc.nextInt();
// 		Solution f=new Solution();
// 		f.swap(a,b);
// 		System.out.println("value of a is "+f.getA());
// 		System.out.println("Value of b is "+f.getB());
// 	}
// }


// 5. WAP to exchange value of two variable without using third variable and arithmetic operator

// import java.util.Scanner;
// class Solution 
// {
// 	private int a,b;
// 	public void swap(int a, int b)
// 	{
// 		a=a^b;
// 		b=a^b;
// 		this.a=a^b;
// 		this.b=b;
// 	}
// 	public int getA()
// 	{
// 		return a;
// 	}
// 	public int getB()
// 	{
// 		return b;
// 	}
// }
// class Test
// {
// 	public static void main(String... args)
// 	{
// 		Scanner sc=new Scanner (System.in);
// 		System.out.println("Enter the value of a");
// 		int a=sc.nextInt();
// 		System.out.println("Enter the value of b");
// 		int b=sc.nextInt();
// 		Solution f=new Solution();
// 		f.swap(a,b);
// 		System.out.println("value of a is "+f.getA());
// 		System.out.println("Value of b is "+f.getB());
// 	}
// }


// 6. WAP to find greater among two number 
// import java.util.Scanner;
// class Find
// {
// 	public int maximum(int a,int b)
// 	{
// 		int m=(a>b) ?a:b;
// 		 return m;
// 	}
// }
// class Test
// {
// 	public static void main(String... args)
// 	{
// 		Scanner sc=new Scanner (System.in);
// 		System.out.println("Enter the first number ");
// 		int a=sc.nextInt();
// 		System.out.println("Enter the second number ");
// 		int b=sc.nextInt();
// 		Find f=new Find();
// 		int m=f.maximum(a,b);
// 			System.out.println("maximum number is "+m);
// 	}
// }



// 7. WAP to find greater among three number

// import java.util.Scanner;
// class Find
// {
// 	public int maximum(int a,int b,int c)
// 	{
// 		int m=(a>b) &&(a>c)? a:(b>c)?b:c;
// 		 return m;
// 	}
// }
// class Test
// {
// 	public static void main(String... args)
// 	{
// 		Scanner sc=new Scanner (System.in);
// 		System.out.println("Enter the first number ");
// 		int a=sc.nextInt();
// 		System.out.println("Enter the second number ");
// 		int b=sc.nextInt();
// 		System.out.println("Enter the third number ");
// 		int c=sc.nextInt();
// 		Find f=new Find();
//  		int m=f.maximum(a,b,c);
// 			 System.out.println("maximum number is "+m);
// 	}
// }



// 8. WAP to check wheather number is even or odd

// import java.util.Scanner;
// class Solution
// {
// 	public void check(int n)
// 	{
// 		if(n%2==0)
// 				System.out.println("Even number");
// 		else
// 				System.out.println("Odd number");
// 	}
// }
// class Test
// {
// 	public static void main(String []args)
// 	{
// 		Scanner sc=new Scanner(System.in);
// 		System.out.println("Enter the number to check it is even or not");
// 		int n =sc.nextInt();
// 		Solution s=new Solution();
// 		s.check(n);
// 	}
// }


// 9. WAP to check wheater number is positive or negative

// import java.util.Scanner;
// class Solution
// {
// 	public void check(int n)
// 	{
// 		if(n>0)
// 			System.out.println("number is +ve");
// 		else if(n<0)
// 			System.out.println("number is -ve");
// 		else
// 			System.out.println("number is zero");
// 	}
// }
// class Test
// {
// 	public static void main(String []args)
// 	{
// 		Scanner sc=new Scanner(System.in);
// 		System.out.println("Enter the number");
// 		int n=sc.nextInt();
// 		Solution s=new Solution();
// 		s.check(n);
// 	}
// }



// 10. Print number between 1 to 5 in word format 

// import java.util.Scanner;
// class Print
// {
// 	public void word(int n)
// 	{
// 		switch(n)
// 		{
// 			case 1: System.out.println("One");
// 						break;
// 			case 2: System.out.println("Two");
// 						break;
// 			case 3: System.out.println("Three");
// 						break;
// 			case 4: System.out.println("Four");
// 						break;
// 			case 5: System.out.println("Five");
// 						break;
// 			default : System.out.println("invalid choice");
// 		}
// 	}
// }
// class Test
// {
// 	public static void main(String... args)
// 	{
// 		Scanner sc=new Scanner(System.in);
// 		Print p=new Print();
// 		System.out.println("enter numbre beyween 1to 5");
// 		p.word(sc.nextInt());
// 	}
// }



// 11. Find even odd using switch case 

// import java.util.Scanner;
// class Find
// {
// 	public void check(int n)
// 	{
// 		int c=n%2;
// 		switch(c)
// 		{
// 			case 0 : System.out.println("no is even");
// 							break;
// 			case 1 : System.out.println("no is odd");
// 							break;
// 			default : System.out.println("Invalid choice");
// 		}
// 	}
// }
// class Test
// {
// 	public static void main(String... args)
// 	{
// 		Scanner sc=new Scanner(System.in);
// 		Find f=new Find();
// 		System.out.println("Enter the number");
// 		f.check(sc.nextInt());		
// 	}
// }


// 12. Check given character is vowel or not using switch case 

// import java.util.Scanner;
// class Find
// {
// 	public void check(char ch)
// 	{
// 		switch(ch)
// 		{
// 			case 'a':case 'e':case 'i':case 'o':case 'u':
// 			case 'A':case 'E':case 'I':case 'O':
// 			case 'U':System.out.println("char is vowel");break;
// 			default : System.out.println("char is consonent");
// 		}
// 	}
// }
// class Test
// {
// 	public static void main (String... args)
// 	{
// 		Scanner sc=new Scanner(System.in);
// 		Find f=new 	Find();
// 		System.out.println("Enter a char");
// 		f.check(sc.next().charAt(0));
// 	}
// }



// 13. Program to perform arithmetic operation using switch case

// import java.util.Scanner;
// class Solution
// {
// 	public void operation(int a,int b)
// 	{
// 		Scanner s = new Scanner(System.in);
// 		while(true)
// 		{
// 		System.out.println("\nchoose any of the operator\n+\n-\n/\n%\n*\ne for EXIT");
// 		char o =s.next().charAt(0);
// 		switch(o)
// 		{
// 			case '+':System.out.println("addition of two number is : "+(a+b));
// 							break;
// 			case '-':System.out.println("differnece of two number is : "+(a-b));
// 							break;
// 			case '/':System.out.println("division of two number is : "+(a/b));
// 							break;
// 			case '%':System.out.println("modulos of two number is : "+(a%b));
// 							break;
// 			case '*':System.out.println("product of two number is :"+(a*b));
// 							break;
// 			case 'e': return;
// 			default :System.out.println("invalid choice");
// 		}}
// 	}
// }
// class Test
// {
// 	public static void main(String... args)
// 	{
// 		Scanner sc=new Scanner(System.in);
// 		System.out.println("Enter the value of a");
// 		int a=sc.nextInt();
// 		System.out.println("Enter the value of b");
// 		int b=sc.nextInt();
// 		Solution s=new Solution();
// 		s.operation(a, b);
		
// 	}
// }


// 14. WAP to find lowest number among four different number 

// import java.util.Scanner;
// class Find
// {
// 	public void check(int a,int b,int c,int d)
// 	{
// 		if(a<b && a<c && a<d)
// 			System.out.println(a+ " is lowest");
// 		else if(b<c && b<d)
// 			System.out.println(b+" is lowest");
// 		else if(c<d)
// 			System.out.println(c+" is lowest");
// 		else
// 			System.out.println(d+" is lowest");
// 	}
// }
// class Test
// {
// 	public static void main(String... args)
// 	{
// 		Scanner sc=new Scanner (System.in);
// 		System.out.println("Enter four numbers to find lowest");
// 		int a=sc.nextInt();
// 		int b=sc.nextInt();
// 		int c=sc.nextInt();
// 		int d=sc.nextInt();
// 		Find f=new Find();
// 		f.check(a,b,c,d);
// 	}
// }



// 15. WAP to check given year is a leap year or not 

// import java.util.Scanner;
//  class Find
// {
// 	public void check(int y)
// 	{
// 		if(y%4==0 && y%100!=0 || y%400==0)
// 			System.out.println("year "+y+ " is leap year");
// 		else
// 			System.out.println("Year "+y+" is not a leap year");
// 	}
// }
// class Test
// {
// 	public static void main(String... args)
// 	{
// 		Scanner sc=new Scanner(System.in);
// 		Find f=new Find();
// 		System.out.println("Enter the year to findout its leap year or not");
// 		f.check(sc.nextInt());	
// 	}
// }



// 16. W.A.P to convert temperature from Fahrenheit to Celsius and Celsius to Fahrenheit. For given problem you have to take choice from user. If user enter choice ‘c’ or ‘C’ then convert Fahrenheit to Celsius. If user enter choice ‘f’ or ‘F’ then convert Celsius to Fahrenheit. 

// import java.util.Scanner;
// class Change
// {
// 	public float fahrenheitToCelsius(Float f)
// 	{
// 		return ((f-32)*5)/9;
// 	}
// 	public float celsiusToFahrenheit(float c)
// 	{
// 		return ((c*9)/5)+32;
// 	}
// }
// class Test
// {
// 	public static void main(String... args)
// 	{
// 		Scanner sc=new Scanner(System.in);
// 		Change change=new Change();
// 		while(true)
// 		{
// 		System.out.println("Enter any choice \n'c' OR 'C' for fahrenheit to celsius \n'f' OR 'F' for celsius to fahrenheit\ne for Exit");
// 		float c=0.0f,f=0.0f;
// 		char ch=sc.next().charAt(0);
// 		switch(ch)
// 		{
// 			case 'c':
// 			case 'C':System.out.println("Enter the value of fahrenheit");
// 					 c=change.fahrenheitToCelsius(sc.nextFloat());
// 					 System.out.println("celsius is "+c);
// 			         break;
// 			case 'f':
// 			case 'F':System.out.println("Enter the value of celsius ");
// 			 		 f=change.celsiusToFahrenheit(sc.nextFloat());
// 			         System.out.println("Fahrenheit is "+f);
// 			         break;
// 			case 'e':return;
// 			default: System.out.println("Invalid choice");
// 		}}
// 	}
// }



// 17. W.A.P to check the sign of given number. 

// import java.util.Scanner;
// class Solution
// {
// 	public void check(int n)
// 	{
// 		if(n>0)
// 			System.out.println("number is +ve");
// 		else if(n<0)
// 			System.out.println("number is -ve");
// 		else
// 			System.out.println("number is zero");
// 	}
// }
// class Test
// {
// 	public static void main(String []args)
// 	{
// 		Scanner sc=new Scanner(System.in);
// 		System.out.println("Enter the number");
// 		int n=sc.nextInt();
// 		Solution s=new Solution();
// 		s.check(n);
// 	}
// }



// 18. W.A.P to check whether given number is even or odd Without using % operator. 

// import java.util.Scanner;
// class Solution
// {
// 	public void check(int n)
// 	{
// 		if((n & 1)==0)
// 				System.out.println("Even number");
// 		else
// 				System.out.println("Odd number");
// 	}
// }
// class Test
// {
// 	public static void main(String []args)
// 	{
// 		Scanner sc=new Scanner(System.in);
// 		System.out.println("Enter the number to check it is even or not");
// 		int n =sc.nextInt();
// 		Solution s=new Solution();
// 		s.check(n);
// 	}
// }



// 19. W.A.P to check whether the traingle is equilateral, scalene, or isosceles. Hint: - Isosceles triangle: In geometry, an isosceles triangle is a triangle that has two sides of equal length. Equilateral triangle: In geometry, an equilateral triangle is a triangle in which all three sides are equal. Scalene triangle: A scalene triangle is a triangle that has three unequal sides. 

// import java.util.Scanner;
// class Find
// {
// 	public void check(float l1,float l2,float l3)
// 	{
// 		if(l1==l2 && l2==l3 && l1==l3)
// 				System.out.println("Triangle equilateral");
// 		else if(l1 == l2 || l2==l3 || l1==l2)
// 			    System.out.println("isoscele triangle");
// 		else
// 			System.out.println("Scalene triangle");
// 	}
// }
// class Test
// {
// 	public static void main(String... args)
// 	{
// 		Scanner sc=new Scanner(System.in);
// 		System.out.println("Enter the length of three side");
// 		float l1=sc.nextFloat();
// 		float l2=sc.nextFloat();
// 		float l3=sc.nextFloat();
// 		Find f=new Find();
// 		f.check(l1,l2,l3);
// 	}
// }




// 20. W.A.P to check whether a charachter is an alphabet or not.

// import java.util.Scanner;
// class Alpha
// {
// 	public void check(char ch)
// 	{
// 		if((ch>='A' && ch<='Z')||(ch>='a' && ch<='z'))
// 			System.out.println("Char is alphabate");
// 		else
// 			System.out.println("char is not a alphabet");
// 	}
// }
// class Test
// {
// 	public static void main(String... args)
// 	{
// 		Scanner sc=new Scanner(System.in);
// 		System.out.println("Enter the char");
// 		Alpha f=new Alpha();
// 		f.check(sc.next().charAt(0));
// 	}
// }



// 21. Java program to check whether the triangle is valid or not if angles are given. Hint:- The angle property of the triangle says that the sum of all three angles should be equal to 180. 

// import java.util.Scanner;
// class Triangle
// {
// 	public void check(int a,int b,int c)
// 	{
// 		int sum=a+b+c;
// 		if(sum==180)
// 			System.out.println("triangle is valid");
// 		else
// 			System.out.println("triangle is not valid");
// 	}
// }
// class Test
// {
// 	public static void main(String... args)
// 	{
// 		Scanner sc=new Scanner(System.in);
// 		System.out.println("Enter the three angles of a triangle");
// 		int a1=sc.nextInt();
// 		int a2=sc.nextInt();
// 		int a3=sc.nextInt();
// 		Triangle t=new Triangle();
// 		t.check(a1,a2,a3);
// 	}
// }



// 22. Write a Java program to check whether a number is divisible by 5 and 11 or not. 

// import java.util.Scanner;
// class Division
// {
// 	public void check(int n)
// 	{
// 		if(n%5==0 || n%11==0)
// 			System.out.println("number is divisible");
// 		else 
// 			System.out.println("number is not divisible");
// 	}
// }
// class Test
// {
// 	public static void main(String... args)
// 	{
// 		Scanner sc=new Scanner (System.in);
// 		Division d=new Division(); 
// 		System.out.println("Enter the number");
// 		d.check(sc.nextInt());
// 	}
// }



// 23. Write a Java program to input day number and print week day. 

// import java.util.Scanner;
// class Print
// {
// 	public void print(int n)
// 	{
// 		switch(n)
// 		{
// 			case 1: System.out.println("Sunday");
// 						break;
// 			case 2: System.out.println("Monday");
// 						break;
// 			case 3: System.out.println("Tuesday");
// 						break;
// 			case 4: System.out.println("Wednesday");
// 						break;
// 			case 5: System.out.println("Thrusday");
// 						break;
// 			case 6: System.out.println("Friday");
// 						break;
// 			case 7: System.out.println("Saturday");
// 						break;
// 			default : System.out.println("Invalid choice");
// 		}
// 	}
// }
// class Test
// {
// 	public static void main(String... args)
// 	{
// 		Scanner sc=new Scanner(System.in);
// 		Print p=new Print();
// 		System.out.println("Enter the number");
// 		p.print(sc.nextInt());	
// 	}
// }


// 24. Write a Java program to count total number of notes in given amount. 

// import java.util.Scanner;
// class Calculate
// {
// 	public void notes(int amt)
// 	{
// 		while(amt>=2000)
// 		{
// 			int notes=amt/2000;
// 			System.out.println("notes of 2000 = "+notes);
// 			amt=amt-(2000*notes);
// 		}
// 		while(amt>=500)
// 		{
// 			int notes=amt/500;
// 			System.out.println("notes of 500 = "+notes);
// 			amt=amt-(500*notes);
// 		}
// 		while(amt>=200)
// 		{
// 			int notes=amt/200;
// 			System.out.println("notes of 200 = "+notes);
// 			amt=amt-(200*notes);
// 		}
// 		while(amt>=100)
// 		{
// 			int notes=amt/100;
// 			System.out.println("notes of 100 = "+notes);
// 			amt=amt-(100*notes);
// 		}
// 		while(amt>=50)
// 		{
// 			int notes=amt/50;
// 			System.out.println("notes of 50 = "+notes);
// 			amt=amt-(50*notes);
// 		}
// 		while(amt>=20)
// 		{
// 			int notes=amt/20;
// 			System.out.println("notes of 20 = "+notes);
// 			amt=amt-(20*notes);
// 		}
// 		while(amt>=10)
// 		{
// 			int notes=amt/10;
// 			System.out.println("notes of 10 = "+notes);
// 			amt=amt-(10*notes);
// 		}
// 		while(amt>=5)
// 		{
// 			int notes=amt/5;
// 			System.out.println("notes of 5 = "+notes);
// 			amt=amt-(5*notes);
// 		}
// 		while(amt>=2)
// 		{
// 			int notes=amt/2;
// 			System.out.println("notes of 2 = "+notes);
// 			amt=amt-(2*notes);
// 		}
// 		while(amt>=1)
// 		{
// 			int notes=amt/1;
// 			System.out.println("notes of 1 = "+notes);
// 			amt=amt-(1*notes);
// 		}
// 	}
// }
// class Test
// {
// 	public static void main(String... args)
// 	{
// 		Scanner sc=new Scanner(System.in);
// 		Calculate c=new Calculate();
// 		System.out.println("Enter the amount");
// 		c.notes(sc.nextInt());
		
// 	}
// }




// 25. Write a Java program to calculate profit or loss. 
// import java.util.Scanner;
// class Calculate
// {
// 	public void check_profit(int cp,int sp)
// 	{
// 		if(sp>cp)
// 			System.out.println("profit");
// 		else if(sp<cp)
// 			System.out.println("loss");
// 		else
// 			System.out.println("no profit non loss");
// 	}
// }
// class Test
// {
// 	public static void main(String... args)
// 	{
// 		Scanner sc=new Scanner(System.in);
// 		System.out.println("Enter the cost price");
// 		int cp=sc.nextInt();
// 		System.out.println("Enter the selling price");
// 		int sp=sc.nextInt();
// 		Calculate c=new Calculate();
// 		c.check_profit(cp, sp);
// 	}
// }




// 26. Write a Java program to input marks of five subjects Physics, Chemistry, Biology, Mathematics and Computer.          Calculate percentage and grade according to following: 
	// Percentage >= 90% : Grade A 
	// Percentage >= 80% : Grade B 
	// Percentage >= 70% : Grade C 
	// Percentage >= 60% : Grade D 
	// Percentage >= 40% : Grade E 
	// Percentage < 40% : Grade F
	
// import java.util.Scanner;
// class Calculate
// {
// 	public int percentage(int p,int ch,int b,int m,int c)
// 	{
// 		int sum= p+ch+b+m+c;
// 		System.out.println("total number:"+sum);
// 		return sum/5;
// 	}
// 	public void grade(int Per)
// 	{
// 		if(Per >= 90)
// 				System.out.println("Grade A"); 
// 		else if(Per >= 80) 
// 				System.out.println("Grade B"); 
// 		else if(Per >= 70)
// 				System.out.println("Grade C");
// 		else if(Per >= 60)
// 				System.out.println("Grade D");
// 		else if(Per >= 40)
// 				System.out.println("Grade E");
// 		else 
// 				System.out.println("Grade F");
// 	}
// }
// class Test
// {
// 	public static void main(String... args)
// 	{
// 		Scanner sc=new Scanner(System.in);
// 		System.out.println("Enter the marks of following subject");
// 		System.out.println("Physics : ");
// 		int p=sc.nextInt();
// 		System.out.println("Chemistry :");
// 		int ch=sc.nextInt();
// 		System.out.println("Biology :");
// 		int b=sc.nextInt();
// 		System.out.println("Math : ");
// 		int m=sc.nextInt();
// 		System.out.println("Comp :" );
// 		int c=sc.nextInt();
// 		Calculate cal=new Calculate();
// 		int per=cal.percentage(p,ch,b,m,c);
// 		System.out.println("percentage :"+per);
// 		cal.grade(per);
// 	}
// }

// 27. Write a Java program to input basic salary of an employee and calculate its Gross salary according to following: Basic Salary <= 10000 : HRA = 20%, DA = 80% 
// Basic Salary <= 20000 : HRA = 25%, DA = 90% 
// Basic Salary > 20000 : HRA = 30%, DA = 95% 

// import java.util.Scanner;
// class Salary
// {
// 	private float hra,da,gs;
// 	public void gross(int s)
// 	{
// 		if(s<=10000)
// 		{
// 			hra = 0.2f*s;
// 			da = 0.8f*s;
// 			gs = hra+da+s;
// 		}
// 		else if(s<=20000)
// 		{
// 			hra = 0.25f*s;
// 			da = 0.9f*s;
// 			gs = hra+da+s;
// 		}
// 		else 
// 		{
// 			hra =0.3f*s;
// 			da=0.95f*s;
// 			gs=hra+da+s;
// 		}
// 	}
// 	public float getHr()
// 	{return this.hra;}
// 	public float getda()
// 	{return this.da;}
// 	public float getgs()
// 	{return this.gs;}
// }
// class Test
// {
// 	public static void main(String... args)
// 	{
// 		Scanner sc=new Scanner(System.in);
// 		System.out.println("Enter the basic salary");
// 		Salary s=new Salary();
// 		s.gross(sc.nextInt());
// 		System.out.println("HRA is : "+s.getHr());
// 		System.out.println("DA  is : "+s.getda());
// 		System.out.println("Gross salary is : "+s.getgs());
// 	}
// }


// 28. Write a Java program to input electricity unit charges and calculate total electricity bill according to the given condition: For first 50 units Rs. 0.50/unit For next 100 units Rs. 0.75/unit For next 100 units Rs. 1.20/unit For unit above 250 Rs. 1.50/unit An additional surcharge of 20% is added to the bill. 

// import java.util.Scanner;
// class Calculate
// {
// 	private float amt,rest,pay;
// 	public float bill(int unit)
// 	{
// 		if(unit<=50) 
// 		{
//             pay=0.50f*unit;
//         } 
// 		else if(unit>50 && unit<=150) 
// 		{
//             rest=unit-50;
//             pay=rest*0.75f;
//         } 
// 		else if(unit>150 && unit<=250) 
// 		{
//             rest=unit-50;
//             float surcharge=rest-100;
//             pay=(surcharge*1.20f)+100;
//         } 
// 		else if(unit>250) 
// 		{
//             int Total =unit-250;
//             float volt =((Total*1.50f)+220);
//     		pay = (volt*120)/100;
//         }
// 		return pay;
// 	}
// }
// class Test
// {
// 	public static void main(String... args)
// 	{
// 		Scanner sc=new Scanner(System.in);
// 		Calculate c=new Calculate();
// 		System.out.println("Enter the units");
// 		float amt=c.bill(sc.nextInt());
// 		System.out.println("ammount to be paid  "+amt);
// 	}
// }


// 29. Write a program to input choice from user. If user enter ‘+’ as choice then calculate addition of 2 number. If Choice ‘>’ then check which number is greaterst. If choice is ‘==’ then check both number is equal or not.

// import java.util.Scanner;
// class Calculate
// {
// 	public void choice(int a,int b,char ch)
// 	{
// 	switch(ch)
// 		{
// 			case '+' : System.out.println("addition of two number"+(a+b));
// 			break;
// 			case '>' : int m=(a>b) ? a:b;
// 							System.out.println("maximum value is :"+m);
// 							break;
// 			case '=': if(a==b)
// 							System.out.println("both are equal");
// 						else
// 							System.out.println("both are not equal");
// 						break;
// 			default:System.out.println("Invalid choice");
// 		}
// 	}
// }
// class Test
// {
// 	public static void main(String... args)
// 	{
// 		Scanner sc=new Scanner(System.in);
// 		System.out.println("Enter the value of a");
// 		int a=sc.nextInt();
// 		System.out.println("Enter the value of b");
// 		int b=sc.nextInt();
// 		System.out.println("\nchoose an operation listed below\n+ : addition \n> : greater\n= : equal ");
// 		char ch=sc.next().charAt(0);
// 		Calculate c=new Calculate();
// 		c.choice(a,b,ch);
// 	}
// }