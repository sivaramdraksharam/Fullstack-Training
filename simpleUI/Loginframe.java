package simpleUI;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class Loginframe extends JFrame implements ActionListener{
	String msg;
	JButton signupButton;
	//constructor
	public Loginframe() {
	
	setTitle("Login form");
	setLayout(new FlowLayout());
	setBounds(10,10,350,500);
	
	//apply internationalization
	//create Locale object to store language name, country code
	Locale enLocale = new Locale("te", "IN"); 
	//create resource bundle to store labels as keys and their meanings in local language...
	 ResourceBundle bundle = ResourceBundle.getBundle("MessageBundle", enLocale);  
	
	//UI components 
	//create label for user name
	JLabel usernamelbl=new JLabel(bundle.getString("promptname"));
	//create text field for input user name
	JTextField usernametxt=new JTextField(30);
	//create password lable
	JLabel passwordlbl=new JLabel(bundle.getString("promptpassword"));
	JTextField passwordfld=new JPasswordField(8);
	
	 signupButton=new JButton(bundle.getString("dosignup"));
	
	add(usernamelbl);add(usernametxt);
	add(passwordlbl);add(passwordfld);
	add(signupButton);
	//register the listener to the source..
	signupButton.addActionListener(this);
	
	
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		
		
	if(ae.getActionCommand().equals("Sign Up"))
	{
		msg="clicked";
		signupButton.setText(msg);
	}
		
	}
	
	

}
