import java.util.Scanner;

public class API {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        QuickFind QF = new QuickFind(n);
        while (in.hasNextInt()){
            int p = in.nextInt();
            int q = in.nextInt();
            if (p <=n && q < n ) {
                if(!QF.connected(p,q)){
                    QF.union(p,q);
                    System.out.println(p + " " + q);
                }
            }

        }

    }
}
