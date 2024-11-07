
package map.gui;

import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Collections;
import java.util.Random;
import javax.swing.Action;
import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import map.engine.AppMain;
import map.engine.Game;
import map.structure.AdvObject;
import map.structure.Place;

/**
 * La classe GuiClass istanzia le componenti swing
 * ed implementa gli eventi che devono verificarsi
 * durante le diverse situazioni di gioco
 * (actionPerformed)
 */
public class GuiClass extends javax.swing.JFrame {

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aButton;
    private javax.swing.JButton attackButton;
    private javax.swing.JButton bButton;
    private javax.swing.JButton bedButton;
    private javax.swing.JButton cButton;
    private javax.swing.JButton cancelCod;
    private javax.swing.JButton cancelInventory;
    private javax.swing.JTextArea codArea;
    private javax.swing.JButton collectButton;
    private javax.swing.JComboBox<String> comboBoxInventory;
    private javax.swing.JButton confirmCod;
    private javax.swing.JButton confirmInventory;
    private javax.swing.JButton confirmName;
    private javax.swing.JButton dButton;
    private javax.swing.JButton defenceButton;
    private javax.swing.JButton downArrow;
    private javax.swing.JButton eButton;
    private javax.swing.JButton fButton;
    private javax.swing.JButton furtiveButton;
    private javax.swing.JButton gButton;
    private javax.swing.JButton hButton;
    private javax.swing.JButton iButton;
    private javax.swing.JButton inventoryButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton leftArrow;
    private javax.swing.JButton lookingButton;
    private javax.swing.JButton map;
    private javax.swing.JButton openButton;
    private javax.swing.JTextField suoraName;
    private javax.swing.JButton pushButton;
    private javax.swing.JButton rightArrow;
    private javax.swing.JButton startEngineButton;
    private javax.swing.JTextArea storyArea;
    private javax.swing.JTextField title;
    private javax.swing.JButton upArrow;
    // End of variables declaration//GEN-END:variables

    private Game game; // creazione della partita
    private Place direction; // rappresenta la prossima mossa
    private Place restorePlace; // ripristina il luogo corrente in caso di morte
    private JFrame frameMap = new JFrame();
    private int tempLife;
    private boolean isLooked = false;
    private boolean onlyOneOpening = false;
    private boolean isPushedGear = false;
    private boolean isStartedEngine = false;
    private boolean takenArmor = false;
    private boolean isEnd;

    // DICHIARAZIONE COSTANTI
    private final static int MAX_LENGHT_NAME = 10;
    private final static int MAP_HEIGHT = 750;
    private final static int MAP_LENGHT = 750;
    private final static int MAX_LENGHT_COD_AREA = 4;
    private final static int MAX_HEALING_POTION = 200;
    private final static int MAX_HEALTH = 100;
    private final static int MIN_SUORA_HP = 0;
    private final static int MIN_FANTASMA_HP = 0;
    private final static int HP_FORMAGGINO = 100;
    private final static int HP_DIABLO = 200;
    private final static int HP_CREATIVO = 300;
    private final static int ID_HEALING__POTION= 7;
    private final static int ID_FLOOR_0= 51;
    private final static int ID_FLOOR_1= 52;
    private final static int ID_FLOOR_2 = 53;
    private final static int ID_FLOOR_M1 = 54;
    private final static int ID_CANDELABRO = 16;
    private final static int ID_CROCIFISSO = 17;
    private final static int ID_PIETRA = 15;
    private final static int ID_CAMPANA = 7;
    private final static int ID_LENTE_DI_INGRANDIMENTO = 1;
    private final static int ID_CHIAVE1= 2;

    /**
     * Costruttore di GuiClass, che inizializza tutte
     * le componenti swing
     */
    public GuiClass() {
        initComponents();
        initIcon();
        initButton();
        closeGame(); // richiama il metodo che chiude l'applicazione con conferma
    }

    /**
     * 
     */
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        upArrow = new javax.swing.JButton();
        rightArrow = new javax.swing.JButton();
        downArrow = new javax.swing.JButton();
        leftArrow = new javax.swing.JButton();
        suoraName = new javax.swing.JTextField();
        confirmName = new javax.swing.JButton();
        title = new javax.swing.JTextField();
        attackButton = new javax.swing.JButton();
        defenceButton = new javax.swing.JButton();
        furtiveButton = new javax.swing.JButton();
        aButton = new javax.swing.JButton();
        bButton = new javax.swing.JButton();
        dButton = new javax.swing.JButton();
        cButton = new javax.swing.JButton();
        eButton = new javax.swing.JButton();
        fButton = new javax.swing.JButton();
        gButton = new javax.swing.JButton();
        hButton = new javax.swing.JButton();
        iButton = new javax.swing.JButton();
        confirmCod = new javax.swing.JButton();
        cancelCod = new javax.swing.JButton();
        codArea = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        storyArea = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        startEngineButton = new javax.swing.JButton();
        floor_0= new javax.swing.JButton();
        pushButton = new javax.swing.JButton();
        openButton = new javax.swing.JButton();
        collectButton = new javax.swing.JButton();
        inventoryButton = new javax.swing.JButton();
        map = new javax.swing.JButton();
        lookingButton = new javax.swing.JButton();
        comboBoxInventory = new javax.swing.JComboBox<>();
        cancelInventory = new javax.swing.JButton();
        confirmInventory = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("IL CONVENTO ABBANDONATO");
        setMinimumSize(new java.awt.Dimension(800, 600));

