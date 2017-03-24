/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package darkforces1;

/**
 *
 * @author shelbaltz
 */
public class AngryChatBotClient implements MessageClient {

    @Override
    public String send(String message) {
        String msgBack = "";
        if (message.contains("computer")){
            msgBack = "That is Mr. Computer to you";
        }else if(message.contains("Hello World")){
            msgBack = "Welcome to the machine Hal";
        }else{
            for (int i = message.length() - 1; i >= 0; i--){
                msgBack = msgBack + message.charAt(i);
            }
        }
        return msgBack;
    }
    
}
