package homework8.RPG.Character.Class;

public class Heal extends homework8.RPG.Character.Class.Character {

    public Heal() {
        super();
    }

    @Override
    void basicAtack(homework8.RPG.Character.Class.Character character) {
        String basicName = "Неистовство ветра";
        character.setHealth(character.getHealth() - 5);
        System.out.println(basicName + ", здоровье игрока " + character.getName() + " " + character.getHealth());
    }

    @Override
    void specialAtack(homework8.RPG.Character.Class.Character character) {
        String specialName = "Колодец Света";
        character.setHealth(character.getHealth() + 50);
        System.out.println(specialName + ", Здоровье игрока " + character.getName() + " " + character.getHealth());
    }

    @Override
    public void updateLevel() {
        super.updateLevel();
    }
}
