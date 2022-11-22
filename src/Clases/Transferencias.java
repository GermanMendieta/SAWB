package Clases;

/**
 *
 * @author Giuliano
 */
public class Transferencias {
    int id;
    Debito emisor;
    Debito receptor;

    public Transferencias(int id, Debito emisor, Debito receptor) {
        this.id = id;
        this.emisor = emisor;
        this.receptor = receptor;
    }
    
    
}
