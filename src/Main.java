import com.sun.org.apache.xpath.internal.patterns.UnionPattern;
import unionfind.*;

import java.util.Arrays;
import java.util.Random;

public class Main {

    private static Random r = new Random();

    public static void main(String[] args) {

        int n = 900000;
        UnionFindI impl = new QuickUnionWeightedWithPathCompressionUF(n);
        long ms1_= System.currentTimeMillis();
        for(int i=0;i<n;i++){
            int a = r.nextInt(n-i);
            int b = r.nextInt(n-i);
            impl.union(a,b);
        }
//        System.out.println(Arrays.toString(impl.getArr()));

        for(int i=0;i<n;i++){
            int a = r.nextInt(n-i);
            int b = r.nextInt(n-i);
            impl.connected(a,b);
        }
        long ms2_ = System.currentTimeMillis();
        System.out.println(ms1_);
        System.out.println(ms2_);

        System.out.println("diff="+(ms2_-ms1_));
    }
}
