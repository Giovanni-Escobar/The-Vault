import org.junit.Test;

import static org.junit.Assert.*;

/**
 * This will test the outcomes of illogical, valid, and invalid statements
 * and whether they actually  true,
 */
public class RomanToDecimalTest {
    @Test
    public void romanToDecimalTest(){
        assertEquals(RomanToDecimal.romanToDecimal("XIV"), 14);
        assertEquals(RomanToDecimal.romanToDecimal("LXXVIII"),78 );
        assertEquals(RomanToDecimal.romanToDecimal("DCCL"),750 );
        assertEquals(RomanToDecimal.romanToDecimal("MDCXLVI"),1646 );
        assertEquals(RomanToDecimal.romanToDecimal("VERY"), -1);
        assertEquals(RomanToDecimal.romanToDecimal("MUCH"), -1);
        assertEquals(RomanToDecimal.romanToDecimal("SLEEPY"), -1);
        assertEquals(RomanToDecimal.romanToDecimal("MDC"), 1600);
        assertNotEquals(RomanToDecimal.romanToDecimal("DMIC"), -1);
        assertNotEquals(RomanToDecimal.romanToDecimal("ICCID"), -1);
    }

}