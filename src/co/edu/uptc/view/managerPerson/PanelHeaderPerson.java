package src.co.edu.uptc.view.managerPerson;


import javax.swing.JLabel;
import javax.swing.JPanel;

import src.co.edu.uptc.view.Global;

public class PanelHeaderPerson extends JPanel{
    
    public PanelHeaderPerson(){
        initPanel();
        createLbn();
    }

    private void initPanel(){
        this.setBackground(Global.HEADER_BACKGROUND_COLOR);
        this.setForeground(Global.HEADER_TEXT_COLOR);
    }

    private void createLbn(){
        JLabel title= new JLabel("Manejador de persona");
        title.setBounds(20, 10, 400, 30);
        title.setForeground(this.getForeground());
        add(title);
    }
}
