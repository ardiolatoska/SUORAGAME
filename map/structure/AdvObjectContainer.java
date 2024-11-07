
package map.structure;

import java.util.ArrayList;
import java.util.List;

/**
 * La classe AdvObjectContainer contiene le informazioni riguardanti
 * gli oggetti del gioco.
 * Eredita per estensione da AdvObject.
 */
public class AdvObjectContainer extends AdvObject {

    private List<AdvObject> list = new ArrayList<>(); // lista

    /**
     * Il costruttore crea un oggetto contenitore e viene assegnato un id.
     * 
     * @param id
     */
    public AdvObjectContainer(int id) {
        super(id);
    }

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
     * contenuti nell'oggetto contenitore.
     * 
     * @return Restituisce la lista.
     */
    public List<AdvObject> getList() {
        return list;
    }
}
