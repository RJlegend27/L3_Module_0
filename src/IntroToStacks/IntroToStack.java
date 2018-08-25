package IntroToStacks;

import java.util.Random;
import java.util.Stack;

import javax.swing.JOptionPane;

public class IntroToStack {
	public static void main(String[] args) {
	Random gen = new Random();

		//1. Create a Stack of Doubles
		//   Don't forget to import the Stack class
		Stack<Double> doubles = new Stack<Double>();
		//2. Use a loop to push 100 random doubles between 0 and 100 to the Stack.
		for(int i = 0; i<101; i++){
			double d = gen.nextDouble()*100;
			doubles.push(d);
			//System.out.println(d);
		}
		//3. Ask the user to enter in two numbers between 0 and 100, inclusive. 
JOptionPane.showMessageDialog(null,"Enter two numbers between 0-100");
	
		String userInput = JOptionPane.showInputDialog("Enter number between 0-99");
		String secondUserInput = JOptionPane.showInputDialog("Enter a number "+ userInput+ "-100");
		//4. Pop all the elements off of the Stack. Every time a double is popped that is
		//   between the two numbers entered by the user, print it to the screen.
		double min = Double.parseDouble(userInput);
		double max = Double.parseDouble(secondUserInput);
		
		for(int i = 0; i<101; i++) {
			double value = doubles.pop();
//			System.out.println(doubles.pop());
			if(min < value && max > value) {
				System.out.println(value);
			}
		}
		
	
		//   EXAMPLE:
		//   NUM 1: 65
		//   NUM 2: 75
		
		//   Popping elements off stack...
		//   Elements between 65 and 75:
		//   66.66876846
		//   74.51651681
		//   70.05110654
		//   69.21350456
		//   71.54506465
		//   66.47984807
		//   74.12121224
	}
}
