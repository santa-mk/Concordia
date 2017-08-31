package santa_mk.concordia.model.resource;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by santa-mk on 2017/08/31.
 */
public class BrickTest {
    @Test
    public void baseTest() {
        Brick brick = new Brick();
        assertEquals(brick.getValue(), 1);
    }
}