import Tests.DateLabelFormatter;
import org.jdatepicker.JDatePicker;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Properties;

public class CalendarForm extends JFrame {

    JFrame calendarFrame = new JFrame();
    private UtilDateModel model = new UtilDateModel();
    private Properties properties = new Properties();
    private JDatePanelImpl jDatePanel = new JDatePanelImpl(model, properties);
    private JDatePickerImpl jDatePicker = new JDatePickerImpl(jDatePanel, new DateLabelFormatter());
    private JPanel panel = new JPanel(true);
    private String[] columnName = {"Godzina", "Pacjent"};
    private String[][] data = {{"8:00",""},{"8:30",""},{"9:00",""},{"9:30",""},{"10:00",""},{"10:30",""},{"11:00",""},
            {"11:30",""},{"12:00",""},{"12:30",""},{"13:00",""},{"14:00",""},{"14:30",""},{"15:00",""},{"15:30",""},
            {"16:00",""},{"16:30",""},{"17:00",""},{"17:30",""},{"18:00",""},{"18:30",""},{"19:00",""}};
    private JTable table = new JTable(data,columnName);
    private JScrollPane scrollPane;

    private JButton add = new JButton("Dodaj wizytę");
    private JButton edit = new JButton("Edytuj wizytę");
    private JButton remove = new JButton("Usuń wizytę");

    public CalendarForm(){
//Sets table properties
        table.setPreferredScrollableViewportSize(new Dimension(200, 360));
        table.setFillsViewportHeight(true);

        scrollPane = new JScrollPane(table);
//sets components layout first is the line with picked up date and possibility to display calendar
        //second is the table with hours and patients names
        panel.setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 1;
        constraints.gridy = 0;
        panel.add(jDatePicker,constraints);

        constraints.gridx = 1;
        constraints.gridy = 1;
       // constraints.insets = new Insets(0,100,0,50); Insetsy służą do ustawiania komponentów
        panel.add(scrollPane,constraints);
        //Dodaj guziki dodaj, modyfikuj, usuń
        constraints.gridx = 0;
        constraints.gridy = 2;

        constraints.insets = new Insets(20,20,20,20);
        panel.add(add,constraints);

        constraints.gridx = 1;
        constraints.gridy = 2;

        constraints.insets = new Insets(20,20,20,20);
        panel.add(edit,constraints);

        constraints.gridx = 2;
        constraints.gridy = 2;
        constraints.insets = new Insets(20,20,20,20);
        panel.add(remove,constraints);



       // calendarFrame.add(scrollPane);
        //calendarFrame.add(jDatePicker);
        calendarFrame.setContentPane(panel);
        calendarFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calendarFrame.pack();
        calendarFrame.setVisible(true);




        jDatePicker.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(model.getValue());
            }
        });

        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });
    }




}




