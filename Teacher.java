public class Teacher {
     
    String name;
    int age;
    String character;
    Student[] myStudents = new Student[3];

    Teacher(String name, int age, String character){
        this.name = name;
        this.age = age;
        this.character = character;
        for(int i = 0; i<3; i++){
            myStudents[i] = new Student(i + 20, "Alexander the " + (i + 1));
        }
    }

    public void studentInfo(){
        for(int i = 0; i<3; i++){
            System.out.println(myStudents[i].getName() + " age: " + myStudents[i].age + " Hours of sleep: " + myStudents[i].sleepHours);
        }
    }

    public void getRest(){
        if (this.character == "kind"){
            System.out.println("Go get some rest students");
            for(int i = 0; i<3; i++){
                myStudents[i].getSomeSleep();
                myStudents[i].eatSomthing();
            }
        }
        else{
            System.out.println("Don't sleep on my lessons!!!");
        }
    }
}
public class Teacher {
     
    String name;
    int age;
    String character;
    Student[] myStudents = new Student[3];

    Teacher(String name, int age, String character){
        this.name = name;
        this.age = age;
        this.character = character;
        for(int i = 0; i<3; i++){
            myStudents[i] = new Student(i + 20, "Alexander the " + (i + 1));
        }
    }

    public void studentInfo(){
        for(int i = 0; i<3; i++){
            System.out.println(myStudents[i].getName() + " age: " + myStudents[i].age + " Hours of sleep: " + myStudents[i].sleepHours);
        }
    }

    public void getRest(){
        if (this.character == "kind"){
            System.out.println("Go get some rest students");
            for(int i = 0; i<3; i++){
                myStudents[i].getSomeSleep();
                myStudents[i].eatSomthing();
            }
        }
        else{
            System.out.println("Don't sleep on my lessons!!!");
        }
    }
}
