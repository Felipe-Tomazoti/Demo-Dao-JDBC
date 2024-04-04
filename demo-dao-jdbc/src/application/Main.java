package application;

import dao.DaoFactory;
import dao.DepartmentDao;
import dao.SellerDao;
import entities.Department;
import entities.Seller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("PRESS 1 -SELLER-  OR  PRESS 2 -DEPARTMENT-");
        int x = sc.nextInt();
        if (x==1){
            System.out.println();
            System.out.println("=== SELLER ===");
            SellerDao sellerDao = DaoFactory.createSellerDao();
            System.out.println();
            System.out.println("=== TEST 1: seller findById ===");
            Seller seller = sellerDao.findById(3);
            System.out.println(seller);

            System.out.println("\n=== TEST 2: seller findByDepartment ===");
            Department department = new Department(2, null);
            List<Seller> list = sellerDao.findByDepartment(department);
            for (Seller obj : list){
                System.out.println(obj);
            }

            System.out.println("\n=== TEST 3: seller findAll ===");
            list = sellerDao.findAll();
            for (Seller obj : list){
                System.out.println(obj);
            }

            System.out.println("\n=== TEST 4: seller insert ===");
            Seller newSeller = new Seller(null, new Date(), "Greg","greg@gmail.com", 4000.0,department);
            sellerDao.insert(newSeller);
            System.out.println("Inserted! New id = " + newSeller.getId());

            System.out.println("\n=== TEST 5: seller update ===");
            seller = sellerDao.findById(2);
            seller.setName("Martha Waine");
            sellerDao.update(seller);
            System.out.println("Updated completed!");

            System.out.println("\n=== TEST 6: seller delete ===");
            System.out.println("Enter id for delete teste: ");
            int id = sc.nextInt();
            sellerDao.deleteById(id);
            System.out.println("Delete completed!");
        }else {
            DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
            System.out.println();
            System.out.println("=== DEPARTMENT ===");
            System.out.println("=== TEST 1: department findById ===");
            Department departmentO = departmentDao.findById(4);
            System.out.println(departmentO);

            System.out.println("\n=== TEST 2: department findAll ===");
            List<Department> listD = new ArrayList<>();
            listD = departmentDao.findAll();
            for (Department dep : listD){
                System.out.println(dep);
            }

            System.out.println("\n=== TEST 3: department insert ===");
            Department newDep = new Department(null, "Industry");
            departmentDao.insert(newDep);
            System.out.println("Inserted! New id = " + newDep.getId());

            System.out.println("\n=== TEST 4: department update ===");
            departmentO = departmentDao.findById(2);
            departmentO.setName("CT");
            departmentDao.update(departmentO);
            System.out.println("Updated completed!");

            System.out.println("\n=== TEST 5: department delete ===");
            System.out.println("Enter id for delete: ");
            int id = sc.nextInt();
            departmentDao.deleteById(id);
            System.out.println("Delete completed!");
        }
        sc.close();
    }
}