package hw.polygonfromfolder;

import java.awt.Graphics;
import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JComponent;

public class DrawPolygon extends JComponent {

    private static final String COORDINATES_LIST = "xy_statement.properties";

    private int nums;
    private int[] x;
    private int[] y;
    private int index = 0;

    public void setCoordinates() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(COORDINATES_LIST));
            String in = null;

            System.out.println("try read---------------");
            while ((in = br.readLine()) != null) {
                if (!in.trim().isEmpty()) {

                    String[] array = in.split(",");

                    if (array.length == 1) {
                        nums = Integer.parseInt(array[0]);
                        x = new int[nums];
                        y = new int[nums];

                    } else if (array.length == 2) {
                        if (index < 5) {
                            x[index] = Integer.parseInt(array[0]);
                            y[index] = Integer.parseInt(array[1]);
                            index++;
                        } else {
                            break;
                        }
                    }
                }
            }
            br.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawPolygon(x, y, nums);

    }
}
