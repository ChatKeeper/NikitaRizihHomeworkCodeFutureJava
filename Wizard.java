public class Wizard extends Character{
    protected int mana = 200;
    Wizard(){
        super();
        System.out.println("I know so many spels, but can't remember my name...");
    }
    Wizard(String name){
        super(name);
    }
    @Override
    public void sayHello(){
        System.out.println("You shall not pass!... Until you clean your boots!");
    }

    public void attack(int damage, int mana){
        System.out.println("Eat this fireball, Rowan!"+ "\n" + "Rowan gets " + ((damage + (0.15 * mana))) + " damage!!!");
    }
}
