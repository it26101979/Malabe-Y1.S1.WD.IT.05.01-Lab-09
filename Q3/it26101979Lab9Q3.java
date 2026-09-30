public class it26101979Lab9Q3 {

    
    public static int add(int a, int b) {
        return a + b;
    }

    
    public static int mul(int a, int b) {
        return a * b;
    }

    public static int squar(int a) {
        return a * a;
    }

    public static void main(String[] args) {
        
        int part1 = mul(3, 4);
        int part2 = mul(5, 7);
        int sum1 = add(part1, part2);
        int result1 = squar(sum1);

        
        int sum2 = add(4, 7);
        int sum3 = add(8, 3);
        int sq1 = squar(sum2);
        int sq2 = squar(sum3);
        int result2 = add(sq1, sq2);

        
        System.out.println("Result of (3 * 4 + 5 * 7)^2 : " + result1);
        System.out.println("Result of (4 + 7)^2 + (8 + 3)^2 : " + result2);
    }
}
