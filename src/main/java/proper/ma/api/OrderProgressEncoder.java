/* Generated SBE (Simple Binary Encoding) message codec. */
package proper.ma.api;

import org.agrona.MutableDirectBuffer;

@SuppressWarnings("all")
public final class OrderProgressEncoder
{
    public static final int SCHEMA_ID = 1;
    public static final int SCHEMA_VERSION = 1;
    public static final int ENCODED_LENGTH = 45;
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private int offset;
    private MutableDirectBuffer buffer;

    public OrderProgressEncoder wrap(final MutableDirectBuffer buffer, final int offset)
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

    public static int filledAmountEncodingOffset()
    {
        return 0;
    }

    public static int filledAmountEncodingLength()
    {
        return 9;
    }

    private final DecEncoder filledAmount = new DecEncoder();

    public DecEncoder filledAmount()
    {
        filledAmount.wrap(buffer, offset + 0);
        return filledAmount;
    }

    public static int paidAmountEncodingOffset()
    {
        return 9;
    }

    public static int paidAmountEncodingLength()
    {
        return 9;
    }

    private final DecEncoder paidAmount = new DecEncoder();

    public DecEncoder paidAmount()
    {
        paidAmount.wrap(buffer, offset + 9);
        return paidAmount;
    }

    public static int commissionEncodingOffset()
    {
        return 18;
    }

    public static int commissionEncodingLength()
    {
        return 9;
    }

    private final DecEncoder commission = new DecEncoder();

    public DecEncoder commission()
    {
        commission.wrap(buffer, offset + 18);
        return commission;
    }

    public static int orderStatusEncodingOffset()
    {
        return 27;
    }

    public static int orderStatusEncodingLength()
    {
        return 2;
    }

    private final OrderStatusEncoder orderStatus = new OrderStatusEncoder();

    public OrderStatusEncoder orderStatus()
    {
        orderStatus.wrap(buffer, offset + 27);
        return orderStatus;
    }

    public static int lastUpdateEncodingOffset()
    {
        return 29;
    }

    public static int lastUpdateEncodingLength()
    {
        return 8;
    }

    public static long lastUpdateNullValue()
    {
        return 0xffffffffffffffffL;
    }

    public static long lastUpdateMinValue()
    {
        return 0x0L;
    }

    public static long lastUpdateMaxValue()
    {
        return 0xfffffffffffffffeL;
    }

    public OrderProgressEncoder lastUpdate(final long value)
    {
        buffer.putLong(offset + 29, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int lastExchangeUpdateEncodingOffset()
    {
        return 37;
    }

    public static int lastExchangeUpdateEncodingLength()
    {
        return 8;
    }

    public static long lastExchangeUpdateNullValue()
    {
        return 0xffffffffffffffffL;
    }

    public static long lastExchangeUpdateMinValue()
    {
        return 0x0L;
    }

    public static long lastExchangeUpdateMaxValue()
    {
        return 0xfffffffffffffffeL;
    }

    public OrderProgressEncoder lastExchangeUpdate(final long value)
    {
        buffer.putLong(offset + 37, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
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

        final OrderProgressDecoder decoder = new OrderProgressDecoder();
        decoder.wrap(buffer, offset);

        return decoder.appendTo(builder);
    }
}
