package homework8.RPG;


import homework8.RPG.Character.Class.Heals.Senjin;
import homework8.RPG.Character.Class.Heals.Velen;
import homework8.RPG.Character.Class.Mages.Antonidas;
import homework8.RPG.Character.Class.Mages.JainaProudmoore;
import homework8.RPG.Character.Class.Warriors.ThunderHellscream;
import homework8.RPG.Character.Class.Warriors.VarianWrynn;

public class Main {
    public static void main(String[] args) {
        Senjin senjin = new Senjin(60,30);
        Velen velen = new Velen(100,70);
        Antonidas antonidas = new Antonidas(20,100);
        JainaProudmoore jainaProudmoore = new JainaProudmoore(40,60);
        VarianWrynn varianWrynn = new VarianWrynn(100,30);
        ThunderHellscream thunderHellscream = new ThunderHellscream(100,70);

        System.out.println(senjin.getName()+ " " + velen.getName() + " " + antonidas.getName() + " " + jainaProudmoore.getName() + " "
                + varianWrynn.getName() + " " + thunderHellscream.getName());


        System.out.println(varianWrynn.getHealth());
        System.out.println(antonidas.getHealth());
        System.out.println(velen.getDamage());
        velen.basicAtack(antonidas);
        velen.basicAtack(varianWrynn);

        System.out.println(antonidas.getHealth());
        System.out.println(velen.getHealth());

    }
}
