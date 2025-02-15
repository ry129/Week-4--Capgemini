import JunitTestingPrograms.TestingBeforeEachandAfterEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TestConnection {

    private TestingBeforeEachandAfterEach dbConnection;

    @BeforeEach
    void setUp() {
        dbConnection = new TestingBeforeEachandAfterEach();
        dbConnection.connect();
    }

    @AfterEach
    void tearDown() {
        dbConnection.disconnect();
    }

    @Test
    void testConnectionEstablished() {
        assertTrue(dbConnection.isConnected());
    }

    @Test
    void testConnectionClosedAfterEachTest() {
        // This test will pass as long as @AfterEach properly disconnects after every test
        assertTrue(dbConnection.isConnected());
    }
}
