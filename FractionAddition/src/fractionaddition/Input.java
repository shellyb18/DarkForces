package fractionaddition;


import java.util.Scanner;

/**
 *
 * @author Shelly.Baltazar
 */
public class Input {
    
    private Fraction answer;

    public void askForInput() {

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter first fraction: ");
        String fraction1 = scan.nextLine();
        Fraction f1 = this.parseString(fraction1);
        
        System.out.println("Enter second fraction: ");
        String fraction2 = scan.nextLine();
        Fraction f2 = this.parseString(fraction2);
        
        answer = Addition.add(f1,f2);
        

    }
    public Fraction getAnswer(){
        return answer;
    }

    public Fraction parseString(String fraction) {

        String[] numberString = fraction.split("/");
//        int[] num = new int[numberString.length];
//        for (int i = 0; i < numberString.length; i++) {
//            int integer = Integer.parseInt(numberString[i]);
//            num[i] = integer;
////            System.out.println(integer);
//        }
        int numerator = Integer.parseInt(numberString[0]);
        int denominator = Integer.parseInt(numberString[0]);
        return new Fraction(numerator, denominator);
    }

   
}
