package GameCharacters;

import java.util.ArrayList;

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
    private ArrayList<Integer> attributelabel;

    /**
     * Conform to javabean
     */
    public Charaters() {
    }

    public Charaters(Integer hitpiont, Integer magicpiont, Integer sanity, String name, String selfintroduction, ArrayList<Integer> attributelabel) {
        this.hitpiont = hitpiont;
        this.magicpiont = magicpiont;
        this.sanity = sanity;
        this.name = name;
        this.selfintroduction = selfintroduction;
        this.attributelabel = attributelabel;
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

    public ArrayList<Integer> getAttributelabel() {
        return attributelabel;
    }

    public void setAttributelabel(ArrayList<Integer> attributelabel) {
        this.attributelabel = attributelabel;
    }

    //Need to generate a meaningless action for cute
    public abstract void actingcute();
}
