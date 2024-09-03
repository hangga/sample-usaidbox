import com.box.usaid.UsaidBox;
import org.junit.jupiter.api.Test;

public class SampleUnitTest {

    @Test
    void testMethod() {
        String path = System.getProperty("user.dir") + "/Programming in Python 3 - A Complete Introduction to the Python Language, Second Edition (2010) 1.pdf";
        new UsaidBox()
                .loadPdf(path)
                .setMaximized()
                .setVisible(true);
    }
}
