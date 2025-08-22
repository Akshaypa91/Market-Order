package exchange.core2.tests.integration;

import Market.Order2.Order.common.config.PerformanceConfiguration;

public class ITExchangeCoreIntegrationStressLatency extends ITExchangeCoreIntegrationStress {

    @Override
    public PerformanceConfiguration getPerformanceConfiguration() {
        return PerformanceConfiguration.DEFAULT;
    }
}
