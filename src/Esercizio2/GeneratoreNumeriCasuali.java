package Esercizio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class GeneratoreNumeriCasuali {
    public static List<Integer> generaNumeriCasuali(int n) {
        Random random = new Random();
        List<Integer> numeri = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            numeri.add(random.nextInt(101));
        }
        Collections.sort(numeri);
        return numeri;
    }
}
