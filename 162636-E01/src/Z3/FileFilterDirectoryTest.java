package Z3;

import java.io.File;

public class FileFilterDirectoryTest {
    public static void main (String[] args) {
        File[] list = FileFilterDirectory.directoryListMethod("D:\\Programy\\Git");
        for (File file : list) {
            System.out.println(file);
        }
        System.out.println();
        list = FileFilterDirectory.directoryListAnonymousClass("D:\\Programy\\Git");
        for (File file : list) {
            System.out.println(file);
        }
    }
}
