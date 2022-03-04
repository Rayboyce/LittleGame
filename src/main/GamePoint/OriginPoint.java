package src.main.GamePoint;

import javax.swing.JButton;

public abstract class OriginPoint  {
    JButton button;
    int x;
    int y;


    public OriginPoint(){ }

    public OriginPoint(int x,int y){
        this();
        this.x = x;
        this.y = y;
    }
}
