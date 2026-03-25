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

import static PolytLex_plus_FlatLaf.PolytLex_plus_FL.flagTheme;
import static PolytLex_plus_FlatLaf.PolytLex_plus_FL.setIndexTheme;
import static PolytLex_plus_FlatLaf.PolytLex_plus_FL.theAccentColor;
import static PolytLex_plus_FlatLaf.Settings.currentColorSelection;
import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatIntelliJLaf;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.IntelliJTheme;
import com.formdev.flatlaf.intellijthemes.FlatAllIJThemes;
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
import com.mallowigi.idea.themes.MTForestThemeAction;
import java.awt.Color;
import static java.awt.Color.blue;
import static java.awt.Color.green;
import static java.awt.Color.red;
import java.awt.Component;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import java.awt.event.KeyEvent;
import java.util.Collections;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListCellRenderer;
import javax.swing.ImageIcon;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.ColorUIResource;

public class Settings extends javax.swing.JFrame {

    /**
     * Creates new form Settings
     */
    
    
    ImageIcon icon;
    
    DefaultListModel mytheme=new DefaultListModel();
    
    int numR=214;
    int numG=217;
    int numB=223;
    Color mycolor =  new Color(numR, numG, numB); 
    
    int BG_Color_btnR;
    int BG_Color_btnG;
    int BG_Color_btnB;
    Color BG_Color_btn = new Color (BG_Color_btnR, BG_Color_btnG, BG_Color_btnB);
    
    int BG_Color_listR;
    int BG_Color_listG;
    int BG_Color_listB;
    Color BG_Color_list = new Color (BG_Color_listR, BG_Color_listG, BG_Color_listB);
    
    int FG_Color_btnR;
    int FG_Color_btnG;
    int FG_Color_btnB;
    Color FG_Color_btn = new Color (FG_Color_btnR, FG_Color_btnG, FG_Color_btnB);    
    
    int numSCR;
    int numSCG;
    int numSCB;
    Color mySelColor =  new Color(numSCR, numSCG, numSCB); 
     
    int myYellow_NumR=255, myYellow_NumG=225, myYellow_NumB=100;
    Color mySelected_Color =  new Color(myYellow_NumR, myYellow_NumG, myYellow_NumB);
        
    Color selectedColor;
    
    ButtonGroup myBtnGroup = new ButtonGroup();
    int selectedIndex=0;
    int setMyTextSize=20;
    String setMyFont="Arial";
    String selectedFont="Arial";
    int setIndexFont=0;
    String setCurrentTheme="Settings.thm";
    //int setIndexTheme=0;
    int counter=-1;
    int backupIndexTheme=0;
    int i;
    int myflag=0;

    int sizeJList=0;
    Object item;
    String setMyLang="Greek";
    String setMyLangChars="gr" ;
    String pathMyLang="./languages/Greek/settings_gr.lang";
    String myForm="/settings_";
    String Title_ColorPalette;
    String strTheme;
    public static Color backupSelectColor=new Color(127,127,127);
    public static String convertAccentColortoRGB;
    public static Color currentColorSelection;
    String hex;
    
    public static int myChoice=0;
    
    ButtonGroup mySquareRound_Group = new ButtonGroup();
    public static boolean flagRound=false;
    
    public Settings() {
        initComponents();
        JFrame.setDefaultLookAndFeelDecorated(true); //for Title and Icon for Linux
        
        Image small_logo = new ImageIcon(this.getClass().getResource("/PolytLexplus_logo_256x256.png")).getImage();
        this.setIconImage(small_logo);
        
        
       
        setDefaultCloseOperation(Settings.DISPOSE_ON_CLOSE);
    }


    
    class CustomComboBoxRenderer extends DefaultListCellRenderer {
        public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
         JLabel lbl = (JLabel)super.getListCellRendererComponent(list, value, index, isSelected,  cellHasFocus);
         //lbl.setBackground(BG_Color_btn);
         //lbl.setForeground(FG_Color_btn);
         return lbl;
         
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jPanel_Settings = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList_Themes_ = new javax.swing.JList<>();
        jLabel_SelectTheme_ = new javax.swing.JLabel();
        jLabel_SelectFont_ = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList_SystemFonts_ = new javax.swing.JList<>();
        jTextField_John_ = new javax.swing.JTextField();
        jButton_Save_ = new javax.swing.JButton();
        jComboBox_Language_ = new javax.swing.JComboBox<>();
        jLabel_Language_ = new javax.swing.JLabel();
        jLabel_Flag_Lang = new javax.swing.JLabel();
        jButton_Color_Palete_ = new javax.swing.JButton();
        jButton_Color1_ = new javax.swing.JButton();
        jButton_Color2_ = new javax.swing.JButton();
        jButton_Color3_ = new javax.swing.JButton();
        jButton_Color4_ = new javax.swing.JButton();
        jButton_Color5_ = new javax.swing.JButton();
        jButton_Color6_ = new javax.swing.JButton();
        jButton_Color7_ = new javax.swing.JButton();
        jLabel_Accent_Colors_ = new javax.swing.JLabel();
        jButton_Backup_Select_Color_ = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jRadioButton_Square_ = new javax.swing.JRadioButton();
        jRadioButton_Round_ = new javax.swing.JRadioButton();
        jButton_RandomColor_ = new javax.swing.JButton();
        jComboBox_All_Light_Dark_ = new javax.swing.JComboBox<>();
        jLabel_LightDark_ = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ῥυθμίσεις");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel_Settings.setPreferredSize(new java.awt.Dimension(1150, 496));

