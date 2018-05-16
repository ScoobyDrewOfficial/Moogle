public class Yeti
{
    private double height;
    private double width;
    private String name;
    private int age;
    
    public Yeti(double h, double w)
    {
        height = h;
        width = w;
    }
    
    public double getHeight()
    {
        return height;
    }
    
    public double getWidth()
    {
        return width;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getAge()
    {
        return age;
    }
    
    public void setHeight(double h)
    {
        height = h;
    }
    
    public void setWidth(double w)
    {
        width = w;
    }
    
    public void setName(String n)
    {
        name = n;
    }
    
    public void setAge(int a)
    {
        age = a;
    }
    
}