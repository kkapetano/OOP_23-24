package pckg_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MainApp {
    private static int value;
    private static String name;
    private static String[] names = new String[5];
    private static Scanner scanner = new Scanner(System.in);




    public static void main(String[] args) {
        /*float [] ints = new float[10];
        int[] newInts= {10,30,-10,20,34,89,54};
        System.out.println("First array; " + ints.length);
        System.out.println("Snd array; " +newInts.length);
        System.out.println("third element - fst:" + ints[3]);
        System.out.println("third element - snd: " + newInts[3]);
        for (int k=0; k<ints.length;k++){
            ints[k] = k+1;


        }
        System.out.println("third element - fst:" + ints[3]);
        ints[3]=400.5f;
        System.out.println("third element - fst:" + ints[3]);

        ints[10]=1000;
        changeElement(names,2);
        System.out.println(names[2]);
        populateStringNames(names);
        listElements(names);*/

        int[] arr1 = {23,56,78,0,-123,51,543,78,-98,32};
        int[] arr2 = Arrays.copyOfRange(arr1,2,7);
        System.out.println(arr1);
        System.out.println(arr2);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));


    }
    private static void changeElement(String [] nume,int indx){
        String newName = "Neko novo ime";
        if (indx < nume.length -1){
            nume [indx] = newName;
            System.out.println("Name was changed...");

        }else {
            System.out.println("Index out of bounds!");
        }

    }
    private static void populateStringNames(String[]numeOpet) {
        int cnt = 0;
        String name;
        while (cnt < numeOpet.length ) {
            System.out.println("Unesi ime:\n");
            name = scanner.nextLine();
            numeOpet[cnt] = name;
            cnt++;
        }
        System.out.println("Finished!");
    }
    private static void listElements(String[]names){
        System.out.println("-------------------------------------");
        for (int k = 0; k<names.length; k++){
            System.out.println("Name: " + names[k]);
        }
    }

}
