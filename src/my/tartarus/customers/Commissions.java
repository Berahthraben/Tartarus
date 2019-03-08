/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.tartarus.customers;
    import javax.imageio.ImageIO;
    import java.awt.*;
    import java.lang.*;
            
/**
 *
 * @author Soerakraven
 */
public class Commissions {
    private String CommissionTitle; //0
    private String Artistusername; //1
    private String TOS; //2
    private String[] ArtistMOC;
    private String EstimatePriceCurrency; //3
    private String EstimatePrice; //4
    private String PricePaid; //5
    private String PaymentPlatform; //6
    private String CharacterCount; //7
    private String[] CharacterNames;
    private String CharacterType; //8
    private String Lewds; //9
    private String BackgroundIncluded; //10
    private String TypeBackground; //11
    private String Details; //12
    private String WipReceived; //13
    private java.awt.image.BufferedImage WipImage;
    private String DeadLineGiven; //14
    private String DeadlineDate; //15
    private int UNIQUEID; //16
    
    
    
    public Commissions(){
    }
    
    public Commissions(String CommissionTitle, String Artistusername, String TOS, String[] ArtistMOC, String EstimatePriceCurrency, 
    String EstimatePrice, String PricePaid, String PaymentPlatform, String CharacterCount, String[] CharacterNames, String CharacterType, String Lewds, String BackgroundIncluded, 
    String TypeBackground, String Details, String WipReceived, java.awt.image.BufferedImage WipImage, String DeadLineGiven, String DeadlineDate, int UNIQUEID){
        this.CommissionTitle = CommissionTitle;
        this.Artistusername = Artistusername;
        this.TOS = TOS;
        this.ArtistMOC = ArtistMOC;
        this.EstimatePriceCurrency = EstimatePriceCurrency;
        this.EstimatePrice = EstimatePrice;
        this.PricePaid = PricePaid;
        this.PaymentPlatform = PaymentPlatform;
        this.CharacterCount = CharacterCount;
        this.CharacterNames = CharacterNames;
        this.CharacterType = CharacterType;
        this.Lewds = Lewds;        
        this.BackgroundIncluded = BackgroundIncluded;        
        this.TypeBackground = TypeBackground;        
        this.Details = Details;        
        this.WipReceived = WipReceived;
        this.WipImage = WipImage;
        this.DeadLineGiven = DeadLineGiven;        
        this.DeadlineDate = DeadlineDate;   
        this.UNIQUEID = UNIQUEID;
    }
    // GET METHODS //
    public String GetCommissionTitle(){
        return this.CommissionTitle;
    }
    public String GetArtistusername(){
        return this.Artistusername;
    }
    public String GetTOS(){
        return this.TOS;
    }
    public String[] GetArtistMOC(){
        return this.ArtistMOC;
    }
    public String GetEstimatePriceCurrency(){
        return this.EstimatePriceCurrency;
    }
    public String GetEstimatePrice(){
        return this.EstimatePrice;
    }
    public String GetPricePaid(){
        return this.PricePaid;
    }
    public String GetPaymentPlatform(){
        return this.PaymentPlatform;
    }
    public String GetCharacterCount(){
        return this.CharacterCount;
    }
    public String[] GetCharacterNames(){
        return this.CharacterNames;
    }
    public String GetCharacterType(){
        return this.CharacterType;
    }
    public String GetLewds(){
        return this.Lewds;
    }
    public String GetBackgroundIncluded(){
        return this.BackgroundIncluded;
    }
    public String GetTypeBackground(){
        return this.TypeBackground;
    }
    public String GetDetails(){
        return this.Details;
    }
    public String GetWipReceived(){
        return this.WipReceived;
    }
    public java.awt.image.BufferedImage GetWipImage(){
        return this.WipImage;
    }
    public String GetDeadLineGiven(){
        return this.DeadLineGiven;
    }
    public String GetDeadlineDate(){
        return this.DeadlineDate;
    }
    public int GetUniqueID(){
        return this.UNIQUEID;
    }
    // SET METHODS //
    public void SetCommissionTitle(String CommissionTitle){
        this.CommissionTitle = CommissionTitle;
    }
    public void SetArtistusername(String Artistusername){
        this.Artistusername = Artistusername;
    }
    public void SetTOS(String TOS){
        this.TOS = TOS;
    }
    public void SetArtistMOC(String[] ArtistMOC){
        this.ArtistMOC = ArtistMOC;
    }
    public void SetEstimatePriceCurrency(String EstimatePriceCurrency){
        this.EstimatePriceCurrency = EstimatePriceCurrency;
    }
    public void SetEstimatePrice(String EstimatePrice){
        this.EstimatePrice = EstimatePrice;
    }
    public void SetPricePaid(String PricePaid){
        this.PricePaid = PricePaid;
    }
    public void SetPaymentPlatform(String PaymentPlatform){
        this.PaymentPlatform = PaymentPlatform;
    }
    public void SetCharacterCount(String CharacterCount){
        this.CharacterCount = CharacterCount;
    }
    public void SetCharacterNames(String[] CharacterNames){
        this.CharacterNames = CharacterNames;
    }
    public void SetCharacterType(String CharacterType){
        this.CharacterType = CharacterType;
    }
    public void SetLewds(String Lewds){
        this.Lewds = Lewds;
    }
    public void SetBackgroundIncluded(String BackgroundIncluded){
        this.BackgroundIncluded = BackgroundIncluded;
    }
    public void SetTypeBackground(String TypeBackground){
        this.TypeBackground = TypeBackground;
    }
    public void SetDetails(String Details){
        this.Details = Details;
    }
    public void SetWipReceived(String WipReceived){
        this.WipReceived = WipReceived;
    }
    public void SetWipImage(java.awt.image.BufferedImage WipImage){
        this.WipImage = WipImage;
    }
    public void SetDeadLineGiven(String DeadLineGiven){
        this.DeadLineGiven = DeadLineGiven;
    }
    public void SetDeadlineDate(String DeadlineDate){
        this.DeadlineDate = DeadlineDate;
    }
    public void SetUniqueID(int UNIQUEID){
        this.UNIQUEID = UNIQUEID;
    }
}
