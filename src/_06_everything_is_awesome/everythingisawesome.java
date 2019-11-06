package _06_everything_is_awesome;

import javax.swing.JOptionPane;

public class everythingisawesome {
public static void main(String[] args) {
	String a = JOptionPane.showInputDialog("What's your favorite subject?");
	JOptionPane.showMessageDialog(null, a + " " + "is awesome!");
}
}
