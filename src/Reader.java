import java.util.Scanner;

public class Reader {

    public String readEquation(){

        Scanner read = new Scanner(System.in);
        System.out.println("\nEnter an equation:");

        return read.nextLine();

    }

}
