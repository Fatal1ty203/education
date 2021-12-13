package homework8.RPG.Character.Class.Heals;

import homework8.RPG.Character.Class.Heal;

public class Velen extends Heal {

    public Velen(int physicalProtection, int magicProtection) {
        super(physicalProtection, magicProtection);
    }



    @Override
    public String getName() {
        return "Velen";
    }
}
