/* Generated SBE (Simple Binary Encoding) message codec. */
package proper.ma.api;

import org.agrona.DirectBuffer;

@SuppressWarnings("all")
public final class SimpleOrderDetailDecoder
{
    public static final int SCHEMA_ID = 1;
    public static final int SCHEMA_VERSION = 1;
    public static final int ENCODED_LENGTH = 57;
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private int offset;
    private DirectBuffer buffer;

    public SimpleOrderDetailDecoder wrap(final DirectBuffer buffer, final int offset)
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

    public static int executeEncodingOffset()
    {
        return 0;
    }

    public static int executeEncodingLength()
    {
        return 47;
    }

    public static int executeSinceVersion()
    {
        return 0;
    }

    private final BasicOrderDetailDecoder execute = new BasicOrderDetailDecoder();

    public BasicOrderDetailDecoder execute()
    {
        execute.wrap(buffer, offset + 0);
        return execute;
    }

    public static int simpleOrderFlagEncodingOffset()
    {
        return 47;
    }

    public static int simpleOrderFlagEncodingLength()
    {
        return 1;
    }

    public static int simpleOrderFlagSinceVersion()
    {
        return 0;
    }

    private final SimpleOrderFlagDecoder simpleOrderFlag = new SimpleOrderFlagDecoder();

    public SimpleOrderFlagDecoder simpleOrderFlag()
    {
        simpleOrderFlag.wrap(buffer, offset + 47);
        return simpleOrderFlag;
    }

    public static int triggerEncodingOffset()
    {
        return 48;
    }

    public static int triggerEncodingLength()
    {
        return 9;
    }

    public static int triggerSinceVersion()
    {
        return 0;
    }

    private final DecDecoder trigger = new DecDecoder();

    public DecDecoder trigger()
    {
        trigger.wrap(buffer, offset + 48);
        return trigger;
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
        builder.append("execute=");
        final BasicOrderDetailDecoder execute = execute();
        if (execute != null)
        {
            execute.appendTo(builder);
        }
        else
        {
            builder.append("null");
        }
        builder.append('|');
        builder.append("simpleOrderFlag=");
        simpleOrderFlag().appendTo(builder);
        builder.append('|');
        builder.append("trigger=");
        final DecDecoder trigger = trigger();
        if (trigger != null)
        {
            trigger.appendTo(builder);
        }
        else
        {
            builder.append("null");
        }
        builder.append(')');

        return builder;
    }
}
