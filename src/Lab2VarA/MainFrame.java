package Lab2VarA;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {

    private static final int WIDTH = 400;
    private static final int HEIGHT = 420;

    private JTextField textFieldX;
    private JTextField textFieldY;

    private JTextField textFieldResult;

    private ButtonGroup radioButtons = new ButtonGroup();

    private Box hboxFormulaType = Box.createHorizontalBox();

    private int formulaID = 1;

    public Double calculate1(Double x, Double y)
    {
        return x * x + y * y;
    }

    public Double calculate2(Double x, Double y)
    {
        return x * x + 1 / y;
    }

    private void addRadioButton(String buttonName, final int formulaID)
    {
        JRadioButton button = new JRadioButton(buttonName);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainFrame.this.formulaID = formulaID;
                //imagePane.updateUI();
            }
        });
        radioButtons.add(button);
        hboxFormulaType.add(button);
    }

    public MainFrame()
    {
        super("Вычисление формулы");
        setSize(WIDTH, HEIGHT);
        Toolkit kit = Toolkit.getDefaultToolkit();
        setLocation((kit.getScreenSize().width - WIDTH) / 2,
                    (kit.getScreenSize().height - HEIGHT) / 2);
    }

    public static void main(String[] args)
    {
        MainFrame frame = new MainFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
