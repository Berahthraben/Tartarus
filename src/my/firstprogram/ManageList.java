/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.firstprogram;

import java.util.*;
import java.lang.*;
import my.firstprogram.Customer;
import my.firstprogram.PrincipalUI;
import my.firstprogram.ComboBoxUI;
/**
 *
 * @author Soerakraven
 */
public class ManageList {
    private static ArrayList<Customer> cuzt;
    public static void StartList(ArrayList<Customer> Usuarios){
       cuzt = Usuarios;
    }
    public static void AddCustomer(Customer cust){
        cuzt.add(cust);
    }
    public static String[] ReturnsComboBoxString(){
        String[] Ids = new String[cuzt.size()];
        Customer tempo = new Customer();
        for(int i=0;i<cuzt.size();i++){
            tempo = cuzt.get(i);
            Ids[i] = tempo.GetUsername() + " " + tempo.GetDateOfCommission();
        }
        return Ids;
        
    }
    public static String ReturnsComboBoxUsername(String ent){
        String temp = "";
        for(int i=0;i<ent.length();i++){
            if(ent.charAt(i)==' '){
                break;
            }else{
                temp = temp + ent.charAt(i);
            }
        }
        return temp;
    }
    public static String[] ReturnIds(){ //returns the names of all customers in the list
        String[] Ids = new String[cuzt.size()];
        Customer tempo = new Customer();
        for(int i=0;i<cuzt.size();i++){
            tempo = cuzt.get(i);
            Ids[i] = tempo.GetDateOfCommission();
        }
        return Ids;
    }
    public static String[] ReturnDates(){ //returns the dates of commission of all customers in list
        String[] Ids = new String[cuzt.size()];
        Customer tempo = new Customer();
        for(int i=0;i<cuzt.size();i++){
            tempo = cuzt.get(i);
            Ids[i] = tempo.GetUsername();
        }
        return Ids;
    }
    public static Customer ReturnsCustomer(int index){
        return cuzt.get(index);
    }
    public static String[] ReturnsNameIndex(int ind){ //returns all strings on list[index] in an array of Strings
        String[] Info = new String[9];
        Customer u = cuzt.get(ind);
        Info[0] = u.GetUsername();
        Info[1] = ConcatenateMOC(u.GetMOC());
        Info[2] = u.GetPreviousCommissioner();
        Info[3] = u.GetDateOfCommission();
        Info[4] = u.GetDateOfPayment();
        Info[5] = u.GetNumberInvoice();
        Info[6] = u.GetPriceChargedCurrency();
        Info[7] = u.GetPriceCharged();
        Info[8] = u.GetDetails();
        return Info;
    }
    public static int ReturnSize(){
        return cuzt.size();
    }
    public static int SearchCustomerName(String username){ //searches for customer with username and returns the index
        Customer temp = new Customer();
        int i=0;
        for(i=0;i<ReturnSize();i++){
            temp = cuzt.get(i);
            if(username.equals(temp.GetUsername()) == true){
                break;
            }
        }
        return i;
    }
    public static String SearchCustomerIndex(int index){ //searches for index and returns username
        Customer temp = new Customer();
        temp = cuzt.get(index);
        return temp.GetUsername();
    }
    public static String[] DismantleMOC(String moc){
        int QuantityOfMethods = CountPoints(moc);
        int posi = 0;
        String temp = "";
        String[] ret = new String[QuantityOfMethods];
        for(int i=0;i<QuantityOfMethods;i++){
            for(int j=posi;j<moc.length();j++){
                if(moc.charAt(j)=='.'){
                    posi = j;
                    break;
                }else{
                    temp = temp + moc.charAt(j);
                }
            }
            ret[i] = temp;
            temp = "";
        }
        return ret;
    }
    
    /*public static String[] DismantleMOC(String moc){
        int points = CountPoints(moc);
        int currentpointposition, j=0;
        char tempchar = '.';
        String[] str = new String [points];
        String temp = "";
        for(int i=0;i<points;i++){
            currentpointposition = FindPointsPositions(moc, i);
            System.out.printf("%d", currentpointposition);
            for(j=j;j<currentpointposition;j++){
                tempchar = moc.charAt(j);
                System.out.printf("%c\n", tempchar);
                temp = temp + tempchar;
            }
            System.out.printf("%s", temp);
            str[i] = temp;
        }
        return str;
    }*/
    
    public static int CountPoints(String str){
        char temp;
        int cont = 0;
        for(int i=0;i<str.length();i++){
            temp = str.charAt(i);
            if(temp=='.'){
                cont++;
            }
        }
        return cont;
    }
    public static String ConcatenateMOC(String[] moc){
        String temp = "";
        for(int i=0;i<moc.length;i++){
            temp = temp + moc[i] + ".";
        }
        return temp;
    }
}
