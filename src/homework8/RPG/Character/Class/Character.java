package homework8.RPG.Character.Class;

abstract class Character {
    private String name;
    private int lvl,damage,cooldownAD, cooldownAP;
    private int health, physicalProtection, magicProtection, id;
    private static int idCounter = 0;

    public Character(int physicalProtection, int magicProtection) {
        this.name = getName();
        this.health = health();
        this.physicalProtection = physicalProtection;
        this.magicProtection = magicProtection;
        this.id = CreateID();
        this.lvl = getLvl();
        this.damage = damage();
    }

    public int health(){
        if (getLvl() == 0) setLvl(1);
        return (int)(50* (getLvl()*1.5));
    }

    private int damage(){
        if (getLvl() == 0) setLvl(1);
        return (int)(10* (getLvl()*1.2));
    }

    void basicAtack(Character character){
    }

    void specialAtack(Character character){}


    protected void updateLevel(){
        setLvl(getLvl() +1);
    }

    private static synchronized int CreateID(){
        return idCounter++;
    }

    public  int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
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


    public int getMagicProtection() {
        return magicProtection;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCooldownAD() {
        return cooldownAD;
    }

    public void setCooldownAD(int cooldown) {
        this.cooldownAD = cooldown;
    }

    public int getCooldownAP() {
        return cooldownAP;
    }

    public void setCooldownAP(int cooldownAP) {
        this.cooldownAP = cooldownAP;
    }

    public int getId() {
        return id;
    }
}
