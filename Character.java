public class Character {
    protected int hitPoints = 100;
    protected int damage = 5;
    protected String name;

    Character(){
        System.out.println("Just a character");  
    }
    Character(String name){
        this.name = name;
        System.out.println("My name is " + name);
        this.sayHello();
        this.beStupid();
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void sayHello(){
        System.out.println("I am just poorly written minor character, that will be forgotten in a few seconds..." + "\n" + "Good luck adventurer!");
    }
    public void attack(int damage, int hitPoints){
        System.out.println("Eat this garlic, Rowan!"+ "\n" + "Rowan gets " + ((damage + (0.15 * hitPoints))) + " damage!!!");
    }
    public void beStupid() {
        System.out.println("Don't look at me that way, I just running throgh this wall!");
    }
}
