package model;

public class Utcdate
{
    private String min;

    private String mday;

    private String mon;

    private String year;

    private String hour;

    private String pretty;

    private String tzname;

    public String getMin ()
    {
        return min;
    }

    public void setMin (String min)
    {
        this.min = min;
    }

    public String getMday ()
    {
        return mday;
    }

    public void setMday (String mday)
    {
        this.mday = mday;
    }

    public String getMon ()
    {
        return mon;
    }

    public void setMon (String mon)
    {
        this.mon = mon;
    }

    public String getYear ()
    {
        return year;
    }

    public void setYear (String year)
    {
        this.year = year;
    }

    public String getHour ()
    {
        return hour;
    }

    public void setHour (String hour)
    {
        this.hour = hour;
    }

    public String getPretty ()
    {
        return pretty;
    }

    public void setPretty (String pretty)
    {
        this.pretty = pretty;
    }

    public String getTzname ()
    {
        return tzname;
    }

    public void setTzname (String tzname)
    {
        this.tzname = tzname;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [min = "+min+", mday = "+mday+", mon = "+mon+", year = "+year+", hour = "+hour+", pretty = "+pretty+", tzname = "+tzname+"]";
    }
}
