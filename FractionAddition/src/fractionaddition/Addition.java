/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fractionaddition;

/**
 *
 * @author Shelly.Baltazar
 */
public class Addition {
    
    
    public static Fraction add(Fraction f1, Fraction f2){
        
//        if (f1.getDenominator() != f2.getDenominator()){
//            throw new IllegalArgumentException("Error");
//        }
        
        int resultNumerator = f1.getNumerator() + f2.getNumerator();
//        int resultDenominator1 = f1.getDenominator();
//        int resultDenominator2 = f2.getDenominator();
        Addition add = new Addition();
        int resultDenominator = add.getGCF(f1.getDenominator(), f2.getDenominator());
        
        return new Fraction(resultNumerator, resultDenominator);
    
    }

    
    
    public int getGCF(int denominator1, int denominator2){
        while (denominator1 != denominator2){
            if (denominator1 > denominator2){
                denominator1 -= denominator2;
            }else{
                denominator2 -= denominator1;
            }
        }
        return denominator1;
        
    
    }
    public int getLCM(int a, int b){
        return (a*b)/ getGCF(a,b);
    }
}
