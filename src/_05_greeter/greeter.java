package _05_greeter;

import javax.swing.JOptionPane;

public class greeter {
public static void main(String[] args) {
	String a = JOptionPane.showInputDialog("What's your name?");
			JOptionPane.showMessageDialog(null, "Hi there " + a + "!");

}
}
