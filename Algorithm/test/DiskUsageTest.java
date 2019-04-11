import org.junit.Test;
import recursion.DiskUsage;

import java.io.File;

import static org.junit.Assert.*;

public class DiskUsageTest {
    @Test
    public void DiskUsageTest(){
        File file = new File("C:\\temp");
        assertNotEquals(0,DiskUsage.DiskUsage(file));

    }

}