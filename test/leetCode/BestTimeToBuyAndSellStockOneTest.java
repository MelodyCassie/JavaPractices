package leetCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BestTimeToBuyAndSellStockOneTest {
    @Test
    public void testBestTimeToBuySellStock(){
        int[] prices = {7,1,5,3,6,4};
        int result = 5;
        int expected = (BestTimeToBuyAndSellStockOne.checkBestTime(prices));
        assertEquals(result,expected);
        System.out.println(result);
    }

}