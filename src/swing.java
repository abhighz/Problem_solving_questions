import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class swing {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Hello World Swing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // Create a panel
        JPanel panel = new JPanel();

        // Create a label
        JLabel label = new JLabel("Hello, World!");
        panel.add(label);

        // Create a button
        JButton button = new JButton("Click me");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Button clicked!");
            }
        });
        panel.add(button);

        // Add the panel to the frame
        frame.add(panel);
            frame.setSize(1000,500);
        // Set the frame visibility
        frame.setVisible(true);
    }
}
