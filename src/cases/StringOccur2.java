package cases;
import java.util.Scanner;

public class StringOccur2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);  
		System.out.println("Enter a string - ");
		String inputString=sc.nextLine();
		System.out.println("Enter a Character - ");
		char inputChar=sc.next().charAt(0);
		int counter=0;
		
		char[] charArray = inputString.toCharArray();
		for(char alpha:charArray)
		{
			if(alpha==inputChar)
			{
				counter++;
			}
		}
		
		System.out.print(counter);
	}

}