import khoalm.example.AccountService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class AccountServiceTest {

    private AccountService service;

    @BeforeEach
    void setUp() {
        service = new AccountService();
    }

    // 🔹 TEST CASE 1: Test registerAccount với dữ liệu từ file CSV
    @ParameterizedTest
    @CsvFileSource(resources = "/test-data.csv", numLinesToSkip = 1)
    @DisplayName("Test registerAccount with various inputs")
    void testRegisterAccount(String username, String password, String email, boolean expected) {
        boolean result = service.registerAccount(username, password, email);
        assertEquals(expected, result,
                () -> String.format("Failed for username=%s, password=%s, email=%s",
                        username, password, email));
    }

    // 🔹 TEST CASE 2: Test isValidEmail - valid emails
    @Test
    @DisplayName("Test isValidEmail with valid emails")
    void testIsValidEmail_Valid() {
        assertTrue(service.isValidEmail("test@example.com"));
        assertTrue(service.isValidEmail("user.name+tag+sorting@example.co.uk"));
    }

    // 🔹 TEST CASE 3: Test isValidEmail - invalid emails
    @Test
    @DisplayName("Test isValidEmail with invalid emails")
    void testIsValidEmail_Invalid() {
        assertFalse(service.isValidEmail("invalid-email"));
        assertFalse(service.isValidEmail("user@.com"));
        assertFalse(service.isValidEmail(""));
        assertFalse(service.isValidEmail(null));
    }

    @Test
    @DisplayName("Login fails with incorrect password")
    void testLoginWrongPassword() {
        assertFalse(service.login("john123", "wrongpass"));
    }

}

