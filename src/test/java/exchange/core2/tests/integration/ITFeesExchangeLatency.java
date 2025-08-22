package exchange.core2.tests.integration;

import Market.Order2.Order.common.config.PerformanceConfiguration;

public class ITFeesExchangeLatency extends ITFeesExchange {
    @Override
    public PerformanceConfiguration getPerformanceConfiguration() {
        return PerformanceConfiguration.latencyPerformanceBuilder().build();
    }
}
