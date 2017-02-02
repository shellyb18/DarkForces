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
public class Application {

    public static void main(String[] args) {
        
        Input input = new Input();
        input.askForInput();
        Fraction answer = input.getAnswer();
        Output output = new Output();
        output.output(answer);
        
        
    }
    
}
