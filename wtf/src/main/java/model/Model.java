package model;

public class Model
{
    private History history;

    private Response response;

    public History getHistory ()
    {
        return history;
    }

    public void setHistory (History history)
    {
        this.history = history;
    }

    public Response getResponse ()
    {
        return response;
    }

    public void setResponse (Response response)
    {
        this.response = response;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [history = "+history+", response = "+response+"]";
    }
}
