/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.cvut.fit.dpo.engine;

import cz.cvut.fit.dpo.engine.model.Command;
import cz.cvut.fit.dpo.engine.model.CommandInterface;
import cz.cvut.fit.dpo.engine.model.Game;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Hanz
 */
public class Controller {
    
        private View viewGame;
        private Game modelGame;
        private Command actualCommand;
        
        public void executeControllLoop(){
            viewGame = new View();
            modelGame = new Game();
            Scanner sc = new Scanner(System.in);
            String inputLine;
            String returnMessage;
            while(true){
                inputLine = sc.nextLine();
                actualCommand = createCommand(inputLine);
                returnMessage = modelGame.proccedCommand(actualCommand);
                viewGame.displayMessage(returnMessage);
            }
        }

    public Command createCommand(String inputLine) {
        System.out.println(inputLine);
        if(inputLine.trim() == null){
            return new Command(CommandInterface.commandType.UNDEFINED, null);
        }
        String[] commandArguments = inputLine.split(" ", 4); // 4 protože máme max čtyř slový příkaz :-)
        System.out.println(" aha" + commandArguments[0]);
            int iterator = 0;
            for(CommandInterface.commandType commandType : CommandInterface.commandType.values()){
                if(commandType.toString().equalsIgnoreCase(commandArguments[0])){
                    String [] arguments = Arrays.copyOfRange(commandArguments, 1, commandArguments.length);
                    return new Command(commandType.values()[iterator], arguments);
                }
                iterator++;
                
            }
        
            
        return new Command(CommandInterface.commandType.UNDEFINED, null);
    }
    
}
