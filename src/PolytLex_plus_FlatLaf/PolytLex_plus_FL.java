/*
 * The MIT License
 *
 * Copyright 2024-2025 Μαρέτσικος Χρῆστος.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

/**
 *
 * @author Μαρέτσικος Χρῆστος
 */

package PolytLex_plus_FlatLaf;

import static PolytLex_plus_FlatLaf.Settings.backupSelectColor;
import static PolytLex_plus_FlatLaf.Settings.convertAccentColortoRGB;
import static PolytLex_plus_FlatLaf.Settings.currentColorSelection;
import static PolytLex_plus_FlatLaf.Virtual_Keyboard.dialog_color_selector;
import static PolytLex_plus_FlatLaf.Rules.rulesColor;
import static PolytLex_plus_FlatLaf.Settings.myChoice;

import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatIntelliJLaf;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.intellijthemes.FlatArcDarkIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatArcDarkOrangeIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatArcIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatArcOrangeIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatCarbonIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatCobalt2IJTheme;
import com.formdev.flatlaf.intellijthemes.FlatCyanLightIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatDarkFlatIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatDarkPurpleIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatDraculaIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatGradiantoDarkFuchsiaIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatGradiantoDeepOceanIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatGradiantoMidnightBlueIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatGradiantoNatureGreenIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatGrayIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatGruvboxDarkHardIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatHiberbeeDarkIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatHighContrastIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatLightFlatIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatMaterialDesignDarkIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatMonocaiIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatMonokaiProIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatNordIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatOneDarkIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatSolarizedDarkIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatSolarizedLightIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatSpacegrayIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatVuesionIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatXcodeDarkIJTheme;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMTArcDarkIJTheme;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMTAtomOneDarkIJTheme;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMTAtomOneLightIJTheme;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMTDraculaIJTheme;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMTGitHubDarkIJTheme;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMTGitHubIJTheme;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMTLightOwlIJTheme;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMTMaterialDarkerIJTheme;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMTMaterialDeepOceanIJTheme;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMTMaterialLighterIJTheme;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMTMaterialOceanicIJTheme;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMTMaterialPalenightIJTheme;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMTMonokaiProIJTheme;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMTMoonlightIJTheme;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMTNightOwlIJTheme;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMTSolarizedDarkIJTheme;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMTSolarizedLightIJTheme;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import com.mallowigi.idea.themes.MTOceanicThemeAction;
import static PolytLex_plus_FlatLaf.Settings.flagRound;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import java.util.Scanner;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.ListSelectionModel;
import java.util.Collections;
import java.nio.file.*;
import java.nio.charset.*;
import javax.swing.ImageIcon;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class PolytLex_plus_FL extends javax.swing.JFrame  {
       
    /**
     * Creates new form PolytLex_plus_FL
     */
    
    DefaultListModel defaultListModel =new DefaultListModel();
    
    private myProgressBar myBar;
    private myZeroProgressBar myZeroBar;
    
    String saveMyWord;
    
    String pathFakelos = ("./data/olatalexika/");
    String pathPG = ("olatalexika_");
    String pathGramma=("ola_ta_grammata.dat");
    String path = (pathFakelos + pathPG + pathGramma); 
    
    
    String path_userLex=("./data/lexikochristi/lc_ola_ta_grammata.dat");
    String path_for_letter_allLex=" ";
    String path_allLex=("./data/olatalexika/olatalexika_ola_ta_grammata.dat");
  
    ButtonGroup myBtnGroup = new ButtonGroup();
   
    boolean flagBold=false;
    boolean flagJList=true;
    int sizeJList=0;
    int minusWords=2;
            
    JButton myColorBtn = new JButton(" ");
        
    int b3numR=255, b3numG=255, b3numB=235;  //JList Color: 255,255,235
    Color mybgcolor= new Color (b3numR, b3numG, b3numB); 
    
    int origverbgnumR=255, origverbgnumG=255, origverbgnumB=215;
    Color origverbgcolor= new Color (origverbgnumR, origverbgnumG, origverbgnumB); 
    
   
    int numR=127;
    int numG=127;
    int numB=127;
    Color mycolor =  new Color(numR, numG, numB); 
    
    int BG_Color_btnR;
    int BG_Color_btnG;
    int BG_Color_btnB;
    Color BG_Color_btn = new Color (BG_Color_btnR, BG_Color_btnG, BG_Color_btnB);
    
    int FG_Color_btnR;
    int FG_Color_btnG;
    int FG_Color_btnB;
    Color FG_Color = new Color (FG_Color_btnR, FG_Color_btnG, FG_Color_btnB);
    
    int BG_Color_listR;
    int BG_Color_listG;
    int BG_Color_listB;
    Color BG_Color_list=new Color(BG_Color_listR, BG_Color_listG, BG_Color_listB);

    int numSCR;
    int numSCG;
    int numSCB;
    Color mySelColor1 =  new Color(numSCR, numSCG, numSCB); 
    Color backupMySelColor;
    
    int Yellow_NumR=255, Yellow_NumG=225, Yellow_NumB=100;
    Color mySelected_Color =  new Color(Yellow_NumR, Yellow_NumG, Yellow_NumB);
    
    Color selectedColor;
    
    int setMyTextSize=20;
    String setMyFont="Arial";
    
    Font myFont_for_List;
    Font myFont_for_searchTxt;
    
    String myLang;
    String setMyLang="Greek";
    String setMyLangChars="gr" ;
    String pathMyLang="./languages/Greek/polytlex+_gr.lang";
    String myForm="/polytlex+_";
    
    String sosMessageEn="Ἐνεργοποίηση τῆς λίστας", sosMessageDis="Ἀπενεργοποίηση τῆς λίστας", OriginalVersion="Πρωτότυπη ἔκδοση";
    
    String Title_ColorPalette;
    
    int lenString=0;
    
    long startTime;
    long TimeIndication1;
    long TimeIndication2;
  
    String backup_Letter=("Α~Ω");
    public static PolytLex_plus_FL Instance;
    
    JButton which_Button = new JButton(" "); 

    public static File myCurrentFile; 
    public static File mySelectedFile;
    public static File sendmeTheFileNametypeFile;
   
    public static String setCurrentFile="";
    public static String sendmeTheFileName="";
    public static String choose_Selected_File="";
    public static String questionLabel;
    public static String myFileName;
    public static String temp;
        
    public static boolean Editor_or_VirtualKeyboard;
    
    public static boolean flag_insertOpenFileDialog=false;
    public static boolean flag_insertSaveFileDialog=false;
    public static boolean flag_Save;
    public static boolean flag_newFile;
    public static boolean flag_Question;
    
    public static int number_lex=7;
    
    String strTheme, strIndexTheme;
    public static int setIndexTheme;
    public static String theAccentColor, myColor1;
    
    Color testcolorBG, testcolorFG, aaa;
    //public static Color myBlue_Color;
    public static boolean flagTheme=true;
    
    public PolytLex_plus_FL() throws FileNotFoundException, IOException {

        initComponents();
        JFrame.setDefaultLookAndFeelDecorated(true); //for Title and Icon for Linux
     
        Image small_logo = new ImageIcon(this.getClass().getResource("/PolytLexplus_logo_256x256.png")).getImage();
        this.setIconImage(small_logo);
        
        this.pleaseBindMyWordsForList();
        
        which_Button = jButton_Alfa_Omega_; 
    
    }
    
    private ArrayList<String> pleaseGetMyWords() throws FileNotFoundException, IOException{
    
        ArrayList <String> words = new ArrayList<>();
        
        startTime = System.currentTimeMillis();   
       
        try ( //Ἀνάγνωση ὁλόκληρης τῆς γραμμῆς ὡς συμβολοσειρά.
        //Φόρτωση δεδομένων ἀπὸ τὸ ἀρχεῖο.
         BufferedReader myBufferedReader = new BufferedReader(new FileReader(path)) //default is 8K = 8192
            ) {
        
        String line = myBufferedReader.readLine();
            //Ἔλεγχος γιὰ τὸ τέλος τοῦ ἀρχείου.
            while (line != null) {
                words.add(line);
                line = myBufferedReader.readLine();
            }
        
        //Κλείσιμο τοῦ ἀντικειμένου bufferreader.
        myBufferedReader.close();
        
        }
        
        //System.out.println(" ");
        TimeIndication1=System.currentTimeMillis() - startTime;
        //System.out.println("Χρόνος φόρτωσης τοῦ λεξικοῦ  = " + (TimeIndication1) + " ms"); 
        
        return words;
        
    }
    
    private void pleaseBindMyWordsForList() throws FileNotFoundException{
        try {
            pleaseGetMyWords().stream().forEach((myword)->{
            defaultListModel.addElement(myword);
            });
        }
        catch (IOException ex) {
            Logger.getLogger(PolytLex_plus_FL.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        myJList.setModel(defaultListModel);
        myJList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
              
    }
 
    private void searchFilter (String searchWord) throws FileNotFoundException, IOException{
      
        //System.out.println(pathFakelos);
        //System.out.println(pathGramma);
        //System.out.println(pathFakelos + pathPG + pathGramma);
        
        DefaultListModel filteredItems=new DefaultListModel();
        List<String> lexwords=pleaseGetMyWords();
        lexwords.stream().forEach((myword)->{
            String wordName=myword.toLowerCase();
            
            if  (wordName.contains(searchWord.toLowerCase())) {
                
                filteredItems.addElement(myword);
            }
        }
        );
        
        defaultListModel=filteredItems;  
        myJList.setModel(defaultListModel);
 
    }  
             
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        jLabel1 = new javax.swing.JLabel();
        jPanel_PolytLex_plus_ = new javax.swing.JPanel();
        jButton_Alfa_ = new javax.swing.JButton();
        jButton_Ni_ = new javax.swing.JButton();
        jButton_Vita_ = new javax.swing.JButton();
        jButton_Gamma_ = new javax.swing.JButton();
        jButton_Delta_ = new javax.swing.JButton();
        jButton_Epsilon_ = new javax.swing.JButton();
        jButton_Zita_ = new javax.swing.JButton();
        jButton_Ita_ = new javax.swing.JButton();
        jButton_Thita_ = new javax.swing.JButton();
        jButton_Iota_ = new javax.swing.JButton();
        jButton_Exit_ = new javax.swing.JButton();
        jButton_Kappa_ = new javax.swing.JButton();
        jButton_Lamda_ = new javax.swing.JButton();
        jButton_Mi_ = new javax.swing.JButton();
        jButton_Ksi_ = new javax.swing.JButton();
        jButton_Omikron_ = new javax.swing.JButton();
        jButton_Chi_ = new javax.swing.JButton();
        jButton_Psi_ = new javax.swing.JButton();
        jButton_Omega_ = new javax.swing.JButton();
        jButton_Pi_ = new javax.swing.JButton();
        jButton_Ro_ = new javax.swing.JButton();
        jButton_Sigma_ = new javax.swing.JButton();
        jButton_Taf_ = new javax.swing.JButton();
        jButton_Ypsilon_ = new javax.swing.JButton();
        jButton_Phi_ = new javax.swing.JButton();
        jScrollPane_PolytLex_plus_plus_ = new javax.swing.JScrollPane();
        myJList = new javax.swing.JList<>();
        jTextField_searchTxt_ = new javax.swing.JTextField();
        jLabel_searchTxt_ = new javax.swing.JLabel();
        jButton_Font_Decrease_ = new javax.swing.JButton();
        jButton_Font_Increase_ = new javax.swing.JButton();
        jButton_Keyboard_ = new javax.swing.JButton();
        jButton_X_Clear_ = new javax.swing.JButton();
        jButton_Alfa_Omega_ = new javax.swing.JButton();
        jRadioButton_Perseus_ = new javax.swing.JRadioButton();
        jRadioButton_PolyKeimena_ = new javax.swing.JRadioButton();
        jRadioButton_KD_ = new javax.swing.JRadioButton();
        jRadioButton_PD_ = new javax.swing.JRadioButton();
        jButton_Bold_ = new javax.swing.JButton();
        jTextField_Total_ = new javax.swing.JTextField();
        jLabel_Total_ = new javax.swing.JLabel();
        jRadioButton_LexikoChristi_ = new javax.swing.JRadioButton();
        jLabel_SelectedLex_ = new javax.swing.JLabel();
        jButton_Save_ = new javax.swing.JButton();
        jTextField_SelectedLex_ = new javax.swing.JTextField();
        jButton_Kanones_ = new javax.swing.JButton();
        jButton_Settings_ = new javax.swing.JButton();
        jRadioButton_Ola_ta_Lexika_ = new javax.swing.JRadioButton();
        jButton_Info_ = new javax.swing.JButton();
        jButton_Reload_ = new javax.swing.JButton();
        jTextField_Font_Size_ = new javax.swing.JTextField();
        jTextField_Time_Indication_ = new javax.swing.JTextField();
        jProgressBar_LoadTime_ = new javax.swing.JProgressBar();
        jRadioButton_Logeion_ = new javax.swing.JRadioButton();
        jTextField_totalChars_ = new javax.swing.JTextField();
        jButton_Virtual_Keyboard_ = new javax.swing.JButton();
        jButton_Editor_ = new javax.swing.JButton();
        jButton_myColorChooser_1_ = new javax.swing.JButton();
        jButton_AccentColor_ = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PolytLex+");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel_PolytLex_plus_.setPreferredSize(new java.awt.Dimension(740, 723));

        jButton_Alfa_.setText("Α");
        jButton_Alfa_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Alfa_ActionPerformed(evt);
            }
        });

        jButton_Ni_.setText("Ν");
        jButton_Ni_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Ni_ActionPerformed(evt);
            }
        });

        jButton_Vita_.setText("Β");
        jButton_Vita_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Vita_ActionPerformed(evt);
            }
        });

        jButton_Gamma_.setText("Γ");
        jButton_Gamma_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Gamma_ActionPerformed(evt);
            }
        });

        jButton_Delta_.setText("Δ");
        jButton_Delta_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Delta_ActionPerformed(evt);
            }
        });

        jButton_Epsilon_.setText("Ε");
        jButton_Epsilon_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Epsilon_ActionPerformed(evt);
            }
        });

        jButton_Zita_.setText("Ζ");
        jButton_Zita_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Zita_ActionPerformed(evt);
            }
        });

        jButton_Ita_.setText("Η");
        jButton_Ita_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Ita_ActionPerformed(evt);
            }
        });

        jButton_Thita_.setText("Θ");
        jButton_Thita_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Thita_ActionPerformed(evt);
            }
        });

        jButton_Iota_.setText("Ι");
        jButton_Iota_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Iota_ActionPerformed(evt);
            }
        });

        jButton_Exit_.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_Exit_.setText("Ἔξοδος");
        jButton_Exit_.setToolTipText("Κλείσιμο τοῦ προγράμματος");
        jButton_Exit_.setPreferredSize(new java.awt.Dimension(320, 30));
        jButton_Exit_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Exit_ActionPerformed(evt);
            }
        });

        jButton_Kappa_.setText("Κ");
        jButton_Kappa_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Kappa_ActionPerformed(evt);
            }
        });

        jButton_Lamda_.setText("Λ");
        jButton_Lamda_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Lamda_ActionPerformed(evt);
            }
        });

        jButton_Mi_.setText("Μ");
        jButton_Mi_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Mi_ActionPerformed(evt);
            }
        });

        jButton_Ksi_.setText("Ξ");
        jButton_Ksi_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Ksi_ActionPerformed(evt);
            }
        });

        jButton_Omikron_.setText("Ο");
        jButton_Omikron_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Omikron_ActionPerformed(evt);
            }
        });

        jButton_Chi_.setText("Χ");
        jButton_Chi_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Chi_ActionPerformed(evt);
            }
        });

        jButton_Psi_.setText("Ψ");
        jButton_Psi_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Psi_ActionPerformed(evt);
            }
        });

        jButton_Omega_.setText("Ω");
        jButton_Omega_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Omega_ActionPerformed(evt);
            }
        });

        jButton_Pi_.setText("Π");
        jButton_Pi_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Pi_ActionPerformed(evt);
            }
        });

        jButton_Ro_.setText("Ρ");
        jButton_Ro_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Ro_ActionPerformed(evt);
            }
        });

        jButton_Sigma_.setText("Σ");
        jButton_Sigma_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Sigma_ActionPerformed(evt);
            }
        });

        jButton_Taf_.setText("Τ");
        jButton_Taf_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Taf_ActionPerformed(evt);
            }
        });

        jButton_Ypsilon_.setText("Υ");
        jButton_Ypsilon_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Ypsilon_ActionPerformed(evt);
            }
        });

        jButton_Phi_.setText("Φ");
        jButton_Phi_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Phi_ActionPerformed(evt);
            }
        });

        myJList.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        myJList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        myJList.setVisibleRowCount(4);
        jScrollPane_PolytLex_plus_plus_.setViewportView(myJList);

        jTextField_searchTxt_.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextField_searchTxt_.setToolTipText("Πληκτρολογῆστε τὴ λέξη ἢ μέρος τῆς λέξης");
        jTextField_searchTxt_.setPreferredSize(new java.awt.Dimension(170, 40));
        jTextField_searchTxt_.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_searchTxt_KeyReleased(evt);
            }
        });

        jLabel_searchTxt_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_searchTxt_.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_searchTxt_.setText("Ἀναζήτηση:");

        jButton_Font_Decrease_.setText("A");
        jButton_Font_Decrease_.setToolTipText("Μείωση μεγέθους γραμματοσειρᾶς");
        jButton_Font_Decrease_.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_Font_Decrease_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Font_Decrease_ActionPerformed(evt);
            }
        });

        jButton_Font_Increase_.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton_Font_Increase_.setText("A");
        jButton_Font_Increase_.setToolTipText("Αὔξηση μεγέθους γραμματοσειρᾶς");
        jButton_Font_Increase_.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_Font_Increase_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Font_Increase_ActionPerformed(evt);
            }
        });

        jButton_Keyboard_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton_Keyboard_.setText("Πληκτρολόγιο");
        jButton_Keyboard_.setPreferredSize(new java.awt.Dimension(320, 30));
        jButton_Keyboard_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Keyboard_ActionPerformed(evt);
            }
        });

        jButton_X_Clear_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton_X_Clear_.setText("X");
        jButton_X_Clear_.setToolTipText("Καθαρισμὸς");
        jButton_X_Clear_.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_X_Clear_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_X_Clear_ActionPerformed(evt);
            }
        });

        jButton_Alfa_Omega_.setText("Α ~ Ω");
        jButton_Alfa_Omega_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Alfa_Omega_ActionPerformed(evt);
            }
        });

        jRadioButton_Perseus_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton_Perseus_.setText("Περσέας Ψηφιακὴ Βιβλιοθήκη");
        jRadioButton_Perseus_.setPreferredSize(new java.awt.Dimension(320, 25));
        jRadioButton_Perseus_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_Perseus_ActionPerformed(evt);
            }
        });

        jRadioButton_PolyKeimena_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton_PolyKeimena_.setText("Πολυτονικὰ Κείμενα");
        jRadioButton_PolyKeimena_.setPreferredSize(new java.awt.Dimension(320, 25));
        jRadioButton_PolyKeimena_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_PolyKeimena_ActionPerformed(evt);
            }
        });

        jRadioButton_KD_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton_KD_.setText("Καινὴ Διαθήκη");
        jRadioButton_KD_.setPreferredSize(new java.awt.Dimension(320, 25));
        jRadioButton_KD_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_KD_ActionPerformed(evt);
            }
        });

        jRadioButton_PD_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton_PD_.setText("Παλαιὰ Διαθήκη");
        jRadioButton_PD_.setPreferredSize(new java.awt.Dimension(320, 25));
        jRadioButton_PD_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_PD_ActionPerformed(evt);
            }
        });

        jButton_Bold_.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_Bold_.setText("B");
        jButton_Bold_.setToolTipText("Ἔντονη γραμματοσειρὰ");
        jButton_Bold_.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_Bold_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Bold_ActionPerformed(evt);
            }
        });

        jTextField_Total_.setEditable(false);
        jTextField_Total_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField_Total_.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField_Total_.setText("0");
        jTextField_Total_.setFocusable(false);
        jTextField_Total_.setPreferredSize(new java.awt.Dimension(120, 30));

        jLabel_Total_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_Total_.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_Total_.setText("Σύνολο:");
        jLabel_Total_.setPreferredSize(new java.awt.Dimension(60, 30));

        jRadioButton_LexikoChristi_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton_LexikoChristi_.setText("Λεξικὸ Χρήστη");
        jRadioButton_LexikoChristi_.setPreferredSize(new java.awt.Dimension(320, 25));
        jRadioButton_LexikoChristi_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_LexikoChristi_ActionPerformed(evt);
            }
        });

        jLabel_SelectedLex_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_SelectedLex_.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_SelectedLex_.setText("Λεξικό");
        jLabel_SelectedLex_.setPreferredSize(new java.awt.Dimension(320, 25));

        jButton_Save_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diskette_save_icon.png"))); // NOI18N
        jButton_Save_.setToolTipText("Ἀποθήκευση τής λέξης");
        jButton_Save_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Save_ActionPerformed(evt);
            }
        });

        jTextField_SelectedLex_.setEditable(false);
        jTextField_SelectedLex_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField_SelectedLex_.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_SelectedLex_.setFocusable(false);
        jTextField_SelectedLex_.setPreferredSize(new java.awt.Dimension(320, 30));

        jButton_Kanones_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton_Kanones_.setText("Κανόνες τονισμοῦ");
        jButton_Kanones_.setPreferredSize(new java.awt.Dimension(320, 30));
        jButton_Kanones_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Kanones_ActionPerformed(evt);
            }
        });

        jButton_Settings_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/settings_icon.png"))); // NOI18N
        jButton_Settings_.setToolTipText("Ῥυθμίσεις");
        jButton_Settings_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Settings_ActionPerformed(evt);
            }
        });

        jRadioButton_Ola_ta_Lexika_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton_Ola_ta_Lexika_.setText("Ὅλα τὰ Λεξικὰ");
        jRadioButton_Ola_ta_Lexika_.setPreferredSize(new java.awt.Dimension(320, 25));
        jRadioButton_Ola_ta_Lexika_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_Ola_ta_Lexika_ActionPerformed(evt);
            }
        });

        jButton_Info_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton_Info_.setText("Σχετικὰ");
        jButton_Info_.setPreferredSize(new java.awt.Dimension(320, 30));
        jButton_Info_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Info_ActionPerformed(evt);
            }
        });

        jButton_Reload_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apply_settings_icon.png"))); // NOI18N
        jButton_Reload_.setToolTipText("Ἐφαρμογὴ τῶν ρυθμίσεων");
        jButton_Reload_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Reload_ActionPerformed(evt);
            }
        });

        jTextField_Font_Size_.setEditable(false);
        jTextField_Font_Size_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField_Font_Size_.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_Font_Size_.setToolTipText("Μέγεθος γραμματοσειρᾶς");
        jTextField_Font_Size_.setFocusable(false);
        jTextField_Font_Size_.setPreferredSize(new java.awt.Dimension(40, 40));

        jTextField_Time_Indication_.setEditable(false);
        jTextField_Time_Indication_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField_Time_Indication_.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_Time_Indication_.setText("---");
        jTextField_Time_Indication_.setFocusable(false);
        jTextField_Time_Indication_.setPreferredSize(new java.awt.Dimension(90, 30));

        jProgressBar_LoadTime_.setPreferredSize(new java.awt.Dimension(245, 20));

        jRadioButton_Logeion_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton_Logeion_.setText("Λογεῖον (Πανεπιστήμιο τοῦ Σικάγο)");
        jRadioButton_Logeion_.setPreferredSize(new java.awt.Dimension(320, 25));
        jRadioButton_Logeion_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_Logeion_ActionPerformed(evt);
            }
        });

        jTextField_totalChars_.setEditable(false);
        jTextField_totalChars_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField_totalChars_.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_totalChars_.setText(" ");
        jTextField_totalChars_.setFocusable(false);
        jTextField_totalChars_.setPreferredSize(new java.awt.Dimension(40, 40));

        jButton_Virtual_Keyboard_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton_Virtual_Keyboard_.setText("Εἰκονικὸ πληκτρολόγιο");
        jButton_Virtual_Keyboard_.setPreferredSize(new java.awt.Dimension(320, 30));
        jButton_Virtual_Keyboard_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Virtual_Keyboard_ActionPerformed(evt);
            }
        });

        jButton_Editor_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton_Editor_.setText("Συντάκτης κειμένου");
        jButton_Editor_.setPreferredSize(new java.awt.Dimension(320, 30));
        jButton_Editor_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Editor_ActionPerformed(evt);
            }
        });

        jButton_myColorChooser_1_.setBackground(new java.awt.Color(255, 255, 100));
        jButton_myColorChooser_1_.setToolTipText("Ἐπιλογὴ χρώματος");
        jButton_myColorChooser_1_.setPreferredSize(new java.awt.Dimension(20, 20));
        jButton_myColorChooser_1_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_myColorChooser_1_ActionPerformed(evt);
            }
        });

        jButton_AccentColor_.setToolTipText("Ἐπιλογὴ χρώματος θέματος");
        jButton_AccentColor_.setPreferredSize(new java.awt.Dimension(20, 20));
        jButton_AccentColor_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AccentColor_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_PolytLex_plus_Layout = new javax.swing.GroupLayout(jPanel_PolytLex_plus_);
        jPanel_PolytLex_plus_.setLayout(jPanel_PolytLex_plus_Layout);
        jPanel_PolytLex_plus_Layout.setHorizontalGroup(
            jPanel_PolytLex_plus_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_PolytLex_plus_Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel_PolytLex_plus_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_PolytLex_plus_Layout.createSequentialGroup()
                        .addComponent(jLabel_Total_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(295, 295, 295))
                    .addGroup(jPanel_PolytLex_plus_Layout.createSequentialGroup()
                        .addGroup(jPanel_PolytLex_plus_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel_PolytLex_plus_Layout.createSequentialGroup()
                                .addComponent(jButton_Mi_, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton_Omega_, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel_PolytLex_plus_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel_PolytLex_plus_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel_PolytLex_plus_Layout.createSequentialGroup()
                                        .addGroup(jPanel_PolytLex_plus_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton_Gamma_, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton_Delta_, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton_Epsilon_, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton_Zita_, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton_Ita_, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton_Thita_, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton_Iota_, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton_Vita_, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton_Alfa_, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton_Kappa_, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton_Lamda_, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel_PolytLex_plus_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton_Ksi_, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton_Omikron_, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton_Pi_, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton_Ro_, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton_Sigma_, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton_Taf_, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton_Phi_, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton_Ni_, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton_Ypsilon_, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton_Chi_, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton_Psi_, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel_searchTxt_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(jButton_Alfa_Omega_, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_PolytLex_plus_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_PolytLex_plus_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel_PolytLex_plus_Layout.createSequentialGroup()
                                    .addComponent(jTextField_searchTxt_, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextField_totalChars_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_PolytLex_plus_Layout.createSequentialGroup()
                                    .addComponent(jTextField_Total_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField_Time_Indication_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jProgressBar_LoadTime_, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane_PolytLex_plus_plus_, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, Short.MAX_VALUE)))
                .addGroup(jPanel_PolytLex_plus_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_PolytLex_plus_Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jButton_X_Clear_, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_Save_, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_Settings_, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_Reload_, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_myColorChooser_1_, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_AccentColor_, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_PolytLex_plus_Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jTextField_Font_Size_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_Font_Increase_, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_Font_Decrease_, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_Bold_, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton_Info_, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Exit_, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton_PD_, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Kanones_, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton_Ola_ta_Lexika_, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Virtual_Keyboard_, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Editor_, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton_LexikoChristi_, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_SelectedLex_, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton_KD_, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Keyboard_, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton_PolyKeimena_, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton_Logeion_, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton_Perseus_, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_SelectedLex_, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
        jPanel_PolytLex_plus_Layout.setVerticalGroup(
            jPanel_PolytLex_plus_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_PolytLex_plus_Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel_PolytLex_plus_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_PolytLex_plus_Layout.createSequentialGroup()
                        .addGroup(jPanel_PolytLex_plus_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_X_Clear_, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_Save_, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_Settings_, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_Reload_, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_AccentColor_, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_myColorChooser_1_, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel_PolytLex_plus_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_Bold_, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_Font_Size_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_Font_Decrease_, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_Font_Increase_, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_SelectedLex_, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField_SelectedLex_, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton_Perseus_, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton_Logeion_, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton_PD_, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton_KD_, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton_PolyKeimena_, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton_LexikoChristi_, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton_Ola_ta_Lexika_, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_Keyboard_, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_Kanones_, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_Virtual_Keyboard_, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_Editor_, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_Info_, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel_PolytLex_plus_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_Exit_, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_Time_Indication_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel_PolytLex_plus_Layout.createSequentialGroup()
                        .addGroup(jPanel_PolytLex_plus_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_totalChars_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_searchTxt_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_searchTxt_, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel_PolytLex_plus_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel_PolytLex_plus_Layout.createSequentialGroup()
                                .addGroup(jPanel_PolytLex_plus_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton_Ni_, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton_Alfa_, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel_PolytLex_plus_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel_PolytLex_plus_Layout.createSequentialGroup()
                                        .addComponent(jButton_Vita_, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel_PolytLex_plus_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jButton_Gamma_, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton_Omikron_, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jButton_Ksi_, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel_PolytLex_plus_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel_PolytLex_plus_Layout.createSequentialGroup()
                                        .addComponent(jButton_Delta_, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel_PolytLex_plus_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jButton_Epsilon_, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton_Ro_, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel_PolytLex_plus_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jButton_Zita_, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton_Sigma_, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel_PolytLex_plus_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jButton_Ita_, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton_Taf_, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jButton_Pi_, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel_PolytLex_plus_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton_Thita_, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton_Ypsilon_, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel_PolytLex_plus_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton_Iota_, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton_Phi_, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel_PolytLex_plus_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton_Kappa_, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton_Chi_, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel_PolytLex_plus_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton_Lamda_, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton_Psi_, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel_PolytLex_plus_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton_Mi_, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton_Omega_, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                                .addComponent(jButton_Alfa_Omega_, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane_PolytLex_plus_plus_, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(22, 22, 22)
                        .addComponent(jProgressBar_LoadTime_, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_PolytLex_plus_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_Total_, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_Total_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel_PolytLex_plus_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel_PolytLex_plus_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_searchTxt_KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_searchTxt_KeyReleased
        
        String myString=jTextField_searchTxt_.getText();
        char charToCheck=' ';
        
        lenString = myString.length();
        jTextField_totalChars_.setText(Integer.toString(lenString));
        
        for (int i=0; i<myString.length(); i++) {
            
            
            if (myString.charAt(i)==charToCheck) {
              jTextField_searchTxt_.setText("");
              lenString=0;
              jTextField_totalChars_.setText(Integer.toString(lenString));
              jTextField_Time_Indication_.setHorizontalAlignment(jTextField_Time_Indication_.CENTER);
              jTextField_Time_Indication_.setText("---");
              minusWords=2;
            }
          
            else {
                minusWords=0;
            }
        }
           
        try {
            searchFilter(jTextField_searchTxt_.getText());
        } catch (IOException ex) {
            Logger.getLogger(PolytLex_plus_FL.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        saveMyWord=jTextField_searchTxt_.getText();
        //System.out.println(saveMyWord);
        sizeJList=defaultListModel.getSize();
        //System.out.println(sizeJList);
        jTextField_Total_.setText(String.format("%,d",sizeJList - minusWords));
        
    }//GEN-LAST:event_jTextField_searchTxt_KeyReleased

    private void jButton_Exit_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Exit_ActionPerformed
        
        System.exit(0);
        
    }//GEN-LAST:event_jButton_Exit_ActionPerformed

    private void jButton_X_Clear_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_X_Clear_ActionPerformed
        
        jTextField_searchTxt_.setText("");
        saveMyWord=("");
        lenString=0;
        jTextField_totalChars_.setText(Integer.toString(lenString));
        jTextField_Time_Indication_.setHorizontalAlignment(jTextField_Time_Indication_.CENTER);
        jTextField_Time_Indication_.setText("---");        
        minusWords=2;
        try {
            
            searchFilter(jTextField_searchTxt_.getText());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PolytLex_plus_FL.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PolytLex_plus_FL.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        saveMyWord=jTextField_searchTxt_.getText();
        //System.out.println(saveMyWord);
        sizeJList=defaultListModel.getSize();
        //System.out.println(sizeJList);
        jTextField_Total_.setText(String.format("%,d",sizeJList - minusWords));
        
    }//GEN-LAST:event_jButton_X_Clear_ActionPerformed

    private void jButton_Font_Increase_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Font_Increase_ActionPerformed
        
        if (setMyTextSize < 40) {
        setMyTextSize=setMyTextSize+1;
        File fileMyFont = new File("./settings/myfont.set");
         
        try {
        Scanner sMF = new Scanner(fileMyFont);
        setMyFont=(sMF.nextLine());
            
        if (flagBold==false) {
        myFont_for_List = new Font(setMyFont, Font.PLAIN, setMyTextSize);
        myJList.setFont(myFont_for_List);
        }
        
        else{
        myFont_for_List = new Font(setMyFont, Font.BOLD, setMyTextSize);
        myJList.setFont(myFont_for_List);
        }
        
        //System.out.println(setMyFont + "     "  + setMyTextSize + "\n");
        //System.out.println(myFont_for_List + "     "  + setMyTextSize + "\n");
        jTextField_Font_Size_.setText(Integer.toString(setMyTextSize));
        }
        
          catch (FileNotFoundException ex) {
           
        }
      }
        
    }//GEN-LAST:event_jButton_Font_Increase_ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
 
       jProgressBar_LoadTime_.setValue(0);
        
        File fileMyFont = new File("./settings/myfont.set");
        File fileMyLang = new File ("./settings/mylang.set");
        File fileMySelColor1 = new File("./settings/myselcolor1.set");
        File fileMyTheme = new File ("./settings/mytheme.set");
        File fileMySqrRnd = new File("./settings/sqrrnd.set");
        
        
        //System.out.println("\n");
        //System.out.println("==== PolytLex ====" + "\n");
        
        
        testcolorBG=jButton_Font_Increase_.getBackground();
        testcolorFG=jButton_Font_Increase_.getForeground();
        
        
        
        try {
            
            Scanner sMTH = new Scanner(fileMyTheme);
            myChoice=Integer.parseInt(sMTH.nextLine());
            strIndexTheme=(sMTH.nextLine());
            setIndexTheme=Integer.parseInt(strIndexTheme);
            strTheme=(sMTH.nextLine());
            theAccentColor=(sMTH.nextLine());
            //System.out.println("");
            //System.out.println("Τὸ θέμα εἶναι " + strTheme + " καὶ βρίσκεται στὴ θέση " + strIndexTheme + ".");
            //System.out.println("");
            FlatLaf.setGlobalExtraDefaults( Collections.singletonMap( "@accentColor", theAccentColor ) );
            setTheTheme();  
            
            StringBuilder str=new StringBuilder(theAccentColor);
            int pos =0;
            str.deleteCharAt(0);
            convertAccentColortoRGB=str.toString();
            
            //System.out.print(theAccentColor + " ---> ");
            //System.out.print(convertAccentColortoRGB  + " ---> ");
        
            int resultRed = Integer.valueOf(convertAccentColortoRGB.substring(0, 2), 16);
            int resultGreen = Integer.valueOf(convertAccentColortoRGB.substring(2, 4), 16);
            int resultBlue = Integer.valueOf(convertAccentColortoRGB.substring(4, 6), 16);
        
            //System.out.println("Red=" + resultRed + "," + " Green=" + resultGreen + "," + " Blue=" + resultBlue + ".");
        
            backupSelectColor = new Color (resultRed, resultGreen, resultBlue);
            BG_Color_btn=backupSelectColor;
            jButton_AccentColor_.setBackground(BG_Color_btn);  
            myJList.setSelectionBackground(BG_Color_btn);
           
            
            
            //if ((setIndexTheme >=1) && (setIndexTheme<=6)){
            //    FlatLaf.setGlobalExtraDefaults( Collections.singletonMap( "@accentColor", theAccentColor ) );
            //}
            dialog_color_selector=backupSelectColor;
            
            Scanner sMSR = new Scanner(fileMySqrRnd);
            String strFlagSqureRound=(sMSR.nextLine());
           
            flagRound=Boolean.parseBoolean(strFlagSqureRound);
           
            //System.out.println("");
            //System.out.println("Τετράγωνο ἢ στρογγυλὸ; " + flagRound);
            //System.out.println("");
            
            
            Scanner sML = new Scanner(fileMyLang);
            setMyLang=(sML.nextLine());
            setMyLangChars=(sML.nextLine());
            pathMyLang="./languages/" + setMyLang + myForm + setMyLangChars +".lang";    
            //System.out.println("Γλώσσα: " + setMyLang + " [" + setMyLangChars + "] " + "\n");
            File fileSetMyLang= new File (pathMyLang);
            
            Scanner sMF = new Scanner(fileMyFont);
            setMyFont=(sMF.nextLine());
            myFont_for_List = new Font(setMyFont, Font.PLAIN, 20);
            myFont_for_searchTxt = new Font(setMyFont, Font.PLAIN, 24);
         
            myJList.setFont(myFont_for_List);
            jTextField_searchTxt_.setFont(myFont_for_searchTxt);
            jTextField_Font_Size_.setText(Integer.toString(setMyTextSize));       
            //System.out.println("Γραμματοσειρά: " + setMyFont + "\n"  + "Μέγεθος: " + setMyTextSize);        
        
            Scanner spathML = new Scanner(fileSetMyLang);
            
            setMyLang=(spathML.nextLine());
            jLabel_searchTxt_.setText(setMyLang);
                    
            setMyLang=(spathML.nextLine());
            jTextField_searchTxt_.setToolTipText(setMyLang);
            
            setMyLang=(spathML.nextLine());
            jButton_X_Clear_.setToolTipText(setMyLang);
            
            setMyLang=(spathML.nextLine());
            jButton_Save_.setToolTipText(setMyLang);
            
            setMyLang=(spathML.nextLine());
            jButton_Settings_.setToolTipText(setMyLang);
            
            setMyLang=(spathML.nextLine());
            jButton_Reload_.setToolTipText(setMyLang);
            
            setMyLang=(spathML.nextLine());
            jTextField_Font_Size_.setToolTipText(setMyLang);
            
            setMyLang=(spathML.nextLine());
            jButton_Font_Increase_.setToolTipText(setMyLang);
          
            setMyLang=(spathML.nextLine());
            jButton_Font_Decrease_.setToolTipText(setMyLang);            
                    
            setMyLang=(spathML.nextLine());
            jButton_Bold_.setToolTipText(setMyLang);
            
            setMyLang=(spathML.nextLine());
            jLabel_SelectedLex_.setText(setMyLang);
      
            setMyLang=(spathML.nextLine());
            jRadioButton_Perseus_.setText(setMyLang);
            
            setMyLang=(spathML.nextLine());
            jRadioButton_Logeion_.setText(setMyLang);
            
            setMyLang=(spathML.nextLine());
            jRadioButton_PD_.setText(setMyLang);
            
            setMyLang=(spathML.nextLine());
            jRadioButton_KD_.setText(setMyLang);
            
            setMyLang=(spathML.nextLine());
            jRadioButton_PolyKeimena_.setText(setMyLang);
                    
            setMyLang=(spathML.nextLine());
            jRadioButton_LexikoChristi_.setText(setMyLang);
            
            setMyLang=(spathML.nextLine());
            jRadioButton_Ola_ta_Lexika_.setText(setMyLang);
            
            setMyLang=(spathML.nextLine());
            jButton_Keyboard_.setText(setMyLang);
            
            setMyLang=(spathML.nextLine());
            jButton_Kanones_.setText(setMyLang);
            
            setMyLang=(spathML.nextLine());
            jButton_Virtual_Keyboard_.setText(setMyLang);
            
            setMyLang=(spathML.nextLine());
            jButton_Editor_.setText(setMyLang);
            
            setMyLang=(spathML.nextLine());
            jButton_Info_.setText(setMyLang);
            
            setMyLang=(spathML.nextLine());
            jLabel_Total_.setText(setMyLang);
            
            setMyLang=(spathML.nextLine());
            jButton_myColorChooser_1_.setToolTipText(setMyLang);    

            setMyLang=(spathML.nextLine());
            Title_ColorPalette=setMyLang;              
     
            setMyLang=(spathML.nextLine());
            jButton_AccentColor_.setToolTipText(setMyLang);         
                    
            setMyLang=(spathML.nextLine());
            jButton_Exit_.setText(setMyLang);
            
            setMyLang=(spathML.nextLine());
            jButton_Exit_.setToolTipText(setMyLang);
            
            Scanner sMSC1 = new Scanner( fileMySelColor1);
            //System.out.println("Ἐπιλεγμένο χρῶμα");
            numSCR=(sMSC1.nextInt());
            //System.out.println(numSCR);
            numSCG=(sMSC1.nextInt());
            //System.out.println(numSCG);
            numSCB=(sMSC1.nextInt());
            //System.out.println(numSCB);
            //System.out.println("\n");
            mySelColor1 =new Color(numSCR, numSCG, numSCB);
            selectedColor=mySelColor1;
            mySelected_Color=mySelColor1;
            jButton_myColorChooser_1_.setBackground(mySelColor1);
            backupMySelColor=mySelColor1;      
          
            }
        
        catch (FileNotFoundException ex) {
            }
     
        myBtnGroup.add(jRadioButton_Perseus_);
        myBtnGroup.add(jRadioButton_Logeion_);
        myBtnGroup.add(jRadioButton_PD_);
        myBtnGroup.add(jRadioButton_KD_);
        myBtnGroup.add(jRadioButton_PolyKeimena_);
        myBtnGroup.add(jRadioButton_LexikoChristi_);
        myBtnGroup.add(jRadioButton_Ola_ta_Lexika_);
        jRadioButton_Ola_ta_Lexika_.setSelected(true);
        jTextField_SelectedLex_.setText("Ὅλα τὰ Λεξικὰ");
      
        jButton_Save_.setEnabled(false);
        
        //jButton_Alfa_Omega_.setBackground(mySelected_Color);
        jButton_Alfa_Omega_.setBackground(BG_Color_btn);
        myColorBtn=jButton_Alfa_Omega_;
        
        myLang=jRadioButton_Ola_ta_Lexika_.getText();
        jTextField_SelectedLex_.setText(myLang);
       
        sizeJList=defaultListModel.getSize();
        jTextField_Total_.setText(String.format("%,d",sizeJList - minusWords));
        
        lenString=0;
        jTextField_totalChars_.setText(Integer.toString(lenString));
        
        File fileSize= new File(path);
        double mybytes = fileSize.length();
        //System.out.println("Τὸ μέγεθος τοῦ ἀρχείου εἶναι: " + mybytes + " bytes καὶ περιέχει " + (sizeJList - minusWords) + " λέξεις!");
        
        //myBlue_Color=jButton_Font_Increase_.getBackground();
        //dialog_color_selector=myJList.getSelectionBackground();
        mySelected_Color=BG_Color_btn;
        rulesColor=jButton_Font_Increase_.getForeground();
        
    }//GEN-LAST:event_formWindowOpened

    private void jButton_Font_Decrease_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Font_Decrease_ActionPerformed
        
        if (setMyTextSize > 10) {
        setMyTextSize=setMyTextSize-1;
        File fileMyFont = new File("./settings/myfont.set");
         
        try {
        Scanner sMF = new Scanner(fileMyFont);
        setMyFont=(sMF.nextLine());
            
        if (flagBold==false) {
        myFont_for_List = new Font(setMyFont, Font.PLAIN, setMyTextSize);
        myJList.setFont(myFont_for_List);
            }
        
        else{
        myFont_for_List = new Font(setMyFont, Font.BOLD, setMyTextSize);
        myJList.setFont(myFont_for_List);
            }
        
        //System.out.println(setMyFont + "     "  + setMyTextSize + "\n");
        //System.out.println(myFont_for_List + "     "  + setMyTextSize + "\n");
        jTextField_Font_Size_.setText(Integer.toString(setMyTextSize));
            }
        
        catch (FileNotFoundException ex) {
           
            }
        }
        
    }//GEN-LAST:event_jButton_Font_Decrease_ActionPerformed

    private void jRadioButton_Perseus_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_Perseus_ActionPerformed
            
            pathFakelos=("./data/perseus/");
            pathPG="per_";
            path = (pathFakelos + pathPG + pathGramma);
            
            jButton_Save_.setEnabled(false);
            jTextField_searchTxt_.setText(saveMyWord);
            
            myLang=jRadioButton_Perseus_.getText();
            jTextField_SelectedLex_.setText(myLang);
            
            number_lex=1;
            
            //System.out.println("----------------------------------");
            //System.out.println(" ");
            
            MyThread mythread = new MyThread();
            Thread thread = new Thread(mythread);
            thread.start();
            
            try {
            thread.join(10000);
            } catch (InterruptedException ex) {
            Logger.getLogger(PolytLex_plus_FL.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            myBar = new myProgressBar();
            myBar.start();
           
            sizeJList=defaultListModel.getSize();
            jTextField_Total_.setText(String.format("%,d",sizeJList - minusWords));
            
            //System.out.println(" ");
            
            File fileSize= new File(path);
            double mybytes = fileSize.length();
            //System.out.println("Τὸ μέγεθος τοῦ ἀρχείου εἶναι: " + mybytes + " bytes καὶ περιέχει " + (sizeJList - minusWords) + " λέξεις!");
            
            //System.out.println(" ");
            //System.out.println(" ");
      
            myZeroBar = new myZeroProgressBar();
            myZeroBar.start();
            
    }//GEN-LAST:event_jRadioButton_Perseus_ActionPerformed

    private void jRadioButton_PolyKeimena_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_PolyKeimena_ActionPerformed

            pathFakelos=("./data/polytonikakeimena/");
            pathPG="pk_";
            path = (pathFakelos + pathPG + pathGramma);
            
            jButton_Save_.setEnabled(false);
            jTextField_searchTxt_.setText(saveMyWord);
            
            myLang=jRadioButton_PolyKeimena_.getText();
            jTextField_SelectedLex_.setText(myLang);
            
            number_lex=5;
            
            //System.out.println("----------------------------------");
            //System.out.println(" ");
            
            MyThread mythread = new MyThread();
            Thread thread = new Thread(mythread);
            thread.start();
            
            try {
            thread.join(10000);
            } catch (InterruptedException ex) {
            Logger.getLogger(PolytLex_plus_FL.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            myBar = new myProgressBar();
            myBar.start();
            
            sizeJList=defaultListModel.getSize();
            jTextField_Total_.setText(String.format("%,d",sizeJList - minusWords));
            
            //System.out.println(" ");
            
            File fileSize= new File(path);
            double mybytes = fileSize.length();
            
            //System.out.println("Τὸ μέγεθος τοῦ ἀρχείου εἶναι: " + mybytes + " bytes καὶ περιέχει " + (sizeJList - minusWords) + " λέξεις!");
            
            //System.out.println(" ");
            //System.out.println(" ");
    
            myZeroBar = new myZeroProgressBar();
            myZeroBar.start();
        
    }//GEN-LAST:event_jRadioButton_PolyKeimena_ActionPerformed

    private void jRadioButton_KD_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_KD_ActionPerformed

            pathFakelos=("./data/kainidiathiki/");
            pathPG="kd_";
            path = (pathFakelos + pathPG + pathGramma); 
        
            jButton_Save_.setEnabled(false);
            jTextField_searchTxt_.setText(saveMyWord);

            myLang=jRadioButton_KD_.getText();
            jTextField_SelectedLex_.setText(myLang);
            
            number_lex=4;
        
            //System.out.println("----------------------------------");
            //System.out.println(" ");
             
            MyThread mythread = new MyThread();
            Thread thread = new Thread(mythread);
            thread.start();
            
            try {
            thread.join(10000);
            } catch (InterruptedException ex) {
            Logger.getLogger(PolytLex_plus_FL.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            myBar = new myProgressBar();
            myBar.start();
        
            sizeJList=defaultListModel.getSize();
            jTextField_Total_.setText(String.format("%,d",sizeJList - minusWords));    
        
            //System.out.println(" ");
         
            File fileSize= new File(path);
            double mybytes = fileSize.length();
            //System.out.println("Τὸ μέγεθος τοῦ ἀρχείου εἶναι: " + mybytes + " bytes καὶ περιέχει " + (sizeJList - minusWords) + " λέξεις!");
        
            //System.out.println(" ");
            //System.out.println(" ");
 
            myZeroBar = new myZeroProgressBar();
            myZeroBar.start();        
        
    }//GEN-LAST:event_jRadioButton_KD_ActionPerformed

    private void jRadioButton_PD_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_PD_ActionPerformed

            pathFakelos=("./data/palaiadiathiki/");
            pathPG="pd_";
            path = (pathFakelos + pathPG + pathGramma); 
        
            jButton_Save_.setEnabled(false);
            jTextField_searchTxt_.setText(saveMyWord);
        
            myLang=jRadioButton_PD_.getText();
            jTextField_SelectedLex_.setText(myLang);
            
            number_lex=3;
        
            //System.out.println("----------------------------------");
            //System.out.println(" ");
      
            MyThread mythread = new MyThread();
            Thread thread = new Thread(mythread);
            thread.start();
            
            try {
            thread.join(10000);
            } catch (InterruptedException ex) {
            Logger.getLogger(PolytLex_plus_FL.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            myBar = new myProgressBar();
            myBar.start();
             
            sizeJList=defaultListModel.getSize();
            jTextField_Total_.setText(String.format("%,d",sizeJList - minusWords));    
        
            //System.out.println(" ");
        
            File fileSize= new File(path);
            double mybytes = fileSize.length();
            //System.out.println("Τὸ μέγεθος τοῦ ἀρχείου εἶναι: " + mybytes + " bytes καὶ περιέχει " + (sizeJList - minusWords) + " λέξεις!");
        
            //System.out.println(" ");
            //System.out.println(" ");
    
            myZeroBar = new myZeroProgressBar();
            myZeroBar.start();
        
    }//GEN-LAST:event_jRadioButton_PD_ActionPerformed

    private void jButton_Bold_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Bold_ActionPerformed
        
        
        
        if (flagBold==false) {
        myFont_for_List = new Font(setMyFont, Font.BOLD, setMyTextSize);
        myJList.setFont(myFont_for_List);
        jButton_Bold_.setBackground(BG_Color_btn);
        flagBold=true;
        }
        
        else {
        myFont_for_List = new Font(setMyFont, Font.PLAIN, setMyTextSize);
        myJList.setFont(myFont_for_List);
        jButton_Bold_.setBackground(jButton_Font_Increase_.getBackground());
        flagBold=false;   
        }
        setTheTheme_fast();
    }//GEN-LAST:event_jButton_Bold_ActionPerformed

    private void jButton_Alfa_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Alfa_ActionPerformed
        
        
        pathGramma = ("1_gramma_alfa.dat");
        path=(pathFakelos + pathPG + pathGramma); 
                
        jButton_Alfa_.setBackground(mySelected_Color);
        myColorBtn.setBackground(jButton_Font_Increase_.getBackground());
        myColorBtn=jButton_Alfa_;
        setTheTheme_fast();
        
        if (backup_Letter==("Α")) {
             jButton_Alfa_.setBackground(mySelected_Color);
        }
        
        else {
            backup_Letter=("Α");
        }
      
        if (pathFakelos == ("./data/lexikochristi/") ){
        jButton_Save_.setEnabled(true);       
        }
        else
        {
            jButton_Save_.setEnabled(false);
        }       
       
        try {
            
            searchFilter(jTextField_searchTxt_.getText());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PolytLex_plus_FL.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PolytLex_plus_FL.class.getName()).log(Level.SEVERE, null, ex);
        }
               
        jTextField_Time_Indication_.setHorizontalAlignment(jTextField_Time_Indication_.CENTER);
        jTextField_Time_Indication_.setText("---");
        sizeJList=defaultListModel.getSize();
        jTextField_Total_.setText(String.format("%,d",sizeJList - minusWords));    
        
        //System.out.println(" ");
         
        File fileSize= new File(path);
        double mybytes = fileSize.length();
        //System.out.println("Τὸ μέγεθος τοῦ ἀρχείου εἶναι: " + mybytes + " bytes καὶ περιέχει " + (sizeJList - minusWords) + " λέξεις!");
        
        //System.out.println(" ");
        //System.out.println(" ");
        //System.out.println(" ");
        //System.out.println(" ");
        
        which_Button = jButton_Alfa_; 
        
    }//GEN-LAST:event_jButton_Alfa_ActionPerformed

    private void jButton_Vita_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Vita_ActionPerformed
    
        pathGramma= ("2_gramma_vita.dat");
        path=(pathFakelos + pathPG + pathGramma); 
             
        jButton_Vita_.setBackground(mySelected_Color);
        myColorBtn.setBackground(jButton_Font_Increase_.getBackground());
        myColorBtn=jButton_Vita_;
        setTheTheme_fast();
        
        if (backup_Letter==("Β")) {
            jButton_Vita_.setBackground(mySelected_Color);
        }
        
        else {
            backup_Letter=("Β");
        }
        
        
        if (pathFakelos == ("./data/lexikochristi/") ){
        jButton_Save_.setEnabled(true);       
        }
        else
        {
            jButton_Save_.setEnabled(false);
        }
        
        try {
            
            searchFilter(jTextField_searchTxt_.getText());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PolytLex_plus_FL.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PolytLex_plus_FL.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        jTextField_Time_Indication_.setHorizontalAlignment(jTextField_Time_Indication_.CENTER);
        jTextField_Time_Indication_.setText("---");
        sizeJList=defaultListModel.getSize();
        jTextField_Total_.setText(String.format("%,d",sizeJList - minusWords));    
        
        //System.out.println(" ");
         
        File fileSize= new File(path);
        double mybytes = fileSize.length();
        //System.out.println("Τὸ μέγεθος τοῦ ἀρχείου εἶναι: " + mybytes + " bytes καὶ περιέχει " + (sizeJList - minusWords) + " λέξεις!");
        
        //System.out.println(" ");
        //System.out.println(" ");
        //System.out.println(" ");
        //System.out.println(" ");
        
        which_Button = jButton_Vita_; 
        
    }//GEN-LAST:event_jButton_Vita_ActionPerformed

    private void jButton_Gamma_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Gamma_ActionPerformed
        
        pathGramma= ("3_gramma_gamma.dat");
        path=(pathFakelos + pathPG + pathGramma); 
             
        jButton_Gamma_.setBackground(mySelected_Color);
        myColorBtn.setBackground(jButton_Font_Increase_.getBackground());
        myColorBtn=jButton_Gamma_;
        setTheTheme_fast();
        
        if (backup_Letter==("Γ")) {
            jButton_Gamma_.setBackground(mySelected_Color);
        }
        
        else {
            backup_Letter=("Γ");
        }
        
        if (pathFakelos == ("./data/lexikochristi/") ){
        jButton_Save_.setEnabled(true);       
        }
        else
        {
            jButton_Save_.setEnabled(false);
        }
        
        try {
            
            searchFilter(jTextField_searchTxt_.getText());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PolytLex_plus_FL.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PolytLex_plus_FL.class.getName()).log(Level.SEVERE, null, ex);
        }

        jTextField_Time_Indication_.setHorizontalAlignment(jTextField_Time_Indication_.CENTER);
        jTextField_Time_Indication_.setText("---");
        sizeJList=defaultListModel.getSize();
        jTextField_Total_.setText(String.format("%,d",sizeJList - minusWords));    
        
        //System.out.println(" ");
         
        File fileSize= new File(path);
        double mybytes = fileSize.length();
        //System.out.println("Τὸ μέγεθος τοῦ ἀρχείου εἶναι: " + mybytes + " bytes καὶ περιέχει " + (sizeJList - minusWords) + " λέξεις!");
        
        //System.out.println(" ");
        //System.out.println(" ");
        //System.out.println(" ");
        //System.out.println(" ");
        
        which_Button = jButton_Gamma_; 
        
    }//GEN-LAST:event_jButton_Gamma_ActionPerformed

    private void jButton_Delta_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Delta_ActionPerformed

        pathGramma= ("4_gramma_delta.dat");
        path=(pathFakelos + pathPG + pathGramma); 
             
        jButton_Delta_.setBackground(mySelected_Color);
        myColorBtn.setBackground(jButton_Font_Increase_.getBackground());
        myColorBtn=jButton_Delta_;
        setTheTheme_fast();

        if (backup_Letter==("Δ")) {
            jButton_Delta_.setBackground(mySelected_Color);
        }
        
        else {
            backup_Letter=("Δ");
        }

        
        if (pathFakelos == ("./data/lexikochristi/") ){
        jButton_Save_.setEnabled(true);       
        }
        else
        {
            jButton_Save_.setEnabled(false);
        }
        
        try {
            
            searchFilter(jTextField_searchTxt_.getText());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PolytLex_plus_FL.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PolytLex_plus_FL.class.getName()).log(Level.SEVERE, null, ex);
        }

        jTextField_Time_Indication_.setHorizontalAlignment(jTextField_Time_Indication_.CENTER);
        jTextField_Time_Indication_.setText("---");
        sizeJList=defaultListModel.getSize();
        jTextField_Total_.setText(String.format("%,d",sizeJList - minusWords));    
        
        //System.out.println(" ");
         
        File fileSize= new File(path);
        double mybytes = fileSize.length();
        //System.out.println("Τὸ μέγεθος τοῦ ἀρχείου εἶναι: " + mybytes + " bytes καὶ περιέχει " + (sizeJList - minusWords) + " λέξεις!");
        
        //System.out.println(" ");
        //System.out.println(" ");
        //System.out.println(" ");
        //System.out.println(" ");
        
        which_Button = jButton_Delta_; 
        
    }//GEN-LAST:event_jButton_Delta_ActionPerformed

    private void jButton_Epsilon_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Epsilon_ActionPerformed
        
        pathGramma = ("5_gramma_epsilon.dat");
        path=(pathFakelos + pathPG + pathGramma); 
                
        jButton_Epsilon_.setBackground(mySelected_Color);
        myColorBtn.setBackground(jButton_Font_Increase_.getBackground());
        myColorBtn=jButton_Epsilon_;
        setTheTheme_fast();

        if (backup_Letter==("Ε")) {
             jButton_Epsilon_.setBackground(mySelected_Color);
        }
        
        else {
            backup_Letter=("Ε");
        }
        
        if (pathFakelos == ("./data/lexikochristi/") ){
        jButton_Save_.setEnabled(true);       
        }
        else
        {
            jButton_Save_.setEnabled(false);
        }
        
        //jTextField_searchTxt_.setText("");
      
        try {
            
            searchFilter(jTextField_searchTxt_.getText());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PolytLex_plus_FL.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PolytLex_plus_FL.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        jTextField_Time_Indication_.setHorizontalAlignment(jTextField_Time_Indication_.CENTER);
        jTextField_Time_Indication_.setText("---");
        sizeJList=defaultListModel.getSize();
        jTextField_Total_.setText(String.format("%,d",sizeJList - minusWords));    
        
        //System.out.println(" ");
         
        File fileSize= new File(path);
        double mybytes = fileSize.length();
        //System.out.println("Τὸ μέγεθος τοῦ ἀρχείου εἶναι: " + mybytes + " bytes καὶ περιέχει " + (sizeJList - minusWords) + " λέξεις!");
        
        //System.out.println(" ");
        //System.out.println(" ");
        //System.out.println(" ");
        //System.out.println(" ");
        
        which_Button = jButton_Epsilon_; 
        
    }//GEN-LAST:event_jButton_Epsilon_ActionPerformed

    private void jButton_Zita_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Zita_ActionPerformed
        
        pathGramma= ("6_gramma_zita.dat");
        path=(pathFakelos + pathPG + pathGramma); 
             
        jButton_Zita_.setBackground(mySelected_Color);
        myColorBtn.setBackground(jButton_Font_Increase_.getBackground());
        myColorBtn=jButton_Zita_;
        setTheTheme_fast();
        
        if (backup_Letter==("Ζ")) {
             jButton_Zita_.setBackground(mySelected_Color);
        }
        
        else {
            backup_Letter=("Ζ");
        }
        
        if (pathFakelos == ("./data/lexikochristi/") ){
        jButton_Save_.setEnabled(true);       
        }
        else
        {
            jButton_Save_.setEnabled(false);
        }

        try {
            
            searchFilter(jTextField_searchTxt_.getText());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PolytLex_plus_FL.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PolytLex_plus_FL.class.getName()).log(Level.SEVERE, null, ex);
        }

        jTextField_Time_Indication_.setHorizontalAlignment(jTextField_Time_Indication_.CENTER);
        jTextField_Time_Indication_.setText("---");
        sizeJList=defaultListModel.getSize();
        jTextField_Total_.setText(String.format("%,d",sizeJList - minusWords));    
        
        //System.out.println(" ");
         
        File fileSize= new File(path);
        double mybytes = fileSize.length();
        //System.out.println("Τὸ μέγεθος τοῦ ἀρχείου εἶναι: " + mybytes + " bytes καὶ περιέχει " + (sizeJList - minusWords) + " λέξεις!");
        
        //System.out.println(" ");
        //System.out.println(" ");
        //System.out.println(" ");
        //System.out.println(" ");
        
        which_Button = jButton_Zita_; 
        
    }//GEN-LAST:event_jButton_Zita_ActionPerformed

    private void jButton_Ita_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Ita_ActionPerformed
        
        pathGramma= ("7_gramma_ita.dat");
        path=(pathFakelos + pathPG + pathGramma); 
             
        jButton_Ita_.setBackground(mySelected_Color);
        myColorBtn.setBackground(jButton_Font_Increase_.getBackground());
        myColorBtn=jButton_Ita_;
        setTheTheme_fast();

        if (backup_Letter==("Η")) {
             jButton_Ita_.setBackground(mySelected_Color);
        }
        
        else {
            backup_Letter=("Η");
        }
        
        if (pathFakelos == ("./data/lexikochristi/") ){
        jButton_Save_.setEnabled(true);       
        }
        else
        {
            jButton_Save_.setEnabled(false);
        }  
        
        try {
            searchFilter(jTextField_searchTxt_.getText());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PolytLex_plus_FL.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PolytLex_plus_FL.class.getName()).log(Level.SEVERE, null, ex);
        }

        jTextField_Time_Indication_.setHorizontalAlignment(jTextField_Time_Indication_.CENTER);
        jTextField_Time_Indication_.setText("---");
        sizeJList=defaultListModel.getSize();
        jTextField_Total_.setText(String.format("%,d",sizeJList - minusWords));    
        
        //System.out.println(" ");
         
        File fileSize= new File(path);
        double mybytes = fileSize.length();
        //System.out.println("Τὸ μέγεθος τοῦ ἀρχείου εἶναι: " + mybytes + " bytes καὶ περιέχει " + (sizeJList - minusWords) + " λέξεις!");
        
        //System.out.println(" ");
        //System.out.println(" ");
        //System.out.println(" ");
        //System.out.println(" ");
        
        which_Button = jButton_Ita_; 
        
    }//GEN-LAST:event_jButton_Ita_ActionPerformed

    private void jButton_Thita_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Thita_ActionPerformed

        pathGramma= ("8_gramma_thita.dat");
        path=(pathFakelos + pathPG + pathGramma); 
             
        jButton_Thita_.setBackground(mySelected_Color);
        myColorBtn.setBackground(jButton_Font_Increase_.getBackground());
        myColorBtn=jButton_Thita_;
        setTheTheme_fast();

        if (backup_Letter==("Θ")) {
             jButton_Thita_.setBackground(mySelected_Color);
        }
        
        else {
            backup_Letter=("Θ");
        }
        
        if (pathFakelos == ("./data/lexikochristi/") ){
        jButton_Save_.setEnabled(true);       
        }
        else
        {
            jButton_Save_.setEnabled(false);
        }
        
        try {
            searchFilter(jTextField_searchTxt_.getText());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PolytLex_plus_FL.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PolytLex_plus_FL.class.getName()).log(Level.SEVERE, null, ex);
        }

        jTextField_Time_Indication_.setHorizontalAlignment(jTextField_Time_Indication_.CENTER);
        jTextField_Time_Indication_.setText("---");
        sizeJList=defaultListModel.getSize();
        jTextField_Total_.setText(String.format("%,d",sizeJList - minusWords));    
        
        //System.out.println(" ");
         
        File fileSize= new File(path);
        double mybytes = fileSize.length();
        //System.out.println("Τὸ μέγεθος τοῦ ἀρχείου εἶναι: " + mybytes + " bytes καὶ περιέχει " + (sizeJList - minusWords) + " λέξεις!");
        
        //System.out.println(" ");
        //System.out.println(" ");
        //System.out.println(" ");
        //System.out.println(" ");
        
        which_Button = jButton_Thita_; 
        PolytLex_plus_FL.setDefaultLookAndFeelDecorated(true);
        JFrame.setDefaultLookAndFeelDecorated(true);
        
    }//GEN-LAST:event_jButton_Thita_ActionPerformed

    private void jButton_Iota_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Iota_ActionPerformed

        pathGramma= ("9_gramma_iota.dat");
        path=(pathFakelos + pathPG + pathGramma); 
             
        jButton_Iota_.setBackground(mySelected_Color);
        myColorBtn.setBackground(jButton_Font_Increase_.getBackground());
        myColorBtn=jButton_Iota_;
        setTheTheme_fast();
        
        if (backup_Letter==("Ι")) {
             jButton_Iota_.setBackground(mySelected_Color);
        }
        
        else {
            backup_Letter=("Ι");
        }
        
        if (pathFakelos == ("./data/lexikochristi/") ){
        jButton_Save_.setEnabled(true);       
        }
        else
        {
            jButton_Save_.setEnabled(false);
        }
         
        //jTextField_searchTxt_.setText("");
        
        try {
            searchFilter(jTextField_searchTxt_.getText());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PolytLex_plus_FL.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PolytLex_plus_FL.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        jTextField_Time_Indication_.setHorizontalAlignment(jTextField_Time_Indication_.CENTER);
        jTextField_Time_Indication_.setText("---");
        sizeJList=defaultListModel.getSize();
        jTextField_Total_.setText(String.format("%,d",sizeJList - minusWords));    
        
        //System.out.println(" ");
         
        File fileSize= new File(path);
        double mybytes = fileSize.length();
        //System.out.println("Τὸ μέγεθος τοῦ ἀρχείου εἶναι: " + mybytes + " bytes καὶ περιέχει " + (sizeJList - minusWords) + " λέξεις!");
        
        //System.out.println(" ");
        //System.out.println(" ");
        //System.out.println(" ");
        //System.out.println(" ");
        
        which_Button = jButton_Iota_; 
        
    }//GEN-LAST:event_jButton_Iota_ActionPerformed

    private void jButton_Kappa_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Kappa_ActionPerformed

        pathGramma= ("10_gramma_kappa.dat");
        path=(pathFakelos + pathPG + pathGramma); 
             
        jButton_Kappa_.setBackground(mySelected_Color);
        myColorBtn.setBackground(jButton_Font_Increase_.getBackground());
        myColorBtn=jButton_Kappa_;
        setTheTheme_fast();
        
        if (backup_Letter==("Κ")) {
             jButton_Kappa_.setBackground(mySelected_Color);
        }
        
        else {
            backup_Letter=("Κ");
        }
        
        if (pathFakelos == ("./data/lexikochristi/") ){
        jButton_Save_.setEnabled(true);       
        }
        else
        {
            jButton_Save_.setEnabled(false);
        }
        
        try {
            searchFilter(jTextField_searchTxt_.getText());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PolytLex_plus_FL.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PolytLex_plus_FL.class.getName()).log(Level.SEVERE, null, ex);
        }

        jTextField_Time_Indication_.setHorizontalAlignment(jTextField_Time_Indication_.CENTER);
        jTextField_Time_Indication_.setText("---");
        sizeJList=defaultListModel.getSize();
        jTextField_Total_.setText(String.format("%,d",sizeJList - minusWords));    
        
        //System.out.println(" ");
         
        File fileSize= new File(path);
        double mybytes = fileSize.length();
        //System.out.println("Τὸ μέγεθος τοῦ ἀρχείου εἶναι: " + mybytes + " bytes καὶ περιέχει " + (sizeJList - minusWords) + " λέξεις!");
        
        //System.out.println(" ");
        //System.out.println(" ");
        //System.out.println(" ");
        //System.out.println(" ");
        
        which_Button = jButton_Kappa_; 
        
    }//GEN-LAST:event_jButton_Kappa_ActionPerformed

    private void jButton_Lamda_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Lamda_ActionPerformed
        
        pathGramma= ("11_gramma_lamda.dat");
        path=(pathFakelos + pathPG + pathGramma); 
             
        jButton_Lamda_.setBackground(mySelected_Color);
        myColorBtn.setBackground(jButton_Font_Increase_.getBackground());
        myColorBtn=jButton_Lamda_;
        setTheTheme_fast();
        
        if (backup_Letter==("Λ")) {
             jButton_Lamda_.setBackground(mySelected_Color);
        }
        
        else {
            backup_Letter=("Λ");
        }
        
        if (pathFakelos == ("./data/lexikochristi/") ){
        jButton_Save_.setEnabled(true);       
        }
        else
        {
            jButton_Save_.setEnabled(false);
        }
        
        try {
            searchFilter(jTextField_searchTxt_.getText());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PolytLex_plus_FL.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PolytLex_plus_FL.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        jTextField_Time_Indication_.setHorizontalAlignment(jTextField_Time_Indication_.CENTER);
        jTextField_Time_Indication_.setText("---");
        sizeJList=defaultListModel.getSize();
        jTextField_Total_.setText(String.format("%,d",sizeJList - minusWords));    
        
        //System.out.println(" ");
         
        File fileSize= new File(path);
        double mybytes = fileSize.length();
        //System.out.println("Τὸ μέγεθος τοῦ ἀρχείου εἶναι: " + mybytes + " bytes καὶ περιέχει " + (sizeJList - minusWords) + " λέξεις!");
        
        //System.out.println(" ");
        //System.out.println(" ");
        //System.out.println(" ");
        //System.out.println(" ");
        
        which_Button = jButton_Lamda_; 
        
    }//GEN-LAST:event_jButton_Lamda_ActionPerformed

    private void jButton_Mi_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Mi_ActionPerformed

        pathGramma= ("12_gramma_mi.dat");
        path=(pathFakelos + pathPG + pathGramma); 
             
        jButton_Mi_.setBackground(mySelected_Color);
        myColorBtn.setBackground(jButton_Font_Increase_.getBackground());
        myColorBtn=jButton_Mi_;
        setTheTheme_fast();

        if (backup_Letter==("Μ")) {
             jButton_Mi_.setBackground(mySelected_Color);
        }
        
        else {
            backup_Letter=("Μ");
        }
        
        if (pathFakelos == ("./data/lexikochristi/") ){
        jButton_Save_.setEnabled(true);       
        }
        else
        {
            jButton_Save_.setEnabled(false);
        }
        
        try {
            searchFilter(jTextField_searchTxt_.getText());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PolytLex_plus_FL.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PolytLex_plus_FL.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        jTextField_Time_Indication_.setHorizontalAlignment(jTextField_Time_Indication_.CENTER);
        jTextField_Time_Indication_.setText("---");
        sizeJList=defaultListModel.getSize();
        jTextField_Total_.setText(String.format("%,d",sizeJList - minusWords));    
        
        //System.out.println(" ");
         
        File fileSize= new File(path);
        double mybytes = fileSize.length();
        //System.out.println("Τὸ μέγεθος τοῦ ἀρχείου εἶναι: " + mybytes + " bytes καὶ περιέχει " + (sizeJList - minusWords) + " λέξεις!");
        
        //System.out.println(" ");
        //System.out.println(" ");
        //System.out.println(" ");
        //System.out.println(" ");
        
        which_Button = jButton_Mi_; 
        
    }//GEN-LAST:event_jButton_Mi_ActionPerformed

    private void jButton_Ni_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Ni_ActionPerformed
        
        pathGramma= ("13_gramma_ni.dat");
        path=(pathFakelos + pathPG + pathGramma); 
             
        jButton_Ni_.setBackground(mySelected_Color);
        myColorBtn.setBackground(jButton_Font_Increase_.getBackground());
        myColorBtn=jButton_Ni_;
        setTheTheme_fast();

        if (backup_Letter==("Ν")) {
             jButton_Ni_.setBackground(mySelected_Color);
        }
        
        else {
            backup_Letter=("Ν");
        }
        
        if (pathFakelos == ("./data/lexikochristi/") ){
        jButton_Save_.setEnabled(true);       
        }
        else
        {
            jButton_Save_.setEnabled(false);
        }
        
        try {
            searchFilter(jTextField_searchTxt_.getText());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PolytLex_plus_FL.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PolytLex_plus_FL.class.getName()).log(Level.SEVERE, null, ex);
        }

        jTextField_Time_Indication_.setHorizontalAlignment(jTextField_Time_Indication_.CENTER);
        jTextField_Time_Indication_.setText("---");
        sizeJList=defaultListModel.getSize();
        jTextField_Total_.setText(String.format("%,d",sizeJList - minusWords));    
        
        //System.out.println(" ");
         
        File fileSize= new File(path);
        double mybytes = fileSize.length();
        //System.out.println("Τὸ μέγεθος τοῦ ἀρχείου εἶναι: " + mybytes + " bytes καὶ περιέχει " + (sizeJList - minusWords) + " λέξεις!");
        
        //System.out.println(" ");
        //System.out.println(" ");
        //System.out.println(" ");
        //System.out.println(" ");
        
        which_Button = jButton_Ni_; 
        
    }//GEN-LAST:event_jButton_Ni_ActionPerformed

    private void jButton_Ksi_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Ksi_ActionPerformed

        pathGramma= ("14_gramma_ksi.dat");
        path=(pathFakelos + pathPG + pathGramma); 
        
        jButton_Ksi_.setBackground(mySelected_Color);
        myColorBtn.setBackground(jButton_Font_Increase_.getBackground());
        myColorBtn=jButton_Ksi_;          
        setTheTheme_fast();
        
        if (backup_Letter==("Ξ")) {
        jButton_Ksi_.setBackground(mySelected_Color);
        }
        
        else {
            backup_Letter=("Ξ");
        }

        if (pathFakelos == ("./data/lexikochristi/") ){
        jButton_Save_.setEnabled(true);       
        }
        else
        {
            jButton_Save_.setEnabled(false);
        }
        
        try {
            searchFilter(jTextField_searchTxt_.getText());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PolytLex_plus_FL.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PolytLex_plus_FL.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        jTextField_Time_Indication_.setHorizontalAlignment(jTextField_Time_Indication_.CENTER);
        jTextField_Time_Indication_.setText("---");
        sizeJList=defaultListModel.getSize();
        jTextField_Total_.setText(String.format("%,d",sizeJList - minusWords));    
        
        //System.out.println(" ");
         
        File fileSize= new File(path);
        double mybytes = fileSize.length();
        //System.out.println("Τὸ μέγεθος τοῦ ἀρχείου εἶναι: " + mybytes + " bytes καὶ περιέχει " + (sizeJList - minusWords) + " λέξεις!");
        
        //System.out.println(" ");
        //System.out.println(" ");
        //System.out.println(" ");
        //System.out.println(" ");
        
        which_Button = jButton_Ksi_;         
        
    }//GEN-LAST:event_jButton_Ksi_ActionPerformed

    private void jButton_Omikron_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Omikron_ActionPerformed

        pathGramma= ("15_gramma_omikron.dat");
        path=(pathFakelos + pathPG + pathGramma); 
             
        jButton_Omikron_.setBackground(mySelected_Color);
        myColorBtn.setBackground(jButton_Font_Increase_.getBackground());
        myColorBtn=jButton_Omikron_;
        setTheTheme_fast();
        
        if (backup_Letter==("Ο")) {
             jButton_Omikron_.setBackground(mySelected_Color);
        }
        
        else {
            backup_Letter=("Ο");
        }
        
        if (pathFakelos == ("./data/lexikochristi/") ){
        jButton_Save_.setEnabled(true);       
        }
        else
        {
            jButton_Save_.setEnabled(false);
        }
        
        try {
            searchFilter(jTextField_searchTxt_.getText());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PolytLex_plus_FL.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PolytLex_plus_FL.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        jTextField_Time_Indication_.setHorizontalAlignment(jTextField_Time_Indication_.CENTER);
        jTextField_Time_Indication_.setText("---");
        sizeJList=defaultListModel.getSize();
        jTextField_Total_.setText(String.format("%,d",sizeJList - minusWords));    
        
        //System.out.println(" ");
         
        File fileSize= new File(path);
        double mybytes = fileSize.length();
        //System.out.println("Τὸ μέγεθος τοῦ ἀρχείου εἶναι: " + mybytes + " bytes καὶ περιέχει " + (sizeJList - minusWords) + " λέξεις!");
        
        //System.out.println(" ");
        //System.out.println(" ");
        //System.out.println(" ");
        //System.out.println(" ");
        
        which_Button = jButton_Omikron_;         
        
    }//GEN-LAST:event_jButton_Omikron_ActionPerformed

    private void jButton_Pi_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Pi_ActionPerformed
        
        pathGramma= ("16_gramma_pi.dat");
        path=(pathFakelos + pathPG + pathGramma); 
             
        jButton_Pi_.setBackground(mySelected_Color);
        myColorBtn.setBackground(jButton_Font_Increase_.getBackground());
        myColorBtn=jButton_Pi_;
        setTheTheme_fast();
        
        if (backup_Letter==("Π")) {
             jButton_Pi_.setBackground(mySelected_Color);
        }
        
        else {
            backup_Letter=("Π");
        }
                
        if (pathFakelos == ("./data/lexikochristi/") ){
        jButton_Save_.setEnabled(true);       
        }
        else
        {
            jButton_Save_.setEnabled(false);
        }
        
        try {
            searchFilter(jTextField_searchTxt_.getText());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PolytLex_plus_FL.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PolytLex_plus_FL.class.getName()).log(Level.SEVERE, null, ex);
        }
        jTextField_Time_Indication_.setHorizontalAlignment(jTextField_Time_Indication_.CENTER);
        jTextField_Time_Indication_.setText("---");
        sizeJList=defaultListModel.getSize();
        jTextField_Total_.setText(String.format("%,d",sizeJList - minusWords));    
        
        //System.out.println(" ");
         
        File fileSize= new File(path);
        double mybytes = fileSize.length();
        //System.out.println("Τὸ μέγεθος τοῦ ἀρχείου εἶναι: " + mybytes + " bytes καὶ περιέχει " + (sizeJList - minusWords) + " λέξεις!");
        
        //System.out.println(" ");
        //System.out.println(" ");
        //System.out.println(" ");
        //System.out.println(" ");
        
        which_Button = jButton_Pi_; 
        
    }//GEN-LAST:event_jButton_Pi_ActionPerformed

    private void jButton_Ro_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Ro_ActionPerformed

        pathGramma= ("17_gramma_ro.dat");
        path=(pathFakelos + pathPG + pathGramma); 
             
        jButton_Ro_.setBackground(mySelected_Color);
        myColorBtn.setBackground(jButton_Font_Increase_.getBackground());
        myColorBtn=jButton_Ro_;
        setTheTheme_fast();
        
        if (backup_Letter==("Ρ")) {
             jButton_Ro_.setBackground(mySelected_Color);
        }
        
        else {
            backup_Letter=("Ρ");
        }
        
        if (pathFakelos == ("./data/lexikochristi/") ){
        jButton_Save_.setEnabled(true);       
        }
        else
        {
            jButton_Save_.setEnabled(false);
        }
        
        try {
            searchFilter(jTextField_searchTxt_.getText());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PolytLex_plus_FL.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PolytLex_plus_FL.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        jTextField_Time_Indication_.setHorizontalAlignment(jTextField_Time_Indication_.CENTER);
        jTextField_Time_Indication_.setText("---");
        sizeJList=defaultListModel.getSize();
        jTextField_Total_.setText(String.format("%,d",sizeJList - minusWords));    
        
        //System.out.println(" ");
         
        File fileSize= new File(path);
        double mybytes = fileSize.length();
        //System.out.println("Τὸ μέγεθος τοῦ ἀρχείου εἶναι: " + mybytes + " bytes καὶ περιέχει " + (sizeJList - minusWords) + " λέξεις!");
        
        //System.out.println(" ");
        //System.out.println(" ");
        //System.out.println(" ");
        //System.out.println(" ");
        
        which_Button = jButton_Ro_;         
        
    }//GEN-LAST:event_jButton_Ro_ActionPerformed

    private void jButton_Sigma_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Sigma_ActionPerformed

        pathGramma= ("18_gramma_sigma.dat");
        path=(pathFakelos + pathPG + pathGramma); 
             
        jButton_Sigma_.setBackground(mySelected_Color);
        myColorBtn.setBackground(jButton_Font_Increase_.getBackground());
        myColorBtn=jButton_Sigma_;
        setTheTheme_fast();
        
        if (backup_Letter==("Σ")) {
             jButton_Sigma_.setBackground(mySelected_Color);
        }
        
        else {
            backup_Letter=("Σ");
        }        
        
        if (pathFakelos == ("./data/lexikochristi/") ){
        jButton_Save_.setEnabled(true);       
        }
        else
        {
            jButton_Save_.setEnabled(false);
        }

        try {
            searchFilter(jTextField_searchTxt_.getText());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PolytLex_plus_FL.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PolytLex_plus_FL.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        jTextField_Time_Indication_.setHorizontalAlignment(jTextField_Time_Indication_.CENTER);
        jTextField_Time_Indication_.setText("---");
        sizeJList=defaultListModel.getSize();
        jTextField_Total_.setText(String.format("%,d",sizeJList - minusWords));    
        
        //System.out.println(" ");
         
        File fileSize= new File(path);
        double mybytes = fileSize.length();
        //System.out.println("Τὸ μέγεθος τοῦ ἀρχείου εἶναι: " + mybytes + " bytes καὶ περιέχει " + (sizeJList - minusWords) + " λέξεις!");
        
        //System.out.println(" ");
        //System.out.println(" ");
        //System.out.println(" ");
        //System.out.println(" ");

        which_Button = jButton_Sigma_; 
        
    }//GEN-LAST:event_jButton_Sigma_ActionPerformed

    private void jButton_Taf_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Taf_ActionPerformed

        pathGramma= ("19_gramma_taf.dat");
        path=(pathFakelos + pathPG + pathGramma); 
             
        jButton_Taf_.setBackground(mySelected_Color);
        myColorBtn.setBackground(jButton_Font_Increase_.getBackground());
        myColorBtn=jButton_Taf_;
        setTheTheme_fast();
        
        if (backup_Letter==("Τ")) {
             jButton_Taf_.setBackground(mySelected_Color);
        }
        
        else {
            backup_Letter=("Τ");
        }
        
        
        if (pathFakelos == ("./data/lexikochristi/") ){
        jButton_Save_.setEnabled(true);       
        }
        else
        {
            jButton_Save_.setEnabled(false);
        }

        try {
            searchFilter(jTextField_searchTxt_.getText());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PolytLex_plus_FL.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PolytLex_plus_FL.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        jTextField_Time_Indication_.setHorizontalAlignment(jTextField_Time_Indication_.CENTER);
        jTextField_Time_Indication_.setText("---");
        sizeJList=defaultListModel.getSize();
        jTextField_Total_.setText(String.format("%,d",sizeJList - minusWords));    
        
        //System.out.println(" ");
         
        File fileSize= new File(path);
        double mybytes = fileSize.length();
        //System.out.println("Τὸ μέγεθος τοῦ ἀρχείου εἶναι: " + mybytes + " bytes καὶ περιέχει " + (sizeJList - minusWords) + " λέξεις!");
        
        //System.out.println(" ");
        //System.out.println(" ");
        //System.out.println(" ");
        //System.out.println(" ");

        which_Button = jButton_Taf_; 
        
    }//GEN-LAST:event_jButton_Taf_ActionPerformed

    private void jButton_Ypsilon_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Ypsilon_ActionPerformed

        pathGramma= ("20_gramma_ypsilon.dat");
        path=(pathFakelos + pathPG + pathGramma); 
             
        jButton_Ypsilon_.setBackground(mySelected_Color);
        myColorBtn.setBackground(jButton_Font_Increase_.getBackground());
        myColorBtn=jButton_Ypsilon_;
        setTheTheme_fast();
        
        if (backup_Letter==("Υ")) {
             jButton_Ypsilon_.setBackground(mySelected_Color);
        }
        
        else {
            backup_Letter=("Υ");
        }
        
        if (pathFakelos == ("./data/lexikochristi/") ){
        jButton_Save_.setEnabled(true);       
        }
        else
        {
            jButton_Save_.setEnabled(false);
        }
        
        try {
            searchFilter(jTextField_searchTxt_.getText());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PolytLex_plus_FL.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PolytLex_plus_FL.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        jTextField_Time_Indication_.setHorizontalAlignment(jTextField_Time_Indication_.CENTER);
        jTextField_Time_Indication_.setText("---");
        sizeJList=defaultListModel.getSize();
        jTextField_Total_.setText(String.format("%,d",sizeJList - minusWords));    
        
        //System.out.println(" ");
         
        File fileSize= new File(path);
        double mybytes = fileSize.length();
        //System.out.println("Τὸ μέγεθος τοῦ ἀρχείου εἶναι: " + mybytes + " bytes καὶ περιέχει " + (sizeJList - minusWords) + " λέξεις!");
        
        //System.out.println(" ");
        //System.out.println(" ");
        //System.out.println(" ");
        //System.out.println(" ");

        which_Button = jButton_Ypsilon_; 
        
    }//GEN-LAST:event_jButton_Ypsilon_ActionPerformed

    private void jButton_Phi_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Phi_ActionPerformed

        pathGramma= ("21_gramma_phi.dat");
        path=(pathFakelos + pathPG + pathGramma); 
            
        jButton_Phi_.setBackground(mySelected_Color);
        myColorBtn.setBackground(jButton_Font_Increase_.getBackground());
        myColorBtn=jButton_Phi_;
        setTheTheme_fast();
        
        if (backup_Letter==("Φ")) {
        jButton_Phi_.setBackground(mySelected_Color);
        }
        
        else {
            backup_Letter=("Φ");
        }
        
        if (pathFakelos == ("./data/lexikochristi/") ){
        jButton_Save_.setEnabled(true);       
        }
        else
        {
            jButton_Save_.setEnabled(false);
        }
        
        try {
            
            searchFilter(jTextField_searchTxt_.getText());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PolytLex_plus_FL.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PolytLex_plus_FL.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        jTextField_Time_Indication_.setHorizontalAlignment(jTextField_Time_Indication_.CENTER);
        jTextField_Time_Indication_.setText("---");
        sizeJList=defaultListModel.getSize();
        jTextField_Total_.setText(String.format("%,d",sizeJList - minusWords));    
        
        //System.out.println(" ");
         
        File fileSize= new File(path);
        double mybytes = fileSize.length();
        //System.out.println("Τὸ μέγεθος τοῦ ἀρχείου εἶναι: " + mybytes + " bytes καὶ περιέχει " + (sizeJList - minusWords) + " λέξεις!");
        
        //System.out.println(" ");
        //System.out.println(" ");
        //System.out.println(" ");
        //System.out.println(" ");
        
        which_Button = jButton_Phi_; 
        
    }//GEN-LAST:event_jButton_Phi_ActionPerformed

    private void jButton_Chi_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Chi_ActionPerformed
 
        pathGramma= ("22_gramma_chi.dat");
        path=(pathFakelos + pathPG + pathGramma); 
         
        jButton_Chi_.setBackground(mySelected_Color);
        myColorBtn.setBackground(jButton_Font_Increase_.getBackground());
        myColorBtn=jButton_Chi_;
        setTheTheme_fast();
        
        if (backup_Letter==("Χ")) {
             jButton_Chi_.setBackground(mySelected_Color);
        }
        
        else {
            backup_Letter=("Χ");
        }
        
        if (pathFakelos == ("./data/lexikochristi/") ){
        jButton_Save_.setEnabled(true);       
        }
        else
        {
            jButton_Save_.setEnabled(false);
        }
        
        try {
            
            searchFilter(jTextField_searchTxt_.getText());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PolytLex_plus_FL.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PolytLex_plus_FL.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        jTextField_Time_Indication_.setHorizontalAlignment(jTextField_Time_Indication_.CENTER);
        jTextField_Time_Indication_.setText("---");
        sizeJList=defaultListModel.getSize();
        jTextField_Total_.setText(String.format("%,d",sizeJList - minusWords));    
        
        //System.out.println(" ");
         
        File fileSize= new File(path);
        double mybytes = fileSize.length();
        //System.out.println("Τὸ μέγεθος τοῦ ἀρχείου εἶναι: " + mybytes + " bytes καὶ περιέχει " + (sizeJList - minusWords) + " λέξεις!");
        
        //System.out.println(" ");
        //System.out.println(" ");
        //System.out.println(" ");
        //System.out.println(" ");

        which_Button = jButton_Chi_; 
        
    }//GEN-LAST:event_jButton_Chi_ActionPerformed

    private void jButton_Psi_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Psi_ActionPerformed

        pathGramma= ("23_gramma_psi.dat");
        path=(pathFakelos + pathPG + pathGramma); 
             
        jButton_Psi_.setBackground(mySelected_Color);
        myColorBtn.setBackground(jButton_Font_Increase_.getBackground());
        myColorBtn=jButton_Psi_;
        setTheTheme_fast();
        
        if (backup_Letter==("Ψ")) {
             jButton_Psi_.setBackground(mySelected_Color);
        }
        
        else {
            backup_Letter=("Ψ");
        }
        
        if (pathFakelos == ("./data/lexikochristi/") ){
        jButton_Save_.setEnabled(true);       
        }
        else
        {
            jButton_Save_.setEnabled(false);
        }
        
        try {
        
            searchFilter(jTextField_searchTxt_.getText());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PolytLex_plus_FL.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PolytLex_plus_FL.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        jTextField_Time_Indication_.setHorizontalAlignment(jTextField_Time_Indication_.CENTER);
        jTextField_Time_Indication_.setText("---");
        sizeJList=defaultListModel.getSize();
        jTextField_Total_.setText(String.format("%,d",sizeJList - minusWords));    
        
        //System.out.println(" ");
         
        File fileSize= new File(path);
        double mybytes = fileSize.length();
        //System.out.println("Τὸ μέγεθος τοῦ ἀρχείου εἶναι: " + mybytes + " bytes καὶ περιέχει " + (sizeJList - minusWords) + " λέξεις!");
        
        //System.out.println(" ");
        //System.out.println(" ");
        //System.out.println(" ");
        //System.out.println(" ");

        which_Button = jButton_Psi_;                 
        
    }//GEN-LAST:event_jButton_Psi_ActionPerformed

    private void jButton_Omega_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Omega_ActionPerformed

        pathGramma = ("24_gramma_omega.dat");
        path=(pathFakelos + pathPG + pathGramma); 
        
        jButton_Omega_.setBackground(mySelected_Color);
        myColorBtn.setBackground(jButton_Font_Increase_.getBackground());
        myColorBtn=jButton_Omega_;
        setTheTheme_fast();
        
        if (backup_Letter==("Ω")) {
             jButton_Omega_.setBackground(mySelected_Color);
        }
        
        else {
            backup_Letter="Ω";
        }
        
        if (pathFakelos == ("./data/lexikochristi/") ){
        jButton_Save_.setEnabled(true);       
        }
        else
        {
            jButton_Save_.setEnabled(false);
        }
        
        try {
            
            searchFilter(jTextField_searchTxt_.getText());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PolytLex_plus_FL.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PolytLex_plus_FL.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        jTextField_Time_Indication_.setHorizontalAlignment(jTextField_Time_Indication_.CENTER);
        jTextField_Time_Indication_.setText("---");
        sizeJList=defaultListModel.getSize();
        jTextField_Total_.setText(String.format("%,d",sizeJList - minusWords));    
        
        //System.out.println(" ");
         
        File fileSize= new File(path);
        double mybytes = fileSize.length();
        //System.out.println("Τὸ μέγεθος τοῦ ἀρχείου εἶναι: " + mybytes + " bytes καὶ περιέχει " + (sizeJList - minusWords) + " λέξεις!");
        
        //System.out.println(" ");
        //System.out.println(" ");
        //System.out.println(" ");
        //System.out.println(" ");

        which_Button = jButton_Omega_; 
        
    }//GEN-LAST:event_jButton_Omega_ActionPerformed

    private void jButton_Alfa_Omega_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Alfa_Omega_ActionPerformed
        
        jButton_Save_.setEnabled(false);
        
        pathGramma = ("ola_ta_grammata.dat");
        path=(pathFakelos + pathPG + pathGramma); 

        jButton_Alfa_Omega_.setBackground(mySelected_Color);
        myColorBtn.setBackground(jButton_Font_Increase_.getBackground());
        myColorBtn=jButton_Alfa_Omega_;
        setTheTheme_fast();

        if (backup_Letter==("Α~Ω")) {
             jButton_Alfa_Omega_.setBackground(mySelected_Color);
        }
        
        else {
            backup_Letter="Α~Ω";
            
        }
        

        try {
            
            searchFilter(jTextField_searchTxt_.getText());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PolytLex_plus_FL.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PolytLex_plus_FL.class.getName()).log(Level.SEVERE, null, ex);
        }
               
        jTextField_Time_Indication_.setHorizontalAlignment(jTextField_Time_Indication_.CENTER);
        jTextField_Time_Indication_.setText("---");
        sizeJList=defaultListModel.getSize();
        jTextField_Total_.setText(String.format("%,d",sizeJList - minusWords));    
        
        //System.out.println(" ");
        
        sizeJList=defaultListModel.getSize();
        jTextField_Total_.setText(String.format("%,d",sizeJList - minusWords));    
        
        //System.out.println(" ");
         
        File fileSize= new File(path);
        double mybytes = fileSize.length();
        //System.out.println("Τὸ μέγεθος τοῦ ἀρχείου εἶναι: " + mybytes + " bytes καὶ περιέχει " + (sizeJList - minusWords) + " λέξεις!");
        
        //System.out.println(" ");
        //System.out.println(" ");
 
        which_Button=jButton_Alfa_Omega_;  

    }//GEN-LAST:event_jButton_Alfa_Omega_ActionPerformed

    private void jButton_Keyboard_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Keyboard_ActionPerformed
        
        Keyboard JFrameKeyboard = new Keyboard();
        JFrameKeyboard.show();
        
    }//GEN-LAST:event_jButton_Keyboard_ActionPerformed

    private void jRadioButton_LexikoChristi_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_LexikoChristi_ActionPerformed
        
        pathFakelos=("./data/lexikochristi/");
        pathPG="lc_";
        path = (pathFakelos + pathPG + pathGramma); 
        
        if (backup_Letter==("Α~Ω")) {
             jButton_Save_.setEnabled(false);
        }
        
        else {
            jButton_Save_.setEnabled(true);
        }
        
        jTextField_searchTxt_.setText(saveMyWord);
        
        myLang=jRadioButton_LexikoChristi_.getText();
        jTextField_SelectedLex_.setText(myLang);
        
        number_lex=6;
 
        //System.out.println("----------------------------------");
        //System.out.println(" ");
        
            MyThread mythread = new MyThread();
            Thread thread = new Thread(mythread);
            thread.start();
            
            try {
            thread.join(10000);
            } catch (InterruptedException ex) {
            Logger.getLogger(PolytLex_plus_FL.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            myBar = new myProgressBar();
            myBar.start();
        
        sizeJList=defaultListModel.getSize();
        jTextField_Total_.setText(String.format("%,d",sizeJList - minusWords));    
        
        //System.out.println(" ");
  
        File fileSize= new File(path);
        double mybytes = fileSize.length();
        //System.out.println("Τὸ μέγεθος τοῦ ἀρχείου εἶναι: " + mybytes + " bytes καὶ περιέχει " + (sizeJList - minusWords) + " λέξεις!");
      
        //System.out.println(" ");
        //System.out.println(" ");
    
        myZeroBar = new myZeroProgressBar();
        myZeroBar.start();

    }//GEN-LAST:event_jRadioButton_LexikoChristi_ActionPerformed

    private void jButton_Save_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Save_ActionPerformed
       
        if (("").equals(saveMyWord)){
         }
        
        else {
        //System.out.println(saveMyWord);
        //System.out.println(saveMyWord);
        //System.out.println(path);
        
        try {
            FileWriter fw1 = new FileWriter(path, true);
            //System.out.println("Ἡ ἀποθήκευση θὰ γίνει στὸ ἀρχεῖο: " + path);
            fw1.write(jTextField_searchTxt_.getText());
            fw1.close();
            
            ArrayList<String> words1 = readFromFile(path);
            Collections.sort(words1);
            saveToFile(path, words1);
        
            //*****************
            
            FileWriter fw2 = new FileWriter(path_userLex, true);
            //System.out.println("Ἡ ἀποθήκευση θὰ γίνει στὸ ἀρχεῖο: " + path_userLex);
            fw2.write(jTextField_searchTxt_.getText());
            fw2.close();

            ArrayList<String> words2 = readFromFile(path_userLex);
            Collections.sort(words2);
            saveToFile(path_userLex, words2);
        
            //*****************
            
            path_for_letter_allLex=("./data/olatalexika/" + "olatalexika_"+ pathGramma);
            FileWriter fw3 = new FileWriter(path_for_letter_allLex, true);
            fw3.write(jTextField_searchTxt_.getText());
            //System.out.println("Ἡ ἀποθήκευση θὰ γίνει στὸ ἀρχεῖο: " + path_for_letter_allLex);
            fw3.close();
           
            ArrayList<String> words3 = readFromFile(path_for_letter_allLex);
            Collections.sort(words3);
            saveToFile(path_for_letter_allLex, words3);
    
            //*****************
                   
            FileWriter fw4 = new FileWriter(path_allLex, true);
            fw4.write(jTextField_searchTxt_.getText());
            //System.out.println("Ἡ ἀποθήκευση θὰ γίνει στὸ ἀρχεῖο: " + path_allLex);
            fw4.close();
           
            ArrayList<String> words4 = readFromFile(path_allLex);
            Collections.sort(words4);
            saveToFile(path_allLex, words4);
    
            //*****************
            
        Saving_Word JSavingWord = new Saving_Word();
        JSavingWord.show();
               
        }
        
        catch (IOException e)
        {
            e.printStackTrace();
        }
              
        }
       
    }//GEN-LAST:event_jButton_Save_ActionPerformed

    private void jButton_Kanones_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Kanones_ActionPerformed
        
        Rules JFrameKanones = new Rules();
        JFrameKanones.show();
        
    }//GEN-LAST:event_jButton_Kanones_ActionPerformed

    private void jRadioButton_Ola_ta_Lexika_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_Ola_ta_Lexika_ActionPerformed
                       
                pathFakelos=("./data/olatalexika/");
                pathPG="olatalexika_";
                
                path = (pathFakelos + pathPG + pathGramma);
                
                jButton_Save_.setEnabled(false);
                jTextField_searchTxt_.setText(saveMyWord);
                
                myLang=jRadioButton_Ola_ta_Lexika_.getText();
                jTextField_SelectedLex_.setText(myLang);
                
                number_lex=7;
                
                //System.out.println("----------------------------------");
                //System.out.println(" ");
      
            MyThread mythread = new MyThread();
            Thread thread = new Thread(mythread);
            thread.start();
            
            try {
            thread.join(10000);
            } catch (InterruptedException ex) {
            Logger.getLogger(PolytLex_plus_FL.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            myBar = new myProgressBar();
            myBar.start();
                
                sizeJList=defaultListModel.getSize();
                jTextField_Total_.setText(String.format("%,d",sizeJList - minusWords));
                
                //System.out.println(" ");
                
                File fileSize= new File(path);
                double mybytes = fileSize.length();
                //System.out.println("Τὸ μέγεθος τοῦ ἀρχείου εἶναι: " + mybytes + " bytes καὶ περιέχει " + (sizeJList - minusWords) + " λέξεις!");
                
                
                //System.out.println(" ");
                //System.out.println(" ");
                
            myZeroBar = new myZeroProgressBar();
            myZeroBar.start();              
     
    }//GEN-LAST:event_jRadioButton_Ola_ta_Lexika_ActionPerformed

    private void jButton_Settings_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Settings_ActionPerformed
       
        Settings JFrameColorPalete = new Settings();
        JFrameColorPalete.show();
        
    }//GEN-LAST:event_jButton_Settings_ActionPerformed

    private void jButton_Info_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Info_ActionPerformed
        
        Info JFrameInfo = new Info();
        JFrameInfo.show();
        
    }//GEN-LAST:event_jButton_Info_ActionPerformed

    private void jButton_Reload_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Reload_ActionPerformed
        
        //System.out.println(" ");
        //System.out.println(" ****** Application of the settings ******");
        
        pathFakelos=("./data/olatalexika/");
        pathPG="olatalexika_";
        pathGramma = ("ola_ta_grammata.dat");
       
        path = (pathFakelos + pathPG + pathGramma); 
        
        //jButton_Alfa_Omega_.setBackground(mySelected_Color);
        //myColorBtn.setBackground(BG_Color_btn);
        //myColorBtn=jButton_Alfa_Omega_;
        jButton_Save_.setEnabled(false);
        
        jTextField_searchTxt_.setText(saveMyWord);
        
        myLang=jRadioButton_Ola_ta_Lexika_.getText();
        jTextField_SelectedLex_.setText(myLang);
 
        File fileMyFont = new File("./settings/myfont.set");
        File fileMyLang = new File ("./settings/mylang.set");
        File fileMySelColor1 = new File("./settings/myselcolor1.set");
        File fileMyTheme = new File("./settings/mytheme.set");
        
        
        //System.out.println("\n");
        //System.out.println("==== PolytLex ====" + "\n");
                
        try {
            Scanner sMTH = new Scanner(fileMyTheme);
            myChoice=Integer.parseInt(sMTH.nextLine());
            strIndexTheme=(sMTH.nextLine());
            setIndexTheme=Integer.parseInt(strIndexTheme);
            strTheme=(sMTH.nextLine());
            theAccentColor=(sMTH.nextLine());
            //System.out.println("");
            //System.out.println("Τὸ θέμα εἶναι " + strTheme + " καὶ βρίσκεται στὴ θέση " + strIndexTheme + ".");
            //System.out.println("");
            FlatLaf.setGlobalExtraDefaults( Collections.singletonMap( "@accentColor", theAccentColor ) );
            setTheTheme();  
            
            StringBuilder str=new StringBuilder(theAccentColor);
            int pos =0;
            str.deleteCharAt(0);
            convertAccentColortoRGB=str.toString();
            
            //System.out.print(theAccentColor + " ---> ");
            //System.out.print(convertAccentColortoRGB  + " ---> ");
        
            int resultRed = Integer.valueOf(convertAccentColortoRGB.substring(0, 2), 16);
            int resultGreen = Integer.valueOf(convertAccentColortoRGB.substring(2, 4), 16);
            int resultBlue = Integer.valueOf(convertAccentColortoRGB.substring(4, 6), 16);
        
            //System.out.println("Red=" + resultRed + "," + " Green=" + resultGreen + "," + " Blue=" + resultBlue + ".");
        
            backupSelectColor = new Color (resultRed, resultGreen, resultBlue);
            BG_Color_btn=backupSelectColor;
            jButton_AccentColor_.setBackground(BG_Color_btn);  
            myJList.setSelectionBackground(BG_Color_btn);
            mySelected_Color=BG_Color_btn;
            

            which_Button.setBackground(mySelected_Color);
            jTextField_searchTxt_.setSelectionColor(mySelected_Color);
            jTextField_totalChars_.setSelectionColor(mySelected_Color);
            jTextField_Font_Size_.setSelectionColor(mySelected_Color);
            jTextField_Total_.setSelectionColor(mySelected_Color);
            jTextField_Time_Indication_.setSelectionColor(mySelected_Color);
        
            //if ((setIndexTheme >=1) && (setIndexTheme<=6)){
            //    FlatLaf.setGlobalExtraDefaults( Collections.singletonMap( "@accentColor", theAccentColor ) );
            //}
            dialog_color_selector=backupSelectColor;
            
        Scanner sML = new Scanner(fileMyLang);
        setMyLang=(sML.nextLine());
        setMyLangChars=(sML.nextLine());
        pathMyLang="./languages/" + setMyLang + myForm + setMyLangChars +".lang";    
        //System.out.println("Γλώσσα: " + setMyLang + " [" + setMyLangChars + "] " + "\n");
        File fileSetMyLang= new File (pathMyLang);
            
            
            Scanner spathML = new Scanner(fileSetMyLang);
            setMyLang=(spathML.nextLine());
            jLabel_searchTxt_.setText(setMyLang);
                    
            setMyLang=(spathML.nextLine());
            jTextField_searchTxt_.setToolTipText(setMyLang);
            
            setMyLang=(spathML.nextLine());
            jButton_X_Clear_.setToolTipText(setMyLang);
            
            setMyLang=(spathML.nextLine());
            jButton_Save_.setToolTipText(setMyLang);
            
            setMyLang=(spathML.nextLine());
            jButton_Settings_.setToolTipText(setMyLang);
            
            setMyLang=(spathML.nextLine());
            jButton_Reload_.setToolTipText(setMyLang);
            
            setMyLang=(spathML.nextLine());
            jTextField_Font_Size_.setToolTipText(setMyLang);
            
            setMyLang=(spathML.nextLine());
            jButton_Font_Increase_.setToolTipText(setMyLang);

            setMyLang=(spathML.nextLine());
            jButton_Font_Decrease_.setToolTipText(setMyLang);            
                    
            setMyLang=(spathML.nextLine());
            jButton_Bold_.setToolTipText(setMyLang);
           
            setMyLang=(spathML.nextLine());
            jLabel_SelectedLex_.setText(setMyLang);
            
            setMyLang=(spathML.nextLine());
            jRadioButton_Perseus_.setText(setMyLang);

            setMyLang=(spathML.nextLine());
            jRadioButton_Logeion_.setText(setMyLang);            
            
            setMyLang=(spathML.nextLine());
            jRadioButton_PD_.setText(setMyLang);
            
            setMyLang=(spathML.nextLine());
            jRadioButton_KD_.setText(setMyLang);
            
            setMyLang=(spathML.nextLine());
            jRadioButton_PolyKeimena_.setText(setMyLang);
                    
            setMyLang=(spathML.nextLine());
            jRadioButton_LexikoChristi_.setText(setMyLang);
            
            setMyLang=(spathML.nextLine());
            jRadioButton_Ola_ta_Lexika_.setText(setMyLang);
            
            setMyLang=(spathML.nextLine());
            jButton_Keyboard_.setText(setMyLang);
            
            setMyLang=(spathML.nextLine());
            jButton_Kanones_.setText(setMyLang);
            
            setMyLang=(spathML.nextLine());
            jButton_Virtual_Keyboard_.setText(setMyLang);
            
            setMyLang=(spathML.nextLine());
            jButton_Editor_.setText(setMyLang);
            
            setMyLang=(spathML.nextLine());
            jButton_Info_.setText(setMyLang);
            
            setMyLang=(spathML.nextLine());
            jLabel_Total_.setText(setMyLang);

            setMyLang=(spathML.nextLine());
            jButton_myColorChooser_1_.setToolTipText(setMyLang);  
            
            setMyLang=(spathML.nextLine());
            Title_ColorPalette=setMyLang;              
     
            setMyLang=(spathML.nextLine());
            jButton_AccentColor_.setToolTipText(setMyLang);               
                       
            setMyLang=(spathML.nextLine());
            jButton_Exit_.setText(setMyLang);
            
            setMyLang=(spathML.nextLine());
            jButton_Exit_.setToolTipText(setMyLang);
            
 
            Scanner sMF = new Scanner(fileMyFont);
            setMyFont=(sMF.nextLine());
            
            
            Scanner sMSC1 = new Scanner( fileMySelColor1);
            //System.out.println("Ἐπιλεγμένο χρῶμα");
            numSCR=(sMSC1.nextInt());
            //System.out.println(numSCR);
            numSCG=(sMSC1.nextInt());
            //System.out.println(numSCG);
            numSCB=(sMSC1.nextInt());
            //System.out.println(numSCB);
            //System.out.println("\n");
            mySelColor1 =new Color(numSCR, numSCG, numSCB);
            backupMySelColor=mySelColor1;
            selectedColor=mySelColor1;
            mySelected_Color=mySelColor1;
            jButton_myColorChooser_1_.setBackground(mySelColor1);   
            

            
        if (flagBold==true) {
                myFont_for_List = new Font(setMyFont, Font.BOLD, setMyTextSize);
                myJList.setFont(myFont_for_List);
                //jButton_Bold_.setBackground(mySelected_Color);
                }
        
        else {
                myFont_for_List = new Font(setMyFont, Font.PLAIN, setMyTextSize);
                myJList.setFont(myFont_for_List);
                //jButton_Bold_.setBackground(BG_Color_btn);
                }
            
        myFont_for_searchTxt = new Font(setMyFont, Font.PLAIN, 24);
        jTextField_searchTxt_.setFont(myFont_for_searchTxt);
        jTextField_Font_Size_.setText(Integer.toString(setMyTextSize));       
        //System.out.println("Γραμματοσειρά: " + setMyFont + "\n"  + "Μέγεθος: " + setMyTextSize);    
            }
        
        catch (FileNotFoundException ex) {
           
            }
     
            jRadioButton_Ola_ta_Lexika_.setSelected(true);
            jTextField_SelectedLex_.setText(jRadioButton_Ola_ta_Lexika_.getText());
        
            //jButton_Alfa_Omega_.setBackground(mySelected_Color);
            //myColorBtn=jButton_Alfa_Omega_;

            //UIManager.put( "nimbusOrange", new Color(BG_Color_btnR, BG_Color_btnG, BG_Color_btnB));
   
            //System.out.println("\n");
        
        try {
            startTime = System.currentTimeMillis();
            searchFilter(jTextField_searchTxt_.getText());
            //System.out.println("Χρόνος ἀναζήτησης = " + (System.currentTimeMillis() - startTime) + " ms");
            TimeIndication2=(System.currentTimeMillis() - startTime);
            jTextField_Time_Indication_.setText(String.format("%,d",TimeIndication2)+ " ms");
            }
        
        catch (FileNotFoundException ex) {
               Logger.getLogger(PolytLex_plus_FL.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) { 
            Logger.getLogger(PolytLex_plus_FL.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        sizeJList=defaultListModel.getSize();
        jTextField_Total_.setText(String.format("%,d",sizeJList - minusWords));    
        
        //System.out.println(" ");
         
        File fileSize= new File(path);
        double mybytes = fileSize.length();
        //System.out.println("Τὸ μέγεθος τοῦ ἀρχείου εἶναι: " + mybytes + " bytes καὶ περιέχει " + (sizeJList - minusWords) + " λέξεις!");
        mySelected_Color=BG_Color_btn;
        rulesColor=jButton_Font_Increase_.getForeground();
       
        
    }//GEN-LAST:event_jButton_Reload_ActionPerformed

    private void jRadioButton_Logeion_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_Logeion_ActionPerformed
        
        pathFakelos=("./data/logeion/");
            pathPG="log_";
            path = (pathFakelos + pathPG + pathGramma);
            
            jButton_Save_.setEnabled(false);
            jTextField_searchTxt_.setText(saveMyWord);
            
            myLang=jRadioButton_Logeion_.getText();
            jTextField_SelectedLex_.setText(myLang);
            
            number_lex=2;
            
            //System.out.println("----------------------------------");
            //System.out.println(" ");
            
            MyThread mythread = new MyThread();
            Thread thread = new Thread(mythread);
            thread.start();
            
            try {
            thread.join(10000);
            } catch (InterruptedException ex) {
            Logger.getLogger(PolytLex_plus_FL.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            myBar = new myProgressBar();
            myBar.start();
           
            sizeJList=defaultListModel.getSize();
            jTextField_Total_.setText(String.format("%,d",sizeJList - minusWords));
            
            //System.out.println(" ");
            
            File fileSize= new File(path);
            double mybytes = fileSize.length();
            //System.out.println("Τὸ μέγεθος τοῦ ἀρχείου εἶναι: " + mybytes + " bytes καὶ περιέχει " + (sizeJList - minusWords) + " λέξεις!");
            
            //System.out.println(" ");
            //System.out.println(" ");
            
            myZeroBar = new myZeroProgressBar();
            myZeroBar.start();
            
    }//GEN-LAST:event_jRadioButton_Logeion_ActionPerformed

    private void jButton_Virtual_Keyboard_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Virtual_Keyboard_ActionPerformed
        
        try {
            Virtual_Keyboard JFrameVirtualKeyboard = new Virtual_Keyboard();
            JFrameVirtualKeyboard.show();
        } catch (IOException ex) {
            Logger.getLogger(PolytLex_plus_FL.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton_Virtual_Keyboard_ActionPerformed

    private void jButton_Editor_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Editor_ActionPerformed
              
        try {
            Editor JFrameEditor = new Editor();
            JFrameEditor.show();
        } catch (IOException ex) {
            Logger.getLogger(PolytLex_plus_FL.class.getName()).log(Level.SEVERE, null, ex);
        }
        
     
    }//GEN-LAST:event_jButton_Editor_ActionPerformed

    private void jButton_myColorChooser_1_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_myColorChooser_1_ActionPerformed
        
        selectedColor=JColorChooser.showDialog(null, Title_ColorPalette, mySelected_Color);
        
        if (selectedColor==null){
            selectedColor=backupMySelColor;
        }

        mySelected_Color=selectedColor;
        backupMySelColor=selectedColor;
        BG_Color_btn=selectedColor;
        jButton_myColorChooser_1_.setBackground(selectedColor);
        
        if (flagBold==false) {
            jButton_Bold_.setBackground(jButton_Font_Increase_.getBackground()); 
        }
        else {
            jButton_Bold_.setBackground(BG_Color_btn);  
        }
            
        which_Button.setBackground(mySelected_Color);
        myJList.setSelectionBackground(mySelected_Color);
        
        jTextField_searchTxt_.setSelectionColor(selectedColor);
        jTextField_totalChars_.setSelectionColor(selectedColor);
        jTextField_Font_Size_.setSelectionColor(selectedColor);
        jTextField_Total_.setSelectionColor(selectedColor);
        jTextField_Time_Indication_.setSelectionColor(selectedColor);
        
        numSCR = selectedColor.getRed();
        numSCG = selectedColor.getGreen();
        numSCB = selectedColor.getBlue();
        myColor1=String.format("#%02x%02x%02x", numSCR, numSCG, numSCB);
        //System.out.println(myColor1);
        FlatLaf.setGlobalExtraDefaults( Collections.singletonMap( "@accentColor", myColor1 ) );
        setTheTheme();
        try {
            FileWriter fwMySelColor1 = new FileWriter("./settings/myselcolor1.set");
            fwMySelColor1.write(numSCR + "\n");
            fwMySelColor1.write(numSCG + "\n");
            fwMySelColor1.write(numSCB + "\n");
            fwMySelColor1.close();

            }    
            
        catch (IOException e) {
                    e.printStackTrace();
            }
        flagTheme=false;
        dialog_color_selector=jButton_myColorChooser_1_.getBackground();
        
    }//GEN-LAST:event_jButton_myColorChooser_1_ActionPerformed

    private void jButton_AccentColor_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AccentColor_ActionPerformed
        

        myJList.setSelectionBackground(jButton_AccentColor_.getBackground());
        BG_Color_btn=jButton_AccentColor_.getBackground();
        mySelected_Color=BG_Color_btn;
        
        numSCR = mySelected_Color.getRed();
        numSCG = mySelected_Color.getGreen();
        numSCB = mySelected_Color.getBlue();
        myColor1=String.format("#%02x%02x%02x", numSCR, numSCG, numSCB);
        //System.out.println(myColor1);
        FlatLaf.setGlobalExtraDefaults( Collections.singletonMap( "@accentColor", myColor1 ) );
        setTheTheme();
        
        which_Button.setBackground(mySelected_Color);
        jTextField_searchTxt_.setSelectionColor(mySelected_Color);
        jTextField_totalChars_.setSelectionColor(mySelected_Color);
        jTextField_Font_Size_.setSelectionColor(mySelected_Color);
        jTextField_Total_.setSelectionColor(mySelected_Color);
        jTextField_Time_Indication_.setSelectionColor(mySelected_Color);
        
        if (flagBold==false) {
            jButton_Bold_.setBackground(jButton_Font_Increase_.getBackground()); 
        }
        else {
            jButton_Bold_.setBackground(BG_Color_btn);  
        }
        
        flagTheme=true;
        dialog_color_selector=jButton_AccentColor_.getBackground();
        
    }//GEN-LAST:event_jButton_AccentColor_ActionPerformed
    
    public static ArrayList readFromFile(String filename) {
    ArrayList<String> myNewList = new ArrayList<String>();
        try  {
            Scanner myscan = new Scanner(new File(filename));
            while (myscan.hasNextLine()){
                myNewList.add(myscan.nextLine());
             }
            myscan.close();
        }  catch (FileNotFoundException e) {
           e.printStackTrace();
        }
        return myNewList;

    }
    
     public static ArrayList saveToFile(String filename, ArrayList list) {
         Path filePath=Paths.get(filename);
     try {
         
         Files.write(filePath, list, Charset.defaultCharset());
      
         }
    catch (IOException e) {
        e.printStackTrace();
    }
     return list;
}
     
    
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String args[]) throws IOException, InterruptedException, InvocationTargetException{
        
       try {
            //UIManager.setLookAndFeel(new FlatLightLaf());
            //UIManager.setLookAndFeel(new FlatDarkLaf());
            	
            UIManager.setLookAndFeel(new FlatIntelliJLaf());
         


        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(PolytLex_plus_FL.class.getName()).log(Level.SEVERE, null, ex);
       }
        
        
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
      
      java.awt.EventQueue.invokeLater(() -> {
            try {
                new PolytLex_plus_FL().setVisible(true);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(PolytLex_plus_FL.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(PolytLex_plus_FL.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    


   
        private class MyThread implements Runnable {
      
        public void run() {
          
         startTime = System.currentTimeMillis();
           
         try {
                searchFilter(jTextField_searchTxt_.getText());
            } 
         
         catch (FileNotFoundException ex) {
                Logger.getLogger(PolytLex_plus_FL.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(PolytLex_plus_FL.class.getName()).log(Level.SEVERE, null, ex);
            }
         
            //System.out.println("Χρόνος ἀναζήτησης = " + (System.currentTimeMillis() - startTime) + " ms");
            TimeIndication2=(System.currentTimeMillis() - startTime);
            jTextField_Time_Indication_.setHorizontalAlignment(jTextField_Time_Indication_.RIGHT);
            jTextField_Time_Indication_.setText(String.format("%,d",TimeIndication2)+ " ms");  

            }
        
        }
   
        private class myZeroProgressBar extends Thread{
        
         @Override
         public void run() {
        
            try {
                    Thread.sleep(TimeIndication2 + 2000);
                    //System.out.println("Ὁ Μηδενισμός τῆς μπάρας θα γίνει σε xρόνο ἀναζήτησης + 2 δευτερόλεπτα");
                    //System.out.println("");
                    jProgressBar_LoadTime_.setValue(0);
                   
                }
            
            catch (InterruptedException e) {
                e.printStackTrace();
                    }
            }
        }        
       
        
         private class myProgressBar extends Thread{
            
          @Override
          public void run() {
           
            int timeProgressLoading2 = (int) (TimeIndication2/100);
            
            //System.out.println("Ἡ μπάρα θὰ προχωράει κάθε " + timeProgressLoading2 + " ms");
            //System.out.println("");
                    
            for (int i=0; i<=100; i++) {
               jProgressBar_LoadTime_.setValue(i);
            
            try {
                Thread.sleep(timeProgressLoading2);
                }
                
            catch (InterruptedException e) {
                e.printStackTrace();
                    }
                }
            }
        }           
    
          

         
    private void setTheTheme_fast (){  
        FlatLaf.updateUI();
        //SwingUtilities.updateComponentTreeUI(this);                             
  
    }
         
    private void setTheTheme (){ 

        if (myChoice == 0)
        {   
          
        switch (setIndexTheme) {
                    
                case 0:
                //System.out.println("--- Core Themes ---"); 
                //System.out.println("");
                break; 
                 
                case 1:
                SwingUtilities.invokeLater(() -> {
                    try{
                    UIManager.setLookAndFeel(new  FlatLightLaf());
                    setSquare_or_Round();
                    FlatLaf.updateUI();
                    SwingUtilities.updateComponentTreeUI(this);
                    }
                    catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(Settings.class.getName()).log(Level.SEVERE, null, ex);
                    }
                });
                //System.out.println("FlatLaf Light");
                //System.out.println("");
                break;    
                
                case 2:
                SwingUtilities.invokeLater(() -> {
                    try {
                    UIManager.setLookAndFeel(new  FlatDarkLaf());
                    setSquare_or_Round();
                    FlatLaf.updateUI();
                    SwingUtilities.updateComponentTreeUI(this);
                    } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(Settings.class.getName()).log(Level.SEVERE, null, ex);
                        }
                });
                //System.out.println("FlatLaf Dark");  
                //System.out.println("");
                break;                   
                
                case 3:
                SwingUtilities.invokeLater(() -> {
                    FlatIntelliJLaf.setup();
                    setSquare_or_Round();
                    FlatLaf.updateUI();
                    SwingUtilities.updateComponentTreeUI(this);
                });
                //System.out.println("FlatLaf IntelliJ");  
                //System.out.println("");
                break;                
    
                case 4:
                SwingUtilities.invokeLater(() -> {
                    FlatDarculaLaf.setup();
                    setSquare_or_Round();
                    FlatLaf.updateUI();
                    SwingUtilities.updateComponentTreeUI(this);
                });
                //System.out.println("FlatLaf Darcula"); 
                //System.out.println("");
                break;
 
                case 5:
                SwingUtilities.invokeLater(() -> {
                    FlatMacLightLaf.setup();
                    setSquare_or_Round();
                    FlatLaf.updateUI();
                    SwingUtilities.updateComponentTreeUI(this);                             
                });
                //System.out.println("FlatLaf macOS Light"); 
                //System.out.println("");
                break;
 
                case 6:
                SwingUtilities.invokeLater(() -> {
                     FlatMacDarkLaf.setup();
                     setSquare_or_Round();
                     FlatLaf.updateUI();
                    SwingUtilities.updateComponentTreeUI(this);                             
                });
                //System.out.println("FlatLaf macOS Dark");  
                //System.out.println("");
                break;  
             
                case 7:
                //System.out.println("--------- Intellij Themes -------");  
                //System.out.println("");
                break;                  
                
                case 8:
                SwingUtilities.invokeLater(() -> {
                    FlatArcIJTheme.setup();
                    setSquare_or_Round();
                    FlatLaf.updateUI();
                    SwingUtilities.updateComponentTreeUI(this);                             
                });

                //System.out.println("Arc");  
                //System.out.println("");
                break;   
               
                case 9:
                SwingUtilities.invokeLater(() -> {
                    FlatArcOrangeIJTheme.setup();  
                    setSquare_or_Round();
                    FlatLaf.updateUI();
                    SwingUtilities.updateComponentTreeUI(this);                             
                });

                //System.out.println("Arc - Orange");                  
                //System.out.println("");
                break;   

                case 10:
                SwingUtilities.invokeLater(() -> {
                    FlatArcDarkIJTheme.setup();
                    setSquare_or_Round();
                    FlatLaf.updateUI();
                    SwingUtilities.updateComponentTreeUI(this);                             
                });
                //System.out.println("Arc Dark"); 
                //System.out.println("");
                break;   

                case 11:
                SwingUtilities.invokeLater(() -> {
                    FlatArcDarkOrangeIJTheme.setup();
                    setSquare_or_Round();
                    FlatLaf.updateUI();
                    SwingUtilities.updateComponentTreeUI(this);                             
                });
                //System.out.println("Arc Dark - Orange"); 
                //System.out.println("");
                break;   
                
                case 12:
                SwingUtilities.invokeLater(() -> {
                    FlatCarbonIJTheme.setup();
                    setSquare_or_Round();
                    FlatLaf.updateUI();
                    SwingUtilities.updateComponentTreeUI(this);                             
                });
                //System.out.println("Carbon");  
                //System.out.println("");
                break;   

                case 13:
                SwingUtilities.invokeLater(() -> {
                    FlatCobalt2IJTheme.setup();
                    setSquare_or_Round();
                    FlatLaf.updateUI();
                    SwingUtilities.updateComponentTreeUI(this);  
                });
                //System.out.println("Cobalt2");  
                //System.out.println("");
                break;   

                case 14:
                SwingUtilities.invokeLater(() -> {
                    FlatCyanLightIJTheme.setup();
                    setSquare_or_Round();
                    FlatLaf.updateUI();
                    SwingUtilities.updateComponentTreeUI(this);                             
                });
                //System.out.println("Cyan Light");  
                //System.out.println("");
                break;   

                case 15:
                SwingUtilities.invokeLater(() -> {
                    FlatDarkFlatIJTheme.setup();
                    setSquare_or_Round();
                    FlatLaf.updateUI();
                    SwingUtilities.updateComponentTreeUI(this);                             
                });
                //System.out.println("Dark Flat");  
                //System.out.println("");
                break;   

                case 16:
                SwingUtilities.invokeLater(() -> {
                    FlatDarkPurpleIJTheme.setup();
                    setSquare_or_Round();
                    FlatLaf.updateUI();
                    SwingUtilities.updateComponentTreeUI(this);                             
                });
                //System.out.println("Dark Purple");
                //System.out.println("");
                break;   

                case 17 :
                SwingUtilities.invokeLater(() -> {
                    FlatDraculaIJTheme.setup();
                    setSquare_or_Round();
                    FlatLaf.updateUI();
                    SwingUtilities.updateComponentTreeUI(this);                             
                });
                //System.out.println("Dracula");  
                //System.out.println("");
                break;   
                
                case 18:
                SwingUtilities.invokeLater(() -> {
                    FlatGradiantoDarkFuchsiaIJTheme.setup();
                    setSquare_or_Round();
                    FlatLaf.updateUI();
                    SwingUtilities.updateComponentTreeUI(this);                             
                });
                //System.out.println("Gradianto Dark Fuchsia");  
                //System.out.println("");
                break;   

                case 19:
                SwingUtilities.invokeLater(() -> {
                    FlatGradiantoDeepOceanIJTheme.setup();
                    setSquare_or_Round();
                    FlatLaf.updateUI();
                    SwingUtilities.updateComponentTreeUI(this);                             
                });
                //System.out.println("Gradianto Deep Ocean");  
                //System.out.println("");
                break;   

                case 20:
                SwingUtilities.invokeLater(() -> {
                    FlatGradiantoMidnightBlueIJTheme.setup();
                    setSquare_or_Round();
                    FlatLaf.updateUI();
                    SwingUtilities.updateComponentTreeUI(this);                             
                });
                //System.out.println("Gradianto Midnight Blue");  
                //System.out.println("");
                break;   

                case 21:
                SwingUtilities.invokeLater(() -> {
                    FlatGradiantoNatureGreenIJTheme.setup();
                    setSquare_or_Round();
                    FlatLaf.updateUI();
                    SwingUtilities.updateComponentTreeUI(this);                             
                });
                //System.out.println("Gradianto Nature Green");  
                //System.out.println("");
                break;   

                case 22:
                SwingUtilities.invokeLater(() -> {
                    FlatGrayIJTheme.setup();
                    setSquare_or_Round();
                    FlatLaf.updateUI();
                    SwingUtilities.updateComponentTreeUI(this);                             
                });
                //System.out.println("Gray");  
                //System.out.println("");
                break;   

                case 23:
                SwingUtilities.invokeLater(() -> {
                    FlatGruvboxDarkHardIJTheme.setup();
                    setSquare_or_Round();
                    FlatLaf.updateUI();
                    SwingUtilities.updateComponentTreeUI(this);                             
                });
                //System.out.println("Gruvbox Dark Hard"); 
                //System.out.println("");
                break;   

                case 24:
                SwingUtilities.invokeLater(() -> {
                    FlatHiberbeeDarkIJTheme.setup();
                    setSquare_or_Round();
                    FlatLaf.updateUI();
                    SwingUtilities.updateComponentTreeUI(this);                             
                });
                //System.out.println("Hiberbee Dark"); 
                //System.out.println("");                
                break;   

                case 25:
                SwingUtilities.invokeLater(() -> {
                    FlatHighContrastIJTheme.setup();
                    setSquare_or_Round();
                    FlatLaf.updateUI();
                    SwingUtilities.updateComponentTreeUI(this);                             
                });
                //System.out.println("High Contrast");  
                //System.out.println("");
                break;   

                case 26:
                SwingUtilities.invokeLater(() -> {
                    FlatLightFlatIJTheme.setup();
                    setSquare_or_Round();
                    FlatLaf.updateUI();
                    SwingUtilities.updateComponentTreeUI(this);                             
                });
                //System.out.println("Light Flat");  
                //System.out.println("");
                break;   

                case 27:
                SwingUtilities.invokeLater(() -> {
                    FlatMaterialDesignDarkIJTheme.setup();
                    setSquare_or_Round();
                    FlatLaf.updateUI();
                    SwingUtilities.updateComponentTreeUI(this);                             
                });
                //System.out.println("Material Design Dark"); 
                //System.out.println("");                
                break;   

                case 28:
                SwingUtilities.invokeLater(() -> {
                    FlatMonocaiIJTheme.setup();
                    setSquare_or_Round();
                    FlatLaf.updateUI();
                    SwingUtilities.updateComponentTreeUI(this);                             
                });
                //System.out.println("Monocai");    
                //System.out.println("");
                break;   

                case 29:
                SwingUtilities.invokeLater(() -> {
                    FlatMonokaiProIJTheme.setup();
                    setSquare_or_Round();
                    FlatLaf.updateUI();
                    SwingUtilities.updateComponentTreeUI(this);                             
                });
                //System.out.println("Monokai Pro");     
                //System.out.println("");
                break;   

                case 30:
                SwingUtilities.invokeLater(() -> {
                    FlatNordIJTheme.setup();
                    setSquare_or_Round();
                    FlatLaf.updateUI();
                    SwingUtilities.updateComponentTreeUI(this);                             
                });
                //System.out.println("Nord");        
                //System.out.println("");
                break;   

                case 31:
                SwingUtilities.invokeLater(() -> {
                    FlatOneDarkIJTheme.setup();
                    setSquare_or_Round();
                    FlatLaf.updateUI();
                    SwingUtilities.updateComponentTreeUI(this);                             
                });
                //System.out.println("One Dark");   
                //System.out.println("");
                break;   

                case 32:
                SwingUtilities.invokeLater(() -> {
                    FlatSolarizedDarkIJTheme.setup();
                    setSquare_or_Round();
                    FlatLaf.updateUI();
                    SwingUtilities.updateComponentTreeUI(this);                             
                });
                //System.out.println("Solarized Dark"); 
                //System.out.println("");                
                break;   

                case 33:
                SwingUtilities.invokeLater(() -> {
                    FlatSolarizedLightIJTheme.setup();
                    setSquare_or_Round();
                    FlatLaf.updateUI();
                    SwingUtilities.updateComponentTreeUI(this);                             
                });
                //System.out.println("Solarized Light");
                //System.out.println("");
                break;   

                case 34:
                SwingUtilities.invokeLater(() -> {
                    FlatSpacegrayIJTheme.setup();
                    setSquare_or_Round();
                    FlatLaf.updateUI();
                    SwingUtilities.updateComponentTreeUI(this);                             
                });
                //System.out.println("Spacegray"); 
                //System.out.println("");                
                break;   
                
                case 35:
                SwingUtilities.invokeLater(() -> {
                    FlatVuesionIJTheme.setup();
                    setSquare_or_Round();
                    FlatLaf.updateUI();
                    SwingUtilities.updateComponentTreeUI(this);                             
                });
                //System.out.println("Vuesion");  
                //System.out.println("");
                break;   

                case 36:
                SwingUtilities.invokeLater(() -> {
                    FlatXcodeDarkIJTheme.setup();
                    setSquare_or_Round();
                    FlatLaf.updateUI();
                    SwingUtilities.updateComponentTreeUI(this);                             
                });
                //System.out.println("Xcode Dark");  
                //System.out.println("");
                break;   

                case 37:
                //System.out.println("--- Material Theme UI Light ---");
                //System.out.println("");
                break;   
                
                case 38:
                SwingUtilities.invokeLater(() -> {
                    FlatMTArcDarkIJTheme.setup();
                    setSquare_or_Round();
                    FlatLaf.updateUI();
                    SwingUtilities.updateComponentTreeUI(this);                             
                });
                //System.out.println("Arc Dark");  
                //System.out.println("");
                break; 

                case 39:
                SwingUtilities.invokeLater(() -> {
                    FlatMTAtomOneDarkIJTheme.setup();
                    setSquare_or_Round();
                    FlatLaf.updateUI();
                    SwingUtilities.updateComponentTreeUI(this);                             
                });
                //System.out.println("Atom One Dark");  
                //System.out.println("");
                break; 

                case 40:
                SwingUtilities.invokeLater(() -> {
                    FlatMTAtomOneLightIJTheme.setup();
                    setSquare_or_Round();
                    FlatLaf.updateUI();
                    SwingUtilities.updateComponentTreeUI(this);                             
                });
                //System.out.println("Atom One Light");  
                //System.out.println("");
                break; 

                case 41:
                SwingUtilities.invokeLater(() -> {
                    FlatMTDraculaIJTheme.setup();
                    setSquare_or_Round();
                    FlatLaf.updateUI();
                    SwingUtilities.updateComponentTreeUI(this);                             
                });
                //System.out.println("Dracula");  
                //System.out.println("");
                break; 

                case 42:
                SwingUtilities.invokeLater(() -> {
                    FlatMTGitHubIJTheme.setup();
                    setSquare_or_Round();
                    FlatLaf.updateUI();
                    SwingUtilities.updateComponentTreeUI(this);                             
                });
                //System.out.println("GitHub");  
                //System.out.println("");
                break; 

                case 43:
                SwingUtilities.invokeLater(() -> {
                    FlatMTGitHubDarkIJTheme.setup();
                    setSquare_or_Round();
                    FlatLaf.updateUI();
                    SwingUtilities.updateComponentTreeUI(this);                             
                });
                //System.out.println("GitHub Dark");  
                //System.out.println("");
                break; 

                case 44:
                SwingUtilities.invokeLater(() -> {
                    FlatMTLightOwlIJTheme.setup();
                    setSquare_or_Round();
                    FlatLaf.updateUI();
                    SwingUtilities.updateComponentTreeUI(this);                             
                });
                //System.out.println("Light Owl");  
                //System.out.println("");
                break;       
                
                case 45:
                SwingUtilities.invokeLater(() -> {
                    FlatMTMaterialDarkerIJTheme.setup();
                    setSquare_or_Round();
                    FlatLaf.updateUI();
                    SwingUtilities.updateComponentTreeUI(this);                             
                });
                //System.out.println("Material Darker");  
                //System.out.println("");
                break;                  

                case 46:
                SwingUtilities.invokeLater(() -> {
                    FlatMTMaterialDeepOceanIJTheme.setup();
                    setSquare_or_Round();
                    FlatLaf.updateUI();
                    SwingUtilities.updateComponentTreeUI(this);                             
                });
                //System.out.println("Material Deep Ocean");  
                //System.out.println("");
                break;                  

                case 47:
                SwingUtilities.invokeLater(() -> {
                    FlatMTMaterialLighterIJTheme.setup();
                    setSquare_or_Round();
                    FlatLaf.updateUI();
                    SwingUtilities.updateComponentTreeUI(this);                             
                });
                //System.out.println("Material Lighter");  
                //System.out.println("");
                break;                  

                case 48:
                SwingUtilities.invokeLater(() -> {
                    FlatMTMaterialOceanicIJTheme.setup();
                    setSquare_or_Round();
                    FlatLaf.updateUI();
                    SwingUtilities.updateComponentTreeUI(this);                             
                });
                //System.out.println("Material Oceanic");  
                //System.out.println("");
                break;                  

                case 49:
                SwingUtilities.invokeLater(() -> {
                    FlatMTMaterialPalenightIJTheme.setup();
                    setSquare_or_Round();
                    FlatLaf.updateUI();
                    SwingUtilities.updateComponentTreeUI(this);                             
                });
                //System.out.println("Material Palenight");  
                //System.out.println("");
                break;                  

                case 50:
                SwingUtilities.invokeLater(() -> {
                    FlatMTMonokaiProIJTheme.setup();
                    setSquare_or_Round();
                    FlatLaf.updateUI();
                    SwingUtilities.updateComponentTreeUI(this);                             
                });
                //System.out.println("Monokai Pro");  
                //System.out.println("");
                break;                  

                case 51:
                SwingUtilities.invokeLater(() -> {
                    FlatMTMoonlightIJTheme.setup();
                    setSquare_or_Round();
                    FlatLaf.updateUI();
                    SwingUtilities.updateComponentTreeUI(this);                             
                });
                //System.out.println("Moonlight");  
                //System.out.println("");
                break;                  

                case 52:
                SwingUtilities.invokeLater(() -> {
                    FlatMTNightOwlIJTheme.setup();
                    setSquare_or_Round();
                    FlatLaf.updateUI();
                    SwingUtilities.updateComponentTreeUI(this);                             
                });   
                //System.out.println("Night Owl");  
                //System.out.println("");
                break;                  
                
                case 53:
                SwingUtilities.invokeLater(() -> {
                    FlatMTSolarizedDarkIJTheme.setup();
                    setSquare_or_Round();
                    FlatLaf.updateUI();
                    SwingUtilities.updateComponentTreeUI(this);                             
                });
                //System.out.println("Solarized Dark");  
                //System.out.println("");
                break;                  

                case 54:
                SwingUtilities.invokeLater(() -> {
                    FlatMTSolarizedLightIJTheme.setup();
                    setSquare_or_Round();
                    FlatLaf.updateUI();
                    SwingUtilities.updateComponentTreeUI(this);                             
                }); 
                //System.out.println("Solarized Light");  
                //System.out.println("");
                break;                  
        }   
        }    
        
        if (myChoice == 1)
        {   
         
        switch (setIndexTheme) {
                    
                case 0:
                //System.out.println("--- Core Themes ---"); 
                //System.out.println("");
                break; 
                 
                case 1:
                SwingUtilities.invokeLater(() -> {
                    try{
                    UIManager.setLookAndFeel(new  FlatLightLaf());
                    setSquare_or_Round();
                    FlatLaf.updateUI();
                    SwingUtilities.updateComponentTreeUI(this);
                    }
                    catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(Settings.class.getName()).log(Level.SEVERE, null, ex);
                    }
                });
                //System.out.println("FlatLaf Light");
                //System.out.println("");
                break;    
                
                case 2:
                SwingUtilities.invokeLater(() -> {
                    FlatIntelliJLaf.setup();
                    setSquare_or_Round();
                    FlatLaf.updateUI();
                    SwingUtilities.updateComponentTreeUI(this);
                });
                //System.out.println("FlatLaf IntelliJ");  
                //System.out.println("");
                break;                
 
                case 3:
                SwingUtilities.invokeLater(() -> {
                    FlatMacLightLaf.setup();
                    setSquare_or_Round();
                    FlatLaf.updateUI();
                    SwingUtilities.updateComponentTreeUI(this);                             
                });
                //System.out.println("FlatLaf macOS Light"); 
                //System.out.println("");
                break;
             
                case 4:
                //System.out.println("--------- Intellij Themes -------");  
                //System.out.println("");
                break;                  
                
                case 5:
                SwingUtilities.invokeLater(() -> {
                    FlatArcIJTheme.setup();
                    setSquare_or_Round();
                    FlatLaf.updateUI();
                    SwingUtilities.updateComponentTreeUI(this);                             
                });

                //System.out.println("Arc");  
                //System.out.println("");
                break;   
               
                case 6:
                SwingUtilities.invokeLater(() -> {
                    FlatArcOrangeIJTheme.setup();  
                    setSquare_or_Round();
                    FlatLaf.updateUI();
                    SwingUtilities.updateComponentTreeUI(this);                             
                });

                //System.out.println("Arc - Orange");                  
                //System.out.println("");
                break;   
                
                case 7:
                SwingUtilities.invokeLater(() -> {
                    FlatCyanLightIJTheme.setup();
                    setSquare_or_Round();
                    FlatLaf.updateUI();
                    SwingUtilities.updateComponentTreeUI(this);                             
                });
                //System.out.println("Cyan Light");  
                //System.out.println("");
                break;   
                
                case 8:
                SwingUtilities.invokeLater(() -> {
                    FlatGrayIJTheme.setup();
                    setSquare_or_Round();
                    FlatLaf.updateUI();
                    SwingUtilities.updateComponentTreeUI(this);                             
                });
                //System.out.println("Gray");  
                //System.out.println("");
                break;  
                
                case 9:
                SwingUtilities.invokeLater(() -> {
                    FlatLightFlatIJTheme.setup();
                    setSquare_or_Round();
                    FlatLaf.updateUI();
                    SwingUtilities.updateComponentTreeUI(this);                             
                });
                //System.out.println("Light Flat");  
                //System.out.println("");
                break;  

                case 10:
                SwingUtilities.invokeLater(() -> {
                    FlatSolarizedLightIJTheme.setup();
                    setSquare_or_Round();
                    FlatLaf.updateUI();
                    SwingUtilities.updateComponentTreeUI(this);                             
                });
                //System.out.println("Solarized Light");
                //System.out.println("");
                break; 

                case 11:
                //System.out.println("--- Material Theme UI Light ---");
                //System.out.println("");
                break;   

                case 12:
                SwingUtilities.invokeLater(() -> {
                    FlatMTAtomOneLightIJTheme.setup();
                    setSquare_or_Round();
                    FlatLaf.updateUI();
                    SwingUtilities.updateComponentTreeUI(this);                             
                });
                //System.out.println("Atom One Light");  
                //System.out.println("");
                break;  
                
                case 13:
                SwingUtilities.invokeLater(() -> {
                    FlatMTGitHubIJTheme.setup();
                    setSquare_or_Round();
                    FlatLaf.updateUI();
                    SwingUtilities.updateComponentTreeUI(this);                             
                });
                //System.out.println("GitHub");  
                //System.out.println("");
                break;   
                
                case 14:
                SwingUtilities.invokeLater(() -> {
                    FlatMTLightOwlIJTheme.setup();
                    setSquare_or_Round();
                    FlatLaf.updateUI();
                    SwingUtilities.updateComponentTreeUI(this);                             
                });
                //System.out.println("Light Owl");  
                //System.out.println("");
                break;    
                
                case 15:
                SwingUtilities.invokeLater(() -> {
                    FlatMTMaterialLighterIJTheme.setup();
                    setSquare_or_Round();
                    FlatLaf.updateUI();
                    SwingUtilities.updateComponentTreeUI(this);                             
                });
                //System.out.println("Material Lighter");  
                //System.out.println("");
                break;  

                case 16:
                SwingUtilities.invokeLater(() -> {
                    FlatMTSolarizedLightIJTheme.setup();
                    setSquare_or_Round();
                    FlatLaf.updateUI();
                    SwingUtilities.updateComponentTreeUI(this);                             
                }); 
                //System.out.println("Solarized Light");  
                //System.out.println("");
                break;                  
            
        }
        }  
        
        if (myChoice == 2)
        {   

        switch (setIndexTheme) {
                    
                case 0:
                //System.out.println("--- Core Themes ---"); 
                //System.out.println("");
                break; 
                
                case 1:
                SwingUtilities.invokeLater(() -> {
                    try {
                    UIManager.setLookAndFeel(new  FlatDarkLaf());
                    setSquare_or_Round();
                    FlatLaf.updateUI();
                    SwingUtilities.updateComponentTreeUI(this);
                    } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(Settings.class.getName()).log(Level.SEVERE, null, ex);
                        }
                });
                //System.out.println("FlatLaf Dark");  
                //System.out.println("");
                break;                   
    
                case 2:
                SwingUtilities.invokeLater(() -> {
                    FlatDarculaLaf.setup();
                    setSquare_or_Round();
                    FlatLaf.updateUI();
                    SwingUtilities.updateComponentTreeUI(this);
                });
                //System.out.println("FlatLaf Darcula"); 
                //System.out.println("");
                break;
 
                case 3:
                SwingUtilities.invokeLater(() -> {
                     FlatMacDarkLaf.setup();
                     setSquare_or_Round();
                     FlatLaf.updateUI();
                    SwingUtilities.updateComponentTreeUI(this);                             
                });
                //System.out.println("FlatLaf macOS Dark");  
                //System.out.println("");
                break;  
             
                case 4:
                //System.out.println("--------- Intellij Themes -------");  
                //System.out.println("");
                break;                  
   
                case 5:
                SwingUtilities.invokeLater(() -> {
                    FlatArcDarkIJTheme.setup();
                    setSquare_or_Round();
                    FlatLaf.updateUI();
                    SwingUtilities.updateComponentTreeUI(this);                             
                });
                //System.out.println("Arc Dark"); 
                //System.out.println("");
                break;   

                case 6:
                SwingUtilities.invokeLater(() -> {
                    FlatArcDarkOrangeIJTheme.setup();
                    setSquare_or_Round();
                    FlatLaf.updateUI();
                    SwingUtilities.updateComponentTreeUI(this);                             
                });
                //System.out.println("Arc Dark - Orange"); 
                //System.out.println("");
                break;   
                
                case 7:
                SwingUtilities.invokeLater(() -> {
                    FlatCarbonIJTheme.setup();
                    setSquare_or_Round();
                    FlatLaf.updateUI();
                    SwingUtilities.updateComponentTreeUI(this);                             
                });
                //System.out.println("Carbon");  
                //System.out.println("");
                break;   

                case 8:
                SwingUtilities.invokeLater(() -> {
                    FlatCobalt2IJTheme.setup();
                    setSquare_or_Round();
                    FlatLaf.updateUI();
                    SwingUtilities.updateComponentTreeUI(this);  
                });
                //System.out.println("Cobalt2");  
                //System.out.println("");
                break;   


                case 9:
                SwingUtilities.invokeLater(() -> {
                    FlatDarkFlatIJTheme.setup();
                    setSquare_or_Round();
                    FlatLaf.updateUI();
                    SwingUtilities.updateComponentTreeUI(this);                             
                });
                //System.out.println("Dark Flat");  
                //System.out.println("");
                break;   

                case 10:
                SwingUtilities.invokeLater(() -> {
                    FlatDarkPurpleIJTheme.setup();
                    setSquare_or_Round();
                    FlatLaf.updateUI();
                    SwingUtilities.updateComponentTreeUI(this);                             
                });
                //System.out.println("Dark Purple");
                //System.out.println("");
                break;   

                case 11 :
                SwingUtilities.invokeLater(() -> {
                    FlatDraculaIJTheme.setup();
                    setSquare_or_Round();
                    FlatLaf.updateUI();
                    SwingUtilities.updateComponentTreeUI(this);                             
                });
                //System.out.println("Dracula");  
                //System.out.println("");
                break;   
                
                case 12:
                SwingUtilities.invokeLater(() -> {
                    FlatGradiantoDarkFuchsiaIJTheme.setup();
                    setSquare_or_Round();
                    FlatLaf.updateUI();
                    SwingUtilities.updateComponentTreeUI(this);                             
                });
                //System.out.println("Gradianto Dark Fuchsia");  
                //System.out.println("");
                break;   

                case 13:
                SwingUtilities.invokeLater(() -> {
                    FlatGradiantoDeepOceanIJTheme.setup();
                    setSquare_or_Round();
                    FlatLaf.updateUI();
                    SwingUtilities.updateComponentTreeUI(this);                             
                });
                //System.out.println("Gradianto Deep Ocean");  
                //System.out.println("");
                break;   

                case 14:
                SwingUtilities.invokeLater(() -> {
                    FlatGradiantoMidnightBlueIJTheme.setup();
                    setSquare_or_Round();
                    FlatLaf.updateUI();
                    SwingUtilities.updateComponentTreeUI(this);                             
                });
                //System.out.println("Gradianto Midnight Blue");  
                //System.out.println("");
                break;   

                case 15:
                SwingUtilities.invokeLater(() -> {
                    FlatGradiantoNatureGreenIJTheme.setup();
                    setSquare_or_Round();
                    FlatLaf.updateUI();
                    SwingUtilities.updateComponentTreeUI(this);                             
                });
                //System.out.println("Gradianto Nature Green");  
                //System.out.println("");
                break;   

                case 16:
                SwingUtilities.invokeLater(() -> {
                    FlatGruvboxDarkHardIJTheme.setup();
                    setSquare_or_Round();
                    FlatLaf.updateUI();
                    SwingUtilities.updateComponentTreeUI(this);                             
                });
                //System.out.println("Gruvbox Dark Hard"); 
                //System.out.println("");
                break;   

                case 17:
                SwingUtilities.invokeLater(() -> {
                    FlatHiberbeeDarkIJTheme.setup();
                    setSquare_or_Round();
                    FlatLaf.updateUI();
                    SwingUtilities.updateComponentTreeUI(this);                             
                });
                //System.out.println("Hiberbee Dark"); 
                //System.out.println("");                
                break;   

                case 18:
                SwingUtilities.invokeLater(() -> {
                    FlatHighContrastIJTheme.setup();
                    setSquare_or_Round();
                    FlatLaf.updateUI();
                    SwingUtilities.updateComponentTreeUI(this);                             
                });
                //System.out.println("High Contrast");  
                //System.out.println("");
                break;   

                case 19:
                SwingUtilities.invokeLater(() -> {
                    FlatMaterialDesignDarkIJTheme.setup();
                    setSquare_or_Round();
                    FlatLaf.updateUI();
                    SwingUtilities.updateComponentTreeUI(this);                             
                });
                //System.out.println("Material Design Dark"); 
                //System.out.println("");                
                break;   

                case 20:
                SwingUtilities.invokeLater(() -> {
                    FlatMonocaiIJTheme.setup();
                    setSquare_or_Round();
                    FlatLaf.updateUI();
                    SwingUtilities.updateComponentTreeUI(this);                             
                });
                //System.out.println("Monocai");    
                //System.out.println("");
                break;   

                case 21:
                SwingUtilities.invokeLater(() -> {
                    FlatMonokaiProIJTheme.setup();
                    setSquare_or_Round();
                    FlatLaf.updateUI();
                    SwingUtilities.updateComponentTreeUI(this);                             
                });
                //System.out.println("Monokai Pro");     
                //System.out.println("");
                break;   

                case 22:
                SwingUtilities.invokeLater(() -> {
                    FlatNordIJTheme.setup();
                    setSquare_or_Round();
                    FlatLaf.updateUI();
                    SwingUtilities.updateComponentTreeUI(this);                             
                });
                //System.out.println("Nord");        
                //System.out.println("");
                break;   

                case 23:
                SwingUtilities.invokeLater(() -> {
                    FlatOneDarkIJTheme.setup();
                    setSquare_or_Round();
                    FlatLaf.updateUI();
                    SwingUtilities.updateComponentTreeUI(this);                             
                });
                //System.out.println("One Dark");   
                //System.out.println("");
                break;   

                case 24:
                SwingUtilities.invokeLater(() -> {
                    FlatSolarizedDarkIJTheme.setup();
                    setSquare_or_Round();
                    FlatLaf.updateUI();
                    SwingUtilities.updateComponentTreeUI(this);                             
                });
                //System.out.println("Solarized Dark"); 
                //System.out.println("");                
                break;   

                case 25:
                SwingUtilities.invokeLater(() -> {
                    FlatSpacegrayIJTheme.setup();
                    setSquare_or_Round();
                    FlatLaf.updateUI();
                    SwingUtilities.updateComponentTreeUI(this);                             
                });
                //System.out.println("Spacegray"); 
                //System.out.println("");                
                break;   
                
                case 26:
                SwingUtilities.invokeLater(() -> {
                    FlatVuesionIJTheme.setup();
                    setSquare_or_Round();
                    FlatLaf.updateUI();
                    SwingUtilities.updateComponentTreeUI(this);                             
                });
                //System.out.println("Vuesion");  
                //System.out.println("");
                break;   

                case 27:
                SwingUtilities.invokeLater(() -> {
                    FlatXcodeDarkIJTheme.setup();
                    setSquare_or_Round();
                    FlatLaf.updateUI();
                    SwingUtilities.updateComponentTreeUI(this);                             
                });
                //System.out.println("Xcode Dark");  
                //System.out.println("");
                break;   

                case 28:
                //System.out.println("--- Material Theme UI Light ---");
                //System.out.println("");
                break;   
                
                case 29:
                SwingUtilities.invokeLater(() -> {
                    FlatMTArcDarkIJTheme.setup();
                    setSquare_or_Round();
                    FlatLaf.updateUI();
                    SwingUtilities.updateComponentTreeUI(this);                             
                });
                //System.out.println("Arc Dark");  
                //System.out.println("");
                break; 

                case 30:
                SwingUtilities.invokeLater(() -> {
                    FlatMTAtomOneDarkIJTheme.setup();
                    setSquare_or_Round();
                    FlatLaf.updateUI();
                    SwingUtilities.updateComponentTreeUI(this);                             
                });
                //System.out.println("Atom One Dark");  
                //System.out.println("");
                break; 

                case 31:
                SwingUtilities.invokeLater(() -> {
                    FlatMTDraculaIJTheme.setup();
                    setSquare_or_Round();
                    FlatLaf.updateUI();
                    SwingUtilities.updateComponentTreeUI(this);                             
                });
                //System.out.println("Dracula");  
                //System.out.println("");
                break; 

                case 32:
                SwingUtilities.invokeLater(() -> {
                    FlatMTGitHubDarkIJTheme.setup();
                    setSquare_or_Round();
                    FlatLaf.updateUI();
                    SwingUtilities.updateComponentTreeUI(this);                             
                });
                //System.out.println("GitHub Dark");  
                //System.out.println("");
                break; 

                case 33:
                SwingUtilities.invokeLater(() -> {
                    FlatMTMaterialDarkerIJTheme.setup();
                    setSquare_or_Round();
                    FlatLaf.updateUI();
                    SwingUtilities.updateComponentTreeUI(this);                             
                });
                //System.out.println("Material Darker");  
                //System.out.println("");
                break;                  

                case 34:
                SwingUtilities.invokeLater(() -> {
                    FlatMTMaterialDeepOceanIJTheme.setup();
                    setSquare_or_Round();
                    FlatLaf.updateUI();
                    SwingUtilities.updateComponentTreeUI(this);                             
                });
                //System.out.println("Material Deep Ocean");  
                //System.out.println("");
                break;                  

                case 35:
                SwingUtilities.invokeLater(() -> {
                    FlatMTMaterialOceanicIJTheme.setup();
                    setSquare_or_Round();
                    FlatLaf.updateUI();
                    SwingUtilities.updateComponentTreeUI(this);                             
                });
                //System.out.println("Material Oceanic");  
                //System.out.println("");
                break;                   

                case 36:
                SwingUtilities.invokeLater(() -> {
                    FlatMTMaterialOceanicIJTheme.setup();
                    setSquare_or_Round();
                    FlatLaf.updateUI();
                    SwingUtilities.updateComponentTreeUI(this);                             
                });
                //System.out.println("Material Oceanic");  
                //System.out.println("");
                break;                  

                case 37:
                SwingUtilities.invokeLater(() -> {
                    FlatMTMaterialPalenightIJTheme.setup();
                    setSquare_or_Round();
                    FlatLaf.updateUI();
                    SwingUtilities.updateComponentTreeUI(this);                             
                });
                //System.out.println("Material Palenight");  
                //System.out.println("");
                break;                  

                case 38:
                SwingUtilities.invokeLater(() -> {
                    FlatMTMonokaiProIJTheme.setup();
                    setSquare_or_Round();
                    FlatLaf.updateUI();
                    SwingUtilities.updateComponentTreeUI(this);                             
                });
                //System.out.println("Monokai Pro");  
                //System.out.println("");
                break;                  

                case 39:
                SwingUtilities.invokeLater(() -> {
                    FlatMTMoonlightIJTheme.setup();
                    setSquare_or_Round();
                    FlatLaf.updateUI();
                    SwingUtilities.updateComponentTreeUI(this);                             
                });
                //System.out.println("Moonlight");  
                //System.out.println("");
                break;                  

                case 40:
                SwingUtilities.invokeLater(() -> {
                    FlatMTNightOwlIJTheme.setup();
                    setSquare_or_Round();
                    FlatLaf.updateUI();
                    SwingUtilities.updateComponentTreeUI(this);                             
                });   
                //System.out.println("Night Owl");  
                //System.out.println("");
                break;                  
                
                case 41:
                SwingUtilities.invokeLater(() -> {
                    FlatMTSolarizedDarkIJTheme.setup();
                    setSquare_or_Round();
                    FlatLaf.updateUI();
                    SwingUtilities.updateComponentTreeUI(this);                             
                });
                //System.out.println("Solarized Dark");  
                //System.out.println("");
                break;                  

        }
        }           
    
}
    private void setSquare_or_Round(){ 
        
        if (flagRound==false){
            UIManager.put ("Button.arc", 0);
            UIManager.put( "Component.arc", 0 );
            UIManager.put( "ProgressBar.arc", 0 );
            UIManager.put( "TextComponent.arc", 0 );            
        }
        else {
            UIManager.put ("Button.arc", 999);
            UIManager.put( "Component.arc", 999 );
            UIManager.put( "ProgressBar.arc", 999 );
            UIManager.put( "TextComponent.arc", 999 );
        }
    }
 
            
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton jButton_AccentColor_;
    private javax.swing.JButton jButton_Alfa_;
    private javax.swing.JButton jButton_Alfa_Omega_;
    private javax.swing.JButton jButton_Bold_;
    private javax.swing.JButton jButton_Chi_;
    private javax.swing.JButton jButton_Delta_;
    private javax.swing.JButton jButton_Editor_;
    private javax.swing.JButton jButton_Epsilon_;
    private javax.swing.JButton jButton_Exit_;
    private javax.swing.JButton jButton_Font_Decrease_;
    private javax.swing.JButton jButton_Font_Increase_;
    private javax.swing.JButton jButton_Gamma_;
    private javax.swing.JButton jButton_Info_;
    private javax.swing.JButton jButton_Iota_;
    private javax.swing.JButton jButton_Ita_;
    private javax.swing.JButton jButton_Kanones_;
    private javax.swing.JButton jButton_Kappa_;
    private javax.swing.JButton jButton_Keyboard_;
    private javax.swing.JButton jButton_Ksi_;
    private javax.swing.JButton jButton_Lamda_;
    private javax.swing.JButton jButton_Mi_;
    private javax.swing.JButton jButton_Ni_;
    private javax.swing.JButton jButton_Omega_;
    private javax.swing.JButton jButton_Omikron_;
    private javax.swing.JButton jButton_Phi_;
    private javax.swing.JButton jButton_Pi_;
    private javax.swing.JButton jButton_Psi_;
    private javax.swing.JButton jButton_Reload_;
    private javax.swing.JButton jButton_Ro_;
    private javax.swing.JButton jButton_Save_;
    private javax.swing.JButton jButton_Settings_;
    private javax.swing.JButton jButton_Sigma_;
    private javax.swing.JButton jButton_Taf_;
    private javax.swing.JButton jButton_Thita_;
    private javax.swing.JButton jButton_Virtual_Keyboard_;
    private javax.swing.JButton jButton_Vita_;
    private javax.swing.JButton jButton_X_Clear_;
    private javax.swing.JButton jButton_Ypsilon_;
    private javax.swing.JButton jButton_Zita_;
    private javax.swing.JButton jButton_myColorChooser_1_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_SelectedLex_;
    private javax.swing.JLabel jLabel_Total_;
    private javax.swing.JLabel jLabel_searchTxt_;
    private javax.swing.JPanel jPanel_PolytLex_plus_;
    private javax.swing.JProgressBar jProgressBar_LoadTime_;
    private javax.swing.JRadioButton jRadioButton_KD_;
    private javax.swing.JRadioButton jRadioButton_LexikoChristi_;
    private javax.swing.JRadioButton jRadioButton_Logeion_;
    private javax.swing.JRadioButton jRadioButton_Ola_ta_Lexika_;
    private javax.swing.JRadioButton jRadioButton_PD_;
    private javax.swing.JRadioButton jRadioButton_Perseus_;
    private javax.swing.JRadioButton jRadioButton_PolyKeimena_;
    private javax.swing.JScrollPane jScrollPane_PolytLex_plus_plus_;
    private javax.swing.JTextField jTextField_Font_Size_;
    private javax.swing.JTextField jTextField_SelectedLex_;
    private javax.swing.JTextField jTextField_Time_Indication_;
    private javax.swing.JTextField jTextField_Total_;
    private javax.swing.JTextField jTextField_searchTxt_;
    private javax.swing.JTextField jTextField_totalChars_;
    private javax.swing.JList<String> myJList;
    // End of variables declaration//GEN-END:variables
}
