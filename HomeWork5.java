public class HomeWork5 {
    public static void main(String[] args) {
        Character c2 = new Character("Gabriel");
        c2.attack(c2.damage, c2.hitPoints);
        
        Wizard w1 = new Wizard("Baradur");
        w1.attack(w1.damage, w1.mana);

        Bowman b1 = new Bowman("Ranger");
        b1.attack(b1.damage, b1.bowExperience);
        
        Tester t1 = new Tester("fhaskjh");
    }
}