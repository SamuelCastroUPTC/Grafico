package src.co.edu.uptc.view.managerPerson;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import src.co.edu.uptc.pojo.Person;
import src.co.edu.uptc.view.Global;

public class PanelFooterPerson extends JPanel{

    private ManagerPersonView managerPersonViewDialog;
    
    public PanelFooterPerson(ManagerPersonView managerPersonView){
        this.managerPersonViewDialog=managerPersonView;
        initPanel();
        createCloseBtn();
        createSaveBtn();
    }

    private void initPanel(){
        this.setBackground(Global.FOOTER_BACKGROUND_COLOR);
        this.setForeground(Global.FOOTER_TEXT_COLOR);
        this.setVisible(true);
    }

    private void createCloseBtn(){
        JButton btnClose= new JButton("Cerrar");
        btnClose.setBounds(((getWidth()/2)/2),(getHeight()/2),100,30);
        btnClose.setForeground(this.getForeground());
        this.add(btnClose);
    }

    private void createSaveBtn(){
        JButton btnSave= new JButton("Guardar");
        btnSave.setBounds(((getWidth()/2)/2)+(getWidth()/2),(getHeight()/2),100,30);
        btnSave.setForeground(this.getForeground());
        btnSave.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Person person1= new Person();
                person1.setTypeDocument((String)managerPersonViewDialog.panelBodyPerson.typeDocument.getSelectedItem());
                person1.setDocument(Integer.parseInt(managerPersonViewDialog.panelBodyPerson.numberTxt.getText()));
                person1.setName(managerPersonViewDialog.panelBodyPerson.txtName.getText());
                person1.setLastName(managerPersonViewDialog.panelBodyPerson.txtLastName.getText());
                person1.setBirthDay(managerPersonViewDialog.panelBodyPerson.calendarBirthDay.getDate());
                System.out.println(person1.getBirthDay());
                person1.setGender(managerPersonViewDialog.panelBodyPerson.btnsGroup.getSelection().getActionCommand());
                managerPersonViewDialog.managerMenuDialog.addTable(person1);
                managerPersonViewDialog.dispose();
            }
            
        });
        this.add(btnSave);
    }

    
}
