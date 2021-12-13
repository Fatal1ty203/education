package homework8.RPG.Character.Class.Heals;

import homework8.RPG.Character.Class.Heal;

public class Senjin extends Heal {

    @Override
    public String getName() {
        return "Senjin";
    }

    public Senjin(int physicalProtection, int magicProtection) {
        super(physicalProtection, magicProtection);
    }
}
