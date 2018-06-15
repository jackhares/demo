import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;

public class FileWrite {

    private static String fileWriteName;

    FileWrite(String fileName){
        this.fileWriteName = fileName;
    }

    public void setFileWriteName(ArrayList<String> writeName) {
        Path paths = Paths.get(fileWriteName);

        try {
             Files.write(paths, writeName);
        } catch (NoSuchFileException e) {
            System.out.println(e);
        } catch (IOException ex){
            System.out.println(ex);
        }

    }


}
