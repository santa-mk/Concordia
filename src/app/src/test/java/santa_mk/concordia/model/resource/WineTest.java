package santa_mk.concordia.model.resource;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by santa-mk on 2017/08/31.
 */
public class WineTest {
    @Test
    public void baseTest() {
        Wine wine = new Wine();
        assertEquals(wine.getValue(), 4);
    }
}