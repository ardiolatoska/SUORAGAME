package map.engine;

import mapcodice.mapcodice.Convento.structure.AdvObject;
import mapcodice.mapcodice.Convento.structure.AdvObjectContainer;
import mapcodice.mapcodice.Convento.structure.AllObject;
import mapcodice.mapcodice.Convento.structure.Inventory;
import mapcodice.mapcodice.Convento.structure.Fantasma;
import mapcodice.mapcodice.Convento.structure.Place;
import mapcodice.mapcodice.Convento.structure.Suora;

/**
 * La classe Game contiene tutti i costruttori
 * e tutti i vari settaggi per il gioco.
 * 
 * 
 */

public class Game {

    // LISTA INVENTARIO
    private Inventario Inventario;

    // PROTAGONISTA
    private Suora Suora;

    // FANTASMA
    private Fantasma Formaggino;
    private Fantasma Diablo;
    private Fantasma Creativo;

    // OGGETTI CONTENITORE
    private AdvObjectContainer Libro1;
    private AdvObjectContainer Libro2;
    private AdvObjectContainer Armadio;

    // OGGETTI
    private AdvObject Chiave1;
    private AdvObject Foglio1;
    private AdvObject Mela;
    private AdvObject Candelabro;
    private AdvObject Crocifisso;
    private AdvObject Documenti;
    private AdvObject PozioneCurativa;
    private AdvObject Foto;
    private AdvObject Tastierino;
    private AdvObject Codice1;
    private AdvObject Letto;
    private AdvObject Tavolo;
    private AdvObject Pietra;
    private AdvObject Scaffale;
    private AdvObject Campana;
    private AdvObject Codice2;
    private AdvObject LenteDiIngrandimento;

    // LISTA DI OGGETTI CHE SI POSSONO RACCOGLIERE
    private AllObject allObjectList;

    // LUOGHI
    // MACRO-LUOGO: PIANO 0
    private Place Cucina;
    private Place UfficioPretore;
    private Place Scale0;
    private Place Corridoio0;
    private Place Ingresso;

    // MACRO-LUOGO: PIANO -1
    private Place Scantinato;
    private Place ScaleInferiori;

    // MARCO-LUOGO: PIANO 1
    private Place Dormitorio;
    private Place Cappella;
    private Place Biblioteca;
    private Place Bagno;
    private Place Scale1;
    private Place Corridoio1;

    // MARCO-LUOGO: PIANO 2

    private Place Campanile;
    private Place Corridoio2;
    private Place Scale2;

    // DICHIARAZIONE COSTANTI
    private final static int ID_PIANO_0 = 50;
    private final static int ID_PIANO_1 = 51;
    private final static int ID_PIANO_2 = 52;
    private final static int ID_PIANO_M1 = 53;

    /**
     * Il costruttore di Game crea una nuova partita.
     */
    public Game() {
        initInventario();
        initSuora();
        initAdvObject();
        initAdvObjectContainer();
        initClueMessage();
        initAdvObjectAttribute();
        initAllObjectList();
        initPlace();
        initPlaceAttribute();
        initMap();
        initFantasma();
        setFirstPlace();
    }

    /**
     * Il metodo initSuora() crea un nuovo protagonista.
     */
    private void initSuora() {
        Suora = new Suora();
    }

