package edu.self.learn;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class AdditionTest {

    @Test
    public void testAddition() {
        assertEquals(2, Addition.add(1, 1));
    }
}
