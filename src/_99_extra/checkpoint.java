package _99_extra;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class checkpoint {
public static void main(String[] args) {
	String a = JOptionPane.showInputDialog("What's your favorite color?");
	JOptionPane.showMessageDialog(null, a + " is also my favorite color!");
	Robot gibby = new Robot(); 
	gibby.setSpeed(100);
	gibby.penDown();
	if(a .equals("red")){
		gibby.setPenColor(Color.red);
		}
	gibby.turn(120);
	gibby.move(200);
	gibby.turn(120);
	gibby.move(200);
	gibby.turn(120);
	gibby.move(200);
}
}
