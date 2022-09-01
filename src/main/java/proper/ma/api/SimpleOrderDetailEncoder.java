/* Generated SBE (Simple Binary Encoding) message codec. */
package proper.ma.api;

import org.agrona.MutableDirectBuffer;

@SuppressWarnings("all")
public final class SimpleOrderDetailEncoder
{
    public static final int SCHEMA_ID = 1;
    public static final int SCHEMA_VERSION = 1;
    public static final int ENCODED_LENGTH = 57;
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private int offset;
    private MutableDirectBuffer buffer;

    public SimpleOrderDetailEncoder wrap(final MutableDirectBuffer buffer, final int offset)
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

    public static int executeEncodingOffset()
    {
        return 0;
    }

    public static int executeEncodingLength()
    {
        return 47;
    }

    private final BasicOrderDetailEncoder execute = new BasicOrderDetailEncoder();

    public BasicOrderDetailEncoder execute()
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

    private final SimpleOrderFlagEncoder simpleOrderFlag = new SimpleOrderFlagEncoder();

    public SimpleOrderFlagEncoder simpleOrderFlag()
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

    private final DecEncoder trigger = new DecEncoder();

    public DecEncoder trigger()
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

        final SimpleOrderDetailDecoder decoder = new SimpleOrderDetailDecoder();
        decoder.wrap(buffer, offset);

        return decoder.appendTo(builder);
    }
}
