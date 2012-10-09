/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.cvut.fit.dpo.engine.model;

/**
 *
 * @author Hanz
 */
public interface CommandInterface {
    
        public enum commandType {GO , DROP, PICKUP, USE, TALK, UNDEFINED};
        public void execute();
}
