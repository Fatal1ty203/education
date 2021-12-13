package homework8.RPG.Character.Class.Warriors;

import homework8.RPG.Character.Class.Warrior;

public class VarianWrynn extends Warrior {

    public VarianWrynn(int physicalProtection, int magicProtection) {
        super(physicalProtection, magicProtection);
    }

    @Override
    public String getName() {
        return "VarianWrynn";
    }
}
