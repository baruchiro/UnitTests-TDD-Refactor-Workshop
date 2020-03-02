package com.gildedrose;
import java.util.*;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

// example is from https://javadoc.io/doc/org.mockito/mockito-core/latest/org/mockito/Mockito.html

class MockingExampleTest {

    @Test
    void foo() {

        // You can mock concrete classes, not just interfaces
        LinkedList mockedList = mock(LinkedList.class);

        // stubbing
        when(mockedList.get(0)).thenReturn("first");
        when(mockedList.get(1)).thenReturn("second");

        assertEquals("first", mockedList.get(0),"The first one");
        assertEquals("second", mockedList.get(1),"The second one");
    }

}
