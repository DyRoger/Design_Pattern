public class PrintNumberUpsideDown {

    public static void main(String[] args) {
        System.out.println();
        printNumberFromUpsideDown(5);
    }

    static void printNumberFromUpsideDown(int n){
        for(int i=0; i<=n-1; i++){
            int k=0;
            for(int j=n-1; j>=i; j--){
                System.out.print(++k);
            }
            System.out.println();
        }
    }
}