/* Generated SBE (Simple Binary Encoding) message codec. */
package proper.ma.api;

import org.agrona.DirectBuffer;

@SuppressWarnings("all")
public final class OrderbookFlagsDecoder
{
    public static final int SCHEMA_ID = 1;
    public static final int SCHEMA_VERSION = 1;
    public static final int ENCODED_LENGTH = 1;
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private int offset;
    private DirectBuffer buffer;

    public OrderbookFlagsDecoder wrap(final DirectBuffer buffer, final int offset)
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

    public boolean isEmpty()
    {
        return 0 == buffer.getByte(offset);
    }

    public boolean isSnapshot()
    {
        return 0 != (buffer.getByte(offset) & (1 << 0));
    }

    public static boolean isSnapshot(final byte value)
    {
        return 0 != (value & (1 << 0));
    }

    public boolean l1()
    {
        return 0 != (buffer.getByte(offset) & (1 << 1));
    }

    public static boolean l1(final byte value)
    {
        return 0 != (value & (1 << 1));
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
        builder.append('{');
        boolean atLeastOne = false;
        if (isSnapshot())
        {
            if (atLeastOne)
            {
                builder.append(',');
            }
            builder.append("isSnapshot");
            atLeastOne = true;
        }
        if (l1())
        {
            if (atLeastOne)
            {
                builder.append(',');
            }
            builder.append("l1");
            atLeastOne = true;
        }
        builder.append('}');

        return builder;
    }
}
