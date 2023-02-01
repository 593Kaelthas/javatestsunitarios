package javatests.util;

import org.junit.Assert;
import org.junit.Test;

import static javatests.util.PasswordUtil.*;
import static org.junit.Assert.*;

public class PasswordUtilTest {

    @Test
    public void weak_when_has_less_than_8_letters() {

        assertEquals(SecurityLevel.WEAK, assesPassword("1234567"));
    }

    @Test
    public void weak_only_when_has_letters() {
        assertEquals(SecurityLevel.WEAK,assesPassword("abcdefgh"));
    }

    @Test
    public void medium_when_has_letters_and_numbers() {
        assertEquals(SecurityLevel.MEDIUM,assesPassword("abcd1234"));
    }

    @Test
    public void strong_when_has_letters_numbers_and_symbols() {
        assertEquals(SecurityLevel.STRONG,assesPassword("dnfisdui2343&^*%"));
    }
}