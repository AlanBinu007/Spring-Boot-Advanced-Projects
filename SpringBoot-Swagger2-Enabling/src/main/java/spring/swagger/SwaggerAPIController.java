package spring.swagger;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
public class SwaggerAPIController {
    //
    @RequestMapping(value = "/products", method = RequestMethod.GET)
    public List<String> getProducts() {
        List<String> productsList = new ArrayList<>();
        productsList.add("Honey");
        productsList.add("Almond");
        return productsList;
    }
    @RequestMapping(value = "/products", method = RequestMethod.POST)
    public String createProduct() {
        return "Product is saved successfully";
    }
//    @RequestMapping(value = "/products", method = RequestMethod.PUT)
//    public String updateProduct(){
//        return "Product is updated";
//    }
}
