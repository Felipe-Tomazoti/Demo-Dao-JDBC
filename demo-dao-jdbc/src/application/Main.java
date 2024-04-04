package application;

import dao.DaoFactory;
import dao.SellerDao;
import entities.Department;
import entities.Seller;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Department obj = new Department(1, "Books");
        Seller seller = new Seller(21, new Date(), "bob", "bob@gmail.com", 3000.0, obj);

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println(seller);
    }
}