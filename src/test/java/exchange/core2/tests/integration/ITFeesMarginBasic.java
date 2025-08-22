package exchange.core2.tests.integration;

import Market.Order2.Order.common.config.PerformanceConfiguration;

public final class ITFeesMarginBasic extends ITFeesMargin {
    @Override
    public PerformanceConfiguration getPerformanceConfiguration() {
        return PerformanceConfiguration.DEFAULT;
    }
}
