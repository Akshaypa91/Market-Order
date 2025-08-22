package exchange.core2.tests.integration;

import Market.Order2.Order.common.config.PerformanceConfiguration;

public class ITExchangeCoreIntegrationRejectionBasic extends ITExchangeCoreIntegrationRejection {


    @Override
    public PerformanceConfiguration getPerformanceConfiguration() {
        return PerformanceConfiguration.baseBuilder().build();
    }
}
