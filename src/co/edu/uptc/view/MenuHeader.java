package src.co.edu.uptc.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import src.co.edu.uptc.view.managerMenu.ManagerMenu;

public class MenuHeader extends JMenuBar{
    
    public MainView mainViewFrame;

    private JMenu menuFile;
    
    public MenuHeader(MainView mainView){
        this.mainViewFrame=mainView;
        initMenu();
        createMenuFile();
        createBtnPerson();
        createBtnExit();
    }

    private void initMenu(){

    }

    private void createMenuFile(){
        menuFile= new JMenu("File");
        this.add(menuFile);
    }

    private void createBtnExit(){
        JMenuItem btnExit= new JMenuItem("Exit");
        btnExit.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
            
        });
        menuFile.add(btnExit);
    }

    private void createBtnPerson(){
        JMenuItem btnPerson= new JMenuItem("Person");
        btnPerson.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                createManagerDialog();
            }
            
        });
        menuFile.add(btnPerson);
    }

    private void createManagerDialog(){
        ManagerMenu managerMenu= new ManagerMenu(this);
        managerMenu.begin();
    }
    
}
