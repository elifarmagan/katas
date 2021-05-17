public class Fighter {

    public static void main(String[] args) {
        Fighter lew = new Fighter("Lew", 10, 2);
        Fighter harald = new Fighter("Harald", 20, 5);
        Fighter harry = new Fighter("Harry", 5, 4);
        Fighter jerry = new Fighter("Jerry", 30, 3);

        System.out.println(declareWinner(lew, harry, "Lew")); //Lew
        System.out.println(declareWinner(lew, harry, "Harry")); //Harry
        System.out.println(declareWinner(harald, harry, "Harry")); //Harald
    }

    public String name;
    public int health, damagePerAttack;

    public Fighter(String name, int health, int damagePerAttack) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }

    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {

        while (fighter1.health > 0 && fighter2.health > 0) {
            if (firstAttacker.equals(fighter1.name)) {
                fighter2.health -= fighter1.damagePerAttack;
                firstAttacker = fighter2.name;
            } else {
                fighter1.health -= fighter2.damagePerAttack;
                firstAttacker = fighter1.name;
            }

        }
        return fighter1.health <= 0 ? fighter2.name : fighter1.name;
    }
}
