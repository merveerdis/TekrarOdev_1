package Ders_4;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class BeforeClass_AfterClass {

    @BeforeClass
    public static void setUp() {
        System.out.println("BeforeClass calisti");
    }
        @Test
        public void test1(){
            System.out.println("Test1 calisti");

        }
        @Test
        public void test2(){
            System.out.println("Test2 calisti" );

        }
        @AfterClass
        public static void teardown(){
            System.out.println("Afterclass calisti");
    }

    }



