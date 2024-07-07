public class PatternNumberOne {
    public static void main(String[] args) {
        printNumberPatternOne(6);
    }

    static void printNumberPatternOne(int n){

        for(int i=0; i<=n-1 ; i++){
            // System.out.println("Row :: "+i);
            for(int j=0; j<=i ; j++){
                
                // System.out.println("Column :: i="+i+" j="+j);
                System.out.print(j+1 + " ");
                // System.out.println();
                // System.out.println("Column :: i="+i+" j="+j);

            }
            System.out.println();
        }
    }
}
