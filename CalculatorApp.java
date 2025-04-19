import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculatorApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setSize(400, 250); // Adjusted size to better match image
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 10, 5, 10); // Add some padding around components
        gbc.fill = GridBagConstraints.HORIZONTAL; // Make components fill horizontal space
        // Font settings
        Font labelFont = new Font("Arial Narrow", Font.BOLD, 18); // Slightly smaller font
        Font textFieldFont = new Font("Arial Narrow", Font.BOLD + Font.ITALIC, 18);
        Font buttonFont = new Font("Bell MT", Font.BOLD, 12); 
        JLabel firstNumLabel = new JLabel("Enter First Number:");
        firstNumLabel.setFont(labelFont);
        firstNumLabel.setForeground(Color.BLUE);

        JLabel secondNumLabel = new JLabel("Enter Second Number:");
        secondNumLabel.setFont(labelFont);
        secondNumLabel.setForeground(Color.BLUE);

        JLabel resultLabel = new JLabel("Result:");
        resultLabel.setFont(labelFont);
        resultLabel.setForeground(Color.BLUE);

        JTextField firstNumField = new JTextField();
        firstNumField.setFont(textFieldFont);
        firstNumField.setForeground(Color.GREEN);

        JTextField secondNumField = new JTextField();
        secondNumField.setFont(textFieldFont);
        secondNumField.setForeground(Color.GREEN);

        JTextField resultField = new JTextField();
        resultField.setFont(textFieldFont);
        resultField.setForeground(Color.GREEN);
        resultField.setEditable(false); // Make result field read-only
        JButton addButton = new JButton("Add");
        addButton.setFont(buttonFont);
        addButton.setForeground(Color.GRAY);

        JButton subtractButton = new JButton("Subtract");
        subtractButton.setFont(buttonFont);
        subtractButton.setForeground(Color.GRAY);

        JButton clearButton = new JButton("Clear");
        clearButton.setFont(buttonFont);
        clearButton.setForeground(Color.GRAY);

        JButton exitButton = new JButton("Exit");
        exitButton.setFont(buttonFont);
        exitButton.setForeground(Color.GRAY);

        // Add components to the frame using GridBagConstraints
        gbc.gridx = 0;
        gbc.gridy = 0;
        frame.add(firstNumLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        frame.add(firstNumField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        frame.add(secondNumLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        frame.add(secondNumField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        frame.add(resultLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        frame.add(resultField, gbc);

        // Button Panel
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 15, 10)); // Increased spacing
        buttonPanel.add(addButton);
        buttonPanel.add(subtractButton);
        buttonPanel.add(clearButton);
        buttonPanel.add(exitButton);

        gbc.gridx = 0; // Set the grid position for the button panel
        gbc.gridy = 3;
        gbc.gridwidth = 2; // Span two columns
        frame.add(buttonPanel, gbc);
        // Add action listeners to the buttons
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(firstNumField.getText());
                    double num2 = Double.parseDouble(secondNumField.getText());
                    double result = num1 + num2;
                    resultField.setText(String.valueOf(result));
                } catch (NumberFormatException ex) {
                    resultField.setText("Invalid input");
                }
            }
        });
        subtractButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(firstNumField.getText());
                    double num2 = Double.parseDouble(secondNumField.getText());
                    double result = num1 - num2;
                    resultField.setText(String.valueOf(result));
                } catch (NumberFormatException ex) {
                    resultField.setText("Invalid input");
                }
            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstNumField.setText("");
                secondNumField.setText("");
                resultField.setText("");
            }
        });
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        // Make the frame visible
        frame.setVisible(true);
    }
}
