/* Generated SBE (Simple Binary Encoding) message codec. */
package proper.ma.api;

import org.agrona.DirectBuffer;

@SuppressWarnings("all")
public final class AccIdDecoder
{
    public static final int SCHEMA_ID = 1;
    public static final int SCHEMA_VERSION = 1;
    public static final int ENCODED_LENGTH = 9;
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private int offset;
    private DirectBuffer buffer;

    public AccIdDecoder wrap(final DirectBuffer buffer, final int offset)
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


    public static int contextEncodingOffset()
    {
        return 1;
    }

    public static int contextEncodingLength()
    {
        return 8;
    }

    public static int contextSinceVersion()
    {
        return 0;
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


    public byte context(final int index)
    {
        if (index < 0 || index >= 8)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = offset + 1 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String contextCharacterEncoding()
    {
        return java.nio.charset.StandardCharsets.US_ASCII.name();
    }

    public int getContext(final byte[] dst, final int dstOffset)
    {
        final int length = 8;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
        }

        buffer.getBytes(offset + 1, dst, dstOffset, length);

        return length;
    }

    public String context()
    {
        final byte[] dst = new byte[8];
        buffer.getBytes(offset + 1, dst, 0, 8);

        int end = 0;
        for (; end < 8 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public int getContext(final Appendable value)
    {
        for (int i = 0; i < 8; ++i)
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

        return 8;
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
        builder.append("context=");
        for (int i = 0; i < contextLength() && context(i) > 0; i++)
        {
            builder.append((char)context(i));
        }
        builder.append(')');

        return builder;
    }
}
