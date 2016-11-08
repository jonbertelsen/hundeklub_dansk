public class Hund
{

   // Attributter

   private String navn;
   private int alder;  // I måneder
   private String race;
   private String koen;

   
   // Metoder

   public Hund(String navn, int alder, String race, String koen)
   {
      this.navn = navn;
      this.alder = alder;
      this.race = race;
      this.koen = koen;
   }

   public String hentNavn()
   {
      return navn;
   }
   
   public int hentAlder()
   {
      return alder;
   }
   
   public String hentRace()
   {
      return race;
   }
   
   public String hentKoen()
   {
      return koen;
   }

}