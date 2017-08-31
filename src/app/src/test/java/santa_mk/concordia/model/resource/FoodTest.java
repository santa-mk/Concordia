package santa_mk.concordia.model.resource;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by santa-mk on 2017/08/31.
 */
public class FoodTest {
    @Test
    public void baseTest() {
        Food food = new Food();
        assertEquals(food.getValue(), 2);
    }
}