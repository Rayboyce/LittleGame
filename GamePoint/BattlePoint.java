package GamePoint;

import javax.swing.*;

public class BattlePoint extends OriginPoint{
    /** terrain，地形，预设值0，空地 */
    private int terrain;
    /** charaterId，单位标识，预设值0，无单位 */
    private int charaterId;

    public BattlePoint(int x,int y){
        super(x,y);
        this.terrain = 0;
        this.charaterId = 0;
        System.out.println("网点生成,网格编号:"+x+","+y);
        this.jButton.setText("空地");
    }
    public BattlePoint(int x,int y,int t, int cId){
        super(x,y);
        this.terrain = t;
        this.charaterId = cId;
        System.out.println("网点生成,网格编号:"+x+","+y);
        if(cId!=0){
            this.jButton.setText("地形:"+t+"\n单位:"+cId);
        }else {
            this.jButton.setText("地形:"+t+"\n");
        }
    }

    public int getTerrain(){return this.terrain;}
    public int getCharaterId(){return this.charaterId;}
    public JButton getJButton(){return this.jButton;}
}
