
package map.structure;

import java.util.ArrayList;
import java.util.List;

/**
 * La classe AllObject contiene la lista degli oggetti che
 * si possono raccogliere durante il gioco.
 */
public class AllObject {

    private List<AdvObject> list = new ArrayList<>(); // lista

    /**
     * Il metodo add(...) inserisce un oggetto all'interno della lista.
     * 
     * @param o
     */
    public void add(AdvObject o) {
        list.add(o);
    }

    /**
     * Il metodo remove(...) rimuove un oggetto all'interno della lista.
     * 
     * @param o
     */
    public void remove(AdvObject o) {
        list.remove(o);
    }

    // GETTER

    /**
     * Il getter getList() restituisce la lista di oggetti
     * che si possono raccogliere.
     * 
     * @return Restituisce la lista.
     */
    public List<AdvObject> getList() {
        return list;
    }
}
