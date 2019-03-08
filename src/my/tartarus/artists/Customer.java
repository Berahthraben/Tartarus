package my.tartarus.artists;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Soerakraven
 */
public class Customer {
    private String username;
    private String[] MOC;
    private String PreviousCommissioner;
    private String DateOfCommission;
    private String DateOfPayment;
    private String NumberInvoice;
    private String PriceChargedCurrency;
    private String PriceCharged;
    private String Details;
    private String Completion;
    public Customer(){
        
    }
    public Customer(String username, String[] MOC, String PreviousCommissioner, String DateOfCommission, String DateOfPayment, String NumberInvoice, String PriceChargedCurrency, String PriceCharged, String Details, String Completion){
        this.username = username;
        this.MOC = MOC;
        this.PreviousCommissioner = PreviousCommissioner;
        this.DateOfCommission = DateOfCommission;
        this.DateOfPayment = DateOfPayment;
        this.NumberInvoice = NumberInvoice;
        this.PriceChargedCurrency = PriceChargedCurrency;
        this.PriceCharged = PriceCharged;
        this.Details = Details;
        this.Completion = Completion;
    }
    public String GetUsername(){
        return this.username;
    }
    public String[] GetMOC(){
        return this.MOC;
    }
    public String GetPreviousCommissioner(){
        return this.PreviousCommissioner;
    }
    public String GetDateOfCommission(){
        return this.DateOfCommission;
    }
    public String GetDateOfPayment(){
        return this.DateOfPayment;
    }
    public String GetNumberInvoice(){
        return this.NumberInvoice;
    }
    public String GetPriceChargedCurrency(){
        return this.PriceChargedCurrency;
    }
    public String GetPriceCharged(){
        return this.PriceCharged;
    }
    public String GetDetails(){
        return this.Details;
    }
    public String GetCompletion(){
        return this.Completion;
    }
    public void SetUsername(String username){
        this.username = username;
    }
    public void SetMOC(String[] MOC){
        this.MOC = MOC;
    }
    public void SetPreviousCommissioner(String PreviousCommissioner){
        this.PreviousCommissioner = PreviousCommissioner;
    }
    public void SetDateOfCommission(String DateOfCommission){
        this.DateOfCommission = DateOfCommission;
    }
    public void SetDateOfPayment(String DateOfPayment){
        this.DateOfPayment = DateOfPayment;
    }
    public void SetNumberInvoice(String NumberInvoice){
        this.NumberInvoice = NumberInvoice;
    }
    public void SetPriceChargedCurrency(String PriceChargedCurrency){
        this.PriceChargedCurrency = PriceChargedCurrency;
    }
    public void SetPriceCharged(String PriceCharged){
        this.PriceCharged = PriceCharged;
    }
    public void SetDetails(String Details){
        this.Details = Details;
    }
    public void SetCompletion(String Completion){
        this.Completion = Completion;
    }
}