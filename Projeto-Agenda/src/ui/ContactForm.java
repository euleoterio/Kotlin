package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ContactForm extends JFrame {


    private JPanel rootPanel;
    private JTextField textName;
    private JTextField textPhone;
    private JButton buttonSave;
    private JButton buttonCancel;

    public ContactForm(){

        //JavaSwing
        setContentPane(rootPanel); //seta que a rootPane é a janela
        setSize(500,250); //define tamanho da janela
        setVisible(true); //habilita janela

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize(); //pega tamanho do monitor
        setLocation(dim.width/2 - getSize().width/2, dim.height/2 - getSize().height/2); //localiza no meio


        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setListeners();

    }

    private void setListeners(){

        buttonSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        buttonCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MainForm();
                dispose();
            }
        });
    }
}
