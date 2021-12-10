package homework8.RPG;

import homework8.RPG.Character.Class.Heals.Senjin;
import homework8.RPG.Character.Class.Heals.Velen;
import homework8.RPG.Character.Class.Mages.Antonidas;
import homework8.RPG.Character.Class.Mages.JainaProudmoore;
import homework8.RPG.Character.Class.Warriors.ThunderHellscream;
import homework8.RPG.Character.Class.Warriors.VarianWrynn;

public class Main {
    public static void main(String[] args) {
        Senjin senjin = new Senjin();
        Velen velen = new Velen();
        Antonidas antonidas = new Antonidas();
        JainaProudmoore jainaProudmoore = new JainaProudmoore();
        VarianWrynn varianWrynn = new VarianWrynn();
        ThunderHellscream thunderHellscream = new ThunderHellscream();

        //senjin.setName("Senjin");

        System.out.println(senjin.getName()+ " " + velen.getName() + " " + antonidas.getName() + " " + jainaProudmoore.getName() + " "
                + varianWrynn.getName() + " " + thunderHellscream.getName());
    }
}
