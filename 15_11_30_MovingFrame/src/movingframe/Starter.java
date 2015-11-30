package movingframe;

import java.io.IOException;

public class Starter {
    
    public static void main(String[] args) {
        FrameForMovement ffm = new FrameForMovement();
    try{
        MovingFrame mf = new MovingFrame(ffm);
        MovingThread mt = new MovingThread(mf);
        mt.start();
    } catch (IOException ex) {
        
    }
        
    
    }
}
