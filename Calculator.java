import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
System.out.println("Enter Two numbers and also mathematical sign");
int num1=sc.nextInt();
int num2=sc.nextInt();
String sign= sc.next();
if(sign.equals("+")){
 System.out.println(num1+num2);
}else if(sign.equals("-")){
 System.out.println(num1-num2);
}else if(sign.equals("*")){
 System.out.println(num1*num2);
}else if(sign.equals("/")){
 System.out.println(num1/num2);
}else{
 System.out.println(num1%num2);
}
	}
}
