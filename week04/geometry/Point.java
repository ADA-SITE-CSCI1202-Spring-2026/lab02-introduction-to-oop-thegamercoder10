package week04.geometry;

public class Point
{
    private float x, y;

    public Point(){this.x=0; this.y=0;}
    public Point(float x, float y){this.x=x; this.y=y;}
    public Point(Point p){this.x=p.x; this.y=p.y;}

    public float getX(){return this.x;}
    public float getY(){return this.y;}

    public void setX(float x){this.x = x;}
    public void setY(float y){this.y = y;}

    public void translate(float dX, float dY)
    {
        this.x += dX;
        this.y += dY;
    }

    public float distance(Point p)
    {
        double sq = (this.x-p.x)*(this.x-p.x) + (this.y-p.y) * (this.y-p.y);
        return (float)Math.sqrt(sq);
    }

    public boolean equals(Point p)
    {
        return this.x==p.x && this.y==p.y;
    }
}