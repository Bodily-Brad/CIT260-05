/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package galtolittable;

/**
 *
 * @author Brad
 */
public class GalToLitTable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double gallons, liters;
        int counter;
        
        counter = 0;
        for (gallons = 1; gallons <= 100; gallons++)
        {
            liters = gallons * 3.7854;
            System.out.println(gallons + " gallons is " + liters + " liters.");
            counter++;
            
            // New line every 10th
            if (counter == 10)
            {
                System.out.println();
                counter = 0;
            }
        }
    }
}
