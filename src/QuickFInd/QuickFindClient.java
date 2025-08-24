package QuickFInd;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class QuickFindClient {
    public static void run(){
        QuickFindService qfs = new QuickFindService(100);
        Random random = new Random();

        int uniones = 0;

        while (uniones < 50) {
            int p;
            int q;
            do {
                p = random.nextInt(100);
                q = random.nextInt(100);
            } while (p == q);
            qfs.union(p,q);
            uniones++;
        }

        int[] ids = qfs.getIds();

        Set<Integer> sets = new HashSet<>();
        for (int id : ids){
            sets.add(id);
        }

        for (int set : sets){
            System.out.println("Printing set: " + set);
            for (int i = 0; i < ids.length; i++){
                if (ids[i] == set){
                    System.out.printf(i + ", ");
                }
            }
            System.out.println("");
        }
    }
}
