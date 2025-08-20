

### Features
- HFT optimized. Priority is a limit-order-move operation mean latency (currently ~0.5µs). Cancel operation takes ~0.7µs, placing new order ~1.0µs;
- In-memory working state for accounting data and order books.
- Event-sourcing - disk journaling and journal replay support, state snapshots (serialization) and restore operations, LZ4 compression.
- Lock-free and contention-free orders matching and risk control algorithms.
- No floating-point arithmetic, no loss of significance is possible.
- Matching engine and risk control operations are atomic and deterministic.
- Pipelined multi-core processing (based on LMAX Disruptor): each CPU core is responsible for certain processing stage, user accounts shard, or symbol order books shard.
- Two different risk processing modes (specified per symbol): direct-exchange and margin-trade.
- Maker/taker fees (defined in quote currency units).
- Two order books implementations: simple implementation ("Naive") and performance implementation ("Direct").
- Order types: Immediate-or-Cancel (IOC), Good-till-Cancel (GTC), Fill-or-Kill Budget (FOK-B)
- Testing - unit-tests, integration tests, stress tests, integrity/consistency tests.
- Low GC pressure, objects pooling, single ring-buffer.
- Threads affinity (requires JNA).
- User suspend/resume operation (reduces memory consumption).
- Core reports API (user balances, open interest).

### Installation
1. Install library into your Maven's local repository by running `mvn install`
2. Add the following Maven dependency to your project's `pom.xml`:
```
<dependency>
    <groupId>exchange.core2</groupId>
    <artifactId>exchange-core</artifactId>
    <version>0.5.3</version>
</dependency>
```
### Testing
- latency test: mvn -Dtest=PerfLatency#testLatencyMargin test
- throughput test: mvn -Dtest=PerfThroughput#testThroughputMargin test
- hiccups test: mvn -Dtest=PerfHiccups#testHiccups test
- serialization test: mvn -Dtest=PerfPersistence#testPersistenceMargin test
