package model;

public class History
{
    private Dailysummary[] dailysummary;

    private Utcdate utcdate;

    private Date date;

    private Observations[] observations;

    public Dailysummary[] getDailysummary ()
    {
        return dailysummary;
    }

    public void setDailysummary (Dailysummary[] dailysummary)
    {
        this.dailysummary = dailysummary;
    }

    public Utcdate getUtcdate ()
    {
        return utcdate;
    }

    public void setUtcdate (Utcdate utcdate)
    {
        this.utcdate = utcdate;
    }

    public Date getDate ()
    {
        return date;
    }

    public void setDate (Date date)
    {
        this.date = date;
    }

    public Observations[] getObservations ()
    {
        return observations;
    }

    public void setObservations (Observations[] observations)
    {
        this.observations = observations;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [dailysummary = "+dailysummary+", utcdate = "+utcdate+", date = "+date+", observations = "+observations+"]";
    }
}
