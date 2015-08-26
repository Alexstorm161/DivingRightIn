import java.util.Scanner;

public class DivingIn 
{
	public static void main(String[] args) 
	{
		askUser();
	}
	public static void askUser()
	{
		Scanner UserInput=new Scanner(System.in);
		System.out.println("What is your name?");
		String name=UserInput.nextLine();
		System.out.println("How old are you?");
		int age=UserInput.nextInt();
		System.out.println("What year were you born?");
		int year=UserInput.nextInt();
		if(age<=16)
			{
				System.out.println("Wow, you are young");
			}
		else if(age>=18)
			{
				System.out.println("Wow, your are old");
			}
		else if(age==17)
			{
				System.out.println("17 is a good number");
			}
		for(int i=0; i<=age; i++)
		{
			if(i==1)
			{
				System.out.println("In "+(year+i)+ " you were "+(i)+" year old");
			}
			else
			{
			System.out.println("In "+(year+i)+ " you were "+(i)+ " years old");
			}
		}
	}
}
