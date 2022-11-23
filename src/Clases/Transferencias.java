package Clases;

/**
 *
 * @author Giuliano
 */
public class Transferencias {
    static int cantidad;
    int id;
    Debito emisor;
    Debito receptor;

    public Transferencias(int id, Debito emisor, Debito receptor) {
        this.id = id;
        this.emisor = emisor;
        this.receptor = receptor;
    }
    
    public Transferencias(Debito emisor, Debito receptor) {
        this.id = ++cantidad;
        this.emisor = emisor;
        this.receptor = receptor;
    }
    
}
