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


    private CalcGui() {
    // Number Buttons
        sevenBtn.addActionListener(new Click(sevenBtn.getText()));
        eightBtn.addActionListener(new Click(eightBtn.getText()));
        nineBtn.addActionListener(new Click(nineBtn.getText()));
        fourBtn.addActionListener(new Click(fourBtn.getText()));
        fiveBtn.addActionListener(new Click(fiveBtn.getText()));
        sixBtn.addActionListener(new Click(sixBtn.getText()));
        oneBtn.addActionListener(new Click(oneBtn.getText()));
        twoBtn.addActionListener(new Click(twoBtn.getText()));
        threeBtn.addActionListener(new Click(threeBtn.getText()));
        zeroBtn.addActionListener(new Click(zeroBtn.getText()));

    // Operator buttons
        minusBtn.addActionListener(new OperationBtn(minusBtn.getText()));
        plusBtn.addActionListener(new OperationBtn(plusBtn.getText()));
        multiplyBtn.addActionListener(new OperationBtn("*"));
        divideBtn.addActionListener(new OperationBtn(divideBtn.getText()));

    // Extra buttons
        clearBtn.addActionListener(new ClearBtn());
    }

// Action listener for Numbers

    private class Click implements ActionListener{
        private String value;

        public Click(String thing){
            this.value = thing;
        }
        @Override
        public void actionPerformed(ActionEvent e){
            if (display.getText().equals("0")){
                display.setText(value);
            } else {display.setText(display.getText() + value);}

        }
    }

// Action listener for Operation

    private class OperationBtn implements ActionListener{
        private String operator;
        private String results;

        public OperationBtn(String thing){
            this.operator  = thing;
        }
        @Override
        public void actionPerformed(ActionEvent e){
            results = display.getText() + operator;
            display.setText(results);
        }
    }

// Action listener for

    private class ClearBtn implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            display.setText("0");
        }
    }




//    private class signBtn implements ActionListener{
//        private String value = display.getText();
//        private int number;
//
//        if(JSType.isNumber(value)){
//           if(Integer.parseInt(value) < 0){
//               number = Integer.parseInt(value) + (2*Integer.parseInt(value));
//           } else {
//               number = Integer.parseInt(value) - (2*Integer.parseInt(value));
//           }
//           display.setText(number.toString());
//        }
//
//        @Override
//        public void actionPerformed(ActionEvent e){
//            display.setText("0");
//        }
//    }



    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new CalcGui().calcPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
