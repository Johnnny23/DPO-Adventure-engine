/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.cvut.fit.dpo.engine;

import cz.cvut.fit.dpo.engine.model.Command;
import cz.cvut.fit.dpo.engine.model.CommandInterface;
import cz.cvut.fit.dpo.engine.model.Game;
import cz.cvut.fit.dpo.engine.model.Room;
import java.io.*;
import java.util.ArrayList;
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
        private File file = new File("gameData_1");
        
        public void executeControllLoop() throws FileNotFoundException, IOException{
            viewGame = new View();
            modelGame = initGame();
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

    private Game initGame() throws FileNotFoundException, IOException { // můžem mu dát třeba parametr z příkazovky, tady to bude staticky
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr); // dodáme try catch finally
        String line;
        ArrayList<Room> tempList = new ArrayList<>();
        
        while((line = br.readLine()) != null){
            //tady naparsovat vstup Room ze souboru a list předat kontruktoru Room
            
         
        }
        
        return null;
    }
    
}
