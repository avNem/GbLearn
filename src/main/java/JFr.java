import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class JFr extends JFrame {

    private int counter;

    public JFr() {
        setTitle("Counter");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(200,200,400,200);

        Font font = new Font("Arial",Font.BOLD, 30 );
        JLabel label = new JLabel(String.valueOf(counter));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setFont(font);
        setLayout(new FlowLayout());

        JButton clearButton = new JButton("clear");
        JButton incrButton = new JButton(">");
        JButton decrButton = new JButton("<");
        JButton incrTenButton = new JButton("+ 10");
        JButton decrTenButton = new JButton("- 10");

        add(decrTenButton);
        add(decrButton);
        add(label);
        add(incrButton);
        add(incrTenButton);
        add(clearButton);

        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(incrButton.equals(e.getSource())) {
                    counter++;
                }else if(decrButton.equals(e.getSource())){
                    counter--;
                }else if(clearButton.equals(e.getSource())) {
                    counter = 0;
                }else if(incrTenButton.equals(e.getSource())) {
                    counter += 10;
                }else if(decrTenButton.equals(e.getSource())) {
                    counter -= 10;
                }
                label.setText(String.valueOf(counter));
            }
        };

        incrButton.addActionListener(actionListener);
        decrButton.addActionListener(actionListener);
        clearButton.addActionListener(actionListener);
        incrTenButton.addActionListener(actionListener);
        decrTenButton.addActionListener(actionListener);
        setVisible(true);

    }

    public static void main(String[] args) {
        new JFr();
    }
}