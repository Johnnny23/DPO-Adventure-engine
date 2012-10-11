/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.cvut.fit.dpo.engine.model;

import java.util.ArrayList;
import java.util.Collection;
/**
 *
 * @author Hanz
 */
public class Game {
    
        private Player player;
        private Collection<Room> listRooms;
        private Collection<CommandInterface> history = new ArrayList<>();
        
        public String proccedCommand(Command executedCommand){
            history.add(executedCommand);
            
            if(executedCommand.getCommandType() == CommandInterface.commandType.UNDEFINED){
                return "Tohle nepodporujeme chlapče"; 
                // hlášky ještě nějak centralizovat, možná bych na ně udělal celou classu
            }
            
            return null;
        }
}
