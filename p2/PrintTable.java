public class PrintTable {
    public static void main(String[] args) {
        
        System.out.println("a\t a^2\t a^3");
        for (int a = 1; a <= 4; a++) {
        int a2 = a * a; 
        int a3 = a * a * a; 
        System.out.println(a + "\t " + a2 + "\t " + a3);

        }
    }
}
