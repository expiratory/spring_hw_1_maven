package app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class ProductController {

    @GetMapping("/products")
    public String getProducts(Model model) {
        List<String> products = Arrays.asList("Ноутбук", "Смартфон", "Планшет");
        model.addAttribute("products", products);
        return "products";
    }
}
