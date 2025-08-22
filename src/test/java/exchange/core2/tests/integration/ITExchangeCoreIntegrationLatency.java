package exchange.core2.tests.integration;

import Market.Order2.Order.common.config.PerformanceConfiguration;

public final class ITExchangeCoreIntegrationLatency extends ITExchangeCoreIntegration {

    @Override
    public PerformanceConfiguration getPerformanceConfiguration() {
        return PerformanceConfiguration.latencyPerformanceBuilder().build();
    }
}
