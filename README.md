# 🚀 Exchange-Core (HFT Matching Engine)

An **ultra-low-latency, high-performance trading engine** optimized for **High Frequency Trading (HFT)**.  
Implements order matching, risk control, and account management with a focus on **determinism, scalability, and microsecond-level latency**.

---

## ✨ Features

- ⚡ **HFT Optimized**
  - Limit-order-move operation: ~0.5µs
  - Cancel operation: ~0.7µs
  - Place new order: ~1.0µs
- 🗃 **In-memory state** for order books and accounting data
- 📦 **Event Sourcing**
  - Disk journaling & replay
  - State snapshots & restore
  - LZ4 compression
- 🔒 **Lock-free & contention-free** order matching & risk control
- 🧮 **Deterministic processing**
  - No floating-point arithmetic → no precision loss
  - Atomic, deterministic operations
- 🧵 **Multi-core pipelined processing** (via LMAX Disruptor)
  - CPU cores dedicated to stages, accounts, or symbol shards
- 🛡 **Risk Processing Modes** per symbol:
  - Direct-exchange
  - Margin-trade
- 💰 **Maker/Taker fees** in quote currency
- 📚 **Two order book implementations**
  - `Naive` (simple)
  - `Direct` (performance)
- 📝 **Order types**
  - IOC (Immediate-Or-Cancel)
  - GTC (Good-Till-Cancel)
  - FOK-B (Fill-Or-Kill Budget)
- 🧪 **Testing**
  - Unit tests, integration, stress & consistency tests
- 🧹 **Low GC pressure**
  - Object pooling
  - Single ring-buffer
- ⚙️ **Thread affinity** (via JNA)
- 💤 **Suspend/Resume users** to reduce memory usage
- 📊 **Core Reports API**
  - User balances
  - Open interest

## ⚙️ Install & Test
```sh
# Install into local Maven repo
mvn install

# Run tests
mvn -Dtest=PerfLatency#testLatencyMargin test       # ⚡ Latency
mvn -Dtest=PerfThroughput#testThroughputMargin test # 📈 Throughput
mvn -Dtest=PerfHiccups#testHiccups test             # ⏱ Hiccups
mvn -Dtest=PerfPersistence#testPersistenceMargin test # 💾 Persistence
