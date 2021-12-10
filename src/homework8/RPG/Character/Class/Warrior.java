package homework8.RPG.Character.Class;



public class Warrior extends Character {

    public Warrior() {
        super();
    }

    @Override
    void basicAtack(Character character) {
        String basicName = "Рассекающий удар";
        character.setHealth(character.getHealth()-27);
        System.out.println(basicName + ", здоровье игрока " + character.getName() + " " + character.getHealth());
    }

    @Override
    void specialAtack(Character character) {
        String specialName = "Кровавый фарш";
        character.setHealth(character.getHealth() - 150);
        System.out.println(specialName + ", Здоровье игрока " + character.getName() + " " + character.getHealth());
    }

    @Override
    protected void updateLevel() {
        super.updateLevel();
    }

}
