import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class E1 extends JFrame implements ActionListener {

    private JLabel counterLabel;
    private JButton clickButton;
    private int count = 0;

    public E1() {
        setTitle("Click Counter");
        counterLabel = new JLabel("Clicks: 0", SwingConstants.CENTER);
        clickButton = new JButton("Click Me");
        clickButton.addActionListener(this);

        setLayout(new BorderLayout());
        add(counterLabel, BorderLayout.CENTER);
        add(clickButton, BorderLayout.SOUTH);

        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        counterLabel.setText("Clicks: " + count);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            E1 app = new E1();
            app.setVisible(true);
        });
    }
}

