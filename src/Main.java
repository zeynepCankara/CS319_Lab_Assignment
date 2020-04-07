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
    }
}