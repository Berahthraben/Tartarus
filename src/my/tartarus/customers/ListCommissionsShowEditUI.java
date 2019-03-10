/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.tartarus.customers;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.apache.commons.lang3.StringUtils;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import java.awt.*;

/**
 *
 * @author Soerakraven
 */
public class ListCommissionsShowEditUI extends javax.swing.JFrame {
    public static CommissionerDetailsUI cdui = new CommissionerDetailsUI();
    TOSUI tosui = new TOSUI();
    int index = 0;
    public java.awt.image.BufferedImage buf = null;
    public WipsReceivedFileUI wrfui = new WipsReceivedFileUI();
    ListCommissionsShowWipUI LCSWUI = new ListCommissionsShowWipUI();
    public static TOSUI ts = new TOSUI();
    /**
     * Creates new form temptest
     */
    public ListCommissionsShowEditUI() {
        initComponents();
    }
    public static void HideTOSUI(){
        ts.setVisible(false);
    }
    public static void HideCDUI(){
        cdui.setVisible(false);
    }
    public void WritesCommissionInfo(int index){
        this.index = index;
        Commissions cm = new Commissions();
        cm = ManageCommissionerList.comms.get(index);
        COMMISSION_TITLE_TEXT.setText(cm.GetCommissionTitle());
        ARTIST_USERNAME_TEXT.setText(cm.GetArtistusername());
        cdui.SetTextoPrevious(cm.GetTOS());
        for(int i=0;i<cm.GetArtistMOC().length;i++){
            if(cm.GetArtistMOC()[i].equals("DeviantArt")){
                ARTIST_SOCIAL_MEDIA_DA.setSelected(true);
            }else if(cm.GetArtistMOC()[i].equals("Instagram")){
                ARTIST_SOCIAL_MEDIA_INSTA.setSelected(true);
            }else if(cm.GetArtistMOC()[i].equals("FurAffinity")){
                ARTIST_SOCIAL_MEDIA_FA.setSelected(true);
            }else if(cm.GetArtistMOC()[i].equals("WhatsApp")){
                ARTIST_SOCIAL_MEDIA_WPP.setSelected(true);
            }else if(cm.GetArtistMOC()[i].equals("Telegram")){
                ARTIST_SOCIAL_MEDIA_TELEGRAM.setSelected(true);
            }else if(cm.GetArtistMOC()[i].equals("Twitter")){
                ARTIST_SOCIAL_MEDIA_TWITTER.setSelected(true);
            }else{
                ARTIST_SOCIAL_MEDIA_OTHER.setSelected(true);
                ARTIST_SOCIAL_MEDIA_OTHER_TEXT.setText(cm.GetArtistMOC()[i]);
            }
        }
        ESTIMATE_PRICE_CURRENCY.setSelectedIndex(ManageCommissionerList.ReturnsCurrencyIndex(cm.GetEstimatePriceCurrency()));
        ESTIMATE_PRICE_TEXT.setText(cm.GetEstimatePrice());
        PAID_PRICE_TEXT.setText(cm.GetPricePaid());
        if(cm.GetPaymentPlatform().equals("Paypal")==true){
            PAYMENT_PLATFORM_PAYPAL.setSelected(true);
        }else if(cm.GetPaymentPlatform().equals("Bank Deposit")==true){
            PAYMENT_PLATFORM_BANK.setSelected(true);
        }else if(cm.GetPaymentPlatform().equals("Stripe")==true){
            PAYMENT_PLATFORM_STRIPE.setSelected(true);
        }else if(cm.GetPaymentPlatform().equals("N/D")==true){
            
        }else{
            PAYMENT_PLATFORM_OTHER.setSelected(true);
            PAYMENT_PLATFORM_OTHER_TEXT.setText(cm.GetPaymentPlatform());
        }
        System.out.printf("%s", cm.GetCharacterCount());
        CHARACTERS_QUANTITY_COMBOBOX.setSelectedIndex(ManageCommissionerList.ReturnsCharactersQtyIndex(cm.GetCharacterCount()));
        if(CHARACTERS_QUANTITY_COMBOBOX.getSelectedIndex()==0){
            
        }else if(CHARACTERS_QUANTITY_COMBOBOX.getSelectedIndex()==1){
            CHARACTER_NAMES_TEXT1.setText(cm.GetCharacterNames()[0]);
        }else if(CHARACTERS_QUANTITY_COMBOBOX.getSelectedIndex()==2){
            CHARACTER_NAMES_TEXT1.setText(cm.GetCharacterNames()[0]);
            CHARACTER_NAMES_TEXT2.setText(cm.GetCharacterNames()[1]);
        }else if(CHARACTERS_QUANTITY_COMBOBOX.getSelectedIndex()==3){
            CHARACTER_NAMES_TEXT1.setText(cm.GetCharacterNames()[0]);
            CHARACTER_NAMES_TEXT2.setText(cm.GetCharacterNames()[1]);
            CHARACTER_NAMES_TEXT3.setText(cm.GetCharacterNames()[2]);
        }else if(CHARACTERS_QUANTITY_COMBOBOX.getSelectedIndex()==4){
            CHARACTER_NAMES_TEXT1.setText(cm.GetCharacterNames()[0]);
            CHARACTER_NAMES_TEXT2.setText(cm.GetCharacterNames()[1]);
            CHARACTER_NAMES_TEXT3.setText(cm.GetCharacterNames()[2]);
            CHARACTER_NAMES_TEXT4.setText(cm.GetCharacterNames()[3]);
        }else{
            CHARACTER_NAMES_TEXT1.setText(cm.GetCharacterNames()[0]);
            CHARACTER_NAMES_TEXT2.setText(cm.GetCharacterNames()[1]);
            CHARACTER_NAMES_TEXT3.setText(cm.GetCharacterNames()[2]);
            CHARACTER_NAMES_TEXT4.setText(cm.GetCharacterNames()[3]);
            CHARACTER_NAMES_TEXT5.setText(cm.GetCharacterNames()[4]);
        }
        if(cm.GetCharacterType().equals("N/D.")==true){
            
        }else if(cm.GetCharacterType().equals("Bust/Headshot")==true){
            CHARACTER_TYPE_BUST.setSelected(true);
        }else if(cm.GetCharacterType().equals("Halfbody")==true){
            CHARACTER_TYPE_HALFBODY.setSelected(true);
        }else if(cm.GetCharacterType().equals("Fullbody")==true){
            CHARACTER_TYPE_FULLBODY.setSelected(true);
        }
        if(cm.GetLewds().equals("N/D")==true){
            
        }else if(cm.GetLewds().equals("SFW")==true){
            CHARACTER_LEWDS_SFW.setSelected(true);
        }else if(cm.GetLewds().equals("NSFW")==true){
            CHARACTER_LEWDS_NSFW.setSelected(false);
        }
        if(cm.GetBackgroundIncluded().equals("YES")==true){
            BACKGROUND_INCLUDED_YES.setSelected(true);
        }else{
            BACKGROUND_INCLUDED_NO.setSelected(true);
        }
        if(cm.GetTypeBackground().equals("N/D")==true){
            
        }else if(cm.GetTypeBackground().equals("Simple")==true){
            BACKGROUND_TYPE_SIMPLE.setSelected(true);
        }else if(cm.GetTypeBackground().equals("Detailed")==true){
            BACKGROUND_TYPE_DETAILED.setSelected(true);
        }else if(cm.GetTypeBackground().equals("Extra-Detailed")==true){
            BACKGROUND_TYPE_EXTRADETAILED.setSelected(true);
        }
        tosui.SetTextoPrevious(cm.GetDetails());
        if(cm.GetWipReceived().equals("YES")==true){
            WIPS_RECEIVED_YES.setSelected(true);
        }else{
            WIPS_RECEIVED_NO.setSelected(true);
        }
        String day = ManageCommissionerList.ReturnsDateDay(cm.GetDeadlineDate());
        String month = ManageCommissionerList.ReturnsDateMonth(cm.GetDeadlineDate());
        String year = ManageCommissionerList.ReturnsDateYear(cm.GetDeadlineDate());
        if(cm.GetDeadLineGiven().equals("YES")==true){
            DEADLINE_GIVEN.setSelected(true);
            DEADLINE_DATE_DAY.setSelectedIndex(ManageCommissionerList.ReturnsDeadlineDateDayIndex(day));
            DEADLINE_DATE_MONTH.setSelectedIndex(ManageCommissionerList.ReturnsDeadlineDateDayIndex(month));
            DEADLINE_DATE_YEAR.setSelectedIndex(ManageCommissionerList.ReturnsDeadlineDateDayIndex(year));
        }else{
            DEADLINE_NOTGIVEN.setSelected(true);
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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        BACKGROUND_PANEL = new javax.swing.JPanel();
        BACKGROUND_INCLUDED = new javax.swing.JLabel();
        BACKGROUND_INCLUDED_YES = new javax.swing.JRadioButton();
        BACKGROUND_INCLUDED_NO = new javax.swing.JRadioButton();
        BACKGROUND_TYPE = new javax.swing.JLabel();
        BACKGROUND_TYPE_SIMPLE = new javax.swing.JRadioButton();
        BACKGROUND_TYPE_DETAILED = new javax.swing.JRadioButton();
        BACKGROUND_TYPE_EXTRADETAILED = new javax.swing.JRadioButton();
        USERNAME_PANEL = new javax.swing.JPanel();
        ARTIST_USERNAME_TEXT = new javax.swing.JTextField();
        ARTIST_USERNAME = new javax.swing.JLabel();
        ARTIST_TOS = new javax.swing.JLabel();
        ARTIST_TOS_BUTTON = new javax.swing.JButton();
        TITLE_PANEL = new javax.swing.JPanel();
        COMMISSION_TITLE = new javax.swing.JLabel();
        COMMISSION_TITLE_TEXT = new javax.swing.JTextField();
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
        DETAILS_PANEL = new javax.swing.JPanel();
        DETAILS = new javax.swing.JLabel();
        DETAILS_BUTTON = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButton1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jButton1.setText("SAVE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jButton2.setText("CANCEL");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

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

        CHARACTER_TYPE_BUTTON_GROUP.add(BACKGROUND_TYPE_SIMPLE);
        BACKGROUND_TYPE_SIMPLE.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        BACKGROUND_TYPE_SIMPLE.setText("Simple");

        CHARACTER_TYPE_BUTTON_GROUP.add(BACKGROUND_TYPE_DETAILED);
        BACKGROUND_TYPE_DETAILED.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        BACKGROUND_TYPE_DETAILED.setText("Detailed");

        CHARACTER_TYPE_BUTTON_GROUP.add(BACKGROUND_TYPE_EXTRADETAILED);
        BACKGROUND_TYPE_EXTRADETAILED.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        BACKGROUND_TYPE_EXTRADETAILED.setText("Extra-Detailed");

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

        USERNAME_PANEL.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Username"));

        ARTIST_USERNAME_TEXT.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
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
                    .addComponent(ARTIST_TOS_BUTTON, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE))
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

        TITLE_PANEL.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Title"));

        COMMISSION_TITLE.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        COMMISSION_TITLE.setText("Commission Title");

        COMMISSION_TITLE_TEXT.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
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
                .addComponent(COMMISSION_TITLE_TEXT)
                .addContainerGap())
        );
        TITLE_PANELLayout.setVerticalGroup(
            TITLE_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TITLE_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(COMMISSION_TITLE)
                .addComponent(COMMISSION_TITLE_TEXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addContainerGap(16, Short.MAX_VALUE))
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

        CHARACTER_TYPE_BUTTON_GROUP.add(CHARACTER_TYPE_HALFBODY);
        CHARACTER_TYPE_HALFBODY.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        CHARACTER_TYPE_HALFBODY.setText("Halfbody");

        CHARACTER_TYPE_BUTTON_GROUP.add(CHARACTER_TYPE_FULLBODY);
        CHARACTER_TYPE_FULLBODY.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        CHARACTER_TYPE_FULLBODY.setText("Fullbody");

        CHARACTER_LEWDS.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        CHARACTER_LEWDS.setText("Lewds?");

        LEWDS_BUTTON_GROUP.add(CHARACTER_LEWDS_SFW);
        CHARACTER_LEWDS_SFW.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        CHARACTER_LEWDS_SFW.setText("SFW");

        LEWDS_BUTTON_GROUP.add(CHARACTER_LEWDS_NSFW);
        CHARACTER_LEWDS_NSFW.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        CHARACTER_LEWDS_NSFW.setText("NSFW");

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
                        .addGap(0, 3, Short.MAX_VALUE)))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGap(0, 0, 0))
        );

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(USERNAME_PANEL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MOC_PANEL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(TITLE_PANEL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BACKGROUND_PANEL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PRICE_PANEL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(COMPLETION_STATUS_PANEL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CHARACTER_PANEL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DETAILS_PANEL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(373, 373, 373)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(USERNAME_PANEL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MOC_PANEL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PRICE_PANEL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(COMPLETION_STATUS_PANEL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BACKGROUND_PANEL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TITLE_PANEL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DETAILS_PANEL, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CHARACTER_PANEL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void ARTIST_USERNAME_TEXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ARTIST_USERNAME_TEXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ARTIST_USERNAME_TEXTActionPerformed

    private void ARTIST_TOS_BUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ARTIST_TOS_BUTTONActionPerformed
        Commissions cm = new Commissions();
        cm = ManageCommissionerList.comms.get(index);
        ts.setVisible(true);
        ts.SetTextoPrevious(cm.GetTOS());
    }//GEN-LAST:event_ARTIST_TOS_BUTTONActionPerformed

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

    private void PAYMENT_PLATFORM_PAYPALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PAYMENT_PLATFORM_PAYPALActionPerformed
        PAYMENT_PLATFORM_OTHER_TEXT.setEnabled(false);
    }//GEN-LAST:event_PAYMENT_PLATFORM_PAYPALActionPerformed

    private void PAYMENT_PLATFORM_BANKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PAYMENT_PLATFORM_BANKActionPerformed
        PAYMENT_PLATFORM_OTHER_TEXT.setEnabled(false);
    }//GEN-LAST:event_PAYMENT_PLATFORM_BANKActionPerformed

    private void PAYMENT_PLATFORM_STRIPEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PAYMENT_PLATFORM_STRIPEActionPerformed
        PAYMENT_PLATFORM_OTHER_TEXT.setEnabled(false);
    }//GEN-LAST:event_PAYMENT_PLATFORM_STRIPEActionPerformed

    private void PAYMENT_PLATFORM_OTHERStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_PAYMENT_PLATFORM_OTHERStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_PAYMENT_PLATFORM_OTHERStateChanged

    private void PAYMENT_PLATFORM_OTHERFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PAYMENT_PLATFORM_OTHERFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_PAYMENT_PLATFORM_OTHERFocusGained

    private void PAYMENT_PLATFORM_OTHERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PAYMENT_PLATFORM_OTHERActionPerformed
        PAYMENT_PLATFORM_OTHER_TEXT.setEnabled(true);
    }//GEN-LAST:event_PAYMENT_PLATFORM_OTHERActionPerformed

    private void ARTIST_SOCIAL_MEDIA_OTHERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ARTIST_SOCIAL_MEDIA_OTHERActionPerformed
        if(ARTIST_SOCIAL_MEDIA_OTHER.isSelected()){
            ARTIST_SOCIAL_MEDIA_OTHER_TEXT.setEnabled(true);
        } else {
            ARTIST_SOCIAL_MEDIA_OTHER_TEXT.setEnabled(false);
        }
    }//GEN-LAST:event_ARTIST_SOCIAL_MEDIA_OTHERActionPerformed

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

    private void CHARACTERS_QUANTITY_COMBOBOXPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_CHARACTERS_QUANTITY_COMBOBOXPropertyChange

    }//GEN-LAST:event_CHARACTERS_QUANTITY_COMBOBOXPropertyChange

    private void CHARACTER_NAMES_TEXT1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CHARACTER_NAMES_TEXT1FocusGained
        if(CHARACTER_NAMES_TEXT1.getText().equals("") || CHARACTER_NAMES_TEXT1.getText().equals("Char. 1")){
            CHARACTER_NAMES_TEXT1.setText("");
            CHARACTER_NAMES_TEXT1.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_CHARACTER_NAMES_TEXT1FocusGained

    private void CHARACTER_NAMES_TEXT1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CHARACTER_NAMES_TEXT1FocusLost
        if(CHARACTER_NAMES_TEXT1.getText().equals("")){
            CHARACTER_NAMES_TEXT1.setText("Char. 1");
            CHARACTER_NAMES_TEXT1.setForeground(new Color(102,102,102));
        }
    }//GEN-LAST:event_CHARACTER_NAMES_TEXT1FocusLost

    private void CHARACTER_NAMES_TEXT2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CHARACTER_NAMES_TEXT2FocusGained
        if(CHARACTER_NAMES_TEXT2.getText().equals("") || CHARACTER_NAMES_TEXT2.getText().equals("Char. 2")){
            CHARACTER_NAMES_TEXT2.setText("");
            CHARACTER_NAMES_TEXT2.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_CHARACTER_NAMES_TEXT2FocusGained

    private void CHARACTER_NAMES_TEXT2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CHARACTER_NAMES_TEXT2FocusLost
        if(CHARACTER_NAMES_TEXT2.getText().equals("")){
            CHARACTER_NAMES_TEXT2.setText("Char. 2");
            CHARACTER_NAMES_TEXT2.setForeground(new Color(102,102,102));
        }
    }//GEN-LAST:event_CHARACTER_NAMES_TEXT2FocusLost

    private void CHARACTER_NAMES_TEXT3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CHARACTER_NAMES_TEXT3FocusGained
        if(CHARACTER_NAMES_TEXT3.getText().equals("") || CHARACTER_NAMES_TEXT3.getText().equals("Char. 3")){
            CHARACTER_NAMES_TEXT3.setText("");
            CHARACTER_NAMES_TEXT3.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_CHARACTER_NAMES_TEXT3FocusGained

    private void CHARACTER_NAMES_TEXT3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CHARACTER_NAMES_TEXT3FocusLost
        if(CHARACTER_NAMES_TEXT3.getText().equals("")){
            CHARACTER_NAMES_TEXT3.setText("Char. 3");
            CHARACTER_NAMES_TEXT3.setForeground(new Color(102,102,102));
        }
    }//GEN-LAST:event_CHARACTER_NAMES_TEXT3FocusLost

    private void CHARACTER_NAMES_TEXT4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CHARACTER_NAMES_TEXT4FocusGained
        if(CHARACTER_NAMES_TEXT4.getText().equals("") || CHARACTER_NAMES_TEXT4.getText().equals("Char. 4")){
            CHARACTER_NAMES_TEXT4.setText("");
            CHARACTER_NAMES_TEXT4.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_CHARACTER_NAMES_TEXT4FocusGained

    private void CHARACTER_NAMES_TEXT4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CHARACTER_NAMES_TEXT4FocusLost
        if(CHARACTER_NAMES_TEXT4.getText().equals("")){
            CHARACTER_NAMES_TEXT4.setText("Char. 4");
            CHARACTER_NAMES_TEXT4.setForeground(new Color(102,102,102));
        }
    }//GEN-LAST:event_CHARACTER_NAMES_TEXT4FocusLost

    private void CHARACTER_NAMES_TEXT5FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CHARACTER_NAMES_TEXT5FocusGained
        if(CHARACTER_NAMES_TEXT5.getText().equals("") || CHARACTER_NAMES_TEXT5.getText().equals("Char. 5")){
            CHARACTER_NAMES_TEXT5.setText("");
            CHARACTER_NAMES_TEXT5.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_CHARACTER_NAMES_TEXT5FocusGained

    private void CHARACTER_NAMES_TEXT5FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CHARACTER_NAMES_TEXT5FocusLost
        if(CHARACTER_NAMES_TEXT5.getText().equals("")){
            CHARACTER_NAMES_TEXT5.setText("Char. 5");
            CHARACTER_NAMES_TEXT5.setForeground(new Color(102,102,102));
        }
    }//GEN-LAST:event_CHARACTER_NAMES_TEXT5FocusLost

    private void WIPS_RECEIVED_YESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WIPS_RECEIVED_YESActionPerformed
        SEND_WIP_BUTTON.setEnabled(true);
    }//GEN-LAST:event_WIPS_RECEIVED_YESActionPerformed

    private void WIPS_RECEIVED_NOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WIPS_RECEIVED_NOActionPerformed
        SEND_WIP_BUTTON.setEnabled(false);
    }//GEN-LAST:event_WIPS_RECEIVED_NOActionPerformed

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

    private void SEND_WIP_BUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SEND_WIP_BUTTONActionPerformed
        int returnvalue = wrfui.ReturnsFileChooser().showOpenDialog(this.wrfui);
        if(returnvalue == JFileChooser.APPROVE_OPTION) {
        }
    }//GEN-LAST:event_SEND_WIP_BUTTONActionPerformed

    private void DETAILS_BUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DETAILS_BUTTONActionPerformed
        Commissions cm = new Commissions();
        cm = ManageCommissionerList.comms.get(index);
        cdui.SetTextoPrevious(cm.GetDetails());
        cdui.setVisible(true);
    }//GEN-LAST:event_DETAILS_BUTTONActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
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
            if(entradas[1]=="Leave blank if unsure" || entradas[1]==""){
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
            entradas[12] = cdui.GetTexto();
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
            entradas[16] = Integer.toString(index);
            try{
                buf = javax.imageio.ImageIO.read(wrfui.ReturnsFileChooser().getSelectedFile());
            }catch(Exception e){
                e.printStackTrace();
                System.out.printf("Something went wrong when reading WIP image\n");
            }
            Commissions com = new Commissions(entradas[0], entradas[1], entradas[2], ArtistMOCTemp, entradas[3], entradas[4], 
            entradas[5], entradas[6], entradas[7], CharacterNamesTemp, entradas[8], entradas[9],
            entradas[10], entradas[11], entradas[12], entradas[13], buf, entradas[14], entradas[15], Integer.parseInt(entradas[16]));
            ManageCommissionerList.comms.set(index, com);
            ManageCommissionerArchive.ReplacesEntry(index);
            ManageCommissionerArchive.ReplacesImage(index);
            ListCommissionsUI.ReturnsLcsui().CleansText();
            ListCommissionsUI.ReturnsLcsui().WriteCommission(index);
            JOptionPane.showMessageDialog(new JFrame(), "Successfully replaced!");
        }
            
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ListCommissionsShowUI.HideLCSEUI();
    }//GEN-LAST:event_jButton2ActionPerformed
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]){
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
            java.util.logging.Logger.getLogger(ListCommissionsShowEditUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListCommissionsShowEditUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListCommissionsShowEditUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListCommissionsShowEditUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListCommissionsShowEditUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ARTIST_SOCIAL_MEDIA;
    private javax.swing.JCheckBox ARTIST_SOCIAL_MEDIA_DA;
    private javax.swing.JCheckBox ARTIST_SOCIAL_MEDIA_FA;
    private javax.swing.JCheckBox ARTIST_SOCIAL_MEDIA_INSTA;
    private javax.swing.JCheckBox ARTIST_SOCIAL_MEDIA_OTHER;
    private javax.swing.JTextField ARTIST_SOCIAL_MEDIA_OTHER_TEXT;
    private javax.swing.JCheckBox ARTIST_SOCIAL_MEDIA_TELEGRAM;
    private javax.swing.JCheckBox ARTIST_SOCIAL_MEDIA_TWITTER;
    private javax.swing.JCheckBox ARTIST_SOCIAL_MEDIA_WPP;
    private javax.swing.JLabel ARTIST_TOS;
    private javax.swing.JButton ARTIST_TOS_BUTTON;
    private javax.swing.JLabel ARTIST_USERNAME;
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
    private javax.swing.ButtonGroup COMMISSION_COMPLETE_BUTTON_GROUP;
    private javax.swing.JLabel COMMISSION_TITLE;
    private javax.swing.JTextField COMMISSION_TITLE_TEXT;
    private javax.swing.JPanel COMPLETION_STATUS_PANEL;
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
    private javax.swing.ButtonGroup LEWDS_BUTTON_GROUP;
    private javax.swing.JPanel MOC_PANEL;
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
    private javax.swing.JPanel PRICE_PANEL;
    private javax.swing.JButton SEND_WIP_BUTTON;
    private javax.swing.JPanel TITLE_PANEL;
    private javax.swing.JPanel USERNAME_PANEL;
    private javax.swing.JLabel WIPS_RECEIVED;
    private javax.swing.ButtonGroup WIPS_RECEIVED_BUTTON_GROUP;
    private javax.swing.JRadioButton WIPS_RECEIVED_NO;
    private javax.swing.JRadioButton WIPS_RECEIVED_YES;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    // End of variables declaration//GEN-END:variables
}
