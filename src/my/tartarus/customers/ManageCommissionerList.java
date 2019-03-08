/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.tartarus.customers;
import my.tartarus.artists.*;
import java.util.ArrayList;
import my.tartarus.artists.Customer;
import static my.tartarus.artists.MainUI.*;

/**
 *
 * @author Soerakraven
 */
public class ManageCommissionerList {
    public static ArrayList<Commissions> comms;
    
    public static void StartCommissionerList(ArrayList<Commissions> art){
        comms = art;
    }
    public static void AddCommission(Commissions comm){
        comms.add(comm);
    }
    public static String[] ReturnsCommsTitles(){ //Returns the title of all commissions logged to show in the ComboBox
        String[] temp = new String[comms.size()];
        Commissions temp2 = new Commissions();
        for(int i=0;i<comms.size();i++){
            temp2 = comms.get(i);
            temp[i] = temp2.GetCommissionTitle();
        }
        return temp;
    }
    public static int ReturnsListSize(){ //return the size of #arts
        return comms.size();
    }
    public static String[] ReturnsCommissionerListInString(int index){ //returns all entries in list[index] in the form of an array of strings
        String[] temp = new String[19];
        Commissions temp2 = comms.get(index);
        temp[0] = temp2.GetCommissionTitle();
        temp[1] = temp2.GetArtistusername();
        temp[2] = temp2.GetTOS();
        temp[3] = ConcatenateCommission(temp2.GetArtistMOC());
        temp[4] = temp2.GetEstimatePriceCurrency();
        temp[5] = temp2.GetEstimatePrice();
        temp[6] = temp2.GetPricePaid();
        temp[7] = temp2.GetPaymentPlatform();
        temp[8] = temp2.GetCharacterCount();
        temp[9] = ConcatenateCommission(temp2.GetCharacterNames());
        temp[10] = temp2.GetCharacterType();
        temp[11] = temp2.GetLewds();
        temp[12] = temp2.GetBackgroundIncluded();
        temp[13] = temp2.GetTypeBackground();
        temp[14] = temp2.GetDetails();
        temp[15] = temp2.GetWipReceived();
        temp[16] = temp2.GetDeadLineGiven();
        temp[17] = temp2.GetDeadlineDate();
        temp[18] = Integer.toString(temp2.GetUniqueID());
        return temp;
    }
    public static String ConcatenateCommission(String[] rt){
        String temp="";
        for(int i=0;i<rt.length;i++){
            temp = temp + rt[i] + ".";
        }
        return temp;
    }
    public static String[] ReturnsCommissionersListComboBox(){ //returns all COMMISSION_TITLES on list for ComboBox Models, UNIQUE_IDS == Index
        String[] temp = new String[comms.size()];
        Commissions temp2 = new Commissions();
        for(int i=0;i<comms.size();i++){
            temp2 = comms.get(i);
            temp[i] = temp2.GetCommissionTitle();
        }
        return temp;
    }
    public static int ReturnsCurrencyIndex(String currency){ //returns the currency index based on string
        int i=0;
        for(i=0;i<298;i++){
            if(MainUI.princ.GetESTIMATE_PRICE_CURRENCY().getModel().getElementAt(i).equals(currency)==true){
                break;
            }
        }
        return i;
    }
    public static int ReturnsCharactersQtyIndex(String quantity){ //returns the characters index based on string
        if(quantity.equals("0")){
            quantity = "None";
        }
        System.out.printf("%s", quantity);
        int i=0;
        for(i=0;i<6;i++){
            if(MainUI.princ.GetCHARACTERS_QUANTITY_COMBOBOX().getModel().getElementAt(i).equals(quantity)==true){
                break;
            }
        }
        System.out.printf("Return %d", i);
        return i;
    }
    public static int ReturnsDeadlineDateDayIndex(String day){ //return the Deadline date day index comparing to String
        int i=0;
        for(i=0;i<6;i++){
            if(MainUI.princ.GetDEADLINE_DATE_DAY().getModel().getElementAt(i).equals(day)==true){
                break;
            }
        }
        return i;
    }
    public static int ReturnsDeadlineDateMonthIndex(String month){ //return the Deadline date day index comparing to String
        int i=0;
        for(i=0;i<6;i++){
            if(MainUI.princ.GetDEADLINE_DATE_MONTH().getModel().getElementAt(i).equals(month)==true){
                break;
            }
        }
        return i;
    }
    public static int ReturnsDeadlineDateYearIndex(String year){ //return the Deadline date day index comparing to String
        int i=0;
        for(i=0;i<6;i++){
            if(MainUI.princ.GetDEADLINE_DATE_YEAR().getModel().getElementAt(i).equals(year)==true){
                break;
            }
        }
        return i;
    }
    public static String ReturnsDateDay(String date){
        String temp = "";
        //finding the "/" position
        for(int i=0;i<date.length();i++){
            if(date.charAt(i)=='/'){
                break;
            }else{
                temp = temp + date.charAt(i);
            }
        }
        return temp;
    }
    public static String ReturnsDateMonth(String date){
        String temp = "";
        //finding the 1st "/" position
        for(int i=0;i<date.length();i++){
            if(date.charAt(i)=='/'){
                //finding the 2nd "/" position
                for(int j=i+1;j<date.length();j++){
                    if(date.charAt(j)=='/'){
                        break;
                    }else{
                        temp = temp+date.charAt(j);
                    }
                }
                break;
            }else{
                
            }
        }
        return temp;
    }
    public static String ReturnsDateYear(String date){
        String temp = "";
        //finding the 1st "/" position
        for(int i=0;i<date.length();i++){
            if(date.charAt(i)=='/'){
                //finding the 2nd "/" position
                for(int j=i+1;j<date.length();j++){
                    if(date.charAt(j)=='/'){
                        //saving everything after the second "/" up until the end of the string
                        for(int k=j+1;k<date.length();k++){
                            temp = temp+date.charAt(k);
                        }
                        break;
                    }else{
                        
                    }
                }
                break;
            }else{
                
            }
        }
        return temp;
    }
}
