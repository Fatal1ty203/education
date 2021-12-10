package homework8.RPG.Character.Class;



public class Mage extends Character {

    public Mage() {
        super();
    }

    @Override
    void basicAtack(Character character) {
        String basicName = "Ледяное копье";
        character.setHealth(character.getHealth() - 15);
        System.out.println(basicName + ", здоровье игрока " + character.getName() + " " + character.getHealth());
    }

    @Override
    void specialAtack(Character character) {
        String specialName = "Ледяная хватка";
        character.setHealth(character.getHealth() - 50);
        System.out.println(specialName + ", Здоровье игрока " + character.getName() + " " + character.getHealth());
    }

    @Override
    protected void updateLevel() {
        super.updateLevel();
    }

}
