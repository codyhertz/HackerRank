import java.util.Scanner;

public class PasswordStrength
{
	public static void main(String[] args)
	{
		Scanner scanny = new Scanner(System.in);
		
		System.out.println("Please enter your name: ");
		String name = scanny.nextLine();
		System.out.println("Please enter your password: ");
		String password = scanny.nextLine();
		
		String numbers = "0123456789";
		String lowerCase = "abcdefghijklmnopqrstuvwxyz";
		String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String special = "!@#$%^&*()-+";
		
		int need = 0;
		
		boolean containsNumber = false;
		
		for(int i = 0; i < numbers.length(); i++)
		{
			if(password.indexOf(numbers.charAt(i)) != -1)
			{
				containsNumber = true;
				break;
			}
		}
		
		if(!containsNumber)
		{
			System.out.println("Missing a number in password.");
			need++;
		}
		
		boolean containsLowerCase = false;
		
		for(int i = 0; i < lowerCase.length(); i++)
		{
			if(password.indexOf(lowerCase.charAt(i)) != -1)
			{
				containsLowerCase = true;
				break;
			}
		}
		
		if(!containsLowerCase)
		{
			System.out.println("Missing a lower case in password.");
			need++;
		}
		
		boolean containsUpperCase = false;
		
		for(int i = 0; i < upperCase.length(); i++)
		{
			if(password.indexOf(upperCase.charAt(i)) != -1)
			{
				containsUpperCase = true;
				break;
			}
		}
		
		if(!containsUpperCase)
		{
			System.out.println("Missing a upper case in password.");
			need++;
		}
		
		boolean containsSpecial = false;
		
		for(int i = 0; i < special.length(); i++)
		{
			if(password.indexOf(special.charAt(i)) != -1)
			{
				containsSpecial = true;
				break;
			}
		}
		
		if(!containsSpecial)
		{
			System.out.println("Missing a special character in password.");
			need++;
		}
		
		if(password.length() < 6)
		{
			System.out.println("Your password is too short by " + (6 - password.length()) + " characters.");
		}
		
		if(need != 0)
		{
			System.out.println("Your password is missing " + need + " characters of different types.");
		}
	}
}
