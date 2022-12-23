import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @BeforeAll   // should be static
    static void setUpAll() {
        System.out.println("Before All is executed");
    }

    @AfterAll  // should be static
    static void tearDownAll() {
        System.out.println("After All is executed");
    }

    @BeforeEach
    void setUpEach() {
        System.out.println("BeforeEach is executed.");
    }

    @AfterEach
    void tearDownEach() {
        System.out.println("AfterEach is executed.");
    }

    @Test
    void add() {
        System.out.println("Add method");
        int actual = Calculator.add(2, 3);  //2+3 = actual
        assertEquals(5, actual, "Test failed");  // this message will appear if test fails
    }

    @Test
    void add2() {
        System.out.println("Add2 method");
        //assertThrows(IllegalArgumentException.class, () -> Calculator.add2(3, 2));
//        assertThrows(AccessDeniedException.class, () -> Calculator.add2(3, 2)); //if num1>num2 --> fail
        assertThrows(IllegalArgumentException.class, () -> Calculator.add2(2, 3));
    }
    @Test
    void testCase1() {
//        System.out.println("Test Case 1");
        fail("Not implemented yet.");
    }

    @Test
    void testCase2() {
        System.out.println("Test Case 2");
        assertEquals("add", Calculator.operator);  // this 2 methods are same
        assertTrue(Calculator.operator.equals("add"));  // either true or false

    }

    @Test
    void testCase3() {
        System.out.println("Test Case 3");
        assertArrayEquals(new int[]{1, 2, 3}, new int[]{1, 2, 3}, "Arrays are not the same");
    }

    @Test
    void testCase4() {
        System.out.println("Test Case 4");
        String nullString = null;
        String notNullString = "Cydeo";
        assertNull(nullString);
        assertNotNull(notNullString);
        //        assertNull(notNullString);
        assertNotNull(nullString);
    }

    @Test
    void testCase5() {
        System.out.println("Test Case 5");

        Calculator c1 = new Calculator();
        Calculator c2 = c1;  // c1 and c2 same objects in memory
        Calculator c3 = new Calculator();

        assertSame(c1, c2);  // to check object references
        assertNotSame(c1, c2);


    }
}