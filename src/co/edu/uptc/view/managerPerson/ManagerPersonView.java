package src.co.edu.uptc.view.managerPerson;

import java.awt.BorderLayout;

import javax.swing.JDialog;

import src.co.edu.uptc.view.managerMenu.ManagerMenu;


public class ManagerPersonView extends JDialog{

    public ManagerMenu managerMenuDialog;
    public PanelBodyPerson panelBodyPerson;

    private PanelHeaderPerson panelHeaderPerson;
    private PanelFooterPerson panelFooterPerson;

    public ManagerPersonView(ManagerMenu managerMenu){
        super(managerMenu.menuHeaderBar.mainViewFrame,true);
        this.managerMenuDialog=managerMenu;
        initJDialog();
        createPanelHeader();
        createPanelBody();
        createPanelFooter();
    }

    public void begin(){
        this.setVisible(true);
    }

    private void initJDialog(){
        this.setSize(500, 500);
        this.setLocationRelativeTo(managerMenuDialog.menuHeaderBar.mainViewFrame);
        this.setLayout(new BorderLayout());
    }

    private void createPanelHeader(){
        panelHeaderPerson= new PanelHeaderPerson();
        this.add(panelHeaderPerson, BorderLayout.NORTH);
    }

    private void createPanelBody(){
        panelBodyPerson= new PanelBodyPerson();
        this.add(panelBodyPerson,BorderLayout.CENTER);
    }

    private void createPanelFooter(){
        panelFooterPerson= new PanelFooterPerson(this);
        this.add(panelFooterPerson, BorderLayout.SOUTH);

    }
}
