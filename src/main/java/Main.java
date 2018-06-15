import functions.FunctionMethod;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    private static final String fileName = "C:\\Temp\\read\\src\\main\\java\\file";
    private static final String fileNameToWrite = "C:\\Temp\\git\\src\\main\\java\\filewrite";
    private static final String pathName =  "functions.";

    private static ArrayList<String[]> list = new ArrayList<>();
    public static void main(String[] args) {

        FileRead fileReader = new FileRead(fileName);

        Object[] lines = fileReader.fileToMassiveObject();
        ArrayList<String> output = new ArrayList<>();
        // парсим строки  lines  и получаем динамический массив, содержащий строковые массивы

        for (Object line : lines) {
            String l = line.toString();
            String[] lspl;
            lspl = l.split("\\s");

            list.add(lspl);
        }
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            String[] str = list.get(i);
            String name1 = str[0]; //имя необходимой функции
            FunctionMethod functionMethod = InitInterfcToClass.functionMethod(pathName + name1);
            int lngth = str.length - 1;
            int[] mas = new int[lngth];
            for (int ind = 1, j = 0; ind < str.length; ind++,j++) {
                mas[j] = Integer.parseInt(str[ind]);
            }

            int line = i + 1;
            String text = line + " : " + functionMethod.function(mas);
            output.add(text);
//            System.out.println(functionMethod.function(mas));
            FileWrite fileWrite = new FileWrite(fileNameToWrite);
            fileWrite.setFileWriteName(output);

        }


    }

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
