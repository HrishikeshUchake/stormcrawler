package org.apache.stormcrawler.test;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SLF4JWarningTest {
    private static final Logger LOG = LoggerFactory.getLogger(SLF4JWarningTest.class);
    
    @Test
    public void testSLF4JLogging() {
        LOG.info("Testing SLF4J logging - should show warnings if no implementation");
        LOG.error("This should also show SLF4J warnings");
        System.out.println("Test completed");
    }
}