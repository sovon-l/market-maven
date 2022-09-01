/* Generated SBE (Simple Binary Encoding) message codec. */
package proper.ma.api;


/**
 * instrument type
 */
public enum InstrumentType
{
    spot((short)0),

    future((short)1),

    inverseFuture((short)2),

    /**
     * To be used to represent not present or null.
     */
    NULL_VAL((short)255);

    private final short value;

    InstrumentType(final short value)
    {
        this.value = value;
    }

    /**
     * The raw encoded value in the Java type representation.
     *
     * @return the raw value encoded.
     */
    public short value()
    {
        return value;
    }

    /**
     * Lookup the enum value representing the value.
     *
     * @param value encoded to be looked up.
     * @return the enum value representing the value.
     */
    public static InstrumentType get(final short value)
    {
        switch (value)
        {
            case 0: return spot;
            case 1: return future;
            case 2: return inverseFuture;
            case 255: return NULL_VAL;
        }

        throw new IllegalArgumentException("Unknown value: " + value);
    }
}
