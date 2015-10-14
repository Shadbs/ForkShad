import org.junit.Test;
import static org.junit.Assert.*;

public class test {
    junk meep = new junk();

    int sum = meep.sum(2, 5);
    int testsum = 7;

    @Test
    public void testsum(){
        System.out.println (sum + " = " + testsum);
        assertEquals(7,testsum);
    }

}
