package test.java;

import main.java.Calculs;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.jupiter.api.Assertions.*;

//@RunWith(Parameterized.class)
public class CalculsTest {

    private Calculs c1 = null;
    private Calculs c2 = null;
    private Calculs c3 = null;

    /**
     * Initialise les valeurs avant chaque test
     */

    @BeforeEach
    void setUp() throws Exception{
        // Instanciations communes à tous les tests, initalisations
        c1 = new Calculs(1,2);
        c2 = new Calculs(10,20);
        c3 = new Calculs(100,200);
    }

    @AfterEach
    void tearDown() throws Exception {
        // Eventuel nettoyage/réinitialisation après chaque test
    }

    /**
     * Test method for {@link Calculs#multiplier()}.
     */
    @Test
    void testMultiplier(){
        if(c1.multiplier() != 2)
        {
            fail("Methode multiplier non conforme 2*1=2 ne fonctionne pas.");
        }
        assertEquals(c1.multiplier(), 2);
    }
//
//    @ParameterizedTest(name="Multiplication numéro {index}: nombre1={0}, nombre2={1}, résultat attendu = {2}")
//    @MethodSource("chargerJeuDeTest")
//    void testMultiplier(int firstNumber, int secondNumber, int expectedResult) {
//        Calculs monCal = new Calculs(firstNumber, secondNumber);
//        assertEquals(expectedResult, monCal.multiplier());
//    }
}
