import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPage {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Jubail University College");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        frame.getContentPane().setBackground(new Color(240, 240, 240));

        JLabel userNameLabel = new JLabel("User Name :");
        JTextField userNameField = new JTextField(15);
        userNameField.setText("aaa");

        JLabel passwordLabel = new JLabel("Password :");
        JPasswordField passwordField = new JPasswordField(15);
        passwordField.setText("******");

        JPanel inputPanel = new JPanel(new GridLayout(2, 2, 5, 5));
        inputPanel.add(userNameLabel);
        inputPanel.add(userNameField);
        inputPanel.add(passwordLabel);
        inputPanel.add(passwordField);
        inputPanel.setPreferredSize(new Dimension(280, 60));

        JButton submitButton = new JButton("Submit");
        JButton clearButton = new JButton("Clear");

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        buttonPanel.add(submitButton);
        buttonPanel.add(clearButton);

        JLabel messageLabel = new JLabel("Message:");

        frame.add(inputPanel);
        frame.add(buttonPanel);
        frame.add(messageLabel);

        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = userNameField.getText();
                String password = new String(passwordField.getPassword());
                if (username.equals("name") && password.equals("123456789")) {
                    messageLabel.setText("You are logged in Successfully");
                } else {
                    messageLabel.setText("Sorry!! Check your username and password");
                }
            }
        });

        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                userNameField.setText("");
                passwordField.setText("");
                messageLabel.setText("");
            }
        });

        frame.setVisible(true);
    }
}