        upArrow.setText("upArrow");
        upArrow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upArrowActionPerformed(evt);
            }
        });

        rightArrow.setText("rightArrow");
        rightArrow.setMaximumSize(new java.awt.Dimension(73, 23));
        rightArrow.setMinimumSize(new java.awt.Dimension(73, 23));
        rightArrow.setPreferredSize(new java.awt.Dimension(73, 23));
        rightArrow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rightArrowActionPerformed(evt);
            }
        });

        downArrow.setText("downArrow");
        downArrow.setMaximumSize(new java.awt.Dimension(73, 23));
        downArrow.setMinimumSize(new java.awt.Dimension(73, 23));
        downArrow.setPreferredSize(new java.awt.Dimension(73, 23));
        downArrow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downArrowActionPerformed(evt);
            }
        });

        leftArrow.setText("leftArrow");
        leftArrow.setMaximumSize(new java.awt.Dimension(73, 23));
        leftArrow.setMinimumSize(new java.awt.Dimension(73, 23));
        leftArrow.setPreferredSize(new java.awt.Dimension(73, 23));
        leftArrow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leftArrowActionPerformed(evt);
            }
        });

        confirmName.setText("CONFERMARE");
        confirmName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmNameActionPerformed(evt);
            }
        });

        title.setEditable(false);
        title.setBackground(new java.awt.Color(255, 255, 255));
        title.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N
        title.setForeground(new java.awt.Color(255, 0, 51));
        title.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        title.setText("IL CONVENTO ABBANDONATO");
        title.setMaximumSize(new java.awt.Dimension(100, 100));

        attackButton.setText("ATTACCO");
        attackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attackButtonActionPerformed(evt);
            }
        });

        defenceButton.setText("DIFESA");
        defenceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defenceButtonActionPerformed(evt);
            }
        });

        furtiveButton.setText("FURTIVO");
        furtiveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                furtiveButtonActionPerformed(evt);
            }
        });

        aButton.setText("A");
        aButton.setPreferredSize(new java.awt.Dimension(25, 25));
        aButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aButtonActionPerformed(evt);
            }
        });

        bButton.setText("B");
        bButton.setPreferredSize(new java.awt.Dimension(25, 25));
        bButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bButtonActionPerformed(evt);
            }
        });

        dButton.setText("D");
        dButton.setPreferredSize(new java.awt.Dimension(25, 25));
        dButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dButtonActionPerformed(evt);
            }
        });

        cButton.setText("C");
        cButton.setPreferredSize(new java.awt.Dimension(25, 25));
        cButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cButtonActionPerformed(evt);
            }
        });

        eButton.setText("E");
        eButton.setPreferredSize(new java.awt.Dimension(25, 25));
        eButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eButtonActionPerformed(evt);
            }
        });

        fButton.setText("F");
        fButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fButtonActionPerformed(evt);
            }
        });

        gButton.setText("G");
        gButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gButtonActionPerformed(evt);
            }
        });

        hButton.setText("H");
        hButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hButtonActionPerformed(evt);
            }
        });

        iButton.setText("I");
        iButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iButtonActionPerformed(evt);
            }
        });

        confirmCod.setText("CONFERMA");
        confirmCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmCodActionPerformed(evt);
            }
        });

        cancelCod.setText("ANNULLA");
        cancelCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelCodActionPerformed(evt);
            }
        });

        codArea.setEditable(false);
        codArea.setColumns(20);
        codArea.setRows(5);

        storyArea.setEditable(false);
        storyArea.setColumns(20);
        storyArea.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        storyArea.setRows(5);
        storyArea.setText(
                "                                   BENVENUTO IN \"IL CONVENTO ABBANDONATO\"\n\nSi prega di inserire il nome della suora nell'apposito campo sulla destra...");
        jScrollPane1.setViewportView(storyArea);

        startEngineButton.setText("startEngine");
        startEngineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startEngineButtonActionPerformed(evt);
            }
        });

        floorButton.setText("floor");
        bedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bedButtonActionPerformed(evt);
            }
        });

        pushButton.setText("push");
        pushButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pushButtonActionPerformed(evt);
            }
        });

        openButton.setText("open");
        openButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openButtonActionPerformed(evt);
            }
        });

        collectButton.setText("collect");
        collectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                collectButtonActionPerformed(evt);
            }
        });

        inventoryButton.setText("inventory");
        inventoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inventoryButtonActionPerformed(evt);
            }
        });

        map.setText("MAPPA");
        map.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mapActionPerformed(evt);
            }
        });

        lookingButton.setText("Looking");
        lookingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lookingButtonActionPerformed(evt);
            }
        });

        cancelInventory.setText("cancelInventory");
        cancelInventory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelInventoryActionPerformed(evt);
            }
        });

        confirmInventory.setText("confirmInventory");
        confirmInventory.setMaximumSize(new java.awt.Dimension(111, 23));
        confirmInventory.setMinimumSize(new java.awt.Dimension(111, 23));
        confirmInventory.setPreferredSize(new java.awt.Dimension(111, 23));
        confirmInventory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmInventoryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(comboBoxInventory, javax.swing.GroupLayout.Alignment.CENTER, 0,
                                                154, Short.MAX_VALUE)
                                        .addComponent(inventoryButton, javax.swing.GroupLayout.Alignment.CENTER,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                                        .addComponent(map, javax.swing.GroupLayout.Alignment.CENTER,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cancelInventory, javax.swing.GroupLayout.Alignment.CENTER,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                                        .addComponent(confirmInventory, javax.swing.GroupLayout.Alignment.TRAILING,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(collectButton, javax.swing.GroupLayout.Alignment.TRAILING,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                                        .addComponent(lookingButton, javax.swing.GroupLayout.Alignment.TRAILING,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                                        .addComponent(bedButton, javax.swing.GroupLayout.DEFAULT_SIZE, 154,
                                                Short.MAX_VALUE)
                                        .addComponent(openButton, javax.swing.GroupLayout.DEFAULT_SIZE, 154,
                                                Short.MAX_VALUE)
                                        .addComponent(pushButton, javax.swing.GroupLayout.Alignment.TRAILING,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                                        .addComponent(startEngineButton, javax.swing.GroupLayout.Alignment.TRAILING,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE))
                                .addContainerGap()));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(map, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(lookingButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(13, 13, 13)
                                                .addComponent(collectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(floor_0)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(openButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(14, 14, 14)
                                                .addComponent(pushButton))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(inventoryButton, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(comboBoxInventory, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(confirmInventory, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(9, 9, 9)
                                                .addComponent(cancelInventory, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(startEngineButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap()));

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL,
                new java.awt.Component[] { floorButton, cancelInventory, collectButton, confirmInventory, inventoryButton,
                        lookingButton, openButton, pushButton, startEngineButton });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addComponent(attackButton, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(defenceButton, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(furtiveButton, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(99, 99, 99))
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(leftArrow, javax.swing.GroupLayout.PREFERRED_SIZE, 79,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(downArrow,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                87,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(upArrow,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                87,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(123, 123, 123))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
                                                                .createSequentialGroup()
                                                                .addComponent(rightArrow,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 86,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(32, 32, 32)))
                                                .addGap(12, 12, 12)
                                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                false)
                                                        .addComponent(cancelCod, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(confirmCod, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(dButton,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(eButton,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(fButton,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 25,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(gButton,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 25,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(hButton,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 28,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(iButton,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 19,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(aButton,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 25,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(bButton,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(cButton,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 41,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(codArea, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(95, 95, 95))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(8, 8, 8)
                                                                .addComponent(title,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        Short.MAX_VALUE))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout
                                                                .createSequentialGroup()
                                                                .addComponent(jScrollPane1)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING,
                                                                        false)
                                                                        .addComponent(confirmName,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                118, Short.MAX_VALUE)
                                                                        .addComponent(suoraName))))
                                                .addContainerGap()))));

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] { aButton, bButton, cButton,
                dButton, eButton, fButton, gButton, hButton, iButton });

        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 231,
                                                        Short.MAX_VALUE)
                                                .addGap(17, 17, 17))
                                        .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                        115, Short.MAX_VALUE)
                                                .addComponent(suoraName, javax.swing.GroupLayout.PREFERRED_SIZE, 44,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(confirmName)
                                                .addGap(45, 45, 45)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(attackButton, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(defenceButton, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(furtiveButton, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(59, 59, 59)
                                                                .addComponent(codArea,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 33,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(aButton,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                30,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(bButton,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(cButton,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(dButton,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(eButton,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(fButton,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                23,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(gButton)
                                                                        .addComponent(hButton)
                                                                        .addComponent(iButton))
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(confirmCod)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(cancelCod,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 23,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(38, 38, 38)
                                                                .addComponent(upArrow,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 85,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(7, 7, 7)
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(leftArrow,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                89,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(rightArrow,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                89,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(downArrow,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 83,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addContainerGap()));

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] { aButton, bButton, cButton,
                dButton, eButton, fButton, gButton, hButton, iButton });

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * confirmInventoryActionPerformed(...) è il metodo che stampa la
     * descrizione di un oggetto selezionato dall'utente nell'inventario
     * 
     * @param evt
     */
    private void confirmInventoryActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_confirmInventoryActionPerformed
        String itemDescription = (String) comboBoxInventory.getSelectedItem(); // casting a String di un oggetto
                                                                               // selezionato nel comboBoxInventory
        for (AdvObject item : game.getAllObject().getList()) {
            if (item.getName() == itemDescription) {
                stampStoryArea(Enumstamp.NULL);
                storyArea.append(item.getDescription());
            }
        }
        setButtonInventory(false);
    }// GEN-LAST:event_confirmInventoryActionPerformed

    /**
     * cancelInventoryActionPerformed(...) è il metodo setta non visibili
     * i JButton dell'inventario
     * 
     * @param evt
     */
    private void cancelInventoryActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_cancelInventoryActionPerformed
        setButtonInventory(false);
    }// GEN-LAST:event_cancelInventoryActionPerformed

    /**
     * inventoryButtonActionPerformed(...) è il metodo che gestisce l'apertura
     * dell'inventario e l'apertura dei suoi componenti
     * 
     * @param evt
     */
    private void inventoryButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_inventoryButtonActionPerformed
        comboBoxInventory.removeAllItems();
        for (AdvObject item : game.getInventoryList().getList())
            comboBoxInventory.addItem(item.getName());
        setButtonInventory(true);
    }// GEN-LAST:event_inventoryButtonActionPerformed

    /**
     * upArrowActionPerformed(...) è il metodo che permette di spostarsi verso
     * l'alto
     * 
     * @param evt
     */
    private void upArrowActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_upArrowActionPerformed
        direction = game.getSuora().getCurrentPlace().getUp();
        move();
    }// GEN-LAST:event_upArrowActionPerformed

    /**
     * leftArrowActionPerformed(...) è il metodo che permette di spostarsi verso
     * sinistra
     * 
     * @param evt
     */
    private void leftArrowActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_leftArrowActionPerformed
        direction = game.getSuora().getCurrentPlace().getLeft();
        move();
    }// GEN-LAST:event_leftArrowActionPerformed

    /**
     * rightArrowActionPerformed(...) è il metodo che permette di spostarsi verso
     * destra
     * 
     * @param evt
     */
    private void rightArrowActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_rightArrowActionPerformed
        direction = game.getSuora().getCurrentPlace().getRight();
        move();
    }// GEN-LAST:event_rightArrowActionPerformed

    /**
     * downArrowActionPerformed(...) è il metodo che permette di spostarsi verso il
     * basso
     * 
     * @param evt
     */
    private void downArrowActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_downArrowActionPerformed
        direction = game.getSuora().getCurrentPlace().getDown();
        move();
    }// GEN-LAST:event_downArrowActionPerformed

    /**
     * lookingButtonActionPerformed(...) è il metodo che gestisce e
     * fa visualizzare le descrizioni del luogo
     * 
     * @param evt
     */
    private void lookingButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_lookingButtonActionPerformed
        if (game.getSuora().getCurrentPlace().isVisible()) {
            isLooked = true; // setta il luogo come osservato per pemettere di raccogliere l'oggetto
            if (!isPushedGear) { // controlla se l'ingranaggio è stato già inserito
                for (AdvObject currentObject : game.getInventoryList().getList()) {
                    try {
                        if (currentObject.getId() == ID_GEAR && direction.getId() == ID_FLOOR) { // controlla
                                                                                                             // se si è
                                                                                                             // in un
                                                                                                             // particolare
                                                                                                             // luogo
                            pushButton.setVisible(true);
                        }
                    } catch (NullPointerException e) {
                        pushButton.setVisible(false);
                    }
                }
            }
            if (game.getSuora().getCurrentPlace().getObject() != null) {
                if (!game.getSuora().getCurrentPlace().getObject().isCollected()) {
                    stampStoryArea(Enumstamp.LOOK);
                } else {
                    stampStoryArea(Enumstamp.JUST_COLLECT);
                }
                try {
                    if (direction.getObject().isOpenable()) {
                        openButton.setVisible(true);
                    }
                } catch (NullPointerException exceptionContainer) {
                    openButton.setVisible(false);
                }
            } else {
                stampStoryArea(Enumstamp.NOTHING_TO_LOOK);
            }
            try {
                if (!isStartedEngine) { // gestisce la visibilità del JButton startEngine
                    if (direction.getId() == ID_CONTROL_ROOM) {
                        startEngineButton.setVisible(true);
                    }
                }
            } catch (NullPointerException ex) {
                startEngineButton.setVisible(false);
            }
        } else {
            stampStoryArea(EnumStamp.LOOK_UNVISIBLE_PLACE);
        }
    }// GEN-LAST:event_lookingButtonActionPerformed

    /**
     * collectButtonActionPerformed(...) è il metodo che
     * gestisce la raccolta di oggetti
     * 
     * @param evt
     */
    private void collectButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_collectButtonActionPerformed
        if (!isLooked) { // solo se il luogo è stato ispezionato
            stampStoryArea(Enumstamp.NO_LOOK);
        } else {
            if ((game.getSuora().getCurrentPlace().getObject() == null)
                    || (game.getSuora().getCurrentPlace().getObject()).isCollected()
                    || !game.getSuora().getCurrentPlace().getObject().isPickupable()) {
                stampStoryArea(EnumStamp.NO_COLLECT);
            } else {
                game.getInventoryList().add(game.getSuora().getCurrentPlace().getObject());
                stampStoryArea(EnumStamp.COLLECT);
                game.getSuora().getCurrentPlace().getObject().setCollected(true);
            }
        }
        setButtonInventory(false);
    }// GEN-LAST:event_collectButtonActionPerformed

    /**
     * confirmNameActionPerformed(...) è il metodo che gestisce il nome utente
     * 
     * @param evt
     */
    private void confirmNameActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_confirmNameActionPerformed
        if (suoraName.getText().isEmpty() || suoraName.getText().length() > MAX_LENGHT_NAME) {
            storyArea.setText("    NOME GIOCATORE NON VALIDO    \n\n "
                    + "SI PREGA DI INSERIRE IL NOME GIOCATORE "
                    + "NEL CAMPO SULLA DESTRA");
            suoraName.setText("");
        } else {
            game = new Game();
            suoraName.setVisible(false);
            confirmName.setVisible(false);
            game.getSuora().setName(suoraName.getText());
            setAllButton(true);
            stampStoryArea(EnumStamp.NULL);
        }
    }// GEN-LAST:event_confirmNameActionPerformed

    /**
     * mapActionPerformed(...) è il metodo che seleziona
     * la mappa del posto corrente
     * 
     * @param evt
     */
    private void mapActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_mapActionPerformed
        frameMap = new JFrame();
        if (game.getSuora().getCurrentPlace().getMacroPlace().getId() == game.getID_FLOOR0()) {
            viewMap("classes/img/Piano 0.png");
        } else if (game.getSuora().getCurrentPlace().getMacroPlace().getId() == game.get ID_FLOOR_1) {
            viewMap("classes/img/piano 1.png");
        } else if (game.getSuora().getCurrentPlace().getMacroPlace().getId() == game.get ID_FLOOR_2) {
            viewMap("classes/img/piano 2.png");
        } else if (game.getSuora().getCurrentPlace().getMacroPlace().getId() == game.get ID_FLOOR_M1) {
            viewMap("classes/img/piano -1.png");
            

        }
    }// GEN-LAST:event_mapActionPerformed

    /**
     * attackButtonActionPerformed(...) è il metodo che gestisce il
     * combattimento nel caso di scelta dell'utente di attaccare
     * 
     * @param evt
     */
    private void attackButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_attackButtonActionPerformed
        String randomChoose = generateRandomNumber();
        switch (randomChoose) {
            case "ATTACK":
                stampStoryAreaCombat(EnumstampCombat.ATTACK);
                stampStoryAreaCombat(EnumstampCombat.DRAW);
                stampStoryAreaCombat(EnumstampCombat.INFO);
                break;
            case "DEFENCE":
                game.getSuora()
                        .setHealthPoints(game.getSuora().getHealthPoints() - game.getGhost(direction).getDamage());
                stampStoryAreaCombat(EnumstampCombat.DEFENCE);
                stampStoryAreaCombat(EnumstampCombat.INFO);
                break;
            case "FURTIVE":
                game.getFantasma(direction)
                        .setHealthPoints(game.getGhost(direction).getHealthPoints() - getBestWeapon().getDamage());
                stampStoryAreaCombat(EnumstampCombat.FURTIVE);
                stampStoryAreaCombat(EnumstampCombat.INFO);
                break;
        }
        calculateFightResult(tempLife);
    }// GEN-LAST:event_attackButtonActionPerformed

    /**
     * defenceButtonActionPerformed(...) è il metodo che gestisce il
     * combattimento nel caso di scelta dell'utente di difendere
     * 
     * @param evt
     */
    private void defenceButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_defenceButtonActionPerformed
        String randomChoose = generateRandomNumber();
        switch (randomChoose) {
            case "ATTACK":
                game.getGhost(direction)
                        .setHealthPoints(game.getFantasma(direction).getHealthPoints() - getBestWeapon().getDamage());
                stampStoryAreaCombat(EnumstampCombat.ATTACK);
                stampStoryAreaCombat(EnumstampCombat.INFO);
                break;
            case "DEFENCE":
                stampStoryAreaCombat(EnumstampCombat.DEFENCE);
                stampStoryAreaCombat(EnumstampCombat.DRAW);
                stampStoryAreaCombat(EnumstampCombat.INFO);
                break;
            case "FURTIVE":
                game.getSuora()
                        .setHealthPoints(game.getSuora().getHealthPoints() - game.getGhost(direction).getDamage());
                stampStoryAreaCombat(EnumstampCombat.FURTIVE);
                stampStoryAreaCombat(EnumstampCombat.INFO);
                break;
        }
        calculateFightResult(tempLife);
    }// GEN-LAST:event_defenceButtonActionPerformed

    /**
     * furtiveButtonActionPerformed(...) è il metodo che gestisce il
     * combattimento nel caso di scelta dell'utente di usare "furtivo"
     * 
     * @param evt
     */
    private void furtiveButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_furtiveButtonActionPerformed
        String randomChoose = generateRandomNumber();
        switch (randomChoose) {
            case "ATTACK":
                game.getSuora()
                        .setHealthPoints(game.getSuora().getHealthPoints() - game.getGhost(direction).getDamage());
                stampStoryAreaCombat(EnumstampCombat.ATTACK);
                stampStoryAreaCombat(EnumstampCombat.INFO);
                break;
            case "DEFENCE":
                game.getFantasma(direction)
                        .setHealthPoints(game.getFantasma(direction).getHealthPoints() - getBestWeapon().getDamage());
                stampStoryAreaCombat(EnumstampCombat.DEFENCE);
                stampStoryAreaCombat(EnumstampCombat.INFO);
                break;
            case "FURTIVE":
                stampStoryAreaCombat(EnumstampCombat.FURTIVE);
                stampStoryAreaCombat(EnumstampCombat.DRAW);
                stampStoryAreaCombat(EnumstampCombat.INFO);
                break;
        }
        calculateFightResult(tempLife);
    }// GEN-LAST:event_furtiveButtonActionPerformed

    /**
     * cButtonActionPerformed(...) il metodo fa visualizzare il carattere
     * per la gestione della password durante il gioco
     * 
     * @param evt
     */
    private void cButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_cButtonActionPerformed
        if (codArea.getText().length() < MAX_LENGHT_COD_AREA) {
            codArea.append("C");
        }
    }// GEN-LAST:event_cButtonActionPerformed

    /**
     * eButtonActionPerformed(...) il metodo fa visualizzare il carattere
     * per la gestione della password durante il gioco
     * 
     * @param evt
     */
    private void eButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_eButtonActionPerformed
        if (codArea.getText().length() < MAX_LENGHT_COD_AREA) {
            codArea.append("E");
        }
    }// GEN-LAST:event_eButtonActionPerformed

    /**
     * aButtonActionPerformed(...) il metodo fa visualizzare il carattere
     * per la gestione della password durante il gioco
     * 
     * @param evt
     */
    private void aButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_aButtonActionPerformed
        if (codArea.getText().length() < MAX_LENGHT_COD_AREA) {
            codArea.append("A");
        }
    }// GEN-LAST:event_aButtonActionPerformed

    /**
     * dButtonActionPerformed(...) il metodo fa visualizzare il carattere
     * per la gestione della password durante il gioco
     * 
     * @param evt
     */
    private void dButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_dButtonActionPerformed
        if (codArea.getText().length() < MAX_LENGHT_COD_AREA) {
            codArea.append("D");
        }
    }// GEN-LAST:event_dButtonActionPerformed

    /**
     * fButtonActionPerformed(...) il metodo fa visualizzare il carattere
     * per la gestione della password durante il gioco
     * 
     * @param evt
     */
    private void fButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_fButtonActionPerformed
        if (codArea.getText().length() < MAX_LENGHT_COD_AREA) {
            codArea.append("F");
        }
    }// GEN-LAST:event_fButtonActionPerformed

    /**
     * gButtonActionPerformed(...) il metodo fa visualizzare il carattere
     * per la gestione della password durante il gioco
     * 
     * @param evt
     */
    private void gButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_gButtonActionPerformed
        if (codArea.getText().length() < MAX_LENGHT_COD_AREA) {
            codArea.append("G");
        }
    }// GEN-LAST:event_gButtonActionPerformed

    /**
     * hButtonActionPerformed(...) il metodo fa visualizzare il carattere
     * per la gestione della password durante il gioco
     * 
     * @param evt
     */
    private void hButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_hButtonActionPerformed
        if (codArea.getText().length() < MAX_LENGHT_COD_AREA) {
            codArea.append("H");
        }
    }// GEN-LAST:event_hButtonActionPerformed

    /**
     * iButtonActionPerformed(...) il metodo fa visualizzare il carattere
     * per la gestione della password durante il gioco
     * 
     * @param evt
     */
    private void iButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_iButtonActionPerformed
        if (codArea.getText().length() < MAX_LENGHT_COD_AREA) {
            codArea.append("I");
        }
    }// GEN-LAST:event_iButtonActionPerformed

    /**
     * confirmCodActionPerformed(...) è il metodo che controlla
     * se la password inserita è quella corretta
     * 
     * @param evt
     */
    private void confirmCodActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_confirmCodActionPerformed
        if (codArea.getText().equalsIgnoreCase("BCGD")) {
            stampStoryArea(Enumstamp.UNLOCKED_PLACE);
            direction.setCodBlock(false);
            direction.setAccessible(true);
            setAllButton(true);
            setCodButton(false);
        } else {
            stampStoryArea(Enumstamp.ERROR_CODE);
            codArea.setText(""); // in caso di password sbagliata cancella i caratteri inseriti
        }
    }// GEN-LAST:event_confirmCodActionPerformed

    /**
     * cancelCodActionPerformed(...) gestisce l'annullamento dell'inserimento
     * della password
     * 
     * @param evt
     */
    private void cancelCodActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_cancelCodActionPerformed
        stampStoryArea(Enumstamp.CANCEL_CODE);
        setAllButton(true);
        setCodButton(false);
    }// GEN-LAST:event_cancelCodActionPerformed

    /**
     * bButtonActionPerformed(...) il metodo fa visualizzare il carattere
     * per la gestione della password durante il gioco
     * 
     * @param evt
     */
    private void bButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_bButtonActionPerformed
        if (codArea.getText().length() < MAX_LENGHT_COD_AREA) {
            codArea.append("B");
        }
    }// GEN-LAST:event_bButtonActionPerformed

    /**
     * bedButtonActionPerformed(...) è il metodo gestisce il ripristino della vita
     * 
     * @param evt
     */
    private void bedButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_bedButtonActionPerformed
        if (takenArmor) { // controlla se si ha l'armatura
            game.getSuora().setHealthPoints(MAX_HEALTH_ARMOR);
        } else {
            game.getSuora().setHealthPoints(MAX_HEALTH);
        }
        stampStoryArea(Enumstamp.RESTORE_HEALTH);
    }// GEN-LAST:event_bedButtonActionPerformed

    /**
     * openButtonActionPerformed(...) è il metodo ce gestisce
     * l'apertura degli oggetti contenitore
     * 
     * @param evt
     */
    private void openButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_openButtonActionPerformed
        if (direction.getObject().isOpen()) {
            openButton.setVisible(false);
        } else {
            for (AdvObject searchObject : game.getObjetContainer(game.getSuora().getCurrentPlace()).getList()) {
                if (searchObject.isPickupable()) {
                    game.getInventoryList().getList().add(searchObject);
                    searchObject.setPickupable(false);
                    storyArea.append("\nHai raccolto: " + searchObject.getName());
                    if (searchObject.getId() == ID_HEALING__POTION) {
                        game.getSuora().setHealthPoints(game.getSuora().getHealthPoints() + 100);
                        takenArmor = true;
                        storyArea.append("\nCon questa pozione curativa potrò curarmi ogni volta che non sto bene! (+100PV)");
                    }
                }
            }
            direction.getObject().setOpen(true);
            direction.getObject().setOpenable(false);
            direction.getObject().setCollected(true);
        }
        openButton.setVisible(false);
    }// GEN-LAST:event_openButtonActionPerformed

    /**
     * pushButtonActionPerformed(...) gestisce linserimento in una determinata
     * situazione di gioco
     * 
     * @param evt
     */
    private void pushButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_pushButtonActionPerformed
        game.getInventoryList().getList().remove(game.getGear());
        isPushedGear = true;
        direction.getObject().setCollected(true);
        pushButton.setVisible(false);
        stampStoryArea(Enumstamp.PUSHED);
    }// GEN-LAST:event_pushButtonActionPerformed

    /**
     * startEngineButtonActionPerformed(...) gestisce la visualizzazione di un
     * jButton in
     * una particolare situazione di gioco
     * 
     * @param evt
     */
    private void startEngineButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_startEngineButtonActionPerformed
        if (isPushedGear) {
            game.getCampanile().setVisible(true);
            isStartedEngine = true;
            direction.getObject().setCollected(true);
            stampStoryArea(Enumstamp.START_ENGINE);
        } else {
            stampStoryArea(Enumstamp.NO_START_ENGINE);
        }
        startEngineButton.setVisible(false);
    }// GEN-LAST:event_startEngineButtonActionPerformed

    /**
     * All'interno di initIcon() viene gestita l'inizializzazione delle icone
     * dei vari JButton.
     */
    private void initIcon() {
        Action newAction = new NewAction("");
        newAction.putValue(Action.LARGE_ICON_KEY,
                new ImageIcon("classes/img/up_arrow_img.png"));
        upArrow.setAction(newAction);

        newAction = new NewAction("");
        newAction.putValue(Action.LARGE_ICON_KEY,
                new ImageIcon("classes/img/down_arrow_img.png"));
        downArrow.setAction(newAction);

        newAction = new NewAction("");
        newAction.putValue(Action.LARGE_ICON_KEY,
                new ImageIcon("classes/img/left_arrow_img.png"));
        leftArrow.setAction(newAction);

        newAction = new NewAction("");
        newAction.putValue(Action.LARGE_ICON_KEY,
                new ImageIcon("classes/img/right_arrow_img.png"));
        rightArrow.setAction(newAction);

        newAction = new NewAction(" osserva");
        newAction.putValue(Action.LARGE_ICON_KEY,
                new ImageIcon("classes/img/seeing_img.png"));
        lookingButton.setAction(newAction);

        newAction = new NewAction(" raccogli");
        newAction.putValue(Action.LARGE_ICON_KEY,
                new ImageIcon("classes/img/collect_img.png"));
        collectButton.setAction(newAction);

        newAction = new NewAction(" inventario");
        newAction.putValue(Action.LARGE_ICON_KEY,
                new ImageIcon("classes/img/inventory_img.png"));
        inventoryButton.setAction(newAction);

        newAction = new NewAction(" Conferma");
        newAction.putValue(Action.LARGE_ICON_KEY,
                new ImageIcon("classes/img/confirm_img.png"));
        confirmInventory.setAction(newAction);

        newAction = new NewAction(" Annulla");
        newAction.putValue(Action.LARGE_ICON_KEY,
                new ImageIcon("classes/img/cancel_img.png"));
        cancelInventory.setAction(newAction);

        newAction = new NewAction(" ATTACCO");
        attackButton.setText("");
        newAction.putValue(Action.LARGE_ICON_KEY,
                new ImageIcon("classes/img/attack_img.png"));
        attackButton.setAction(newAction);

        newAction = new NewAction(" DIFESA");
        defenceButton.setText("");
        newAction.putValue(Action.LARGE_ICON_KEY,
                new ImageIcon("classes/img/defence_img.png"));
        defenceButton.setAction(newAction);

        newAction = new NewAction(" FURTIVO");
        newAction.putValue(Action.LARGE_ICON_KEY,
                new ImageIcon("classes/img/furtive_img.png"));
        furtiveButton.setAction(newAction);

        newAction = new NewAction(" Dormi");
        newAction.putValue(Action.LARGE_ICON_KEY,
                new ImageIcon("classes/img/bed_img.png"));
        bedButton.setAction(newAction);

        newAction = new NewAction(" Inserisci");
        newAction.putValue(Action.LARGE_ICON_KEY,
                new ImageIcon("classes/img/push_img.png"));
        pushButton.setAction(newAction);

        newAction = new NewAction(" Spingi pulsante");
        newAction.putValue(Action.LARGE_ICON_KEY,
                new ImageIcon("classes/img/startengine_img.png"));
        startEngineButton.setAction(newAction);

        newAction = new NewAction(" Apri");
        newAction.putValue(Action.LARGE_ICON_KEY,
                new ImageIcon("classes/img/open_img.png"));
        openButton.setAction(newAction);
    }

    /**
     * initButton() è il metodo che inizializza i jbutton
     */
    public void initButton() {
        confirmInventory.setVisible(false);
        cancelInventory.setVisible(false);
        comboBoxInventory.setVisible(false);
        attackButton.setVisible(false);
        defenceButton.setVisible(false);
        furtiveButton.setVisible(false);
        bedButton.setVisible(false);
        openButton.setVisible(false);
        pushButton.setVisible(false);
        startEngineButton.setVisible(false);
    }

    /**
     * setAllButton(...) è il metodo che abilita o disabilita i jButton
     * 
     * @param choose viene passato un booleano al metodo che indica la
     *               visibilità dei tasti.
     */
    public void setAllButton(boolean choose) {
        upArrow.setEnabled(choose);
        downArrow.setEnabled(choose);
        leftArrow.setEnabled(choose);
        rightArrow.setEnabled(choose);
        comboBoxInventory.setEnabled(choose);
        collectButton.setEnabled(choose);
        inventoryButton.setEnabled(choose);
        lookingButton.setEnabled(choose);
        map.setEnabled(choose);
        bedButton.setEnabled(choose);
    }

    /**
     * setAllButtonVisible(...) è il metodo che rende visibili o meno una serie di
     * tasti.
     *
     * @param choose viene passato un booleano al metodo che indica la
     *               visibilità dei tasti.
     */
    private void setAllButtonVisible(boolean choose) {
        upArrow.setVisible(choose);
        downArrow.setVisible(choose);
        leftArrow.setVisible(choose);
        rightArrow.setVisible(choose);
        collectButton.setVisible(choose);
        inventoryButton.setVisible(choose);
        lookingButton.setVisible(choose);
        map.setVisible(choose);
    }

    /**
     * setFightButton è il metodo che rende visibili o meno i
     * tasti del combattimento.
     *
     * @param choose viene passato un booleano al metodo che indica la
     *               visibilità dei tasti.
     */
    private void setFightButton(boolean choose) {
        attackButton.setVisible(choose);
        defenceButton.setVisible(choose);
        furtiveButton.setVisible(choose);
    }

    /**
     * setFightButton è il metodo che rende visibili o meno i
     * tasti per la password
     *
     * @param choose viene passato un booleano al metodo che indica la
     *               visibilità dei tasti.
     */
    public void setCodButton(boolean choose) {
        aButton.setVisible(choose);
        bButton.setVisible(choose);
        dButton.setVisible(choose);
        cButton.setVisible(choose);
        eButton.setVisible(choose);
        fButton.setVisible(choose);
        gButton.setVisible(choose);
        hButton.setVisible(choose);
        iButton.setVisible(choose);
        confirmCod.setVisible(choose);
        cancelCod.setVisible(choose);
        codArea.setVisible(choose);
    }

    /**
     * setFightButton è il metodo che rende visibili o meno i
     * tasti per l'inserimento
     *
     * @param choose viene passato un booleano al metodo che indica la
     *               visibilità dei tasti.
     */
    private void setPushButton(boolean choose) {
        openButton.setVisible(choose);
        setButtonInventory(choose);
        pushButton.setVisible(choose);
        startEngineButton.setVisible(choose);
        openButton.setVisible(choose);
    }

    /**
     * showWinDialog() gestisce la visualizzazione di una finestra di
     * dialogo con le opzioni per iniziare una nuova partita
     * o chiudere il gioco
     */
    private void showWinDialog() {
        int x = JOptionPane.showConfirmDialog(null, "VUOI INIZIARE UNA NUOVA PARTITA?",
                "HAI COMPLETATO IL GIOCO... VITTORIA!!!", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
        if (x == JOptionPane.YES_OPTION) {
            AppMain.closeFrame();
            AppMain.runGame();
        } else {
            AppMain.closeFrame();

        }
    }

    /**
     * showWinDialog() è il metodo gestisce la visualizzazione di una finestra di
     * dialogo
     * nel caso di giocatore sconfitto
     */
    private void showDeadDialog() {
        JOptionPane.showMessageDialog(this, "SEI MORTO...RIPRISTINO VITA", "END", JOptionPane.ERROR_MESSAGE);
    }

    /**
     * closeGame() è il metodo che gestisce la chiusura del gioco
     */
    private void closeGame() {
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                int x = JOptionPane.showConfirmDialog(null, "Sei sicuro di voler uscire?", "close",
                        JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
                if (x == JOptionPane.YES_OPTION) {
                    e.getWindow().dispose();
                }
            }
        });
    }

    /**
     * setAllButtonVisible(...) è il metodo che rende visibili o meno i
     * tasti dell'inventario
     *
     * @param choose viene passato un booleano al metodo che indica la
     *               visibilità dei tasti.
     */
    private void setButtonInventory(boolean choose) {
        confirmInventory.setVisible(choose);
        cancelInventory.setVisible(choose);
        comboBoxInventory.setVisible(choose);
    }

    /**
     * move(...) è il metodo che valuta il movimento della SUORA
     * in base a varie situazioni
     */
    private void move() {
        setPushButton(false);
        frameMap.dispose();
        isLooked = false;
        restorePlace = game.getSuora().getCurrentPlace();
        if (direction == null) {
            differentMove(TypeMove.WALL);
        } else if (direction.isAccessible()) {
            differentMove(TypeMove.ACCESIBLE);
        } else {
            differentMove(TypeMove.CODBLOCK);
        }
    }

    /**
     * differentMove(...) è il metodo che gestisce il movimento in 3 casi
     * possibili
     * 
     * @param move tipo di mossa
     */
    private void differentMove(TypeMove move) {
        switch (move.name()) {
            case "WALL": // luogo chiuso
                stampStoryArea(Enumstamp.BLOCK);
                break;

            case "ACCESIBLE": // luogo accessibile
                game.getSuora().setCurrentPlace(direction);
                particularDirection();
                combat();

                break;
            case "CODBLOCK": // luogo bloccato da codice
                if (direction.isCodBlock()) {
                    setCodButton(true);
                    setAllButton(false);
                    stampStoryArea(Enumstamp.INSERT_CODE);
                } else {
                    stampStoryArea(Enumstamp.LOCKED_PLACE);
                    for (int i = 0; i < game.getInventoryList().getList().size(); i++) {
                        AdvObject currentObject = game.getInventoryList().getList().get(i);
                        if (currentObject.getId() == direction.getId()) {
                            direction.setAccessible(true);
                            game.getInventoryList().remove(currentObject);
                            game.getSuora().getCurrentPlace().getObject().setPickupable(false);
                            stampStoryArea(Enumstamp.UNLOCKED_PLACE);
                        }
                    }
                }
                break;
        }
    }

    /**
     * particularDirection() è il metodo che gestisce l'entrata in luoghi
     * con eventi particolari
     */
    private void particularDirection() {
        try {
            if (game.getSuora().getCurrentPlace().getObject().getId() == ID_FLOOR_0
                    || game.getSuora().getCurrentPlace().getObject().getId() == ID_FLOOR_1
                    || game.getSuora().getCurrentPlace().getObject().getId() == ID_FLOOR_2
                    || game.getSuora().getCurrentPlace().getObject().getId() == ID_FLOOR_M1) {
                bedButton.setVisible(true);
            } else {
                bedButton.setVisible(false);
            }
        } catch (NullPointerException exceptionBed) {
            bedButton.setVisible(false);
        }
        stampStoryArea(Enumstamp.NULL);
        if (!direction.isVisible()) {
            stampStoryArea(Enumstamp.UNVISIBLE_PLACE);
        }
        try {
            if (game.getSuora().getCurrentPlace().getObject().getId() == ID_CROCIFISSO) {
                for (AdvObject searchObject : game.getInventoryList().getList()) {
                    if (searchObject.getId() == ID_CHIAVE1) {
                        isEnd = true;
                    }
                }
                if (isEnd) {
                    setAllButton(false);
                    stampStoryArea(Enumstamp.END);
                    showWinDialog();
                } else {
                    stampStoryArea(Enumstamp.NO_END);
                }
            }
        } catch (NullPointerException exceptionEnd) {

        }
    }

    /**
     * combat() è il metodo che prepara al combattimento se si
     * ha almeno un'arma
     */
    private void combat() {
        boolean oneWeapon = false;
        if (game.getFantasma(direction).isAlive() && game.getFantasma(direction).getCurrentPlace() == direction) {
            if (game.getInventoryList().getList().isEmpty()) {
                game.getSuora().setCurrentPlace(restorePlace);
                stampStoryArea(Enumstamp.NO_WEAPON);
            } else {
                for (AdvObject inventoryObject : game.getInventoryList().getList()) {
                    if (inventoryObject.getId() == ID_CROCIFISSO//
                            || inventoryObject.getId() == ID_CANDELABRO
                            || inventoryObject.getId() == ID_PIETRA) {
                        oneWeapon = true; // si ha almeno un'arma
                    }
                }
                if (oneWeapon) {
                    tempLife = game.getSuora().getHealthPoints();
                    setFightButton(true);
                    setAllButtonVisible(false);
                    stampStoryAreaCombat(EnumstampCombat.START_COMBAT);
                } else {
                    game.getSuora().setCurrentPlace(restorePlace); // luogo inaccessibile in assenza di un'arma
                    stampStoryArea(Enumstamp.NO_WEAPON);
                }
            }
        }
    }

    /**
     * stampPlace() è il metodo che stampa delle info utili all'utente.
     */
    private void stampPlace() {
        storyArea.setText("");
        storyArea.setText(
                "GIOCATORE: " + getSuora.getText().toUpperCase()
                        + "\nLUOGO: " + game.getSuora().getCurrentPlace().getName().toUpperCase()
                        + "\nPUNTI VITA: " + game.getSuora().getHealthPoints()
                        + "\n--------------------------------------------------------\n");
        if (game.getSuora().getCurrentPlace().isVisible()) {
            storyArea.append(game.getSuora().getCurrentPlace().getDescription() + "\n\n");
        }
    }

    /**
     * All'interno di prinStoryArea(...) sono raccolte tutte le stampe della
     * JTextArea storyArea().
     *
     * @param selectedEnum viene dato al metodo un Enumstamp il quale poi viene
     *                     utilizzato da uno switch.
     */
    private void stampStoryArea(Enumstamp selectedEnum) {
        stampPlace();
        switch (selectedEnum.name()) {
            case "BLOCK":
                storyArea.append("C'è un ostacolo che non posso superare...");
                break;

            case "COLLECT":
                storyArea.append("OGGETTO RACCOLTO: "
                        + game.getSuora().getCurrentPlace().getObject().getName());
                break;

            case "NO_COLLECT":
                storyArea.append("Non c'è niente da raccogliere");
                break;

            case "LOOK":
                storyArea.append(game.getSuora().getCurrentPlace().getLook());
                break;

            case "NO_LOOK":
                storyArea.append("Non ho ispezionato il posto... "
                        + "\nnon so che raccogliere");
                break;

            case "JUST_COLLECT":
                storyArea.append("Ho già perlustrato il posto...");
                break;

            case "NOTHING_TO_LOOK":
                storyArea.append("Non c'è niente di interessante da osservare");
                break;

            case "LOOK_UNVISIBLE_PLACE":
                storyArea.append("Non riesco a scorgere nulla,"
                        + "\nil luogo è troppo buio");
                break;

            case "UNVISIBLE_PLACE":
                storyArea.append("Ehi... qua è buio pesto!!!"
                        + "\nNon riesco a vedere nulla");
                break;

            case "LOCKED_PLACE":
                if (direction.getId() == 2) {
                    storyArea.append("C'è un cumulo di macerie che blocca il passaggio"
                            + "\nMagari potessi far saltare in aria tutto quanto!");
                } else {
                    storyArea.append("Diamine!"
                            + "\nLa porta e' chiusa, serve una chiave");
                }

                break;

            case "UNLOCKED_PLACE":
                if (direction.getId() == 2) {
                    storyArea.append("Grazie alla luce del candelabro che avevo con me"
                            + "\nsono riuscito a vedere meglio i documenti e a scoprire delle password che mi potrebbero servire..."
                            + "\n\nscoperta codice");
                } else {
                    storyArea.append("PORTA SBLOCCATA ");
                }

                break;

            case "RESTORE_PLACE":
                storyArea.append("\n Sono tornato in: " + game.getSuora().getCurrentPlace().getName());
                break;

            case "ERROR_CODE":
                storyArea.append("CODICE ERRATO");
                break;

            case "INSERT_CODE":
                storyArea.append("La porta è chiusa."
                        + "\nAccanto però c'è un tastierino con delle lettere con su scritto:"
                        + "\nINSERIRE CODICE 4 LETTERE");
                break;

            case "CANCEL_CODE":
                storyArea.append("Chissà qual è il codice..."
                        + "\nCi penso un po' e poi ci ritorno...");
                break;

            case "RESTORE_HEALTH":
                stampPlace();
                storyArea.append("Cavolo che bella dormita!"
                        + "\nQuasi dimenticavo di star per morire");
                break;

            case "NO_WEAPON":
                storyArea.append("Noto qualcosa di terrificante in quella direzione..."
                        + "\nMeglio trovare un'arma!");
                break;

            case "IS_DEAD":
                storyArea.append("fantasma sconfitto"
                        + "\ngrazie alla sua sconfitta, potrò avere la pozione curativa"
                        + "\nHai raccolto:Pozione curativa");
                break;


            case "START_MOVE":
                storyArea.append("Un rumore assordante mi fa capire che c'è qualcos'altro!"
                        + "\ vado a controllare!");
                break;

            case "END":
                storyArea.append("con quest ultimo codice dovrei riuscire ad aprire la porta!"
                        + "\nVedo una luce bianchissima come se mi stessi teletrasportando. Speriamo che quest'incubo sia finito...");
                break;


            case "NULL":
                break;
        }
    }

    /**
     * stampStoryAreaCombat(...) è il metodo dove sono raccolte tutte
     * le stampe per ilcombattimento
     *
     * @param selectedEnum viene dato al metodo un EnumStampCombat il quale poi
     *                     viene
     *                     utilizzato da uno switch.
     */
    private void stampStoryAreaCombat(EnumStampCombat selectedEnum) {
        switch (selectedEnum.name()) {
            case "START_COMBAT":
                storyArea.setText(
                        game.getSuora().getName().toUpperCase()
                                + " preparati alla BATTAGLIA contro il FANTASMA: "
                                + game.getFantasma(direction).getName()
                                + " (" + game.getFantasma(direction).getDescription() + ")"
                                + "\n\nEQUIPAGGIO L'ARMA MIGLIORE: " + getBestWeapon().getName() + "    DANNO: "
                                + getBestWeapon().getDamage()
                                + "\n\n TU ED IL FANTASMA EFFETTUERETE LA SCELTA SUL TIPO DI ATTACCO. RICORDA CHE: "
                                + "\n -ATTACCO vince su FURTIVO\n -DIFESA vince su ATTACCO"
                                + "\n -FURTIVO vince su DIFESA \n");
                break;

            case "DRAW":
                storyArea.append("\nPAREGGIO!");
                break;

            case "ATTACK":
                storyArea.setText("IL FANTASMA USA: ATTACCO");
                break;

            case "DEFENCE":
                storyArea.setText("IL FANTASMA USA: DIFESA");
                break;

            case "FURTIVE":
                storyArea.setText("IL FANTASMA USA: FURTIVO");
                break;

            case "INFO":
                storyArea.append("\n\nVITA " + game.getSuora().getName() + ": " + game.getSuora().getHealthPoints());
                storyArea.append("\n\nVITA FANTASMA:" + game.getFantasma(direction).getHealthPoints());
                break;
        }
    }

    /**
     * restoreLife() è il metodo che rigenera la vita al fantasma
     */
    private void restoreLife() {
        if (game.getFantasma(direction).getName().equals("Formaggino")) {
            game.getFantasma(direction).setHealthPoints(HP_FORMAGGINO);
        } else if (game.getFantasma(direction).getName().equals("Diablo")) {
            game.getFantasma(direction).setHealthPoints(HP_DIABLO);
        } else if (game.getFantasma(direction).getName().equals("Creativo")) {
            game.getFantasma(direction).setHealthPoints(HP_CREATIVO);
        }
    }

    /**
     * generateRandomNumber() è il metodo che genera un numero
     * casuale per gestire la scelta del fantasma durante
     * il combattimento
     * 
     * @return
     */
    private String generateRandomNumber() {
        Random random = new Random();
        String actionFantasma;
        int casualAttackFantasma = random.nextInt(3);
        switch (casualAttackFantasma) {
            case 0:
                return EnumFantasma.ATTACK.name();
            case 1:
                return EnumFantasma.DEFENCE.name();
            case 2:
                return EnumFantasma.FURTIVE.name();
        }
        return null;
    }

    /**
     * iewMap(...) è il metodo che fa visualizzare la mappa
     * 
     * @param img
     */
    private void viewMap(String img) {
        JTextPane view = new JTextPane();
        frameMap.add(view);
        view.insertIcon(new ImageIcon(img));
        frameMap.setSize(MAP_HEIGHT, MAP_LENGHT);
        view.setEditable(false);
        frameMap.setVisible(true);
    }

    /**
     * getBestWeapon() è il metodo che seleziona l'arma migliore
     * nell'inventario
     * 
     * @return
     */
    private AdvObject getBestWeapon() {
        return Collections.max(game.getInventoryList().getList());
    }

    /**
     * calculateFightResult(...) è il metodo che calcola il risultato del
     * combattimento
     * 
     * @param tempLife vita prima del combattimento per un eventuale ripristino
     */
    private void calculateFightResult(int tempLife) {
        if (game.getSuora().getHealthPoints() <= MIN_Suora_HP) { // suora morto
            game.getSuora().setHealthPoints(tempLife); // ripristino vita suora
            restoreLife(); // ripristino vita fantasma
            game.getSuora().setCurrentPlace(restorePlace); // ripristino luogo corrente prima del combattimento
            setAllButtonVisible(true);
            setFightButton(false);
            stampStoryArea(EnumStamp.RESTORE_PLACE);
            showDeadDialog();
        } else if (game.getFantasma(direction).getHealthPoints() <= MIN_Fantasma_HP) {
            game.getInventoryList().add(game.getClue(direction));
            stampStoryArea(EnumStamp.IS_DEAD);
            setFightButton(false);
            setAllButtonVisible(true);
            game.getFantasma(direction).setAlive(false);
        }
    }

    public class NewAction extends AbstractAction {

        public NewAction(String name) {
            super(name);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
        }
    }
}
