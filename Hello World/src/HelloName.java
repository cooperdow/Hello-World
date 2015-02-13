import java.util.Scanner;
public class HelloName {

	public static void main(String[] args) {
		Scanner userInput=new Scanner(System.in);
		System.out.println("What is your name?");
		String name=userInput.nextLine();
		System.out.println("Hello, "+name+"!");

	}

}
