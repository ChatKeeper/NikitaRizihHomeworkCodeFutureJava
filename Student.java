public class Student {

    int age;
    private String name;
    double sleepHours;
    
    public void setName(String name){
        this.name = name;
    }

    String getName(){
        return this.name;
    }

    Student(){}

    Student(int age, String name){
        this.age = age;
        this.name = name;
        this.sleepHours = 0;
    }

    public void getSomeSleep() {
        this.sleepHours =+ 0.5;
        System.out.println(name + ": Now I feel better, but this is not enough...");
    }

    public void eatSomthing(){
        System.out.println(name + ": I ate something. My ability to live increased!!!");
    }
}
