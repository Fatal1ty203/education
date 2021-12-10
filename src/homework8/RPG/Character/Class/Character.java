package homework8.RPG.Character.Class;

abstract class Character {
    String name;
    private static int lvl,damage;
    int health, physicalProtection, magicProtection, id;
    private static int idCounter = 0;

    public Character() {
        this.name = getName();
        this.lvl = lvl;
        this.health = health();
        this.damage = damage();
        this.id = CreateID();
    }

    private static int health(){
        return (int)(50* Character.lvl*1.5);
    }

    private static int damage(){
        return (int)(10*lvl*1.2);
    }

    void basicAtack(Character character){}

    void specialAtack(Character character){}


    protected void updateLevel(){
        setLvl(getLvl() +1);
    }

    private static synchronized int CreateID(){
        return idCounter++;
    }

    public static int getLvl() {
        return lvl;
    }

    public static void setLvl(int lvl) {
        Character.lvl = lvl;
    }

    public static int getDamage() {
        return damage;
    }

    public static void setDamage(int damage) {
        Character.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getPhysicalProtection() {
        return physicalProtection;
    }

    public void setPhysicalProtection(int physicalProtection) {
        this.physicalProtection = physicalProtection;
    }

    public int getMagicProtection() {
        return magicProtection;
    }

    public void setMagicProtection(int magicProtection) {
        this.magicProtection = magicProtection;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
