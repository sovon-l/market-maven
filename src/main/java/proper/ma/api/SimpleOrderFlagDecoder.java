/* Generated SBE (Simple Binary Encoding) message codec. */
package proper.ma.api;

import org.agrona.DirectBuffer;

@SuppressWarnings("all")
public final class SimpleOrderFlagDecoder
{
    public static final int SCHEMA_ID = 1;
    public static final int SCHEMA_VERSION = 1;
    public static final int ENCODED_LENGTH = 1;
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private int offset;
    private DirectBuffer buffer;

    public SimpleOrderFlagDecoder wrap(final DirectBuffer buffer, final int offset)
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

    public boolean isTrigger()
    {
        return 0 != (buffer.getByte(offset) & (1 << 0));
    }

    public static boolean isTrigger(final byte value)
    {
        return 0 != (value & (1 << 0));
    }

    public boolean isStopLoss()
    {
        return 0 != (buffer.getByte(offset) & (1 << 1));
    }

    public static boolean isStopLoss(final byte value)
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
        if (isTrigger())
        {
            if (atLeastOne)
            {
                builder.append(',');
            }
            builder.append("isTrigger");
            atLeastOne = true;
        }
        if (isStopLoss())
        {
            if (atLeastOne)
            {
                builder.append(',');
            }
            builder.append("isStopLoss");
            atLeastOne = true;
        }
        builder.append('}');

        return builder;
    }
}
