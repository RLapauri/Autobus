public class Autobus
{
    private String kennzeichen;
    private int sitzplatz;
    private boolean anhanger;   
    
    public String getKennzeichen()
    {
        return kennzeichen;
    }
    
    public int getSitzplatz()
    {
        return sitzplatz;
    }
    
    public boolean getAnhanger()
    {
      return anhanger;
    }
    
    public void setKennzeichen(String neuKennzeichen)
    {
        kennzeichen = neuKennzeichen;
    }
    
    public void setSitzplatz (int neuSitzplatz)
    {
        sitzplatz = neuSitzplatz;
    }
    
    public void setAnhanger (boolean neuAnhanger)
    {
        anhanger = neuAnhanger;
    }
    
    
    
    
}
