/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.tartarus.artists;
    import my.tartarus.customers.*;
    import java.io.*;
    import java.util.*;
    import java.lang.*;
    import java.lang.Object;
    import javax.swing.JFrame;
    import javax.swing.JOptionPane;
    import javax.swing.JPanel;
    import javazoom.jl.player.Player;
    import java.io.File;
    import java.net.MalformedURLException;
    import java.net.URL;
    import javax.swing.JFileChooser;
    import javax.swing.JFrame;
    import java.awt.Desktop;
    import java.awt.Font;
    import java.net.URI;
    import java.awt.GridLayout;
    import java.awt.Label;
    import javax.swing.JTabbedPane;
    import java.awt.*;
    import org.apache.commons.lang3.StringUtils;
import my.tartarus.customers.ManageCommissionerList;
/**
 *
 * @author Soerakraven
 */
public class MainUI extends javax.swing.JFrame {
        public static MainUI princ = new MainUI();
        public DetailsWindowUI novo = new DetailsWindowUI();
        public static TOSUI tosui = new TOSUI();
        public CommissionerDetailsUI Cduimain = new CommissionerDetailsUI();
        public WipsReceivedFileUI wrfui = new WipsReceivedFileUI();
        public java.awt.image.BufferedImage buf = null;
        
    /**
     * Creates new form NumberAdditionUI
     */
    public MainUI () {
        ArrayList<Customer> customer = new ArrayList<Customer>();
        ArrayList<Commissions> commissions = new ArrayList<Commissions>();
        ManageCustomerList.StartList(customer);
        ManageCommissionerList.StartCommissionerList(commissions);
        ArchiveCustomer.CreateFile();
        ArchiveCustomer.LoadData();
        ManageCommissionerArchive.CreateFile();
        ManageCommissionerArchive.LoadData();
        JOptionPane.showMessageDialog(new JFrame(), "Previous data successfully loaded!");
        initComponents();
    }
    public String SetRandomText(){
        Random rd = new Random();
        int i = rd.nextInt(20);
        if(i==0){
            return "NOBODY EXPECTS THE SPANISH INQUISITION";
        }else if(i==1){
            return "You thought it was Dio, BUT IT WAS ME, TARTARUS!";
        }else if(i==2){
            return "You can open/close the Details/TOS window without losing progress!";
        }else if(i==3){
            return "WEBOS XD";
        }else if(i==4){
            return "Yiff me Daddy";
        }else if(i==5){
            return "YOU MADE PUTIN CRY!";
        }else if(i==6){
            return "Lantern-Control is a valid form of love";
        }else if(i==7){
            return "This program was not made by gnomes";
        }else if(i==8){
            return "I know you've been going through a lot, but remember: You did this to yourself!";
        }else if(i==9){
            return "Java sucks";
        }else if(i==10){
            return "Give me your password";
        }else if(i==11){
            return "Nevermore!";
        }else if(i==12){
            return "HE'S TOUCHING THE CHILD!";
        }else if(i==13){
            return "*Jazz musics stops*";
        }else if(i==14){
            return "Your autism level has been increased by 20";
        }else if(i==15){
            return "DESTRUCTION 100";
        }else if(i==16){
            return "This is so sad Alexa play despacito";
        }
        return "ZAWAAAAARUDO";
    }
    public int MOCCounter(){
        int cont=0;
        if(METHOD_OF_CONTACT_DA.isSelected() == true){
            cont++;
        }
        if(METHOD_OF_CONTACT_FA.isSelected() == true){
            cont++;
        }
        if(METHOD_OF_CONTACT_TELEGRAM.isSelected() == true){
            cont++;
        }
        if(METHOD_OF_CONTACT_DISCORD.isSelected() == true){
            cont++;
        }
        if(METHOD_OF_CONTACT_OTHER.isSelected() == true){
            cont++;
        }
        return cont;
    }
    public TOSUI ReturnTosui(){
        return tosui;
    }
    public CommissionerDetailsUI ReturnsCduimain(){
        return Cduimain;
    }
    public WipsReceivedFileUI Returnwrfui(){
        return wrfui;
    }
    public static void HideTosui(){
        tosui.hide();
    }
    public void Hidecdui(){
        Cduimain.hide();
    }
    public javax.swing.JComboBox GetESTIMATE_PRICE_CURRENCY(){
        return princ.ESTIMATE_PRICE_CURRENCY;
    }
    public javax.swing.JComboBox GetCHARACTERS_QUANTITY_COMBOBOX(){
        return princ.CHARACTERS_QUANTITY_COMBOBOX;
    }
    
    public javax.swing.JComboBox GetDEADLINE_DATE_DAY(){
        return princ.DEADLINE_DATE_DAY;
    }
    
    public javax.swing.JComboBox GetDEADLINE_DATE_MONTH(){
        return princ.DEADLINE_DATE_MONTH;
    }
    
    public javax.swing.JComboBox GetDEADLINE_DATE_YEAR(){
        return princ.DEADLINE_DATE_YEAR;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PREVIOUS_COMISSIONER_BUTTON_GROUP = new javax.swing.ButtonGroup();
        COMMISSION_COMPLETE_BUTTON_GROUP = new javax.swing.ButtonGroup();
        CHARACTERS_BUTTON_GROUP = new javax.swing.ButtonGroup();
        PAYMENT_PLATFORM_BUTTON_GROUP = new javax.swing.ButtonGroup();
        CHARACTER_TYPE_BUTTON_GROUP = new javax.swing.ButtonGroup();
        LEWDS_BUTTON_GROUP = new javax.swing.ButtonGroup();
        BACKGROUND_INCLUDED_BUTTON_GROUP = new javax.swing.ButtonGroup();
        BACKGROUND_TYPE_BUTTON_GROUP = new javax.swing.ButtonGroup();
        WIPS_RECEIVED_BUTTON_GROUP = new javax.swing.ButtonGroup();
        DEADLINE_BUTTON_GROUP = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        ARTIST_TAB = new javax.swing.JPanel();
        LIST_CUSTOMERS_BUTTON = new javax.swing.JButton();
        SAVE_BUTTON = new javax.swing.JButton();
        CLEAR_BUTTON = new javax.swing.JButton();
        CREDITS_BUTTON = new javax.swing.JButton();
        ARTIST_USERNAME_PANEL = new javax.swing.JPanel();
        USERNAME = new javax.swing.JLabel();
        USERNAME_TEXT = new javax.swing.JTextField();
        ARTIST_MOC_PANEL = new javax.swing.JPanel();
        METHOD_OF_CONTACT = new javax.swing.JLabel();
        METHOD_OF_CONTACT_DISCORD = new javax.swing.JCheckBox();
        METHOD_OF_CONTACT_TELEGRAM = new javax.swing.JCheckBox();
        METHOD_OF_CONTACT_FA = new javax.swing.JCheckBox();
        METHOD_OF_CONTACT_DA = new javax.swing.JCheckBox();
        METHOD_OF_CONTACT_OTHER = new javax.swing.JCheckBox();
        METHOD_OF_CONTACT_OTHER_TEXT = new javax.swing.JTextField();
        ARTIST_PREVIOUS_PANEL = new javax.swing.JPanel();
        PREVIOUS_COMMISSIONER = new javax.swing.JLabel();
        PREVIOUS_COMMISSIONER_YES = new javax.swing.JRadioButton();
        PREVIOUS_COMMISSIONER_NO = new javax.swing.JRadioButton();
        ARTIST_DATE_PANEL = new javax.swing.JPanel();
        DATE_OF_COMMISSION = new javax.swing.JLabel();
        DATE_OF_COMMISSION_DAY = new javax.swing.JComboBox<>();
        BARRINHA1 = new javax.swing.JLabel();
        DATE_OF_COMMISSION_MONTH = new javax.swing.JComboBox<>();
        BARRINHA2 = new javax.swing.JLabel();
        DATE_OF_COMMISSION_YEAR = new javax.swing.JComboBox<>();
        ARTIST_PAYMENT_PANEL = new javax.swing.JPanel();
        DATE_OF_PAYMENT = new javax.swing.JLabel();
        DATE_OF_PAYMENT_DAY = new javax.swing.JComboBox<>();
        BARRINHA3 = new javax.swing.JLabel();
        DATE_OF_PAYMENT_MONTH = new javax.swing.JComboBox<>();
        BARRINHA4 = new javax.swing.JLabel();
        DATE_OF_PAYMENT_YEAR = new javax.swing.JComboBox<>();
        INVOICE_NUMBER = new javax.swing.JLabel();
        INVOICE_NUMBER_NUMBER = new javax.swing.JTextField();
        PRICE_CHARGED = new javax.swing.JLabel();
        PRICE_CHARGED_CURRENCY = new javax.swing.JComboBox<>();
        PRICE_CHARGED_AMMOUNT = new javax.swing.JTextField();
        ARTIST_DETAILS_PANEL = new javax.swing.JPanel();
        WRITTEN_DETAILS = new javax.swing.JLabel();
        OPEN_DETAILS_WINDOW_BUTTON = new javax.swing.JButton();
        ARTIST_COMPLETION_PANEL = new javax.swing.JPanel();
        COMMISSION_COMPLETE = new javax.swing.JLabel();
        COMMISSION_COMPLETE_YES = new javax.swing.JRadioButton();
        COMMISSION_COMPLETE_NO = new javax.swing.JRadioButton();
        ARTIST_TRIVIA_PANEL = new javax.swing.JPanel();
        ARTIST_TRIVIA = new javax.swing.JLabel();
        COMMISSIONER_TAB = new javax.swing.JPanel();
        SAVE_BUTTON_COMMISSIONER = new javax.swing.JButton();
        CLEAR_BUTTON_COMMISSIONER = new javax.swing.JButton();
        LIST_COMMISSIONS_BUTTON = new javax.swing.JButton();
        CREDITS_COMMISSIONER_BUTTON = new javax.swing.JButton();
        DETAILS_PANEL = new javax.swing.JPanel();
        DETAILS = new javax.swing.JLabel();
        DETAILS_BUTTON = new javax.swing.JButton();
        USERNAME_PANEL = new javax.swing.JPanel();
        ARTIST_USERNAME_TEXT = new javax.swing.JTextField();
        ARTIST_USERNAME = new javax.swing.JLabel();
        ARTIST_TOS = new javax.swing.JLabel();
        ARTIST_TOS_BUTTON = new javax.swing.JButton();
        MOC_PANEL = new javax.swing.JPanel();
        ARTIST_SOCIAL_MEDIA = new javax.swing.JLabel();
        ARTIST_SOCIAL_MEDIA_OTHER = new javax.swing.JCheckBox();
        ARTIST_SOCIAL_MEDIA_DA = new javax.swing.JCheckBox();
        ARTIST_SOCIAL_MEDIA_FA = new javax.swing.JCheckBox();
        ARTIST_SOCIAL_MEDIA_TWITTER = new javax.swing.JCheckBox();
        ARTIST_SOCIAL_MEDIA_INSTA = new javax.swing.JCheckBox();
        ARTIST_SOCIAL_MEDIA_WPP = new javax.swing.JCheckBox();
        ARTIST_SOCIAL_MEDIA_TELEGRAM = new javax.swing.JCheckBox();
        ARTIST_SOCIAL_MEDIA_OTHER_TEXT = new javax.swing.JTextField();
        PRICE_PANEL = new javax.swing.JPanel();
        ESTIMATE_PRICE = new javax.swing.JLabel();
        ESTIMATE_PRICE_CURRENCY = new javax.swing.JComboBox<>();
        ESTIMATE_PRICE_TEXT = new javax.swing.JTextField();
        PAID_PRICE = new javax.swing.JLabel();
        PAID_PRICE_TEXT = new javax.swing.JTextField();
        PAYMENT_PLATFORM = new javax.swing.JLabel();
        PAYMENT_PLATFORM_PAYPAL = new javax.swing.JRadioButton();
        PAYMENT_PLATFORM_BANK = new javax.swing.JRadioButton();
        PAYMENT_PLATFORM_STRIPE = new javax.swing.JRadioButton();
        PAYMENT_PLATFORM_OTHER = new javax.swing.JRadioButton();
        PAYMENT_PLATFORM_OTHER_TEXT = new javax.swing.JTextField();
        CHARACTER_PANEL = new javax.swing.JPanel();
        CHARACTERS_QUANTITY = new javax.swing.JLabel();
        CHARACTERS_QUANTITY_COMBOBOX = new javax.swing.JComboBox<>();
        CHARACTER_NAMES = new javax.swing.JLabel();
        CHARACTER_NAMES_TEXT1 = new javax.swing.JTextField();
        CHARACTER_NAMES_TEXT2 = new javax.swing.JTextField();
        CHARACTER_NAMES_TEXT3 = new javax.swing.JTextField();
        CHARACTER_NAMES_TEXT4 = new javax.swing.JTextField();
        CHARACTER_NAMES_TEXT5 = new javax.swing.JTextField();
        CHARACTER_TYPE = new javax.swing.JLabel();
        CHARACTER_TYPE_BUST = new javax.swing.JRadioButton();
        CHARACTER_TYPE_HALFBODY = new javax.swing.JRadioButton();
        CHARACTER_TYPE_FULLBODY = new javax.swing.JRadioButton();
        CHARACTER_LEWDS = new javax.swing.JLabel();
        CHARACTER_LEWDS_SFW = new javax.swing.JRadioButton();
        CHARACTER_LEWDS_NSFW = new javax.swing.JRadioButton();
        BACKGROUND_PANEL = new javax.swing.JPanel();
        BACKGROUND_INCLUDED = new javax.swing.JLabel();
        BACKGROUND_INCLUDED_YES = new javax.swing.JRadioButton();
        BACKGROUND_INCLUDED_NO = new javax.swing.JRadioButton();
        BACKGROUND_TYPE = new javax.swing.JLabel();
        BACKGROUND_TYPE_SIMPLE = new javax.swing.JRadioButton();
        BACKGROUND_TYPE_DETAILED = new javax.swing.JRadioButton();
        BACKGROUND_TYPE_EXTRADETAILED = new javax.swing.JRadioButton();
        COMPLETION_STATUS_PANEL = new javax.swing.JPanel();
        WIPS_RECEIVED = new javax.swing.JLabel();
        WIPS_RECEIVED_YES = new javax.swing.JRadioButton();
        WIPS_RECEIVED_NO = new javax.swing.JRadioButton();
        DEADLINE = new javax.swing.JLabel();
        DEADLINE_GIVEN = new javax.swing.JRadioButton();
        DEADLINE_NOTGIVEN = new javax.swing.JRadioButton();
        DEADLINE_DATE_DAY = new javax.swing.JComboBox<>();
        DEADLINE_DATE_MONTH = new javax.swing.JComboBox<>();
        DEADLINE_DATE_YEAR = new javax.swing.JComboBox<>();
        SEND_WIP_BUTTON = new javax.swing.JButton();
        TITLE_PANEL = new javax.swing.JPanel();
        COMMISSION_TITLE = new javax.swing.JLabel();
        COMMISSION_TITLE_TEXT = new javax.swing.JTextField();
        ARTIST_TRIVIA_PANEL1 = new javax.swing.JPanel();
        ARTIST_TRIVIA1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(75, 34, 117));
        setResizable(false);

