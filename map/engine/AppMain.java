
package map.engine;

import map.gui.GuiClass;

/**
 * AppMain è la classe dove è presente il main dell'applicazione

 */
public class AppMain extends javax.swing.JFrame {

    private static GuiClass guiClass;
    
    /**
     * main(...) è il metodo principale dell'applicazione.
     * Inizialmente imposta il Nimbus Look And Feel e poi esegue il gioco
     * @param args the command line arguments
     */
    public static void main(String args[]) {

//      IMPOSTAZIONE LOOK AND FEEL NIMBUS
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info
                    : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException
                | IllegalAccessException
                | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(
                    GuiClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

//      ESECUZIONE
        runGame ();
    }
    
    /**
     * runGame() è il metodo che inizializza
     * l'interfaccia grafica e la visualizza
     */
    public static void runGame () {
        
        guiClass = new GuiClass();
        guiClass.setAllButton(false);
        guiClass.setCodButton(false);
        guiClass.setVisible(true);
    }
    
     /**
      * closeFrame() è il metodo che chiude il frame per gestire
      * l'inizio di una nuova partita.
      */
    public static void closeFrame(){
        guiClass.dispose();
    }
}
