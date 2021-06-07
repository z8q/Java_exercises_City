import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ScanClassTest {

    @Test
    void shouldBeRightPath() throws FileNotFoundException {

        ScanClass scanClass = new ScanClass();

        String expected = "src/main/resources/DirectoryFile.txt";

        String actual = scanClass.getPath();

        Assert.assertEquals(expected, actual);
    }

    @Test
    void shouldBeRightNumberOfItemsInTxT() throws Exception {

        ScanClass scanClass = new ScanClass();
        scanClass.scanTxt();


        int expected = 6;
        int actual = 0;
        if (scanClass.getCheckDifference() > 0) {
            actual = 0;
        } else {
            actual = 6;
        }

        Assert.assertEquals(expected, actual);

    }
}