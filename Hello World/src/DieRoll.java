import java.util.Scanner;
public class DieRoll {
public static void main(String[] args){
Scanner userInput=new Scanner(System.in);

System.out.println("You are on a plane when suddenly the engine blows up. The plane is starting to break into two pieces and you are on the back end of the plane.");
System.out.println("Do you try to jump to the front of the plane or stay in your seat?");
System.out.println("(1) Try to jump to the front of the plane");
System.out.println("(2) Stay in your seat");

	int choice=userInput.nextInt();
	int dieRoll=(int)(Math.random()*2)+1;
	if(choice==1)	
		if(dieRoll==1)
		{
		System.out.println("You barely grab onto the front of the plane.");
		System.out.println("There is an old man barely hanging on");
		System.out.println("Do you decide to save the man or make it to a seat to save yourself?");
		System.out.println("(1) Save the old man");
		System.out.println("(2) Save yourself");
		}
		int choice2=userInput.nextInt();
		int dieRoll2=(int)(Math.random()*2)+1;
		if(choice2==1)
			{
			if(dieRoll2==1)
				{
				System.out.println("The old man is in the mafia and decides to throw you out of the plane instead");
				}
			else if(dieRoll2==2)
				{
				System.out.println("You grab the old man right as he loses his grip, pulling him to safety");
				}
		else if(dieRoll==2)
				{
				System.out.println("You trip and can't grab the front of the plane in time.");
				}
			
		
		
		int dieRoll3=(int)(Math.random()*2)+1;}
		else if (choice==2)	
			{		
			if(dieRoll==1)
				{
				System.out.println("You fall with the back of the plane to the ground below");
				}
			else if(dieRoll==2)
				{
				System.out.println("Lebron James grabs you and pulls you to the front of the plane");
				}
			}
		
	
}}



	
	
