package JunitTestingPrograms;

public class TestingBeforeEachandAfterEach {
    private boolean isConnected;

        public void connect() {
            isConnected = true;
            System.out.println("Database connected");
        }

        public void disconnect() {
            isConnected = false;
            System.out.println("Database disconnected");
        }

        public boolean isConnected() {
            return isConnected;
        }
        public static void main(String[] args) {
            TestingBeforeEachandAfterEach test = new TestingBeforeEachandAfterEach();
            test.connect();
            test.disconnect();

        }
    }
