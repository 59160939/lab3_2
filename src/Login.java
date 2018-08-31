import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {
    private JTextField textUserLogin;
    private JPasswordField pwdUserPassword;
    private JButton btnSubmit;
    private JButton btnClear;
    private JPanel mainPanel;
    private JPanel mainplanel;

    public Login() {
        btnSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,textUserLogin.getText()
                        +" "+ new String (pwdUserPassword.getPassword()) );
            }
        });
    }

    public JPanel getMainPanel() {
        return mainplanel;
    }
}
