import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class E4 extends JFrame implements ActionListener {
    private final JTextField txtName;
    private final JTextField txtEmail;
    private final JPasswordField txtPassword;
    private final JRadioButton rbMale;
    private final JRadioButton rbFemale;
    private final JCheckBox cbJava;
    private final JCheckBox cbPython;
    private final JCheckBox cbCpp;

    public E4() {
        setTitle("User Registration");
        setSize(400, 350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;


        gbc.gridx = 0; gbc.gridy = 0;
        panel.add(new JLabel("Name:"), gbc);
        gbc.gridx = 1;
        txtName = new JTextField(20);
        panel.add(txtName, gbc);


        gbc.gridx = 0; gbc.gridy = 1;
        panel.add(new JLabel("Email:"), gbc);
        gbc.gridx = 1;
        txtEmail = new JTextField(20);
        panel.add(txtEmail, gbc);


        gbc.gridx = 0; gbc.gridy = 2;
        panel.add(new JLabel("Password:"), gbc);
        gbc.gridx = 1;
        txtPassword = new JPasswordField(20);
        panel.add(txtPassword, gbc);


        gbc.gridx = 0; gbc.gridy = 3;
        panel.add(new JLabel("Gender:"), gbc);
        gbc.gridx = 1;
        rbMale = new JRadioButton("Male");
        rbFemale = new JRadioButton("Female");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(rbMale);
        genderGroup.add(rbFemale);
        JPanel genderPanel = new JPanel();
        genderPanel.add(rbMale);
        genderPanel.add(rbFemale);
        panel.add(genderPanel, gbc);


        gbc.gridx = 0; gbc.gridy = 4;
        panel.add(new JLabel("Interests:"), gbc);
        gbc.gridx = 1;
        cbJava = new JCheckBox("Java");
        cbPython = new JCheckBox("Python");
        cbCpp = new JCheckBox("C++");
        JPanel interestPanel = new JPanel();
        interestPanel.add(cbJava);
        interestPanel.add(cbPython);
        interestPanel.add(cbCpp);
        panel.add(interestPanel, gbc);


        gbc.gridx = 1; gbc.gridy = 5;
        gbc.anchor = GridBagConstraints.CENTER;
        JButton btnSubmit = new JButton("Submit");
        btnSubmit.addActionListener(this);
        panel.add(btnSubmit, gbc);

        add(panel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String name = txtName.getText().trim();
        String email = txtEmail.getText().trim();
        String password = new String(txtPassword.getPassword());
        String gender = rbMale.isSelected() ? "Male" : rbFemale.isSelected() ? "Female" : "Unspecified";
        String interests = "";
        if (cbJava.isSelected()) interests += "Java ";
        if (cbPython.isSelected()) interests += "Python ";
        if (cbCpp.isSelected()) interests += "C++ ";

        JOptionPane.showMessageDialog(this,
                "Name: " + name + "\n" +
                        "Email: " + email + "\n" +
                        "Gender: " + gender + "\n" +
                        "Interests: " + interests,
                "Registration Details", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new E4().setVisible(true));
    }
}
