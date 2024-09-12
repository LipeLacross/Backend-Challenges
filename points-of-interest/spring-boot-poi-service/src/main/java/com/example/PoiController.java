package com.example;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/pois")
public class PoiController {

    private List<Poi> pois = new ArrayList<>();

    @PostMapping
    public void createPoi(@RequestBody Poi poi) {
        pois.add(poi);
    }

    @GetMapping
    public List<Poi> listPois() {
        return pois;
    }

    @GetMapping("/nearby")
    public List<Poi> listNearbyPois(@RequestParam int x, @RequestParam int y, @RequestParam double distance) {
        return pois.stream()
                .filter(poi -> Math.sqrt(Math.pow(poi.getX() - x, 2) + Math.pow(poi.getY() - y, 2)) <= distance)
                .collect(Collectors.toList());
    }
}
