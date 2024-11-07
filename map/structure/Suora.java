
package map.structure;

/**
 * La classe Suora contiene tutte le informazioni riguardanti
 * il protagonista del gioco, che è la suora
 */
public class Suora {

    private String name;
    private int healthPoints = 100; // punti vita della suora
    private Place currentPlace; // luogo in cui si trova il suora

    /**
     * Costruttore della suora
     */
    public Suora() {

    }

    // GETTER E SETTER

    /**
     * Il getter getName() restituisce il nome della suora.
     * 
     * @return Restituisce il nome.
     */
    public String getName() {
        return name;
    }

    /**
     * Il setter setName(...) setta il nome
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Il getter getHealthPoints() restituisce i punti vita della suora.
     * 
     * @return Restituisce i punti vita della suora.
     */
    public int getHealthPoints() {
        return healthPoints;
    }

    /**
     * Il setter setHealthPoints(...) setta il punti vita della suora.
     * 
     * @param healthPoints
     */
    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    /**
     * Il getter getCurrentPlace() restituisce il luogo in cui si trova la suora.
     * 
     * @return Restituisce il luogo in cui si trova la suora.
     */
    public Place getCurrentPlace() {
        return currentPlace;
    }

    /**
     * Il setter setCurrentPlace(...) setta il luogo in cui si trova la suora.
     * 
     * @param currentPlace
     */
    public void setCurrentPlace(Place currentPlace) {
        this.currentPlace = currentPlace;
    }
}
