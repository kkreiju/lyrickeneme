/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kkreiju.lyrickeneme;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author Arjay
 */
public class NKeyListener implements KeyListener {
    public String lyrics = "";
    public int encounter = 0;

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_N) {
            if(encounter == 0){
                System.out.print("Tatlong ");
                encounter++;
            }
            else if(encounter == 1){
                System.out.print("bilyon, ");
                encounter++;
            }
            else if(encounter == 2){
                System.out.print("ikaw ");
                encounter++;
            }
            else if(encounter == 3){
                System.out.print("lamang ");
                encounter++;
            }
            else if(encounter == 4){
                System.out.print("ang ");
                encounter++;
            }
            else if(encounter == 5){
                System.out.print("aking ");
                encounter++;
            }
            else if(encounter == 6){
                System.out.print("gusto ");
                encounter++;
            }
            else if(encounter == 7){
                System.out.print("Pasensya ");
                encounter++;
            }
            else if(encounter == 8){
                System.out.print("na ");
                encounter++;
            }
            else if(encounter == 9){
                System.out.print("kung ");
                encounter++;
            }
            else if(encounter == 10){
                System.out.print("ngayon ");
                encounter++;
            }
            else if(encounter == 11){
                System.out.print("ako'y ");
                encounter++;
            }
            else if(encounter == 12){
                System.out.print("'di ");
                encounter++;
            }
            else if(encounter == 13){
                System.out.print("para ");
                encounter++;
            }
            else if(encounter == 14){
                System.out.print("sa'yo ");
                encounter++;
            }
            else if(encounter == 15){
                System.out.print("Tayo ");
                encounter++;
            }
            else if(encounter == 16){
                System.out.print("ay ");
                encounter++;
            }
            else if(encounter == 17){
                System.out.print("papunta ");
                encounter++;
            }
            else if(encounter == 18){
                System.out.print("na ");
                encounter++;
            }
            else if(encounter == 19){
                System.out.print("sa'ting ");
                encounter++;
            }
            else if(encounter == 20){
                System.out.print("bagong ");
                encounter++;
            }
            else if(encounter == 21){
                System.out.print("yugto ");
                encounter++;
            }
            else if(encounter == 22){
                System.out.print("'Yokong ");
                encounter++;
            }
            else if(encounter == 23){
                System.out.print("mabuhay ");
                encounter++;
            }
            else if(encounter == 24){
                System.out.print("sa ");
                encounter++;
            }
            else if(encounter == 25){
                System.out.print("isang ");
                encounter++;
            }
            else if(encounter == 26){
                System.out.print("mundong ");
                encounter++;
            }
            else if(encounter == 27){
                System.out.print("walang ");
                encounter++;
            }
            else if(encounter == 28){
                System.out.print("tayo ");
                encounter = 0;
            }
        }
        else if(e.getKeyCode() == KeyEvent.VK_M){
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.print('\u000C');
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
       
    }
}
