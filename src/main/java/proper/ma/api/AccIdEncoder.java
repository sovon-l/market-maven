/* Generated SBE (Simple Binary Encoding) message codec. */
package proper.ma.api;

import org.agrona.MutableDirectBuffer;

@SuppressWarnings("all")
public final class AccIdEncoder
{
    public static final int SCHEMA_ID = 1;
    public static final int SCHEMA_VERSION = 1;
    public static final int ENCODED_LENGTH = 9;
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private int offset;
    private MutableDirectBuffer buffer;

    public AccIdEncoder wrap(final MutableDirectBuffer buffer, final int offset)
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

    public AccIdEncoder exchange(final Exchange value)
    {
        buffer.putByte(offset + 0, (byte)value.value());
        return this;
    }

    public static int contextEncodingOffset()
    {
        return 1;
    }

    public static int contextEncodingLength()
    {
        return 8;
    }

    public static byte contextNullValue()
    {
        return (byte)0;
    }

    public static byte contextMinValue()
    {
        return (byte)32;
    }

    public static byte contextMaxValue()
    {
        return (byte)126;
    }

    public static int contextLength()
    {
        return 8;
    }


    public AccIdEncoder context(final int index, final byte value)
    {
        if (index < 0 || index >= 8)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = offset + 1 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String contextCharacterEncoding()
    {
        return java.nio.charset.StandardCharsets.US_ASCII.name();
    }

    public AccIdEncoder putContext(final byte[] src, final int srcOffset)
    {
        final int length = 8;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(offset + 1, src, srcOffset, length);

        return this;
    }

    public AccIdEncoder context(final String src)
    {
        final int length = 8;
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

    public AccIdEncoder context(final CharSequence src)
    {
        final int length = 8;
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

        final AccIdDecoder decoder = new AccIdDecoder();
        decoder.wrap(buffer, offset);

        return decoder.appendTo(builder);
    }
}
