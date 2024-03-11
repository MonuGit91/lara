import java.util.*;

class B {
    public static void main(String[] args) {
        final int i;
        i = 10;
        int j = 20;
        System.out.println(i);
        System.out.println(j);

        i = 10;//CTE
        j = 20;//CTE
        System.out.println(i);
        System.out.println(j);
    }
}
/*

final variables can not be modified after initilization
*/