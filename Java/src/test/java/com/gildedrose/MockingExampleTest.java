package com.gildedrose;
import java.util.*;
import org.junit.*;

import static org.mockito.Mockito.*;

import static org.junit.Assert.*;

// example is from https://javadoc.io/doc/org.mockito/mockito-core/latest/org/mockito/Mockito.html

public class MockingExampleTest {

    @Test
    public void foo() {

        // You can mock concrete classes, not just interfaces
        LinkedList<String> mockedList = mock(LinkedList.class);

        // stubbing
        when(mockedList.get(0)).thenReturn("first");
        when(mockedList.get(1)).thenReturn("second");

        assertEquals("first test", mockedList.get(0),"first");
        assertEquals("second test", mockedList.get(1),"second");
    }

}
