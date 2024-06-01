Spring Boot

This project implements a Spring Boot application with RESTful APIs for Category and Product CRUD operations, along with additional features such as one-to-many relationship between categories and products, server-side pagination, and fetching single product details with respective category details.

Requirements 
•Spring Boot •Rest Controller 
•DB Configuration using RDB 
•Annotation-based configuration 
•JPA & Hibernate

API Endpoints

Category 1.GET all categories
2.URL: http://localhost:8080/api/categories?page=3
3.POST - create a new category 
4.URL: http://localhost:8080/api/categories
5.GET category by Id
6.URL: http://localhost:8080/api/categories/{id}
7.PUT - update category by id 
8.URL: http://localhost:8080/api/categories/{id}
9.DELETE - Delete category by id 
10.URL: http://localhost:8080/api/categories/{id}

Product 1.GET all products 
2.URL: http://localhost:8080/api/products?page=2 
3.POST - create a new product
4.URL: http://localhost:8080/api/products 
5.GET product by Id 
6.URL: http://localhost:8080/api/products/{id} 
7.PUT - update product by id 
8.URL: http://localhost:8080/api/products/{id} 
9.DELETE - Delete product by id 
10.URL: http://localhost:8080/api/products/{id}

Additional Features 
•One-to-many relationship between Category and Products 
•Server-side pagination 
•Fetching single product details with respective category details

Running the Application 
1.Clone the repository. 
2.Navigate to the project directory. 
3.Configure your database properties in application.properties. 
4.Run the application using Maven or your IDE.
5.Access the APIs using the provided URLs.
