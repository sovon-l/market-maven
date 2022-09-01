/* Generated SBE (Simple Binary Encoding) message codec. */
package proper.ma.api;

import org.agrona.DirectBuffer;

@SuppressWarnings("all")
public final class OrderStatusDecoder
{
    public static final int SCHEMA_ID = 1;
    public static final int SCHEMA_VERSION = 1;
    public static final int ENCODED_LENGTH = 2;
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private int offset;
    private DirectBuffer buffer;

    public OrderStatusDecoder wrap(final DirectBuffer buffer, final int offset)
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

    public static int orderStatusConcreteEncodingOffset()
    {
        return 0;
    }

    public static int orderStatusConcreteEncodingLength()
    {
        return 1;
    }

    public static int orderStatusConcreteSinceVersion()
    {
        return 0;
    }

    public short orderStatusConcreteRaw()
    {
        return ((short)(buffer.getByte(offset + 0) & 0xFF));
    }

    public OrderStatusConcrete orderStatusConcrete()
    {
        return OrderStatusConcrete.get(((short)(buffer.getByte(offset + 0) & 0xFF)));
    }


    public static int errorCodeEncodingOffset()
    {
        return 1;
    }

    public static int errorCodeEncodingLength()
    {
        return 1;
    }

    public static int errorCodeSinceVersion()
    {
        return 0;
    }

    public short errorCodeRaw()
    {
        return ((short)(buffer.getByte(offset + 1) & 0xFF));
    }

    public ErrorCode errorCode()
    {
        return ErrorCode.get(((short)(buffer.getByte(offset + 1) & 0xFF)));
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
        builder.append("orderStatusConcrete=");
        builder.append(orderStatusConcrete());
        builder.append('|');
        builder.append("errorCode=");
        builder.append(errorCode());
        builder.append(')');

        return builder;
    }
}
