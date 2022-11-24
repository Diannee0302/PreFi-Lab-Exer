import java.util.Scanner;
public class RunAnimal {
	
	public static void main (String[] args){
		
		Bird bd = new Bird();
		Cat ct = new Cat();
		Dog dg = new Dog();
		
		Scanner SC = new Scanner(System.in);
		String choice;
		System.out.print("Choose an animal. Press B for Bird, C for Cat, D for Dog: ");
		choice = SC.nextLine();
		
		if (choice.equalsIgnoreCase("B")){
		   bd.eat();
		   bd.sleep();
		   bd.makeSound(); 
		}
		if (choice.equalsIgnoreCase("C")){
		   ct.eat();
		   ct.sleep();
		   ct.makeSound();
		}
		if (choice.equalsIgnoreCase("D")){
		   dg.eat();
		   dg.sleep();
		   dg.makeSound();
		}
		else{
			System.out.println("Invalid input!!!!");
		}
	}
}