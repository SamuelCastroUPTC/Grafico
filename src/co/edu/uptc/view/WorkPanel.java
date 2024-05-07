package src.co.edu.uptc.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class WorkPanel extends JPanel{
    
    private JLabel lblName;

    public WorkPanel(){
        initPanel();
        createLbnName();
        createBtnChangeLbn();
    }

    private void initPanel(){
        this.setBackground(Global.WORK_BACKGROUND_COLOR);
        this.setForeground(Global.WORK_TEXT_COLOR);
        this.setLayout(null);
        this.setBorder(BorderFactory.createMatteBorder(1, 1,1,1, Color.black));
        this.setPreferredSize(new Dimension(200,0));
    }

    private void createLbnName(){
        lblName= new JLabel("Samuel Castro Polania");
        lblName.setBounds(10, 20, 200, 30);
        lblName.setForeground(Global.WORK_TEXT_COLOR);
        add(lblName);
    }

    public void centerElements(){
        Object[] components= this.getComponents();
        for (Object component : components) {
            if (component instanceof JComponent) {
                if (component instanceof JButton) {
                    centerElement((JComponent)component, ((JButton)component).getText());
                }else{
                    centerElement((JComponent)component, ((JLabel)component).getText());
                }
            }
            
        }
    }

    private void centerElement(JComponent element, String text){
        
        Font font= element.getFont();
            FontMetrics metric= this.getGraphics().getFontMetrics(font);
            int width= metric.stringWidth(text);
            int x= ((this.getSize().width/2)-(width/2));
            element.setLocation(x, element.getY());
    }

    private void createBtnChangeLbn(){
        JButton btnSize= new JButton("Size");
        btnSize.setBounds(20, 80, 60, 30);
        this.add(btnSize);
        btnSize.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                lblName.setText("Hola darkpid");
                centerElement(lblName,lblName.getText());
            }
            
        });
    }

}
