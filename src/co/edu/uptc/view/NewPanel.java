package src.co.edu.uptc.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NewPanel extends JPanel {
    
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.cyan);
        int x= getWidth()/2- getWidth()/2;
        int y= getHeight()/2-getHeight()/2;
        g.fillOval(x, y, getWidth(), getHeight());
    }

    public NewPanel(){
        initPanel();
    }

    private void initPanel(){
        this.setBackground(Global.NEWS_BACKGROUND_COLOR);
        this.setForeground(Global.NEWS_TEXT_COLOR);
        this.setBorder(BorderFactory.createMatteBorder(0, 1,0,0, Color.black));
        this.setPreferredSize(new Dimension(200,0));
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
