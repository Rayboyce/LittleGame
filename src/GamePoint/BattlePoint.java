package src.GamePoint;

import src.GamePoint.PointMes.Terrain;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class BattlePoint extends OriginPoint{
    /** terrain，地形，默认Grasslands-平原 */
    private Terrain terrain;
    /** charaterId，单位标识，预设值0，无单位 */
    private int charaterId;

    public BattlePoint(int x,int y){
        super(x,y);
        this.terrain = Terrain.Grasslands;
        this.charaterId = 0;
        this.nButton = new JButton(){};
        this.nButton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(ActionEvent.MOUSE_EVENT_MASK == e.getModifiers()){
                    JOptionPane.showMessageDialog(null, showAllMes(),
                            "所选地点信息", JOptionPane.INFORMATION_MESSAGE);
                }else {
                    System.out.println("Action e: "+e.getModifiers());
                }
            }
        });
        this.nButton.setText(terrain.getDesc());
    }

    public BattlePoint(int x,int y,Terrain t, int cId){
        super(x,y);
        this.terrain = t;
        this.charaterId = cId;
        if(cId!=0){
            this.nButton.setText("地形:"+t+"\n单位:"+cId);
        }else {
            this.nButton.setText("地形:"+t+"\n");
        }
    }

    public Terrain getTerrain(){return this.terrain;}
    public int getCharaterId(){return this.charaterId;}
    public JButton getJButton(){return this.nButton;}

    public String showAllMes(){
        String str = "坐标:"+this.x+","+this.y+"\n"
                +"地形:"+this.terrain.getDesc()+"\n";
        return str;
    }

}
