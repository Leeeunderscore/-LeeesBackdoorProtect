package Leees.Protect;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileUtils {
    public static void save(File dir) {
        if (!dir.exists()) {
            try {
                dir.mkdirs();
            } catch (Exception var5) {
                var5.printStackTrace();
            }
        }

        File file = new File("plugins/AntiBackdoor/canusecreative.txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (Exception var4) {
                var4.printStackTrace();
            }
        }

        try {
            BufferedWriter br = new BufferedWriter(new FileWriter("plugins/AntiBackdoor/canusecreative.txt"));
            Main.canCreative.forEach((s) -> {
                try {
                    br.append(s.toString());
                    br.newLine();
                    br.flush();
                } catch (IOException var3) {
                    var3.printStackTrace();
                }

            });
            br.close();
        } catch (Exception var3) {
            var3.printStackTrace();
        }

    }
}
