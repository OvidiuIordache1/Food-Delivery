package src.repository;

import src.model.Client;
import src.model.Menu;
import src.model.Restaurant;
import src.model.Review;

import java.util.*;

public class RestaurantInMemoryService {
    private List<Restaurant> restaurants = new ArrayList<>();

    public void addRestaurant(Restaurant restaurant){
        restaurants.add(restaurant);
    }

    public void afisareRestaurante(){
        if (restaurants.size() > 0) {
            int i = 1;
            for (Restaurant restaurant:restaurants) {
                System.out.println(i + ". " + restaurant);
                i += 1;
            }
        }
        else {
            System.out.println("Nu exista restaurante.");
        }
    }

    public void afisareMeniuRestaurant(Restaurant restaurant) {
        System.out.println(restaurant.getMeniu());
    }

    public void afisareReviewsRestaurant(Restaurant restaurant) {
        System.out.println(restaurant.getReviews());
    }

    public void creareReviewRestaurant(Review review) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introdu nr. restaurantului :");
        afisareRestaurante();
        if (restaurants.size() > 0) {
            int nr = in.nextInt();
            Restaurant restaurant = restaurants.get(nr - 1);
            restaurant.addReview(review);
            restaurants.set(nr-1, restaurant);
        }
    }

    public List<Restaurant> getRestaurants() {
        Collections.sort(restaurants, Comparator.comparingDouble(Restaurant :: getAvgReview));
        return restaurants;
    }

    public void setRestaurants(List<Restaurant> restaurants) {
        this.restaurants = restaurants;
    }
}
