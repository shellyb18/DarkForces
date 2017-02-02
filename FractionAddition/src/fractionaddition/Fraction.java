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
public class Fraction {
    private final int numerator;
    private final int denominator;
    
    public Fraction(int numerator, int denominator){
        this.denominator = 1;
        this.numerator = 0;
    
    
    }

    
    public int getNumerator(){
        return this.numerator;
    }
    public int getDenominator(){
        return this.denominator;
    }
    
    @Override
    public String toString(){
        return "Fraction{" + "numerator=" + numerator + ", denominator=" + denominator + "}";
    }
    
}
