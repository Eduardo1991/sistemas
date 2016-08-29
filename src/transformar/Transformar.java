package transformar;

import java.util.Scanner;

public class Transformar {

    static Scanner m = new Scanner(System.in);
    int n, i, j;

    public static void main(String[] args) {
        int f = 10, c = 2;
        Scanner m = new Scanner(System.in);
        String tr[][] = new String[f][c];
        tr[0][0] = "cero";
        tr[1][0] = "uno";
        tr[2][0] = "dos";
        tr[3][0] = "tres";
        tr[4][0] = "cuatro";
        tr[5][0] = "cinco";
        tr[6][0] = "seis";
        tr[7][0] = "siete";
        tr[8][0] = "ocho";
        tr[9][0] = "nueve";
        tr[0][1] = "zero";
        tr[1][1] = "one";
        tr[2][1] = "two";
        tr[3][1] = "thre";
        tr[4][1] = "four";
        tr[5][1] = "five";
        tr[6][1] = "six";
        tr[7][1] = "seven";
        tr[8][1] = "eigth";
        tr[9][1] = "nine";
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("  " + tr[i][j]);
            }
            System.out.println("  ");
        }        
        String opcion = m.nextLine();

        switch (opcion) {
            case "1":
                System.out.println("Ingrese un numero del 0 al 9 :");
                int n = m.nextInt();
                for (int i = 0; i < f; i++) {
                        if (n == i ) {
                            System.out.println(tr[i][0]);
                        }
                    }
                
                break;
            case "2":
                System.out.println("Ingrese un numero del 0 al 9 :");
                n = m.nextInt();
                for (int i = 0; i < f; i++) {
                    
                        if (n == i ) {
                            System.out.println(tr[i][1]);
                        }
                    }        
                break;
        }   
    }
}