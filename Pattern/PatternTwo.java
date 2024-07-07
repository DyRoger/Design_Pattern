public class PatternTwo {
    public static void main(String[] args){
        printTrianglePattern(5);
    }

    static void printTrianglePattern(int n){
        for(int i=0; i<=n-1; i++){
            // System.out.println("Row no :: "+ i);
            for(int j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
