package functions;

public class FIB implements FunctionMethod {

    @Override
    public int function(int[] args) {
        if (args.length != 1){
            System.out.println("Не правильное количество переменных для функции");
        } else {
            return fibonacci(args[0]);
        }
        return 0;

    }

    private int fibonacci(int args) {
        if (args == 0) {
            return 0;
        } else if (args == 1) {
            return 1;
        } else {
            return fibonacci(args - 1) + fibonacci(args - 2);
        }
    }
}
