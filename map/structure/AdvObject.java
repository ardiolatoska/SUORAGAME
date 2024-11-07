
package map.structure;

/**
 * La classe AdvObject contiene le informazioni riguardanti
 * gli oggetti del gioco.
 * 
 */
public class AdvObject implements Comparable<AdvObject> {

    private final int id;
    private String name;
    private String description;
    private int damage; // riguarda le armi del combattimento
    private boolean openable = false; // riguarda gli oggetti contenitori
    private boolean pickupable = true; // riguarda gli oggetti raccoglibili
    private boolean pushable = false;
    private boolean collected = false; // riguarda gli oggetti raccolti
    private boolean open = false;
    private boolean push = false;

    /**
     * Questo costruttore viene utilizzato
     * per gli oggetti che non si possono raccogliere.
     * 
     * @param id
     */
    public AdvObject(int id) {
        this.id = id;
    }

    /**
     * Questo costruttore viene utilizzato
     * per oggetti che non arrecano danno.
     * 
     * @param id
     * @param name
     * @param description
     */
    public AdvObject(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    /**
     * Questo costruttore viene utilizzato
     * per oggetti che arrecano danno.
     * 
     * @param id
     * @param name
     * @param description
     * @param damage
     */
    public AdvObject(int id, String name, String description, int damage) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.damage = damage;
    }

    /**
     * Il metodo compareTo(...) confronta due oggetti in base al danno.
     * 
     * @param arg0
     * @return 1 se il danno corrente è maggiore di quello passato.
     * @return 0 se il danno corrente è uguale a quello passato.
     * @return -1 se il danno corrente è minore di quello passato.
     */
    @Override
    public int compareTo(AdvObject arg0) {

        if (this.getDamage() > arg0.getDamage()) {
            return 1;
        }
        if (this.getDamage() == arg0.getDamage()) {
            return 0;
        }
        return -1;
    }

    // GETTER E SETTER

    /**
     * Il getter getName() restituisce il nome dell'oggetto.
     * 
     * @return Nome dell'oggetto.
     */
    public String getName() {
        return name;
    }

    /**
     * Il getter getDescription() restituisce la descrizione dell'oggetto.
     * 
     * @return Descrizione dell'oggetto.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Il getter isOpenable() restituisce true se l'ogetto è apribile
     * false viceversa.
     * 
     * @return true se l'oggetto è apribile, false viceversa.
     */
    public boolean isOpenable() {
        return openable;
    }

    /**
     * Il setter setOpenable(...) setta l'attributo "openable" dell'oggetto.
     * 
     * @param openable
     */
    public void setOpenable(boolean openable) {
        this.openable = openable;
    }

    /**
     * Il getter isPickupable() restutisce true se l'oggetto
     * si può raccogliere, false viceversa.
     * 
     * @return true se l'oggetto si può raccogliere, false viceversa.
     */
    public boolean isPickupable() {
        return pickupable;
    }

    /**
     * Il setter sePickupable(...) setta l'attributo "pickupable" dell'oggetto.
     * 
     * @param pickupable
     */
    public void setPickupable(boolean pickupable) {
        this.pickupable = pickupable;
    }

    /**
     * Il getter isPushable() restituisce true se l'oogetto
     * si può inserire, false viceversa.
     * 
     * @return true se l'oggetto si può raccogliere, false viceversa.
     */
    public boolean isPushable() {
        return pushable;
    }

    /**
     * Il setter setPushable(...) setta l'attributo "pushable" dell'oggetto.
     * 
     * @param pushable
     */
    public void setPushable(boolean pushable) {
        this.pushable = pushable;
    }

    /**
     * Il getter isOpen() restituisce true se l'oggetto è aperto, false viceversa.
     * 
     * @return true se l'oggetto è aperto, false viceversa.
     */
    public boolean isOpen() {
        return open;
    }

    /**
     * Il setter setOpen(...) setta l'attributo "open" dell'oggetto.
     * 
     * @param open
     */
    public void setOpen(boolean open) {
        this.open = open;
    }

    /**
     * Il getter isPush() restituisce true se l'oggetto è stato inserito, false
     * viceversa.
     * 
     * @return true se l'oggetto è stato inserito, false viceversa.
     */
    public boolean isPush() {
        return push;
    }

    /**
     * Il setter setPush(...) setta l'attributo "push" dell'oggetto.
     * 
     * @param push
     */
    public void setPush(boolean push) {
        this.push = push;
    }

    /**
     * Il getter getId() restituisce l'id number dell'oggetto.
     * 
     * @return Restituisce l'id number dell'oggetto.
     */
    public int getId() {
        return id;
    }

    /**
     * Il getter getDamage() restituisce il danno che arreca un'arma.
     * 
     * @return Restituisce il danno che arreca un'arma.
     */
    public int getDamage() {
        return damage;
    }

    /**
     * Il setter setDamage(...) setta il danno che arreca un'arma.
     * 
     * @param damage
     */
    public void setDamage(int damage) {
        this.damage = damage;
    }

    /**
     * Il getter isCollected() restituisce true
     * se l'oggetto è stato raccolto, false viceversa.
     * 
     * @return
     */
    public boolean isCollected() {
        return collected;
    }

    /**
     * Il setter setCollected(...) setta l'attributo "collected" dell'oggetto.
     * 
     * @param collected
     */
    public void setCollected(boolean collected) {
        this.collected = collected;
    }
}
