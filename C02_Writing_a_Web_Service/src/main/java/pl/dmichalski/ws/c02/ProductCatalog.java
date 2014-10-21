package pl.dmichalski.ws.c02;

import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;

/**
 * Author: Daniel
 */
@WebService
public class ProductCatalog {

    public List<String> getProductCategories() {
        List<String> categories = new ArrayList<>();
        categories.add("Books");
        categories.add("Music");
        categories.add("Movies");
        return categories;
    }
}
