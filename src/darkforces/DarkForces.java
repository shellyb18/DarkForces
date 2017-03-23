/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package darkforces;

import static darkforces.ClientContext.WarningStatement;
import java.util.Scanner;

/**
 *
 * @author Shelly.Baltazar
 */
public class DarkForces {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome - do not do anything stupid.");
        
        WarningStatement();

        System.out.print("Enter your username: ");
        String userName = scanner.nextLine();
        
        PrettyPrompts prettyPrompts = new PrettyPrompts(userName, "Computer");
        userName = prettyPrompts.prompt1();
        String myFriend = prettyPrompts.prompt2();
        String myFriendsMessage = "";

        String input = "";

        do {

            System.out.print(userName);
            input = scanner.nextLine();
            myFriendsMessage = input;
            System.out.println(myFriend + myFriendsMessage);

        } while (!input.equalsIgnoreCase("Exit"));

    }


}
