package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/shorten-url")
public class UrlController {

    @Autowired
    private UrlService urlService;

    @PostMapping
    public ResponseEntity<?> shortenUrl(@RequestBody UrlRequest request) {
        String shortUrl = urlService.shortenUrl(request.getUrl());
        return ResponseEntity.ok().body(Map.of("url", shortUrl));
    }

    @GetMapping("/{shortCode}")
    public ResponseEntity<?> redirectUrl(@PathVariable String shortCode) {
        String originalUrl = urlService.getOriginalUrl(shortCode);
        if (originalUrl != null) {
            return ResponseEntity.status(302).header("Location", originalUrl).build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
