package src.co.edu.uptc.view.managerMenu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import src.co.edu.uptc.pojo.Person;
import src.co.edu.uptc.view.MenuHeader;
import src.co.edu.uptc.view.managerPerson.ManagerPersonView;

public class ManagerMenu extends JDialog{
    
    public MenuHeader menuHeaderBar;

    private JTable tablePerson;
    private JButton btnOpen;
    private JScrollPane scrollTable;

    public ManagerMenu(MenuHeader menuHeader){
        this.menuHeaderBar=menuHeader;
        initJDialog();
        createBtnOpen();
        createTable();
    }

    public void begin(){
        this.setVisible(true);
    }

    private void initJDialog(){
        this.setSize(500, 500);
        this.setLocationRelativeTo(menuHeaderBar.mainViewFrame);
        this.setLayout(null);
    }

    private void createBtnOpen(){
        btnOpen= new JButton("Abrir menu");
        btnOpen.setBounds((this.getWidth()/2)-100, 10, 200,50);
        btnOpen.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                ManagerPersonView managerPersonView= new ManagerPersonView(getManagerMenu());
                managerPersonView.begin();
            }
            
        });
        this.add(btnOpen);
    }

    public ManagerMenu getManagerMenu(){
        return this;
    }

    private void createTable(){
        tablePerson = new JTable(1,6);
        tablePerson.setValueAt("Tipo de Documento", 0, 0);
        tablePerson.setValueAt("Numero de Documento", 0, 1);
        tablePerson.setValueAt("Nombre", 0, 2);
        tablePerson.setValueAt("Apellido", 0, 3);
        tablePerson.setValueAt("Cumpleaños", 0, 4);
        tablePerson.setValueAt("Genero", 0, 5);
        scrollTable= new JScrollPane(tablePerson);
        scrollTable.setBounds(0, (btnOpen.getHeight())+11, getWidth(),getHeight());
        add(scrollTable);
    }

    public void addTable(Person person1){
        JTable tablePerson2= new JTable(tablePerson.getRowCount()+1,tablePerson.getColumnCount());
        for (int i = 0; i < tablePerson.getRowCount(); i++) {
            for (int j = 0; j < tablePerson.getColumnCount(); j++) {
                tablePerson2.setValueAt(tablePerson.getValueAt(i,j), i, j);
            }
        }
        tablePerson2.setValueAt(person1.getTypeDocument(), tablePerson2.getRowCount()-1, 0);
        tablePerson2.setValueAt(person1.getDocument(), tablePerson2.getRowCount()-1, 1);
        tablePerson2.setValueAt(person1.getName(), tablePerson2.getRowCount()-1, 2);
        tablePerson2.setValueAt(person1.getLastName(), tablePerson2.getRowCount()-1, 3);
        tablePerson2.setValueAt(person1.getBirthDay(), tablePerson2.getRowCount()-1, 4);
        tablePerson2.setValueAt(person1.getGender(), tablePerson2.getRowCount()-1, 5);
        this.remove(scrollTable);
        tablePerson=tablePerson2;
        scrollTable= new JScrollPane(tablePerson);
        scrollTable.setBounds(0, (btnOpen.getHeight())+11, getWidth(),getHeight());
        this.add(scrollTable);
        this.revalidate();
        this.repaint();
    }
}
