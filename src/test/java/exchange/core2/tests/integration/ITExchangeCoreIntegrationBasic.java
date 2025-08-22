package exchange.core2.tests.integration;

import Market.Order2.Order.common.config.PerformanceConfiguration;

public final class ITExchangeCoreIntegrationBasic extends ITExchangeCoreIntegration {

    @Override
    public PerformanceConfiguration getPerformanceConfiguration() {
        return PerformanceConfiguration.DEFAULT;
    }
}
