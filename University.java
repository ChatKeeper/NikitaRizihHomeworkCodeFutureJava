public class University {
    public static void main (String[] args) {
    Teacher[] teachers = new Teacher[3];   
    for (int i = 0; i<3; i++){
        int typeOfcharacter = 1 + (int)(Math.random() * 2);
        String character;
        if (typeOfcharacter == 1) {character = "kind";}
        else {character = "evil";}
        teachers[i] = new Teacher("Gregory the" + (i + 1), 50 + i, character);
        }

    teachers[0].getRest();
    teachers[0].studentInfo();
    teachers[1].myStudents[0].getSomeSleep();
    teachers[1].myStudents[1].eatSomthing();
    teachers[1].myStudents[2].setName("Nikitos");
    System.out.println(teachers[1].myStudents[2].getName());   
    }
}