/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p6.pkg6;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;
import java.util.Scanner;


/**
 *
 * @author baswo
 */
public class P66 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<Integer>();

        int nr = 0;

        int actief = 1;

        Scanner input = new Scanner(System.in);


        while(actief == 1) {

        int ingetal = input.nextInt();
       
        if (ingetal > 0){
        values.add(nr, ingetal);

        System.out.println("Het " + (nr+1) + "e getal is " + values.get(nr) + " Je hebt nu " + values.size() + " getallen ingevoerd.");

        nr++;
        }
        
        while(ingetal == 0 && actief == 1) {

        actief = 0;

        System.out.println("Dikke henk");

        }


        while(actief == 0) {
               System.out.println("you fucked up");
               goThroughVals(values);
               
               actief = 1;
                    }
            }



            }

    public static void goThroughVals(List<Integer> values) {
        int val = 1;
        List<Integer> vall = new ArrayList<>();
        for(int i = 0; i < values.size(); i++){
            if(values.get(i) % 2 != 0 && i+1 < values.size()){
                if(val == 1){                    
                    int stuff = values.get(i) + values.get(1+i);
                    System.out.println("stuff1 " + stuff);
                    val = 2;
                    vall.add(stuff);
                }else if(val == 2){
                    int stuff = values.get(i) - values.get(i+1);
                    System.out.println("stuff2 " + stuff);
                    val = 1;
                    vall.add(stuff);
                }
            }
        }
        int i;
        double sum = 0;
        for(i = 1; i < vall.size(); i++){
            sum += vall.get(i);
        }
        System.out.println(vall);
        System.out.println("the magical number iizzzzz: " + sum);
    }
    
    
}
