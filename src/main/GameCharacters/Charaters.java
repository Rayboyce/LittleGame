package src.main.GameCharacters;

import java.util.ArrayList;
import java.util.Random;

/**
 * This is the basic Attribute for every Characters
 *
 */
public abstract class Charaters {
    private Integer hitpiont;
    private Integer magicpiont;
    private Integer sanity;
    private String name;
    private String selfintroduction;
    private ArrayList<String> attributelabel;
    private Integer charaterId;

    /**
     * Conform to javabean
     */
    public Charaters() {
    }

    public Charaters(Integer hitpiont, Integer magicpiont, Integer sanity, String name, String selfintroduction, ArrayList<String> attributelabel) {
        this.hitpiont = hitpiont;
        this.magicpiont = magicpiont;
        this.sanity = sanity;
        this.name = name;
        this.selfintroduction = selfintroduction;
        this.attributelabel = attributelabel;
        this.charaterId = new Random().nextInt(100000000);  //该方法仍有可能出现重复Id，后续再修改
    }

    public Integer getHitpiont() {
        return hitpiont;
    }

    public void setHitpiont(Integer hitpiont) {
        this.hitpiont = hitpiont;
    }

    public Integer getMagicpiont() {
        return magicpiont;
    }

    public void setMagicpiont(Integer magicpiont) {
        this.magicpiont = magicpiont;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSelfintroduction() {
        return selfintroduction;
    }

    public void setSelfintroduction(String selfintroduction) {
        this.selfintroduction = selfintroduction;
    }

    public Integer getSanity() {
        return sanity;
    }

    public void setSanity(Integer sanity) {
        this.sanity = sanity;
    }

    public ArrayList<String> getAttributelabel() {
        return attributelabel;
    }

    public void setAttributelabel(ArrayList<String> attributelabel) {
        this.attributelabel = attributelabel;
    }

    public Integer getCharaterId(){ return this.charaterId; }

    //Need to generate a meaningless action for cute
    public abstract void actingcute();
}
