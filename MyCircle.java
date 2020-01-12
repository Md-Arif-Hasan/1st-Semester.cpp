package SystemOfShape;


public class MyCircle{
    private MyPoint center  ;
    private int radius = 1;
    public MyCircle()
    {
       
    }
    public MyCircle(int x,int y,int radius)
    {
        this.center= new MyPoint(x,y);
       
        this.radius = radius;
    }
    public MyCircle(MyPoint center , int radius)
    {
        this.center = center;
        this.radius = radius;
    }
    public int getRadius()
    {
        return this.radius;
    }
    public void setRadius(int radius)
    {
        this.radius = radius;
    }
    public MyPoint getCenter()
    {
        return this.center;
    }
    public void setCenter(MyPoint center)
    {
        this.center = center;
    }
    public int getCenterX()
    {
        return this.center.x;
    }
    public void setCenterX(int x)
    {
        this.center.x = x;
    }
    public int getCenterY()
    {
        return this.center.y;
    }
    public void setCenterY(int y)
    {
        this.center.y = y;
    }
    public int[] getCenterXY()
    {
        int []arr = new int[2];
        arr[0]=center.x;
        arr[1]=center.y;
        return arr;
    }
    public void setCenterXY(int x,int y)
    {
        this.center.x = x;
        this.center.y = y;
    }

    @Override
    public String toString() {
        return "MyCircle{" + "center=" + center + ", radius=" + radius + '}';
    }
    public double getArea()
    {
        return Math.pow(getRadius(), 2);
    }
    public double getCircumference()
    {
        return 2*Math.PI*getRadius();
    }
    public double distance(MyCircle another)
    {
        return Math.sqrt(Math.pow(this.center.x-another.center.x, 2)+ Math.pow(this.center.y-another.center.y,2));
    }
}

