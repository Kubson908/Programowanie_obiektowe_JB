package E1BartosiewiczJakub.Z3;

import java.io.File;

public class FileNameList {
    public static String[] fileList(String dir) {
        File file = new File(dir);
        return file.list((a, b) -> true);
    }

    public static void main (String[] args) {
        String[] s = FileNameList.fileList("D:\\Programy\\Git");
        for (String s1 : s) {
            System.out.println(s1);
        }
    }
}
