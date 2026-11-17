import java.util.HashSet;
import java.util.Set;
public class Main {
    public static void main(String [] args) {
        int[] numArr = {1,2,3,1,1,2,3,4,5};
        String[] stringArr = new String[]{"I", "","Mondays","NOTTT","Said","Garfield"};
        // for (String x: stringArr) {
        //     System.out.println(x);
        // }
        // Cannot modify contents in an enhanced for loop.

        for (String x: stringArr) {
            if (x != null && x != "") {
                System.out.println(x.substring(0,1));
            }
        }

        // Check for nulls.




        //find the number that  appears the most.
        // int most = numArr[0]; 
        int mostCount =0;
        int count =0;
        Set<Integer> seen = new HashSet<>();
        for (int most: numArr) {
            if (seen.contains(most)) {
                continue;
            }
            seen.add(most);
            count = 0;
            for (int x: numArr) {
                if (x == most) {
                    count += 1;
                }
            }
            mostCount = Math.max(count,mostCount);
        }
        System.out.println(mostCount);




    }
}
