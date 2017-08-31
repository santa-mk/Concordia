package santa_mk.concordia.model.resource;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by santa-mk on 2017/08/31.
 */
public class ToolTest {
    @Test
    public void baseTest() {
        Tool tool = new Tool();
        assertEquals(tool.getValue(), 3);
    }
}