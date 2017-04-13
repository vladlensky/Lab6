import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by bespa on 13.04.2017.
 */
public class EditWindow extends JFrame {
    JPanel panel = new JPanel();
    public EditWindow(){
        panel.setBackground(Color.white);
        add(panel);
        JTextField field = new JTextField("ds",20);
        field.setName("Name");
        panel.add(field,new GridBagConstraints(0,0,1,1,1,1,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,new Insets(1,1,1,1),0,0));


    }
}
