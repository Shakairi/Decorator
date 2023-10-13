package decorator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CafeTest {

    @Test
    public void testCafeSimples() {
        Cafe cafe = new CafeSimples();
        assertEquals(5.0, cafe.custo(), 0.001);
    }

    @Test
    public void testCafeComChantilly() {
        Cafe cafe = new CafeSimples();
        cafe = new Chantilly(cafe);
        assertEquals(6.0, cafe.custo(), 0.001);
    }

    @Test
    public void testCafeComCaramelo() {
        Cafe cafe = new CafeSimples();
        cafe = new Caramelo(cafe);
        assertEquals(6.5, cafe.custo(), 0.001);
    }

    @Test
    public void testCafeComChantillyECaramelo() {
        Cafe cafe = new CafeSimples();
        cafe = new Chantilly(cafe);
        cafe = new Caramelo(cafe);
        assertEquals(7.5, cafe.custo(), 0.001);
    }
}