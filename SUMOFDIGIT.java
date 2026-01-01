//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {


        int n = 12345;
        System.out.println(sumOfDigits(n));
    System.out.println(n);
    }


static int sumOfDigits(int n) {
    int sum = 0;
    while (n != 0) {
        // Extract the last digit
        int last = n % 10;

        // Add last digit to sum
        sum += last;
System.out.println(sum);
        // Remove the last digit
      n=  n / 10;
    }
    return sum;

}
