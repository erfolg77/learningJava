package java_graphic;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;

import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Lesson41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame mainFrame = new JFrame();
		JPanel mainPanel = new JPanel();
		mainPanel.setBackground(new Color(82, 235, 120));
		//mainPanel.setSize(400,400);
		//mainPanel.setLocation(0,0);
		
		
		mainFrame.setTitle("Food order");
		mainFrame.setSize(400, 400);
	
		
		
		Font f1 = new Font("Arial", Font.PLAIN,21);
		//Burger label
		JLabel burgerLabel = new JLabel("Burger Count");
		burgerLabel.setFont(f1);
	
		burgerLabel.setLocation(120,280);
		burgerLabel.setSize(150, 24);
		
		
		//Field for BurgerCount
		JTextField burgerCount = new JTextField();
		burgerCount.setFont(f1);
		burgerCount.setSize(90,24);
		burgerCount.setLocation(260,280);
		
		//Button creation
		JButton button = new JButton("BUY");
		button.setFont(f1);
		button.setLocation(200, 320);
		button.setSize(100, 30);
		button.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ImageIcon burgerIcon = new ImageIcon("src/images/burger.png");
				Image resizeImage =  burgerIcon.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
				ImageIcon burgerScaled = new ImageIcon(resizeImage);
				
				//Delete old burger
				for(Component oneComponent: mainPanel.getComponents()) {
					if(oneComponent instanceof JLabel) {
						if(((JLabel)oneComponent).getText() != "Burger Count") {
							mainPanel.remove(oneComponent);
							mainFrame.revalidate();
						}
						
						
					}
				}
				
				try {
									
					int burgerInt = Integer.parseInt(burgerCount.getText());
					int distanceBetweenBurgers=0;
					int heightBetweenBurger=0;
					for(int i=1;i<=burgerInt; i++) {
						JLabel burgerImage = new JLabel(burgerScaled);
						
						burgerImage.setLocation(20 + distanceBetweenBurgers,20 + heightBetweenBurger);
						burgerImage.setSize(50,50);
						
						
						distanceBetweenBurgers +=70;
					
						mainPanel.add(burgerImage);
					
						if(i % 5==0 && i !=0) {
							distanceBetweenBurgers =0;
							heightBetweenBurger +=70;
						}
					}
				}catch (Exception err) {
					System.out.println("Input only number! " + err.toString());
					JLabel errorLabel = new JLabel("Wrong input!");
					errorLabel.setSize(200,100);
					errorLabel.setFont(f1);
					errorLabel.setForeground(Color.red);
					
					errorLabel.setLocation(0,300);
					
					mainPanel.add(errorLabel);
					
				}
				
				
				mainFrame.repaint();
				
				System.out.println(" :)");
			}
		});
		
		
		
		mainPanel.add(button);
		mainPanel.add(burgerCount);
		mainPanel.add(burgerLabel);
		
		mainPanel.setLayout(null);
		mainFrame.add(mainPanel);
		mainFrame.setResizable(false);
		mainFrame.setVisible(true);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
