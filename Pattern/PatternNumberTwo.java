public class PatternNumberTwo {
    public static void main(String[] args) {
        System.out.println();
        printNumberPatternTwo(5);
    }

    static void printNumberPatternTwo(int n){
        for(int i=0; i<=n-1 ; i++){
            for(int j=0; j<=i; j++){
                System.out.print(i+1+" ");
            }
            System.out.println();
        }
    }
}
