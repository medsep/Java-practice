
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author meh
 */
public class MessagingService {
    
    private ArrayList<Message> messages;
    
    public MessagingService(){
    this.messages=new ArrayList<>();
    }
    
    /**
     * - adds a message passed as a parameter to the messaging service as long 
     * as the message content is at most 280 characters long.
     * @param message 
     */
    public void add(Message message){
        if (message.getContent().length() <= 280) {
            this.messages.add(message);
        }
        //this.messages.add(message);
    }
    /**
     *  - returns the messages added to the messaging service.
     */        
    public ArrayList<Message> getMessages(){
       return messages;
    }
}
