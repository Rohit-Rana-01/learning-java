import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Calculator extends JFrame implements ActionListener {
 JTextField display;
 double num1 = 0, num2 = 0, result = 0;
 char operator;
 Calculator() {
 setTitle("Scientific Calculator");
 setSize(400, 500);
 setLayout(new BorderLayout());
 // Display field
 display = new JTextField();
 display.setEditable(false);
 add(display, BorderLayout.NORTH);
 // Panel for buttons
 JPanel panel = new JPanel();
 panel.setLayout(new GridLayout(6, 4, 5, 5));
 // Decimal manipulation buttons
 String[] buttons = {
 "7", "8", "9", "/",
 "4", "5", "6", "*",
 "1", "2", "3", "-",
 "0", ".", "=", "+",
 "sin", "cos", "tan", "sqrt",
 "log", "x^y", "C", "Exit"
 };
 for (String text : buttons) {
 JButton button = new JButton(text);
 button.addActionListener(this);
 panel.add(button);
 }
 add(panel, BorderLayout.CENTER);
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 setVisible(true);
 }
 // Handle button clicks
 public void actionPerformed(ActionEvent e) {
 String command = e.getActionCommand();
 try {
 if (command.matches("[0-9]") || command.equals(".")) {
 display.setText(display.getText() + command);
 }
 else if (command.equals("+") || command.equals("-") || command.equals("*") ||
command.equals("/")) {
 num1 = Double.parseDouble(display.getText());
 operator = command.charAt(0);
 display.setText("");
 }
 else if (command.equals("=")) {
 num2 = Double.parseDouble(display.getText());
 switch (operator) {
 case '+': result = num1 + num2; break;
 case '-': result = num1 - num2; break;
 case '*': result = num1 * num2; break;
 case '/': result = num1 / num2; break;
 }
 display.setText(String.valueOf(result));
 }
 else if (command.equals("sin")) {
 result = Math.sin(Math.toRadians(Double.parseDouble(display.getText())));
 display.setText(String.valueOf(result));
 }
 else if (command.equals("cos")) {
 result = Math.cos(Math.toRadians(Double.parseDouble(display.getText())));
 display.setText(String.valueOf(result));
 }
 else if (command.equals("tan")) {
 result = Math.tan(Math.toRadians(Double.parseDouble(display.getText())));
 display.setText(String.valueOf(result));
 }
 else if (command.equals("sqrt")){

 result = Math.sqrt(Double.parseDouble(display.getText()));
 display.setText(String.valueOf(result));
 }
 else if (command.equals("log")) {
 result = Math.log10(Double.parseDouble(display.getText()));
 display.setText(String.valueOf(result));
 }
 else if (command.equals("x^y")) {
 num1 = Double.parseDouble(display.getText());
 operator = '^';
 display.setText("");
 }
 else if (operator == '^' && command.equals("=")) {
 num2 = Double.parseDouble(display.getText());
 result = Math.pow(num1, num2);
 display.setText(String.valueOf(result));
 }
 else if (command.equals("C")) {
 display.setText("");
 num1 = num2 = result = 0;
 }
 else if (command.equals("Exit")) {
 System.exit(0);
 }
 } catch (Exception ex) {
 display.setText("Error");
 }
 }
 public static void main(String[] args) {
 new Calculator();
 }
}  
 