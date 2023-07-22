import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;

public class Calculator {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}
     double first;
     double second;
     double result;
     String operation;
     String answer;
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 731);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Scientific Calculator");
		lblNewLabel.setBounds(113, 5, 210, 26);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 21));
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setEnabled(false);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField.setBounds(10, 44, 416, 96);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("\u221A");
		btnNewButton.setEnabled(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a =Math.sqrt(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton.setBounds(20, 163, 80, 70);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 25));
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("1/X");
		btnNewButton_1.setEnabled(false);
		btnNewButton_1.setBounds(20, 232, 80, 70);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double a =1/(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnXy = new JButton("X^Y");
		btnXy.setEnabled(false);
		btnXy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first =Double.parseDouble(textField.getText());
				textField.setText("");
				operation="X^Y";
				
			}
		});
		btnXy.setBounds(20, 301, 80, 70);
		btnXy.setFont(new Font("Tahoma", Font.PLAIN, 22));
		frame.getContentPane().add(btnXy);
		
		JButton btnNewButton_3 = new JButton("X^3");
		btnNewButton_3.setEnabled(false);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a =(Double.parseDouble(textField.getText()));
				a = a*a*a;
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton_3.setBounds(20, 370, 80, 70);
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 25));
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("X^2");
		btnNewButton_4.setEnabled(false);
		btnNewButton_4.setBounds(20, 438, 80, 70);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a =(Double.parseDouble(textField.getText()));
				a = a*a;
				textField.setText("");
				textField.setText(textField.getText()+a);	
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 25));
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("n!");
		btnNewButton_5.setEnabled(false);
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double a=Double.parseDouble(textField.getText());
				double fact =1;
				while(a!=0)
				{
					fact = fact*a;
					a--;
				}
				textField.setText("");
				textField.setText(textField.getText()+fact);
			}
		});
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton_5.setBounds(20, 508, 80, 70);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnPlusMinus = new JButton("+/-");
		btnPlusMinus.setEnabled(false);
		btnPlusMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Double.parseDouble(String.valueOf(textField.getText()));
				a =a*(-1);
				textField.setText(String.valueOf(a));
			}
		});
		btnPlusMinus.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnPlusMinus.setBounds(20, 579, 80, 70);
		frame.getContentPane().add(btnPlusMinus);
		
		JButton btnEx = new JButton("e^x");
		btnEx.setEnabled(false);
		btnEx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double a =Math.exp(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnEx.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnEx.setBounds(103, 163, 80, 70);
		frame.getContentPane().add(btnEx);
		
		JButton btnNewButton_1_1 = new JButton("Log");
		btnNewButton_1_1.setEnabled(false);
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double a =Math.log(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton_1_1.setBounds(103, 232, 80, 70);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JButton btnPercentage = new JButton("%");
		btnPercentage.setEnabled(false);
		btnPercentage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first =Double.parseDouble(textField.getText());
				textField.setText("");
				operation="%";
			}
		});
		btnPercentage.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnPercentage.setBounds(103, 301, 80, 70);
		frame.getContentPane().add(btnPercentage);
		
		JButton btn7 = new JButton("7");
		btn7.setEnabled(false);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn7.setBounds(103, 370, 80, 70);
		frame.getContentPane().add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.setEnabled(false);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn4.setBounds(103, 438, 80, 70);
		frame.getContentPane().add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.setEnabled(false);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn1.setBounds(103, 508, 80, 70);
		frame.getContentPane().add(btn1);
		
		JButton btnSin = new JButton("Sin");
		btnSin.setEnabled(false);
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double a =Math.sin(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnSin.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnSin.setBounds(184, 163, 80, 70);
		frame.getContentPane().add(btnSin);
		
		JButton btnNewButton_1_2 = new JButton("Sinh");
		btnNewButton_1_2.setEnabled(false);
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double a =Math.sinh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton_1_2.setBounds(184, 232, 80, 70);
		frame.getContentPane().add(btnNewButton_1_2);
		
		JButton btnClear = new JButton("C");
		btnClear.setEnabled(false);
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnClear.setBounds(184, 301, 80, 70);
		frame.getContentPane().add(btnClear);
		
		JButton btn8 = new JButton("8");
		btn8.setEnabled(false);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn8.setBounds(184, 370, 80, 70);
		frame.getContentPane().add(btn8);
		
		JButton btn5 = new JButton("5");
		btn5.setEnabled(false);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn5.setBounds(184, 438, 80, 70);
		frame.getContentPane().add(btn5);
		
		JButton btn2 = new JButton("2");
		btn2.setEnabled(false);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn2.setBounds(184, 508, 80, 70);
		frame.getContentPane().add(btn2);
		
		JButton btn0 = new JButton("0");
		btn0.setEnabled(false);
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn0.setBounds(103, 579, 161, 70);
		frame.getContentPane().add(btn0);
		
		JButton btnCos = new JButton("Cos");
		btnCos.setEnabled(false);
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double a =Math.cos(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnCos.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnCos.setBounds(265, 163, 80, 70);
		frame.getContentPane().add(btnCos);
		
		JButton btnNewButton_1_3 = new JButton("Cosh");
		btnNewButton_1_3.setEnabled(false);
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double a =Math.cosh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton_1_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1_3.setBounds(265, 232, 80, 70);
		frame.getContentPane().add(btnNewButton_1_3);
		
		JButton btnBackSpace = new JButton("\uF0E7");
		btnBackSpace.setEnabled(false);
		btnBackSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String backSpace = null;
			
			if(textField.getText().length()>0)
			{
				StringBuilder str=new StringBuilder(textField.getText());
				str.deleteCharAt(textField.getText().length()-1);
				backSpace = str.toString();
				textField.setText(backSpace);
			}
			}
		});
		btnBackSpace.setFont(new Font("Wingdings", Font.PLAIN, 25));
		btnBackSpace.setBounds(265, 301, 80, 70);
		frame.getContentPane().add(btnBackSpace);
		
		JButton btn9 = new JButton("9");
		btn9.setEnabled(false);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn9.setBounds(265, 370, 80, 70);
		frame.getContentPane().add(btn9);
		
		JButton btn6 = new JButton("6");
		btn6.setEnabled(false);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn6.setBounds(265, 438, 80, 70);
		frame.getContentPane().add(btn6);
		
		JButton btn3 = new JButton("3");
		btn3.setEnabled(false);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn3.setBounds(265, 508, 80, 70);
		frame.getContentPane().add(btn3);
		
		JButton btnDot = new JButton(".");
		btnDot.setEnabled(false);
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnDot.setBounds(265, 579, 80, 70);
		frame.getContentPane().add(btnDot);
		
		JButton btnTan = new JButton("Tan");
		btnTan.setEnabled(false);
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double a =Math.tan(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnTan.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnTan.setBounds(346, 163, 80, 70);
		frame.getContentPane().add(btnTan);
		
		JButton btnNewButton_1_4 = new JButton("Tanh");
		btnNewButton_1_4.setEnabled(false);
		btnNewButton_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double a =Math.tanh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton_1_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1_4.setBounds(346, 232, 80, 70);
		frame.getContentPane().add(btnNewButton_1_4);
		
		JButton btnAdd = new JButton("+");
		btnAdd.setEnabled(false);
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first =Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";
			}
		});
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnAdd.setBounds(346, 301, 80, 70);
		frame.getContentPane().add(btnAdd);
		
		JButton btnSub = new JButton("-");
		btnSub.setEnabled(false);
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first =Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
			}
		});
		btnSub.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnSub.setBounds(346, 370, 80, 70);
		frame.getContentPane().add(btnSub);
		
		JButton btnMul = new JButton("*");
		btnMul.setEnabled(false);
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first =Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";
			}
		});
		btnMul.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnMul.setBounds(346, 438, 80, 70);
		frame.getContentPane().add(btnMul);
		
		JButton btnDivide = new JButton("/");
		btnDivide.setEnabled(false);
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first =Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";
			}
		});
		btnDivide.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnDivide.setBounds(346, 508, 80, 70);
		frame.getContentPane().add(btnDivide);
		
		JButton btnEqual = new JButton("=");
		btnEqual.setEnabled(false);
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				second=Double.parseDouble(textField.getText());
				if(operation=="+")
				{
					result=first+second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="-")
				{
					result=first-second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="*")
				{
					result=first*second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="/")
				{
					result=first/second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="%")
				{
					result=first%second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="X^Y")
				{
					double resultt=1;
					for(int i=0;i<second;i++)
					{
						resultt=first*resultt;
					}
					
					answer=String.format("%.2f", resultt);
					textField.setText(answer);	
				}
			}
		});
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnEqual.setBounds(346, 579, 80, 70);
		frame.getContentPane().add(btnEqual);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("ON");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn1.setEnabled(true);
				btn2.setEnabled(true);
				btn3.setEnabled(true);
				btn4.setEnabled(true);
				btn5.setEnabled(true);
				btn6.setEnabled(true);
				btn7.setEnabled(true);
				btn8.setEnabled(true);
				btn9.setEnabled(true);
				btn0.setEnabled(true);
				btnAdd.setEnabled(true);
				btnDot.setEnabled(true);
				btnSub.setEnabled(true);
				btnDivide.setEnabled(true);
				btnMul.setEnabled(true);
				btnSub.setEnabled(true);
				btnEx.setEnabled(true);
				btnSin.setEnabled(true);
				btnCos.setEnabled(true);
				btnTan.setEnabled(true);
				btnPlusMinus.setEnabled(true);
				btnXy.setEnabled(true);
				btnPercentage.setEnabled(true);
				btnEqual.setEnabled(true);
				btnBackSpace.setEnabled(true);
				btnClear.setEnabled(true);
				btnNewButton.setEnabled(true);
				btnNewButton_1.setEnabled(true);
				btnNewButton_3.setEnabled(true);
				btnNewButton_4.setEnabled(true);
				btnNewButton_5.setEnabled(true);
				btnNewButton_1_1.setEnabled(true);
				btnNewButton_1_2.setEnabled(true);
				btnNewButton_1_3.setEnabled(true);
				btnNewButton_1_4.setEnabled(true);
				textField.setEnabled(true);
			}
		});
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnNewRadioButton.setBounds(20, 146, 80, 21);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("OFF");
		rdbtnNewRadioButton_1.setSelected(true);
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				
				btn1.setEnabled(false);
				btn2.setEnabled(false);
				btn3.setEnabled(false);
				btn4.setEnabled(false);
				btn5.setEnabled(false);
				btn6.setEnabled(false);
				btn7.setEnabled(false);
				btn8.setEnabled(false);
				btn9.setEnabled(false);
				btn0.setEnabled(false);
				btnAdd.setEnabled(false);
				btnDot.setEnabled(false);
				btnSub.setEnabled(false);
				btnDivide.setEnabled(false);
				btnMul.setEnabled(false);
				btnSub.setEnabled(false);
				btnEx.setEnabled(false);
				btnSin.setEnabled(false);
				btnCos.setEnabled(false);
				btnTan.setEnabled(false);
				btnPlusMinus.setEnabled(false);
				btnXy.setEnabled(false);
				btnPercentage.setEnabled(false);
				btnEqual.setEnabled(false);
				btnBackSpace.setEnabled(false);
				btnClear.setEnabled(false);
				btnNewButton.setEnabled(false);
				btnNewButton_1.setEnabled(false);
				btnNewButton_3.setEnabled(false);
				btnNewButton_4.setEnabled(false);
				btnNewButton_5.setEnabled(false);
				btnNewButton_1_1.setEnabled(false);
				btnNewButton_1_2.setEnabled(false);
				btnNewButton_1_3.setEnabled(false);
				btnNewButton_1_4.setEnabled(false);
				textField.setEnabled(false);
				
			}
		});
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnNewRadioButton_1.setBounds(106, 146, 103, 21);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
	}
}
