package org.example;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;

public class HttpStatusImageDownloader extends HttpStatusChecker {
    public void downloadStatusImage(int code) {
        try {
            URL url = new URL(getStatusImage(code));
            BufferedImage image = ImageIO.read(url);
            FileOutputStream fos = new FileOutputStream(code + ".jpg");
            ImageIO.write(image, "jpg", fos);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