        jTabbedPane1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTabbedPane1.setToolTipText("I am?");
        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTabbedPane1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTabbedPane1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane1StateChanged(evt);
            }
        });
        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTabbedPane1MousePressed(evt);
            }
        });

        ARTIST_TAB.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ARTIST_TAB.setForeground(new java.awt.Color(40, 17, 73));
        ARTIST_TAB.setPreferredSize(new java.awt.Dimension(486, 503));

        LIST_CUSTOMERS_BUTTON.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        LIST_CUSTOMERS_BUTTON.setText("CUSTOMERS");
        LIST_CUSTOMERS_BUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LIST_CUSTOMERS_BUTTONActionPerformed(evt);
            }
        });

        SAVE_BUTTON.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        SAVE_BUTTON.setText("SAVE");
        SAVE_BUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SAVE_BUTTONActionPerformed(evt);
            }
        });

        CLEAR_BUTTON.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        CLEAR_BUTTON.setText("CLEAR");
        CLEAR_BUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CLEAR_BUTTONActionPerformed(evt);
            }
        });

        CREDITS_BUTTON.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        CREDITS_BUTTON.setText("CREDITS");
        CREDITS_BUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CREDITS_BUTTONActionPerformed(evt);
            }
        });

        ARTIST_USERNAME_PANEL.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Username"));

        USERNAME.setBackground(new java.awt.Color(255, 255, 255));
        USERNAME.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        USERNAME.setText("Commissioner Username");
        USERNAME.setToolTipText("");

        USERNAME_TEXT.setForeground(new java.awt.Color(113, 113, 113));
        USERNAME_TEXT.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        USERNAME_TEXT.setSelectedTextColor(new java.awt.Color(255, 255, 0));
        USERNAME_TEXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                USERNAME_TEXTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ARTIST_USERNAME_PANELLayout = new javax.swing.GroupLayout(ARTIST_USERNAME_PANEL);
        ARTIST_USERNAME_PANEL.setLayout(ARTIST_USERNAME_PANELLayout);
        ARTIST_USERNAME_PANELLayout.setHorizontalGroup(
            ARTIST_USERNAME_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ARTIST_USERNAME_PANELLayout.createSequentialGroup()
                .addComponent(USERNAME)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(USERNAME_TEXT))
        );
        ARTIST_USERNAME_PANELLayout.setVerticalGroup(
            ARTIST_USERNAME_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ARTIST_USERNAME_PANELLayout.createSequentialGroup()
                .addGroup(ARTIST_USERNAME_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(USERNAME)
                    .addComponent(USERNAME_TEXT, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        ARTIST_MOC_PANEL.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Contact"));

        METHOD_OF_CONTACT.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        METHOD_OF_CONTACT.setText("Method of contact");

        METHOD_OF_CONTACT_DISCORD.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        METHOD_OF_CONTACT_DISCORD.setText("Discord");
        METHOD_OF_CONTACT_DISCORD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                METHOD_OF_CONTACT_DISCORDActionPerformed(evt);
            }
        });

        METHOD_OF_CONTACT_TELEGRAM.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        METHOD_OF_CONTACT_TELEGRAM.setText("Telegram");

        METHOD_OF_CONTACT_FA.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        METHOD_OF_CONTACT_FA.setText("FurAffinity");

        METHOD_OF_CONTACT_DA.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        METHOD_OF_CONTACT_DA.setText("Deviantart");

        METHOD_OF_CONTACT_OTHER.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        METHOD_OF_CONTACT_OTHER.setText("Other");
        METHOD_OF_CONTACT_OTHER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                METHOD_OF_CONTACT_OTHERActionPerformed(evt);
            }
        });

        METHOD_OF_CONTACT_OTHER_TEXT.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        METHOD_OF_CONTACT_OTHER_TEXT.setEnabled(false);
        METHOD_OF_CONTACT_OTHER_TEXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                METHOD_OF_CONTACT_OTHER_TEXTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ARTIST_MOC_PANELLayout = new javax.swing.GroupLayout(ARTIST_MOC_PANEL);
        ARTIST_MOC_PANEL.setLayout(ARTIST_MOC_PANELLayout);
        ARTIST_MOC_PANELLayout.setHorizontalGroup(
            ARTIST_MOC_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ARTIST_MOC_PANELLayout.createSequentialGroup()
                .addGroup(ARTIST_MOC_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(ARTIST_MOC_PANELLayout.createSequentialGroup()
                        .addComponent(METHOD_OF_CONTACT)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(METHOD_OF_CONTACT_DISCORD)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(METHOD_OF_CONTACT_TELEGRAM)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(METHOD_OF_CONTACT_OTHER))
                    .addGroup(ARTIST_MOC_PANELLayout.createSequentialGroup()
                        .addComponent(METHOD_OF_CONTACT_FA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(METHOD_OF_CONTACT_DA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(METHOD_OF_CONTACT_OTHER_TEXT)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        ARTIST_MOC_PANELLayout.setVerticalGroup(
            ARTIST_MOC_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ARTIST_MOC_PANELLayout.createSequentialGroup()
                .addGroup(ARTIST_MOC_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(METHOD_OF_CONTACT)
                    .addComponent(METHOD_OF_CONTACT_DISCORD)
                    .addComponent(METHOD_OF_CONTACT_TELEGRAM)
                    .addComponent(METHOD_OF_CONTACT_OTHER))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ARTIST_MOC_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(METHOD_OF_CONTACT_FA)
                    .addComponent(METHOD_OF_CONTACT_DA)
                    .addComponent(METHOD_OF_CONTACT_OTHER_TEXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        ARTIST_PREVIOUS_PANEL.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Previous"));

        PREVIOUS_COMMISSIONER.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        PREVIOUS_COMMISSIONER.setText("Previous Customer?");

        PREVIOUS_COMISSIONER_BUTTON_GROUP.add(PREVIOUS_COMMISSIONER_YES);
        PREVIOUS_COMMISSIONER_YES.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        PREVIOUS_COMMISSIONER_YES.setText("Yes");
        PREVIOUS_COMMISSIONER_YES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PREVIOUS_COMMISSIONER_YESActionPerformed(evt);
            }
        });

        PREVIOUS_COMISSIONER_BUTTON_GROUP.add(PREVIOUS_COMMISSIONER_NO);
        PREVIOUS_COMMISSIONER_NO.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        PREVIOUS_COMMISSIONER_NO.setText("No");
        PREVIOUS_COMMISSIONER_NO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PREVIOUS_COMMISSIONER_NOActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ARTIST_PREVIOUS_PANELLayout = new javax.swing.GroupLayout(ARTIST_PREVIOUS_PANEL);
        ARTIST_PREVIOUS_PANEL.setLayout(ARTIST_PREVIOUS_PANELLayout);
        ARTIST_PREVIOUS_PANELLayout.setHorizontalGroup(
            ARTIST_PREVIOUS_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ARTIST_PREVIOUS_PANELLayout.createSequentialGroup()
                .addComponent(PREVIOUS_COMMISSIONER)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PREVIOUS_COMMISSIONER_YES)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PREVIOUS_COMMISSIONER_NO)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        ARTIST_PREVIOUS_PANELLayout.setVerticalGroup(
            ARTIST_PREVIOUS_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ARTIST_PREVIOUS_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(PREVIOUS_COMMISSIONER, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(PREVIOUS_COMMISSIONER_YES)
                .addComponent(PREVIOUS_COMMISSIONER_NO))
        );

        ARTIST_DATE_PANEL.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Date of closure"));

        DATE_OF_COMMISSION.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        DATE_OF_COMMISSION.setText("Date of Commission");

        DATE_OF_COMMISSION_DAY.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        DATE_OF_COMMISSION_DAY.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        BARRINHA1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        BARRINHA1.setText("/");

        DATE_OF_COMMISSION_MONTH.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        DATE_OF_COMMISSION_MONTH.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        BARRINHA2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        BARRINHA2.setText("/");

        DATE_OF_COMMISSION_YEAR.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        DATE_OF_COMMISSION_YEAR.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028" }));

        javax.swing.GroupLayout ARTIST_DATE_PANELLayout = new javax.swing.GroupLayout(ARTIST_DATE_PANEL);
        ARTIST_DATE_PANEL.setLayout(ARTIST_DATE_PANELLayout);
        ARTIST_DATE_PANELLayout.setHorizontalGroup(
            ARTIST_DATE_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ARTIST_DATE_PANELLayout.createSequentialGroup()
                .addComponent(DATE_OF_COMMISSION)
                .addGap(33, 33, 33)
                .addComponent(DATE_OF_COMMISSION_DAY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(BARRINHA1)
                .addGap(2, 2, 2)
                .addComponent(DATE_OF_COMMISSION_MONTH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(BARRINHA2)
                .addGap(2, 2, 2)
                .addComponent(DATE_OF_COMMISSION_YEAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        ARTIST_DATE_PANELLayout.setVerticalGroup(
            ARTIST_DATE_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ARTIST_DATE_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(DATE_OF_COMMISSION)
                .addComponent(DATE_OF_COMMISSION_DAY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(DATE_OF_COMMISSION_MONTH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(DATE_OF_COMMISSION_YEAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(BARRINHA1)
                .addComponent(BARRINHA2))
        );

        ARTIST_PAYMENT_PANEL.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Payment"));

        DATE_OF_PAYMENT.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        DATE_OF_PAYMENT.setText("Date of Payment");

        DATE_OF_PAYMENT_DAY.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        DATE_OF_PAYMENT_DAY.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        BARRINHA3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        BARRINHA3.setText("/");

        DATE_OF_PAYMENT_MONTH.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        DATE_OF_PAYMENT_MONTH.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        BARRINHA4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        BARRINHA4.setText("/");

        DATE_OF_PAYMENT_YEAR.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        DATE_OF_PAYMENT_YEAR.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028" }));
        DATE_OF_PAYMENT_YEAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DATE_OF_PAYMENT_YEARActionPerformed(evt);
            }
        });

        INVOICE_NUMBER.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        INVOICE_NUMBER.setText("Number of Invoice");

        INVOICE_NUMBER_NUMBER.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        PRICE_CHARGED.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        PRICE_CHARGED.setText("Price Charged");

        PRICE_CHARGED_CURRENCY.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        PRICE_CHARGED_CURRENCY.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADP", "AED", "AFA", "AFN", "ALK", "ALL", "AMD", "ANG", "AOA", "AOK", "AON", "AOR", "ARA", "ARP", "ARS", "ARY", "ATS", "AUD", "AWG", "AYM", "AZM", "AZN", "BAD", "BAM", "BBD", "BDT", "BEC", "BEF", "BEL", "BGJ", "BGK", "BGL", "BGN", "BHD", "BIF", "BMD", "BND", "BOB", "BOP", "BOV", "BRB", "BRC", "BRE", "BRL", "BRN", "BRR", "BSD", "BTN", "BUK", "BWP", "BYB", "BYN", "BYR", "BZD", "CAD", "CDF", "CHC", "CHE", "CHF", "CHW", "CLF", "CLP", "CNX", "CNY", "COP", "COU", "CRC", "CSD", "CSJ", "CSK", "CUC", "CUP", "CVE", "CYP", "CZK", "DDM", "DEM", "DJF", "DKK", "DOP", "DZD", "ECS", "ECV", "EEK", "EGP", "ERN", "ESA", "ESB", "ESP", "ETB", "EUR", "FIM", "FJD", "FKP", "FRF", "GBP", "GEK", "GEL", "GHC", "GHP", "GHS", "GIP", "GMD", "GNE", "GNF", "GNS", "GQE", "GRD", "GTQ", "GWE", "GWP", "GYD", "HKD", "HNL", "HRD", "HRK", "HTG", "HUF", "IDR", "IEP", "ILP", "ILR", "ILS", "INR", "IQD", "IRR", "ISJ", "ISK", "ITL", "JMD", "JOD", "JPY", "KES", "KGS", "KHR", "KMF", "KPW", "KRW", "KWD", "KYD", "KZT", "LAJ", "LAK", "LBP", "LKR", "LRD", "LSL", "LSM", "LTL", "LTT", "LUC", "LUF", "LUL", "LVL", "LVR", "LYD", "MAD", "MDL", "MGA", "MGF", "MKD", "MLF", "MMK", "MNT", "MOP", "MRO", "MTL", "MTP", "MUR", "MVQ", "MVR", "MWK", "MXN", "MXP", "MXV", "MYR", "MZE", "MZM", "MZN", "NAD", "NGN", "NIC", "NIO", "NLG", "NOK", "NPR", "NZD", "OMR", "PAB", "PEH", "PEI", "PEN", "PES", "PGK", "PHP", "PKR", "PLN", "PLZ", "PTE", "PYG", "QAR", "RHD", "ROK", "ROL", "RON", "RSD", "RUB", "RUR", "RWF", "SAR", "SBD", "SCR", "SDD", "SDG", "SDP", "SEK", "SGD", "SHP", "SIT", "SKK", "SLL", "SOS", "SRD", "SRG", "SSP", "STD", "SUR", "SVC", "SYP", "SZL", "THB", "TJR", "TJS", "TMM", "TMT", "TND", "TOP", "TPE", "TRL", "TRY", "TTD", "TWD", "TZS", "UAH", "UAK", "UGS", "UGW", "UGX", "USD", "USN", "USS", "UYI", "UYN", "UYP", "UYU", "UZS", "VEB", "VEF", "VNC", "VND", "VUV", "WST", "XAF", "XAG", "XAU", "XBA", "XBB", "XBC", "XBD", "XCD", "XDR", "XEU", "XFO", "XFU", "XOF", "XPD", "XPF", "XPT", "XRE", "XSU", "XTS", "XUA", "XXX", "YDD", "YER", "YUD", "YUM", "YUN", "ZAL", "ZAR", "ZMK", "ZMW", "ZRN", "ZRZ", "ZWC", "ZWD", "ZWL", "ZWN", "ZWR" }));
        PRICE_CHARGED_CURRENCY.setSelectedIndex(248);

        PRICE_CHARGED_AMMOUNT.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        javax.swing.GroupLayout ARTIST_PAYMENT_PANELLayout = new javax.swing.GroupLayout(ARTIST_PAYMENT_PANEL);
        ARTIST_PAYMENT_PANEL.setLayout(ARTIST_PAYMENT_PANELLayout);
        ARTIST_PAYMENT_PANELLayout.setHorizontalGroup(
            ARTIST_PAYMENT_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ARTIST_PAYMENT_PANELLayout.createSequentialGroup()
                .addGroup(ARTIST_PAYMENT_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(INVOICE_NUMBER)
                    .addComponent(DATE_OF_PAYMENT)
                    .addGroup(ARTIST_PAYMENT_PANELLayout.createSequentialGroup()
                        .addComponent(PRICE_CHARGED)
                        .addGap(6, 6, 6)
                        .addComponent(PRICE_CHARGED_CURRENCY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ARTIST_PAYMENT_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(INVOICE_NUMBER_NUMBER, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DATE_OF_PAYMENT_DAY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PRICE_CHARGED_AMMOUNT, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(BARRINHA3)
                .addGap(3, 3, 3)
                .addComponent(DATE_OF_PAYMENT_MONTH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(BARRINHA4)
                .addGap(2, 2, 2)
                .addComponent(DATE_OF_PAYMENT_YEAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ARTIST_PAYMENT_PANELLayout.setVerticalGroup(
            ARTIST_PAYMENT_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ARTIST_PAYMENT_PANELLayout.createSequentialGroup()
                .addGroup(ARTIST_PAYMENT_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DATE_OF_PAYMENT)
                    .addComponent(DATE_OF_PAYMENT_DAY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DATE_OF_PAYMENT_MONTH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DATE_OF_PAYMENT_YEAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BARRINHA3)
                    .addComponent(BARRINHA4))
                .addGroup(ARTIST_PAYMENT_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ARTIST_PAYMENT_PANELLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(INVOICE_NUMBER_NUMBER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ARTIST_PAYMENT_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PRICE_CHARGED_AMMOUNT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PRICE_CHARGED_CURRENCY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PRICE_CHARGED)))
                    .addGroup(ARTIST_PAYMENT_PANELLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(INVOICE_NUMBER)))
                .addContainerGap())
        );

        ARTIST_DETAILS_PANEL.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Details"));

        WRITTEN_DETAILS.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        WRITTEN_DETAILS.setText("Written Details");

        OPEN_DETAILS_WINDOW_BUTTON.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        OPEN_DETAILS_WINDOW_BUTTON.setText("Open details window");
        OPEN_DETAILS_WINDOW_BUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OPEN_DETAILS_WINDOW_BUTTONActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ARTIST_DETAILS_PANELLayout = new javax.swing.GroupLayout(ARTIST_DETAILS_PANEL);
        ARTIST_DETAILS_PANEL.setLayout(ARTIST_DETAILS_PANELLayout);
        ARTIST_DETAILS_PANELLayout.setHorizontalGroup(
            ARTIST_DETAILS_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ARTIST_DETAILS_PANELLayout.createSequentialGroup()
                .addComponent(WRITTEN_DETAILS)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(OPEN_DETAILS_WINDOW_BUTTON)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        ARTIST_DETAILS_PANELLayout.setVerticalGroup(
            ARTIST_DETAILS_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ARTIST_DETAILS_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(OPEN_DETAILS_WINDOW_BUTTON)
                .addComponent(WRITTEN_DETAILS))
        );

        ARTIST_COMPLETION_PANEL.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Completion"));

        COMMISSION_COMPLETE.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        COMMISSION_COMPLETE.setText("Commision complete?");

        COMMISSION_COMPLETE_BUTTON_GROUP.add(COMMISSION_COMPLETE_YES);
        COMMISSION_COMPLETE_YES.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        COMMISSION_COMPLETE_YES.setText("Yes");
        COMMISSION_COMPLETE_YES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                COMMISSION_COMPLETE_YESActionPerformed(evt);
            }
        });

        COMMISSION_COMPLETE_BUTTON_GROUP.add(COMMISSION_COMPLETE_NO);
        COMMISSION_COMPLETE_NO.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        COMMISSION_COMPLETE_NO.setText("No");
        COMMISSION_COMPLETE_NO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                COMMISSION_COMPLETE_NOActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ARTIST_COMPLETION_PANELLayout = new javax.swing.GroupLayout(ARTIST_COMPLETION_PANEL);
        ARTIST_COMPLETION_PANEL.setLayout(ARTIST_COMPLETION_PANELLayout);
        ARTIST_COMPLETION_PANELLayout.setHorizontalGroup(
            ARTIST_COMPLETION_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ARTIST_COMPLETION_PANELLayout.createSequentialGroup()
                .addComponent(COMMISSION_COMPLETE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(COMMISSION_COMPLETE_YES)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(COMMISSION_COMPLETE_NO)
                .addGap(154, 154, 154))
        );
        ARTIST_COMPLETION_PANELLayout.setVerticalGroup(
            ARTIST_COMPLETION_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ARTIST_COMPLETION_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(COMMISSION_COMPLETE)
                .addComponent(COMMISSION_COMPLETE_YES)
                .addComponent(COMMISSION_COMPLETE_NO))
        );

        ARTIST_TRIVIA_PANEL.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Trivia/Tips"));

        ARTIST_TRIVIA.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ARTIST_TRIVIA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ARTIST_TRIVIA.setText("I'm too lazy to put something worthwhile here");

        javax.swing.GroupLayout ARTIST_TRIVIA_PANELLayout = new javax.swing.GroupLayout(ARTIST_TRIVIA_PANEL);
        ARTIST_TRIVIA_PANEL.setLayout(ARTIST_TRIVIA_PANELLayout);
        ARTIST_TRIVIA_PANELLayout.setHorizontalGroup(
            ARTIST_TRIVIA_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ARTIST_TRIVIA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ARTIST_TRIVIA_PANELLayout.setVerticalGroup(
            ARTIST_TRIVIA_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ARTIST_TRIVIA_PANELLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ARTIST_TRIVIA))
        );

        javax.swing.GroupLayout ARTIST_TABLayout = new javax.swing.GroupLayout(ARTIST_TAB);
        ARTIST_TAB.setLayout(ARTIST_TABLayout);
        ARTIST_TABLayout.setHorizontalGroup(
            ARTIST_TABLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ARTIST_TABLayout.createSequentialGroup()
                .addGroup(ARTIST_TABLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(ARTIST_TABLayout.createSequentialGroup()
                        .addGroup(ARTIST_TABLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(ARTIST_USERNAME_PANEL, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ARTIST_MOC_PANEL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ARTIST_PREVIOUS_PANEL, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ARTIST_DATE_PANEL, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ARTIST_TABLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ARTIST_COMPLETION_PANEL, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(ARTIST_DETAILS_PANEL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ARTIST_PAYMENT_PANEL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(ARTIST_TABLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(SAVE_BUTTON)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CLEAR_BUTTON)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LIST_CUSTOMERS_BUTTON)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CREDITS_BUTTON))
                    .addComponent(ARTIST_TRIVIA_PANEL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ARTIST_TABLayout.setVerticalGroup(
            ARTIST_TABLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ARTIST_TABLayout.createSequentialGroup()
                .addGroup(ARTIST_TABLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ARTIST_TABLayout.createSequentialGroup()
                        .addComponent(ARTIST_USERNAME_PANEL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(ARTIST_MOC_PANEL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(ARTIST_PREVIOUS_PANEL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(ARTIST_DATE_PANEL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ARTIST_TABLayout.createSequentialGroup()
                        .addComponent(ARTIST_PAYMENT_PANEL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ARTIST_DETAILS_PANEL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ARTIST_COMPLETION_PANEL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ARTIST_TRIVIA_PANEL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ARTIST_TABLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LIST_CUSTOMERS_BUTTON)
                    .addComponent(SAVE_BUTTON)
                    .addComponent(CLEAR_BUTTON)
                    .addComponent(CREDITS_BUTTON))
                .addContainerGap(116, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Artist", ARTIST_TAB);

        SAVE_BUTTON_COMMISSIONER.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        SAVE_BUTTON_COMMISSIONER.setText("SAVE");
        SAVE_BUTTON_COMMISSIONER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SAVE_BUTTON_COMMISSIONERActionPerformed(evt);
            }
        });

        CLEAR_BUTTON_COMMISSIONER.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        CLEAR_BUTTON_COMMISSIONER.setText("CREDITS");
        CLEAR_BUTTON_COMMISSIONER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CLEAR_BUTTON_COMMISSIONERActionPerformed(evt);
            }
        });

        LIST_COMMISSIONS_BUTTON.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        LIST_COMMISSIONS_BUTTON.setText("LIST COMMISSIONS");
        LIST_COMMISSIONS_BUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LIST_COMMISSIONS_BUTTONActionPerformed(evt);
            }
        });

        CREDITS_COMMISSIONER_BUTTON.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        CREDITS_COMMISSIONER_BUTTON.setText("CLEAR");
        CREDITS_COMMISSIONER_BUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CREDITS_COMMISSIONER_BUTTONActionPerformed(evt);
            }
        });

        DETAILS_PANEL.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Details"));

        DETAILS.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        DETAILS.setText("Written details");

        DETAILS_BUTTON.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        DETAILS_BUTTON.setText("Click me (Opens new window)");
        DETAILS_BUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DETAILS_BUTTONActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DETAILS_PANELLayout = new javax.swing.GroupLayout(DETAILS_PANEL);
        DETAILS_PANEL.setLayout(DETAILS_PANELLayout);
        DETAILS_PANELLayout.setHorizontalGroup(
            DETAILS_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DETAILS_PANELLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(DETAILS)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DETAILS_BUTTON)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        DETAILS_PANELLayout.setVerticalGroup(
            DETAILS_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DETAILS_PANELLayout.createSequentialGroup()
                .addGroup(DETAILS_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DETAILS)
                    .addComponent(DETAILS_BUTTON))
                .addGap(10, 10, 10))
        );

        USERNAME_PANEL.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Username"));

        ARTIST_USERNAME_TEXT.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ARTIST_USERNAME_TEXT.setText("Leave blank if unsure");
        ARTIST_USERNAME_TEXT.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ARTIST_USERNAME_TEXTFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ARTIST_USERNAME_TEXTFocusLost(evt);
            }
        });
        ARTIST_USERNAME_TEXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ARTIST_USERNAME_TEXTActionPerformed(evt);
            }
        });

        ARTIST_USERNAME.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ARTIST_USERNAME.setText("Artist Username");

        ARTIST_TOS.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ARTIST_TOS.setText("Artist Terms of Service");

        ARTIST_TOS_BUTTON.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ARTIST_TOS_BUTTON.setText("Click me (Opens new window)");
        ARTIST_TOS_BUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ARTIST_TOS_BUTTONActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout USERNAME_PANELLayout = new javax.swing.GroupLayout(USERNAME_PANEL);
        USERNAME_PANEL.setLayout(USERNAME_PANELLayout);
        USERNAME_PANELLayout.setHorizontalGroup(
            USERNAME_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(USERNAME_PANELLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(USERNAME_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ARTIST_USERNAME)
                    .addComponent(ARTIST_TOS))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(USERNAME_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ARTIST_USERNAME_TEXT)
                    .addComponent(ARTIST_TOS_BUTTON, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        USERNAME_PANELLayout.setVerticalGroup(
            USERNAME_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(USERNAME_PANELLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(USERNAME_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ARTIST_USERNAME)
                    .addComponent(ARTIST_USERNAME_TEXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(USERNAME_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ARTIST_TOS_BUTTON)
                    .addComponent(ARTIST_TOS))
                .addGap(0, 0, 0))
        );

        MOC_PANEL.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Methods of Contact"));

        ARTIST_SOCIAL_MEDIA.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ARTIST_SOCIAL_MEDIA.setText("Artist Social Media");

        ARTIST_SOCIAL_MEDIA_OTHER.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ARTIST_SOCIAL_MEDIA_OTHER.setText("Other");
        ARTIST_SOCIAL_MEDIA_OTHER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ARTIST_SOCIAL_MEDIA_OTHERActionPerformed(evt);
            }
        });

        ARTIST_SOCIAL_MEDIA_DA.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ARTIST_SOCIAL_MEDIA_DA.setText("DeviantArt");

        ARTIST_SOCIAL_MEDIA_FA.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ARTIST_SOCIAL_MEDIA_FA.setText("FurAffinity");

        ARTIST_SOCIAL_MEDIA_TWITTER.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ARTIST_SOCIAL_MEDIA_TWITTER.setText("Twitter");

        ARTIST_SOCIAL_MEDIA_INSTA.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ARTIST_SOCIAL_MEDIA_INSTA.setText("Instagram");

        ARTIST_SOCIAL_MEDIA_WPP.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ARTIST_SOCIAL_MEDIA_WPP.setText("WhatsApp");

        ARTIST_SOCIAL_MEDIA_TELEGRAM.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ARTIST_SOCIAL_MEDIA_TELEGRAM.setText("Telegram");

        ARTIST_SOCIAL_MEDIA_OTHER_TEXT.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ARTIST_SOCIAL_MEDIA_OTHER_TEXT.setEnabled(false);

        javax.swing.GroupLayout MOC_PANELLayout = new javax.swing.GroupLayout(MOC_PANEL);
        MOC_PANEL.setLayout(MOC_PANELLayout);
        MOC_PANELLayout.setHorizontalGroup(
            MOC_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MOC_PANELLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MOC_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(MOC_PANELLayout.createSequentialGroup()
                        .addComponent(ARTIST_SOCIAL_MEDIA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ARTIST_SOCIAL_MEDIA_DA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ARTIST_SOCIAL_MEDIA_INSTA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ARTIST_SOCIAL_MEDIA_FA))
                    .addGroup(MOC_PANELLayout.createSequentialGroup()
                        .addComponent(ARTIST_SOCIAL_MEDIA_WPP)
                        .addGap(5, 5, 5)
                        .addComponent(ARTIST_SOCIAL_MEDIA_TELEGRAM)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ARTIST_SOCIAL_MEDIA_TWITTER)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ARTIST_SOCIAL_MEDIA_OTHER)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ARTIST_SOCIAL_MEDIA_OTHER_TEXT, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MOC_PANELLayout.setVerticalGroup(
            MOC_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MOC_PANELLayout.createSequentialGroup()
                .addGroup(MOC_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ARTIST_SOCIAL_MEDIA)
                    .addComponent(ARTIST_SOCIAL_MEDIA_INSTA)
                    .addComponent(ARTIST_SOCIAL_MEDIA_DA)
                    .addComponent(ARTIST_SOCIAL_MEDIA_FA))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MOC_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ARTIST_SOCIAL_MEDIA_TELEGRAM)
                    .addComponent(ARTIST_SOCIAL_MEDIA_OTHER)
                    .addComponent(ARTIST_SOCIAL_MEDIA_WPP)
                    .addComponent(ARTIST_SOCIAL_MEDIA_OTHER_TEXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ARTIST_SOCIAL_MEDIA_TWITTER))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        PRICE_PANEL.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Pricing"));

        ESTIMATE_PRICE.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ESTIMATE_PRICE.setText("Estimate Price");

        ESTIMATE_PRICE_CURRENCY.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ESTIMATE_PRICE_CURRENCY.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADP", "AED", "AFA", "AFN", "ALK", "ALL", "AMD", "ANG", "AOA", "AOK", "AON", "AOR", "ARA", "ARP", "ARS", "ARY", "ATS", "AUD", "AWG", "AYM", "AZM", "AZN", "BAD", "BAM", "BBD", "BDT", "BEC", "BEF", "BEL", "BGJ", "BGK", "BGL", "BGN", "BHD", "BIF", "BMD", "BND", "BOB", "BOP", "BOV", "BRB", "BRC", "BRE", "BRL", "BRN", "BRR", "BSD", "BTN", "BUK", "BWP", "BYB", "BYN", "BYR", "BZD", "CAD", "CDF", "CHC", "CHE", "CHF", "CHW", "CLF", "CLP", "CNX", "CNY", "COP", "COU", "CRC", "CSD", "CSJ", "CSK", "CUC", "CUP", "CVE", "CYP", "CZK", "DDM", "DEM", "DJF", "DKK", "DOP", "DZD", "ECS", "ECV", "EEK", "EGP", "ERN", "ESA", "ESB", "ESP", "ETB", "EUR", "FIM", "FJD", "FKP", "FRF", "GBP", "GEK", "GEL", "GHC", "GHP", "GHS", "GIP", "GMD", "GNE", "GNF", "GNS", "GQE", "GRD", "GTQ", "GWE", "GWP", "GYD", "HKD", "HNL", "HRD", "HRK", "HTG", "HUF", "IDR", "IEP", "ILP", "ILR", "ILS", "INR", "IQD", "IRR", "ISJ", "ISK", "ITL", "JMD", "JOD", "JPY", "KES", "KGS", "KHR", "KMF", "KPW", "KRW", "KWD", "KYD", "KZT", "LAJ", "LAK", "LBP", "LKR", "LRD", "LSL", "LSM", "LTL", "LTT", "LUC", "LUF", "LUL", "LVL", "LVR", "LYD", "MAD", "MDL", "MGA", "MGF", "MKD", "MLF", "MMK", "MNT", "MOP", "MRO", "MTL", "MTP", "MUR", "MVQ", "MVR", "MWK", "MXN", "MXP", "MXV", "MYR", "MZE", "MZM", "MZN", "NAD", "NGN", "NIC", "NIO", "NLG", "NOK", "NPR", "NZD", "OMR", "PAB", "PEH", "PEI", "PEN", "PES", "PGK", "PHP", "PKR", "PLN", "PLZ", "PTE", "PYG", "QAR", "RHD", "ROK", "ROL", "RON", "RSD", "RUB", "RUR", "RWF", "SAR", "SBD", "SCR", "SDD", "SDG", "SDP", "SEK", "SGD", "SHP", "SIT", "SKK", "SLL", "SOS", "SRD", "SRG", "SSP", "STD", "SUR", "SVC", "SYP", "SZL", "THB", "TJR", "TJS", "TMM", "TMT", "TND", "TOP", "TPE", "TRL", "TRY", "TTD", "TWD", "TZS", "UAH", "UAK", "UGS", "UGW", "UGX", "USD", "USN", "USS", "UYI", "UYN", "UYP", "UYU", "UZS", "VEB", "VEF", "VNC", "VND", "VUV", "WST", "XAF", "XAG", "XAU", "XBA", "XBB", "XBC", "XBD", "XCD", "XDR", "XEU", "XFO", "XFU", "XOF", "XPD", "XPF", "XPT", "XRE", "XSU", "XTS", "XUA", "XXX", "YDD", "YER", "YUD", "YUM", "YUN", "ZAL", "ZAR", "ZMK", "ZMW", "ZRN", "ZRZ", "ZWC", "ZWD", "ZWL", "ZWN", "ZWR" }));
        ESTIMATE_PRICE_CURRENCY.setSelectedIndex(248);

        ESTIMATE_PRICE_TEXT.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        PAID_PRICE.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        PAID_PRICE.setText("Paid Price");

        PAID_PRICE_TEXT.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        PAYMENT_PLATFORM.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        PAYMENT_PLATFORM.setText("Payment Platflorm");

        PAYMENT_PLATFORM_BUTTON_GROUP.add(PAYMENT_PLATFORM_PAYPAL);
        PAYMENT_PLATFORM_PAYPAL.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        PAYMENT_PLATFORM_PAYPAL.setText("Paypal");
        PAYMENT_PLATFORM_PAYPAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PAYMENT_PLATFORM_PAYPALActionPerformed(evt);
            }
        });

        PAYMENT_PLATFORM_BUTTON_GROUP.add(PAYMENT_PLATFORM_BANK);
        PAYMENT_PLATFORM_BANK.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        PAYMENT_PLATFORM_BANK.setText("Bank Deposit");
        PAYMENT_PLATFORM_BANK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PAYMENT_PLATFORM_BANKActionPerformed(evt);
            }
        });

        PAYMENT_PLATFORM_BUTTON_GROUP.add(PAYMENT_PLATFORM_STRIPE);
        PAYMENT_PLATFORM_STRIPE.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        PAYMENT_PLATFORM_STRIPE.setText("Stripe");
        PAYMENT_PLATFORM_STRIPE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PAYMENT_PLATFORM_STRIPEActionPerformed(evt);
            }
        });

        PAYMENT_PLATFORM_BUTTON_GROUP.add(PAYMENT_PLATFORM_OTHER);
        PAYMENT_PLATFORM_OTHER.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        PAYMENT_PLATFORM_OTHER.setText("Other");
        PAYMENT_PLATFORM_OTHER.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                PAYMENT_PLATFORM_OTHERStateChanged(evt);
            }
        });
        PAYMENT_PLATFORM_OTHER.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PAYMENT_PLATFORM_OTHERFocusGained(evt);
            }
        });
        PAYMENT_PLATFORM_OTHER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PAYMENT_PLATFORM_OTHERActionPerformed(evt);
            }
        });

        PAYMENT_PLATFORM_OTHER_TEXT.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        PAYMENT_PLATFORM_OTHER_TEXT.setEnabled(false);

        javax.swing.GroupLayout PRICE_PANELLayout = new javax.swing.GroupLayout(PRICE_PANEL);
        PRICE_PANEL.setLayout(PRICE_PANELLayout);
        PRICE_PANELLayout.setHorizontalGroup(
            PRICE_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PRICE_PANELLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PRICE_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PRICE_PANELLayout.createSequentialGroup()
                        .addComponent(ESTIMATE_PRICE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ESTIMATE_PRICE_CURRENCY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ESTIMATE_PRICE_TEXT, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PAID_PRICE)
                        .addGap(6, 6, 6)
                        .addComponent(PAID_PRICE_TEXT))
                    .addGroup(PRICE_PANELLayout.createSequentialGroup()
                        .addGroup(PRICE_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(PRICE_PANELLayout.createSequentialGroup()
                                .addComponent(PAYMENT_PLATFORM_OTHER)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(PAYMENT_PLATFORM_OTHER_TEXT))
                            .addGroup(PRICE_PANELLayout.createSequentialGroup()
                                .addComponent(PAYMENT_PLATFORM)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PAYMENT_PLATFORM_PAYPAL)
                                .addGap(13, 13, 13)
                                .addComponent(PAYMENT_PLATFORM_BANK)
                                .addGap(18, 18, 18)
                                .addComponent(PAYMENT_PLATFORM_STRIPE)))
                        .addGap(0, 8, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PRICE_PANELLayout.setVerticalGroup(
            PRICE_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PRICE_PANELLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(PRICE_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ESTIMATE_PRICE)
                    .addComponent(ESTIMATE_PRICE_TEXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ESTIMATE_PRICE_CURRENCY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PAID_PRICE_TEXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PAID_PRICE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PRICE_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PAYMENT_PLATFORM)
                    .addComponent(PAYMENT_PLATFORM_PAYPAL)
                    .addComponent(PAYMENT_PLATFORM_BANK)
                    .addComponent(PAYMENT_PLATFORM_STRIPE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PRICE_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PAYMENT_PLATFORM_OTHER)
                    .addComponent(PAYMENT_PLATFORM_OTHER_TEXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        CHARACTER_PANEL.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Character(s)"));

        CHARACTERS_QUANTITY.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        CHARACTERS_QUANTITY.setText("How many characters?");

        CHARACTERS_QUANTITY_COMBOBOX.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        CHARACTERS_QUANTITY_COMBOBOX.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "1", "2", "3", "4", "5" }));
        CHARACTERS_QUANTITY_COMBOBOX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CHARACTERS_QUANTITY_COMBOBOXActionPerformed(evt);
            }
        });
        CHARACTERS_QUANTITY_COMBOBOX.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                CHARACTERS_QUANTITY_COMBOBOXPropertyChange(evt);
            }
        });

        CHARACTER_NAMES.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        CHARACTER_NAMES.setText("Character Names");

        CHARACTER_NAMES_TEXT1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        CHARACTER_NAMES_TEXT1.setText("Char. 1");
        CHARACTER_NAMES_TEXT1.setEnabled(false);
        CHARACTER_NAMES_TEXT1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CHARACTER_NAMES_TEXT1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                CHARACTER_NAMES_TEXT1FocusLost(evt);
            }
        });

        CHARACTER_NAMES_TEXT2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        CHARACTER_NAMES_TEXT2.setText("Char. 2");
        CHARACTER_NAMES_TEXT2.setEnabled(false);
        CHARACTER_NAMES_TEXT2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CHARACTER_NAMES_TEXT2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                CHARACTER_NAMES_TEXT2FocusLost(evt);
            }
        });

        CHARACTER_NAMES_TEXT3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        CHARACTER_NAMES_TEXT3.setText("Char. 3");
        CHARACTER_NAMES_TEXT3.setEnabled(false);
        CHARACTER_NAMES_TEXT3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CHARACTER_NAMES_TEXT3FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                CHARACTER_NAMES_TEXT3FocusLost(evt);
            }
        });

        CHARACTER_NAMES_TEXT4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        CHARACTER_NAMES_TEXT4.setText("Char. 4");
        CHARACTER_NAMES_TEXT4.setEnabled(false);
        CHARACTER_NAMES_TEXT4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CHARACTER_NAMES_TEXT4FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                CHARACTER_NAMES_TEXT4FocusLost(evt);
            }
        });

        CHARACTER_NAMES_TEXT5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        CHARACTER_NAMES_TEXT5.setText("Char. 5");
        CHARACTER_NAMES_TEXT5.setEnabled(false);
        CHARACTER_NAMES_TEXT5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CHARACTER_NAMES_TEXT5FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                CHARACTER_NAMES_TEXT5FocusLost(evt);
            }
        });

        CHARACTER_TYPE.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        CHARACTER_TYPE.setText("Character Type");

        CHARACTER_TYPE_BUTTON_GROUP.add(CHARACTER_TYPE_BUST);
        CHARACTER_TYPE_BUST.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        CHARACTER_TYPE_BUST.setText("Bust/Headshot");
        CHARACTER_TYPE_BUST.setEnabled(false);

        CHARACTER_TYPE_BUTTON_GROUP.add(CHARACTER_TYPE_HALFBODY);
        CHARACTER_TYPE_HALFBODY.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        CHARACTER_TYPE_HALFBODY.setText("Halfbody");
        CHARACTER_TYPE_HALFBODY.setEnabled(false);

        CHARACTER_TYPE_BUTTON_GROUP.add(CHARACTER_TYPE_FULLBODY);
        CHARACTER_TYPE_FULLBODY.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        CHARACTER_TYPE_FULLBODY.setText("Fullbody");
        CHARACTER_TYPE_FULLBODY.setEnabled(false);

        CHARACTER_LEWDS.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        CHARACTER_LEWDS.setText("Lewds?");

        LEWDS_BUTTON_GROUP.add(CHARACTER_LEWDS_SFW);
        CHARACTER_LEWDS_SFW.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        CHARACTER_LEWDS_SFW.setText("SFW");
        CHARACTER_LEWDS_SFW.setEnabled(false);

        LEWDS_BUTTON_GROUP.add(CHARACTER_LEWDS_NSFW);
        CHARACTER_LEWDS_NSFW.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        CHARACTER_LEWDS_NSFW.setText("NSFW");
        CHARACTER_LEWDS_NSFW.setEnabled(false);

        javax.swing.GroupLayout CHARACTER_PANELLayout = new javax.swing.GroupLayout(CHARACTER_PANEL);
        CHARACTER_PANEL.setLayout(CHARACTER_PANELLayout);
        CHARACTER_PANELLayout.setHorizontalGroup(
            CHARACTER_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CHARACTER_PANELLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CHARACTER_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CHARACTER_PANELLayout.createSequentialGroup()
                        .addComponent(CHARACTER_NAMES, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CHARACTER_NAMES_TEXT1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CHARACTER_NAMES_TEXT2))
                    .addGroup(CHARACTER_PANELLayout.createSequentialGroup()
                        .addComponent(CHARACTER_NAMES_TEXT3, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CHARACTER_NAMES_TEXT4, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CHARACTER_NAMES_TEXT5))
                    .addGroup(CHARACTER_PANELLayout.createSequentialGroup()
                        .addGroup(CHARACTER_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CHARACTER_PANELLayout.createSequentialGroup()
                                .addComponent(CHARACTERS_QUANTITY)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CHARACTERS_QUANTITY_COMBOBOX, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(CHARACTER_PANELLayout.createSequentialGroup()
                                .addComponent(CHARACTER_TYPE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CHARACTER_TYPE_BUST)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CHARACTER_TYPE_HALFBODY)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CHARACTER_TYPE_FULLBODY))
                            .addGroup(CHARACTER_PANELLayout.createSequentialGroup()
                                .addComponent(CHARACTER_LEWDS)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CHARACTER_LEWDS_SFW)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CHARACTER_LEWDS_NSFW)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        CHARACTER_PANELLayout.setVerticalGroup(
            CHARACTER_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CHARACTER_PANELLayout.createSequentialGroup()
                .addGroup(CHARACTER_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CHARACTERS_QUANTITY)
                    .addComponent(CHARACTERS_QUANTITY_COMBOBOX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CHARACTER_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CHARACTER_NAMES)
                    .addComponent(CHARACTER_NAMES_TEXT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CHARACTER_NAMES_TEXT2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CHARACTER_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CHARACTER_NAMES_TEXT3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CHARACTER_NAMES_TEXT4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CHARACTER_NAMES_TEXT5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CHARACTER_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CHARACTER_TYPE_BUST)
                    .addComponent(CHARACTER_TYPE_HALFBODY)
                    .addComponent(CHARACTER_TYPE_FULLBODY)
                    .addComponent(CHARACTER_TYPE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CHARACTER_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CHARACTER_LEWDS)
                    .addComponent(CHARACTER_LEWDS_SFW)
                    .addComponent(CHARACTER_LEWDS_NSFW)))
        );

        BACKGROUND_PANEL.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Background"));

        BACKGROUND_INCLUDED.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        BACKGROUND_INCLUDED.setText("Background Included?");

        BACKGROUND_INCLUDED_BUTTON_GROUP.add(BACKGROUND_INCLUDED_YES);
        BACKGROUND_INCLUDED_YES.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        BACKGROUND_INCLUDED_YES.setText("Yes");
        BACKGROUND_INCLUDED_YES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BACKGROUND_INCLUDED_YESActionPerformed(evt);
            }
        });

        BACKGROUND_INCLUDED_BUTTON_GROUP.add(BACKGROUND_INCLUDED_NO);
        BACKGROUND_INCLUDED_NO.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        BACKGROUND_INCLUDED_NO.setText("No");
        BACKGROUND_INCLUDED_NO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BACKGROUND_INCLUDED_NOActionPerformed(evt);
            }
        });

        BACKGROUND_TYPE.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        BACKGROUND_TYPE.setText("Background Type");

        BACKGROUND_TYPE_BUTTON_GROUP.add(BACKGROUND_TYPE_SIMPLE);
        BACKGROUND_TYPE_SIMPLE.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        BACKGROUND_TYPE_SIMPLE.setText("Simple");
        BACKGROUND_TYPE_SIMPLE.setEnabled(false);

        BACKGROUND_TYPE_BUTTON_GROUP.add(BACKGROUND_TYPE_DETAILED);
        BACKGROUND_TYPE_DETAILED.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        BACKGROUND_TYPE_DETAILED.setText("Detailed");
        BACKGROUND_TYPE_DETAILED.setEnabled(false);

        BACKGROUND_TYPE_BUTTON_GROUP.add(BACKGROUND_TYPE_EXTRADETAILED);
        BACKGROUND_TYPE_EXTRADETAILED.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        BACKGROUND_TYPE_EXTRADETAILED.setText("Extra-Detailed");
        BACKGROUND_TYPE_EXTRADETAILED.setEnabled(false);

        javax.swing.GroupLayout BACKGROUND_PANELLayout = new javax.swing.GroupLayout(BACKGROUND_PANEL);
        BACKGROUND_PANEL.setLayout(BACKGROUND_PANELLayout);
        BACKGROUND_PANELLayout.setHorizontalGroup(
            BACKGROUND_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BACKGROUND_PANELLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BACKGROUND_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BACKGROUND_PANELLayout.createSequentialGroup()
                        .addComponent(BACKGROUND_TYPE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BACKGROUND_TYPE_SIMPLE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BACKGROUND_TYPE_DETAILED)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BACKGROUND_TYPE_EXTRADETAILED))
                    .addGroup(BACKGROUND_PANELLayout.createSequentialGroup()
                        .addComponent(BACKGROUND_INCLUDED)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BACKGROUND_INCLUDED_YES)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BACKGROUND_INCLUDED_NO)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BACKGROUND_PANELLayout.setVerticalGroup(
            BACKGROUND_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BACKGROUND_PANELLayout.createSequentialGroup()
                .addGroup(BACKGROUND_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BACKGROUND_INCLUDED)
                    .addComponent(BACKGROUND_INCLUDED_YES)
                    .addComponent(BACKGROUND_INCLUDED_NO))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BACKGROUND_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BACKGROUND_TYPE)
                    .addComponent(BACKGROUND_TYPE_SIMPLE)
                    .addComponent(BACKGROUND_TYPE_DETAILED)
                    .addComponent(BACKGROUND_TYPE_EXTRADETAILED))
                .addContainerGap())
        );

        COMPLETION_STATUS_PANEL.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Completion"));

        WIPS_RECEIVED.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        WIPS_RECEIVED.setText("Wips Received?");

        WIPS_RECEIVED_BUTTON_GROUP.add(WIPS_RECEIVED_YES);
        WIPS_RECEIVED_YES.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        WIPS_RECEIVED_YES.setText("Yes");
        WIPS_RECEIVED_YES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WIPS_RECEIVED_YESActionPerformed(evt);
            }
        });

        WIPS_RECEIVED_BUTTON_GROUP.add(WIPS_RECEIVED_NO);
        WIPS_RECEIVED_NO.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        WIPS_RECEIVED_NO.setText("No");
        WIPS_RECEIVED_NO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WIPS_RECEIVED_NOActionPerformed(evt);
            }
        });

        DEADLINE.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        DEADLINE.setText("Deadline?");

        DEADLINE_BUTTON_GROUP.add(DEADLINE_GIVEN);
        DEADLINE_GIVEN.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        DEADLINE_GIVEN.setText("Given");
        DEADLINE_GIVEN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DEADLINE_GIVENActionPerformed(evt);
            }
        });

        DEADLINE_BUTTON_GROUP.add(DEADLINE_NOTGIVEN);
        DEADLINE_NOTGIVEN.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        DEADLINE_NOTGIVEN.setText("Not Given");
        DEADLINE_NOTGIVEN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DEADLINE_NOTGIVENActionPerformed(evt);
            }
        });

        DEADLINE_DATE_DAY.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        DEADLINE_DATE_DAY.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        DEADLINE_DATE_MONTH.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        DEADLINE_DATE_MONTH.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        DEADLINE_DATE_YEAR.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        DEADLINE_DATE_YEAR.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028" }));

        SEND_WIP_BUTTON.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        SEND_WIP_BUTTON.setText("Send WIP file");
        SEND_WIP_BUTTON.setEnabled(false);
        SEND_WIP_BUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SEND_WIP_BUTTONActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout COMPLETION_STATUS_PANELLayout = new javax.swing.GroupLayout(COMPLETION_STATUS_PANEL);
        COMPLETION_STATUS_PANEL.setLayout(COMPLETION_STATUS_PANELLayout);
        COMPLETION_STATUS_PANELLayout.setHorizontalGroup(
            COMPLETION_STATUS_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(COMPLETION_STATUS_PANELLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(COMPLETION_STATUS_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(COMPLETION_STATUS_PANELLayout.createSequentialGroup()
                        .addComponent(DEADLINE)
                        .addGap(18, 18, 18)
                        .addComponent(DEADLINE_GIVEN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(DEADLINE_NOTGIVEN))
                    .addGroup(COMPLETION_STATUS_PANELLayout.createSequentialGroup()
                        .addComponent(WIPS_RECEIVED)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(WIPS_RECEIVED_YES)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(WIPS_RECEIVED_NO)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(COMPLETION_STATUS_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(COMPLETION_STATUS_PANELLayout.createSequentialGroup()
                        .addComponent(DEADLINE_DATE_DAY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DEADLINE_DATE_MONTH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DEADLINE_DATE_YEAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(SEND_WIP_BUTTON))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        COMPLETION_STATUS_PANELLayout.setVerticalGroup(
            COMPLETION_STATUS_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(COMPLETION_STATUS_PANELLayout.createSequentialGroup()
                .addGroup(COMPLETION_STATUS_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(WIPS_RECEIVED)
                    .addComponent(WIPS_RECEIVED_YES)
                    .addComponent(WIPS_RECEIVED_NO)
                    .addComponent(SEND_WIP_BUTTON))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(COMPLETION_STATUS_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DEADLINE)
                    .addComponent(DEADLINE_GIVEN)
                    .addComponent(DEADLINE_NOTGIVEN)
                    .addComponent(DEADLINE_DATE_DAY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DEADLINE_DATE_MONTH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DEADLINE_DATE_YEAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        TITLE_PANEL.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Title"));

        COMMISSION_TITLE.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        COMMISSION_TITLE.setText("Commission Title");

        COMMISSION_TITLE_TEXT.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        COMMISSION_TITLE_TEXT.setText("Title to show on 'List Commissions'");
        COMMISSION_TITLE_TEXT.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                COMMISSION_TITLE_TEXTFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                COMMISSION_TITLE_TEXTFocusLost(evt);
            }
        });

        javax.swing.GroupLayout TITLE_PANELLayout = new javax.swing.GroupLayout(TITLE_PANEL);
        TITLE_PANEL.setLayout(TITLE_PANELLayout);
        TITLE_PANELLayout.setHorizontalGroup(
            TITLE_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TITLE_PANELLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(COMMISSION_TITLE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(COMMISSION_TITLE_TEXT, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
                .addContainerGap())
        );
        TITLE_PANELLayout.setVerticalGroup(
            TITLE_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TITLE_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(COMMISSION_TITLE)
                .addComponent(COMMISSION_TITLE_TEXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        ARTIST_TRIVIA_PANEL1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Trivia/Tips"));

        ARTIST_TRIVIA1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        ARTIST_TRIVIA1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ARTIST_TRIVIA1.setText("I'm too lazy to put something worthwhile here");

        javax.swing.GroupLayout ARTIST_TRIVIA_PANEL1Layout = new javax.swing.GroupLayout(ARTIST_TRIVIA_PANEL1);
        ARTIST_TRIVIA_PANEL1.setLayout(ARTIST_TRIVIA_PANEL1Layout);
        ARTIST_TRIVIA_PANEL1Layout.setHorizontalGroup(
            ARTIST_TRIVIA_PANEL1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ARTIST_TRIVIA1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ARTIST_TRIVIA_PANEL1Layout.setVerticalGroup(
            ARTIST_TRIVIA_PANEL1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ARTIST_TRIVIA1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout COMMISSIONER_TABLayout = new javax.swing.GroupLayout(COMMISSIONER_TAB);
        COMMISSIONER_TAB.setLayout(COMMISSIONER_TABLayout);
        COMMISSIONER_TABLayout.setHorizontalGroup(
            COMMISSIONER_TABLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(COMMISSIONER_TABLayout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(SAVE_BUTTON_COMMISSIONER)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CREDITS_COMMISSIONER_BUTTON)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LIST_COMMISSIONS_BUTTON)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CLEAR_BUTTON_COMMISSIONER)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(COMMISSIONER_TABLayout.createSequentialGroup()
                .addGroup(COMMISSIONER_TABLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(MOC_PANEL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CHARACTER_PANEL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TITLE_PANEL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(COMPLETION_STATUS_PANEL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(COMMISSIONER_TABLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PRICE_PANEL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BACKGROUND_PANEL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DETAILS_PANEL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(USERNAME_PANEL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ARTIST_TRIVIA_PANEL1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        COMMISSIONER_TABLayout.setVerticalGroup(
            COMMISSIONER_TABLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(COMMISSIONER_TABLayout.createSequentialGroup()
                .addGroup(COMMISSIONER_TABLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(COMMISSIONER_TABLayout.createSequentialGroup()
                        .addComponent(TITLE_PANEL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(COMPLETION_STATUS_PANEL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(MOC_PANEL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CHARACTER_PANEL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(COMMISSIONER_TABLayout.createSequentialGroup()
                        .addComponent(PRICE_PANEL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BACKGROUND_PANEL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(DETAILS_PANEL, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(USERNAME_PANEL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(ARTIST_TRIVIA_PANEL1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(COMMISSIONER_TABLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SAVE_BUTTON_COMMISSIONER)
                    .addComponent(CREDITS_COMMISSIONER_BUTTON)
                    .addComponent(LIST_COMMISSIONS_BUTTON)
                    .addComponent(CLEAR_BUTTON_COMMISSIONER))
                .addGap(0, 0, 0))
        );

        jTabbedPane1.addTab("Commissioner", COMMISSIONER_TAB);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1041, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ARTIST_USERNAME_TEXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ARTIST_USERNAME_TEXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ARTIST_USERNAME_TEXTActionPerformed

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void jTabbedPane1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane1StateChanged
    }//GEN-LAST:event_jTabbedPane1StateChanged

    private void ARTIST_USERNAME_TEXTFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ARTIST_USERNAME_TEXTFocusGained
        if(ARTIST_USERNAME_TEXT.getText().equals("") || ARTIST_USERNAME_TEXT.getText().equals("Leave blank if unsure")){
            ARTIST_USERNAME_TEXT.setText("");
            ARTIST_USERNAME_TEXT.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_ARTIST_USERNAME_TEXTFocusGained

    private void ARTIST_USERNAME_TEXTFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ARTIST_USERNAME_TEXTFocusLost
        if(ARTIST_USERNAME_TEXT.getText().equals("") || ARTIST_USERNAME_TEXT.getText().equals("Leave blank if unsure")){
            ARTIST_USERNAME_TEXT.setText("Leave blank if unsure");
            ARTIST_USERNAME_TEXT.setForeground(new Color(102,102,102));
        }
    }//GEN-LAST:event_ARTIST_USERNAME_TEXTFocusLost

    private void CREDITS_BUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CREDITS_BUTTONActionPerformed
        CreditsUI cd = new CreditsUI();
        cd.setVisible(true);
        cd.setTitle("Credits / All rights reserved");
    }//GEN-LAST:event_CREDITS_BUTTONActionPerformed

    private void CLEAR_BUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CLEAR_BUTTONActionPerformed
        USERNAME_TEXT.setText("");
        METHOD_OF_CONTACT_OTHER_TEXT.setEnabled(false);
        METHOD_OF_CONTACT_DA.setSelected(false);
        METHOD_OF_CONTACT_FA.setSelected(false);
        METHOD_OF_CONTACT_TELEGRAM.setSelected(false);
        METHOD_OF_CONTACT_DISCORD.setSelected(false);
        METHOD_OF_CONTACT_OTHER.setSelected(false);
        PREVIOUS_COMMISSIONER_YES.setSelected(false);
        PREVIOUS_COMMISSIONER_NO.setSelected(false);
        INVOICE_NUMBER_NUMBER.setText("");
        PRICE_CHARGED_AMMOUNT.setText("");
        PRICE_CHARGED_CURRENCY.setSelectedIndex(248);
        novo.SetText("");
    }//GEN-LAST:event_CLEAR_BUTTONActionPerformed

    private void SAVE_BUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SAVE_BUTTONActionPerformed
        String[] entradas = new String[10];
        entradas[0] = USERNAME_TEXT.getText();
        int cont2 = 0;
        entradas[1] = "";
        String [] MOC = new String[MOCCounter()];
        if(METHOD_OF_CONTACT_DA.isSelected() == true){
            MOC[cont2] = METHOD_OF_CONTACT_DA.getText();
            cont2++;
        }
        if(METHOD_OF_CONTACT_FA.isSelected() == true){
            MOC[cont2] = METHOD_OF_CONTACT_FA.getText();
            cont2++;
        }
        if(METHOD_OF_CONTACT_TELEGRAM.isSelected() == true){
            MOC[cont2] = METHOD_OF_CONTACT_TELEGRAM.getText();
            cont2++;
        }
        if(METHOD_OF_CONTACT_DISCORD.isSelected() == true){
            MOC[cont2] = METHOD_OF_CONTACT_DISCORD.getText();
            cont2++;
        }
        if(METHOD_OF_CONTACT_OTHER.isSelected() == true){
            MOC[cont2] = METHOD_OF_CONTACT_OTHER_TEXT.getText();
            cont2++;
        }
        if(PREVIOUS_COMMISSIONER_NO.isSelected() == true){
            entradas[2] = PREVIOUS_COMMISSIONER_NO.getText();
        }else{
            entradas[2] = PREVIOUS_COMMISSIONER_YES.getText();
        }
        entradas[3] = DATE_OF_COMMISSION_DAY.getSelectedItem().toString() + "/" + DATE_OF_COMMISSION_MONTH.getSelectedItem().toString() + "/" + DATE_OF_COMMISSION_YEAR.getSelectedItem().toString();
        entradas[4] = DATE_OF_PAYMENT_DAY.getSelectedItem().toString() + "/" + DATE_OF_PAYMENT_MONTH.getSelectedItem().toString() + "/" + DATE_OF_PAYMENT_YEAR.getSelectedItem().toString();
        entradas[5] = INVOICE_NUMBER_NUMBER.getText();
        entradas[6] = PRICE_CHARGED_CURRENCY.getSelectedItem().toString();
        entradas[7] = PRICE_CHARGED_AMMOUNT.getText();
        entradas[8] = novo.GetText();
        if(COMMISSION_COMPLETE_YES.isSelected()==true){
            entradas[9] = COMMISSION_COMPLETE_YES.getText();
        }else{
            entradas[9] = COMMISSION_COMPLETE_NO.getText();
        }
        Customer cus = new Customer(entradas[0], MOC, entradas[2], entradas[3], entradas[4], entradas[5], entradas[6], entradas[7], entradas[8], entradas[9]);
        ManageCustomerList.AddCustomer(cus);
        ArchiveCustomer.WriteFile();
        JOptionPane.showMessageDialog(new JFrame(), "Successfully added!");
    }//GEN-LAST:event_SAVE_BUTTONActionPerformed

    private void OPEN_DETAILS_WINDOW_BUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OPEN_DETAILS_WINDOW_BUTTONActionPerformed
        novo.setVisible(true);
    }//GEN-LAST:event_OPEN_DETAILS_WINDOW_BUTTONActionPerformed

    private void LIST_CUSTOMERS_BUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LIST_CUSTOMERS_BUTTONActionPerformed
        ComboBoxUI comb = new ComboBoxUI();
        comb.setVisible(true);
        comb.setTitle("Customer select");
    }//GEN-LAST:event_LIST_CUSTOMERS_BUTTONActionPerformed

    private void COMMISSION_COMPLETE_NOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_COMMISSION_COMPLETE_NOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_COMMISSION_COMPLETE_NOActionPerformed

    private void COMMISSION_COMPLETE_YESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_COMMISSION_COMPLETE_YESActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_COMMISSION_COMPLETE_YESActionPerformed

    private void DATE_OF_PAYMENT_YEARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DATE_OF_PAYMENT_YEARActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DATE_OF_PAYMENT_YEARActionPerformed

    private void PREVIOUS_COMMISSIONER_NOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PREVIOUS_COMMISSIONER_NOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PREVIOUS_COMMISSIONER_NOActionPerformed

    private void PREVIOUS_COMMISSIONER_YESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PREVIOUS_COMMISSIONER_YESActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PREVIOUS_COMMISSIONER_YESActionPerformed

    private void METHOD_OF_CONTACT_OTHER_TEXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_METHOD_OF_CONTACT_OTHER_TEXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_METHOD_OF_CONTACT_OTHER_TEXTActionPerformed

    private void METHOD_OF_CONTACT_OTHERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_METHOD_OF_CONTACT_OTHERActionPerformed
        if(METHOD_OF_CONTACT_OTHER.isSelected()){
            METHOD_OF_CONTACT_OTHER_TEXT.setEnabled(true);
        }else{
            METHOD_OF_CONTACT_OTHER_TEXT.setEnabled(false);
        }
    }//GEN-LAST:event_METHOD_OF_CONTACT_OTHERActionPerformed

    private void METHOD_OF_CONTACT_DISCORDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_METHOD_OF_CONTACT_DISCORDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_METHOD_OF_CONTACT_DISCORDActionPerformed

    private void USERNAME_TEXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_USERNAME_TEXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_USERNAME_TEXTActionPerformed

    private void jTabbedPane1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MousePressed
        if(jTabbedPane1.getSelectedIndex()==0){
            //jTabbedPane1.setSize(new Dimension(486, 503));
           // princ.ARTIST_TAB.setSize(new Dimension (490, 535));
            princ.setSize(new Dimension(855, 475));
            princ.ARTIST_TRIVIA.setText(princ.SetRandomText());
            //princ.jScrollPane1.setSize(JFrame.MAXIMIZED_HORIZ, JFrame.MAXIMIZED_VERT);
        }else{
            princ.setSize(new Dimension(1055, 600));
            princ.ARTIST_TRIVIA1.setText(princ.SetRandomText());
            //princ.jScrollPane1.setSize(JFrame.MAXIMIZED_HORIZ, JFrame.MAXIMIZED_VERT);
        }
    }//GEN-LAST:event_jTabbedPane1MousePressed

    private void CLEAR_BUTTON_COMMISSIONERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CLEAR_BUTTON_COMMISSIONERActionPerformed
        CreditsUI cd = new CreditsUI();
        cd.setVisible(true);
        cd.setTitle("Credits / All rights reserved");
    }//GEN-LAST:event_CLEAR_BUTTON_COMMISSIONERActionPerformed

    private void SAVE_BUTTON_COMMISSIONERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SAVE_BUTTON_COMMISSIONERActionPerformed
        if(COMMISSION_TITLE_TEXT.getText().equals("Title to show on 'List Commissions'") || COMMISSION_TITLE_TEXT.getText().equals("")){
            JOptionPane.showMessageDialog(new JFrame(), "You need to type a commissions title!");
        }else if(StringUtils.isNumeric(ESTIMATE_PRICE_TEXT.getText())==false || StringUtils.isNumeric(PAID_PRICE_TEXT.getText())==false){
            JOptionPane.showMessageDialog(new JFrame(), "You can only type numbers in the prices entries!");
        }else if(BACKGROUND_INCLUDED_YES.isSelected()==false && BACKGROUND_INCLUDED_NO.isSelected()==false){
            JOptionPane.showMessageDialog(new JFrame(), "You need to select if background is present!");
        }else{
            String[] entradas = new String[17];
            entradas[0] = COMMISSION_TITLE_TEXT.getText();
            entradas[1] = ARTIST_USERNAME_TEXT.getText();
            if(entradas[1].equals("Leave blank if unsure") || entradas[1].equals("")){
                entradas[1]="N/D";
            }
            entradas[2] = tosui.GetTexto();
            int cont=0; //counting the ammount of contact methods
            if(ARTIST_SOCIAL_MEDIA_DA.isSelected()==true){
                cont++;
            }
            if(ARTIST_SOCIAL_MEDIA_FA.isSelected()==true){
                cont++;
            }
            if(ARTIST_SOCIAL_MEDIA_INSTA.isSelected()==true){
                cont++;
            }
            if(ARTIST_SOCIAL_MEDIA_OTHER.isSelected()==true){
                cont++;
            }
            if(ARTIST_SOCIAL_MEDIA_TELEGRAM.isSelected()==true){
                cont++;
            }
            if(ARTIST_SOCIAL_MEDIA_TWITTER.isSelected()==true){
                cont++;
            }
            if(ARTIST_SOCIAL_MEDIA_WPP.isSelected()==true){
                cont++;
            }
            int cont2 = 0;
            String [] ArtistMOCTemp = new String[cont];
            if(ARTIST_SOCIAL_MEDIA_DA.isSelected()==true){
                ArtistMOCTemp[cont2] = ARTIST_SOCIAL_MEDIA_DA.getText();
                cont2++;
            }
            if(ARTIST_SOCIAL_MEDIA_FA.isSelected()==true){
                ArtistMOCTemp[cont2] = ARTIST_SOCIAL_MEDIA_FA.getText();
                cont2++;
            }
            if(ARTIST_SOCIAL_MEDIA_INSTA.isSelected()==true){
                ArtistMOCTemp[cont2] = ARTIST_SOCIAL_MEDIA_INSTA.getText();
                cont2++;
            }
            if(ARTIST_SOCIAL_MEDIA_OTHER.isSelected()==true){
                ArtistMOCTemp[cont2] = ARTIST_SOCIAL_MEDIA_OTHER_TEXT.getText();
                cont2++;
            }
            if(ARTIST_SOCIAL_MEDIA_TELEGRAM.isSelected()==true){
                ArtistMOCTemp[cont2] = ARTIST_SOCIAL_MEDIA_TELEGRAM.getText();
                cont2++;
            }
            if(ARTIST_SOCIAL_MEDIA_TWITTER.isSelected()==true){
                ArtistMOCTemp[cont2] = ARTIST_SOCIAL_MEDIA_TWITTER.getText();
                cont2++;
            }
            if(ARTIST_SOCIAL_MEDIA_WPP.isSelected()==true){
                ArtistMOCTemp[cont2] = ARTIST_SOCIAL_MEDIA_WPP.getText();
                cont2++;
            }
            entradas[3] = ESTIMATE_PRICE_CURRENCY.getSelectedItem().toString();
            entradas[4] = ESTIMATE_PRICE_TEXT.getText();
            entradas[5] = PAID_PRICE_TEXT.getText();
            if(PAYMENT_PLATFORM_BANK.isSelected()){
                entradas[6] = PAYMENT_PLATFORM_BANK.getText();
            }else if(PAYMENT_PLATFORM_OTHER.isSelected()){
                entradas[6] = PAYMENT_PLATFORM_OTHER_TEXT.getText();
            }else if(PAYMENT_PLATFORM_PAYPAL.isSelected()){
                entradas[6] = PAYMENT_PLATFORM_PAYPAL.getText();
            }else if(PAYMENT_PLATFORM_STRIPE.isSelected()){
                entradas[6] = PAYMENT_PLATFORM_STRIPE.getText();
            }else{
                entradas[6] = "N/D";
            }
            entradas[7] = Integer.toString(CHARACTERS_QUANTITY_COMBOBOX.getSelectedIndex());
            int conttemp = 0;
            if(CHARACTERS_QUANTITY_COMBOBOX.getSelectedIndex()==0){
               conttemp = 1;
            }else if(CHARACTERS_QUANTITY_COMBOBOX.getSelectedIndex()==1){
                conttemp = 1;
            }else if(CHARACTERS_QUANTITY_COMBOBOX.getSelectedIndex()==2){
                conttemp = 2;
            }else if(CHARACTERS_QUANTITY_COMBOBOX.getSelectedIndex()==3){
                conttemp = 3;
            }else if(CHARACTERS_QUANTITY_COMBOBOX.getSelectedIndex()==4){
                conttemp = 4;
            }else if(CHARACTERS_QUANTITY_COMBOBOX.getSelectedIndex()==5){
                conttemp = 5;
            }
            String[] CharacterNamesTemp = new String[conttemp];
            if(CHARACTERS_QUANTITY_COMBOBOX.getSelectedIndex()==0){
               CharacterNamesTemp[0] = "N/D";
            }else if(CHARACTERS_QUANTITY_COMBOBOX.getSelectedIndex()==1){
                CharacterNamesTemp[0] = CHARACTER_NAMES_TEXT1.getText();
            }else if(CHARACTERS_QUANTITY_COMBOBOX.getSelectedIndex()==2){
                CharacterNamesTemp[0] = CHARACTER_NAMES_TEXT1.getText();
                CharacterNamesTemp[1] = CHARACTER_NAMES_TEXT2.getText();
            }else if(CHARACTERS_QUANTITY_COMBOBOX.getSelectedIndex()==3){
                CharacterNamesTemp[0] = CHARACTER_NAMES_TEXT1.getText();
                CharacterNamesTemp[1] = CHARACTER_NAMES_TEXT2.getText();
                CharacterNamesTemp[2] = CHARACTER_NAMES_TEXT3.getText();
            }else if(CHARACTERS_QUANTITY_COMBOBOX.getSelectedIndex()==3){
                CharacterNamesTemp[0] = CHARACTER_NAMES_TEXT1.getText();
                CharacterNamesTemp[1] = CHARACTER_NAMES_TEXT2.getText();
                CharacterNamesTemp[2] = CHARACTER_NAMES_TEXT3.getText();
                CharacterNamesTemp[3] = CHARACTER_NAMES_TEXT4.getText();
            }else if(CHARACTERS_QUANTITY_COMBOBOX.getSelectedIndex()==4){
                CharacterNamesTemp[0] = CHARACTER_NAMES_TEXT1.getText();
                CharacterNamesTemp[1] = CHARACTER_NAMES_TEXT2.getText();
                CharacterNamesTemp[2] = CHARACTER_NAMES_TEXT3.getText();
                CharacterNamesTemp[3] = CHARACTER_NAMES_TEXT4.getText();
                CharacterNamesTemp[4] = CHARACTER_NAMES_TEXT5.getText();
            }
            if(CHARACTER_TYPE_BUST.isSelected()==true){
                entradas[8] = CHARACTER_TYPE_BUST.getText();
            }else if(CHARACTER_TYPE_HALFBODY.isSelected()==true){
                entradas[8] = CHARACTER_TYPE_HALFBODY.getText();
            }else if(CHARACTER_TYPE_FULLBODY.isSelected()==true){
                entradas[8] = CHARACTER_TYPE_FULLBODY.getText();
            }else{
                entradas[8] = "N/D";
            }
            if(CHARACTER_LEWDS_SFW.isSelected()==true && CHARACTERS_QUANTITY_COMBOBOX.getSelectedIndex()>0){
                entradas[9] = CHARACTER_LEWDS_SFW.getText();
            }else if(CHARACTER_LEWDS_NSFW.isSelected()==true && CHARACTERS_QUANTITY_COMBOBOX.getSelectedIndex()>0){
                entradas[9] = CHARACTER_LEWDS_NSFW.getText();
            }else{
                entradas[9] = "N/D";
            }
            if(BACKGROUND_INCLUDED_YES.isSelected()==true){
                entradas[10] = "YES";
            }else{
                entradas[10] = "NO";
            }
            if(entradas[10].equals("YES")){
                if(BACKGROUND_TYPE_SIMPLE.isSelected()==true){
                    entradas[11] = BACKGROUND_TYPE_SIMPLE.getText();
                }else if(BACKGROUND_TYPE_DETAILED.isSelected()==true){
                    entradas[11] = BACKGROUND_TYPE_DETAILED.getText();
                }else if(BACKGROUND_TYPE_EXTRADETAILED.isSelected()==true){
                    entradas[11] = BACKGROUND_TYPE_EXTRADETAILED.getText();
                }
            }else{
                entradas[11] = "ND";
            }
            entradas[12] = Cduimain.GetTexto();
            if(WIPS_RECEIVED_YES.isSelected()==true){
                entradas[13] = "YES";
            }else{
                entradas[13] = "NO";
            }
            if(DEADLINE_GIVEN.isSelected()==true){
                entradas[14] = "YES";
            }else{
                entradas[14] = "NO";
            }
            if(entradas[14]=="YES"){
                entradas[15] = DEADLINE_DATE_DAY.getSelectedItem().toString() + "/" + DEADLINE_DATE_MONTH.getSelectedItem().toString() + "/" + DEADLINE_DATE_YEAR.getSelectedItem().toString();
            }else{
                entradas[15] = "N/D";
            }
            entradas[16] = Integer.toString(ManageCommissionerList.ReturnsListSize());
            try{
                buf = javax.imageio.ImageIO.read(wrfui.ReturnsFileChooser().getSelectedFile());
            }catch(Exception e){
                e.printStackTrace();
                System.out.printf("Something went wrong when reading WIP image\n");
            }
            try{
                File wipimg = new File("wipimages/", "wip"+ entradas[0] + entradas[16] + ".jpg");
                wipimg.createNewFile();
            }catch(Exception e){
                e.printStackTrace();
            }
            Commissions com = new Commissions(entradas[0], entradas[1], entradas[2], ArtistMOCTemp, entradas[3], entradas[4], 
            entradas[5], entradas[6], entradas[7], CharacterNamesTemp, entradas[8], entradas[9],
            entradas[10], entradas[11], entradas[12], entradas[13], buf, entradas[14], entradas[15], Integer.parseInt(entradas[16]));
            ManageCommissionerList.AddCommission(com);
            ManageCommissionerArchive.WriteFile();
            JOptionPane.showMessageDialog(new JFrame(), "Successfully added!");
        }
    }//GEN-LAST:event_SAVE_BUTTON_COMMISSIONERActionPerformed

    private void CREDITS_COMMISSIONER_BUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CREDITS_COMMISSIONER_BUTTONActionPerformed
        ARTIST_SOCIAL_MEDIA_DA.setSelected(false);
        ARTIST_SOCIAL_MEDIA_FA.setSelected(false);
        ARTIST_SOCIAL_MEDIA_INSTA.setSelected(false);
        ARTIST_SOCIAL_MEDIA_OTHER.setSelected(false);
        ARTIST_SOCIAL_MEDIA_TELEGRAM.setSelected(false);
        ARTIST_SOCIAL_MEDIA_TWITTER.setSelected(false);
        ARTIST_SOCIAL_MEDIA_WPP.setSelected(false);
        ARTIST_SOCIAL_MEDIA_OTHER_TEXT.setText("");
        ARTIST_SOCIAL_MEDIA_OTHER_TEXT.setEnabled(false);
        novo.SetText("");
        COMMISSION_TITLE_TEXT.setText("");
        WIPS_RECEIVED_BUTTON_GROUP.clearSelection();
        SEND_WIP_BUTTON.setEnabled(false);
        buf = null;
        DEADLINE_BUTTON_GROUP.clearSelection();
        DEADLINE_DATE_DAY.setEnabled(false);
        DEADLINE_DATE_MONTH.setEnabled(false);
        DEADLINE_DATE_YEAR.setEnabled(false);
        CHARACTERS_QUANTITY_COMBOBOX.setSelectedIndex(0);
        CHARACTER_NAMES_TEXT1.setEnabled(false);
        CHARACTER_NAMES_TEXT2.setEnabled(false);
        CHARACTER_NAMES_TEXT3.setEnabled(false);
        CHARACTER_NAMES_TEXT4.setEnabled(false);
        CHARACTER_NAMES_TEXT5.setEnabled(false);
        CHARACTER_NAMES_TEXT1.setText("");
        CHARACTER_NAMES_TEXT2.setText("");
        CHARACTER_NAMES_TEXT3.setText("");
        CHARACTER_NAMES_TEXT4.setText("");
        CHARACTER_NAMES_TEXT5.setText("");
        CHARACTER_TYPE_BUTTON_GROUP.clearSelection();
        LEWDS_BUTTON_GROUP.clearSelection();
        ESTIMATE_PRICE_CURRENCY.setSelectedIndex(248);
        ESTIMATE_PRICE_TEXT.setText("");
        PAID_PRICE_TEXT.setText("");
        PAYMENT_PLATFORM_BUTTON_GROUP.clearSelection();
        PAYMENT_PLATFORM_OTHER_TEXT.setText("");
        PAYMENT_PLATFORM_OTHER_TEXT.setEnabled(false);
        BACKGROUND_INCLUDED_BUTTON_GROUP.clearSelection();
        BACKGROUND_TYPE_BUTTON_GROUP.clearSelection();
        BACKGROUND_TYPE_SIMPLE.setEnabled(false);
        BACKGROUND_TYPE_DETAILED.setEnabled(false);
        BACKGROUND_TYPE_EXTRADETAILED.setEnabled(false);
        Cduimain.SetTexto();
        ARTIST_USERNAME_TEXT.setText("");
        tosui.SetTexto();
    }//GEN-LAST:event_CREDITS_COMMISSIONER_BUTTONActionPerformed

    private void COMMISSION_TITLE_TEXTFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_COMMISSION_TITLE_TEXTFocusGained
        if(COMMISSION_TITLE_TEXT.getText().equals("") || COMMISSION_TITLE_TEXT.getText().equals("Title to show on 'List Commissions'")){
            COMMISSION_TITLE_TEXT.setText("");
            COMMISSION_TITLE_TEXT.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_COMMISSION_TITLE_TEXTFocusGained

    private void COMMISSION_TITLE_TEXTFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_COMMISSION_TITLE_TEXTFocusLost
        if(COMMISSION_TITLE_TEXT.getText().equals("") || COMMISSION_TITLE_TEXT.getText().equals("Title to show on 'List Commissions'")){
            COMMISSION_TITLE_TEXT.setText("Title to show on 'List Commissions'");
            COMMISSION_TITLE_TEXT.setForeground(new Color(102,102,102));
        }
    }//GEN-LAST:event_COMMISSION_TITLE_TEXTFocusLost

    private void CHARACTERS_QUANTITY_COMBOBOXPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_CHARACTERS_QUANTITY_COMBOBOXPropertyChange
    }//GEN-LAST:event_CHARACTERS_QUANTITY_COMBOBOXPropertyChange

    private void CHARACTERS_QUANTITY_COMBOBOXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CHARACTERS_QUANTITY_COMBOBOXActionPerformed
        if(CHARACTERS_QUANTITY_COMBOBOX.getSelectedIndex()==0){
            CHARACTER_NAMES_TEXT1.setEnabled(false);
            CHARACTER_NAMES_TEXT2.setEnabled(false);
            CHARACTER_NAMES_TEXT3.setEnabled(false);
            CHARACTER_NAMES_TEXT4.setEnabled(false);
            CHARACTER_NAMES_TEXT5.setEnabled(false);
            CHARACTER_NAMES_TEXT1.setText("Char. 1");
            CHARACTER_NAMES_TEXT2.setText("Char. 2");
            CHARACTER_NAMES_TEXT3.setText("Char. 3");
            CHARACTER_NAMES_TEXT4.setText("Char. 4");
            CHARACTER_NAMES_TEXT5.setText("Char. 5");
            LEWDS_BUTTON_GROUP.clearSelection();
            CHARACTER_TYPE_BUTTON_GROUP.clearSelection();
            CHARACTER_TYPE_BUST.setEnabled(false);
            CHARACTER_TYPE_HALFBODY.setEnabled(false);
            CHARACTER_TYPE_FULLBODY.setEnabled(false);
            CHARACTER_LEWDS_SFW.setEnabled(false);
            CHARACTER_LEWDS_NSFW.setEnabled(false);
        }else if(CHARACTERS_QUANTITY_COMBOBOX.getSelectedIndex()==1){
            CHARACTER_NAMES_TEXT1.setEnabled(true);
            CHARACTER_NAMES_TEXT2.setEnabled(false);
            CHARACTER_NAMES_TEXT3.setEnabled(false);
            CHARACTER_NAMES_TEXT4.setEnabled(false);
            CHARACTER_NAMES_TEXT5.setEnabled(false);
            CHARACTER_NAMES_TEXT2.setText("Char. 2");
            CHARACTER_NAMES_TEXT3.setText("Char. 3");
            CHARACTER_NAMES_TEXT4.setText("Char. 4");
            CHARACTER_NAMES_TEXT5.setText("Char. 5");
            CHARACTER_TYPE_BUST.setEnabled(true);
            CHARACTER_TYPE_HALFBODY.setEnabled(true);
            CHARACTER_TYPE_FULLBODY.setEnabled(true);
            CHARACTER_LEWDS_SFW.setEnabled(true);
            CHARACTER_LEWDS_NSFW.setEnabled(true);
            CHARACTER_TYPE_BUST.setSelected(true);
            CHARACTER_LEWDS_SFW.setSelected(true);
        }else if(CHARACTERS_QUANTITY_COMBOBOX.getSelectedIndex()==2){
            CHARACTER_NAMES_TEXT1.setEnabled(true);
            CHARACTER_NAMES_TEXT2.setEnabled(true);
            CHARACTER_NAMES_TEXT3.setEnabled(false);
            CHARACTER_NAMES_TEXT4.setEnabled(false);
            CHARACTER_NAMES_TEXT5.setEnabled(false);
            CHARACTER_NAMES_TEXT3.setText("Char. 3");
            CHARACTER_NAMES_TEXT4.setText("Char. 4");
            CHARACTER_NAMES_TEXT5.setText("Char. 5");
            CHARACTER_TYPE_BUST.setEnabled(true);
            CHARACTER_TYPE_HALFBODY.setEnabled(true);
            CHARACTER_TYPE_FULLBODY.setEnabled(true);
            CHARACTER_LEWDS_SFW.setEnabled(true);
            CHARACTER_LEWDS_NSFW.setEnabled(true);
            CHARACTER_TYPE_BUST.setSelected(true);
            CHARACTER_LEWDS_SFW.setSelected(true);
        }else if(CHARACTERS_QUANTITY_COMBOBOX.getSelectedIndex()==3){
            CHARACTER_NAMES_TEXT1.setEnabled(true);
            CHARACTER_NAMES_TEXT2.setEnabled(true);
            CHARACTER_NAMES_TEXT3.setEnabled(true);
            CHARACTER_NAMES_TEXT4.setEnabled(false);
            CHARACTER_NAMES_TEXT5.setEnabled(false);
            CHARACTER_NAMES_TEXT4.setText("Char. 4");
            CHARACTER_NAMES_TEXT5.setText("Char. 5");
            CHARACTER_TYPE_BUST.setEnabled(true);
            CHARACTER_TYPE_HALFBODY.setEnabled(true);
            CHARACTER_TYPE_FULLBODY.setEnabled(true);
            CHARACTER_LEWDS_SFW.setEnabled(true);
            CHARACTER_LEWDS_NSFW.setEnabled(true);
            CHARACTER_TYPE_BUST.setSelected(true);
            CHARACTER_LEWDS_SFW.setSelected(true);
        }else if(CHARACTERS_QUANTITY_COMBOBOX.getSelectedIndex()==4){
            CHARACTER_NAMES_TEXT1.setEnabled(true);
            CHARACTER_NAMES_TEXT2.setEnabled(true);
            CHARACTER_NAMES_TEXT3.setEnabled(true);
            CHARACTER_NAMES_TEXT4.setEnabled(true);
            CHARACTER_NAMES_TEXT5.setEnabled(false);
            CHARACTER_NAMES_TEXT5.setText("Char. 5");
            CHARACTER_TYPE_BUST.setEnabled(true);
            CHARACTER_TYPE_HALFBODY.setEnabled(true);
            CHARACTER_TYPE_FULLBODY.setEnabled(true);
            CHARACTER_LEWDS_SFW.setEnabled(true);
            CHARACTER_LEWDS_NSFW.setEnabled(true);
            CHARACTER_TYPE_BUST.setSelected(true);
            CHARACTER_LEWDS_SFW.setSelected(true);
        }else if(CHARACTERS_QUANTITY_COMBOBOX.getSelectedIndex()==5){
            CHARACTER_NAMES_TEXT1.setEnabled(true);
            CHARACTER_NAMES_TEXT2.setEnabled(true);
            CHARACTER_NAMES_TEXT3.setEnabled(true);
            CHARACTER_NAMES_TEXT4.setEnabled(true);
            CHARACTER_NAMES_TEXT5.setEnabled(true);
            CHARACTER_TYPE_BUST.setEnabled(true);
            CHARACTER_TYPE_HALFBODY.setEnabled(true);
            CHARACTER_TYPE_FULLBODY.setEnabled(true);
            CHARACTER_LEWDS_SFW.setEnabled(true);
            CHARACTER_LEWDS_NSFW.setEnabled(true);
            CHARACTER_TYPE_BUST.setSelected(true);
            CHARACTER_LEWDS_SFW.setSelected(true);
        }
    }//GEN-LAST:event_CHARACTERS_QUANTITY_COMBOBOXActionPerformed

    private void CHARACTER_NAMES_TEXT1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CHARACTER_NAMES_TEXT1FocusGained
        if(CHARACTER_NAMES_TEXT1.getText().equals("") || CHARACTER_NAMES_TEXT1.getText().equals("Char. 1")){
            CHARACTER_NAMES_TEXT1.setText("");
            CHARACTER_NAMES_TEXT1.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_CHARACTER_NAMES_TEXT1FocusGained

    private void CHARACTER_NAMES_TEXT2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CHARACTER_NAMES_TEXT2FocusGained
        if(CHARACTER_NAMES_TEXT2.getText().equals("") || CHARACTER_NAMES_TEXT2.getText().equals("Char. 2")){
            CHARACTER_NAMES_TEXT2.setText("");
            CHARACTER_NAMES_TEXT2.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_CHARACTER_NAMES_TEXT2FocusGained

    private void CHARACTER_NAMES_TEXT3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CHARACTER_NAMES_TEXT3FocusGained
        if(CHARACTER_NAMES_TEXT3.getText().equals("") || CHARACTER_NAMES_TEXT3.getText().equals("Char. 3")){
            CHARACTER_NAMES_TEXT3.setText("");
            CHARACTER_NAMES_TEXT3.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_CHARACTER_NAMES_TEXT3FocusGained

    private void CHARACTER_NAMES_TEXT4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CHARACTER_NAMES_TEXT4FocusGained
        if(CHARACTER_NAMES_TEXT4.getText().equals("") || CHARACTER_NAMES_TEXT4.getText().equals("Char. 4")){
            CHARACTER_NAMES_TEXT4.setText("");
            CHARACTER_NAMES_TEXT4.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_CHARACTER_NAMES_TEXT4FocusGained

    private void CHARACTER_NAMES_TEXT5FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CHARACTER_NAMES_TEXT5FocusGained
        if(CHARACTER_NAMES_TEXT5.getText().equals("") || CHARACTER_NAMES_TEXT5.getText().equals("Char. 5")){
            CHARACTER_NAMES_TEXT5.setText("");
            CHARACTER_NAMES_TEXT5.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_CHARACTER_NAMES_TEXT5FocusGained

    private void CHARACTER_NAMES_TEXT1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CHARACTER_NAMES_TEXT1FocusLost
        if(CHARACTER_NAMES_TEXT1.getText().equals("")){
            CHARACTER_NAMES_TEXT1.setText("Char. 1");
            CHARACTER_NAMES_TEXT1.setForeground(new Color(102,102,102));
        }
    }//GEN-LAST:event_CHARACTER_NAMES_TEXT1FocusLost

    private void CHARACTER_NAMES_TEXT2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CHARACTER_NAMES_TEXT2FocusLost
        if(CHARACTER_NAMES_TEXT2.getText().equals("")){
            CHARACTER_NAMES_TEXT2.setText("Char. 2");
            CHARACTER_NAMES_TEXT2.setForeground(new Color(102,102,102));
        }
    }//GEN-LAST:event_CHARACTER_NAMES_TEXT2FocusLost

    private void CHARACTER_NAMES_TEXT3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CHARACTER_NAMES_TEXT3FocusLost
        if(CHARACTER_NAMES_TEXT3.getText().equals("")){
            CHARACTER_NAMES_TEXT3.setText("Char. 3");
            CHARACTER_NAMES_TEXT3.setForeground(new Color(102,102,102));
        }
    }//GEN-LAST:event_CHARACTER_NAMES_TEXT3FocusLost

    private void CHARACTER_NAMES_TEXT4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CHARACTER_NAMES_TEXT4FocusLost
        if(CHARACTER_NAMES_TEXT4.getText().equals("")){
            CHARACTER_NAMES_TEXT4.setText("Char. 4");
            CHARACTER_NAMES_TEXT4.setForeground(new Color(102,102,102));
        }
    }//GEN-LAST:event_CHARACTER_NAMES_TEXT4FocusLost
    private void CHARACTER_NAMES_TEXT5FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CHARACTER_NAMES_TEXT5FocusLost
        if(CHARACTER_NAMES_TEXT5.getText().equals("")){
            CHARACTER_NAMES_TEXT5.setText("Char. 5");
            CHARACTER_NAMES_TEXT5.setForeground(new Color(102,102,102));
        }
    }//GEN-LAST:event_CHARACTER_NAMES_TEXT5FocusLost

    private void ARTIST_SOCIAL_MEDIA_OTHERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ARTIST_SOCIAL_MEDIA_OTHERActionPerformed
        if(ARTIST_SOCIAL_MEDIA_OTHER.isSelected()){
            ARTIST_SOCIAL_MEDIA_OTHER_TEXT.setEnabled(true);
        } else {
            ARTIST_SOCIAL_MEDIA_OTHER_TEXT.setEnabled(false);
        }
    }//GEN-LAST:event_ARTIST_SOCIAL_MEDIA_OTHERActionPerformed

    private void PAYMENT_PLATFORM_OTHERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PAYMENT_PLATFORM_OTHERActionPerformed
        PAYMENT_PLATFORM_OTHER_TEXT.setEnabled(true);
    }//GEN-LAST:event_PAYMENT_PLATFORM_OTHERActionPerformed

    private void PAYMENT_PLATFORM_OTHERStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_PAYMENT_PLATFORM_OTHERStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_PAYMENT_PLATFORM_OTHERStateChanged

    private void PAYMENT_PLATFORM_OTHERFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PAYMENT_PLATFORM_OTHERFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_PAYMENT_PLATFORM_OTHERFocusGained

    private void PAYMENT_PLATFORM_PAYPALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PAYMENT_PLATFORM_PAYPALActionPerformed
            PAYMENT_PLATFORM_OTHER_TEXT.setEnabled(false);
    }//GEN-LAST:event_PAYMENT_PLATFORM_PAYPALActionPerformed

    private void PAYMENT_PLATFORM_BANKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PAYMENT_PLATFORM_BANKActionPerformed
        PAYMENT_PLATFORM_OTHER_TEXT.setEnabled(false);
    }//GEN-LAST:event_PAYMENT_PLATFORM_BANKActionPerformed

    private void PAYMENT_PLATFORM_STRIPEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PAYMENT_PLATFORM_STRIPEActionPerformed
        PAYMENT_PLATFORM_OTHER_TEXT.setEnabled(false);
    }//GEN-LAST:event_PAYMENT_PLATFORM_STRIPEActionPerformed

    private void DEADLINE_GIVENActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DEADLINE_GIVENActionPerformed
        DEADLINE_DATE_DAY.setEnabled(true);
        DEADLINE_DATE_MONTH.setEnabled(true);
        DEADLINE_DATE_YEAR.setEnabled(true);
    }//GEN-LAST:event_DEADLINE_GIVENActionPerformed

    private void DEADLINE_NOTGIVENActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DEADLINE_NOTGIVENActionPerformed
        DEADLINE_DATE_DAY.setEnabled(false);
        DEADLINE_DATE_MONTH.setEnabled(false);
        DEADLINE_DATE_YEAR.setEnabled(false);
    }//GEN-LAST:event_DEADLINE_NOTGIVENActionPerformed

    private void ARTIST_TOS_BUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ARTIST_TOS_BUTTONActionPerformed
        tosui.setVisible(true);
    }//GEN-LAST:event_ARTIST_TOS_BUTTONActionPerformed

    private void DETAILS_BUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DETAILS_BUTTONActionPerformed
        Cduimain.setVisible(true);
    }//GEN-LAST:event_DETAILS_BUTTONActionPerformed

    private void SEND_WIP_BUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SEND_WIP_BUTTONActionPerformed
        int returnvalue = wrfui.ReturnsFileChooser().showOpenDialog(this.wrfui);
        if(returnvalue == JFileChooser.APPROVE_OPTION) {
        }
    }//GEN-LAST:event_SEND_WIP_BUTTONActionPerformed

    private void LIST_COMMISSIONS_BUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LIST_COMMISSIONS_BUTTONActionPerformed
        ListCommissionsUI LCUI = new ListCommissionsUI();
        LCUI.setTitle("Commissions list");
        LCUI.setVisible(true);
    }//GEN-LAST:event_LIST_COMMISSIONS_BUTTONActionPerformed

    private void BACKGROUND_INCLUDED_YESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BACKGROUND_INCLUDED_YESActionPerformed
        BACKGROUND_TYPE_SIMPLE.setEnabled(true);
        BACKGROUND_TYPE_DETAILED.setEnabled(true);
        BACKGROUND_TYPE_EXTRADETAILED.setEnabled(true);
    }//GEN-LAST:event_BACKGROUND_INCLUDED_YESActionPerformed

    private void BACKGROUND_INCLUDED_NOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BACKGROUND_INCLUDED_NOActionPerformed
        BACKGROUND_TYPE_SIMPLE.setEnabled(false);
        BACKGROUND_TYPE_DETAILED.setEnabled(false);
        BACKGROUND_TYPE_EXTRADETAILED.setEnabled(false);
        BACKGROUND_TYPE_BUTTON_GROUP.clearSelection();
    }//GEN-LAST:event_BACKGROUND_INCLUDED_NOActionPerformed

    private void WIPS_RECEIVED_YESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WIPS_RECEIVED_YESActionPerformed
        SEND_WIP_BUTTON.setEnabled(true);
    }//GEN-LAST:event_WIPS_RECEIVED_YESActionPerformed

    private void WIPS_RECEIVED_NOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WIPS_RECEIVED_NOActionPerformed
        SEND_WIP_BUTTON.setEnabled(false);
    }//GEN-LAST:event_WIPS_RECEIVED_NOActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                princ.setVisible(true);
                princ.setTitle("Tartarus - Written by Soerakraven");
                princ.jTabbedPane1.setFont(new Font( "Dialog", Font.BOLD|Font.ITALIC, 18));
                princ.setSize(new Dimension(855, 475));
                princ.COMMISSION_TITLE_TEXT.setForeground(new Color(102,102,102));
                princ.ARTIST_USERNAME_TEXT.setForeground(new Color(102,102,102));
                princ.CHARACTER_NAMES_TEXT1.setForeground(new Color(102,102,102));
                princ.CHARACTER_NAMES_TEXT2.setForeground(new Color(102,102,102));
                princ.CHARACTER_NAMES_TEXT3.setForeground(new Color(102,102,102));
                princ.CHARACTER_NAMES_TEXT4.setForeground(new Color(102,102,102));
                princ.CHARACTER_NAMES_TEXT5.setForeground(new Color(102,102,102));
                princ.DEADLINE_DATE_DAY.setEnabled(false);
                princ.DEADLINE_DATE_MONTH.setEnabled(false);
                princ.DEADLINE_DATE_YEAR.setEnabled(false);
                princ.Cduimain.setTitle("Commission Details");
                princ.wrfui.setTitle("Upload WIP");
                princ.tosui.setTitle("Artist Therms of Service");
                princ.ARTIST_TRIVIA.setText(princ.SetRandomText());
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ARTIST_COMPLETION_PANEL;
    private javax.swing.JPanel ARTIST_DATE_PANEL;
    private javax.swing.JPanel ARTIST_DETAILS_PANEL;
    private javax.swing.JPanel ARTIST_MOC_PANEL;
    private javax.swing.JPanel ARTIST_PAYMENT_PANEL;
    private javax.swing.JPanel ARTIST_PREVIOUS_PANEL;
    private javax.swing.JLabel ARTIST_SOCIAL_MEDIA;
    private javax.swing.JCheckBox ARTIST_SOCIAL_MEDIA_DA;
    private javax.swing.JCheckBox ARTIST_SOCIAL_MEDIA_FA;
    private javax.swing.JCheckBox ARTIST_SOCIAL_MEDIA_INSTA;
    private javax.swing.JCheckBox ARTIST_SOCIAL_MEDIA_OTHER;
    private javax.swing.JTextField ARTIST_SOCIAL_MEDIA_OTHER_TEXT;
    private javax.swing.JCheckBox ARTIST_SOCIAL_MEDIA_TELEGRAM;
    private javax.swing.JCheckBox ARTIST_SOCIAL_MEDIA_TWITTER;
    private javax.swing.JCheckBox ARTIST_SOCIAL_MEDIA_WPP;
    private javax.swing.JPanel ARTIST_TAB;
    private javax.swing.JLabel ARTIST_TOS;
    private javax.swing.JButton ARTIST_TOS_BUTTON;
    private javax.swing.JLabel ARTIST_TRIVIA;
    private javax.swing.JLabel ARTIST_TRIVIA1;
    private javax.swing.JPanel ARTIST_TRIVIA_PANEL;
    private javax.swing.JPanel ARTIST_TRIVIA_PANEL1;
    private javax.swing.JLabel ARTIST_USERNAME;
    private javax.swing.JPanel ARTIST_USERNAME_PANEL;
    private javax.swing.JTextField ARTIST_USERNAME_TEXT;
    private javax.swing.JLabel BACKGROUND_INCLUDED;
    private javax.swing.ButtonGroup BACKGROUND_INCLUDED_BUTTON_GROUP;
    private javax.swing.JRadioButton BACKGROUND_INCLUDED_NO;
    private javax.swing.JRadioButton BACKGROUND_INCLUDED_YES;
    private javax.swing.JPanel BACKGROUND_PANEL;
    private javax.swing.JLabel BACKGROUND_TYPE;
    private javax.swing.ButtonGroup BACKGROUND_TYPE_BUTTON_GROUP;
    private javax.swing.JRadioButton BACKGROUND_TYPE_DETAILED;
    private javax.swing.JRadioButton BACKGROUND_TYPE_EXTRADETAILED;
    private javax.swing.JRadioButton BACKGROUND_TYPE_SIMPLE;
    private javax.swing.JLabel BARRINHA1;
    private javax.swing.JLabel BARRINHA2;
    private javax.swing.JLabel BARRINHA3;
    private javax.swing.JLabel BARRINHA4;
    private javax.swing.ButtonGroup CHARACTERS_BUTTON_GROUP;
    private javax.swing.JLabel CHARACTERS_QUANTITY;
    private javax.swing.JComboBox<String> CHARACTERS_QUANTITY_COMBOBOX;
    private javax.swing.JLabel CHARACTER_LEWDS;
    private javax.swing.JRadioButton CHARACTER_LEWDS_NSFW;
    private javax.swing.JRadioButton CHARACTER_LEWDS_SFW;
    private javax.swing.JLabel CHARACTER_NAMES;
    private javax.swing.JTextField CHARACTER_NAMES_TEXT1;
    private javax.swing.JTextField CHARACTER_NAMES_TEXT2;
    private javax.swing.JTextField CHARACTER_NAMES_TEXT3;
    private javax.swing.JTextField CHARACTER_NAMES_TEXT4;
    private javax.swing.JTextField CHARACTER_NAMES_TEXT5;
    private javax.swing.JPanel CHARACTER_PANEL;
    private javax.swing.JLabel CHARACTER_TYPE;
    private javax.swing.JRadioButton CHARACTER_TYPE_BUST;
    private javax.swing.ButtonGroup CHARACTER_TYPE_BUTTON_GROUP;
    private javax.swing.JRadioButton CHARACTER_TYPE_FULLBODY;
    private javax.swing.JRadioButton CHARACTER_TYPE_HALFBODY;
    private javax.swing.JButton CLEAR_BUTTON;
    private javax.swing.JButton CLEAR_BUTTON_COMMISSIONER;
    private javax.swing.JPanel COMMISSIONER_TAB;
    private javax.swing.JLabel COMMISSION_COMPLETE;
    private javax.swing.ButtonGroup COMMISSION_COMPLETE_BUTTON_GROUP;
    private javax.swing.JRadioButton COMMISSION_COMPLETE_NO;
    private javax.swing.JRadioButton COMMISSION_COMPLETE_YES;
    private javax.swing.JLabel COMMISSION_TITLE;
    private javax.swing.JTextField COMMISSION_TITLE_TEXT;
    private javax.swing.JPanel COMPLETION_STATUS_PANEL;
    private javax.swing.JButton CREDITS_BUTTON;
    private javax.swing.JButton CREDITS_COMMISSIONER_BUTTON;
    private javax.swing.JLabel DATE_OF_COMMISSION;
    private javax.swing.JComboBox<String> DATE_OF_COMMISSION_DAY;
    private javax.swing.JComboBox<String> DATE_OF_COMMISSION_MONTH;
    private javax.swing.JComboBox<String> DATE_OF_COMMISSION_YEAR;
    private javax.swing.JLabel DATE_OF_PAYMENT;
    private javax.swing.JComboBox<String> DATE_OF_PAYMENT_DAY;
    private javax.swing.JComboBox<String> DATE_OF_PAYMENT_MONTH;
    private javax.swing.JComboBox<String> DATE_OF_PAYMENT_YEAR;
    private javax.swing.JLabel DEADLINE;
    private javax.swing.ButtonGroup DEADLINE_BUTTON_GROUP;
    private javax.swing.JComboBox<String> DEADLINE_DATE_DAY;
    private javax.swing.JComboBox<String> DEADLINE_DATE_MONTH;
    private javax.swing.JComboBox<String> DEADLINE_DATE_YEAR;
    private javax.swing.JRadioButton DEADLINE_GIVEN;
    private javax.swing.JRadioButton DEADLINE_NOTGIVEN;
    private javax.swing.JLabel DETAILS;
    private javax.swing.JButton DETAILS_BUTTON;
    private javax.swing.JPanel DETAILS_PANEL;
    private javax.swing.JLabel ESTIMATE_PRICE;
    private javax.swing.JComboBox<String> ESTIMATE_PRICE_CURRENCY;
    private javax.swing.JTextField ESTIMATE_PRICE_TEXT;
    private javax.swing.JLabel INVOICE_NUMBER;
    private javax.swing.JTextField INVOICE_NUMBER_NUMBER;
    private javax.swing.ButtonGroup LEWDS_BUTTON_GROUP;
    private javax.swing.JButton LIST_COMMISSIONS_BUTTON;
    private javax.swing.JButton LIST_CUSTOMERS_BUTTON;
    private javax.swing.JLabel METHOD_OF_CONTACT;
    private javax.swing.JCheckBox METHOD_OF_CONTACT_DA;
    private javax.swing.JCheckBox METHOD_OF_CONTACT_DISCORD;
    private javax.swing.JCheckBox METHOD_OF_CONTACT_FA;
    private javax.swing.JCheckBox METHOD_OF_CONTACT_OTHER;
    private javax.swing.JTextField METHOD_OF_CONTACT_OTHER_TEXT;
    private javax.swing.JCheckBox METHOD_OF_CONTACT_TELEGRAM;
    private javax.swing.JPanel MOC_PANEL;
    private javax.swing.JButton OPEN_DETAILS_WINDOW_BUTTON;
    private javax.swing.JLabel PAID_PRICE;
    private javax.swing.JTextField PAID_PRICE_TEXT;
    private javax.swing.JLabel PAYMENT_PLATFORM;
    private javax.swing.JRadioButton PAYMENT_PLATFORM_BANK;
    private javax.swing.ButtonGroup PAYMENT_PLATFORM_BUTTON_GROUP;
    private javax.swing.JRadioButton PAYMENT_PLATFORM_OTHER;
    private javax.swing.JTextField PAYMENT_PLATFORM_OTHER_TEXT;
    private javax.swing.JRadioButton PAYMENT_PLATFORM_PAYPAL;
    private javax.swing.JRadioButton PAYMENT_PLATFORM_STRIPE;
    private javax.swing.ButtonGroup PREVIOUS_COMISSIONER_BUTTON_GROUP;
    private javax.swing.JLabel PREVIOUS_COMMISSIONER;
    private javax.swing.JRadioButton PREVIOUS_COMMISSIONER_NO;
    private javax.swing.JRadioButton PREVIOUS_COMMISSIONER_YES;
    private javax.swing.JLabel PRICE_CHARGED;
    private javax.swing.JTextField PRICE_CHARGED_AMMOUNT;
    private javax.swing.JComboBox<String> PRICE_CHARGED_CURRENCY;
    private javax.swing.JPanel PRICE_PANEL;
    private javax.swing.JButton SAVE_BUTTON;
    private javax.swing.JButton SAVE_BUTTON_COMMISSIONER;
    private javax.swing.JButton SEND_WIP_BUTTON;
    private javax.swing.JPanel TITLE_PANEL;
    private javax.swing.JLabel USERNAME;
    private javax.swing.JPanel USERNAME_PANEL;
    private javax.swing.JTextField USERNAME_TEXT;
    private javax.swing.JLabel WIPS_RECEIVED;
    private javax.swing.ButtonGroup WIPS_RECEIVED_BUTTON_GROUP;
    private javax.swing.JRadioButton WIPS_RECEIVED_NO;
    private javax.swing.JRadioButton WIPS_RECEIVED_YES;
    private javax.swing.JLabel WRITTEN_DETAILS;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
