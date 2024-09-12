package com.example;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/items")
public class ItemController {

    private static final List<Item> dataStore = new ArrayList<>();

    @PostMapping
    public ResponseEntity<Item> createItem(@RequestBody Item item) {
        try {
            item.setUserDocument(CryptoUtils.encrypt(item.getUserDocument()));
            item.setCreditCardToken(CryptoUtils.encrypt(item.getCreditCardToken()));
            item.setId(dataStore.size() + 1L);
            dataStore.add(item);
            return new ResponseEntity<>(item, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Item> getItem(@PathVariable Long id) {
        Optional<Item> item = dataStore.stream().filter(i -> i.getId().equals(id)).findFirst();
        if (item.isPresent()) {
            try {
                Item foundItem = item.get();
                foundItem.setUserDocument(CryptoUtils.decrypt(foundItem.getUserDocument()));
                foundItem.setCreditCardToken(CryptoUtils.decrypt(foundItem.getCreditCardToken()));
                return new ResponseEntity<>(foundItem, HttpStatus.OK);
            } catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
