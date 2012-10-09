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

    
    @Override
    public void execute() {
        
        
    }

    public Command(commandType commandType) {
        this.commandType = commandType;
    }
    
}
