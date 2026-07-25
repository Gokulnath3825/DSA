public class HouseRobber {

    public static int robber(int ar[]){
        int n = ar.length;

        if(n==1) return ar[0];

        int p2 = ar[0], p1 = Math.max(ar[0],ar[1]);

        int c = 0;

        for(int i=2;i<n;i++){
            c = Math.max(p1, ar[i]+p2);
            p2 = p1; p1 = c;
        }
        return p1;


    } 

    public static void main(String[] args) {

        int ar [] ={1,2,3,1};
        System.out.println(robber(ar));
    }
}
