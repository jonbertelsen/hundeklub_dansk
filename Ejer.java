public class Ejer
{
   // Attributter
   
   private String navn;
   private Hund hund;
   
   // Metoder
   
   public Ejer(String navn, Hund hundeobjekt)
   {
      this.navn = navn;
      this.hund = hundeobjekt;
   }
   
   public String hentNavn()
   {
      return navn;
   }
   
   public Hund harHund()
   {
      return hund;
   }
   

}