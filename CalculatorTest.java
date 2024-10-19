public class CalculatorTest {

    Caiculator caiculator = new Caiculator();
    @Test
    public void testSum() {
        double result = caiculator.sum(2, 3);
        assertEquals(5, result, "2+3 should equal 5");
    }
    @Test
    public void testDifference() {
        double result = caiculator.difference(5, 3);
        assertEquals(2, result, "5-3 should equal 2");
    }
    @Test
    public void testProduct() {
        double result = caiculator.product(5, 3);
        assertEquals(15, result, "5*3 should equal 15");
    }
    @Test
    public void testFraction() {
        double result = caiculator.fraction(15, 3);
        assertEquals(15, result, "15/3 should equal 5");
    }
    @Test
    public void testDivisionByZero(){
        assertThrows(Exeption.class,()-> caiculator.fraction(15,0))
    }
}

