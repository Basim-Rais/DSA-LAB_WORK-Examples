import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Natural Number");
        int n = scanner.nextInt();
        
        int sum = 0;
        for (int i=1;i<=n;i++){
            sum += i;
        }
        
        System.out.println("Sum of first " + n + "Natural Number is " +sum);
        
        scanner.close();
        
    }
}