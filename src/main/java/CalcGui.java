import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcGui {
    private JTextField display;
    private JButton clearBtn;
    private JButton signBtn;
    private JButton percentBtn;
    private JButton divideBtn;
    private JButton sevenBtn;
    private JButton eightBtn;
    private JButton nineBtn;
    private JButton multiplyBtn;
    private JButton sixBtn;
    private JButton threeBtn;
    private JButton dotBtn;
    private JButton minusBtn;
    private JButton plusBtn;
    private JButton equalBtn;
    private JButton fiveBtn;
    private JButton twoBtn;
    private JButton fourBtn;
    private JButton oneBtn;
    private JButton zeroBtn;
    private JPanel calcPane;


    public CalcGui() {


        eightBtn.addActionListener(new Click(eightBtn.getText()));
        nineBtn.addActionListener(new Click(nineBtn.getText()));
        fourBtn.addActionListener(new Click(fourBtn.getText()));
        fiveBtn.addActionListener(new Click(fiveBtn.getText()));
        sixBtn.addActionListener(new Click(sixBtn.getText()));
        oneBtn.addActionListener(new Click(oneBtn.getText()));
        twoBtn.addActionListener(new Click(twoBtn.getText()));
        threeBtn.addActionListener(new Click(threeBtn.getText()));
        zeroBtn.addActionListener(new Click(zeroBtn.getText()));

    }

    private class Click implements ActionListener{
        private String value;
        private String results;

        public Click(String thing){
            this.value = thing;
        }
        @Override
        public void actionPerformed(ActionEvent e){
            display.setText(value);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new CalcGui().calcPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
