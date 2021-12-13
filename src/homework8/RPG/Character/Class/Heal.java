package homework8.RPG.Character.Class;

public class Heal extends Character {


    public Heal(int physicalProtection, int magicProtection) {
        super(physicalProtection, magicProtection);
    }

    @Override
    public void basicAtack(Character character) {
        String basicName = "Неистовство ветра";
        character.setHealth(character.getHealth() - (character.getPhysicalProtection() - getDamage()));
        System.out.println(basicName + ", здоровье игрока " + character.getName() + " " + character.getHealth());
        updateLevel();
        setCooldownAD(1);
    }

    @Override
    public void specialAtack(Character character) {
        String specialName = "Колодец Света";
        character.setHealth(character.getHealth() + 50);
        System.out.println(specialName + ", Здоровье игрока " + character.getName() + " " + character.getHealth());
        updateLevel();
        setCooldownAP(2);
    }



    @Override
    public void updateLevel() {
        super.updateLevel();
    }
}
