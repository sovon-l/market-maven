/* Generated SBE (Simple Binary Encoding) message codec. */
package proper.ma.api;

import org.agrona.MutableDirectBuffer;

@SuppressWarnings("all")
public final class PlaceOrderMsgEncoder
{
    public static final int BLOCK_LENGTH = 78;
    public static final int TEMPLATE_ID = 8;
    public static final int SCHEMA_ID = 1;
    public static final int SCHEMA_VERSION = 1;
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private final PlaceOrderMsgEncoder parentMessage = this;
    private MutableDirectBuffer buffer;
    private int initialOffset;
    private int offset;
    private int limit;

    public int sbeBlockLength()
    {
        return BLOCK_LENGTH;
    }

    public int sbeTemplateId()
    {
        return TEMPLATE_ID;
    }

    public int sbeSchemaId()
    {
        return SCHEMA_ID;
    }

    public int sbeSchemaVersion()
    {
        return SCHEMA_VERSION;
    }

    public String sbeSemanticType()
    {
        return "";
    }

    public MutableDirectBuffer buffer()
    {
        return buffer;
    }

    public int initialOffset()
    {
        return initialOffset;
    }

    public int offset()
    {
        return offset;
    }

    public PlaceOrderMsgEncoder wrap(final MutableDirectBuffer buffer, final int offset)
    {
        if (buffer != this.buffer)
        {
            this.buffer = buffer;
        }
        this.initialOffset = offset;
        this.offset = offset;
        limit(offset + BLOCK_LENGTH);

        return this;
    }

    public PlaceOrderMsgEncoder wrapAndApplyHeader(
        final MutableDirectBuffer buffer, final int offset, final MessageHeaderEncoder headerEncoder)
    {
        headerEncoder
            .wrap(buffer, offset)
            .blockLength(BLOCK_LENGTH)
            .templateId(TEMPLATE_ID)
            .schemaId(SCHEMA_ID)
            .version(SCHEMA_VERSION);

        return wrap(buffer, offset + MessageHeaderEncoder.ENCODED_LENGTH);
    }

    public int encodedLength()
    {
        return limit - offset;
    }

    public int limit()
    {
        return limit;
    }

    public void limit(final int limit)
    {
        this.limit = limit;
    }

    public static int upstreamOrderIdId()
    {
        return 1;
    }

    public static int upstreamOrderIdSinceVersion()
    {
        return 0;
    }

    public static int upstreamOrderIdEncodingOffset()
    {
        return 0;
    }

    public static int upstreamOrderIdEncodingLength()
    {
        return 8;
    }

    public static String upstreamOrderIdMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }

        return "";
    }

    public static byte upstreamOrderIdNullValue()
    {
        return (byte)0;
    }

    public static byte upstreamOrderIdMinValue()
    {
        return (byte)32;
    }

    public static byte upstreamOrderIdMaxValue()
    {
        return (byte)126;
    }

    public static int upstreamOrderIdLength()
    {
        return 8;
    }


    public PlaceOrderMsgEncoder upstreamOrderId(final int index, final byte value)
    {
        if (index < 0 || index >= 8)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = offset + 0 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String upstreamOrderIdCharacterEncoding()
    {
        return java.nio.charset.StandardCharsets.US_ASCII.name();
    }

    public PlaceOrderMsgEncoder putUpstreamOrderId(final byte[] src, final int srcOffset)
    {
        final int length = 8;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(offset + 0, src, srcOffset, length);

        return this;
    }

    public PlaceOrderMsgEncoder upstreamOrderId(final String src)
    {
        final int length = 8;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(offset + 0, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(offset + 0 + start, (byte)0);
        }

        return this;
    }

    public PlaceOrderMsgEncoder upstreamOrderId(final CharSequence src)
    {
        final int length = 8;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("CharSequence too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(offset + 0, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(offset + 0 + start, (byte)0);
        }

        return this;
    }

    public static int timestampId()
    {
        return 2;
    }

    public static int timestampSinceVersion()
    {
        return 0;
    }

    public static int timestampEncodingOffset()
    {
        return 8;
    }

    public static int timestampEncodingLength()
    {
        return 4;
    }

    public static String timestampMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }

        return "";
    }

    public static long timestampNullValue()
    {
        return 4294967295L;
    }

    public static long timestampMinValue()
    {
        return 0L;
    }

    public static long timestampMaxValue()
    {
        return 4294967294L;
    }

    public PlaceOrderMsgEncoder timestamp(final long value)
    {
        buffer.putInt(offset + 8, (int)value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int accIdId()
    {
        return 3;
    }

    public static int accIdSinceVersion()
    {
        return 0;
    }

    public static int accIdEncodingOffset()
    {
        return 12;
    }

    public static int accIdEncodingLength()
    {
        return 9;
    }

    public static String accIdMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }

        return "";
    }

    private final AccIdEncoder accId = new AccIdEncoder();

    public AccIdEncoder accId()
    {
        accId.wrap(buffer, offset + 12);
        return accId;
    }

    public static int orderDetailId()
    {
        return 4;
    }

    public static int orderDetailSinceVersion()
    {
        return 0;
    }

    public static int orderDetailEncodingOffset()
    {
        return 21;
    }

    public static int orderDetailEncodingLength()
    {
        return 57;
    }

    public static String orderDetailMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }

        return "";
    }

    private final OrderDetailEncoder orderDetail = new OrderDetailEncoder();

    public OrderDetailEncoder orderDetail()
    {
        orderDetail.wrap(buffer, offset + 21);
        return orderDetail;
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

        final PlaceOrderMsgDecoder decoder = new PlaceOrderMsgDecoder();
        decoder.wrap(buffer, initialOffset, BLOCK_LENGTH, SCHEMA_VERSION);

        return decoder.appendTo(builder);
    }
}
