package love.programming;

public class ArrayTables {
    public static void main(String[] args) {
        int k;
        int[] myMultiplicationTable = {1, 2, 3, 4, 5,};
            for (int i = 1; i <= 10; i++) {
                System.out.println("My"+" "+ myMultiplicationTable[i]+ " "+ "table is:");
                for (int j = 1; j <= 10; j++) {
                    k = myMultiplicationTable[i] * j;
                    System.out.println(myMultiplicationTable[i] + "*" + j + "=" + k);
                }
            }
        }
}

