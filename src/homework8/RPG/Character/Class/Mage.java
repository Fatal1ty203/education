package homework8.RPG.Character.Class;



public class Mage extends Character {


    public Mage(int physicalProtection, int magicProtection) {
        super(physicalProtection, magicProtection);
    }

    @Override
    void basicAtack(Character character) {
        String basicName = "Ледяное копье";
        character.setHealth(character.getHealth() - (character.getPhysicalProtection() - getDamage()));
        System.out.println(basicName + ", здоровье игрока " + character.getName() + " " + character.getHealth());
        updateLevel();
        setCooldownAD(1);
    }

    @Override
    void specialAtack(Character character) {
        String specialName = "Ледяная хватка";
        character.setHealth(character.getHealth()- (character.getMagicProtection() - 50));
        System.out.println(specialName + ", Здоровье игрока " + character.getName() + " " + character.getHealth());
        updateLevel();
        setCooldownAP(3);
    }

    @Override
    protected void updateLevel() {
        super.updateLevel();
    }

}
