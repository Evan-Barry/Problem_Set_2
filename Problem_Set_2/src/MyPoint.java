public class MyPoint {

    private int xVal;
    private int yVal;

    public int getxVal()
    {
        return xVal;
    }

    public int getyVal()
    {
        return yVal;
    }

    public void setxVal(int xVal)
    {
        this.xVal = xVal;
    }

    public void setyVal(int yVal)
    {
        this.yVal = yVal;
    }

    public String toString()
    {
        return "(" + getxVal() + "," + getyVal() + ")";
    }

    public MyPoint()
    {
        this.xVal = 0;
        this.yVal = 0;
    }

    public MyPoint(int xVal, int yVal)
    {
        setxVal(xVal);
        setyVal(yVal);
    }

    public void moveHorizontally(int xMove)
    {
        //System.out.println("Move Horizontally");

        int x = getxVal();

        setxVal(x+xMove);
    }

    public void moveVertically(int yMove)
    {
        //System.out.println("Move Vertically");
        int y = getyVal();

        setyVal(y+yMove);
    }

    public void translate(int xTrans, int yTrans)
    {
        //System.out.println("Translate");
        int x = getxVal();

        setxVal(x+xTrans);

        int y = getyVal();

        setyVal(y+yTrans);
    }

    public void distanceFromOrigin()
    {
        //System.out.println("Distance From Origin");
        //Formula == sqrt of (x2 - x1)squared + (y2 - y1) squared
        int x1 = getxVal(), y1 = getyVal(), x2 = 0, y2 = 0;

        double distance = Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));

        System.out.println("Distance from origin : " + distance);
    }

}
