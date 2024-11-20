package konzol;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author tothb
 */
public class KoPapirOllo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        
        String[] opciok = {"kő", "papír", "olló"};
        
        System.out.println("Üdv a kő-papír-olló játékban!");
        System.out.println("Írd be a választásodat (kő, papír, olló):");
        
        System.out.print("Te választásod: ");
        String felhValasz = sc.nextLine().toLowerCase();
        
        int gepRandom = random.nextInt(3);
        String gepValaszt = opciok[gepRandom];
        System.out.println("Gép választása: " + gepValaszt);
        
        if (felhValasz.equals(gepValaszt)) {
            System.out.println("Döntetlen!");
        }
    }
    
}
