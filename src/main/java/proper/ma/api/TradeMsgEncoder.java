/* Generated SBE (Simple Binary Encoding) message codec. */
package proper.ma.api;

import org.agrona.MutableDirectBuffer;

@SuppressWarnings("all")
public final class TradeMsgEncoder
{
    public static final int BLOCK_LENGTH = 26;
    public static final int TEMPLATE_ID = 2;
    public static final int SCHEMA_ID = 1;
    public static final int SCHEMA_VERSION = 1;
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private final TradeMsgEncoder parentMessage = this;
    private MutableDirectBuffer buffer;
    private int initialOffset;
    private int offset;
    private int limit;

    public int sbeBlockLength()
    {
        return BLOCK_LENGTH;
    }

    public int sbeTemplateId()
    {
        return TEMPLATE_ID;
    }

    public int sbeSchemaId()
    {
        return SCHEMA_ID;
    }

    public int sbeSchemaVersion()
    {
        return SCHEMA_VERSION;
    }

    public String sbeSemanticType()
    {
        return "";
    }

    public MutableDirectBuffer buffer()
    {
        return buffer;
    }

    public int initialOffset()
    {
        return initialOffset;
    }

    public int offset()
    {
        return offset;
    }

    public TradeMsgEncoder wrap(final MutableDirectBuffer buffer, final int offset)
    {
        if (buffer != this.buffer)
        {
            this.buffer = buffer;
        }
        this.initialOffset = offset;
        this.offset = offset;
        limit(offset + BLOCK_LENGTH);

        return this;
    }

    public TradeMsgEncoder wrapAndApplyHeader(
        final MutableDirectBuffer buffer, final int offset, final MessageHeaderEncoder headerEncoder)
    {
        headerEncoder
            .wrap(buffer, offset)
            .blockLength(BLOCK_LENGTH)
            .templateId(TEMPLATE_ID)
            .schemaId(SCHEMA_ID)
            .version(SCHEMA_VERSION);

        return wrap(buffer, offset + MessageHeaderEncoder.ENCODED_LENGTH);
    }

    public int encodedLength()
    {
        return limit - offset;
    }

    public int limit()
    {
        return limit;
    }

    public void limit(final int limit)
    {
        this.limit = limit;
    }

    public static int instrumentId()
    {
        return 1;
    }

    public static int instrumentSinceVersion()
    {
        return 0;
    }

    public static int instrumentEncodingOffset()
    {
        return 0;
    }

    public static int instrumentEncodingLength()
    {
        return 18;
    }

