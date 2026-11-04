package org.example;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import javax.annotation.processing.SupportedAnnotationTypes;

public class MainTest {
    @Test
    public void gratesttest(){
        assertEquals(20,Main.greatest(4,20));
    }
}
