import java.awt.*;  
import java.awt.event.*;  
import javax.swing.*;
public class ButtonColor extends Frame implements ActionListener{  
  
  
	JFrame win = new JFrame("Dani");
    Button red,green,blue,orange,yellow,pink,white,black,gray;  
    ButtonColor(){  
		
        red=new Button("RED");  
        red.setBounds(200,50,100,50);  
		
        green=new Button("GREEN");  
        green.setBounds(200,100,100,50);

		blue=new Button("BLUE");  
        blue.setBounds(200,150,100,50);

		orange=new Button("ORANGE");  
        orange.setBounds(200,200,100,50);

		yellow=new Button("YELLOW");  
        yellow.setBounds(200,250,100,50);
		
		pink=new Button("PINK");  
        pink.setBounds(200,300,100,50); 
		
        white=new Button("WHITE");  
        white.setBounds(200,350,100,50); 

        black=new Button("BLACK");  
        black.setBounds(200,400,100,50); 

        gray=new Button("GRAY");  
        gray.setBounds(200,450,100,50); 
		
        red.addActionListener(this);  
        green.addActionListener(this); 
		blue.addActionListener(this);
		orange.addActionListener(this);
		yellow.addActionListener(this);
        pink.addActionListener(this); 
        white.addActionListener(this); 
        black.addActionListener(this); 
        gray.addActionListener(this); 		
		
        add(red);add(green);add(blue);add(orange);add(yellow);add(pink);add(white);add(black);add(gray);		
        setSize(500,500);  
        setLayout(null);  
        setVisible(true);  
		show();
		
    }         
    public void actionPerformed(ActionEvent e) {  

        if(e.getSource()==red){  
            red.setBackground(Color.red); 
			//red.setBackground(new JButton().getBackground());
        }if(e.getSource()==green){  
            green.setBackground(Color.green);  
        }if(e.getSource()==blue){
			blue.setBackground(Color.blue);
		}if(e.getSource()==orange){
			orange.setBackground(Color.orange);
		}if(e.getSource()==yellow){
			yellow.setBackground(Color.yellow);
		}if(e.getSource()==pink){
			pink.setBackground(Color.pink);
		}if(e.getSource()==white){
			white.setBackground(Color.white);
		}if(e.getSource()==black){
			black.setBackground(Color.black);
		}if(e.getSource()==gray){
			gray.setBackground(Color.gray);
		}
			
    }  
public static void main(String[] args) {  
    new ButtonColor();  
}  
}  