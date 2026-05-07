

import org.junit.jupiter.api.Test;
import java.nio.file.Path;
import java.nio.file.Paths;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class OSPathTest {
    @Test
    void testCrossPlatformPath() {
        // Sử dụng Paths.get thay vì String cộng chuỗi
        // Java sẽ tự động dùng / trên Linux và \ trên Windows
        Path path = Paths.get("target", "test-folder");

        System.out.println("Hệ điều hành hiện tại: " + System.getProperty("os.name"));
        System.out.println("Đường dẫn máy tính tự tạo: " + path.toString());

        assertNotNull(path, "Đường dẫn không được null");
    }
}