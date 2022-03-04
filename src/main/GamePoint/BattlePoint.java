package src.main.GamePoint;

import src.main.GameCharacters.Charaters;
import src.main.GamePoint.PointMes.Terrain;

import javax.swing.*;
import javax.swing.undo.CannotRedoException;
import java.awt.event.ActionEvent;

public class BattlePoint extends OriginPoint{
    /** terrain，地形，默认Grasslands-平原 */
    private Terrain terrain;
    /** charater，单位，预设值null，无单位 */
    private Charaters charater;

    BattlePoint(){
        throw new IllegalArgumentException("必须对该类型进行初始化赋值");
    }
    public BattlePoint(int x,int y){
        super(x,y);
        this.terrain = Terrain.Grasslands;  //默认地形，草地
        this.charater = null;    //默认单位，null，不存在
        this.button = new JButton(){};
        this.button.addActionListener(new AbstractAction() {
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
        this.button.setText(terrain.getDesc());
    }

    public BattlePoint(int x,int y,Terrain t, Charaters charater){
        super(x,y);
        this.terrain = t;
        this.charater = charater;
        if(this.charater!=null){
            this.button.setText("地形:"+t+"\n单位:"+charater);
        }else {
            this.button.setText("地形:"+t+"\n");
        }
    }
    //获取该网格地形
    public Terrain getTerrain(){return this.terrain;}
    //设置该网格上的单位
    public void setCharater(Charaters charater) throws IllegalAccessException {
        if(this.charater != null){
            throw new IllegalAccessException("不可在已设置单位的单元格重复设置单位");
        }
        this.charater = charater;
        System.out.println("already set new charater");
        System.out.println("New charater: "+ this.charater.getName());
    }
    //获取该网格上的单位
    public Charaters getCharater(){return this.charater;}
    //获取该网格按钮
    public JButton getJButton(){return this.button;}

    public String showAllMes(){
        String str = "坐标:"+this.x+","+this.y+"\n"
                +"地形:"+this.terrain.getDesc()+"\n";
        if(this.charater != null){
            str += "单位:"+this.charater.getName()+"\n";
        }
        System.out.println("showMes: "+str);
        return str;
    }
    public JButton getBattlePoint(int x, int y){return this.button;}
}
