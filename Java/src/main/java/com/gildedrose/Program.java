package com.gildedrose;

import java.util.*;

public class Program {

    public static void main(String[] args) {
        ArrayList<Item> items = new ArrayList<Item>();
        Gildedrose app = new Gildedrose(items);
        app.runApp();
    }
}