public class PatternOne {
    public static void main(String[] args){
        printSquarePattern(6);
    }

    public static void printSquarePattern(int n){
        for(int i=0 ; i<=n-1 ; i++){
            for(int j=0 ; j<=n-1 ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}