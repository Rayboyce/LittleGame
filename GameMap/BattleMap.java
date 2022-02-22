package GameMap;

import GamePoint.BattlePoint;

import java.util.ArrayList;

public class BattleMap extends OriginMap{

    private BattlePoint[][] mapMesh;
    /** charaters，地图内当前角色 */
    private ArrayList<Integer> charaters;
    /** capacity，地图人数上限 */
    private int capacity;

    public BattleMap(){
        this.xMax = 0;
        this.yMax = 0;
        mapMesh = null;
    }
    public BattleMap(int x, int y){
        this.xMax = x;
        this.yMax = y;
        this.mapMesh = new BattlePoint[x][y];
        for(int a=0;a<x;a++){
            for(int b=0;b<y;b++){
                this.mapMesh[a][b] = new BattlePoint(a,b);
            }
        }
    }

    public int getMax_x(){return this.xMax;}
    public int getMax_y(){return this.yMax;}
    public BattlePoint getBattlePoint(int x,int y){return this.mapMesh[x][y];}
}
