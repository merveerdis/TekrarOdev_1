package Ders_4;

import org.testng.annotations.*;

public class BeforeMethod_AfterMethod {

    @BeforeClass
    public static void setUp() {
        System.out.println("BeforeClass calisti");
    }
    @BeforeMethod
    public void testtenOnce(){
        System.out.println("Testten once calisti");
    }
    @Test
    public void test1(){
        System.out.println("Test1 calisti");

    }
    @Test
    public void test2(){
        System.out.println("Test2 calisti" );

    }
    @AfterMethod
    public void testtenSonra(){
        System.out.println("Testten sonra calisti");
    }
    @AfterClass
    public static void teardown(){
        System.out.println("Afterclass calisti");
    }


}
