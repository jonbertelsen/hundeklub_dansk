public class MedlemsListe
{
   // Attributter

   private static final int MAX_ANTAL_MEDLEMMER = 100;
   
   Ejer[] medlemsListe = new Ejer[MAX_ANTAL_MEDLEMMER];
   
   int antalEjere = 0;

   // Metoder
   
   
   public void opretMedlem(Ejer hundeEjer)
   {   
      medlemsListe[antalEjere] = hundeEjer;
      antalEjere++;
   }
   
   public void visEjerHundRace()
   {
      // Løb igennem medlemslisten med ejere:
      
      Ejer ejer;
      
      for (int i = 0; i < antalEjere; i++)
      {
         ejer = medlemsListe[i];
         
         System.out.print(ejer.hentNavn() + " ejer hunden ");
         System.out.print(ejer.harHund().hentNavn() + ", som er af racen ");
         System.out.println(ejer.harHund().hentRace());   
      }
   }
   
   public void medYngsteHund()
   {
   
      int yngsteHund = 1000;
      int ejerMedYngsteHundIndex = 0;
      
      // Løb igennem medlemslisten med ejere:
      
      for (int i = 0; i < antalEjere; i++)
      {
      
         if (medlemsListe[i].harHund().hentAlder() < yngsteHund)
         {
            yngsteHund = medlemsListe[i].harHund().hentAlder();
            ejerMedYngsteHundIndex = i;
         }
      }
      
      // Vis resultat
      
      System.out.print(medlemsListe[ejerMedYngsteHundIndex].hentNavn() + ", der ejer hunden ");
      System.out.print(medlemsListe[ejerMedYngsteHundIndex].harHund().hentNavn() + ", som er ");
      System.out.println(yngsteHund + " mdr gammel");
      
      
   }

   
   
   // Sorteringsmetoder

}