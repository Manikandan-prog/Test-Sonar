package demo02;



//import junit.framework.Test;
//import junit.framework.TestCase;
//import junit.framework.TestSuite;
//
//
//
///**
// * Unit test for simple App.
// */
//public class AppTest 
//    extends TestCase
//{
//    /**
//     * Create the test case
//     *
//     * @param testName name of the test case
//     */
//    public AppTest( String testName )
//    {
//        super( testName );
//    }
//
//    /**
//     * @return the suite of tests being tested
//     */
//    public static Test suite()
//    {
//        return new TestSuite( AppTest.class );
//    }
//
//    /**
//     * Rigourous Test :-)
//     */
//    public void testApp()
//    {
//        assertTrue( true );
//    }
//}

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import com.demo.FooService;

import nl.altindag.log.LogCaptor;




public class FooServiceMethod {


    @Test

    public void logInfoAndWarnMessages() {

        String expectedInfoMessage = "This is info";

        String expectedWarnMessage = "This is Warning";


        LogCaptor logCaptor = LogCaptor.forClass(FooService.class);
        FooService fooService = new FooService();

       // fooService.sayHello();


        assertThat(logCaptor.getInfoLogs().contains(expectedInfoMessage));

        //assertThat(logCaptor.getWarnLogsrnLogs.containsExactly(expectedWarnMessage));

   }

}



