package demo02;


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

       


        

       

   }

}



