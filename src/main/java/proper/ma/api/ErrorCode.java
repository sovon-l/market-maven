/* Generated SBE (Simple Binary Encoding) message codec. */
package proper.ma.api;

public enum ErrorCode
{
    InsufficientFund((short)0),

    FailPostOnly((short)1),

    Timeout((short)2),

    GatewayTooManyRequests((short)3),

    ExchangeTooManyRequests((short)4),

    ExchangeConnectionError((short)5),

    UnexpectedExchangeError((short)6),

    UnexpectedGatewayError((short)7),

    /**
     * To be used to represent not present or null.
     */
    NULL_VAL((short)255);

    private final short value;

    ErrorCode(final short value)
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
    public static ErrorCode get(final short value)
    {
        switch (value)
        {
            case 0: return InsufficientFund;
            case 1: return FailPostOnly;
            case 2: return Timeout;
            case 3: return GatewayTooManyRequests;
            case 4: return ExchangeTooManyRequests;
            case 5: return ExchangeConnectionError;
            case 6: return UnexpectedExchangeError;
            case 7: return UnexpectedGatewayError;
            case 255: return NULL_VAL;
        }

        throw new IllegalArgumentException("Unknown value: " + value);
    }
}
