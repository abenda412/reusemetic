package org.math;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MathOpsTest {
    //Test all ADDITION ops
    @Test
    void testAddDoubles() {
        Assertions.assertEquals(10.2, MathOps.add(6.1,4.1));
    }
    @Test
    void testAddInts(){
        Assertions.assertEquals(10, MathOps.add(5,5));
    }
    @Test
    void testAddLongs(){
        Assertions.assertEquals(30000000000L, MathOps.add(15000000000L, 15000000000L));
    }
    @Test
    void testAddStrings(){
        Assertions.assertEquals(15, MathOps.add("10", "5"));
    }
    @Test
    void testAddBytes(){
        byte five = 0b101;
        Assertions.assertEquals(10, MathOps.add(five, five));
    }
    @Test
    void testAddHex(){
        String hex256 = "100";
        Assertions.assertEquals(512, MathOps.addHex(hex256, hex256));
        String hex13 = "D";
        Assertions.assertEquals(26, MathOps.addHex(hex13, hex13));
        Assertions.assertEquals(269, MathOps.addHex(hex256, hex13));
    }
    @Test
    void testAddOct(){
        String oct13 = "15";
        String oct17 = "21";
        String octNeg13 = "-15";
        Assertions.assertEquals(30, MathOps.addOct(oct13, oct17));
        Assertions.assertEquals(4, MathOps.addOct(oct17, octNeg13));
    }

    //Test all SUBTRACTION ops
    @Test
    void testSubtractDoubles(){
        Assertions.assertEquals(5.4, MathOps.subtract(10.9, 5.5));
    }
    @Test
    void testSubtractInts(){
        Assertions.assertEquals(3, MathOps.subtract(8,5));
    }
    @Test
    void testSubtractLongs(){
        Assertions.assertEquals(30000000000L, MathOps.subtract(60000000000L, 30000000000L));
    }
    @Test
    void testSubtractString(){
        Assertions.assertEquals(5, MathOps.subtract("13", "8"));
    }
    @Test
    void testSubtractBytes(){
        byte six = 0b110;
        byte three = 0b11;
        Assertions.assertEquals(3, MathOps.subtract(six,three));
    }
    @Test
    void testSubtractHex(){
        String hex256 = "100";
        String hex13 = "D";
        Assertions.assertEquals(243, MathOps.subtractHex(hex256, hex13));
        Assertions.assertEquals(0, MathOps.subtractHex(hex13, hex13));
        Assertions.assertEquals(-243, MathOps.subtractHex(hex13, hex256));
    }
    @Test
    void testSubtractOct(){
        String oct13 = "15";
        String oct17 = "21";
        String octNeg13 = "-15";

        Assertions.assertEquals(-4, MathOps.subtractOct(oct13, oct17));
        Assertions.assertEquals(4, MathOps.subtractOct(oct17, oct13));
        Assertions.assertEquals(30, MathOps.subtractOct(oct17, octNeg13));
    }

    //Test all DIVISION ops
    @Test
    void testDivideDoubles(){
        Assertions.assertEquals(3.3124999999999996, MathOps.divide(10.6, 3.2));
    }
    @Test
    void testDivideInts(){
        Assertions.assertEquals(3, MathOps.divide(18,6));
    }
    @Test
    void testDivideLongs(){
        Assertions.assertEquals(3, MathOps.divide(180000000000L, 60000000000L));
    }
    @Test
    void testDivideStrings(){
        Assertions.assertEquals(5, MathOps.divide(25,5));
    }
    @Test
    void testDivideBytes(){
        byte fifteen = 0b1111;
        byte five = 0b101;

        Assertions.assertEquals(3, MathOps.divide(fifteen, five));
    }
    @Test
    void testDivideHex(){
        String hex169 = "A9";
        String hex13 = "D";
        Assertions.assertEquals(13, MathOps.divideHex(hex169, hex13));
    }
    @Test
    void testDivideOct(){
        String oct169 = "251";
        String oct13 = "15";
        String octNeg13 = "-15";

        Assertions.assertEquals(13, MathOps.divideOct(oct169, oct13));
        Assertions.assertEquals(-13, MathOps.divideOct(oct169, octNeg13));
        Assertions.assertEquals(1, MathOps.divideOct(octNeg13, octNeg13));
    }

    //Test all MULTIPLY ops
    @Test
    void testMultiplyDoubles(){
        Assertions.assertEquals(60.760000000000005, MathOps.multiply(9.8, 6.2));
    }

    @Test
    void testMultiplyInts(){
        Assertions.assertEquals(18, MathOps.multiply(6,3));
    }
    @Test
    void testMultiplyLongs(){
        Assertions.assertEquals(30000000000L, MathOps.multiply(15000000000L, 2));
    }
    @Test
    void testMultiplyStrings(){
        Assertions.assertEquals(15, MathOps.multiply("5", "3"));
    }
    @Test
    void testMultiplyBytes(){
        byte five = 0b101;
        byte three = 0b11;

        Assertions.assertEquals(15, MathOps.multiply(five, three));
    }
    @Test
    void testMultiplyHex(){
        String hex13 = "D";
        String hex11 = "B";
        String hexNeg11 = "-B";
        Assertions.assertEquals(143, MathOps.multiplyHex(hex13, hex11));
        Assertions.assertEquals(121, MathOps.multiplyHex(hex11, hex11));
        Assertions.assertEquals(-121, MathOps.multiplyHex(hex11, hexNeg11));
        Assertions.assertEquals(121, MathOps.multiplyHex(hexNeg11, hexNeg11));
    }
    @Test
    void testMultiplyOct(){
        String oct13 = "15";
        String oct11 = "13";
        String octNeg11 = "-13";
        Assertions.assertEquals(143, MathOps.multiplyOct(oct13, oct11));
        Assertions.assertEquals(121, MathOps.multiplyOct(oct11, oct11));
        Assertions.assertEquals(-121, MathOps.multiplyOct(oct11, octNeg11));
        Assertions.assertEquals(121, MathOps.multiplyOct(octNeg11, octNeg11));
    }
}