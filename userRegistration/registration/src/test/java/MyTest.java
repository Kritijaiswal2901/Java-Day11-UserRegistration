
import org.Registration;
import org.UserEntries;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class MyTest {

    @BeforeAll
    public static void beforeAll(){
        System.out.println("Before Class Execution once before all tests");
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("After class Execution");
    }

    @BeforeEach
    public void setUp(){
        System.out.println("Before Test Exceution");
    }

    @AfterEach
    public void after(){
        System.out.println("After executed after each test");
    }

    @Test
    public void testValidateFirstName() {
        Registration userRegistration = new Registration();
        UserEntries registrationFields = new UserEntries();
        
        registrationFields.setFirstName("Kriti");
        userRegistration.validateFirstName(registrationFields.getFirstName());
        assertEquals("Valid first name", userRegistration.getValidationResult());

        registrationFields.setFirstName("kriti");
        userRegistration.validateFirstName(registrationFields.getFirstName());
        assertNotEquals("Valid first name", userRegistration.getValidationResult());
    }

    @Test
    public void testValidateLastName() {
        Registration userRegistration = new Registration();
        UserEntries registrationFields = new UserEntries();

        registrationFields.setLastName("Jaiswal");
        userRegistration.validateLastName(registrationFields.getLastName());
        assertEquals("Valid last name", userRegistration.getValidationResult());

        registrationFields.setLastName("jaiswal");
        userRegistration.validateLastName(registrationFields.getLastName());
        assertNotEquals("Valid last name", userRegistration.getValidationResult());
    }

    @Test
    public void testValidateEmail() {
        Registration userRegistration = new Registration();
        UserEntries registrationFields = new UserEntries();

        registrationFields.setEmail("kriti@yahoo.com");
        userRegistration.validateEmail(registrationFields.getEmail());
        assertEquals("Valid email", userRegistration.getValidationResult());

        registrationFields.setEmail("kriti,com");
        userRegistration.validateEmail(registrationFields.getEmail());
        assertNotEquals("Valid email", userRegistration.getValidationResult());
    }

    @Test
    public void testValidateMobileNumber() {
        Registration userRegistration = new Registration();
        UserEntries registrationFields = new UserEntries();


        registrationFields.setMobileNumber("91 9919819801");
        userRegistration.validateMobileNumber(registrationFields.getMobileNumber());
        assertEquals("Valid mobile number", userRegistration.getValidationResult());

        registrationFields.setMobileNumber("95647");
        userRegistration.validateMobileNumber(registrationFields.getMobileNumber());
        assertNotEquals("Valid mobile number", userRegistration.getValidationResult());
    }

    @Test
    public void testValidatePassword() {
        Registration userRegistration = new Registration();
        UserEntries registrationFields = new UserEntries();

        registrationFields.setPassword("Kri@123ihj");
        userRegistration.validatePassword(registrationFields.getPassword());
        assertEquals("Valid password", userRegistration.getValidationResult());

        registrationFields.setPassword("jhghfjfn");
        userRegistration.validatePassword(registrationFields.getPassword());
        assertNotEquals("Valid password", userRegistration.getValidationResult());
    }
}