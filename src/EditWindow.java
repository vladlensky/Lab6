import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;

/**
 * Created by bespa on 13.04.2017.
 */
public class EditWindow extends JFrame {
    JPanel panel = new JPanel();
    public EditWindow(){
        panel.setBackground(Color.white);
        panel.setLayout(null);
        add(panel);
        JTextField field = new JTextField(20);
        field.setSelectionColor(Color.yellow);
        field.setSize(230,20);
        field.setLocation(27,30);
        //
        JLabel label = new JLabel("Age:");
        label.setLocation(28,48);
        label.setSize(50,30);
        label.setFont(new Font("Verdana", Font.PLAIN, 13));
        //
        JLabel name = new JLabel("Name:");
        name.setLocation(27,0);
        name.setSize(50,30);
        name.setFont(new Font("Verdana", Font.PLAIN, 13));
        //
        JSpinner spin = new JSpinner(new SpinnerNumberModel(1, 1, 50, 1));
        spin.setSize(60,20);
        JTextField tf = ((JSpinner.DefaultEditor) spin.getEditor()).getTextField();
        tf.setEditable(false);
        tf.setForeground(Color.BLUE);
        tf.setBackground(Color.WHITE);
        spin.setLocation(70,55);
        //
        JLabel trob = new JLabel("Troubles:");
        trob.setLocation(27,70);
        trob.setSize(80,30);
        trob.setFont(new Font("Verdana", Font.BOLD, 13));
        //
        JLabel trobL = new JLabel("Troubles with the law:");
        trobL.setLocation(27,170);
        trobL.setSize(180,30);
        trobL.setFont(new Font("Verdana", Font.BOLD, 13));
        //
        ButtonGroup group = new ButtonGroup();
        JRadioButton True = new JRadioButton("true");
        JRadioButton False = new JRadioButton("false");
        False.setSelected(true);
        False.setFont(new Font("Verdana", Font.PLAIN, 12));
        True.setFont(new Font("Verdana", Font.PLAIN, 12));
        True.setSize(80,30);
        False.setSize(80,30);
        True.setLocation(30,200);
        False.setLocation(29,222);
        group.add(True);
        group.add(False);
        True.setForeground(Color.BLACK);
        True.setBackground(Color.WHITE);
        False.setForeground(Color.BLACK);
        False.setBackground(Color.WHITE);
        //
        JButton canc = new JButton("Cancel");
        canc.setBackground(Color.red);
        JButton ok = new JButton("Ok");
        ok.setBackground(Color.green);
        canc.setSize(80,30);
        canc.setLocation(40,255);
        ok.setSize(80,30);
        ok.setLocation(160,255);
        //
        /*
        String[] data = new String[10];
        data[0]="kek";
        data[1]="kukarek";
        data[2]="kesk";
        data[3]="kukareks";
        JList list = new JList(data);
        list.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        list.setLayoutOrientation(JList.VERTICAL);
        list.setSize(80,60);
        list.setLocation(30,90);
        list.setVisibleRowCount(3);
        panel.add(list);
        */
        //
        JButton Add = new JButton("Add");
        JButton Del = new JButton("Delete");
        Add.setBackground(Color.blue);
        Del.setBackground(Color.blue);
        Add.setSize(80,30);
        Add.setLocation(200,95);
        Del.setSize(80,30);
        Del.setLocation(200,130);
        panel.add(True);
        panel.add(name);
        panel.add(False);
        panel.add(Add);
        panel.add(Del);
        panel.add(spin);
        panel.add(trob);
        panel.add(trobL);
        panel.add(field);
        panel.add(label);
        panel.add(ok);
        panel.add(canc);
    }
}
