package model;

public class Features
{
    private String history;

    public String getHistory ()
    {
        return history;
    }

    public void setHistory (String history)
    {
        this.history = history;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [history = "+history+"]";
    }
}
