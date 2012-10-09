/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.cvut.fit.dpo.engine;

import cz.cvut.fit.dpo.engine.model.Command;
import cz.cvut.fit.dpo.engine.model.CommandInterface;
import cz.cvut.fit.dpo.engine.model.Game;
import java.util.Scanner;

/**
 *
 * @author Hanz
 */
public class Controller {
    
        private View viewGame;
        private Game modelGame;
        
        public void executeControllLoop(){
            viewGame = new View();
            modelGame = new Game();
            Scanner sc = new Scanner(System.in);
            String inputLine;
            String returnMessage;
            while(true){
                inputLine = sc.nextLine();
                createCommand(inputLine);
                returnMessage = modelGame.proccedCommand();
                viewGame.displayMessage(returnMessage);
            }
        }

    public Command createCommand(String inputLine) {
        System.out.println(inputLine);
        if(inputLine.trim() == null){
            return new Command(CommandInterface.commandType.UNDEFINED);
        }
        String[] commandArguments = inputLine.split(" ", 2);
        System.out.println(" aha" + commandArguments[0]);
            int iterator = 0;
            for(CommandInterface.commandType commandType : CommandInterface.commandType.values()){
                if(commandType.toString().equalsIgnoreCase(commandArguments[0])){
                    return new Command(commandType.values()[iterator]);
                }
                iterator++;
            }
        // tady dodělat parsování vstupu
        
        return new Command(CommandInterface.commandType.UNDEFINED);
    }
    
}
