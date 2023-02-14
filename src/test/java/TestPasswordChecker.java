import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/* Il test ha successo per ogni stringa la cui lunghezza è maggiore di 8, il bug consiste
    nel fatto che non viene eseguito nessun controllo sulla stringa in in input, quindi
    se l'input è per esempio null, il programma solleva un'eccezione */

class TestPasswordChecker {

    @Test
    void testIsPalindrome() {

        assertTrue(PasswordChecker.isPasswordValid("itopinonavevanonipoti"));
    }
}

