# MVC-Labs
1. Install Prerequisites
Ensure the following are installed on your system:
Java JDK 17+
NetBeans IDE with Maven support (comes pre-installed in most recent versions).
2. Create a Spring Boot Project in NetBeans
Open NetBeans.
Go to File → New Project.
In the New Project dialog:
Select Maven → Java Application.
Click Next.
Configure the project:
Project Name: SpringMVCApp
Group ID: com.example
Artifact ID: mvcapp
Click Finish.
3. Add Spring Boot Dependencies
Open the pom.xml file in your project.
Add the following dependencies inside the <dependencies> section:
xml

<dependencies>
    <!-- Spring Boot Starter Web -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>

    <!-- Thymeleaf Template Engine -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-thymeleaf</artifactId>
    </dependency>

    <!-- Spring Boot Starter Test (optional for testing) -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-test</artifactId>
        <scope>test</scope>
    </dependency>
</dependencies>

Save the file. NetBeans will automatically download the required libraries.
4. Code Setup
4.1 Application.java
Create this file under src/main/java/com/example/mvcapp:
java

package com.example.mvcapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

4.2 AppController.java
Create this file under the same package com.example.mvcapp:

java

package com.example.mvcapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AppController {

    @GetMapping("/message")
    public String getMessage(
            @RequestParam(name = "text", required = false, defaultValue = "Hello, MVC!") String text,
            Model model) {
        model.addAttribute("message", text);
        return "View";
    }
}

4.3 View.html
Create the View.html file in the src/main/resources/templates directory. If the templates folder doesn't exist, create it manually.

html

<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <title>Spring MVC Example</title>
</head>
<body>
    <h1>Message:</h1>
    <p th:text="${message}">Default Message</p>
</body>
</html>

5. Running the Application
Right-click the Application.java file in the Project Explorer.
Select Run File.
Alternatively, you can right-click the project in the Project Explorer and select Run.
6. Access the Application
Open your browser.
Navigate to:

http://localhost:8080/message?text=Hello%20SpringMVC

The browser will display:
Message:

Hello SpringMVC
