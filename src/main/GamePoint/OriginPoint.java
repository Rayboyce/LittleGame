package src.main.GamePoint;

import javax.swing.JButton;

public abstract class OriginPoint  {
    JButton button;
    int x;
    int y;

    public OriginPoint(){ }

    public OriginPoint(int a,int b){
        this();
        this.x = a;
        this.y = b;
    }
}
