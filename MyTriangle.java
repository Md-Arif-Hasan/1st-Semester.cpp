package SystemOfShape;


public class MyTriangle extends Shape {
   
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;
   
    public MyTriangle(int x1,int y1,int x2,int y2,int x3,int y3)
    {
        this.v1 = new MyPoint(x1,y1);
        this.v2 = new MyPoint(x2,y2);
        this.v3 = new MyPoint(x3,y3);
    }
    public MyTriangle(MyPoint v1,MyPoint v2,MyPoint v3)
    {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

   

   
    @Override
    public String toString() {
        return "MyTriangle{" + "v1=" + v1 + ", v2=" + v2 + ", v3=" + v3 + '}';
    }

   
   
    public double getPerimeter()
    {
        double meter1 = Math.sqrt(Math.pow(v1.x-v2.x, 2)+ Math.pow(v1.y-v2.y,2));
    double meter2 = Math.sqrt(Math.pow(v1.x-v3.x, 2)+ Math.pow(v1.y-v3.y,2));
    double meter3 = Math.sqrt(Math.pow(v2.x-v3.x, 2)+ Math.pow(v2.y-v3.y,2));
        return meter1 + meter2 + meter3;
    }
    public String getType()
    {
        double meter1 = Math.sqrt(Math.pow(v1.x-v2.x, 2)+ Math.pow(v1.y-v2.y,2));
    double meter2 = Math.sqrt(Math.pow(v1.x-v3.x, 2)+ Math.pow(v1.y-v3.y,2));
    double meter3 = Math.sqrt(Math.pow(v2.x-v3.x, 2)+ Math.pow(v2.y-v3.y,2));
        if(meter1==meter2 && meter2==meter3)
        {
            return "Equilateral";
        }
        else if(meter1!=meter2 && meter2!=meter3)
        {
            return "Scalene";
        }
        else
        {
            return "Isosceles";
        }
    }
}
