package src.co.edu.uptc.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MenuPanel extends JPanel{
    
    public MenuPanel(){
        initPanel();
        createBtnSize();
    }

    private void initPanel(){
        this.setBackground(Global.MENU_BACKGROUND_COLOR);
        this.setForeground(Global.MENU_TEXT_COLOR);
        this.setBorder(BorderFactory.createMatteBorder(0, 0,0,1, Color.black));
        this.setPreferredSize(new Dimension(200,0));
    }


    private void createBtnSize(){
        JButton btnSize= new JButton("Size");
        this.add(btnSize);
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
}
