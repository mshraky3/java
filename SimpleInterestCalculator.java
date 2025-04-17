import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleInterestCalculator {

    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("Simple Interest Calculator");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridBagLayout()); // Use GridBagLayout for better control
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);  // Add padding
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Font settings
        Font labelFont = new Font("Consolas", Font.BOLD, 20);
        Font textFieldFont = new Font("Arial Narrow", Font.BOLD + Font.ITALIC, 15);
        Font buttonFont = new Font("Arial Black", Font.PLAIN, 10);

        // Create labels
        JLabel principalLabel = new JLabel("Principal Amount:");
        principalLabel.setFont(labelFont);
        principalLabel.setForeground(Color.GREEN);

        JLabel yearsLabel = new JLabel("Number of Years:");
        yearsLabel.setFont(labelFont);
        yearsLabel.setForeground(Color.GREEN);

        JLabel rateLabel = new JLabel("Rate of Interest:");
        rateLabel.setFont(labelFont);
        rateLabel.setForeground(Color.GREEN);

        JLabel interestLabel = new JLabel("Simple Interest:");
        interestLabel.setFont(labelFont);
        interestLabel.setForeground(Color.GREEN);

        // Create text fields
        JTextField principalField = new JTextField();
        principalField.setFont(textFieldFont);
        principalField.setForeground(Color.RED);

        JTextField yearsField = new JTextField();
        yearsField.setFont(textFieldFont);
        yearsField.setForeground(Color.RED);

        JTextField rateField = new JTextField();
        rateField.setFont(textFieldFont);
        rateField.setForeground(Color.RED);

        JTextField interestField = new JTextField();
        interestField.setFont(textFieldFont);
        interestField.setForeground(Color.RED);
        interestField.setEditable(false);  // Make it read-only

        // Create buttons
        JButton calculateButton = new JButton("SimpleInterest");
        calculateButton.setFont(buttonFont);
        calculateButton.setForeground(Color.PINK);

        JButton clearButton = new JButton("Clear");
        clearButton.setFont(buttonFont);
        clearButton.setForeground(Color.PINK);

        // Add components to the frame using GridBagConstraints
        gbc.gridx = 0;
        gbc.gridy = 0;
        frame.add(principalLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        frame.add(principalField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        frame.add(yearsLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        frame.add(yearsField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        frame.add(rateLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        frame.add(rateField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        frame.add(interestLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;
        frame.add(interestField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 2; // Span both columns
        frame.add(calculateButton, gbc);

        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        frame.add(clearButton, gbc);

        // Add action listeners to the buttons
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double principal = Double.parseDouble(principalField.getText());
                    double years = Double.parseDouble(yearsField.getText());
                    double rate = Double.parseDouble(rateField.getText());
                    double interest = (principal * years * rate) / 100;
                    interestField.setText(String.valueOf(interest));
                } catch (NumberFormatException ex) {
                    interestField.setText("Invalid input");
                }
            }
        });

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                principalField.setText("");
                yearsField.setText("");
                rateField.setText("");
                interestField.setText("");
            }
        });

        frame.setVisible(true);
    }
}
