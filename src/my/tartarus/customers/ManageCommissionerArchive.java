/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.tartarus.customers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.*;
import java.nio.file.*;
import java.nio.charset.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import static my.tartarus.artists.ArchiveCustomer.logsartist;
import my.tartarus.artists.Customer;
import my.tartarus.artists.ManageCustomerList;
import static my.tartarus.artists.ManageCustomerList.CountPoints;
import my.tartarus.artists.*;
import java.util.ArrayList;

/**
 *
 * @author Soerakraven
 */
public class ManageCommissionerArchive {
    public static File logscommissions = new File("logscommission.txt");
    
    public static void ArchiveCustomers(File logos){
        logscommissions = logos;
    }
    
    public static void CreateFile(){ //creates the file if it doesn't exist
        try{
            logscommissions.createNewFile();
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("CreateFile Failed\n");
        }
    }
    public static void LoadData(){
        String entrada1, entrada2, entrada3, entrada4, entrada5, entrada6, entrada7, entrada8, entrada9;
        String entrada10, entrada11, entrada12, entrada13, entrada14, entrada15, entrada16, entrada17, entrada18, entrada19;
        int lines = CountLines()/19;
        try{
            FileReader fileReader = new FileReader(logscommissions);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            for(int i=0;i<lines;i++){
                entrada1 = bufferedReader.readLine(); //CommissionTitle
                entrada2 = bufferedReader.readLine(); //Artistusername
                entrada3 = bufferedReader.readLine(); //TOS
                entrada4 = bufferedReader.readLine(); //ArtistMOC
                entrada5 = bufferedReader.readLine(); //EstimatePriceCurrency
                entrada6 = bufferedReader.readLine(); //EstimatePrice
                entrada7 = bufferedReader.readLine(); //PricePaid
                entrada8 = bufferedReader.readLine(); //PaymentPlatform
                entrada9 = bufferedReader.readLine(); //CharacterCount
                entrada10 = bufferedReader.readLine(); //CharacterNames
                entrada11 = bufferedReader.readLine(); //CharacterType
                entrada12 = bufferedReader.readLine(); //Lewds
                entrada13 = bufferedReader.readLine(); //BackgroundIncluded
                entrada14 = bufferedReader.readLine(); //TypeBackground
                entrada15 = bufferedReader.readLine(); //Details
                entrada16 = bufferedReader.readLine(); //WipReceived
                entrada17 = bufferedReader.readLine(); //DeadLineGiven
                entrada18 = bufferedReader.readLine(); //DeadlineDate
                entrada19 = bufferedReader.readLine(); //UNIQUEID
                String[] CharacterNamestemp = Dismantle(entrada10);
                String[] MOCTemp = Dismantle(entrada4);
                File wipimg = new File("wipimages/wip" + entrada1 + entrada19 + ".jpg");
                wipimg.createNewFile();
                java.awt.image.BufferedImage bf = javax.imageio.ImageIO.read(wipimg);
                Commissions us = new Commissions(entrada1, entrada2, entrada3, MOCTemp, entrada5, entrada6, entrada7, entrada8, entrada9,
                CharacterNamestemp, entrada11, entrada12, entrada13, entrada14, entrada15, entrada16, bf, entrada17, entrada18, Integer.parseInt(entrada19));
                ManageCommissionerList.AddCommission(us);
            }
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Unable to read file2\n");
        }
    }
    public static String[] Dismantle(String in){
        int QTYOfPoints = CountPoints(in);
        int posi = 0;
        String temp = "";
        String[] ret = new String[QTYOfPoints];
        for(int i=0;i<QTYOfPoints;i++){
            for(int j=posi;j<in.length();j++){
                if(in.charAt(j)=='.'){
                    posi = j+1;
                    break;
                }else{
                    temp = temp + in.charAt(j);
                }
            }
            ret[i] = temp;
            temp = "";
        }
        return ret;
    }
    public static int CountPoints(String in){
        int out = 0;
        for(int i=0;i<in.length();i++){
            if(in.charAt(i)=='.'){
                out++;
            }
        }
        return out;
    }
    
    public static void WriteFile(){ //writes the last entry in ManageCommissionerList.comms to the file
        String[] linha;
        FileWriter writer;
        try{
            writer = new FileWriter(logscommissions, true);
            PrintWriter printer = new PrintWriter(writer);
            linha = ManageCommissionerList.ReturnsCommissionerListInString(ManageCommissionerList.comms.size()-1);
            for(int i=0;i<19;i++){
                printer.append(linha[i]+ "\n");
            }
            printer.close();
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Unable to read file\n");
        }
        try{
            Commissions temp = ManageCommissionerList.comms.get(ManageCommissionerList.comms.size()-1);
            BufferedImage img = temp.GetWipImage();
            File fl = new File("wipimages/wip" + temp.GetCommissionTitle() + temp.GetUniqueID() + ".jpg");
            ImageIO.write(img, "jpg", fl);
        }catch (Exception e){
            e.printStackTrace();
            System.out.printf("Failure to write image file");
        }
        
    }
    private static int CountLines(){
        String line;
        int cont=0;
        try{
            FileReader fileReader = new FileReader("logscommission.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while(bufferedReader.readLine() != null){
                cont++;
            }
        }catch(Exception e){
            e.printStackTrace();
            System.out.printf("Unable to read file\n");
        }
        return cont;
    }
    
    public static void ReplacesEntry(int index){ //replaces the entry of index inside the logs file
        int cont = 0;
        String[] thingstowrite = ManageCommissionerList.ReturnsCommissionerListInString(index);
        try{
            Path path = Paths.get("logscommission.txt");
            List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
            for(int i = index*19;i<(index*19)+19;i++){
                lines.set(i, thingstowrite[cont]);
                cont++;
            }
            Files.write(path, lines, StandardCharsets.UTF_8);
        }catch(Exception e){
            e.printStackTrace();
            System.out.printf("Not possible to replace entry!\n");
        }
    }
    public static void ReplacesImage(int index){ //replaces the original wip image file
        try{
            Commissions temp = ManageCommissionerList.comms.get(index);
            BufferedImage img = temp.GetWipImage();
            File fl = new File("wipimages/wip" + temp.GetCommissionTitle() + index + ".jpg");
            ImageIO.write(img, "jpg", fl);
        }catch (Exception e){
            e.printStackTrace();
            System.out.printf("Failure to write image file");
        }
    }
}
