package movingframe;

import java.awt.BorderLayout;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;
import java.util.Properties;
import java.util.PropertyResourceBundle;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MovingFrame extends JFrame implements ActionListener {

    private final FrameForMovement ffm;
    private final JButton LEFT = new JButton();
    private final JButton RIGHT = new JButton();
    private final JButton UP = new JButton();
    private final JButton DOWN = new JButton();
    private final JButton lang = new JButton();

    Properties pro = new Properties();

    private static final String proFile = "src/langgg/langproperty.properties";
    private static String moveTo = "left";

    public MovingFrame(FrameForMovement ffm) throws IOException {
        setLangText();
        this.ffm = ffm;

        LEFT.setActionCommand("left");
        LEFT.addActionListener(this);
        add(LEFT, BorderLayout.WEST);

        RIGHT.setActionCommand("right");
        RIGHT.addActionListener(this);
        add(RIGHT, BorderLayout.EAST);

        UP.setActionCommand("up");
        UP.addActionListener(this);
        add(UP, BorderLayout.NORTH);

        DOWN.setActionCommand("down");
        DOWN.addActionListener(this);
        add(DOWN, BorderLayout.SOUTH);

        lang.setText("RU");
        lang.setActionCommand("langPro");
        lang.addActionListener(this);
        add(lang, BorderLayout.CENTER);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(300, 300, 220, 220);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("langPro")) {
            if (lang.getText().equals("RU")) {
                try {
                    setLangRU();
                } catch (Exception ex) {
                    System.out.println("Russian error!");
                }
            } else if (lang.getText().equals("EN")) {
                try {
                    setLangEN();
                } catch (IOException ex) {
                    System.out.println("English error");
                }
            }
        } else {
            moveTo = e.getActionCommand();
            moveFrame();
        }
    }

    public void moveFrame() {
        Rectangle r = ffm.getBounds();
        switch (moveTo) {
            case "up":
                r.y -= 10;
                break;
            case "right":
                r.x += 10;
                break;
            case "down":
                r.y += 10;
                break;
            case "left":
                r.x -= 10;
                break;
        }
        ffm.setBounds(r);
    }

    private void setLangText() throws IOException {
        pro.load(new FileReader(proFile));
        LEFT.setText(pro.getProperty("left.button.text"));
        RIGHT.setText(pro.getProperty("right.button.text"));
        UP.setText(pro.getProperty("up.button.text"));
        DOWN.setText(pro.getProperty("down.button.text"));

    }

    private void setLangRU() throws IOException {
        lang.setText("EN");
        
        PropertyResourceBundle prb = (PropertyResourceBundle) PropertyResourceBundle
                    .getBundle("langgg/langproperty", new Locale("RU"));

        LEFT.setText(prb.getString("left.button.text"));
        RIGHT.setText(prb.getString("right.button.text"));
        UP.setText(prb.getString("up.button.text"));
        DOWN.setText(prb.getString("down.button.text"));
    }

    private void setLangEN() throws IOException {
        lang.setText("RU");
        
        PropertyResourceBundle prb = (PropertyResourceBundle) PropertyResourceBundle
                    .getBundle("langgg/langproperty", new Locale("EN"));
        LEFT.setText(prb.getString("left.button.text"));
        RIGHT.setText(prb.getString("right.button.text"));
        UP.setText(prb.getString("up.button.text"));
        DOWN.setText(prb.getString("down.button.text"));
    }
}
