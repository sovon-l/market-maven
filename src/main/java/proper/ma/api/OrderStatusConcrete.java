/* Generated SBE (Simple Binary Encoding) message codec. */
package proper.ma.api;

public enum OrderStatusConcrete
{
    Submitting((short)0),

    Submitted((short)1),

    Cancelling((short)2),

    Finished((short)3),

    /**
     * To be used to represent not present or null.
     */
    NULL_VAL((short)255);

    private final short value;

    OrderStatusConcrete(final short value)
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
    public static OrderStatusConcrete get(final short value)
    {
        switch (value)
        {
            case 0: return Submitting;
            case 1: return Submitted;
            case 2: return Cancelling;
            case 3: return Finished;
            case 255: return NULL_VAL;
        }

        throw new IllegalArgumentException("Unknown value: " + value);
    }
}
