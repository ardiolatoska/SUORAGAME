
package map.structure;

import map.structure.Convento;

/**
 * La classe AllObject contiene le informazioni riguardanti i fantasmi del
 * gioco.
 *
 */
public class Fantasma {

    private final int id;
    private final String name;
    private final String description;
    private final Convento getCurrentConvento; // riguarda la posizione del fantasmo
    private final int damage; // riguarda il danno che arreca il fantasmo
    private int healthPoints; // riguarda la vita del fantasmo
    private boolean alive = true; // indica se il fantasmo è vivo o meno

    /**
     * Il costruttore crea un fantasmo e setta le varie informazioni.
     * 
     * @param id
     * @param name
     * @param description
     * @param currentConvento
     * @param healthPoints
     * @param damage
     */
    public Fantasma(int id, String name, String description, Convento currentConvento, int healthPoints, int damage) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.currentConvento = currentConvento;
        this.healthPoints = healthPoints;
        this.damage = damage;
    }

    // GETTER E SETTER

    /**
     * Il getter getId() restituisce l'id number del fantasma.
     * 
     * @return Restituisce l'id number del fantasma.
     */
    public int getId() {
        return id;
    }

    /**
     * Il getter getName() restituisce il nome del fantasma.
     * 
     * @return Restituisce nome del fantasma.
     */
    public String getName() {
        return name;
    }

    /**
     * Il getter getDescription() restituisce la descrizione del fantasma.
     * 
     * @return Restituisce la descrizione del fantasma.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Il getter getCurrentConvento() restituisce la posizione del fantasma.
     * 
     * @return Restituisce posizione del fantasma.
     */
    public Convento getCurrentConvento() {
        return currentPlace;
    }

    /**
     * Il getter getHealthPoints() restituisce i punti vita del fantasma.
     * 
     * @return Restituisce i punti vita del fantasma.
     */
    public int getHealthPoints() {
        return healthPoints;
    }

    /**
     * Il setter setHealthPoints(...) setta l'attributo "healthPoints"
     * durante il combattimento.
     * 
     * @param healthPoints
     */
    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    /**
     * Il getter getHealthPoints() restituisce il danno che arreca il fantasma.
     * 
     * @return Restituisce il danno che arreca il fantasma.
     */
    public int getDamage() {
        return damage;
    }

    /**
     * Il getter isAlive() restituisce true se il fantasma è vivo, false viceversa.
     * 
     * @return true se il fantasma è vivo, false viceversa.
     */
    public boolean isAlive() {
        return alive;
    }

    /**
     * Il setter setAlive(...) setta l'attributo "alive" del fantasma.
     * 
     * @param alive
     */
    public void setAlive(boolean alive) {
        this.alive = alive;
    }
}
