import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MotorPHEmployeeData {
    private JTextField textField2;
    private JTextField textField1;
    private JButton okayButton;








            public MotorPHEmployeeData() {
                okayButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JFrame f = new JFrame("Button Example");
                        final JTextField tf = new JTextField();
                        tf.setBounds(50, 50, 150, 20);
                        JButton b = new JButton("Click Here");
                        b.setBounds(50, 100, 95, 30);
                        b.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                tf.setText("Welcome to MotorPH.");
                            }
                        });
                        f.add(b);
                        f.add(tf);
                        f.setSize(400, 400);
                        f.setLayout(null);
                        f.setVisible(true);
                    }
                });
            }
}