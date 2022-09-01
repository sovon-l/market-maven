/* Generated SBE (Simple Binary Encoding) message codec. */
package proper.ma.api;

import org.agrona.DirectBuffer;

@SuppressWarnings("all")
public final class BasicOrderDetailDecoder
{
    public static final int SCHEMA_ID = 1;
    public static final int SCHEMA_VERSION = 1;
    public static final int ENCODED_LENGTH = 47;
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private int offset;
    private DirectBuffer buffer;

    public BasicOrderDetailDecoder wrap(final DirectBuffer buffer, final int offset)
    {
        if (buffer != this.buffer)
        {
            this.buffer = buffer;
        }
        this.offset = offset;

        return this;
    }

    public DirectBuffer buffer()
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

    public static int orderTypeSinceVersion()
    {
        return 0;
    }

    public short orderTypeRaw()
    {
        return ((short)(buffer.getByte(offset + 0) & 0xFF));
    }

    public OrderType orderType()
    {
        return OrderType.get(((short)(buffer.getByte(offset + 0) & 0xFF)));
    }


    public static int instrumentEncodingOffset()
    {
        return 1;
    }

    public static int instrumentEncodingLength()
    {
        return 18;
    }

    public static int instrumentSinceVersion()
    {
        return 0;
    }

    private final InstrumentDecoder instrument = new InstrumentDecoder();

    public InstrumentDecoder instrument()
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

    public static int priceSinceVersion()
    {
        return 0;
    }

    private final DecDecoder price = new DecDecoder();

    public DecDecoder price()
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

    public static int amountSinceVersion()
    {
        return 0;
    }

    private final DecDecoder amount = new DecDecoder();

    public DecDecoder amount()
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

    public static int timeInForceSinceVersion()
    {
        return 0;
    }

    public short timeInForceRaw()
    {
        return ((short)(buffer.getByte(offset + 37) & 0xFF));
    }

    public TimeInForce timeInForce()
    {
        return TimeInForce.get(((short)(buffer.getByte(offset + 37) & 0xFF)));
    }


    public static int expiryTimeEncodingOffset()
    {
        return 38;
    }

    public static int expiryTimeEncodingLength()
    {
        return 8;
    }

    public static int expiryTimeSinceVersion()
    {
        return 0;
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

    public long expiryTime()
    {
        return buffer.getLong(offset + 38, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int orderOptionsEncodingOffset()
    {
        return 46;
    }

    public static int orderOptionsEncodingLength()
    {
        return 1;
    }

    public static int orderOptionsSinceVersion()
    {
        return 0;
    }

    private final OrderOptionsDecoder orderOptions = new OrderOptionsDecoder();

    public OrderOptionsDecoder orderOptions()
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

        builder.append('(');
        builder.append("orderType=");
        builder.append(orderType());
        builder.append('|');
        builder.append("instrument=");
        final InstrumentDecoder instrument = instrument();
        if (instrument != null)
        {
            instrument.appendTo(builder);
        }
        else
        {
            builder.append("null");
        }
        builder.append('|');
        builder.append("price=");
        final DecDecoder price = price();
        if (price != null)
        {
            price.appendTo(builder);
        }
        else
        {
            builder.append("null");
        }
        builder.append('|');
        builder.append("amount=");
        final DecDecoder amount = amount();
        if (amount != null)
        {
            amount.appendTo(builder);
        }
        else
        {
            builder.append("null");
        }
        builder.append('|');
        builder.append("timeInForce=");
        builder.append(timeInForce());
        builder.append('|');
        builder.append("expiryTime=");
        builder.append(expiryTime());
        builder.append('|');
        builder.append("orderOptions=");
        orderOptions().appendTo(builder);
        builder.append(')');

        return builder;
    }
}
