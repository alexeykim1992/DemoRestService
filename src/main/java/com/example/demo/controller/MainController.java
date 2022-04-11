package com.example.demo.controller;

import com.example.demo.model.Furniture;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/items")
public class MainController {

    List<Furniture> items = new ArrayList<>();

    @GetMapping
    @ResponseBody
    public List<Furniture> getItems(@RequestParam(name = "search", required = false) String itemName) {
        if(itemName == null) return items;
        return items.stream()
                .filter(item -> item.getName().contains(itemName))
                .collect(Collectors.toList());
    }

    @PostMapping
    @ResponseBody
    public int addItem(@RequestBody Furniture item) {
        items.add(item);
        return items.size() - 1;
    }

    @PutMapping("/{itemNo}")
    @ResponseBody
    public int editItem(@RequestBody Furniture item, @PathVariable int itemNo) {
        items.set(itemNo, item);
        return itemNo;
    }

    @DeleteMapping
    @ResponseBody
    public String deleteAll(){
        items.clear();
        return "YEAH";
    }

    @DeleteMapping("/{itemNo}")
    @ResponseBody
    public int deleteItem(@PathVariable int itemNo) {
        items.remove(itemNo);
        return itemNo;
    }
}
