package Market.Order2.Order.processors;

import Market.Order2.Order.common.cmd.OrderCommand;

public interface SimpleEventHandler {

    /**
     * Handle command with resulting data
     *
     * @param seq   - sequence number
     * @param event - event
     * @return true to forcibly publish sequence (batches)
     */
    boolean onEvent(long seq, OrderCommand event);

}
