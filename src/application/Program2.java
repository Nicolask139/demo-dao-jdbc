package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

		System.out.println("=== Teste 1: department findById ===");
		Department department = departmentDao.findById(3);
		System.out.println(department);
		
		System.out.println("\n === Teste 2: seller findAll ===");

		List<Department> list = departmentDao.findAll();
		for (Department obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n === Teste 3: department Insert ===");
		Department newDepartment = new Department(null, "comidas");		
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New id = " + newDepartment.getId());
		
		
		System.out.println("\n === Teste 4: department Update ===");
		department = departmentDao.findById(4);
		department.setName("geladeria");
		departmentDao.update(department);
		System.out.println("Update completed");	
		
		System.out.println("\n === Teste 5: department Delete ===");
		System.out.println("Enter Id for delete: ");	
		int id = sc.nextInt();	
		departmentDao.deleteById(id);
		System.out.println("Delete completed");
		
		sc.close();
}}
