package cases;

import java.util.Scanner;

public class StringInOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);  
		System.out.println("Enter a string - ");
		String inputString=sc.next();
		char[] charArray = inputString.toCharArray();
		String con="";
		for(char alpha:charArray)
		{
			int a=alpha;
			a=a+1;
			alpha=(char)a;
			
			con=con.concat(alpha+"");
		}
		
		System.out.print(con);
	}

}
