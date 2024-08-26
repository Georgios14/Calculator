
public class Main {
    public static void main(String[] args) {

        System.out.printf("Hello and welcome!");

        Reader reader = new Reader();

        String givenEquation = reader.readEquation();
        String alteredEquation = "";

        Calculator calculator = new Calculator();
        Parser parser = new Parser();

        boolean solution = false;

        while(!solution){



            if (alteredEquation.length() == 1)
                solution = true;

        }

    }
}