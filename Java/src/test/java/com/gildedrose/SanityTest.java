
package com.gildedrose;

import java.util.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SanityTest {

    @Test
    void foo() {
        UnbelivableComplexClass myUnbelivable = new UnbelivableComplexClass();
        UnInstantiableClass myClass = new UnInstantiableClass(myUnbelivable, 3);
        myClass.methodA(30);
        myClass.methodB(50);
        assertEquals(28764, myClass.getAmount());
    }

}
