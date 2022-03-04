package src.main.Weapon;

import src.main.GameCharacters.Charaters;

import java.util.ArrayList;
import java.util.Random;

/**
 * The weapon basic attribute for weapon:
 * 1.Damage(hp&mp&san)
 * 2.Consume(hp&mp&san)
 * 3.Smallwords
 */
public class Weapon {
    private ArrayList<Integer> damage;
    private ArrayList<Integer> consume;
    private String name;

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

        name = "强力的武器";
    }

    public Weapon(ArrayList<Integer> dmorigin,ArrayList<Integer> dmbound
                  ,ArrayList<Integer> cseorigin,ArrayList<Integer> csbound
                  ,String selfwords) {
        damage = new ArrayList<>();
        consume = new ArrayList<>();
        name = selfwords;

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

    public Weapon(ArrayList<Integer> damage, ArrayList<Integer> consume, String name) {
        this.damage = damage;
        this.consume = consume;
        this.name = name;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Enhanced / Weak weapon attributes
     * based on charater's attributes
     */
    public void Changwpattributes(Charaters role){
        role.getAttributelabel().forEach(label->{
            switch(label){
                case "中二":
                    //HP damage add 2
                    System.out.println(this.name + " the hp damage is " + this.damage.get(Wpcons.alhpindex)
                    + " before the reaction with the role " + role.getName());
                    this.damage.set(Wpcons.alhpindex,this.damage.get(Wpcons.alhpindex)+2);
                    break;
                default:
                    break;
            }
        });
        System.out.println(this.name + " the hp damage is " + this.damage.get(Wpcons.alhpindex)
                + " after the reaction with the role " + role.getName());
    }
}
