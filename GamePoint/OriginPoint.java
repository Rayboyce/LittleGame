package GamePoint;

import javax.swing.*;

public abstract class OriginPoint {
    JButton jButton;
    int x;
    int y;

    public OriginPoint(){
        jButton = new JButton();
    }

    public OriginPoint(int a,int b){
        this();
        this.x = a;
        this.y = b;
    }


}
