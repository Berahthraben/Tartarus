/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.tartarus.artists;
    import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import my.tartarus.customers.ManageCommissionerList;
/**
 *
 * @author Soerakraven
 */
public class ArchiveCustomer {
    public static File logsartist = new File("logsartists.txt");
    
    public static void ArchiveCustomers(File logos){
        logsartist = logos;
    }
    
    public static void CreateFile(){
        try{
            logsartist.createNewFile();
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("CreateFile Failed\n");
        }
    }
    public static void ReplaceFile(int index){
        int cont = 0;
        String[] thingstowrite = ManageCustomerList.ReturnsNameIndex(index);
        try{
            Path path = Paths.get("logsartists.txt");
            List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
            for(int i = index*10;i<(index*10)+10;i++){
                lines.set(i, thingstowrite[cont]);
                cont++;
            }
            Files.write(path, lines, StandardCharsets.UTF_8);
        }catch(Exception e){
            e.printStackTrace();
            System.out.printf("Not possible to replace entry!\n");
        }
    }
    public static void LoadData(){
        String entrada1, entrada2, entrada3, entrada4, entrada5, entrada6, entrada7, entrada8, entrada9, entrada10;
        int lines = CountLines()/10;
        try{
            FileReader fileReader = new FileReader(logsartist);
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
                entrada10 = bufferedReader.readLine();
                String[] entradanew = ManageCustomerList.DismantleMOC(entrada2);
                Customer us = new Customer(entrada1, entradanew, entrada3, entrada4, entrada5, entrada6, entrada7, entrada8, entrada9, entrada10);
                ManageCustomerList.AddCustomer(us);
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
            FileReader fileReader = new FileReader("logsartists.txt");
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
            writer = new FileWriter(logsartist, true);
            PrintWriter printer = new PrintWriter(writer);
            linha = ManageCustomerList.ReturnsNameIndex(ManageCustomerList.ReturnSize()-1);
            for(int i=0;i<10;i++){
                if(i==9){
                    printer.append(linha[i]);
                }else{
                    printer.append(linha[i]+ "\n");
                }
            }
            printer.close();
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Unable to read file\n");
        }
        
    }
    
}
