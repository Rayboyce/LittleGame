package src.GamePoint;

import javax.swing.JButton;

public abstract class OriginPoint  {
    JButton nButton;
    int x;
    int y;

    public OriginPoint(){ }

    public OriginPoint(int a,int b){
        this();
        this.x = a;
        this.y = b;
    }
}
