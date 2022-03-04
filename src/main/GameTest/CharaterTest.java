package src.main.GameTest;

import src.main.GameCharacters.Charaters;
import src.main.Weapon.Weapon;

import java.util.ArrayList;

public class CharaterTest {
    public static void main(String[] args) {
        ArrayList<String> rolelable = new ArrayList<>();
        rolelable.add("中二");
        rolelable.add("宅");
        /*
        Random rd = new Random();
        for(int i =0;i<rd.nextInt(1,3);i++){
        }
         */
        Charaters wyf = new Charaters(10,15,5,"Yufan Wu","I'm cooooooool",rolelable) {
            @Override
            public void actingcute() {
                System.out.println("Hello! little game, i'm wyf, i'm coming!");
            }
        };
        Weapon gun = new Weapon();
        gun.Changwpattributes(wyf);
    }
}
