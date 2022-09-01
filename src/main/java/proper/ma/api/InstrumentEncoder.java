/* Generated SBE (Simple Binary Encoding) message codec. */
package proper.ma.api;

import org.agrona.MutableDirectBuffer;

@SuppressWarnings("all")
public final class InstrumentEncoder
{
    public static final int SCHEMA_ID = 1;
    public static final int SCHEMA_VERSION = 1;
    public static final int ENCODED_LENGTH = 18;
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private int offset;
    private MutableDirectBuffer buffer;

    public InstrumentEncoder wrap(final MutableDirectBuffer buffer, final int offset)
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

    public static int exchangeEncodingOffset()
    {
        return 0;
    }

    public static int exchangeEncodingLength()
    {
        return 1;
    }

    public InstrumentEncoder exchange(final Exchange value)
    {
        buffer.putByte(offset + 0, (byte)value.value());
        return this;
    }

    public static int quoteEncodingOffset()
    {
        return 1;
    }

    public static int quoteEncodingLength()
    {
        return 6;
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


    public InstrumentEncoder quote(final int index, final byte value)
    {
        if (index < 0 || index >= 6)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = offset + 1 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String quoteCharacterEncoding()
    {
        return java.nio.charset.StandardCharsets.US_ASCII.name();
    }

    public InstrumentEncoder putQuote(final byte[] src, final int srcOffset)
    {
        final int length = 6;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(offset + 1, src, srcOffset, length);

        return this;
    }

    public InstrumentEncoder quote(final String src)
    {
        final int length = 6;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(offset + 1, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(offset + 1 + start, (byte)0);
        }

        return this;
    }

    public InstrumentEncoder quote(final CharSequence src)
    {
        final int length = 6;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("CharSequence too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(offset + 1, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(offset + 1 + start, (byte)0);
        }

        return this;
    }

    public static int baseEncodingOffset()
    {
        return 7;
    }

    public static int baseEncodingLength()
    {
        return 6;
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


    public InstrumentEncoder base(final int index, final byte value)
    {
        if (index < 0 || index >= 6)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = offset + 7 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String baseCharacterEncoding()
    {
        return java.nio.charset.StandardCharsets.US_ASCII.name();
    }

    public InstrumentEncoder putBase(final byte[] src, final int srcOffset)
    {
        final int length = 6;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(offset + 7, src, srcOffset, length);

        return this;
    }

    public InstrumentEncoder base(final String src)
    {
        final int length = 6;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(offset + 7, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(offset + 7 + start, (byte)0);
        }

        return this;
    }

    public InstrumentEncoder base(final CharSequence src)
    {
        final int length = 6;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("CharSequence too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(offset + 7, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(offset + 7 + start, (byte)0);
        }

        return this;
    }

    public static int instrumentTypeEncodingOffset()
    {
        return 13;
    }

    public static int instrumentTypeEncodingLength()
    {
        return 1;
    }

    public InstrumentEncoder instrumentType(final InstrumentType value)
    {
        buffer.putByte(offset + 13, (byte)value.value());
        return this;
    }

    public static int expiryEncodingOffset()
    {
        return 14;
    }

    public static int expiryEncodingLength()
    {
        return 4;
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

    public InstrumentEncoder expiry(final long value)
    {
        buffer.putInt(offset + 14, (int)value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
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

        final InstrumentDecoder decoder = new InstrumentDecoder();
        decoder.wrap(buffer, offset);

        return decoder.appendTo(builder);
    }
}
