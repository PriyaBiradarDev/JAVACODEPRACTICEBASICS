//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {


        int n = 5;
        System.out.println(factorial(n));
    System.out.println(n);
    }

static int factorial(int n)
{
    int res = 1, i;

    for (i = 2; i <= n; i++)
        res *= i;
    return res;
}