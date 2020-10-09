package restaurant;

import java.util.Objects;

/**
 * Information about a restaurant.
 */
public final class Restaurant {
    private final String name;
    private final String cuisine;
    private final int rating;

    /**
     * Creates a new restaurant
     * @param name      The name of the restaurant (e.g. Shish)
     * @param cuisine   The type of food (e.g. Mediterranean)
     * @param rating    The quality rating between 1 and 5 (e.g. 4)
     */
    public Restaurant(String name, String cuisine, int rating) {
        this.name = Objects.requireNonNull(name, "name is null");
        this.cuisine = Objects.requireNonNull(cuisine, "name is null");

        if (rating < 1 || rating > 5) {
            throw new IllegalArgumentException("rating is out of bounds: " + rating);
        }
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }

    public String getCuisine() {
        return cuisine;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", cuisine='" + cuisine + '\'' +
                ", rating=" + rating +
                '}';
    }
}
