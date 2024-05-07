package src.co.edu.uptc.view.managerPerson;

import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;

import src.co.edu.uptc.view.Global;
import src.co.edu.uptc.view.txtBox.NumberTxt;

import javax.swing.*;

import com.toedter.calendar.JDateChooser;

public class PanelBodyPerson extends JPanel{

    public JComboBox<String> typeDocument;
    public NumberTxt numberTxt;
    public JTextField txtName;
    public JTextField txtLastName;
    public ButtonGroup btnsGroup;
    public JDateChooser calendarBirthDay;

    public PanelBodyPerson(){
        initPanel();
        createLblDocument();
        createTxtDocument();
        createLblDocumentNumber();
        createTxtDocumentNumber();
        createLblName();
        createTxtName();
        createLblLastName();
        createTxtLastName();
        createLblBirthday();
        createCalendarBirthDay();
        createLblGender();
        createRadioBtnGender();
    }

    private void initPanel(){
        this.setBackground(Global.WORK_BACKGROUND_COLOR);
        this.setForeground(Global.WORK_TEXT_COLOR);
        this.setLayout(null);
    }

    private void createLblDocument(){
        JLabel lblDocument= new JLabel("Tipo de Documento: ");
        lblDocument.setBounds(20, 10,200,30);
        lblDocument.setForeground(this.getForeground());
        this.add(lblDocument);
    }

    private void createTxtDocument(){
        String[] opciones= {"C.C","T.I","Registro de nacimiento","Cedula extranjera"};
        typeDocument= new JComboBox<>(opciones);
        typeDocument.setBounds(220, 10, 200, 30);
        this.add(typeDocument);
    }

    private void createLblDocumentNumber(){
        JLabel lblDocument= new JLabel("Numero de Documento: ");
        lblDocument.setBounds(20, 50,200,30);
        lblDocument.setForeground(this.getForeground());
        this.add(lblDocument);
    }

    private void createTxtDocumentNumber(){
        numberTxt= new NumberTxt();
        numberTxt.setBounds(220,50,200,30);
        this.add(numberTxt);
    }

    private void createLblName(){
        JLabel lblName= new JLabel("Nombre: ");
        lblName.setBounds(20, 90,200,30);
        lblName.setForeground(this.getForeground());
        this.add(lblName);
    }

    private void createTxtName(){
        txtName= new JTextField();
        txtName.setBounds(220, 90, 200, 30);
        int maxCharacter=40;
        txtName.addKeyListener(new KeyAdapter(){
            public void keyTyped(KeyEvent e) {
                if (txtName.getText().length() >= maxCharacter) {
                    e.consume(); // Evita que se agreguen más caracteres
                }
            }
        }
        );
        this.add(txtName);
    }

    private void createLblLastName(){
        JLabel lblLastName= new JLabel("Apellido: ");
        lblLastName.setBounds(20, 130,200,30);
        lblLastName.setForeground(this.getForeground());
        this.add(lblLastName);
    }

    private void createTxtLastName(){
        txtLastName= new JTextField();
        txtLastName.setBounds(220, 130, 200, 30);
        int maxCharacter=40;
        txtLastName.addKeyListener(new KeyAdapter(){
            public void keyTyped(KeyEvent e) {
                if (txtLastName.getText().length() >= maxCharacter) {
                    e.consume(); // Evita que se agreguen más caracteres
                }
            }
        }
        );
        this.add(txtLastName);
    }

    private void createLblBirthday(){
        JLabel lblBirthDay= new JLabel("Fecha de Nacimiento: ");
        lblBirthDay.setBounds(20, 170,200,30);
        lblBirthDay.setForeground(this.getForeground());
        this.add(lblBirthDay);
    }

    private void createCalendarBirthDay(){
        calendarBirthDay= new JDateChooser();
        calendarBirthDay.setBounds(220,170,200,30);
        this.add(calendarBirthDay);
    }

    private void createLblGender(){
        JLabel lblGender= new JLabel("Genero: ");
        lblGender.setBounds(20, 210,200,30);
        lblGender.setForeground(this.getForeground());
        this.add(lblGender);
    }

    private void createRadioBtnGender(){
        JRadioButton btnRMale= new JRadioButton("Masculino");
        JRadioButton btnRFemale= new JRadioButton("Femenino");
        btnsGroup= new ButtonGroup();
        btnsGroup.add(btnRMale);
        btnsGroup.add(btnRFemale);
        btnRMale.setActionCommand(btnRMale.getText());
        btnRFemale.setActionCommand(btnRFemale.getText());
        btnRMale.setBounds(220, 210, 100, 30);
        btnRFemale.setBounds(330, 210, 100, 30);
        this.add(btnRMale);
        this.add(btnRFemale);
    }

}
