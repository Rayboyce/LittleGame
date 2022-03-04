package src.main.GameTest;

import src.main.GameCharacters.Charaters;
import src.main.Manager.BattleManager;
import src.main.Weapon.Weapon;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class BattleMapTest {

    public static final int cols = 10;  //列数
    public static final int rows = 20;  //行数
    public static final int pointSize = 80;

    public static void main(String[] args){

        //呼叫地图管理员，配置地图信息，完成初始化
        BattleManager bm = BattleManager.MM;
        bm.setMapMes("map1");

        JFrame jf = new JFrame("Test");
        jf.setSize(cols*pointSize,rows*pointSize);
        jf.setLayout(new GridLayout(rows, cols));

        for (int y=0;y<rows;y++){
            for (int x=0;x<cols;x++){
                jf.add(bm.getBattlePoint(x,y).getJButton());
            }
        }
        jf.setVisible(true);

        //创建角色
        ArrayList<String> rolelable = new ArrayList<>();
        rolelable.add("中二");
        rolelable.add("宅");
        Charaters wyf = new Charaters(10,15,5,"Yufan Wu","I'm cooooooool",rolelable) {
            @Override
            public void actingcute() {
                System.out.println("Hello! little game, i'm wyf, i'm coming!");
            }
        };
        Weapon gun = new Weapon();
        gun.Changwpattributes(wyf);

        //放置角色
        try {
            bm.setCharacter(wyf, 5, 8);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
