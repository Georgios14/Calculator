
public class Main {
    public static void main(String[] args) {

        System.out.printf("Hello and welcome!");

        Calculator calculator = new Calculator();
        Parser parser = new Parser();
        Reader reader = new Reader();

        String givenEquation = reader.readEquation();
        String solvedEquation = "";
        String substring;

        int numOfMultAndDiv = 0, numOfAddAndSub = 0;
        int startingIndex = 0;
        int endingIndex = givenEquation.length()-1;

        double answer = 0;

        boolean solution = false;

        for (int j = 0; j < givenEquation.length(); j++ ){

            if ( givenEquation.charAt(j) == '*'|| givenEquation.charAt(j) == '/')
                numOfMultAndDiv++;
            if ( givenEquation.charAt(j) == '+'|| givenEquation.charAt(j) == '-' )
                numOfAddAndSub++;

        }

        while(!solution){

            int i;

            for ( i = 0; i < givenEquation.length(); i++){

                if (givenEquation.charAt(i) == '*'){

                    for (int k = i-1; k >= 0; k--){

                        if (givenEquation.charAt(k) == '*' || givenEquation.charAt(k) == '/' || givenEquation.charAt(k) == '+' || givenEquation.charAt(k) == '-'){

                            startingIndex = k+1;

                        }

                    }

                    for (int k = i+1; k < givenEquation.length(); k++){

                        if (givenEquation.charAt(k) == '*' || givenEquation.charAt(k) == '/' || givenEquation.charAt(k) == '+' || givenEquation.charAt(k) == '-'){

                            endingIndex = k;
                            break;

                        }

                    }

                    if ((numOfAddAndSub == 0 && numOfMultAndDiv == 1) || (numOfAddAndSub == 1 && numOfMultAndDiv == 0))
                        substring = givenEquation;
                    else
                        substring = givenEquation.substring(startingIndex,endingIndex);

                    double[] nums = parser.getParsedNums(substring);

                    answer = calculator.Mult(nums[0],nums[1]);

                    String replacement = String.valueOf(answer);
                    givenEquation = givenEquation.replace(substring,replacement);

                    numOfMultAndDiv--;
                    startingIndex = 0;
                    endingIndex = givenEquation.length();
                    break;

                }
                else if (givenEquation.charAt(i) == '/'){

                    for (int k = i-1; k >= 0; k--){

                        if (givenEquation.charAt(k) == '*' || givenEquation.charAt(k) == '/' || givenEquation.charAt(k) == '+' || givenEquation.charAt(k) == '-'){

                            startingIndex = k+1;

                        }

                    }

                    for (int k = i+1; k < givenEquation.length(); k++){

                        if (givenEquation.charAt(k) == '*' || givenEquation.charAt(k) == '/' || givenEquation.charAt(k) == '+' || givenEquation.charAt(k) == '-'){

                            endingIndex = k;
                            break;

                        }

                    }

                    if ((numOfAddAndSub == 0 && numOfMultAndDiv == 1) || (numOfAddAndSub == 1 && numOfMultAndDiv == 0))
                        substring = givenEquation;
                    else
                        substring = givenEquation.substring(startingIndex,endingIndex);

                    double[] nums = parser.getParsedNums(substring);

                    answer = calculator.Div(nums[0],nums[1]);

                    String replacement = String.valueOf(answer);
                    givenEquation = givenEquation.replace(substring,replacement);

                    numOfMultAndDiv--;
                    startingIndex = 0;
                    endingIndex = givenEquation.length();
                    break;

                }
                else if ( givenEquation.charAt(i) == '-' && numOfMultAndDiv == 0 ){

                    for (int k = i-1; k >= 0; k--){

                        if (givenEquation.charAt(k) == '*' || givenEquation.charAt(k) == '/' || givenEquation.charAt(k) == '+' || givenEquation.charAt(k) == '-'){

                            startingIndex = k+1;

                        }

                    }

                    for (int k = i+1; k < givenEquation.length(); k++){

                        if (givenEquation.charAt(k) == '*' || givenEquation.charAt(k) == '/' || givenEquation.charAt(k) == '+' || givenEquation.charAt(k) == '-'){

                            endingIndex = k;
                            break;

                        }

                    }

                    if ((numOfAddAndSub == 0 && numOfMultAndDiv == 1) || (numOfAddAndSub == 1 && numOfMultAndDiv == 0))
                        substring = givenEquation;
                    else
                        substring = givenEquation.substring(startingIndex,endingIndex);

                    double[] nums = parser.getParsedNums(substring);

                    answer = calculator.Sub(nums[0],nums[1]);

                    String replacement = String.valueOf(answer);
                    givenEquation = givenEquation.replace(substring,replacement);

                    numOfAddAndSub--;
                    startingIndex = 0;
                    endingIndex = givenEquation.length();
                    break;

                }
                else if ( givenEquation.charAt(i) == '+' && numOfMultAndDiv == 0 ){

                    for (int k = i-1; k >= 0; k--){

                        if (givenEquation.charAt(k) == '*' || givenEquation.charAt(k) == '/' || givenEquation.charAt(k) == '+' || givenEquation.charAt(k) == '-'){

                            startingIndex = k+1;

                        }

                    }

                    for (int k = i+1; k < givenEquation.length(); k++){

                        if (givenEquation.charAt(k) == '*' || givenEquation.charAt(k) == '/' || givenEquation.charAt(k) == '+' || givenEquation.charAt(k) == '-'){

                            endingIndex = k;
                            break;

                        }

                    }

                    if ((numOfAddAndSub == 0 && numOfMultAndDiv == 1) || (numOfAddAndSub == 1 && numOfMultAndDiv == 0))
                        substring = givenEquation;
                    else
                        substring = givenEquation.substring(startingIndex,endingIndex);

                    double[] nums = parser.getParsedNums(substring);

                    answer = calculator.Add(nums[0],nums[1]);

                    String replacement = String.valueOf(answer);
                    givenEquation = givenEquation.replace(substring,replacement);

                    numOfAddAndSub--;
                    startingIndex = 0;
                    endingIndex = givenEquation.length();
                    break;

                }

            }

            if(numOfAddAndSub == 0 && numOfMultAndDiv == 0) {
                solvedEquation = givenEquation;
                solution = true;
            }

        }

        System.out.println("\n The solution is: " + solvedEquation);

    }
}