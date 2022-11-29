
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Starting extends JFrame implements ActionListener
{
	Label title = new Label("UIC Students Details System");
	//Label title2 =new Label("OWNER");
	Button logino= new Button("Admin Login");
	Button logine= new Button("Student Login");
	Button Exist= new Button("Exit");
	
	
	Label dev = new Label("University of Illinois at Chicago");
	Starting()
	{
		setSize(750,680); 
		setLocation(400,160);
		setTitle("University of Illinois at Chicago Students Details System");
		JLabel label = new JLabel();
		setContentPane(label);
		getContentPane().setLayout(null);
		setBackground(Color.RED);
		title.setBounds(180,50,380,40);
		title.setAlignment(Label.CENTER);
		title.setFont(new Font("Serif", Font.BOLD, 30));
		getContentPane().add(title);
		dev.setBackground(Color.RED);
		dev.setAlignment(Label.CENTER);
//		title2.setBounds(300,110,150,40);
//		title2.setFont(new Font("Serif", Font.BOLD, 30));
//		add(title2);
		
		dev.setBounds(150, 560, 400, 30);
		dev.setFont(new Font("Serif", Font.BOLD, 20));
		getContentPane().add(dev);
		
		
		
		logino.setBounds(250,200,200,60);
		getContentPane().add(logino);
		logino.setBackground(Color.BLUE);
		logino.setForeground(Color.WHITE);
		logino.addActionListener(this);

		logine.setBounds(250,300,200,60);
		getContentPane().add(logine);
		logine.setBackground(Color.BLUE);
		logine.setForeground(Color.WHITE);
		logine.addActionListener(this);

		Exist.setBounds(250,400,200,60);
		getContentPane().add(Exist);
		Exist.setBackground(Color.BLUE);
		Exist.setForeground(Color.WHITE);
		Exist.addActionListener(this);

	}

	public void actionPerformed(ActionEvent e)
	{
		if(e.getActionCommand()=="Admin Login")
		{   
			LoginAdmin lo=new LoginAdmin();
			lo.setLocationRelativeTo(null);
			lo.setVisible(true);
			dispose();
			//setVisible(false);
		}


		if(e.getActionCommand()=="Student Login")
		{
			LoginUser le=new LoginUser();
			le.setLocationRelativeTo(null);
			le.setVisible(true);
			dispose();
			//setVisible(false);
		
		
		}
		if(e.getActionCommand()=="Exit")
		{
			System.exit(0);
		}
	}

	
	public static void main(String args[])
	{
		Starting s= new Starting();
		s.setLocationRelativeTo(null);
		s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		s.setVisible(true);
	}
}

