import org.junit.Test;
import method.GenericName;
import static org.junit.Assert.*;

public class GenericNameTest {
    @Test
    public void outputClassNameTest(){
        GenericName gm = new GenericName();
        assertEquals("java.lang.String",gm.outputClassName(""));
        assertEquals("java.lang.Integer",gm.outputClassName(1));
        assertEquals("java.lang.Double",gm.outputClassName(1.0));
        assertEquals("java.lang.Float",gm.outputClassName(1.0F));
        assertEquals("java.lang.Character",gm.outputClassName('c'));
        assertEquals("method.GenericName",gm.outputClassName(gm));
    }

}