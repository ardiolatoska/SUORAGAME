
package map.structure;

/**
 * La classe Place contiene tutte le informazioni di un luogo.
 */
public class Place {

    private int id;
    private String name;
    private String description;
    private Place macroPlace; // ambiente che contiene il luogo
    private Place down = null; // direzione sud
    private Place up = null; // direzione nord
    private Place left = null; // direzione ovest
    private Place right = null; // direzione est
    private String look; // descrizione di ciò che viene osservato
    private boolean visible = true; // indica se il luogo è visibile
    private boolean accessible = true; // indica se il luogo è accessibile
    private boolean codBlock = false; // indica se il luogo è accessibile con una password
    private AdvObject object; // oggetto presente nel luogo

    /**
     * Questo costruttore viene utilizzato esclusivamente per i macro-luoghi.
     * 
     * @param id
     */
    public Place(int id) {
        this.id = id;
    }

    /**
     * Questo costruttore viene utilizzato per creare un luogo senza oggetti.
     * 
     * @param id
     * @param name
     * @param description
     * @param macroPlace
     */
    public Place(int id, String name, String description, Place macroPlace) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.macroPlace = macroPlace;
    }

    /**
     * Questo costruttore viene utilizzato per creare un luogo con un oggetto.
     * 
     * @param id
     * @param name
     * @param description
     * @param macroPlace
     * @param look
     * @param object
     */
    public Place(int id, String name, String description, Place macroPlace, String look, AdvObject object) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.macroPlace = macroPlace;
        this.look = look;
        this.object = object;

    }

    // GETTER E SETTER

    /**
     * Il getter getId() restituisce l'id number del luogo.
     * 
     * @return Restituisce l'id number del luogo.
     */
    public int getId() {
        return id;
    }

    /**
     * Il getter getName() restituisce il nome del luogo.
     * 
     * @return Restituisce il nome del luogo.
     */
    public String getName() {
        return name;
    }

    /**
     * Il getter getDescription() restituisce la descrizione del luogo.
     * 
     * @return Restituisce la descrizione del luogo.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Il getter isVisible() restituisce true se il luogo è visibile, false
     * viceversa.
     * 
     * @return true se il luogo è visibile, false viceversa.
     */
    public boolean isVisible() {
        return visible;
    }

    /**
     * Il setter seVisible(...) setta l'attributo "visible" del luogo.
     * 
     * @param visible
     */
    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    /**
     * Il getter getDown() restituisce il luogo presente a sud del luogo attuale.
     * 
     * @return Restituisce il luogo presente a sud del luogo attuale.
     */
    public Place getDown() {
        return down;
    }

    /**
     * Il setter setDown(...) setta il luogo presente a sud del luogo attuale.
     * 
     * @param down
     */
    public void setDown(Place down) {
        this.down = down;
    }

    /**
     * Il getter getUp() restituisce il luogo presente a nord del luogo attuale.
     * 
     * @return Restituisce il luogo presente a nord del luogo attuale.
     */
    public Place getUp() {
        return up;
    }

    /**
     * Il setter setUp(...) setta il luogo presente a nord del luogo attuale.
     * 
     * @param up
     */
    public void setUp(Place up) {
        this.up = up;
    }

    /**
     * Il getter getLeft() restituisce il luogo presente ad ovest del luogo attuale.
     * 
     * @return Restituisce il luogo presente ad ovest del luogo attuale.
     */
    public Place getLeft() {
        return left;
    }

    /**
     * Il setter setLeft(...) setta il luogo presente ad ovest del luogo attuale.
     * 
     * @param left
     */
    public void setLeft(Place left) {
        this.left = left;
    }

    /**
     * Il getter getRight() restituice il luogo presente ad est del luogo attuale.
     * 
     * @return Restituice il luogo presente ad est del luogo attuale.
     */
    public Place getRight() {
        return right;
    }

    /**
     * Il setter setLeft(...) setta il luogo presente ad est del luogo attuale.
     * 
     * @param right
     */
    public void setRight(Place right) {
        this.right = right;
    }

    /**
     * Il getter getLook() restituisce la descrizione di ciò che viene osservato.
     * 
     * @return Restituisce la descrizione di ciò che viene osservato.
     */
    public String getLook() {
        return look;
    }

    /**
     * Il getter isAccessible() restituisce true se il luogo è accessibile, false
     * viceversa.
     * 
     * @return true se il luogo è accessibile, false viceversa.
     */
    public boolean isAccessible() {
        return accessible;
    }

    /**
     * Il setter setAccessible(...) setta l'attributo "accessible" del luogo.
     * 
     * @param accessible
     */
    public void setAccessible(boolean accessible) {
        this.accessible = accessible;
    }

    /**
     * Il getter getOject() restituisce l'oggetto presente nel luogo
     * 
     * @return
     */
    public AdvObject getObject() {
        return object;
    }

    /**
     * Il getter getmacroConvento() restituisce il macro-luogo del luogo.
     * 
     * @return Restituisce il macro-luogo del luogo.
     */
    public Place getmacroPlace() {
        return macroPlace;
    }

    /**
     * il getter isCodBlock() restituisce true se il luogo è accessibile
     * dopo aver inserito una password, false viceversa.
     * 
     * @return true se il luogo è accessibile dopo aver inserito una password, false
     *         viceversa.
     */
    public boolean isCodBlock() {
        return codBlock;
    }

    /**
     * Il setter setCodBlock(...) setta l'attributo "codBlock" del luogo.
     * 
     * @param codBlock
     */
    public void setCodBlock(boolean codBlock) {
        this.codBlock = codBlock;
    }
}
