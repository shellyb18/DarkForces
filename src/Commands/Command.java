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
public interface Command {
    
    public String getName(); //returns name of the function
    public String response(String[] args); //command get argument of result
    public String[] getKeys(); //returns string array of how you can implement command
    //public String getHelp();
    

    
    
    
}


   
