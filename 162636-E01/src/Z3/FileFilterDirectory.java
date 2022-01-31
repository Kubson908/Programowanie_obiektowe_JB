package Z3;

import java.io.File;
import java.io.FileFilter;

public class FileFilterDirectory {
    public static File[] directoryListMethod (String dir) {
        File file = new File(dir);
        return file.listFiles(r -> r.isDirectory());
    }

    public static File[] directoryListAnonymousClass (String dir) {
        File file = new File(dir);
        return file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isDirectory();
            }
        });
    }
}
