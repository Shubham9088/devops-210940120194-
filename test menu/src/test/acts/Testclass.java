package test.acts;

import java.util.Scanner;

public class Testclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int num1=0,num2=0,option,ex;
		 do
		 {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter your choice from the following menu:");
		 System.out.println("1.Addition 2.Subtraction 3.Multiplication 4.Division 5.Exit");
		 option = sc.nextInt();
		
		 switch(option)
		 {
		 case 1:System.out.println("Addition of "+num1+" and "+num2+" is "+(num1+num2));
		 break;
		
		 default: System.out.println("Invalid choice");
		 }
		 System.out.println("Do you want to continue?1.Yes 2.No");
		 ex=sc.nextInt();
		 }while(ex==1);

	}

}
