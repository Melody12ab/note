package echo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class downloadEchoMusic {

    public void saveMusicBinary(String url, String path) {
        HttpURLConnection connection = null;
        FileOutputStream fos = null;
        InputStream in = null;
        try {
            connection=(HttpURLConnection) new URL(url).openConnection();
            in = connection.getInputStream();
            fos = new FileOutputStream(new File(path), true);
            byte[] temp = new byte[1024];
            int len = 0;
            while ((len = in.read(temp)) != -1) {
                fos.write(temp, 0, len);
            }
        } catch (UnsupportedOperationException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public int getSum(String url) {
        int num = 0;
        URL remoteUrl = null;
        while (true) {
            try {
                remoteUrl = new URL(url + num);
                HttpURLConnection connection = (HttpURLConnection) remoteUrl
                        .openConnection();
                if (connection.getResponseCode() >= 300) {
                    break;
                }
                num++;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return num;
    }

    public static void main(String[] args) {
        String freffix="http://cp.audio.echo.kibey.com/";
        String suffix = "DcsE49qaT3T7_S93MntrrckLYCs=/lswVRQ2FXBsvNJ4T0--vK2vb5GsM/seg";
        String url=freffix+suffix;
        String path = "D:/echo/未闻花名_粤语版.mp4";
        downloadEchoMusic dm = new downloadEchoMusic();
        int sum=dm.getSum(url);
        System.out.println(sum);
        for (int i = 0; i < sum; i++) {
            dm.saveMusicBinary(url + i, path);
        }
        System.out.println("done");
    }
}
