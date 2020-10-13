package com.gildedrose;

import java.util.*;
import java.io.IOException;

class GildedRose {
    ArrayList<Item> items = new ArrayList<Item>();

    public GildedRose(ArrayList<Item> items) {
        this.items = items;
    }

    public void runApp()
{
    char option='0';
    System.out.println("Welcome to Guilded Rose inventory management");
    System.out.println("********************************************");
    while (true)
    {
        
           
        System.out.println("Options:");
        System.out.println("    Add Items: 1-Brie, 2-Backstage pass, 3-Sulfuras, 4-Beer");
        System.out.println("    0-Tick (advance a day), 9-Exit");
        try {

            option = (char)System.in.read();
            System.in.read();

        }
        catch (IOException e){
            System.out.println("Error reading from user");
        }
        if (option=='9'){
            return;
        }
        switch (option)
        {
        case '1':
            items.add(new Item("Aged Brie", 15, 20));
            break;
        case '2':
        items.add(new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20));
            break;
        case '3':
        items.add(new Item("Sulfuras, Hand of Ragnaros", 15, 20));
            break;
        case '4':
        items.add(new Item("Beer", 15, 20));
            break;
        case '0':
            updateQuality();
            break;
        
        }


        if (items.size() >= 0)
        {
            System.out.println("Current Inventory:");
           
            for (int i = 0; i < items.size(); i++) {
                System.out.println("SellIn:"+items.get(i).sellIn+", Quality:"+items.get(i).quality+", Name: "+items.get(i).name);
            }
        }
    }
}

    public void updateQuality() {
        for (int i = 0; i < items.size(); i++) {
            if (!items.get(i).name.equals("Aged Brie")
                    && !items.get(i).name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                if (items.get(i).quality > 0) {
                    if (!items.get(i).name.equals("Sulfuras, Hand of Ragnaros")) {
                        items.get(i).quality = items.get(i).quality - 1;
                    }
                }
            } else {
                if (items.get(i).quality < 50) {
                    items.get(i).quality = items.get(i).quality + 1;

                    if (items.get(i).name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        if (items.get(i).sellIn < 11) {
                            if (items.get(i).quality < 50) {
                                items.get(i).quality = items.get(i).quality + 1;
                            }
                        }

                        if (items.get(i).sellIn < 6) {
                            if (items.get(i).quality < 50) {
                                items.get(i).quality = items.get(i).quality + 1;
                            }
                        }
                    }
                }
            }

            if (!items.get(i).name.equals("Sulfuras, Hand of Ragnaros")) {
                items.get(i).sellIn = items.get(i).sellIn - 1;
            }

            if (items.get(i).sellIn < 0) {
                if (!items.get(i).name.equals("Aged Brie")) {
                    if (!items.get(i).name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        if (items.get(i).quality > 0) {
                            if (!items.get(i).name.equals("Sulfuras, Hand of Ragnaros")) {
                                items.get(i).quality = items.get(i).quality - 1;
                            }
                        }
                    } else {
                        items.get(i).quality = items.get(i).quality - items.get(i).quality;
                    }
                } else {
                    if (items.get(i).quality < 50) {
                        items.get(i).quality = items.get(i).quality + 1;
                    }
                }
            }
        }
    }
}