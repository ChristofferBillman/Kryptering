import javax.swing.*;

public class GUIForm {
    private JPanel panel1;
    private JButton decryptFileButton;
    private JTextField textField1;
    private JButton encryptFileButton;
    private JButton pickFileButton;

    public static void main(String[] args) {
        JFrame frame = new JFrame("GUIForm");
        frame.setContentPane(new GUIForm().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
