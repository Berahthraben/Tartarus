/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.firstprogram;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import javazoom.jl.player.Player;
import javazoom.jl.player.*;
import my.firstprogram.PrincipalUI;
import java.net.*;
import java.io.*;
/**
 *
 * @author Soerakraven
 */

public class MP3Musica {
    public static void tocarTafarel(){    
        try{
            InputStream fis = new URL("https://instaud.io/_/3n4O.mp3").openStream();
            Player playMP3 = new Player(fis);
            playMP3.play();
        }catch(Exception exc){
            exc.printStackTrace();
            System.out.println("Nao foi possivel tocar");
        }
        
    }
    public static void tocarZaWarudo(){
        try{
            InputStream fis = new URL("https://instaud.io/_/3n4P.mp3").openStream();
            Player playMP3 = new Player(fis);
            playMP3.play();
        }catch(Exception exc){
            exc.printStackTrace();
            System.out.println("Nao foi possivel tocar");
        }
        
    }
    public static void tocarCachorro(){
        try{
            InputStream fis = new URL("https://instaud.io/_/3n4R.mp3").openStream();
            Player playMP3 = new Player(fis);
            playMP3.play();
        }catch(Exception exc){
            exc.printStackTrace();
            System.out.println("Nao foi possivel tocar");
        }
        
    }
}
