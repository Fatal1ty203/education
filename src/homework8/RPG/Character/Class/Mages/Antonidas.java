package homework8.RPG.Character.Class.Mages;

import homework8.RPG.Character.Class.Mage;

public class Antonidas extends Mage {

    public Antonidas(int physicalProtection, int magicProtection) {
        super(physicalProtection, magicProtection);
    }


    @Override
    public String getName() {
        return "Antonidas";
    }
}
