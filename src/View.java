import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class View {
    private JPanel panel1;
    private JButton decryptFileButton;
    private JTextField keyInput;
    private JButton encryptFileButton;
    private JButton pickFileEncryptButton;
    private JButton pickFileDecryptButton;
    private JTextField keyInputDecrypt;

    public View() {
        //Evenlisteners.
        final JFileChooser fc = new JFileChooser();
        String filename = "";
        String dir = "";

        pickFileEncryptButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int returnVal = fc.showOpenDialog(pickFileEncryptButton);
                if (returnVal == JFileChooser.APPROVE_OPTION) {
                    File file = fc.getSelectedFile();
                    System.out.println(file);
                } else {
                    System.out.println("Open command cancelled by user.");
                }
            }
        });
        pickFileDecryptButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int returnVal = fc.showOpenDialog(pickFileEncryptButton);
                if (returnVal == JFileChooser.APPROVE_OPTION) {
                    File file = fc.getSelectedFile();
                } else {
                    System.out.println("Open command cancelled by user.");
                }
            }
        });
        /*
        encryptFileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int rVal = fc.showSaveDialog(View.fc);
                if (rVal == JFileChooser.APPROVE_OPTION) {
                    filename.setText(fc.getSelectedFile().getName());
                    dir.setText(fc.getCurrentDirectory().toString());
            }
        });*/
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("View");
        frame.setContentPane(new View().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
