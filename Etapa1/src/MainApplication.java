// platforma food delivery(localuri, comenzi, soferi, useri)
/*
Address
User
Client
Driver
Restaurant
Menu
Food
Order
Delivery
Review
*/

/*
Register Client
Register Dirver
Login
Afisare informatii client
Adaugare Adresa Noua
Creare Restaurant
Afisare Restaurante
Afisare Meniu Restaurant
Afisare Reviews Restaurant
Creare Review Restaurant

//TODO:
Creare Review Driver
Modificare Meniu Restaurant
Comenzi (Order / Delivery / Driver) (Creare comanda, Vizualizare comenzi pentru user)
Stergere review
 */
package src;
import src.service.MainServices;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class MainApplication {

    static List<String> interogari = Arrays.asList("create_client", "create_driver", "login", "show_logged_in_user", "add_address",
            "create_restaurant", "create_review_restaurant", "show_restaurants", "show_menu_restaurant",
            "show_reviews_restaurant", "close");

    private static void printCommands() {
        for(int i = 0; i < interogari.size(); i++){
           System.out.println(i+1 + ". " + interogari.get(i));
        }
    }

    public static void main(String[] args) {


        MainServices mainServices = new MainServices();

        Scanner in = new Scanner(System.in);
        boolean close = false;

        while (!close) {
            printCommands();
            String cmd = in.nextLine().toLowerCase(Locale.ROOT);
            try {
                switch (cmd) {
                    case "create_client" -> mainServices.registerClient();
                    case "create_driver" -> mainServices.registerDriver();
                    case "login" -> mainServices.login();
                    case "show_logged_in_user" -> mainServices.afisareUser();
                    case "add_address" -> mainServices.adaugareAdresa();
                    case "create_restaurant" -> mainServices.addRestaurant();
                    case "create_review_restaurant" -> mainServices.creareReviewRestaurant();
                    case "show_restaurants" -> mainServices.afisareRestaurante();
                    case "show_menu_restaurant" -> mainServices.afisareMeniuRestaurant();
                    case "show_reviews_restaurant" -> mainServices.afisareReviewsRestaurant();
                    case "close" -> close = true;
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
}
}
