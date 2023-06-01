package com.api.prog4td1p1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.concurrent.CountDownLatch;

public class ClassUniqueInstanceTest {
    @Test
    public void create_only_one_mutale_instance_ok(){
        ClassUniqueInstance classUniqueInstance1 = ClassUniqueInstance.INSTANCE.getInstance();
        ClassUniqueInstance classUniqueInstance2 = ClassUniqueInstance.INSTANCE.getInstance();

        classUniqueInstance1.setClick(8);
        classUniqueInstance2.setClick(3);

        // the last change apply to all
        assertEquals(3, classUniqueInstance2.getClick());
        assertEquals(3, classUniqueInstance1.getClick());
    }
}
