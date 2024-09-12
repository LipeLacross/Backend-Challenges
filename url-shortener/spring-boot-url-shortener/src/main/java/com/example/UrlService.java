package com.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class UrlService {

    private final Map<String, UrlData> urls = new HashMap<>();
    private final Random random = new Random();

    public String shortenUrl(String originalUrl) {
        String shortCode = generateShortCode();
        urls.put(shortCode, new UrlData(originalUrl, System.currentTimeMillis() + 24 * 60 * 60 * 1000));
        return "https://xxx.com/" + shortCode;
    }

    public String getOriginalUrl(String shortCode) {
        UrlData urlData = urls.get(shortCode);
        if (urlData != null && urlData.getExpiry() > System.currentTimeMillis()) {
            return urlData.getOriginalUrl();
        }
        return null;
    }

    private String generateShortCode() {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder shortCode = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            shortCode.append(characters.charAt(random.nextInt(characters.length())));
        }
        return shortCode.toString();
    }

    private static class UrlData {
        private final String originalUrl;
        private final long expiry;

        public UrlData(String originalUrl, long expiry) {
            this.originalUrl = originalUrl;
            this.expiry = expiry;
        }

        public String getOriginalUrl() {
            return originalUrl;
        }

        public long getExpiry() {
            return expiry;
        }
    }
}
