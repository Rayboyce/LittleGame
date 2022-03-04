package src.main.Manager;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import src.main.GamePoint.BattlePoint;

import java.io.*;

public enum BattleManager {
    MM;

    private BattlePoint[][] mapMesh;
    private Integer maxX;
    private Integer maxY;
    private String filePath = "src/resource/map/";

    BattleManager(){}

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
    public int setCharacter(){
        return 1;
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
        for(int a=0;a<maxX;a++){
            for(int b=0;b<maxY;b++){
                this.mapMesh[b][a] = new BattlePoint(b,a);
            }
        }
    }
}
