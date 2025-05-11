import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class E2 extends JFrame implements ActionListener {


    private JTextField nameField;
    private JButton greetButton;
    private JLabel messageLabel;


    public E2() {
        setTitle("Greeting Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        nameField = new JTextField(15);
        greetButton = new JButton("Greet");
        messageLabel = new JLabel("Enter your name and press Greet.", SwingConstants.CENTER);

        greetButton.addActionListener(this);


        JPanel inputPanel = new JPanel();
        inputPanel.add(new JLabel("Name:"));
        inputPanel.add(nameField);
        inputPanel.add(greetButton);


        setLayout(new BorderLayout());
        add(inputPanel, BorderLayout.NORTH);
        add(messageLabel, BorderLayout.CENTER);

        setSize(350, 150);
        setLocationRelativeTo(null);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String name = nameField.getText().trim();
        if (name.isEmpty()) {
            messageLabel.setText("Please enter a name.");
        } else {
            messageLabel.setText("Hello, " + name + "!");
        }
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new E2().setVisible(true));
    }
}
