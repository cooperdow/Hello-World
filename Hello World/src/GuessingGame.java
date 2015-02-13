import java.util.Scanner;

public class GuessingGame 
		{
	static Scanner userInput = new Scanner(System.in);
	static int randomNumber;
	static boolean correctGuess = false;
		public static void main(String[] args) 
			{
			greetPlayer();
			generateRandomNumber();
			askForUserGuess();
			}
		public static void greetPlayer()
			{
			System.out.println("What is your name?");
			String name = userInput.nextLine();
			System.out.println("Hello," + name + "! Hope you enjoy the game.");
			System.out.println("I'm thinking of a number between 1 and 10, what is it?");
			}	
		public static int generateRandomNumber()
				{
				randomNumber = (int) (Math.random() * 10) + 1;
				return randomNumber;
				}
				
		public static void askForUserGuess()
				{
				while (correctGuess == false)
					{
					int guess = userInput.nextInt();
					if (guess > randomNumber) 
						{
						System.out.println("Too high");
						}
					else if (guess < randomNumber) 
						{
						System.out.println("Too low");
						}
					else
						{
						System.out.println("Correct!");
						}
				
				}
			}
		}
