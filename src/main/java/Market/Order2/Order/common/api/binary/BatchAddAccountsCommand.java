package Market.Order2.Order.common.api.binary;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import net.openhft.chronicle.bytes.BytesIn;
import net.openhft.chronicle.bytes.BytesOut;
import org.eclipse.collections.impl.map.mutable.primitive.IntLongHashMap;
import org.eclipse.collections.impl.map.mutable.primitive.LongObjectHashMap;

import Market.Order2.Order.utils.SerializationUtils;

@AllArgsConstructor
@EqualsAndHashCode
@Getter
public final class BatchAddAccountsCommand implements BinaryDataCommand {

    private final LongObjectHashMap<IntLongHashMap> users;

    public BatchAddAccountsCommand(final BytesIn bytes) {
        users = SerializationUtils.readLongHashMap(bytes, c -> SerializationUtils.readIntLongHashMap(bytes));
    }

    @Override
    public void writeMarshallable(BytesOut bytes) {
        SerializationUtils.marshallLongHashMap(users, SerializationUtils::marshallIntLongHashMap, bytes);
    }

    @Override
    public int getBinaryCommandTypeCode() {
        return BinaryCommandType.ADD_ACCOUNTS.getCode();
    }
}
