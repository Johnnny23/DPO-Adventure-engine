/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.cvut.fit.dpo.engine.model;

/**
 *
 * @author Hanz
 */
public class Command implements CommandInterface {
    private commandType commandType;

    public String[] getCommandArguments() {
        return commandArguments;
    }

    public commandType getCommandType() {
        return commandType;
    }
    private String [] commandArguments;

    
    @Override
    public void execute() {
        
        
    }

    public Command(commandType commandType, String [] commandArguments) {
        this.commandType = commandType;
        this.commandArguments = commandArguments;
    }
    
}
