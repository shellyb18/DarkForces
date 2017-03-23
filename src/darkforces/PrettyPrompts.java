/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package darkforces;

/**
 *
 * @author Shelly.Baltazar
 */

public class PrettyPrompts {
    private String userName;
    private String userName2;

    public PrettyPrompts(String uN, String uN2) {
        this.userName = uN.toLowerCase();
        this.userName2 = uN2.toLowerCase();
    }

    public String prompt1() {
        char[] firstUN = userName.toCharArray();
        firstUN[0] = Character.toUpperCase(firstUN[0]);
        
        int max = userName.length();
        max = (userName.length() > userName2.length()) ? userName.length() : userName2.length();
        String uN1;
        if (firstUN.length == max) {
            uN1 = String.valueOf(firstUN) + " > ";
        } else {
            String space = "";
            for (int i = firstUN.length; i < max; i++) {
                space += " ";
            }
            uN1 = String.valueOf(firstUN) + space + " > ";
        }
        
        return uN1;
    }

    public String prompt2() {
        char[] secondUN = userName2.toCharArray();
        secondUN[0] = Character.toUpperCase(secondUN[0]);
        
        int max = userName.length();
        
        max = (userName.length() > userName2.length()) ? userName.length() : userName2.length();
        String uN2;
        
        if (secondUN.length == max) {
            uN2 = String.valueOf(secondUN) + " > ";
        } else {
            String space = "";
            for (int i = secondUN.length; i < max; i++) {
                space += " ";
            }
            uN2 = String.valueOf(secondUN) + space + " > ";
        }
        
        return uN2;
    }
}
