package com.legacycodeplayground;
import org.junit.*;

import static org.mockito.Mockito.*;

import static org.junit.Assert.*;


public class MockingExampleTest {

    @Test
    public void foo() {

        //Arrange
        classToMock myMockedClass  = mock(classToMock.class);

        when(myMockedClass.getInt()).thenReturn(1).thenReturn(2);

        //Act
        myMockedClass.setInt(5);
        myMockedClass.setInt(7);

        //Assert
        verify(myMockedClass).setInt(5);
        verify(myMockedClass).setInt(7);

        assertEquals("first test", myMockedClass.getInt(),1);
        assertEquals("second test", myMockedClass.getInt(),2);
    }

}
