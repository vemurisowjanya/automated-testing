package WebDriver;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import Logs.log4j;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.core.ZipFile;

/**
 * Created by naman on 16/6/17.
 */
public class driverManager {

    public void download(final String filename, final String urlString)
            throws MalformedURLException, IOException {
        log4j.Log.info("Downloading driver...");
        BufferedInputStream in = null;
        FileOutputStream fout = null;
        try {
            in = new BufferedInputStream(new URL(urlString).openStream());
            fout = new FileOutputStream(filename);

            final byte data[] = new byte[1024];
            int count;
            while ((count = in.read(data, 0, 1024)) != -1) {
                fout.write(data, 0, count);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (fout != null) {
                fout.close();
            }
        }
    }

    public void unzip(String source, String destination){
        try {
            ZipFile zipFile = new ZipFile(source);
            zipFile.extractAll(destination);
        } catch (ZipException e) {
            e.printStackTrace();
        }
    }

    public boolean checkIfFileExists(String path){
        File f = new File(path);
        if(f.exists()){
            return true;
        }
        else {
            return false;
        }
    }

    public void deleteZip(String path){
        File file = new File(path);
        file.delete();
    }

    public void makeFileExecutable(String path){
        File file = new File(path);
        file.setExecutable(true, false);
    }

}
