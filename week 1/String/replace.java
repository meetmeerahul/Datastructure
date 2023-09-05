import java.util.Scanner;

class replace {

        static void replacechar(String s) {
    
            int k=10;
            String newStr = "";
    
            for (int i = 0; i < s.length(); ++i) {
       
                int val = s.charAt(i);
         
                int dup = k;
    
                if (val + k > 122) {
                    k -= (122 - val);
                    k = k % 26;
                    
                    newStr += (char)(96 + k);
                } else {
                    newStr += (char)(val + k);
                }
    
                k = dup;
            }
    
         
            System.out.println(newStr);
        }
    
 
        public static void main(String[] args) {

            try (Scanner sc = new Scanner(System.in)) {
                System.out.println("Enter the string");
                String str = sc.nextLine();
                
                replacechar(str);
            }
        
    }

}