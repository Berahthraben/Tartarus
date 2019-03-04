/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.firstprogram;
    import java.io.*;
/**
 *
 * @author Soerakraven
 */
public class ArchiveClient {
    public static File logs = new File("logs.txt");
    
    public static void ArchiveCustomers(File logos){
        logs = logos;
    }
    
    public static void CreateFile(){
        try{
            logs.createNewFile();
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("CreateFile Failed\n");
        }
    }
    public static void LoadData(){
        String entrada1, entrada2, entrada3, entrada4, entrada5, entrada6, entrada7, entrada8, entrada9;
        int lines = CountLines()/9;
        try{
            FileReader fileReader = new FileReader(logs);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            for(int i=0;i<lines;i++){
                entrada1 = bufferedReader.readLine();
                entrada2 = bufferedReader.readLine();
                entrada3 = bufferedReader.readLine();
                entrada4 = bufferedReader.readLine();
                entrada5 = bufferedReader.readLine();
                entrada6 = bufferedReader.readLine();
                entrada7 = bufferedReader.readLine();
                entrada8 = bufferedReader.readLine();
                entrada9 = bufferedReader.readLine();
                String[] entradanew = ManageList.DismantleMOC(entrada2);
                Customer us = new Customer(entrada1, entradanew, entrada3, entrada4, entrada5, entrada6, entrada7, entrada8, entrada9);
                ManageList.AddCustomer(us);
            }
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Unable to read file2\n");
        }
    }
    private static int CountLines(){
        String line;
        int cont=0;
        try{
            FileReader fileReader = new FileReader("logs.txt");
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
    public static void WriteFile(){
        String[] linha;
        FileWriter writer;
        try{
            writer = new FileWriter(logs, true);
            PrintWriter printer = new PrintWriter(writer);
            linha = ManageList.ReturnsNameIndex(ManageList.ReturnSize()-1);
            for(int i=0;i<9;i++){
                printer.append(linha[i]+ "\n");
            }
            printer.close();
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Unable to read file\n");
        }
        
    }
    
}
