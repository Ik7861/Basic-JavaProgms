//    Code with precision . Grow with persistence 
   package Ik;

   public class CodeMaster {
       public static void main(String[] args) {
             int n = 100, a = 0, b = 1, c;

                  System.out.println("\nExecuting Code...\n");

                  System.out.print(a + ", " + b);

        for (int i = 2; i < n; i++) {
            c = a + b;
            System.out.print(", " + c);
            a = b;
            b = c;
        }

        System.out.println("\n\n- Hey Ik ~ CodeMaster...");
    }
}
// i wasted hours for no reason Lol!