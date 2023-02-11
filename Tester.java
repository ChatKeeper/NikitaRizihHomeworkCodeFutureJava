public class Tester extends Character{
    Tester(String name){
        super(name);
        try {if (!name.equals("Tester")){
            throw new NewCharacterExсeption();
            }
        }   catch (NewCharacterExсeption e){
            System.out.println("I am tester, not toster!");
                
        }
    }
    public void sayHello(){
        System.out.println("I am tester!");    
    }
}
