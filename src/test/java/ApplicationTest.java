import camp.nextstep.edu.missionutils.test.NsTest;
import kiosk.Application;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ApplicationTest extends NsTest {

    @Test
    void 음식입력확인() {
        run("1","1","4","0","5");
        assertThat(output()).contains("와퍼 1개", "6900원");
    }

    @Override
    protected void runMain() {
        try {
            Application.main(new String[]{});
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
