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

    private void intFract() {
        myInteger = (long)(this.mantissa / Math.pow(10, this.exponent));
        myFraction = (long)(this.mantissa % Math.pow(10, this.exponent));
    }


}