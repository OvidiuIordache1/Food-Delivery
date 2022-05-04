package src.service;

import src.model.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class InputService {
    public Address getAddress() {
        Scanner in = new Scanner(System.in);
        System.out.println("Judet:");
        String judet = in.nextLine();
        System.out.println("Localitate:");
        String localitate = in.nextLine();
        System.out.println("Sector:");
        String sector = in.nextLine();
        System.out.println("Strada:");
        String strada = in.nextLine();
        System.out.println("Nr:");
        String nr = in.nextLine();
        System.out.println("Bloc:");
        String bloc = in.nextLine();
        System.out.println("Scara:");
        String scara = in.nextLine();
        System.out.println("Etaj:");
        String etaj = in.nextLine();
        System.out.println("Ap:");
        String ap = in.nextLine();
        return new Address(judet, localitate, sector, strada, nr, bloc, scara, etaj, ap);
    }

    public Client getClient(){
        Scanner in = new Scanner(System.in);
        System.out.println("Username:");
        String username = in.nextLine();
        System.out.println("Password:");
        String password = in.nextLine();
        System.out.println("Email:");
        String email = in.nextLine();
        System.out.println("Nume:");
        String nume = in.nextLine();
        System.out.println("Prenume:");
        String prenume = in.nextLine();
        System.out.println("NrTelefon:");
        String nrTelefon = in.nextLine();
        System.out.println("Nr. Adrese:");
        int nrAdrese = in.nextInt();
        if (nrAdrese > 0) {
            List<Address> adrese = new ArrayList<Address>();
            for (int j = 0; j < nrAdrese; j++) {
                Address newAddress = getAddress();
                adrese.add(newAddress);
            }
            return new Client(username, password, email, nume, prenume, nrTelefon, adrese);
        }
        return new Client(username, password, email, nume, prenume, nrTelefon);
    }

    public Driver getDriver(){
        Scanner in = new Scanner(System.in);
        System.out.println("Username:");
        String username = in.nextLine();
        System.out.println("Password:");
        String password = in.nextLine();
        System.out.println("Email:");
        String email = in.nextLine();
        System.out.println("Nume:");
        String nume = in.nextLine();
        System.out.println("Prenume:");
        String prenume = in.nextLine();
        System.out.println("NrTelefon:");
        String nrTelefon = in.nextLine();
        System.out.println("Nr. Adrese:");
        return new Driver(username, password, email, nume, prenume, nrTelefon);
    }

    public Food getFood() {
        Scanner in = new Scanner(System.in);
        System.out.println("Nume Food:");
        String nume = in.nextLine();
        System.out.println("Continut Food:");
        String[] continut = in.nextLine().split(" ");
        System.out.println("Descriere Food:");
        String descriere = in.nextLine();
        System.out.println("Pret Food:");
        double pret = in.nextDouble();
        return new Food(nume, continut, descriere, pret);
    }

    public Menu getMenu() {
        Scanner in = new Scanner(System.in);
        System.out.println("Numarul de categorii din meniu:");
        int nrCateg = in.nextInt();
        if (nrCateg == 0) {
            return new Menu();
        }
        else {
            HashMap<String, List<Food>> categorii = new HashMap<String, List<Food>>();
            for(int i = 0; i < nrCateg; i++){
                List<Food> foods = new ArrayList<Food>();
                System.out.println("Nume Categorie:");
                String nume = in.nextLine();
                System.out.println("Nr Food Categorie:");
                int nrFood = in.nextInt();
                for (int j=0; j < nrFood; j++ ) {
                    Food food = getFood();
                    foods.add(food);
                }
                categorii.put(nume, foods);
            }
            return new Menu(categorii);
        }
    }

    public Restaurant getRestaurant() {
        Scanner in = new Scanner(System.in);
        System.out.println("Nume restaurant:");
        String name = in.nextLine();
        System.out.println("Adresa restaurant:");
        Address address = getAddress();
        System.out.println("NrTelefon restaurant:");
        String nrTelefon = in.nextLine();
        System.out.println("Maniu restaurant:");
        Menu menu = getMenu();
        return new Restaurant(name, address, nrTelefon, menu);
    }

    public Review getReview(User user){
        Scanner in = new Scanner(System.in);
        System.out.println("Mesaj:");
        String mesaj = in.nextLine();
        System.out.println("Nr: (0-5)");
        int nr = in.nextInt();
        LocalDate data = LocalDate.now();
        return new Review(user, mesaj, nr, data);
    }
}
