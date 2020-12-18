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
       
        assertEquals("foo", app.items.get(0).name);

    }

}
