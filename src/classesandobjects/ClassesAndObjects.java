/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classesandobjects;

import shapes.Triangle;

/**
 *
 * @author danie
 */
public class ClassesAndObjects {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Triangle tri1 = new Triangle();
        Triangle tri2 = new Triangle();
        Triangle tri3 = new Triangle();
        Triangle tri4 = new Triangle();
        Triangle tri5 = new Triangle();
        Triangle tri6 = new Triangle();
        
        int[]sideLengths = new int[18]; //assigning the side for the triaangle
        // The lengths of tri1's sides will be first, then the lengths of tri2's side. et
        
        sideLengths [0] = 5;
        sideLengths[1] = 8;
        sideLengths[2] = 9;
        
        // tri5
         sideLengths[12] = 4;
         sideLengths[13] = 7;
         sideLengths[14] = 2;
           
         // we want to set the middle triangle to be 3
         sideLengths[1] = 3;
         sideLengths[4] = 3;
         sideLengths[7] = 3;
         sideLengths[10] = 3;
         sideLengths[13] = 3;
         sideLengths[16] = 3;
         
         
         Person sam = new Person();
         sam.favTriangle = tri5;
         
    }
    
}
