public class Autobus
{
    private String kennzeichen;
    private int sitzplatz;
    private boolean anhanger;   
    
    public Autobus ()
    {
        setKennzeichen("W-1234A");
        setSitzplatz(29);
        setAnhanger(false);
    }
    
    public Autobus(String neuKennzeichen, int neuSitzplatz, boolean neuAnhanger)
    {
        setKennzeichen (neuKennzeichen);
        setSitzplatz(neuSitzplatz);
        setAnhanger(neuAnhanger);
    }
    
    
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
