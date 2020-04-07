import java.util.ArrayList; 

public class Main {
    public static void main(String []args){
    ArrayList<Integer> ArrayList1 = new ArrayList<>();
    ArrayList1.add(100);
    ArrayList1.add(500);
    ArrayList1.add(900);
    ArrayList<Integer> ArrayList2 = new ArrayList<>();
    ArrayList2.add(800);
    ArrayList2.add(600);
    ArrayList2.add(300);
    ArrayList<Integer> ArrayList3 = new ArrayList<>();
    ArrayList3.add(400);
    ArrayList3.add(700);
    ArrayList3.add(200);

    ArrayOrganizer ao = new ArrayOrganizer();
    ArrayList<Integer> res = ao.concatAndSort(ArrayList1, ArrayList2, ArrayList3);
    System.out.println("Result => " + res);

    Player tom = new Player("Tom");
    Player john = new Player("John");
    Player james = new Player("James");
    Player henry = new Player("Henry");

    Die die = new Die();

    for(int i = 0; i < 5; i++){
        int current_point = die.rollDie();
        tom.addScore(current_point);
    }
    for(int i = 0; i < 5; i++){
        int current_point = die.rollDie();
        john.addScore(current_point);
    }
    for(int i = 0; i < 5; i++){
        int current_point = die.rollDie();
        james.addScore(current_point);
    }
    for(int i = 0; i < 5; i++){
        int current_point = die.rollDie();
        henry.addScore(current_point);
    }

    System.out.println("Tom has " + tom.getScore() + " points.");
    System.out.println("Jonh has " + john.getScore() + " points.");
    System.out.println("James has " + james.getScore() + " points.");
    System.out.println("Henry has " + henry.getScore() + " points.");

    System.​out.​println("​Successfully reverted in Git")​;
    }
}