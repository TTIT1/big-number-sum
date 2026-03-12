
import org.testng.annotations.Test;

import com.example.core.MyBigNumber;

public class MyBigNumberTest {
      MyBigNumber sumService = new MyBigNumber();

    @Test
    void testSum() {
        sumService.sum("21331", sumService.sum("1234", "897"));
    }
}
