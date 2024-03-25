import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.*;

public class login extends JFrame implements ActionListener {
    JButton loginButton, clearButton, signupButton;
    JTextField cardTextField; // Use JPasswordField if you need it to behave like the PIN field
    JPasswordField pinTextField;

    login() {
        setTitle("Microsecond Market");
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("logo1.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70, 10, 100, 100);
        add(label);

        JLabel text = new JLabel("Welcome to Microsecond Market");
        text.setBounds(200, 40, 650, 40);
        text.setFont(new Font("Osward", Font.BOLD, 30));
        add(text);

        JLabel cardno = new JLabel("Card Number:");
        cardno.setBounds(100, 150, 375, 30);
        cardno.setFont(new Font("Raleway", Font.BOLD, 30));
        add(cardno);

        cardTextField = new JTextField(); // Corrected, use JTextField or JPasswordField as per requirement
        cardTextField.setBounds(300, 150, 250, 30);
        add(cardTextField);

        JLabel pin = new JLabel("PIN:");
        pin.setBounds(100, 220, 375, 30);
        pin.setFont(new Font("Raleway", Font.BOLD, 30));
        add(pin);

        pinTextField = new JPasswordField();
        pinTextField.setBounds(300, 220, 250, 30);
        add(pinTextField);

        loginButton = new JButton("SIGN IN");
        loginButton.setBounds(300, 270, 100, 30);
        loginButton.setBackground(Color.BLACK);
        loginButton.setForeground(Color.WHITE);
        loginButton.addActionListener(this);
        add(loginButton);

        clearButton = new JButton("CLEAR");
        clearButton.setBounds(410, 270, 100, 30);
        clearButton.setBackground(Color.BLACK);
        clearButton.setForeground(Color.WHITE);
        clearButton.addActionListener(this);
        add(clearButton);

        signupButton = new JButton("SIGN UP");
        signupButton.setBounds(520, 270, 100, 30);
        signupButton.setBackground(Color.BLACK);
        signupButton.setForeground(Color.WHITE);
        signupButton.addActionListener(this);
        add(signupButton);

        getContentPane().setBackground(Color.WHITE);

        setSize(800, 400);
        setVisible(true);
        setLocation(350, 200);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == clearButton) {
            cardTextField.setText("");
            pinTextField.setText("");
        } else if (e.getSource() == loginButton) {
            // Implement login logic here
        } else if (e.getSource() == signupButton) {
            // Implement signup logic here
        }
    }

    public static void main(String[] args) {
        new login();
    }
}
