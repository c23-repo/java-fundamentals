package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class ShopTest {

    @Test
    public void test_ShopConstructor(){
        Shop shopTest = new Shop("Safeway",
                "Grocery Store", "$");
    }

}