    /**
     * Il metodo initAdvObject() crea tutti gli oggetti.
     * Gli oggetti sono ordinati per id.
     */
    private void initAdvObject() {

        Chiave1 = new AdvObject(
              id:1, //id
              name:"Chiave", //nome
              description: "questa chiave potrebbe servirmi successivamente ad aprire qualcosa"); //descrizione

        Mela = new AdvObject (
                id:3); //id
               
        Candelabro = new AdvObject(
                id:4, //id
                name:"Candelabro", //nome
                description:"utile per illuminare le stanze buie e per combattere contro il male ", //descrizione
                damage:30); //punti danno  
        Crocifisso= new AdvObject(
                id:6, //id
                name:"Crocifisso", //nome
                description:"E� un oggetto che mi porto sempre con me. \n" 
                             + "lo user� per combattere e per farmi portare fortuna. \n", //descrizione
                damage:40); //punti danno
         
        PozioneCurativa = new AdvObject(
                id:7, //id
                name:"Pozione Curativa", //nome
                description:"questa mi servir� per aumentare la vita. \n" 
                            + "mi servir� inoltre per farmi ritornare in vita", //descrizione
                damage:-100);
         
        Letto= new AdvObject(
                id:8, //id
          
        Tastierino = new AdvObject(
                id:9, //id
                name:"Tastierino", //nome
                description:"inserisci codice di tre cifre"); //descrizione

        Tavolo = new AdvObject(
                id:11, //id 
                name:"Tavolo", //nome
                description:"sul tavolo � appoggiato qualcosa"); //descrizione

        Pietra = new AdvObject(
                id:12, //id
                name:"Pietra", //nome
                description:"E' troppo pesante per me.\n"+
                           "per� mi servir� per difendermi. \n", //descrizione
                damage:30); 
        Scaffale = new AdvObject(
                id:13, //id
                name:"Scaffale", //nome
                description:"questo scaffale � completamente vuoto .\n"+
                            "aspetta ma li c'� un libro .\n"); //descrizione
               
        Campana = new AdvObject(
                id:14,//id
                name:"Campana", //nome
                description:"una volta suonata questa campana, potrò dire finalmente che ho combattuto gli spiriti"); //descrizione
         
        LenteDiIngrandimento = new AdvObject(
                    id:16, //id
                    name:"Lente Di Ingrandimento", //nome
                    description:"questa lente mi aiuterà a capire cosa c'è scritto in quel  documento indecifrabile"); //descrizione
        }

    /**
     * Il metodo initAdvObjectContainer() crea gli oggetti contenitore.
     * Aggiunge inoltre gli oggetti nelle liste opportune.
     */
    private void initAdvObjectContainer() {
        Libro1 = new AdvObjectContainer(1);
        Libro2 = new AdvObjectContainer(2);
        Armadio = new AdvObjectContainer(3);

        Libro1.getList().add(Foto);
        Foto.getList().add(Codice1);
        Libro2.getList().add(Codice2);
        Armadio.getList().add(Libro1);
    }

    /**
     * Il metodo initFileMessage() crea degli oggetti
     * che raccontano la trama del gioco.
     */
    private void initFileMessage() {

        Foglio1 = new AdvObject(
                2, // id
                "Foglio 1", // nome
                "FOGLIO 1.\n",
                +"***********************************************************\n",
                +"Benvenuti a voi che avete trovato il coraggio di entrare in ",
                +" questo posto  infestato. \n",
                +"Una volta entrati qui dentro sar� impossibile uscire. ",
                +"Per farlo dovrete sconfiggere i tre fantasmi che infestano questo posto ",
                +"solo se riuscirete a farlo, riuscrete ad uscire di qui."); // descrizione

        Foto = new AdvObject(
                8, // id
                "Foto", // nome
                "Fotografia\n",
                +"**************************************************\n",
                +"Questa fotografia rappresenta un ritratto di una famiglia, sembra che il ragazzo abbia gli occhi spenti\n",
                +"Oh ma sembra che su ci sia scritto un codice... ");
    }

    /**
   
     * Il metodo initClueMessage() crea degli oggetti. Questi sono degli indizi 
     * che serviranno a formare una password.
     */
    private void initClueMessage() {
        
                Codice1= new AdvObject(
                 10, //id
                "Codice 1", //nome
                "Codice 1\n",
                + "***********************************************************\n",
                + "Centoquattro passi ti separano dalla verit�"); //descrizione
       
                Codice2= new AdvObject(
                15, //id
                "Codice 2", //nome
                "Codice 2\n",
                + "***************************************************\n",
                + "L' unico sollievo qui dentro � la morte... AMEN"); //descrizione

    /**
     * Il metodo initAdvObjectAttribute()
     * setta determinati attributi a degli oggetti.
     */
    private void initAdvObjectAttribute() {
        Libro1.setPickupable(false);
        Libro1.setOpenable(true);
        Libro2.setPickupable(false);
        Libro2.setOpenable(true);
        Armadio.setPickupable(false);
        Armadio.setPickupable(false);
        Mela.setPickupable(true);
        Mela.setPickupable(false);
        Letto.setPickupable(false);
        Letto.setPickupable(false);
    }

    /**
     * Il metodo initAllObjectList() crea una lista di oggetti che
     * possono essere raccolti. Questa lista serve per la visualizzazione
     * della descrizione di un oggetto nell'inventario.
     */
    private void initAllObjectList() {
        allObjectList = new AllObject();

        allObjectList.add(Chiave1);
        allObjectList.add(Foglio1);
        allObjectList.add(Mela);
        allObjectList.add(Candelabro);
        allObjectList.add(Crocifisso);
        allObjectList.add(Documenti);
        allObjectList.add(PozioneCurativa);
        allObjectList.add(Foto);
        allObjectList.add(Tastierino);
        allObjectList.add(Codice1);
        allObjectList.add(Letto);
        allObjectList.add(Tavolo);
        allObjectList.add(Pietra);
        allObjectList.add(Scaffale);
        allObjectList.add(Campana);
        allObjectList.add(Codice2);
        allObjectList.add(LenteDiIngrandimento);
    }

    /**
     * Il metodo initPlace() crea i luoghi e i macro-luoghi del gioco.
     * I luoghi sono ordinati per id.
     */
    private void initPlace() {
         
    //      MACRO-LUOGHI
        Place ID_PIANO_0 = new Place(50);
        Place ID_PIANO_1 = new Place(51);
        Place ID_PIANO_2= new Place(52);
        Place ID_PIANO_M1= new Place(53);
        
    //      LUOGHI
        Ingresso = new Place(
                0, //id
                "Ingresso", //nome
                "Mi si è letteralmente appena chiusa la porta dietro le mie spalle... \n"
                + "Devo trovare una nuova via d' uscita, la porta sembra come bloccata "
                + "devo necessariamente camminare qui avanti", //descrizione
                
                ID_PIANO_M1, //macro-luogo
                "Davanti a me c'e una lampada con una chiave \n"
                + "Potrebbe servive ad aprire qualche armadio o qualcosa di simile...", //osserva
                Chiave1); //oggetto

        Scantinato = new Place(
                1, //id
                "Scantinato", //nome
                "Mamma quanta puzza qui dentro, e ci sono cosi tante ragnatele\n" 
                + "Ci sono anche un sacco di scatoloni qui, chissà cosa custodiscono...\n" //descrizione
                ID_PIANO_M1, //macro-luogo
                "Tra tutte queste scatole c'è  un foglietto\n"
                + "proviamo a recuperarlo", //osserva
                Foglio1); //oggetto


        Cucina = new Place(
                2, //id
                "Cucina", //nome
                "Una vecchia cucina sembra che sia stata abbandonata da circa un secolo \n "
                + "Per fortuna c'è un piccolo candelabro , potrò farmi un po' di luce \n"
                + "Sul tavolo inoltre ci sono vari cibi ammuffiti ma una mela in particolare sembra come se sia stata appena colta \n" //descrizione
                ID_PIANO_0, //macro-luogo
                "Penso che recupererò sia il candelabro che la mela mi potranno servire in futuro", //osserva
                Mela, Candelabro); //oggetto

        UfficioPretore= new Place(
                3, //id //NON TOCCARE
                "Camera", //nome
                "Sono appena entrata palesemente nell' ufficio del pretore... \n"
                + "Qui dentro è pieno di cianfrusaglie, chissà cosa ne fa il prete di tutto ciò \n"
                + "Però ho quella strana sensazione, mi sento come se fossi osservata \n"
                + "Sento come un lamento in lontananza. \n"  //descrizione
                ID_PIANO_0); //macro-luogo

        Dormitorio = new Place(
                4, //id
                "Dormitorio", //nome
                "Questa stanza � enorme, dev'essere sicuramente un dormitorio, ci sono un sacco di letti \n"
                + "Sembra quasi un ospedale abbandonato qui sopra, è tutto cosi creepy\n "
                + "a stare ferma qui mi si gela il sangue.", //descrizione
                ID_PIANO_1, //macro-luogo
                "oh c'è uno strano armadio, sembra cosi interessante, chissà cosa conterrà...\n "
                + "non riesco a forzarlo, dovrei usare un tipo di chiave molto particolare ", //osserva
                Armadio, Letto); //oggetto
        Cappella = new Place(
                 5, //id
                 "Cappella", //nome
                 "Una cappella fatiscente, immersa nell'oscurità, emana un silenzio opprimente " ),//descrizione
        
        Biblioteca = new Place(
                5, //id
                "Biblioteca", //nome
                "Questa stanza è piena zeppa di libri, di tutte le epoche \n"
                + "Ci sono libri di tutte le epoche del cristianesimo, c'è anche un quinto vangelo, sarà sicuramente un falso \n"
                + "Dal Vangelo secondo Emanuele... Sembra un ateo altro che cristiano, sarà meglio vedere altro...", //descrizione
                ID_PIANO_1, //macro-uogo
                "Sullo scaffale c'è riposto un libro con un foglio che attira molto la mia attenzione \n"
                + "Lasciate ogni speranza o voi che entrate, AMEN", //osserva
                Libro2); //oggetto

        Campanile = new Place(
                6, //id
                "Campanile", //nome
                "Questo campanile è gigantesco, sicuramente potrebbe svegliare un intero paese \n"
                + "... Se solo esistesse un paese nelle vicinanze... \n" , //descrizione
                ID_PIANO_2, //macro-luogo
                "Forse è il momento di suonare questa campana e farla finita...", //osserva
                Campana); //oggetto

    /**
     * Il metodo initPlaceAttribute() setta determinati attributi a dei luoghi.
     */
    private void initPlaceAttribute() {
        Ingresso.setAccessible(true);
        Scantinato.setAccessible(true);
        Cucina.setAccessible(true);
        UfficioPretore.setAccessible(true);
        Dormitorio.setAccessible(true);
        Cappella.setAccesible(true);
        Biblioteca.setCodBlock(true);
        Campanile.setCodBlock(true);
    }

    /**
     * Il metodo initMap() setta una vera e propria mappa del gioco.
     */
    private void initMap() {

        // MAPPA Convento
        Ingresso.setDown(Scantinato);
        ScaleInferiori.setUp(Corridoio0);
        Corridoio0.setRight(UfficioPretore);
        Corridoio0.setLeft(Cucina);
        Cucina.setRight(Scale0);
        Scale0.setUp(Corridoio1);
        Corridoio1.setRight(Biblioteca);
        Corridoio1.setLeft(Dormitorio);
        Dormitorio.setUp(Bagno);
        Bagno.setRight(Scale2);
        Scale2.setRight(Campanile);

    }

    /**
     * Il metodo initFantasma() crea i mostri sparsi nel gioco.
     * I mostri sono ordinati per id.
     */
     private void initFantasma() {

        FantasmaFormaggino = new Fantasma(
                1, //id
                "Formaggino", //nome
                "Un fantasma a forma di formaggino, con un'espressione maliziosa e un'aura inquietante \n"+
                "Fluttua lentamente nell'aria, lasciando dietro di sé un odore di formaggio stantio..\n"
                + " mi fissa con i suoi terribili occhi\n"
                + "e inizia a secernere una sostanza simile a formaggio.", //descrizione
                ufficio del pretore, //luogo
                100, //punti vita
                10); //punti danno

        FantasmaDiablo = new Fantasma(
                2, //id
                "Diablo",//nome
                " Un'ombra informe che si muove silenziosamente nell'oscurità \n"
                +"con occhi che brillano come rubini\n",
                +"Può apparire e scomparire all'istante, lasciando dietro di sé un senso di paura e inquietudine..\n"//descrizione
                Dormitorio //luogo
                200, //punti vita
                20); //punti danno

        Fantasma Creativo= new Fantasma (
                3, //id
                "Creativo" //nome
                + "Ha il corpo interamente coperto di spine oltre a possedere una cosa spaventosamente uncinata.\n"
                + "La bocca è ricoperta da numerosissimi denti lunghi e affilati\n", //descrizione
                Campanile, //luogo
                300, //punti vita
                30); //punti danno
    }

    // GETTER E SETTER

    /**
     * Il getter getFantasma(...) restituisce il mostro di un determinato luogo.
     * 
     * @param suoraPlace
     * @return Restituisce il mostro di un determinato luogo.
     */
    public Fantasma getFantasma(Place suoraPlace) {
        switch (suoraPlace.getPlace().getId()) {
            case UfficioPretore:
                return Fantasma Formaggino;
            case Dormitorio:
                return Fantasma Diablo;
            case Campanile;
                return Fantasma Creativo;
        }
    }

    /**
     * Il getter getClue(...) restituisce un foglietto indizio di un determinato
     * luogo.
     * 
     * @param suoraPlace
     * @return Restituisce un foglietto indizio di un determinato luogo.
     */
    public AdvObject getClueMessage(Place suoraPlace) {
        switch (suoraPlace.getMacroPlace().getId()) {
            case Piano1:
                return Codice1;
            case Piano2:
                return Codice2;
        }
    }

    /**
     * Il getter getSuora() restituisce l'oggetto suora.
     * 
     * @return Restituisce l'oggetto suora.
     */
    public InitSuora getSuora() {
        return Suora;
    }

    /**
     * Il getter getInventoryList() restituisce la lista dell'inventario.
     * 
     * @return Restituisce la lista dell'inventario.
     */
    public Inventario getInventoryList() {
        return Inventory;
    }

    /**
     * Il getter getAllObject() restituisce la lista degli
     * oggetti che si possono raccogliere.
     * 
     * @return Restituisce la lista degli oggetti che si possono raccogliere.
     */
    public AllObject getAllObject() {
        return allObjectList;
    }

    /**
     * Il getter getID_Piano() restituisce il valore della costante ID_Piano.
     * 
     * @return restituisce il valore della costante ID_HOME_AREA.
     */
    public int getPlace() {
        return ID_Piano;
    }

    /**
     * Il setter setFirstPlace() setta il luogo d'inizio del gioco.
     */
    private void setFirstPlace() {
        Suora.setCurrentPlace(Ingresso);
    }
}
