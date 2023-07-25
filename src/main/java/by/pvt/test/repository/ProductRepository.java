package by.pvt.test.repository;

import by.pvt.test.domain.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository extends FileWorker{
    private  static List<Product> productList=new ArrayList<>();
    private  static String way = "C:\\Project Java\\HW1\\HW1\\src\\main\\java\\by\\pvt\\test\\data\\product.txt";

    public ProductRepository() {
    }

}
