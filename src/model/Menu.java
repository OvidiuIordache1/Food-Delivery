package src.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Menu {
    protected HashMap<String, List<Food>> categorii;

    public Menu() {

    }

    public Menu(HashMap<String, List<Food>> categorii) {
        this.categorii = categorii;
    }

    public HashMap<String, List<Food>> getCategorii() {
        return categorii;
    }

    public void setCategorii(HashMap<String, List<Food>> categorii) {
        this.categorii = categorii;
    }

    @Override
    public String toString() {
        int i = 1;
        StringBuilder foodStr = new StringBuilder();
        for (Map.Entry<String, List<Food>> mapEntry: categorii.entrySet()) {
            foodStr.append(i).append(". ").append(mapEntry.getKey()).append("\n");
            i += 1;
            int j = 1;
            for (Food d : mapEntry.getValue()) {
                foodStr.append(j).append(". ").append(foodStr).append("\n");
                j += 1;
            }
        }
        return foodStr.toString();
    }
}
