    public static String instrumentMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }

        return "";
    }

    private final InstrumentEncoder instrument = new InstrumentEncoder();

    public InstrumentEncoder instrument()
    {
        instrument.wrap(buffer, offset + 0);
        return instrument;
    }

    public static int marketTimestampId()
    {
        return 2;
    }

    public static int marketTimestampSinceVersion()
    {
        return 0;
    }

    public static int marketTimestampEncodingOffset()
    {
        return 18;
    }

    public static int marketTimestampEncodingLength()
    {
        return 8;
    }

    public static String marketTimestampMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }

        return "";
    }

    public static long marketTimestampNullValue()
    {
        return 0xffffffffffffffffL;
    }

    public static long marketTimestampMinValue()
    {
        return 0x0L;
    }

    public static long marketTimestampMaxValue()
    {
        return 0xfffffffffffffffeL;
    }

    public TradeMsgEncoder marketTimestamp(final long value)
    {
        buffer.putLong(offset + 18, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    private final TradesEncoder trades = new TradesEncoder(this);

    public static long tradesId()
    {
        return 3;
    }

    public TradesEncoder tradesCount(final int count)
    {
        trades.wrap(buffer, count);
        return trades;
    }

    public static final class TradesEncoder
    {
        public static final int HEADER_SIZE = 3;
        private final TradeMsgEncoder parentMessage;
        private MutableDirectBuffer buffer;
        private int count;
        private int index;
        private int offset;
        private int initialLimit;

        TradesEncoder(final TradeMsgEncoder parentMessage)
        {
            this.parentMessage = parentMessage;
        }

        public void wrap(final MutableDirectBuffer buffer, final int count)
        {
            if (count < 0 || count > 254)
            {
                throw new IllegalArgumentException("count outside allowed range: count=" + count);
            }

            if (buffer != this.buffer)
            {
                this.buffer = buffer;
            }

            index = 0;
            this.count = count;
            final int limit = parentMessage.limit();
            initialLimit = limit;
            parentMessage.limit(limit + HEADER_SIZE);
            buffer.putShort(limit + 0, (short)26, java.nio.ByteOrder.LITTLE_ENDIAN);
            buffer.putByte(limit + 2, (byte)count);
        }

        public TradesEncoder next()
        {
            if (index >= count)
            {
                throw new java.util.NoSuchElementException();
            }

            offset = parentMessage.limit();
            parentMessage.limit(offset + sbeBlockLength());
            ++index;

            return this;
        }

        public int resetCountToIndex()
        {
            count = index;
            buffer.putByte(initialLimit + 2, (byte)count);

            return count;
        }

        public static short countMinValue()
        {
            return (short)0;
        }

        public static short countMaxValue()
        {
            return (short)254;
        }

        public static int sbeHeaderSize()
        {
            return HEADER_SIZE;
        }

        public static int sbeBlockLength()
        {
            return 26;
        }

        public static int priceId()
        {
            return 1;
        }

        public static int priceSinceVersion()
        {
            return 0;
        }

        public static int priceEncodingOffset()
        {
            return 0;
        }

        public static int priceEncodingLength()
        {
            return 9;
        }

        public static String priceMetaAttribute(final MetaAttribute metaAttribute)
        {
            if (MetaAttribute.PRESENCE == metaAttribute)
            {
                return "required";
            }

            return "";
        }

        private final DecEncoder price = new DecEncoder();

        public DecEncoder price()
        {
            price.wrap(buffer, offset + 0);
            return price;
        }

        public static int sizeId()
        {
            return 2;
        }

        public static int sizeSinceVersion()
        {
            return 0;
        }

        public static int sizeEncodingOffset()
        {
            return 9;
        }

        public static int sizeEncodingLength()
        {
            return 9;
        }

        public static String sizeMetaAttribute(final MetaAttribute metaAttribute)
        {
            if (MetaAttribute.PRESENCE == metaAttribute)
            {
                return "required";
            }

            return "";
        }

        private final DecEncoder size = new DecEncoder();

        public DecEncoder size()
        {
            size.wrap(buffer, offset + 9);
            return size;
        }

        public static int timestampId()
        {
            return 3;
        }

        public static int timestampSinceVersion()
        {
            return 0;
        }

        public static int timestampEncodingOffset()
        {
            return 18;
        }

        public static int timestampEncodingLength()
        {
            return 8;
        }

        public static String timestampMetaAttribute(final MetaAttribute metaAttribute)
        {
            if (MetaAttribute.PRESENCE == metaAttribute)
            {
                return "required";
            }

            return "";
        }

        public static long timestampNullValue()
        {
            return 0xffffffffffffffffL;
        }

        public static long timestampMinValue()
        {
            return 0x0L;
        }

        public static long timestampMaxValue()
        {
            return 0xfffffffffffffffeL;
        }

        public TradesEncoder timestamp(final long value)
        {
            buffer.putLong(offset + 18, value, java.nio.ByteOrder.LITTLE_ENDIAN);
            return this;
        }

    }

    public String toString()
    {
        if (null == buffer)
        {
            return "";
        }

        return appendTo(new StringBuilder()).toString();
    }

    public StringBuilder appendTo(final StringBuilder builder)
    {
        if (null == buffer)
        {
            return builder;
        }

        final TradeMsgDecoder decoder = new TradeMsgDecoder();
        decoder.wrap(buffer, initialOffset, BLOCK_LENGTH, SCHEMA_VERSION);

        return decoder.appendTo(builder);
    }
}
