package src.main.Manager;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import src.main.GameCharacters.Charaters;
import src.main.GamePoint.BattlePoint;

import java.io.*;
import java.util.LinkedList;

public enum BattleManager {
    MM;

    private LinkedList<Integer> charatersId = new LinkedList<Integer>();
    private BattlePoint[][] mapMesh;
    private Integer maxX;
    private Integer maxY;
    private String filePath = "src/resource/map/";

    BattleManager(){}

    //设置地图信息
    public void setMapMes(String mapName){
        try {
            JSONObject mapMessage =  readMapFile(mapName);
            System.out.println(mapMessage.toString());
            this.maxX = Integer.parseInt((String)mapMessage.get("x"));
            this.maxY = Integer.parseInt((String)mapMessage.get("y"));
            createMesh();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
    //将角色设置在地图上
    public void setCharacter(Charaters charater, int targetX, int targetY) throws IllegalAccessException {
        if(charater == null){
            throw new NullPointerException("请正确设置角色");
        }
        if(targetX<0 || targetX >=maxX || targetY<0 || targetY >=maxY){
            throw new ArrayIndexOutOfBoundsException("设置坐标不合法");
        }
        charatersId.add(charater.getCharaterId());
        this.mapMesh[targetY][targetX].setCharater(charater);
    }
    public int moveCharacter(){
        return 1;
    }

    public BattlePoint getBattlePoint(int x, int y){return this.mapMesh[y][x];}


    private JSONObject readMapFile(String mapName) throws ParseException {
        String jsonStr = "";
        try {
            File jsonFile = new File(this.filePath + mapName);
            FileReader fileReader = new FileReader(jsonFile);
            Reader reader = new InputStreamReader(new FileInputStream(jsonFile),"utf-8");
            int ch = 0;
            StringBuffer sb = new StringBuffer();
            while ((ch = reader.read()) != -1) {
                sb.append((char) ch);
            }
            fileReader.close();
            reader.close();
            jsonStr = sb.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return (JSONObject)new JSONParser().parse(jsonStr);
    }

    private void createMesh(){
        this.mapMesh = new BattlePoint[maxY][maxX];
        for(int x=0;x<maxX;x++){
            for(int y=0;y<maxY;y++){
                this.mapMesh[y][x] = new BattlePoint(x,y);
            }
        }
    }
}
