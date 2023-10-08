/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package kkreiju.lyrickeneme;

/**
 *
 * @author Arjay
 */
public class Lyrickeneme {

    public static void main(String[] args) {
        ere e = new ere();
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.print('\u000C');
        e.show();
    }
}
