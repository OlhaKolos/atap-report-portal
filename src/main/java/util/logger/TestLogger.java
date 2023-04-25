package util.logger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestLogger {
    private static final Logger logger = LogManager.getLogger(TestLogger.class);

    public void testLogger() {
        logger.info("Info console log");
    }
}
