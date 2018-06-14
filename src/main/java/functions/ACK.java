package functions;

public class ACK implements FunctionMethod {

    @Override
    public int function(int... args) {
        if (args.length != 2){
            System.out.println("Не правильное количество переменных для функции");
        } else {
            int n = args[0];
            int m = args[1];
            return accerm(n, m);
        }
        return 0;
    }

    private int accerm(int n, int m) {
        if (m == 0) return n + 1;
        if (m == 1) return n + 2;
        if (m == 2) return 2 * n + 3;
        else return (1 << (n + 3)) - 3;
    }
}
