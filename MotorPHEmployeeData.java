import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MotorPHEmployeeData {
    private JTextField tfFullName;
    private JTextField tfAddress;
    private JButton okayButton;
    private JTextField tfEmail;
    private JTextField tfRateHours;
    private JTextField tfWorkingHours;
    private JTextField tfGrossRate;
    private JTextField tfEmployeeNumber;
    private JTextField tfPosition;
    private JTextField tfRiceSubcidy;
    private JTextField tfClothingAllowance;
    private JTextField tfNetPay;
    private JTextField tfSSS;
    private JTextField tfPagIbig;
    private JTextField tfPhilHealth;
    private JTextField tfIncomeTax;
    private JLabel fnDeduction;
    private JLabel fnSalary;
    private JLabel fnBenefits;
    private JLabel fnGrosspay;
    private JLabel fnWorkingHours;
    private JLabel fnRateHours;
    private JPanel fnEmail;
    private JLabel fnAddress;
    private JLabel fnFullName;
    private JLabel attendanceLabel;
    private JLabel fnEmployeeInformation;
    private JTextField tfPhoneAllowance;


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
                        tf.setText("MotorPh");
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