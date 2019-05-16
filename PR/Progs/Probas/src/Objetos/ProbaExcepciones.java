
package Objetos;

/**
 *
 * @author a18xacobopc
 */
public class ProbaExcepciones extends Exception {
    
        private String error;
        
        public ProbaExcepciones(){
        }
        
        public ProbaExcepciones(String message){
            super(message);
            this.error = message;
        }
        
        public String getError() {
            return error;
        }
}
