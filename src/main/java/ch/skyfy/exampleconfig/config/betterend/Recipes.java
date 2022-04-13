package ch.skyfy.exampleconfig.config.betterend;

import java.util.HashMap;
import java.util.Map;

public class Recipes {
    public final Map<String, Boolean> allowedRecipes;
    public Recipes() {
        allowedRecipes = new HashMap<>();
        allowedRecipes.put("flavolite_pillar", true);
        allowedRecipes.put("sulphuric_rock_slab", true);
        allowedRecipes.put("virid_jadestone_pressure_plate", true);
    }
}