        jList_Themes_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jList_Themes_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList_Themes_MouseClicked(evt);
            }
        });
        jList_Themes_.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jList_Themes_KeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jList_Themes_);

        jLabel_SelectTheme_.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_SelectTheme_.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_SelectTheme_.setText("Ἐπιλογὴ θέματος");
        jLabel_SelectTheme_.setPreferredSize(new java.awt.Dimension(270, 30));

        jLabel_SelectFont_.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_SelectFont_.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_SelectFont_.setText("Ἐπιλογὴ γραμματοσειρᾶς");
        jLabel_SelectFont_.setPreferredSize(new java.awt.Dimension(270, 30));

        jList_SystemFonts_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jList_SystemFonts_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList_SystemFonts_MouseClicked(evt);
            }
        });
        jList_SystemFonts_.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jList_SystemFonts_KeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(jList_SystemFonts_);

        jTextField_John_.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextField_John_.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_John_.setText("Ἐν ἀρχῇ ἦν ὁ Λόγος");

        jButton_Save_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diskette_save_icon.png"))); // NOI18N
        jButton_Save_.setToolTipText("Ἀποθήκευση θέματος");
        jButton_Save_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Save_ActionPerformed(evt);
            }
        });

        jComboBox_Language_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBox_Language_.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Deutsch", "English", "Español", "Français", "Italiano", "Русский", "Ἑλληνικὰ" }));
        jComboBox_Language_.setToolTipText("Ἐπιλογὴ γλώσσας");
        jComboBox_Language_.setPreferredSize(new java.awt.Dimension(200, 30));
        jComboBox_Language_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_Language_ActionPerformed(evt);
            }
        });

        jLabel_Language_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_Language_.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_Language_.setText("Γλώσσα");
        jLabel_Language_.setPreferredSize(new java.awt.Dimension(100, 40));

        jLabel_Flag_Lang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Flag_Lang.setPreferredSize(new java.awt.Dimension(100, 40));

        jButton_Color_Palete_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/colorchooser_icon.png"))); // NOI18N
        jButton_Color_Palete_.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton_Color_Palete_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Color_Palete_ActionPerformed(evt);
            }
        });

        jButton_Color1_.setBackground(new java.awt.Color(75, 110, 175));
        jButton_Color1_.setPreferredSize(new java.awt.Dimension(20, 20));
        jButton_Color1_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Color1_ActionPerformed(evt);
            }
        });

        jButton_Color2_.setBackground(new java.awt.Color(10, 132, 255));
        jButton_Color2_.setPreferredSize(new java.awt.Dimension(20, 20));
        jButton_Color2_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Color2_ActionPerformed(evt);
            }
        });

        jButton_Color3_.setBackground(new java.awt.Color(191, 90, 242));
        jButton_Color3_.setPreferredSize(new java.awt.Dimension(20, 20));
        jButton_Color3_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Color3_ActionPerformed(evt);
            }
        });

        jButton_Color4_.setBackground(new java.awt.Color(255, 69, 58));
        jButton_Color4_.setPreferredSize(new java.awt.Dimension(20, 20));
        jButton_Color4_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Color4_ActionPerformed(evt);
            }
        });

        jButton_Color5_.setBackground(new java.awt.Color(255, 159, 10));
        jButton_Color5_.setPreferredSize(new java.awt.Dimension(20, 20));
        jButton_Color5_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Color5_ActionPerformed(evt);
            }
        });

        jButton_Color6_.setBackground(new java.awt.Color(255, 204, 0));
        jButton_Color6_.setPreferredSize(new java.awt.Dimension(20, 20));
        jButton_Color6_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Color6_ActionPerformed(evt);
            }
        });

        jButton_Color7_.setBackground(new java.awt.Color(50, 215, 75));
        jButton_Color7_.setPreferredSize(new java.awt.Dimension(20, 20));
        jButton_Color7_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Color7_ActionPerformed(evt);
            }
        });

        jLabel_Accent_Colors_.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_Accent_Colors_.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Accent_Colors_.setText("Χρώματα ἔμφασης ");
        jLabel_Accent_Colors_.setPreferredSize(new java.awt.Dimension(270, 30));

        jButton_Backup_Select_Color_.setBackground(new java.awt.Color(203, 238, 255));
        jButton_Backup_Select_Color_.setPreferredSize(new java.awt.Dimension(212, 20));

        jRadioButton_Square_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton_Square_.setText("Τετράγωνο");
        jRadioButton_Square_.setPreferredSize(new java.awt.Dimension(120, 25));
        jRadioButton_Square_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_Square_ActionPerformed(evt);
            }
        });

        jRadioButton_Round_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton_Round_.setText("Στρογγυλὸ");
        jRadioButton_Round_.setPreferredSize(new java.awt.Dimension(120, 25));
        jRadioButton_Round_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_Round_ActionPerformed(evt);
            }
        });

        jButton_RandomColor_.setBackground(new java.awt.Color(203, 238, 255));
        jButton_RandomColor_.setToolTipText("Τυχαῖο χρῶμα");
        jButton_RandomColor_.setPreferredSize(new java.awt.Dimension(20, 20));
        jButton_RandomColor_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RandomColor_ActionPerformed(evt);
            }
        });

        jComboBox_All_Light_Dark_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBox_All_Light_Dark_.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ὅλα", "Φωτεινὸ", "Σκοτεινὸ" }));
        jComboBox_All_Light_Dark_.setPreferredSize(new java.awt.Dimension(175, 30));
        jComboBox_All_Light_Dark_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_All_Light_Dark_ActionPerformed(evt);
            }
        });

        jLabel_LightDark_.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_LightDark_.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_LightDark_.setText("Φωτεινό/Σκοτεινὸ");
        jLabel_LightDark_.setPreferredSize(new java.awt.Dimension(175, 30));

        javax.swing.GroupLayout jPanel_SettingsLayout = new javax.swing.GroupLayout(jPanel_Settings);
        jPanel_Settings.setLayout(jPanel_SettingsLayout);
        jPanel_SettingsLayout.setHorizontalGroup(
            jPanel_SettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_SettingsLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel_SettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_SettingsLayout.createSequentialGroup()
                        .addGroup(jPanel_SettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel_SelectFont_, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_SettingsLayout.createSequentialGroup()
                        .addComponent(jTextField_John_, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel_SettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jLabel_SelectTheme_, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel_SettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_SettingsLayout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jComboBox_Language_, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_SettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel_SettingsLayout.createSequentialGroup()
                            .addGap(29, 29, 29)
                            .addComponent(jRadioButton_Square_, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jRadioButton_Round_, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel_SettingsLayout.createSequentialGroup()
                            .addGap(64, 64, 64)
                            .addComponent(jLabel_Language_, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel_Flag_Lang, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel_SettingsLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_SettingsLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_SettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jButton_RandomColor_, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_Color_Palete_, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel_SettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel_SettingsLayout.createSequentialGroup()
                                .addComponent(jButton_Color1_, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton_Color2_, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton_Color3_, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton_Color4_, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton_Color5_, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton_Color6_, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton_Color7_, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton_Backup_Select_Color_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel_SettingsLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_SettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_LightDark_, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel_SettingsLayout.createSequentialGroup()
                                .addComponent(jComboBox_All_Light_Dark_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton_Save_, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel_Accent_Colors_, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 20, 20))
        );
        jPanel_SettingsLayout.setVerticalGroup(
            jPanel_SettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_SettingsLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel_SettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_SelectTheme_, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_SelectFont_, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_LightDark_, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_SettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel_SettingsLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField_John_, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_SettingsLayout.createSequentialGroup()
                        .addGroup(jPanel_SettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox_All_Light_Dark_, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_Save_, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel_SettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_SettingsLayout.createSequentialGroup()
                                .addComponent(jLabel_Accent_Colors_, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel_SettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(jButton_Color2_, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton_Color3_, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton_Color4_, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton_Color5_, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton_Color6_, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton_Color7_, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton_Color_Palete_, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton_Color1_, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton_Backup_Select_Color_, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton_RandomColor_, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_SettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton_Square_, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton_Round_, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_SettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_Language_, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_Flag_Lang, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox_Language_, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel_Settings, javax.swing.GroupLayout.PREFERRED_SIZE, 888, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel_Settings, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       
        File fileMyFont = new File("./settings/myfont.set");
        File fileMyLang = new File ("./settings/mylang.set");
        File fileMyTheme = new File ("./settings/mytheme.set");
        File fileMySelColor = new File("./settings/myselcolor.set");
        File fileMySqrRnd = new File("./settings/sqrrnd.set");
        
       
        try {
            
        Scanner sML = new Scanner(fileMyLang);
        setMyLang=(sML.nextLine());
        setMyLangChars=(sML.nextLine());
        pathMyLang="./languages/" + setMyLang + myForm + setMyLangChars +".lang";    
        //System.out.println("Γλώσσα: " + setMyLang + " [" + setMyLangChars + "] " + "\n");
        File fileSetMyLang= new File (pathMyLang);
          
            jComboBox_Language_.setRenderer(new CustomComboBoxRenderer());
            
            Scanner sMF = new Scanner(fileMyFont);
            setMyFont=(sMF.nextLine());
            setIndexFont=(Integer.parseInt(sMF.nextLine()));
            Font myFont = new Font(setMyFont, Font.PLAIN, 20);
            jTextField_John_.setFont(myFont);
           
            //System.out.println("Γραμματοσειρά: " + setMyFont + "\n"  + "Μέγεθος: " + setMyTextSize + "\n");
                        
            //System.out.println(setMyLang); 
            icon = new ImageIcon("./images/" + setMyLang + ".png");
            jLabel_Flag_Lang.setIcon(icon);
            
            
            Scanner spathML = new Scanner(fileSetMyLang);
            
            setMyLang=(spathML.nextLine());
            this.setTitle(setMyLang);
            
            setMyLang=(spathML.nextLine());
            jLabel_SelectFont_.setText(setMyLang);
            
            setMyLang=(spathML.nextLine());
            jLabel_SelectTheme_.setText(setMyLang);
            
            setMyLang=(spathML.nextLine());
            jLabel_LightDark_.setText(setMyLang);
            
            jComboBox_All_Light_Dark_.removeAllItems();
            setMyLang=(spathML.nextLine());
            jComboBox_All_Light_Dark_.addItem(setMyLang);
            setMyLang=(spathML.nextLine());
            jComboBox_All_Light_Dark_.addItem(setMyLang);
            setMyLang=(spathML.nextLine());
            jComboBox_All_Light_Dark_.addItem(setMyLang);
            
            setMyLang=(spathML.nextLine());
            jButton_Save_.setToolTipText(setMyLang);

            setMyLang=(spathML.nextLine());
            jLabel_Accent_Colors_.setText(setMyLang);

            setMyLang=(spathML.nextLine());
            jButton_Color_Palete_.setToolTipText(setMyLang);            
            
            setMyLang=(spathML.nextLine());
            Title_ColorPalette=setMyLang; 
            
            setMyLang=(spathML.nextLine());
            jButton_RandomColor_.setToolTipText(setMyLang);               
            
            setMyLang=(spathML.nextLine());
            jRadioButton_Square_.setText(setMyLang);
            
            setMyLang=(spathML.nextLine());
            jRadioButton_Round_.setText(setMyLang);               
            
            setMyLang=(spathML.nextLine());
            jLabel_Language_.setText(setMyLang);

            setMyLang=(spathML.nextLine());
            jComboBox_Language_.setToolTipText(setMyLang);            
            
            
            Scanner sMTH = new Scanner(fileMyTheme);
            myChoice=(Integer.parseInt(sMTH.nextLine()));
            setIndexTheme=(Integer.parseInt(sMTH.nextLine()));
            strTheme=(sMTH.nextLine());
            theAccentColor=(sMTH.nextLine());
            FlatLaf.setGlobalExtraDefaults( Collections.singletonMap( "@accentColor", theAccentColor ) );
            
            StringBuilder str=new StringBuilder(theAccentColor);
            int pos =0;
            str.deleteCharAt(0);
            convertAccentColortoRGB=str.toString();
            
            //System.out.println();
            //System.out.println(myChoice);
            //System.out.println(theAccentColor);
            //System.out.println(convertAccentColortoRGB);
        
            int resultRed = Integer.valueOf(convertAccentColortoRGB.substring(0, 2), 16);
            int resultGreen = Integer.valueOf(convertAccentColortoRGB.substring(2, 4), 16);
            int resultBlue = Integer.valueOf(convertAccentColortoRGB.substring(4, 6), 16);
        
            //System.out.println(resultRed + " " + resultGreen + " " + resultBlue);
            //System.out.println();
            
            
            backupSelectColor = new Color (resultRed, resultGreen, resultBlue);
            jButton_Backup_Select_Color_.setBackground(backupSelectColor);
            jButton_RandomColor_.setBackground(backupSelectColor);

            
            jComboBox_All_Light_Dark_.setSelectedIndex(myChoice);
            //jComboBox_All_Light_Dark_.updateUI();
        
            if (myChoice == 0) {
                
               // System.out.println("All");
                mytheme.removeAllElements();
                mytheme.addElement("--------- Core Themes ---------");
                mytheme.addElement("FlatLafLight");
                mytheme.addElement("FlatLafDark");
                mytheme.addElement("FlatLaf IntelliJ");
                mytheme.addElement("FlatLaf Darcula");
                mytheme.addElement("FlatLaf macOS Light");
                mytheme.addElement("FlatLaf macOS Dark");
                mytheme.addElement("--------- Intellij Themes -------");
                mytheme.addElement("Arc");
                mytheme.addElement("Arc - Orange");
                mytheme.addElement("Arc Dark");
                mytheme.addElement("Arc Dark - Orange");
                mytheme.addElement("Carbon");
                mytheme.addElement("Cobalt 2");
                mytheme.addElement("Cyan Light");
                mytheme.addElement("Dark Flat");
                mytheme.addElement("Dark Purple");
                mytheme.addElement("Dracula");
                mytheme.addElement("Gradianto Dark Fuchsia");
                mytheme.addElement("Gradianto Deep Ocean");
                mytheme.addElement("Gradianto Midnight Blue");
                mytheme.addElement("Gradianto Nature Green");
                mytheme.addElement("Gray");
                mytheme.addElement("Gruvbox Dark Hard");
                mytheme.addElement("Hiberbee Dark");
                mytheme.addElement("High Contrast");
                mytheme.addElement("Light Flat");
                mytheme.addElement("Material Design Dark");
                mytheme.addElement("Monocai");
                mytheme.addElement("Monokai Pro");
                mytheme.addElement("Nord");
                mytheme.addElement("One Dark");
                mytheme.addElement("Solarized Dark");
                mytheme.addElement("Solarized Light");
                mytheme.addElement("Spacegray");
                mytheme.addElement("Vuesion");
                mytheme.addElement("Xcode Dark");
                mytheme.addElement("--- Material Theme UI Light ---");
                mytheme.addElement("Arc Dark");
                mytheme.addElement("Atom One Dark");
                mytheme.addElement("Atom One Light");
                mytheme.addElement("Dracula");
                mytheme.addElement("GitHub");
                mytheme.addElement("GitHub Dark");
                mytheme.addElement("Light Owl");
                mytheme.addElement("Material Darker");
                mytheme.addElement("Material Deep Ocean");
                mytheme.addElement("Material Lighter");
                mytheme.addElement("Material Oceanic");
                mytheme.addElement("Material Palenight");
                mytheme.addElement("Monokai Pro");
                mytheme.addElement("Moonlight");
                mytheme.addElement("Night Owl");
                mytheme.addElement("Solarized Dark");
                mytheme.addElement("Solarized Light"); 
            
                if ((setIndexTheme >=1) && (setIndexTheme <=6 )){
                    enable_buttons_color ();
                }
                else {
                    disable_buttons_color ();
                }            
            } 
            
            else if (myChoice == 1){
                
               // System.out.println("Light");
                mytheme.removeAllElements();
                mytheme.addElement("--------- Core Themes ---------");
                mytheme.addElement("FlatLafLight");
                mytheme.addElement("FlatLaf IntelliJ");
                mytheme.addElement("FlatLaf macOS Light");        
                mytheme.addElement("--------- Intellij Themes -------");
                mytheme.addElement("Arc");
                mytheme.addElement("Arc - Orange");     
                mytheme.addElement("Cyan Light");
                mytheme.addElement("Gray");
                mytheme.addElement("Light Flat");   
                mytheme.addElement("Solarized Light");  
                mytheme.addElement("--- Material Theme UI Light ---");
                mytheme.addElement("Atom One Light");
                mytheme.addElement("GitHub"); 
                mytheme.addElement("Light Owl");        
                mytheme.addElement("Material Lighter"); 
                mytheme.addElement("Solarized Light");  

                if ((setIndexTheme >=1) && (setIndexTheme <=3 )){
                    enable_buttons_color ();
                }
                else {
                    disable_buttons_color ();
                }  
            }
            
            else if (myChoice == 2){
                
                //System.out.println("Dark");
                mytheme.removeAllElements();
                mytheme.addElement("--------- Core Themes ---------");
                mytheme.addElement("FlatLafDark");
                mytheme.addElement("FlatLaf Darcula");
                mytheme.addElement("FlatLaf macOS Dark");
                mytheme.addElement("--------- Intellij Themes -------");
                mytheme.addElement("Arc Dark");
                mytheme.addElement("Arc Dark - Orange");
                mytheme.addElement("Carbon");
                mytheme.addElement("Cobalt 2");
                mytheme.addElement("Dark Flat");
                mytheme.addElement("Dark Purple");
                mytheme.addElement("Dracula");
                mytheme.addElement("Gradianto Dark Fuchsia");
                mytheme.addElement("Gradianto Deep Ocean");
                mytheme.addElement("Gradianto Midnight Blue");
                mytheme.addElement("Gradianto Nature Green");
                mytheme.addElement("Gruvbox Dark Hard");
                mytheme.addElement("Hiberbee Dark");
                mytheme.addElement("High Contrast");
                mytheme.addElement("Material Design Dark");
                mytheme.addElement("Monocai");
                mytheme.addElement("Monokai Pro");
                mytheme.addElement("Nord");
                mytheme.addElement("One Dark");
                mytheme.addElement("Solarized Dark");
                mytheme.addElement("Spacegray");
                mytheme.addElement("Vuesion");
                mytheme.addElement("Xcode Dark");
                mytheme.addElement("--- Material Theme UI Light ---");
                mytheme.addElement("Arc Dark");
                mytheme.addElement("Atom One Dark");
                mytheme.addElement("Dracula");
                mytheme.addElement("GitHub Dark");
                mytheme.addElement("Material Darker");
                mytheme.addElement("Material Deep Ocean");
                mytheme.addElement("Material Oceanic");
                mytheme.addElement("Material Palenight");
                mytheme.addElement("Monokai Pro");
                mytheme.addElement("Moonlight");
                mytheme.addElement("Night Owl");
                mytheme.addElement("Solarized Dark");
            
                if ((setIndexTheme >=1) && (setIndexTheme <=3 )){
                    enable_buttons_color ();
                }
                else {
                    disable_buttons_color ();
                }  
            }
             
            jList_Themes_.setModel(mytheme);            
            
            sizeJList=mytheme.getSize();
            //System.out.println("\n" + "Τὸ σύνολο τῶν θεμάτων εἶναι: " + String.format("%,d",sizeJList-3));
            jList_Themes_.setSelectedIndex(setIndexTheme);
            jList_Themes_.ensureIndexIsVisible(setIndexTheme);
            //System.out.println("Το θέμα " + strTheme + " βρίσκεται στη θέση " + setIndexTheme + "." + "\n"  + "\n");             

          }
        
        catch (FileNotFoundException ex) {
            
        }
        
            mySquareRound_Group.add(jRadioButton_Square_);
            mySquareRound_Group.add(jRadioButton_Round_);
            
            if (flagRound==false){
                jRadioButton_Square_.setSelected(true);        
            }
            else{
                jRadioButton_Round_.setSelected(true);        
            }
            
            
        
        DefaultListModel myfonts=new DefaultListModel();
        //System.out.println("Γιὰ νὰ γνωρίζετε τὰ διαθέσιμα ὀνόματα οἰκογενειῶν γραμματοσειρῶν"); 
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment(); 
  
        //System.out.println("Ἐμφάνιση τῶν ὀνομάτων οἰκογενειῶν γραμματοσειρῶν \n"); 
  
        // Array of all the fonts available in AWT 
        String fonts[] = ge.getAvailableFontFamilyNames(); 

        for (String i : fonts) {
              myfonts.addElement(i);
              //System.out.println(i + " "); 
              jList_SystemFonts_.setModel(myfonts);
             
        }
        
        sizeJList=myfonts.getSize();
        //System.out.println("\n" + "Τὸ σύνολο τῶν γραμματοσειρῶν εἶναι: " + String.format("%,d",sizeJList));
        //System.out.println("\n"); 
        jList_SystemFonts_.setSelectedIndex(setIndexFont);
        jList_SystemFonts_.ensureIndexIsVisible(setIndexFont);
        //System.out.println("Η Γραμματοσειρά " + setMyFont + " βρίσκεται στη θέση " + setIndexFont + "." + "\n"  + "\n"); 

       
    }//GEN-LAST:event_formWindowOpened

    private void jButton_Save_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Save_ActionPerformed
                    
        try {    

            Saved_Theme JSaved_Theme= new Saved_Theme();
            JSaved_Theme.show();
 
          
               FileWriter fwMyTheme = new FileWriter("./settings/mytheme.set");
                    setIndexTheme = jList_Themes_.getSelectedIndex();
                    setCurrentTheme = jList_Themes_.getSelectedValue();
                    //System.out.println(setIndexTheme + " " + setCurrentTheme);
                    //System.out.println("");
                    //System.out.println("");
                    
                    fwMyTheme.write(myChoice + "\n");
                    fwMyTheme.write(setIndexTheme + "\n");
                    fwMyTheme.write(setCurrentTheme + "\n");
                    //fwMyTheme.write(theAccentColor + "\n");
                    //fwMyTheme.write(currentColorSelection + "\n");
                    fwMyTheme.write(hex + "\n");
                    fwMyTheme.close();
 
            
        }
        catch (IOException e)
        {
        e.printStackTrace();
        }   
    
        flagTheme=true;

    }//GEN-LAST:event_jButton_Save_ActionPerformed

    private void jList_SystemFonts_KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jList_SystemFonts_KeyReleased

        if  ( evt.getKeyCode()==KeyEvent.VK_DOWN || evt.getKeyCode()==KeyEvent.VK_UP )  {
            JList target=(JList)evt.getSource();
            selectedIndex =jList_SystemFonts_.getSelectedIndex();

            for (int i = 0; i <= selectedIndex; i++) {
                Object item = target.getModel().getElementAt(selectedIndex);
      
                selectedFont=item.toString();
                Font myFont = new Font(selectedFont, Font.PLAIN, 20);
                jTextField_John_.setFont(myFont);
                setIndexFont = jList_SystemFonts_.getSelectedIndex();
            
                try {
                    FileWriter fwMyFont = new FileWriter("./settings/myfont.set");
                    fwMyFont.write(selectedFont + "\n");
                    fwMyFont.write(setIndexFont + "\n");
                    fwMyFont.close();
                }
                

                catch (IOException e) {
                    e.printStackTrace();
                }

            }
            
            //System.out.println("\n");
            //System.out.println(selectedFont);
            //System.out.println(setIndexFont);
        }

    }//GEN-LAST:event_jList_SystemFonts_KeyReleased

    private void jList_SystemFonts_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList_SystemFonts_MouseClicked

        if  (evt.getClickCount()==1){
            JList target=(JList)evt.getSource();
            int index =target.locationToIndex(evt.getPoint());

            if (index>=0) {
                Object item = target.getModel().getElementAt(index);
                
                selectedFont=item.toString();
                Font myFont = new Font(selectedFont, Font.PLAIN, 20);
                jTextField_John_.setFont(myFont);
                setIndexFont = jList_SystemFonts_.getSelectedIndex();
                
                try {
                    FileWriter fwMyFont = new FileWriter("./settings/myfont.set");
                    fwMyFont.write(selectedFont + "\n");
                    fwMyFont.write(setIndexFont + "\n");
                    fwMyFont.close();
                }

                catch (IOException e) {
                    e.printStackTrace();
                }
              
            }
                //System.out.println("\n");
                //System.out.println(selectedFont);
                //System.out.println(setIndexFont);
            
        }

    }//GEN-LAST:event_jList_SystemFonts_MouseClicked

    private void jList_Themes_KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jList_Themes_KeyReleased

        if ( evt.getKeyCode()==KeyEvent.VK_DOWN || evt.getKeyCode()==KeyEvent.VK_UP )  {
            JList target=(JList)evt.getSource();
            selectedIndex =jList_Themes_.getSelectedIndex();
            setIndexTheme=selectedIndex;
            //System.out.println(setIndexTheme);
            
            if (myChoice == 0) {
                if ((setIndexTheme >=1) && (setIndexTheme <=6 )){
                    enable_buttons_color ();
                }
                else {
                    disable_buttons_color ();
                }            
            } 
            
            else if (myChoice == 1){
                if ((setIndexTheme >=1) && (setIndexTheme <=3 )){
                    enable_buttons_color ();
                }
                else {
                    disable_buttons_color ();
                }  
            }
            
            else if (myChoice == 2){
                if ((setIndexTheme >=1) && (setIndexTheme <=3 )){
                    enable_buttons_color ();
                }
                else {
                    disable_buttons_color ();
                }  
            }
            
            MyThread1 mt1 = new MyThread1("Ἡ ἐφαρμογὴ θέματος");
            //System.out.println("");
            do {
                try {
                Thread.sleep(100);
                }
                catch (InterruptedException exc) {
                    //System.out.println("Το νήμα 1 διακόπηκε.");
                }        
            }   while (mt1.thrd1.isAlive());
            
            
            MyThread2 mt2 = new MyThread2("Ἡ καθυστέρηση");
            
        }   
    }//GEN-LAST:event_jList_Themes_KeyReleased

    private void jList_Themes_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList_Themes_MouseClicked

        if (evt.getClickCount()==1){
            JList target=(JList)evt.getSource();
            int index =target.locationToIndex(evt.getPoint());

            if (index>=0) {
                item = target.getModel().getElementAt(index);
            }    
            selectedIndex = jList_Themes_.getSelectedIndex();
            setIndexTheme=selectedIndex;
            //System.out.println(setIndexTheme);
            
            if (myChoice == 0) {
                if ((setIndexTheme >=1) && (setIndexTheme <=6 )){
                    enable_buttons_color ();
                }
                else {
                    disable_buttons_color ();
                }            
            } 
            
            else if (myChoice == 1){
                if ((setIndexTheme >=1) && (setIndexTheme <=3 )){
                    enable_buttons_color ();
                }
                else {
                    disable_buttons_color ();
                }  
            }
            
            else if (myChoice == 2){
                if ((setIndexTheme >=1) && (setIndexTheme <=3 )){
                    enable_buttons_color ();
                }
                else {
                    disable_buttons_color ();
                }  
            }
            
            MyThread1 mt1 = new MyThread1("Ἡ ἐφαρμογὴ θέματος");
            //System.out.println("");
            do {
                try {
                Thread.sleep(100);
                }
                catch (InterruptedException exc) {
                    //System.out.println("Το νήμα 1 διακόπηκε.");
                }        
            }   while (mt1.thrd1.isAlive());
            
            
            MyThread2 mt2 = new MyThread2("Ἡ καθυστέρηση");
            
        }

    }//GEN-LAST:event_jList_Themes_MouseClicked

    private void jComboBox_Language_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_Language_ActionPerformed
        
        String lang=(String)jComboBox_Language_.getSelectedItem();
        
        if (lang == "Deutsch")
        {   
            setMyLang="German";
            setMyLangChars="ger";
            icon = new ImageIcon("./images/" + setMyLang + ".png");
            jLabel_Flag_Lang.setIcon(icon);
           
        }
        
        if (lang == "English")
        {
            setMyLang="English";
            setMyLangChars="en";
            icon = new ImageIcon("./images/" + setMyLang + ".png");
            jLabel_Flag_Lang.setIcon(icon);
            
        }
            
        if (lang == "Español")
        {   
            setMyLang="Spanish";
            setMyLangChars="sp";
            icon = new ImageIcon("./images/" + setMyLang + ".png");
            jLabel_Flag_Lang.setIcon(icon);
           
        }
                
        if (lang == "Français")
        {   
            setMyLang="French";
            setMyLangChars="fr";
            icon = new ImageIcon("./images/" + setMyLang + ".png");
            jLabel_Flag_Lang.setIcon(icon);
           
        }        
        
        if (lang == "Italiano")
        {   
            setMyLang="Italian";
            setMyLangChars="it";
            icon = new ImageIcon("./images/" + setMyLang + ".png");
            jLabel_Flag_Lang.setIcon(icon);
          
        }

         if (lang == "Русский")
        {   
            setMyLang="Russian";
            setMyLangChars="ru";
            icon = new ImageIcon("./images/" + setMyLang + ".png");
            jLabel_Flag_Lang.setIcon(icon);
           
        }
   
        if (lang == "Ἑλληνικὰ")
        {
            setMyLang="Greek";
            setMyLangChars="gr";
            icon = new ImageIcon("./images/" + setMyLang + ".png");
            jLabel_Flag_Lang.setIcon(icon);
           
        }  
            
        
                       
        try {
            FileWriter fwMyLang = new FileWriter("./settings/mylang.set");
            fwMyLang.write(setMyLang + "\n");
            fwMyLang.write(setMyLangChars + "\n");
            fwMyLang.close();

            }    
            
        catch (IOException e) {
                    e.printStackTrace();
            }
                
    }//GEN-LAST:event_jComboBox_Language_ActionPerformed

    private void jButton_Color2_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Color2_ActionPerformed
        
        FlatLaf.setGlobalExtraDefaults( Collections.singletonMap( "@accentColor", "#0a84ff" ) );
        theAccentColor="#0a84ff";
        convertAccentColortoRGB="0a84ff";
        int resultRed = Integer.valueOf(convertAccentColortoRGB.substring(0, 2), 16);
        int resultGreen = Integer.valueOf(convertAccentColortoRGB.substring(2, 4), 16);
        int resultBlue = Integer.valueOf(convertAccentColortoRGB.substring(4, 6), 16);
        //System.out.println(resultRed + " " + resultGreen + " " + resultBlue);
        //System.out.println(theAccentColor);
        
        backupSelectColor = new Color (resultRed, resultGreen, resultBlue);
        jButton_Backup_Select_Color_.setBackground(backupSelectColor);  
        hex=theAccentColor;
        setTheTheme();
        
    }//GEN-LAST:event_jButton_Color2_ActionPerformed

    private void jButton_Color_Palete_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Color_Palete_ActionPerformed

        selectedColor=JColorChooser.showDialog(null, Title_ColorPalette, mySelected_Color);
        
        int myDefaultR, myDefaultG, myDefaultB;
        myDefaultR=214;
        myDefaultG=217;
        myDefaultB=223;
        Color myDefaultColor = new Color (myDefaultR, myDefaultG, myDefaultB);
        
        if (selectedColor==null){
            selectedColor=myDefaultColor;
        }
        
        mySelected_Color=selectedColor;
      
        
        int numberR=mySelected_Color.getRed();
        int numberG=mySelected_Color.getGreen();
        int numberB=mySelected_Color.getBlue();

        theAccentColor=String.format("#%02x%02x%02x", numberR, numberG, numberB);
        //System.out.println(theAccentColor);
        
        backupSelectColor = new Color (numberR, numberG, numberB);
        jButton_Backup_Select_Color_.setBackground(backupSelectColor);
        
        FlatLaf.setGlobalExtraDefaults( Collections.singletonMap( "@accentColor", theAccentColor ) );
        hex=theAccentColor;
        setTheTheme();

        
    }//GEN-LAST:event_jButton_Color_Palete_ActionPerformed

    private void jButton_Color1_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Color1_ActionPerformed
    
        FlatLaf.setGlobalExtraDefaults( Collections.singletonMap( "@accentColor", "#4b6eaf" ) );
        theAccentColor="#4b6eaf";
        convertAccentColortoRGB="4b6eaf";
        int resultRed = Integer.valueOf(convertAccentColortoRGB.substring(0, 2), 16);
        int resultGreen = Integer.valueOf(convertAccentColortoRGB.substring(2, 4), 16);
        int resultBlue = Integer.valueOf(convertAccentColortoRGB.substring(4, 6), 16);
        //System.out.println(resultRed + " " + resultGreen + " " + resultBlue);
        //System.out.println(theAccentColor);
        
        backupSelectColor = new Color (resultRed, resultGreen, resultBlue);
        jButton_Backup_Select_Color_.setBackground(backupSelectColor);
        hex=theAccentColor;
        setTheTheme();
        
    }//GEN-LAST:event_jButton_Color1_ActionPerformed

    private void jButton_Color3_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Color3_ActionPerformed
        
        FlatLaf.setGlobalExtraDefaults( Collections.singletonMap( "@accentColor", "#bf5af2" ) );
        theAccentColor="#bf5af2";
        convertAccentColortoRGB="bf5af2";
        int resultRed = Integer.valueOf(convertAccentColortoRGB.substring(0, 2), 16);
        int resultGreen = Integer.valueOf(convertAccentColortoRGB.substring(2, 4), 16);
        int resultBlue = Integer.valueOf(convertAccentColortoRGB.substring(4, 6), 16);
        //System.out.println(resultRed + " " + resultGreen + " " + resultBlue);
        //System.out.println(theAccentColor);
        
        backupSelectColor = new Color (resultRed, resultGreen, resultBlue);
        jButton_Backup_Select_Color_.setBackground(backupSelectColor);
        hex=theAccentColor;
        setTheTheme();
                
    }//GEN-LAST:event_jButton_Color3_ActionPerformed

    private void jButton_Color4_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Color4_ActionPerformed
        
        FlatLaf.setGlobalExtraDefaults( Collections.singletonMap( "@accentColor", "#ff453a" ) );
        theAccentColor="#ff453a";
        convertAccentColortoRGB="ff453a";
        int resultRed = Integer.valueOf(convertAccentColortoRGB.substring(0, 2), 16);
        int resultGreen = Integer.valueOf(convertAccentColortoRGB.substring(2, 4), 16);
        int resultBlue = Integer.valueOf(convertAccentColortoRGB.substring(4, 6), 16);
        //System.out.println(resultRed + " " + resultGreen + " " + resultBlue);
        //System.out.println(theAccentColor);
        
        backupSelectColor = new Color (resultRed, resultGreen, resultBlue);
        jButton_Backup_Select_Color_.setBackground(backupSelectColor);   
        hex=theAccentColor;
        setTheTheme();
                
    }//GEN-LAST:event_jButton_Color4_ActionPerformed

    private void jButton_Color5_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Color5_ActionPerformed
        
        FlatLaf.setGlobalExtraDefaults( Collections.singletonMap( "@accentColor", "#ff9f0a" ) );
        theAccentColor="#ff9f0a";
        convertAccentColortoRGB="ff9f0a";
        int resultRed = Integer.valueOf(convertAccentColortoRGB.substring(0, 2), 16);
        int resultGreen = Integer.valueOf(convertAccentColortoRGB.substring(2, 4), 16);
        int resultBlue = Integer.valueOf(convertAccentColortoRGB.substring(4, 6), 16);
        //System.out.println(resultRed + " " + resultGreen + " " + resultBlue);
        //System.out.println(theAccentColor);
        
        backupSelectColor = new Color (resultRed, resultGreen, resultBlue);
        jButton_Backup_Select_Color_.setBackground(backupSelectColor);  
        hex=theAccentColor;
        setTheTheme();
                
    }//GEN-LAST:event_jButton_Color5_ActionPerformed

    private void jButton_Color6_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Color6_ActionPerformed
       
        FlatLaf.setGlobalExtraDefaults( Collections.singletonMap( "@accentColor", "#ffcc00" ) );
        theAccentColor="#ffcc00";
        convertAccentColortoRGB="ffcc00";
        int resultRed = Integer.valueOf(convertAccentColortoRGB.substring(0, 2), 16);
        int resultGreen = Integer.valueOf(convertAccentColortoRGB.substring(2, 4), 16);
        int resultBlue = Integer.valueOf(convertAccentColortoRGB.substring(4, 6), 16);
        //System.out.println(resultRed + " " + resultGreen + " " + resultBlue);
        //System.out.println(theAccentColor);
        
        backupSelectColor = new Color (resultRed, resultGreen, resultBlue);
        jButton_Backup_Select_Color_.setBackground(backupSelectColor);        
        hex=theAccentColor;
        setTheTheme();
                
    }//GEN-LAST:event_jButton_Color6_ActionPerformed

    private void jButton_Color7_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Color7_ActionPerformed
        
        FlatLaf.setGlobalExtraDefaults( Collections.singletonMap( "@accentColor", "#32d74b" ) );
        theAccentColor="#32d74b";
        convertAccentColortoRGB="32d74b";
        int resultRed = Integer.valueOf(convertAccentColortoRGB.substring(0, 2), 16);
        int resultGreen = Integer.valueOf(convertAccentColortoRGB.substring(2, 4), 16);
        int resultBlue = Integer.valueOf(convertAccentColortoRGB.substring(4, 6), 16);
        //System.out.println(resultRed + " " + resultGreen + " " + resultBlue);
        //System.out.println(theAccentColor);
        
        backupSelectColor = new Color (resultRed, resultGreen, resultBlue);
        jButton_Backup_Select_Color_.setBackground(backupSelectColor);        
        hex=theAccentColor;
        setTheTheme();
        
        try (FileWriter fwMySqrRnd = new FileWriter("./settings/sqrrnd.set")) {
            setIndexTheme = jList_Themes_.getSelectedIndex();
            setCurrentTheme = jList_Themes_.getSelectedValue();
            //System.out.println("Τετράγωνο ἢ στρογγυλὸ;");
            //System.out.println(flagRound);
            //System.out.println("");
            
            fwMySqrRnd.write(flagRound + "\n");
        } catch (IOException ex) {
            Logger.getLogger(Settings.class.getName()).log(Level.SEVERE, null, ex);
        }
                
    }//GEN-LAST:event_jButton_Color7_ActionPerformed

    private void jRadioButton_Square_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_Square_ActionPerformed

        flagRound=false;
        setTheTheme();
        
        try (FileWriter fwMySqrRnd = new FileWriter("./settings/sqrrnd.set")) {
            setIndexTheme = jList_Themes_.getSelectedIndex();
            setCurrentTheme = jList_Themes_.getSelectedValue();
            //System.out.println("Τετράγωνο ἢ στρογγυλὸ;");
            //System.out.println(flagRound);
            //System.out.println("");
            
            fwMySqrRnd.write(flagRound + "\n");
        } catch (IOException ex) {
            Logger.getLogger(Settings.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jRadioButton_Square_ActionPerformed

    private void jRadioButton_Round_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_Round_ActionPerformed
        
        flagRound=true;
        setTheTheme();
        
        try (FileWriter fwMySqrRnd = new FileWriter("./settings/sqrrnd.set")) {
            setIndexTheme = jList_Themes_.getSelectedIndex();
            setCurrentTheme = jList_Themes_.getSelectedValue();
            //System.out.println("Τετράγωνο ἢ στρογγυλὸ;");
            //System.out.println(flagRound);
            //System.out.println("");
            
            fwMySqrRnd.write(flagRound + "\n");
        } catch (IOException ex) {
            Logger.getLogger(Settings.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jRadioButton_Round_ActionPerformed

    private void jButton_RandomColor_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RandomColor_ActionPerformed
        
        Random rand = new Random();

        int rand_int1 = rand.nextInt(256);
        int rand_int2 = rand.nextInt(256);
        int rand_int3 = rand.nextInt(256);
        
        numR=rand_int1;
        numG=rand_int2;
        numB=rand_int3;
        Color myRandomColor = new Color (numR, numG, numB);
        jButton_RandomColor_.setBackground(myRandomColor);
        jButton_Backup_Select_Color_.setBackground(myRandomColor);
        
        theAccentColor=String.format("#%02x%02x%02x", numR, numG, numB);
        //System.out.println(theAccentColor);
        
        backupSelectColor = new Color (numR, numG, numB);
        jButton_Backup_Select_Color_.setBackground(backupSelectColor);
        
        FlatLaf.setGlobalExtraDefaults( Collections.singletonMap( "@accentColor", theAccentColor ) );
        hex=theAccentColor;
        setTheTheme();
        
    }//GEN-LAST:event_jButton_RandomColor_ActionPerformed

    private void jComboBox_All_Light_Dark_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_All_Light_Dark_ActionPerformed
        
        myChoice=jComboBox_All_Light_Dark_.getSelectedIndex();
        //System.out.println(myChoice);
        
        if (myChoice == 0)
        {   
            //System.out.println("All");
            mytheme.removeAllElements();
            mytheme.addElement("--------- Core Themes ---------");
            mytheme.addElement("FlatLafLight");
            mytheme.addElement("FlatLafDark");
            mytheme.addElement("FlatLaf IntelliJ");
            mytheme.addElement("FlatLaf Darcula");
            mytheme.addElement("FlatLaf macOS Light");
            mytheme.addElement("FlatLaf macOS Dark");
            mytheme.addElement("--------- Intellij Themes -------");
            mytheme.addElement("Arc");
            mytheme.addElement("Arc - Orange");
            mytheme.addElement("Arc Dark");
            mytheme.addElement("Arc Dark - Orange");
            mytheme.addElement("Carbon");
            mytheme.addElement("Cobalt 2");
            mytheme.addElement("Cyan Light");
            mytheme.addElement("Dark Flat");
            mytheme.addElement("Dark Purple");
            mytheme.addElement("Dracula");
            mytheme.addElement("Gradianto Dark Fuchsia");
            mytheme.addElement("Gradianto Deep Ocean");
            mytheme.addElement("Gradianto Midnight Blue");
            mytheme.addElement("Gradianto Nature Green");
            mytheme.addElement("Gray");
            mytheme.addElement("Gruvbox Dark Hard");
            mytheme.addElement("Hiberbee Dark");
            mytheme.addElement("High Contrast");
            mytheme.addElement("Light Flat");
            mytheme.addElement("Material Design Dark");
            mytheme.addElement("Monocai");
            mytheme.addElement("Monokai Pro");
            mytheme.addElement("Nord");
            mytheme.addElement("One Dark");
            mytheme.addElement("Solarized Dark");
            mytheme.addElement("Solarized Light");
            mytheme.addElement("Spacegray");
            mytheme.addElement("Vuesion");
            mytheme.addElement("Xcode Dark");
            mytheme.addElement("--- Material Theme UI Light ---");
            mytheme.addElement("Arc Dark");
            mytheme.addElement("Atom One Dark");
            mytheme.addElement("Atom One Light");
            mytheme.addElement("Dracula");
            mytheme.addElement("GitHub");
            mytheme.addElement("GitHub Dark");
            mytheme.addElement("Light Owl");
            mytheme.addElement("Material Darker");
            mytheme.addElement("Material Deep Ocean");
            mytheme.addElement("Material Lighter");
            mytheme.addElement("Material Oceanic");
            mytheme.addElement("Material Palenight");
            mytheme.addElement("Monokai Pro");
            mytheme.addElement("Moonlight");
            mytheme.addElement("Night Owl");
            mytheme.addElement("Solarized Dark");
            mytheme.addElement("Solarized Light");            
            
           
        }
        
        if (myChoice == 1)
        {   
            //System.out.println("Light");
            mytheme.removeAllElements();
            mytheme.addElement("--------- Core Themes ---------");
            mytheme.addElement("FlatLafLight");
            mytheme.addElement("FlatLaf IntelliJ");
            mytheme.addElement("FlatLaf macOS Light");        
            mytheme.addElement("--------- Intellij Themes -------");
            mytheme.addElement("Arc");
            mytheme.addElement("Arc - Orange");     
            mytheme.addElement("Cyan Light");
            mytheme.addElement("Gray");
            mytheme.addElement("Light Flat");   
            mytheme.addElement("Solarized Light");  
            mytheme.addElement("--- Material Theme UI Light ---");
            mytheme.addElement("Atom One Light");
            mytheme.addElement("GitHub"); 
            mytheme.addElement("Light Owl");        
            mytheme.addElement("Material Lighter"); 
            mytheme.addElement("Solarized Light");  
           
        }   
        
        if (myChoice == 2)
        {   
            //System.out.println("Dark");
            mytheme.removeAllElements();
            mytheme.addElement("--------- Core Themes ---------");
            mytheme.addElement("FlatLafDark");
            mytheme.addElement("FlatLaf Darcula");
            mytheme.addElement("FlatLaf macOS Dark");
            mytheme.addElement("--------- Intellij Themes -------");
            mytheme.addElement("Arc Dark");
            mytheme.addElement("Arc Dark - Orange");
            mytheme.addElement("Carbon");
            mytheme.addElement("Cobalt 2");
            mytheme.addElement("Dark Flat");
            mytheme.addElement("Dark Purple");
            mytheme.addElement("Dracula");
            mytheme.addElement("Gradianto Dark Fuchsia");
            mytheme.addElement("Gradianto Deep Ocean");
            mytheme.addElement("Gradianto Midnight Blue");
            mytheme.addElement("Gradianto Nature Green");
            mytheme.addElement("Gruvbox Dark Hard");
            mytheme.addElement("Hiberbee Dark");
            mytheme.addElement("High Contrast");
            mytheme.addElement("Material Design Dark");
            mytheme.addElement("Monocai");
            mytheme.addElement("Monokai Pro");
            mytheme.addElement("Nord");
            mytheme.addElement("One Dark");
            mytheme.addElement("Solarized Dark");
            mytheme.addElement("Spacegray");
            mytheme.addElement("Vuesion");
            mytheme.addElement("Xcode Dark");
            mytheme.addElement("--- Material Theme UI Light ---");
            mytheme.addElement("Arc Dark");
            mytheme.addElement("Atom One Dark");
            mytheme.addElement("Dracula");
            mytheme.addElement("GitHub Dark");
            mytheme.addElement("Material Darker");
            mytheme.addElement("Material Deep Ocean");
            mytheme.addElement("Material Oceanic");
            mytheme.addElement("Material Palenight");
            mytheme.addElement("Monokai Pro");
            mytheme.addElement("Moonlight");
            mytheme.addElement("Night Owl");
            mytheme.addElement("Solarized Dark");
        }        
                
    }//GEN-LAST:event_jComboBox_All_Light_Dark_ActionPerformed
  
    /**
     * @param args the command line arguments
     */
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Settings().setVisible(true);
            }
          } 
        );
    }

    private void enable_buttons_color (){
        
        jLabel_Accent_Colors_.setVisible(true);
        jButton_Color_Palete_.setVisible(true);
        jButton_Color1_.setVisible(true);
        jButton_Color2_.setVisible(true);
        jButton_Color3_.setVisible(true);
        jButton_Color4_.setVisible(true);
        jButton_Color5_.setVisible(true);
        jButton_Color6_.setVisible(true);
        jButton_Color7_.setVisible(true);
        jButton_Backup_Select_Color_.setVisible(true);
        jButton_RandomColor_.setVisible(true);
     
    }
    
    private void disable_buttons_color (){
        
        jLabel_Accent_Colors_.setVisible(false);
        jButton_Color_Palete_.setVisible(false);
        jButton_Color1_.setVisible(false);
        jButton_Color2_.setVisible(false);
        jButton_Color3_.setVisible(false);
        jButton_Color4_.setVisible(false);
        jButton_Color5_.setVisible(false);
        jButton_Color6_.setVisible(false);
        jButton_Color7_.setVisible(false);
        jButton_Backup_Select_Color_.setVisible(false);
        jButton_RandomColor_.setVisible(false);
        
    }
    

    
    class MyThread1 implements Runnable {
        Thread thrd1;
        
        MyThread1( String name) {
            thrd1=new Thread(this, name);
            thrd1.start();
        }
        @Override
        public void run() {
            //System.out.println(thrd1.getName() + " ξεκίνησε.");
            //System.out.println(" ");
            setTheTheme();
            //System.out.println(thrd1.getName() + " τερματίστηκε.");
            //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        }
            
            
    class MyThread2 implements Runnable {
        Thread thrd2;
        
        MyThread2( String name) {
            thrd2=new Thread(this, name);
            thrd2.start();
         }
        @Override
        public void run() {
            //System.out.println("");
            //System.out.println(thrd2.getName() + " ξεκίνησε.");
            
            try {
                Thread.sleep(1500);
            }
            catch (InterruptedException exc) {
                    //System.out.println(thrd2.getName() + " διακόπηκε.");
            }        
            
            currentColorSelection = jList_Themes_.getSelectionBackground();
            hex = "#"+Integer.toHexString(currentColorSelection.getRGB()).substring(2);
            //System.out.println(" ");
            //System.out.println("currentColorSelection: " + currentColorSelection + " ---> " + " hex: " + hex);
            //System.out.println(" ");
            //System.out.println(thrd2.getName() + " τερματίστηκε.");
            //System.out.println("");
            //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        }
    
    private void setTheTheme_fast (){  
    
        FlatLaf.updateUI();
      
    }    
    public void setTheTheme (){ 

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
    private javax.swing.JButton jButton_Backup_Select_Color_;
    private javax.swing.JButton jButton_Color1_;
    private javax.swing.JButton jButton_Color2_;
    private javax.swing.JButton jButton_Color3_;
    private javax.swing.JButton jButton_Color4_;
    private javax.swing.JButton jButton_Color5_;
    private javax.swing.JButton jButton_Color6_;
    private javax.swing.JButton jButton_Color7_;
    private javax.swing.JButton jButton_Color_Palete_;
    private javax.swing.JButton jButton_RandomColor_;
    private javax.swing.JButton jButton_Save_;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox_All_Light_Dark_;
    private javax.swing.JComboBox<String> jComboBox_Language_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel_Accent_Colors_;
    private javax.swing.JLabel jLabel_Flag_Lang;
    private javax.swing.JLabel jLabel_Language_;
    private javax.swing.JLabel jLabel_LightDark_;
    private javax.swing.JLabel jLabel_SelectFont_;
    private javax.swing.JLabel jLabel_SelectTheme_;
    private javax.swing.JList<String> jList_SystemFonts_;
    private javax.swing.JList<String> jList_Themes_;
    private javax.swing.JPanel jPanel_Settings;
    private javax.swing.JRadioButton jRadioButton_Round_;
    private javax.swing.JRadioButton jRadioButton_Square_;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField_John_;
    // End of variables declaration//GEN-END:variables
}
