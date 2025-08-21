# Java-Parking-WebApp
A Simple Java EE web application for managaing parking bookings. Built with Maven, JSF(primefaces) and deployed as a WAR on tomcat.

## ✨ Features
- User registration and login
- Create new parking bookings (date, time, duration, spot, vehicle reg)
- View and manage existing bookings
- Delete bookings
- Session-based authentication (in-memory stores, no DB for simplicity)
- Custom CSS styling for a modern UI
Create Account
<img width="981" height="401" alt="image" src="https://github.com/user-attachments/assets/d9791d03-73a6-49f7-98a5-b155ed8d686f" />
Login
<img width="975" height="338" alt="image" src="https://github.com/user-attachments/assets/0197e4b8-358e-4d1a-a1e9-454eaf037280" />
Dashboard (Home)
<img width="1127" height="542" alt="image" src="https://github.com/user-attachments/assets/c3fdcd87-1eeb-4311-b69b-32a37eabb876" />
New Booking
<img width="1049" height="651" alt="image" src="https://github.com/user-attachments/assets/0369495a-8658-431c-8a0b-cd0b120e330e" />
Booking Confirmation
<img width="1106" height="367" alt="image" src="https://github.com/user-attachments/assets/2681a0d1-a2c3-4f24-ab71-135cf50a5a60" />
Manage Bookings
<img width="1071" height="645" alt="image" src="https://github.com/user-attachments/assets/7f64eaa6-4418-40a3-a915-6edbf3ddf034" />

## Tech Stack
- Java 17
- JSF 2.2 (Mojarra)
- PrimeFaces 13
- Maven (WAR packaging)
- Tomcat 9+
  
##  How to Run
1. Clone this repository  
2. Run `mvn clean package`  
3. Deploy the generated `parking-app.war` to Tomcat  
4. Open [http://localhost:8080/parking-app](http://localhost:8080/parking-app)

   ## 📌 Notes
- Data is stored in memory (no database)
  
