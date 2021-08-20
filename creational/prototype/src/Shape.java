public abstract class Shape implements Cloneable
{
    private String id;
    protected String type;

    public Shape(String type){
        this.type = type;
    }

    abstract void draw();

    public String getType()
    {
        return this.type;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getId()
    {
        return this.id;
    }

    public Object clone()
    {
        Object clone = null;

        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
