package Withfloat;

public class Float
{
    private long mantissa;
    private long exponent;
    private long myInteger;
    private long myFraction;

    public Float(long mantissa, long exponent) {
        this.mantissa = mantissa;
        this.exponent = exponent;
        intFract();
    }

    
}