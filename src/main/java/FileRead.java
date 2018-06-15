import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileRead {
    private static String fileName;

    FileRead(String fileName){
        this.fileName = fileName;
    }

    public Object[] fileToMassiveObject() {
        Path paths = Paths.get(fileName);

        try {
            return Files.lines(paths, StandardCharsets.ISO_8859_1).toArray();
        } catch (NoSuchFileException e) {
            System.out.println(e);
        } catch (IOException ex){
            System.out.println(ex);
        }
        return null;
    }

}
