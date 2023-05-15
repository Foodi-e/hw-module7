package org.example;

import org.jsoup.Jsoup;

import java.io.IOException;

public class HttpStatusChecker {
    private final String url = "https://http.cat";

    public String getStatusImage(int code) {
        try {
            return Jsoup.connect(url + "/" + code + ".jpg").ignoreContentType(true).get().location();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
