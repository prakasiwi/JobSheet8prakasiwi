/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JobSheet8;

/**
 *
 * @author galih
 */
public class PerulanganBersarang {
     public static void main(String[] args) {
        
         // membuat variabel
         int x, y, z;
         
         // melakukan perulangan sebanyak x dan y kali
         for (x=1; x<2; x++){
            for (y=3; y<=4; y++){
                for (z=5; z<6; z++){
                   System.out.format("Perulangan [x=%d, y=%d, z=%d] %n", x, y, z );
             }
         }
    }
    
}
}