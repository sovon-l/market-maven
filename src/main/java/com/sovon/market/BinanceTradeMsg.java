package com.sovon.market;

import java.math.BigDecimal;

import java.nio.ByteBuffer;
import org.agrona.concurrent.UnsafeBuffer;
import proper.ma.api.MessageHeaderEncoder;
import proper.ma.api.TradeMsgEncoder;
import proper.ma.api.TradeMsgEncoder.TradesEncoder;
import proper.ma.api.Exchange;
import proper.ma.api.InstrumentType;
import java.time.Instant;

public final class BinanceTradeMsg {
    public String stream;
    public TradeData data;

    public final class TradeData {
        public String e;
        public long E;
        public String s;
        public long t;
        public BigDecimal p; //dec
        public BigDecimal q; //dec
        public long b;
        public long a;
        public long T;
        public boolean m;
        public boolean M;
    }

    public final byte[] toSBEMessage() {
        final ByteBuffer byteBuffer = ByteBuffer.allocate(4096);
        final UnsafeBuffer directBuffer = new UnsafeBuffer(byteBuffer);
        final MessageHeaderEncoder messageHeaderEncoder = new MessageHeaderEncoder();
        final TradeMsgEncoder tmencoder = new TradeMsgEncoder();

        final int encodingLengthPlusHeader = encode(tmencoder, directBuffer, messageHeaderEncoder);
        byteBuffer.limit(encodingLengthPlusHeader);
        return byteBuffer.array();
    }
    
    int encode(
        final TradeMsgEncoder tm, 
        final UnsafeBuffer directBuffer, 
        final MessageHeaderEncoder messageHeaderEncoder
    ) {
        final Instant instant = Instant.now();
        final long market_timestamp = instant.getEpochSecond() * 1000000000L + instant.getNano();

        tm.wrapAndApplyHeader(directBuffer, 0, messageHeaderEncoder)
            .marketTimestamp(market_timestamp);

        tm.instrument()
            .exchange(Exchange.binance)
            .quote("btc")
            .base("usdt")
            .instrumentType(InstrumentType.spot);

        final TradesEncoder t = tm.tradesCount(1).next();
        t.price()
            .mantissa(this.data.p.unscaledValue().longValue())
            .exponent((byte) this.data.p.scale());
        t.size()
            .mantissa(this.data.q.unscaledValue().longValue())
            .exponent((byte) this.data.q.scale());
        t.timestamp(this.data.T * 1000000);

        return MessageHeaderEncoder.ENCODED_LENGTH + tm.encodedLength();
    }
}
