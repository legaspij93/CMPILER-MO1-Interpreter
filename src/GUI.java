import java.awt.*;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;
        import javax.swing.*;

public class GUI
{
    public static void main (String[] argv)
    {
        JFrame frame = new JFrame ();
        frame.setTitle ("Triple J");
        frame.setResizable (true);
        frame.setSize (500, 300);
//Console
        JPanel panel = new JPanel();
        JTextArea textarea = new JTextArea();
        panel.add(textarea);
        textarea.setEditable(false);
        frame. setLocationByPlatform(true);
        panel.add(textarea, BorderLayout.CENTER);

        JScrollPane scrollPane2 = new JScrollPane(panel);
        frame.add(scrollPane2);
        frame.setSize(400,400);
        frame.setVisible(true);
//Editor
        JPanel panel2 = new JPanel();
        JButton fontCompileButton = new JButton("Compile");
        JTextArea textarea2 = new JTextArea("Place Input here");
        textarea2.setLineWrap(false);
        textarea2.setWrapStyleWord(false);
        textarea2.setFont(new Font("Arial",Font.PLAIN,12));


        fontCompileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        panel2.add(fontCompileButton);
        panel2.add(textarea2);
        frame.add(panel2);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 400);
        frame.setVisible(true);
        frame.getContentPane().setLayout(new BorderLayout());
        frame.getContentPane().add (panel,BorderLayout.SOUTH);
        frame.getContentPane().add (panel2,BorderLayout.NORTH);

    }
}