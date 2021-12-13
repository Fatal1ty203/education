package homework8.RPG.Character.Class;



public class Warrior extends Character {


    public Warrior(int physicalProtection, int magicProtection) {
        super(physicalProtection, magicProtection);
    }

    @Override
    void basicAtack(Character character) {
        String basicName = "Рассекающий удар";
        character.setHealth(character.getHealth() - (character.getPhysicalProtection() - getDamage()));
        System.out.println(basicName + ", здоровье игрока " + character.getName() + " " + character.getHealth());
        updateLevel();
        setCooldownAD(1);
    }

    @Override
    void specialAtack(Character character) {
        String specialName = "Кровавый фарш";
        character.setHealth(character.getHealth() - (character.getMagicProtection() - 150));
        System.out.println(specialName + ", Здоровье игрока " + character.getName() + " " + character.getHealth());
        setCooldownAP(3);
    }

    @Override
    protected void updateLevel() {
        super.updateLevel();
    }

}
