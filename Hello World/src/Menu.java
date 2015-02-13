import java.util.Scanner;
public class Menu {
public static void main(String[] args){
Scanner userInput=new Scanner(System.in);

System.out.println("You are lost in the woods, what do you do?");
System.out.println("Type the number next to your choice:");
System.out.println("(1)Scream");
System.out.println("(2)Make a smoke signal");
System.out.println("(3)Give up and lay in the fetal position");

int choice=userInput.nextInt();

if(choice==1)
{
	System.out.println("A bear hears the screaming and eats you.");
}
else if(choice==2)
{
	System.out.println("No one notices");
}
else if(choice==3)
{
System.out.println("A hunter happens to find you and brings you to safety");
	}
}}

