/* Generated SBE (Simple Binary Encoding) message codec. */
package proper.ma.api;

import org.agrona.MutableDirectBuffer;

@SuppressWarnings("all")
public final class BasicOrderDetailEncoder
{
    public static final int SCHEMA_ID = 1;
    public static final int SCHEMA_VERSION = 1;
    public static final int ENCODED_LENGTH = 47;
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private int offset;
    private MutableDirectBuffer buffer;

    public BasicOrderDetailEncoder wrap(final MutableDirectBuffer buffer, final int offset)
    {
        if (buffer != this.buffer)
        {
            this.buffer = buffer;
        }
        this.offset = offset;

        return this;
    }

    public MutableDirectBuffer buffer()
    {
        return buffer;
    }

    public int offset()
    {
        return offset;
    }

    public int encodedLength()
    {
        return ENCODED_LENGTH;
    }

    public int sbeSchemaId()
    {
        return SCHEMA_ID;
    }

    public int sbeSchemaVersion()
    {
        return SCHEMA_VERSION;
    }

    public static int orderTypeEncodingOffset()
    {
        return 0;
    }

    public static int orderTypeEncodingLength()
    {
        return 1;
    }

    public BasicOrderDetailEncoder orderType(final OrderType value)
    {
        buffer.putByte(offset + 0, (byte)value.value());
        return this;
    }

    public static int instrumentEncodingOffset()
    {
        return 1;
    }

    public static int instrumentEncodingLength()
    {
        return 18;
    }

    private final InstrumentEncoder instrument = new InstrumentEncoder();

    public InstrumentEncoder instrument()
    {
        instrument.wrap(buffer, offset + 1);
        return instrument;
    }

    public static int priceEncodingOffset()
    {
        return 19;
    }

    public static int priceEncodingLength()
    {
        return 9;
    }

    private final DecEncoder price = new DecEncoder();

    public DecEncoder price()
    {
        price.wrap(buffer, offset + 19);
        return price;
    }

    public static int amountEncodingOffset()
    {
        return 28;
    }

    public static int amountEncodingLength()
    {
        return 9;
    }

    private final DecEncoder amount = new DecEncoder();

    public DecEncoder amount()
    {
        amount.wrap(buffer, offset + 28);
        return amount;
    }

    public static int timeInForceEncodingOffset()
    {
        return 37;
    }

    public static int timeInForceEncodingLength()
    {
        return 1;
    }

    public BasicOrderDetailEncoder timeInForce(final TimeInForce value)
    {
        buffer.putByte(offset + 37, (byte)value.value());
        return this;
    }

    public static int expiryTimeEncodingOffset()
    {
        return 38;
    }

    public static int expiryTimeEncodingLength()
    {
        return 8;
    }

    public static long expiryTimeNullValue()
    {
        return 0xffffffffffffffffL;
    }

    public static long expiryTimeMinValue()
    {
        return 0x0L;
    }

    public static long expiryTimeMaxValue()
    {
        return 0xfffffffffffffffeL;
    }

    public BasicOrderDetailEncoder expiryTime(final long value)
    {
        buffer.putLong(offset + 38, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int orderOptionsEncodingOffset()
    {
        return 46;
    }

    public static int orderOptionsEncodingLength()
    {
        return 1;
    }

    private final OrderOptionsEncoder orderOptions = new OrderOptionsEncoder();

    public OrderOptionsEncoder orderOptions()
    {
        orderOptions.wrap(buffer, offset + 46);
        return orderOptions;
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

        final BasicOrderDetailDecoder decoder = new BasicOrderDetailDecoder();
        decoder.wrap(buffer, offset);

        return decoder.appendTo(builder);
    }
}
