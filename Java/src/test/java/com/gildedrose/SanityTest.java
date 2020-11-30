
package com.gildedrose;

import org.junit.*;

import static org.junit.Assert.*;

public class SanityTest {

    @Test
    public void foo() {
        UnbelivableComplexClass myUnbelivable = new UnbelivableComplexClass();
        UnInstantiableClass myClass = new UnInstantiableClass(myUnbelivable);
        myClass.methodA(30);
        myClass.methodB(50);
        assertEquals(1004, myClass.getAmount());
    }

}
