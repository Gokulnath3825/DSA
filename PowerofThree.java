public class  PowerofThree {

    public static boolean isPower(int n){
        if(n==1){
            return true;
        }

        if(n<=0 || n % 3 != 0){
            return false;
        }
        else{
            return isPower(n/3);
        }
    }
    

    public static void main(String[] args) {
        System.out.println(isPower(45));
        System.out.println(isPower(3));
        System.out.println(isPower(27));
    }
}
