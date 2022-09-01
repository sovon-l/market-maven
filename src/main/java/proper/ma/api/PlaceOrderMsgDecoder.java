/* Generated SBE (Simple Binary Encoding) message codec. */
package proper.ma.api;

import org.agrona.DirectBuffer;

@SuppressWarnings("all")
public final class PlaceOrderMsgDecoder
{
    public static final int BLOCK_LENGTH = 78;
    public static final int TEMPLATE_ID = 8;
    public static final int SCHEMA_ID = 1;
    public static final int SCHEMA_VERSION = 1;
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private final PlaceOrderMsgDecoder parentMessage = this;
    private DirectBuffer buffer;
    private int initialOffset;
    private int offset;
    private int limit;
    int actingBlockLength;
    int actingVersion;

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

    public DirectBuffer buffer()
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

    public PlaceOrderMsgDecoder wrap(
        final DirectBuffer buffer,
        final int offset,
        final int actingBlockLength,
        final int actingVersion)
    {
        if (buffer != this.buffer)
        {
            this.buffer = buffer;
        }
        this.initialOffset = offset;
        this.offset = offset;
        this.actingBlockLength = actingBlockLength;
        this.actingVersion = actingVersion;
        limit(offset + actingBlockLength);

        return this;
    }

    public PlaceOrderMsgDecoder wrapAndApplyHeader(
        final DirectBuffer buffer,
        final int offset,
        final MessageHeaderDecoder headerDecoder)
    {
        headerDecoder.wrap(buffer, offset);

        final int templateId = headerDecoder.templateId();
        if (TEMPLATE_ID != templateId)
        {
            throw new IllegalStateException("Invalid TEMPLATE_ID: " + templateId);
        }

        return wrap(
            buffer,
            offset + MessageHeaderDecoder.ENCODED_LENGTH,
            headerDecoder.blockLength(),
            headerDecoder.version());
    }

    public PlaceOrderMsgDecoder sbeRewind()
    {
        return wrap(buffer, initialOffset, actingBlockLength, actingVersion);
    }

    public int sbeDecodedLength()
    {
        final int currentLimit = limit();
        sbeSkip();
        final int decodedLength = encodedLength();
        limit(currentLimit);

        return decodedLength;
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


    public byte upstreamOrderId(final int index)
    {
        if (index < 0 || index >= 8)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = offset + 0 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String upstreamOrderIdCharacterEncoding()
    {
        return java.nio.charset.StandardCharsets.US_ASCII.name();
    }

    public int getUpstreamOrderId(final byte[] dst, final int dstOffset)
    {
        final int length = 8;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
        }

        buffer.getBytes(offset + 0, dst, dstOffset, length);

        return length;
    }

    public String upstreamOrderId()
    {
        final byte[] dst = new byte[8];
        buffer.getBytes(offset + 0, dst, 0, 8);

        int end = 0;
        for (; end < 8 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public int getUpstreamOrderId(final Appendable value)
    {
        for (int i = 0; i < 8; ++i)
        {
            final int c = buffer.getByte(offset + 0 + i) & 0xFF;
            if (c == 0)
            {
                return i;
            }

            try
            {
                value.append(c > 127 ? '?' : (char)c);
            }
            catch (final java.io.IOException ex)
            {
                throw new java.io.UncheckedIOException(ex);
            }
        }

        return 8;
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

    public long timestamp()
    {
        return (buffer.getInt(offset + 8, java.nio.ByteOrder.LITTLE_ENDIAN) & 0xFFFF_FFFFL);
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

    private final AccIdDecoder accId = new AccIdDecoder();

    public AccIdDecoder accId()
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

    private final OrderDetailDecoder orderDetail = new OrderDetailDecoder();

    public OrderDetailDecoder orderDetail()
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

        final PlaceOrderMsgDecoder decoder = new PlaceOrderMsgDecoder();
        decoder.wrap(buffer, initialOffset, actingBlockLength, actingVersion);

        return decoder.appendTo(new StringBuilder()).toString();
    }

    public StringBuilder appendTo(final StringBuilder builder)
    {
        if (null == buffer)
        {
            return builder;
        }

        final int originalLimit = limit();
        limit(initialOffset + actingBlockLength);
        builder.append("[placeOrderMsg](sbeTemplateId=");
        builder.append(TEMPLATE_ID);
        builder.append("|sbeSchemaId=");
        builder.append(SCHEMA_ID);
        builder.append("|sbeSchemaVersion=");
        if (parentMessage.actingVersion != SCHEMA_VERSION)
        {
            builder.append(parentMessage.actingVersion);
            builder.append('/');
        }
        builder.append(SCHEMA_VERSION);
        builder.append("|sbeBlockLength=");
        if (actingBlockLength != BLOCK_LENGTH)
        {
            builder.append(actingBlockLength);
            builder.append('/');
        }
        builder.append(BLOCK_LENGTH);
        builder.append("):");
        builder.append("upstreamOrderId=");
        for (int i = 0; i < upstreamOrderIdLength() && upstreamOrderId(i) > 0; i++)
        {
            builder.append((char)upstreamOrderId(i));
        }
        builder.append('|');
        builder.append("timestamp=");
        builder.append(timestamp());
        builder.append('|');
        builder.append("accId=");
        final AccIdDecoder accId = accId();
        if (accId != null)
        {
            accId.appendTo(builder);
        }
        else
        {
            builder.append("null");
        }
        builder.append('|');
        builder.append("orderDetail=");
        final OrderDetailDecoder orderDetail = orderDetail();
        if (orderDetail != null)
        {
            orderDetail.appendTo(builder);
        }
        else
        {
            builder.append("null");
        }

        limit(originalLimit);

        return builder;
    }
    
    public PlaceOrderMsgDecoder sbeSkip()
    {
        sbeRewind();

        return this;
    }
}
