package hw.polygonfromfolder;

import java.awt.Graphics;
import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JComponent;

public class DrawPolygon extends JComponent{
    
    private static final String COORDINATES_LIST = "xy_statement.properties";
    
    private int nums = 0;
    private int[] x = new int [nums];
    private int[] y = new int [nums];
    private int index = 0;
    
    public void setCoordinates(){
        try{
            BufferedReader br = new BufferedReader(new FileReader(COORDINATES_LIST));
            String in = null;
            
            while((in = br.readLine()) != null) {
                if(!in.trim().isEmpty()) {
                    String[] array = in.split(",");
                    if(array.length == 1) {
                        nums = Integer.parseInt(array[0]);
                        System.out.println(nums);
                    } else if(array.length == 2) {
                            x[index] = Integer.parseInt(array[0]);
                            y[index] = Integer.parseInt(array[1]);
                            index++;
                    }
                }
            }
            br.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        setCoordinates();
        //int[] x = {72, 34, 90, 130, 67};
        //int[] y = {118, 78, 160, 187, 78};
        g.drawPolygon(x, y, nums);
    }
}
