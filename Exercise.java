import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;;




public class Exercise {
    public static void main(String[] args) {
        JFrame frame = new  JFrame("swing program ");
        frame.setSize(500 , 300);
        frame.setLayout(new FlowLayout());
        JLabel lable = new  JLabel("Click the button to change the background color");
        JButton buttonBLUE = new JButton( "BLUE"); 
        JButton buttonRED = new JButton( "RED"); 



        frame.add(lable);
        frame.add(buttonRED);
        frame.add(buttonBLUE);
        

        buttonRED.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                frame.getContentPane().setBackground(Color.RED);
                
            }
        });
        
        buttonBLUE.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                frame.getContentPane().setBackground(Color.BLUE);
                
            }
        });

        frame.setVisible(true);

    }
}