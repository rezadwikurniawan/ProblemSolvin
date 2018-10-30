/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hacktoberfest;

import java.util.Scanner;

/**
 *
 * @author Reza
 */
public class Problem01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String[] arr = {"Bhin Bhin", "Atung", "Kaka", "Hodori", "Pan Pan",
                        "Appu", "Lulu", "Orry", "Mei Mei"};

        System.out.println("Enter index ");
        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();

        if (index > 9){
            index = index % 9;
            if (index == 0){
                index = 9;
            }
        }
        index--;
        System.out.println("Value: "+ arr[index]);
    }

}