/* Generated SBE (Simple Binary Encoding) message codec. */
package proper.ma.api;

import org.agrona.DirectBuffer;

@SuppressWarnings("all")
public final class InstrumentDecoder
{
    public static final int SCHEMA_ID = 1;
    public static final int SCHEMA_VERSION = 1;
    public static final int ENCODED_LENGTH = 18;
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private int offset;
    private DirectBuffer buffer;

    public InstrumentDecoder wrap(final DirectBuffer buffer, final int offset)
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

    public static int exchangeEncodingOffset()
    {
        return 0;
    }

    public static int exchangeEncodingLength()
    {
        return 1;
    }

    public static int exchangeSinceVersion()
    {
        return 0;
    }

    public short exchangeRaw()
    {
        return ((short)(buffer.getByte(offset + 0) & 0xFF));
    }

    public Exchange exchange()
    {
        return Exchange.get(((short)(buffer.getByte(offset + 0) & 0xFF)));
    }


    public static int quoteEncodingOffset()
    {
        return 1;
    }

    public static int quoteEncodingLength()
    {
        return 6;
    }

    public static int quoteSinceVersion()
    {
        return 0;
    }

    public static byte quoteNullValue()
    {
        return (byte)0;
    }

    public static byte quoteMinValue()
    {
        return (byte)32;
    }

    public static byte quoteMaxValue()
    {
        return (byte)126;
    }

    public static int quoteLength()
    {
        return 6;
    }


    public byte quote(final int index)
    {
        if (index < 0 || index >= 6)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = offset + 1 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String quoteCharacterEncoding()
    {
        return java.nio.charset.StandardCharsets.US_ASCII.name();
    }

    public int getQuote(final byte[] dst, final int dstOffset)
    {
        final int length = 6;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
        }

        buffer.getBytes(offset + 1, dst, dstOffset, length);

        return length;
    }

    public String quote()
    {
        final byte[] dst = new byte[6];
        buffer.getBytes(offset + 1, dst, 0, 6);

        int end = 0;
        for (; end < 6 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public int getQuote(final Appendable value)
    {
        for (int i = 0; i < 6; ++i)
        {
            final int c = buffer.getByte(offset + 1 + i) & 0xFF;
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

        return 6;
    }


    public static int baseEncodingOffset()
    {
        return 7;
    }

    public static int baseEncodingLength()
    {
        return 6;
    }

    public static int baseSinceVersion()
    {
        return 0;
    }

    public static byte baseNullValue()
    {
        return (byte)0;
    }

    public static byte baseMinValue()
    {
        return (byte)32;
    }

    public static byte baseMaxValue()
    {
        return (byte)126;
    }

    public static int baseLength()
    {
        return 6;
    }


    public byte base(final int index)
    {
        if (index < 0 || index >= 6)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = offset + 7 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String baseCharacterEncoding()
    {
        return java.nio.charset.StandardCharsets.US_ASCII.name();
    }

    public int getBase(final byte[] dst, final int dstOffset)
    {
        final int length = 6;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
        }

        buffer.getBytes(offset + 7, dst, dstOffset, length);

        return length;
    }

    public String base()
    {
        final byte[] dst = new byte[6];
        buffer.getBytes(offset + 7, dst, 0, 6);

        int end = 0;
        for (; end < 6 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public int getBase(final Appendable value)
    {
        for (int i = 0; i < 6; ++i)
        {
            final int c = buffer.getByte(offset + 7 + i) & 0xFF;
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

        return 6;
    }


    public static int instrumentTypeEncodingOffset()
    {
        return 13;
    }

    public static int instrumentTypeEncodingLength()
    {
        return 1;
    }

    public static int instrumentTypeSinceVersion()
    {
        return 0;
    }

    public short instrumentTypeRaw()
    {
        return ((short)(buffer.getByte(offset + 13) & 0xFF));
    }

    public InstrumentType instrumentType()
    {
        return InstrumentType.get(((short)(buffer.getByte(offset + 13) & 0xFF)));
    }


    public static int expiryEncodingOffset()
    {
        return 14;
    }

    public static int expiryEncodingLength()
    {
        return 4;
    }

    public static int expirySinceVersion()
    {
        return 0;
    }

    public static long expiryNullValue()
    {
        return 4294967295L;
    }

    public static long expiryMinValue()
    {
        return 0L;
    }

    public static long expiryMaxValue()
    {
        return 4294967294L;
    }

    public long expiry()
    {
        return (buffer.getInt(offset + 14, java.nio.ByteOrder.LITTLE_ENDIAN) & 0xFFFF_FFFFL);
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
        builder.append("exchange=");
        builder.append(exchange());
        builder.append('|');
        builder.append("quote=");
        for (int i = 0; i < quoteLength() && quote(i) > 0; i++)
        {
            builder.append((char)quote(i));
        }
        builder.append('|');
        builder.append("base=");
        for (int i = 0; i < baseLength() && base(i) > 0; i++)
        {
            builder.append((char)base(i));
        }
        builder.append('|');
        builder.append("instrumentType=");
        builder.append(instrumentType());
        builder.append('|');
        builder.append("expiry=");
        builder.append(expiry());
        builder.append(')');

        return builder;
    }
}
