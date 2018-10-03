public class Fraction {

    private int numerator, denominator;

    public int getNumerator()
    {
        return numerator;
    }

    public int getDenominator()
    {
        return  denominator;
    }

    public void setNumerator(int numerator)
    {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator)
    {
        this.denominator = denominator;
    }

    public String toString()
    {
        return numerator + "/" + denominator;
    }

    public Fraction()
    {
        this(0,1);
    }

    public Fraction(int numerator, int denominator)
    {
        setNumerator(numerator);
        setDenominator(denominator);
    }

    public static String addFraction(Fraction f1, Fraction f2)
    {
        int lcd = findLCD(f1.getDenominator(), f2.getDenominator());
        int initialN1 = f1.getNumerator();
        int initialD1 = f1.getDenominator();
        int initialN2 = f2.getNumerator();
        int initialD2 = f2.getDenominator();

        f1.setNumerator(multiplyNumerator(f1.getNumerator(), lcd, f1.getDenominator()));
        f2.setNumerator(multiplyNumerator(f2.getNumerator(), lcd, f2.getDenominator()));

        int n3 = (f1.getNumerator()+f2.getNumerator());

        f1.setNumerator(initialN1);
        f1.setDenominator(initialD1);
        f2.setNumerator(initialN2);
        f2.setDenominator(initialD2);

        return n3 + "/" + lcd;
    }

    public static String subFraction(Fraction f1, Fraction f2)
    {
        int lcd = findLCD(f1.getDenominator(), f2.getDenominator());
        int initialN1 = f1.getNumerator();
        int initialD1 = f1.getDenominator();
        int initialN2 = f2.getNumerator();
        int initialD2 = f2.getDenominator();

        f1.setNumerator(multiplyNumerator(f1.getNumerator(), lcd, f1.getDenominator()));
        f2.setNumerator(multiplyNumerator(f2.getNumerator(), lcd, f2.getDenominator()));

        int n3 = (f1.getNumerator()-f2.getNumerator());

        f1.setNumerator(initialN1);
        f1.setDenominator(initialD1);
        f2.setNumerator(initialN2);
        f2.setDenominator(initialD2);

        return n3 + "/" + lcd;
    }

    public static String multiplyFraction(Fraction f1, Fraction f2)
    {
        int n3 = f1.getNumerator() * f2.getNumerator();
        int d3 = f1.getDenominator() * f2.getDenominator();

        return n3 + "/" + d3;
    }

    public static String divideFraction(Fraction f1, Fraction f2)
    {
        int n3 = f1.getNumerator() * f2.getDenominator();
        int d3 = f1.getDenominator() * f2.getNumerator();

        return n3 + "/" + d3;
    }

    public static int findLCD(int d1, int d2)
    {
        for(int i = 1; i <= d2; i++)
        {
            if(i*d1 % d2 == 0)
            {
                return Math.abs(i*d1);
            }
        }

        return -1;
    }

    public static int multiplyNumerator(int n, int lcd, int d)
    {
        int multiplyN = lcd/d;

        n *= multiplyN;

        return n;
    }

}
