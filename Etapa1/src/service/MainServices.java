package src.service;

import src.model.*;
import src.repository.RestaurantInMemoryService;
import src.repository.UserInMemoryService;

import java.util.List;
import java.util.Scanner;

public class MainServices {
    private final UserInMemoryService userInMemoryService = new UserInMemoryService();
    private final RestaurantInMemoryService restaurantInMemoryService = new RestaurantInMemoryService();
    private final InputService inputService = new InputService();

    public void registerClient() {
        Client client = inputService.getClient();
        userInMemoryService.registerClient(client);
    }

    public void registerDriver() {
        Driver driver = inputService.getDriver();
        userInMemoryService.registerDriver(driver);
    }

    public void login() {
        Scanner in = new Scanner(System.in);
        System.out.println("Email :");
        String email = in.nextLine();
        System.out.println("Password :");
        String password = in.nextLine();

        userInMemoryService.login(email, password);
    }

    public void afisareUser() {
        userInMemoryService.afisareUser();
    }

    public void adaugareAdresa() {
        Address newAddress = inputService.getAddress();
        userInMemoryService.adaugareAdresa(newAddress);
    }

    public void addRestaurant() {
        Restaurant restaurant = inputService.getRestaurant();
        restaurantInMemoryService.addRestaurant(restaurant);
    }

    public void afisareRestaurante() {
        restaurantInMemoryService.afisareRestaurante();
    }

    public void afisareMeniuRestaurant() {
        List<Restaurant> restaurants = restaurantInMemoryService.getRestaurants();
        Scanner in = new Scanner(System.in);
        System.out.println("Introdu nr. restaurantului :");
        restaurantInMemoryService.afisareRestaurante();
        if (restaurants.size() > 0) {
            int nr = in.nextInt();
            Restaurant restaurant = restaurants.get(nr - 1);
            restaurantInMemoryService.afisareMeniuRestaurant(restaurant);
        }
    }

    public void afisareReviewsRestaurant() {
        List<Restaurant> restaurants = restaurantInMemoryService.getRestaurants();
        Scanner in = new Scanner(System.in);
        System.out.println("Introdu nr. restaurantului :");
        restaurantInMemoryService.afisareRestaurante();
        if (restaurants.size() > 0) {
            int nr = in.nextInt();
            Restaurant restaurant = restaurants.get(nr - 1);
            restaurantInMemoryService.afisareReviewsRestaurant(restaurant);
        }
    }

    public void creareReviewRestaurant() {
        Client loggedInClient = userInMemoryService.getLoggedInClient();
        if (loggedInClient != null){
            Review review = inputService.getReview(loggedInClient);
            restaurantInMemoryService.creareReviewRestaurant(review);
        }
    }
}
