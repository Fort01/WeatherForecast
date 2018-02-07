package model;

public class Response
{
    private Features features;

    private String termsofService;

    private String version;

    public Features getFeatures ()
    {
        return features;
    }

    public void setFeatures (Features features)
    {
        this.features = features;
    }

    public String getTermsofService ()
    {
        return termsofService;
    }

    public void setTermsofService (String termsofService)
    {
        this.termsofService = termsofService;
    }

    public String getVersion ()
    {
        return version;
    }

    public void setVersion (String version)
    {
        this.version = version;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [features = "+features+", termsofService = "+termsofService+", version = "+version+"]";
    }
}
