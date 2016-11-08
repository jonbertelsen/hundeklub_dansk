import java.util.Scanner;

public class HundeklubbenMain
{

   public static void main(String[] args)
   {
      Scanner console = new Scanner(System.in);
      Hund hundeObjekt;
      Ejer ejerObjekt;
      
      MedlemsListe medlemmer = new MedlemsListe();
      
      hundeObjekt = new Hund("Fiffi",60,"Pavillion","Hun");
      ejerObjekt = new Ejer("Caja",hundeObjekt); 
      medlemmer.opretMedlem(ejerObjekt);   
      
      hundeObjekt = new Hund("Oswald",12,"Gadekryds","Han");
      ejerObjekt = new Ejer("Jon",hundeObjekt); 
      medlemmer.opretMedlem(ejerObjekt);   
      
      hundeObjekt = new Hund("Topper",9,"Dansk Svensk Gaardhund","Han");
      ejerObjekt = new Ejer("Anders",hundeObjekt); 
      medlemmer.opretMedlem(ejerObjekt);   
      
      hundeObjekt = new Hund("Fluffy",38,"Boxer","Hun");
      ejerObjekt = new Ejer("Bent",hundeObjekt); 
      medlemmer.opretMedlem(ejerObjekt);   

      int choice = 0;
      
      while (choice != 5)
      {
      
         System.out.println("1) Vis ejere");
         System.out.println("3) Vis ejer med yngste hund");
         
         System.out.println("5) Afslut");
         
         choice = console.nextInt();
         
         switch(choice)
         {
            case 1: System.out.println("Liste over medlemmer og deres hunde og racer");
                    medlemmer.visEjerHundRace();
                    break;
            case 3: System.out.print("Ejer med den yngste hund: ");
                    medlemmer.medYngsteHund();
                    break;
            case 5: System.out.println("Punkt5");
                    break;
            default:System.out.println("Forkert nummer!");
                    break;
         }
         
      }   
   }



}