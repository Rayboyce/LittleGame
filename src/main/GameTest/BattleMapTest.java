package src.main.GameTest;

import src.main.GameMap.BattleMap;
import src.main.Manager.BattleManager;

import javax.swing.*;
import java.awt.*;

public class BattleMapTest {

    public static final int mapWidth = 10;
    public static final int mapHeight = 20;
    public static final int pointSize = 80;

    public static void main(String[] args){
        //BattleMap bm = new BattleMap(mapWidth,mapHeight);

        BattleManager bm = BattleManager.MM;
        bm.setMapMes("map1");

        JFrame jf = new JFrame("Test");
        jf.setSize(mapHeight*pointSize,mapWidth*pointSize);
        jf.setLayout(new GridLayout(mapWidth,mapHeight));

        for (int a=0;a<mapWidth;a++){
            for (int b=0;b<mapHeight;b++){
                jf.add(bm.getBattlePoint(a,b).getJButton());
            }
        }
        jf.setVisible(true);


    }
}
