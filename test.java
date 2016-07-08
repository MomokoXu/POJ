import java.util.*;
public class test {
 
    /**
     * @param args
     */
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int n = scan.nextInt();
        while(n!=0)    {
            int i;
            int total=0;int flag=0;
            for(i=1;i+flag<=n;flag+=i,i++)
                total +=(i*i);
            total+=(n-flag)*i;
            System.out.println(n+" "+total);
            n = scan.nextInt();
        }
    }
}