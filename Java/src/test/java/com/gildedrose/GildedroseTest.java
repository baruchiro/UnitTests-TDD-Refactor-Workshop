package com.gildedrose;
import java.util.*;

import org.junit.*;

import static org.junit.Assert.*;

public class GildedroseTest {

    @Test
    public void foo() {
        ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item("foo", 0, 0) );
        Gildedrose app = new Gildedrose(items);
        for (int i = 0; i < app.items.size(); i++) {
            if (!app.items.get(i).name.equals("Aged Brie")
                    && !app.items.get(i).name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                if (app.items.get(i).quality > 0) {
                    if (!app.items.get(i).name.equals("Sulfuras, Hand of Ragnaros")) {
                        app.items.get(i).quality = app.items.get(i).quality - 1;
                    }
                }
            } else {
                if (app.items.get(i).quality < 50) {
                    app.items.get(i).quality = app.items.get(i).quality + 1;

                    if (app.items.get(i).name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        if (app.items.get(i).sellIn < 11) {
                            if (app.items.get(i).quality < 50) {
                                app.items.get(i).quality = app.items.get(i).quality + 1;
                            }
                        }

                        if (app.items.get(i).sellIn < 6) {
                            if (app.items.get(i).quality < 50) {
                                app.items.get(i).quality = app.items.get(i).quality + 1;
                            }
                        }
                    }
                }
            }

            if (!app.items.get(i).name.equals("Sulfuras, Hand of Ragnaros")) {
                app.items.get(i).sellIn = app.items.get(i).sellIn - 1;
            }

            if (app.items.get(i).sellIn < 0) {
                if (!app.items.get(i).name.equals("Aged Brie")) {
                    if (!app.items.get(i).name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        if (app.items.get(i).quality > 0) {
                            if (!app.items.get(i).name.equals("Sulfuras, Hand of Ragnaros")) {
                                app.items.get(i).quality = app.items.get(i).quality - 1;
                            }
                        }
                    } else {
                        app.items.get(i).quality = app.items.get(i).quality - app.items.get(i).quality;
                    }
                } else {
                    if (app.items.get(i).quality < 50) {
                        app.items.get(i).quality = app.items.get(i).quality + 1;
                    }
                }
            }
        }
        assertEquals("foo", app.items.get(0).name);

    }

}
