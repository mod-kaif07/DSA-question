import java.util.Arrays;
import java.util.Collections;

public class choclate_poblem {
    public static void main(String[] args) {
        int n = 4, m = 6;
        Integer hori_cost[] = { 2, 1, 3, 1, 4 };
        Integer veri_cost[] = { 4, 1, 2 };

        Arrays.sort(hori_cost, Collections.reverseOrder());
        Arrays.sort(veri_cost, Collections.reverseOrder());

        int h = 0, v = 0;
        int hp = 1, vp = 1;
        int cost = 0;
        while (h < hori_cost.length && v < veri_cost.length) {
            if (hori_cost[h] >= veri_cost[v]) {
                cost += hori_cost[h] * vp;
                 hp++;
                 h++;
            }
            else{
                cost+= veri_cost[v]*hp;
                vp++;
                v++;
            }

        }
        while(h<hori_cost.length){
            cost += hori_cost[h] * vp;
            hp++;
            h++;
        }
        while(v<veri_cost.length){
            cost+= veri_cost[v]*hp;
            vp++;
            v++;
        }
        System.out.println("Min cost of cut the choclate :-"+cost);

    }
}
