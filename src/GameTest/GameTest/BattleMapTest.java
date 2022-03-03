package src.GameTest.GameTest;

import src.GameMap.BattleMap;

import javax.swing.*;
import java.awt.*;

public class BattleMapTest {

    public static final int mapWidth = 10;
    public static final int mapHeight = 20;
    public static final int pointSize = 80;

    public static void main(String[] args){
        BattleMap bm = new BattleMap(mapWidth,mapHeight);


        JFrame jf = new JFrame("Test");
        jf.setSize(mapHeight*pointSize,mapWidth*pointSize);
        jf.setLayout(new GridLayout(bm.getMax_x(),bm.getMax_y()));

        for (int a=0;a<mapWidth;a++){
            for (int b=0;b<mapHeight;b++){
                jf.add(bm.getBattlePoint(a,b).getJButton());
            }
        }
        jf.setVisible(true);


    }
}
