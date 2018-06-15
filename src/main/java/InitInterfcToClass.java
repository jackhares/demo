import functions.FunctionMethod;

public class InitInterfcToClass {

    public static FunctionMethod functionMethod(String whichClass){
        try {
            Class clazz = Class.forName(whichClass);
            return (FunctionMethod) clazz.newInstance();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return null;
    }

}
