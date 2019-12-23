package fr.pisano.pokemon;

public class Base {
    private int HP;
    private int Attack;
    private int Defense;
    private int SpAttack;
    private int SpDefense;
    private int Speed;

    public Base(){

    }

    public Base(int HP, int attack, int defense, int spAttack, int spDefense, int speed) {
        this.HP = HP;
        Attack = attack;
        Defense = defense;
        SpAttack = spAttack;
        SpDefense = spDefense;
        Speed = speed;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getAttack() {
        return Attack;
    }

    public void setAttack(int attack) {
        Attack = attack;
    }

    public int getDefense() {
        return Defense;
    }

    public void setDefense(int defense) {
        Defense = defense;
    }

    public int getSpAttack() {
        return SpAttack;
    }

    public void setSpAttack(int spAttack) {
        SpAttack = spAttack;
    }

    public int getSpDefense() {
        return SpDefense;
    }

    public void setSpDefense(int spDefense) {
        SpDefense = spDefense;
    }

    public int getSpeed() {
        return Speed;
    }

    public void setSpeed(int speed) {
        Speed = speed;
    }

    @Override
    public String toString() {
        return "Base{" +
                "HP=" + HP +
                ", Attack=" + Attack +
                ", Defense=" + Defense +
                ", SpAttack=" + SpAttack +
                ", SpDefense=" + SpDefense +
                ", Speed=" + Speed +
                '}';
    }
}
