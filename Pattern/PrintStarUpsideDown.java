public class PrintStarUpsideDown {
    public static void main(String[] args) {
        System.out.println();
        printStarUpsideDown(5);
    }
    static void printStarUpsideDown(int n){
        for(int i=0; i<=n-1; i++){
            for(int j=n-1; j>=i; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
