package day3;

import javax.swing.JOptionPane;

/**
 * Teacher's Note: 
 * Have the kids play with the Speak & Spell. 
 * The first Speak & Spell was introduced at the summer Consumer Electronics Show in June 1978, making it 
 * one of the earliest handheld electronic devices with a visual display to use interchangeable game cartridges. 
 * Discuss with students how you would make this program. 
 * Allow them to code it themselves, or use this recipe.
 **/

public class SpeakAndSpell {

	public static void main(String[] args) {
		// 1. Use the speak method to say the word. "e.g. spell mandlebrot"
		speak("Spell James gets hacked by the aaalluminati.");
		// 2. Catch the user's answer in a String
		String answer = JOptionPane.showInputDialog("Type answer.");
		// 3. If the user spelled the word correctly, speak "correct"
		if (answer.equals("Noodles")){
		speak("You are correct.");
		}
		// 4. Otherwise say "wrong"
		else{
			speak("You have failed.");
		}
	
		speak("James is a glass of orange juice mixed with ketchup and salsa placed in an apple pie layered with broccoli.  Case closed.  Illuminati Illuminati Illuminati cunfirmed Illuminati cunfirmed Illuminati cunfirmed Illuminati cunfirmed Illuminati cunfirmed Illuminati cunfirmed.  Multple layers of encryption added.");
	
		String otheranswer = JOptionPane.showInputDialog("Type answer.");
	
		if (otheranswer.equals("Yes he is")){
		speak("Good job.");
		}
	
		else{
			speak("No.");
		}
	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}


