package src.GamePoint.PointMes;

public enum Terrain {
    Grasslands("草原"),
    Farmlands("农田"),
    Forest("森林"),
    Hills("山地"),
    Woods("丛林"),
    Desert("沙漠");

    private String desc;

    Terrain(){}

    private Terrain(String desc){
        this.desc = desc;
    }

    public String getDesc(){return this.desc;}
}
