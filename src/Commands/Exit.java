/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Commands;


/**
 *
 * @author Shelly.Baltazar
 */
public class Exit implements Command {
    

    @Override
    public String getName() {
        return "Exit";
    }

    @Override
    public String response(String[] args) {
        System.out.println("Bye!");
        System.exit(0);
        return null;
    }

    @Override
    public String[] getKeys() {
        return new String[]{"e","exit"};
    }
}
