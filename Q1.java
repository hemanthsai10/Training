import java.util.*;
public class Q1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a[]={1,5,2,6};
        int b[]={1,4,5,7};
        int c[]={4,7,1,3};
        int a1[]={a[a.length-1],a[a.length-2]};
        int c1[]={c[c.length-1],c[c.length-2]};
        int d[]=new int[a1.length+c1.length];
        int ind=0;
        for(int i=0;i<a1.length;i++,ind++){
            d[ind]=a1[i];
        }
        for(int i=0;i<c1.length;i++,ind++){
            d[ind]=c1[i];
        }
        Arrays.sort(d);
        for(int i=0;i<d.length;i++){
            System.out.println(d[i]);
        }
    }
}
