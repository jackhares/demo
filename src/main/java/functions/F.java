package functions;

public class F implements FunctionMethod {
    @Override
    public int function(int[] args) {
        if (args.length != 1){
            System.out.println("Не правильное количество переменных");
        } else {
            return factorial(args[0]);
        }
        return 0;
    }

    private int factorial(int arg) {
        if (arg == 0 ) return 1;
        return arg * factorial(arg - 1);
    }
}
