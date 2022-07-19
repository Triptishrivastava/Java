import java.util.*;

public class Solution {

    public static void main(String[] args) {
	   
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int x=scan.nextInt();
        int y=scan.nextInt();
        int z=scan.nextInt();
        int w=scan.nextInt();
        int v=scan.nextInt();
        int []a=new int[n];
        a[0]=x;
        a[1]=y;
        a[2]=z;
        a[3]=w;
        a[4]=v;
        scan.close();

        // Prints each sequential element in array a
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}