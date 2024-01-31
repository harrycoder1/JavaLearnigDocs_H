public class Array {
    public static void main(String[] args) {
        int num[][] = new int[3][4];
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[0].length; j++) {
    
         num[i][j] =      (int) (( Math.random()%5)*10);
                System.out.print(num[i][j]+" ");
            }
            System.out.println();
        }
System.out.println();
        for(int n[]:num){
            for(int e :n){
                System.out.print(e+" ");
            }
            System.out.println();
        }
    }
}

