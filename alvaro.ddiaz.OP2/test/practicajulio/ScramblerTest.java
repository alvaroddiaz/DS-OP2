/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicajulio;

import alvaro.ddiaz.OP2.Scrambler;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

    public class ScramblerTest {
    public List < String > operations =
    Arrays . asList ("SWP 4 0", "SWL d b", "REP 0 4", "ROL 1", "MOP 1 4", "ROR 3");
    @Test
    public void encodePassword () {
    Scrambler scrambler = new Scrambler ();
    assertEquals ("eacbd", scrambler . encodePassword ("abcde", operations ));
}
    @Test
    public void decodePassword () {
    Scrambler scrambler = new Scrambler ();
    assertEquals ("abcde", scrambler . decodePassword ("eacbd", operations ));
    }
}