/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.cvut.fit.dpo.engine;

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

    private void createCommand(String inputLine) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
    
}
