package src.co.edu.uptc.view;

import java.awt.BorderLayout;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

import javax.swing.JFrame;

public class MainView extends JFrame{
    public HeaderPanel headerPanel;
    private NewPanel newPanel;
    private WorkPanel workPanel;
    private FooterPanel statusPanel;
    private MenuPanel menuPanel;
    
    public MainView(){
        initFrame();
        createHeaderPanel();
        createMenuPanel();
        createStatusPanel();
        createWorkPanel();
        createNewPanel();
        createMenuHeader();
        newSize();
    }

    private void initFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Taller de programacion");
        this.setLayout(new BorderLayout());
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
    }

    public void begin(){
        this.setVisible(true);
    }

    private void createMenuPanel(){
        menuPanel= new MenuPanel();
        this.add(menuPanel,BorderLayout.WEST);
    }

    private void createStatusPanel(){
        statusPanel= new FooterPanel();
        this.add(statusPanel,BorderLayout.SOUTH);
    }

    private void createWorkPanel(){
        workPanel= new WorkPanel();
        this.add(workPanel,BorderLayout.CENTER);
    }

    private void createNewPanel(){
        newPanel= new NewPanel();
        this.add(newPanel,BorderLayout.EAST);
    }

    private void createHeaderPanel(){
        headerPanel= new HeaderPanel();
        this.add(headerPanel,BorderLayout.NORTH);
    }

    private void createMenuHeader(){
        MenuHeader menuHeader= new MenuHeader(this);
        this.setJMenuBar(menuHeader);
    }


    private void newSize(){
        addComponentListener(new ComponentAdapter(){
            @Override
            public void componentResized(ComponentEvent e){
                headerPanel.centerElements();
                newPanel.centerElements();
                workPanel.centerElements();
                statusPanel.centerElements();
                menuPanel.centerElements();
            }
        } );
        
    }

}
