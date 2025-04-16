import javax.swing.*;
import java.awt.*;

public class lab_9 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Show Flow Layout");
        frame.setSize(80, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       
        frame.setLayout(new FlowLayout());

        JLabel firstNameLabel = new JLabel("First Name:" );
        JTextField firstNameField = new JTextField(30);

        JLabel miLabel = new JLabel("MI:");
        JTextField mifield = new JTextField(10); 


        JLabel lastNameLabel = new JLabel("Last Name:");
        JTextField lastNameField = new JTextField(30);



  
        frame.add(firstNameLabel);
        frame.add(firstNameField);
        frame.add(miLabel);
        frame.add(mifield);
        frame.add(lastNameLabel);
        frame.add(lastNameField);

        // Step 4: Make the frame visible
        frame.setVisible(true);
    }
}