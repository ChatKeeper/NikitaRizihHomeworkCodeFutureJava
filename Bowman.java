public class Bowman extends Character{
    int bowExperience = 300;
    Bowman(){
        super();
        System.out.println("My name is whisper of my arrows!");
    }
    Bowman(String name){
        super(name);
    }
    @Override
    public void sayHello(){
        System.out.println("Whatever you say. As long as you pay me.");
    }
    public void attack (int damage, int bowExperience){
        System.out.println("Let me put an arrow in his head! Deals " + ((damage + (0.15 * bowExperience))) + " damage!!!");
    }
}
