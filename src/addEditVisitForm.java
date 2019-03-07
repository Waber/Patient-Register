import javax.swing.*;
import javax.swing.JPanel;
import java.awt.*;

public class addEditVisitForm {
    private JLabel dateLabel;
    private JFormattedTextField dateTextField;
    private JPanel addEditPanel;
    private JLabel timeLabel;
    private JSpinner visitTimeList;
    private JTextField patientNameField;
    private JLabel patientNameLabel;
    private JButton okButton;
    private JButton decilneButton;


public addEditVisitForm(int check){
    JFrame addEditFrame;
    if(check == 0) {
        addEditFrame = new JFrame("Dodawanie nowej wizyty");
    }
    else {
        addEditFrame = new JFrame("Modyfikacja wizyty");
    }
   // addEditPanel.setPreferredSize(new Dimension(400,400));
    addEditFrame.setContentPane(addEditPanel);
    addEditFrame.pack();
    addEditFrame.setVisible(true);
    addEditFrame.setLocationRelativeTo(null);

}
}
