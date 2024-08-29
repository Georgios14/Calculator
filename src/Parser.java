public class Parser {

    public double[] getParsedNums (String givenSubstring){

        double[] parsedNums = new double[2];

        int symbolIndex = 0;


        for (int i = 0; i < givenSubstring.length(); i++){

            if ( givenSubstring.charAt(i) == '*' || givenSubstring.charAt(i) == '/' || givenSubstring.charAt(i) == '+' || givenSubstring.charAt(i) == '-')
                symbolIndex = i;

        }


        parsedNums[0] = Double.parseDouble(String.valueOf(givenSubstring.substring(0,symbolIndex)));
        parsedNums[1] = Double.parseDouble(String.valueOf(givenSubstring.substring(symbolIndex+1,givenSubstring.length())));

        System.out.println(parsedNums[0] + " " + parsedNums[1]);

        return parsedNums;
    }

}
