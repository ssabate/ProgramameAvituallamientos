/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programameavituallamientos;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author profe
 */
public class ProgramameAvituallamientos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ent=new Scanner(System.in);
        Pattern pattern=Pattern.compile("-?\\d+");
        
        int alt=Integer.valueOf(ent.next());
        while(alt!=-1){
            int km=0;               //km donde estamos actualmente
            int maxLlanos=0;        //máximos kms cantLlanos encontrados
            int kmMax=0;            //km dónde empieza el trozo llano más largo
            int cantLlanos=0;       //cantidad de kms llanos que llevamos actualmente    
            int inici=km;           //inicio del trozo actual
            int ant=-1;             //altitud anterior registrada
            while(alt!=-1){
                
                if(alt!=ant){
                    if(cantLlanos>maxLlanos){
                        maxLlanos=cantLlanos;
                        kmMax=inici;
                    }
                    cantLlanos=0;
                    inici=km;
                }
                else{
                    cantLlanos++;
                }
                km++;
                ant=alt;
                alt=Integer.valueOf(ent.next());
            }
            if(cantLlanos>maxLlanos){
                        maxLlanos=cantLlanos;
                        kmMax=inici;
            }
            if(maxLlanos==0) System.out.println("HOY NO COMEN");
            else System.out.println(kmMax+" "+maxLlanos);
            alt=Integer.valueOf(ent.next());        
        }
    }
    
}
