/* Generated SBE (Simple Binary Encoding) message codec. */
package proper.ma.api;

import org.agrona.MutableDirectBuffer;

@SuppressWarnings("all")
public final class OrderDetailEncoder
{
    public static final int SCHEMA_ID = 1;
    public static final int SCHEMA_VERSION = 1;
    public static final int ENCODED_LENGTH = 57;
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private int offset;
    private MutableDirectBuffer buffer;

    public OrderDetailEncoder wrap(final MutableDirectBuffer buffer, final int offset)
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

    public static int simpleOrderDetailEncodingOffset()
    {
        return 0;
    }

    public static int simpleOrderDetailEncodingLength()
    {
        return 57;
    }

    private final SimpleOrderDetailEncoder simpleOrderDetail = new SimpleOrderDetailEncoder();

    public SimpleOrderDetailEncoder simpleOrderDetail()
    {
        simpleOrderDetail.wrap(buffer, offset + 0);
        return simpleOrderDetail;
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

        final OrderDetailDecoder decoder = new OrderDetailDecoder();
        decoder.wrap(buffer, offset);

        return decoder.appendTo(builder);
    }
}
