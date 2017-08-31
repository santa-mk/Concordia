package santa_mk.concordia.model.resource;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by santa-mk on 2017/08/31.
 */
public class ClothTest {
    @Test
    public void baseTest() {
        Cloth cloth = new Cloth();
        assertEquals(cloth.getValue(), 5);
    }
}