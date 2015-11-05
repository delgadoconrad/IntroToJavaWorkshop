package day3;
	import javax.swing.JOptionPane;
	// Copyright Wintriss Technical Schools 2013
	import java.util.Random;

	public class Magic8Ball {

		// 1. Make a main method that includes all the steps below….
		public static void main(String[] args) {			
		// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
		int num = new Random().nextInt(4);
		// 3. Print out this variable
		System.out.println(num);		
		// 4. Get the user to enter a question for the 8 ball
		String z = JOptionPane.showInputDialog("Ask me a queestion.");
		// 5. If the random number is 0
		if(num == 0){
		// -- tell the user "Yes"
		JOptionPane.showMessageDialog(null,"Yes.");
		}
		// 6. If the random number is 1
		else if(num == 1){
		// -- tell the user "No"
		JOptionPane.showMessageDialog(null,"No, task failed.");
		}
		// 7. If the random number is 2
		else if(num == 2){
		// -- tell the user "Maybe you should ask Google?"
		JOptionPane.showMessageDialog(null,"You should ask internet explorer.");
		}
		// 8. If the random number is 3
		else if(num == 3){
		// -- write your own answer
		JOptionPane.showMessageDialog(null,"James is Illuminati.  Seize him nowow.");
		}
	}
}
