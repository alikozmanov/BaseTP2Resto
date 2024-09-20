
import java.util.Scanner;

public class BaseTP2Resto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Initialisation
        // Demande combien de menus l'utilisateur souhaite
        System.out.print("Bonjour, combien de menus souhaitez-vous ? ");
        int numberOfMenus = scan.nextInt();
        
        String[] entrance = new String[numberOfMenus];
        String[] Dishes = new String[numberOfMenus];
        String[] accompaniment = new String[numberOfMenus];
        String[] drinks = new String[numberOfMenus];
        String[] desserts = new String[numberOfMenus];
        
        // Boucle pour chaque menu
        for (int i = 0; i < numberOfMenus; i++) {
            System.out.println("\nCommande numéro " + (i + 1));
            
            // Demande le choix de l'entrée
            System.out.println("Choix entrée : ");
            System.out.println("[1 - SALADE] [2 - SOUPE] [3 - QUICHE] [4 - AUCUNE]");
            System.out.print("Que souhaitez-vous comme entrée ? ");
            int choiceStarter = scan.nextInt();
            
            // Affiche le choix correspondant de l'entrée
            switch (choiceStarter) {
                case 1:
                	entrance[i] = "salade";
                    break;
                case 2:
                	entrance[i] = "soupe";
                    break;
                case 3:
                	entrance[i] = "quiche";
                    break;
                case 4:
                	entrance[i] = "aucune entrée";
                    break;
                default:
                	entrance[i] = "choix invalide";
                    System.out.println("Choix invalide");
            }
            
            // Demande le choix du plat
            System.out.println("\nChoix plats : ");
            System.out.println("[1 - POULET] [2 - BOEUF] [3 - POISSON] [4 - VÉGÉTARIEN] [5 - VEGAN] [6 - AUCUN]");
            System.out.print("Que souhaitez-vous comme plat ? ");
            int choiceMain = scan.nextInt();
            
            // Affiche le choix correspondant du plat
            switch (choiceMain) {
                case 1:
                	Dishes[i] = "poulet";
                    break;
                case 2:
                	Dishes[i] = "boeuf";
                    break;
                case 3:
                	Dishes[i] = "poisson";
                    break;
                case 4:
                	Dishes[i] = "végétarien";
                    break;
                case 5:
                	Dishes[i] = "vegan";
                    break;
                case 6:
                	Dishes[i] = "aucun plat";
                    break;
                default:
                	Dishes[i] = "choix invalide";
                    System.out.println("Choix invalide");
            }
            
            // Demande le choix de l'accompagnement
            System.out.println("\nChoix accompagnements : ");
            System.out.println("[1 - RIZ] [2 - PÂTES] [2 - PÂTES] [3 - FRITES] [4 - LéGUMES] [5 - AUCUN]");
            System.out.print("Que souhaitez-vous comme accompagnement ? ");
            int choiceSide = scan.nextInt();
            
            // Affiche le choix correspondant de l'accompagnement
            switch (choiceSide) {
                case 1:
                	accompaniment[i] = "riz";
                    break;
                case 2:
                	accompaniment[i] = "pâtes";
                    break;
                case 3:
                	accompaniment[i] = "frites";
                    break;
                case 4:
                	accompaniment[i] = "légumes";
                    break;
                case 5:
                	accompaniment[i] = "aucun";
                    break;
                default:
                	accompaniment[i] = "choix invalide";
                    System.out.println("Choix invalide");
            }
            
            // Demande le choix de la boisson
            System.out.println("\nChoix boissons : ");
            System.out.println("[1 - EAU PLATE] [2 - EAU GAZEUZE] [3 - SODA] [4 - VIN] [5 - AUCUNE] ");
            System.out.print("Que souhaitez-vous comme boisson ? ");
            int choiceDrink = scan.nextInt();
            
            // Affiche le choix correspondant de la boisson
            switch (choiceDrink) {
                case 1:
                    drinks[i] = "eau plate";
                    break;
                case 2:
                    drinks[i] = "eau gazeuze";
                    break;
                case 3:
                    drinks[i] = "soda";
                    break;
                case 4:
                    drinks[i] = "vin";
                    break;
                case 5:
                    drinks[i] = "aucune";
                    break;
                default:
                    drinks[i] = "choix invalide";
                    System.out.println("Choix invalide");
            }
            
            // Demande le choix du dessert
            System.out.println("\nChoix desserts : ");
            System.out.println("[1 - TARTE MAISON] [2 - MOUSSE AU CHOCOLAT] [3 - TIRAMISU] [4 - AUCUN]");
            System.out.print("Que souhaitez-vous comme dessert ? ");
            int choiceDessert = scan.nextInt();
            
            // Affiche le choix correspondant du dessert
            switch (choiceDessert) {
                case 1:
                    desserts[i] = "tarte maison";
                    break;
                case 2:
                    desserts[i] = "mousse au chocolat";
                    break;
                case 3:
                    desserts[i] = "tiramisu";
                    break;
                case 4:
                    desserts[i] = "aucun";
                    break;
                default:
                    desserts[i] = "choix invalide";
                    System.out.println("Choix invalide");
            }
        }
        
        // Résumé des choix
        System.out.println("\nRésumé de la commande " + numberOfMenus);
        for (int i = 0; i < numberOfMenus; i++) {
            System.out.println(entrance[i] + ", " + Dishes[i] + ", " + accompaniment[i] + ", " + drinks[i] + ", " + desserts[i]);
            System.out.println();
        }
        
        scan.close();
    }
}
