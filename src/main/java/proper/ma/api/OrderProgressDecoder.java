/* Generated SBE (Simple Binary Encoding) message codec. */
package proper.ma.api;

import org.agrona.DirectBuffer;

@SuppressWarnings("all")
public final class OrderProgressDecoder
{
    public static final int SCHEMA_ID = 1;
    public static final int SCHEMA_VERSION = 1;
    public static final int ENCODED_LENGTH = 45;
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private int offset;
    private DirectBuffer buffer;

    public OrderProgressDecoder wrap(final DirectBuffer buffer, final int offset)
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

    public static int filledAmountEncodingOffset()
    {
        return 0;
    }

    public static int filledAmountEncodingLength()
    {
        return 9;
    }

    public static int filledAmountSinceVersion()
    {
        return 0;
    }

    private final DecDecoder filledAmount = new DecDecoder();

    public DecDecoder filledAmount()
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

    public static int paidAmountSinceVersion()
    {
        return 0;
    }

    private final DecDecoder paidAmount = new DecDecoder();

    public DecDecoder paidAmount()
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

    public static int commissionSinceVersion()
    {
        return 0;
    }

    private final DecDecoder commission = new DecDecoder();

    public DecDecoder commission()
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

    public static int orderStatusSinceVersion()
    {
        return 0;
    }

    private final OrderStatusDecoder orderStatus = new OrderStatusDecoder();

    public OrderStatusDecoder orderStatus()
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

    public static int lastUpdateSinceVersion()
    {
        return 0;
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

    public long lastUpdate()
    {
        return buffer.getLong(offset + 29, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int lastExchangeUpdateEncodingOffset()
    {
        return 37;
    }

    public static int lastExchangeUpdateEncodingLength()
    {
        return 8;
    }

    public static int lastExchangeUpdateSinceVersion()
    {
        return 0;
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

    public long lastExchangeUpdate()
    {
        return buffer.getLong(offset + 37, java.nio.ByteOrder.LITTLE_ENDIAN);
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
        builder.append("filledAmount=");
        final DecDecoder filledAmount = filledAmount();
        if (filledAmount != null)
        {
            filledAmount.appendTo(builder);
        }
        else
        {
            builder.append("null");
        }
        builder.append('|');
        builder.append("paidAmount=");
        final DecDecoder paidAmount = paidAmount();
        if (paidAmount != null)
        {
            paidAmount.appendTo(builder);
        }
        else
        {
            builder.append("null");
        }
        builder.append('|');
        builder.append("commission=");
        final DecDecoder commission = commission();
        if (commission != null)
        {
            commission.appendTo(builder);
        }
        else
        {
            builder.append("null");
        }
        builder.append('|');
        builder.append("orderStatus=");
        final OrderStatusDecoder orderStatus = orderStatus();
        if (orderStatus != null)
        {
            orderStatus.appendTo(builder);
        }
        else
        {
            builder.append("null");
        }
        builder.append('|');
        builder.append("lastUpdate=");
        builder.append(lastUpdate());
        builder.append('|');
        builder.append("lastExchangeUpdate=");
        builder.append(lastExchangeUpdate());
        builder.append(')');

        return builder;
    }
}
