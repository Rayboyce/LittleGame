package Weapon;

import java.util.ArrayList;
import java.util.Random;

/**
 * The weapon basic attribute for weapon:
 * 1.Damage(hp&mp&san)
 * 2.Consume(hp&mp&san)
 * 3.Smallwords
 */
public abstract class Weapon {
    private ArrayList<Integer> damage;
    private ArrayList<Integer> consume;
    private String smallwords;

    /**
     * Conform to javabean
     */
    public Weapon() {
        damage = new ArrayList<>();
        consume = new ArrayList<>();

        Random rd = new Random();
        //Damage for hp
        damage.add(rd.nextInt(0,10));
        //Damage for mp
        damage.add(rd.nextInt(0,3));
        //Damage for san
        damage.add(rd.nextInt(0,2));
        //Consume for hp
        consume.add(rd.nextInt(0,2));
        //Consume for mp
        consume.add(rd.nextInt(0,4));
        //Consume for san
        consume.add(rd.nextInt(0,1));

        smallwords = "This is a strong WEAPON!!";
    }

    public Weapon(ArrayList<Integer> dmorigin,ArrayList<Integer> dmbound
                  ,ArrayList<Integer> cseorigin,ArrayList<Integer> csbound
                  ,String selfwords) {
        damage = new ArrayList<>();
        consume = new ArrayList<>();
        smallwords = selfwords;

        Random rd = new Random();
        //Damage for hp
        damage.add(rd.nextInt(dmorigin.get(Wpcons.alhpindex),dmbound.get(Wpcons.alhpindex)));
        //Damage for mp
        damage.add(rd.nextInt(dmorigin.get(Wpcons.almpindex),dmbound.get(Wpcons.almpindex)));
        //Damage for san
        damage.add(rd.nextInt(dmorigin.get(Wpcons.alsanindex),dmbound.get(Wpcons.alsanindex)));
        //Consume for hp
        consume.add(rd.nextInt(cseorigin.get(Wpcons.alhpindex),csbound.get(Wpcons.alhpindex)));
        //Consume for mp
        consume.add(rd.nextInt(cseorigin.get(Wpcons.almpindex),csbound.get(Wpcons.almpindex)));
        //Consume for san
        consume.add(rd.nextInt(cseorigin.get(Wpcons.alsanindex),csbound.get(Wpcons.alsanindex)));
    }

    public Weapon(ArrayList<Integer> damage, ArrayList<Integer> consume, String smallwords) {
        this.damage = damage;
        this.consume = consume;
        this.smallwords = smallwords;
    }

    public ArrayList<Integer> getDamage() {
        return damage;
    }

    public void setDamage(ArrayList<Integer> damage) {
        this.damage = damage;
    }

    public ArrayList<Integer> getConsume() {
        return consume;
    }

    public void setConsume(ArrayList<Integer> consume) {
        this.consume = consume;
    }

    public String getSmallwords() {
        return smallwords;
    }

    public void setSmallwords(String smallwords) {
        this.smallwords = smallwords;
    }

    /**
     * Enhanced / Weak weapon attributes
     * based on charater's attributes
     */
    public abstract
}
