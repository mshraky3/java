import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColorPanel {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Color Panel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        JPanel colorPanel = new JPanel();
        colorPanel.setBackground(Color.WHITE);
        colorPanel.setPreferredSize(new Dimension(400, 300));
        JButton greenButton = new JButton("Green");  JButton redButton = new JButton("Red");  JButton blueButton = new JButton("Blue");
        greenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                colorPanel.setBackground(Color.GREEN);
            }
        });
        blueButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                colorPanel.setBackground(Color.BLUE);
            }
        });
        redButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                colorPanel.setBackground(Color.RED);
            }
        });
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());
        buttonPanel.add(greenButton); buttonPanel.add(redButton);  buttonPanel.add(blueButton);
        frame.getContentPane().add(buttonPanel, BorderLayout.NORTH);
        frame.getContentPane().add(colorPanel, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}