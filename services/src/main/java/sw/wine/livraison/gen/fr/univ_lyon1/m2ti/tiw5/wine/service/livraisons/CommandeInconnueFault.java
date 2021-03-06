
package sw.wine.livraison.gen.fr.univ_lyon1.m2ti.tiw5.wine.service.livraisons;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.6.2
 * 2013-10-16T18:13:09.192+02:00
 * Generated source version: 2.6.2
 */

@WebFault(name = "commandeInconnue", targetNamespace = "http://www.univ-lyon1.fr/M2TI/TIW5/wine/service/livraisons/")
public class CommandeInconnueFault extends Exception {
    
    private java.lang.String commandeInconnue;

    public CommandeInconnueFault() {
        super();
    }
    
    public CommandeInconnueFault(String message) {
        super(message);
    }
    
    public CommandeInconnueFault(String message, Throwable cause) {
        super(message, cause);
    }

    public CommandeInconnueFault(String message, java.lang.String commandeInconnue) {
        super(message);
        this.commandeInconnue = commandeInconnue;
    }

    public CommandeInconnueFault(String message, java.lang.String commandeInconnue, Throwable cause) {
        super(message, cause);
        this.commandeInconnue = commandeInconnue;
    }

    public java.lang.String getFaultInfo() {
        return this.commandeInconnue;
    }
}
