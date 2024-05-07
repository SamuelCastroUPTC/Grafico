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

public class FooterPanel extends JPanel{
    
    public FooterPanel(){
        initPanel();
    }

    private void initPanel(){
        this.setBackground(Global.FOOTER_BACKGROUND_COLOR);
        this.setForeground(Global.FOOTER_TEXT_COLOR);
        this.setPreferredSize(new Dimension(0,30));
        this.setBorder(BorderFactory.createMatteBorder(1, 0,0,0, Color.black));
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
