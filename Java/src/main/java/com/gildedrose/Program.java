package com.gildedrose;

import java.util.*;

public class Program {

    public static void main(String[] args) {
        ArrayList<Item> items = new ArrayList<Item>();
        GildedRose app = new GildedRose(items);
        app.runApp();
    }
}