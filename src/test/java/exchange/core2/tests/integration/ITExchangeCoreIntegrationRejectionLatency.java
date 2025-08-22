package exchange.core2.tests.integration;

import Market.Order2.Order.common.config.PerformanceConfiguration;

public class ITExchangeCoreIntegrationRejectionLatency extends ITExchangeCoreIntegrationRejection {

    @Override
    public PerformanceConfiguration getPerformanceConfiguration() {
        return PerformanceConfiguration.latencyPerformanceBuilder().build();
    }
}
