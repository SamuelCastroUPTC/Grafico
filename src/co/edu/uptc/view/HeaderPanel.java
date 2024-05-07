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

public class HeaderPanel  extends JPanel{
    
    private JLabel title1;
    private JLabel title2;
    private JLabel title3;
    private JButton btnSize;
    
    public HeaderPanel(){
        initPanel();
        createTitle();
        createBtnSize();
    }

    private void initPanel(){
        this.setBackground(Global.HEADER_BACKGROUND_COLOR);
        this.setForeground(Global.HEADER_TEXT_COLOR);
        this.setBorder(BorderFactory.createMatteBorder(0, 0,1,0, Color.black));
        this.setLayout(null);
        this.setPreferredSize(new Dimension(0,120));
    }

    private void createTitle(){
        title1= new JLabel("UNIVERSIDAD PEDAGOGICA Y TECNOLOGICA DE COLOMBIA");
        title1.setBounds(20, 10, 400, 30);
        title1.setForeground(this.getForeground());
        this.add(title1);
        
        title2= new JLabel("FACULTAD DE INGENIERIA");
        title2.setBounds(20, 30, 300, 30);
        title2.setForeground(this.getForeground());
        this.add(title2);

        title3= new JLabel("INGENIERIA DE SISTEMAS Y COMPUTACION");
        title3.setBounds(20, 50, 300, 30);
        title3.setForeground(this.getForeground());
        this.add(title3);
    }

    private void centerElement(JComponent element, String text){
        
        Font font= element.getFont();
            FontMetrics metric= this.getGraphics().getFontMetrics(font);
            int width= metric.stringWidth(text);
            int x= ((this.getSize().width/2)-(width/2));
            element.setLocation(x, element.getY());
    }

    private void createBtnSize(){
        btnSize= new JButton("Size");
        btnSize.setBounds(20, 80, 60, 30);
        this.add(btnSize);
        btnSize.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                centerElements();
            }
            
        });
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

    public String getTextTitle1(){
        return title1.getText();
    }
}
