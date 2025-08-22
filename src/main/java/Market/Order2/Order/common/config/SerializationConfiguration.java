package Market.Order2.Order.common.config;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.util.function.Function;

import Market.Order2.Order.processors.journaling.DiskSerializationProcessor;
import Market.Order2.Order.processors.journaling.DiskSerializationProcessorConfiguration;
import Market.Order2.Order.processors.journaling.DummySerializationProcessor;
import Market.Order2.Order.processors.journaling.ISerializationProcessor;

@AllArgsConstructor
@Getter
@Builder
@ToString
public class SerializationConfiguration {

    // no serialization
    public static final SerializationConfiguration DEFAULT = SerializationConfiguration.builder()
            .enableJournaling(false)
            .serializationProcessorFactory(cfg -> DummySerializationProcessor.INSTANCE)
            .build();

    // no journaling, only snapshots
    public static final SerializationConfiguration DISK_SNAPSHOT_ONLY = SerializationConfiguration.builder()
            .enableJournaling(false)
            .serializationProcessorFactory(exchangeCfg -> new DiskSerializationProcessor(exchangeCfg, DiskSerializationProcessorConfiguration.createDefaultConfig()))
            .build();

    // snapshots and journaling
    public static final SerializationConfiguration DISK_JOURNALING = SerializationConfiguration.builder()
            .enableJournaling(true)
            .serializationProcessorFactory(exchangeCfg -> new DiskSerializationProcessor(exchangeCfg, DiskSerializationProcessorConfiguration.createDefaultConfig()))
            .build();

    /*
     * Enables journaling.
     * Set to false for analytics instances.
     */
    private final boolean enableJournaling;

    /*
     * Serialization processor implementations
     */
    private final Function<ExchangeConfiguration, ? extends ISerializationProcessor> serializationProcessorFactory;


}
