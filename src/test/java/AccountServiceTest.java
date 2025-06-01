
import khoalm.example.AccountService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class AccountServiceTest {

    private AccountService service;

    @BeforeEach
    void setUp() {
        service = new AccountService();
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/test-data.csv", numLinesToSkip = 1)
    @DisplayName("Test registerAccount with various inputs")
    void testRegisterAccount(String username, String password, String email, boolean expected) {
        boolean result = service.registerAccount(username, password, email);
        assertEquals(expected, result,
                () -> String.format("Failed for username=%s, password=%s, email=%s",
                        username, password, email));
    }
}
