import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class E3 extends JFrame implements ActionListener {
    private JPanel panel;
    private JButton redButton;
    private JButton greenButton;
    private JButton blueButton;

    public E3() {
        setTitle("Theme Color Selector");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        redButton = new JButton("Red");
        greenButton = new JButton("Green");
        blueButton = new JButton("Blue");

        redButton.setActionCommand("red");
        greenButton.setActionCommand("green");
        blueButton.setActionCommand("blue");

        redButton.addActionListener(this);
        greenButton.addActionListener(this);
        blueButton.addActionListener(this);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(redButton);
        buttonPanel.add(greenButton);
        buttonPanel.add(blueButton);

        setLayout(new BorderLayout());
        add(buttonPanel, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);

        setSize(500, 400);
        setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "red":
                panel.setBackground(Color.RED);
                break;
            case "green":
                panel.setBackground(Color.GREEN);
                break;
            case "blue":
                panel.setBackground(Color.BLUE);
                break;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new E3().setVisible(true));
    }
}
