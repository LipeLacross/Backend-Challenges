## 🌐 [Versão em Português do README](README.md)

<p align="center">
  <img src="https://avatars3.githubusercontent.com/u/30732658?v=4&s=200.jpg" alt="BackEndBR" width="230" />
</p>

# Challenges

Here you will find a collection of challenges designed to enhance your programming skills with a focus on backend development.

## 🔨 Project Features

The challenges cover a variety of topics to help you improve your backend development skills, including:

- **Cryptography**: Implement encryption to protect sensitive fields in a database.
- **Authentication**: Validate access tokens received via HTTP.
- **Loans**: Determine loan modalities based on specific criteria.
- **Secure Password**: Validate passwords according to defined security criteria.
- **URL Shortener**: Service to shorten long URLs and redirect to the original URLs.
- **GPS Points of Interest**: Implement a service to locate nearby points of interest based on GPS coordinates.

### Project Visual Example

For a more detailed and visual overview of the projects, check the individual directories for implementation examples.

## ✔️ Technologies and Techniques Used

The challenges are implemented using various technologies and frameworks. Here are some of the technologies used:

- **JavaScript (Node.js with Express)**: For web services and APIs.
- **Python (Flask)**: For web services and APIs.
- **Java (Spring Boot)**: For web services and APIs.

## 📁 Project Structure

Each challenge has its own project structure. Example structures include:

- **authentication/**
    - **flask-app/**
        - `app.py`: Flask implementation of the authentication service.
        - `requirements.txt`: Project dependencies.
    - **node-express-app/**
        - `index.js`: Node.js with Express implementation of the authentication service.
        - `package.json`: Project dependencies.
    - **PROBLEM.md**: Problem description and requirements.
    - **spring-boot-app/**
        - `pom.xml`: Maven configuration for the Spring Boot project.
        - **src/**
            - **main/**
                - **java/**
                    - **com/**
                        - **example/**
                            - `TokenController.java`: Authentication controller.
                            - `TokenValidationApplication.java`: Spring Boot application.
                - **resources/**
                    - `application.properties`: Spring Boot application settings.

- **cryptography/**
    - **flask-crypto/**
        - `app.py`: Flask implementation of the cryptography service.
        - `requirements.txt`: Project dependencies.
    - **node-express-crypto/**
        - `crypto.js`: Cryptography implementation in Node.js.
        - `index.js`: Node.js with Express application.
        - `package.json`: Project dependencies.
    - **PROBLEM.md**: Problem description and requirements.
    - **spring-boot-crypto/**
        - `pom.xml`: Maven configuration for the Spring Boot project.
        - **src/**
            - **main/**
                - **java/**
                    - **com/**
                        - **example/**
                            - `CryptoUtils.java`: Cryptography utilities.
                            - `ItemController.java`: Cryptography controller.
                            - `SpringBootCryptoApplication.java`: Spring Boot application.
                - **resources/**
                    - `application.properties`: Spring Boot application settings.

- **loans/**
    - **flask-loan-service/**
        - `app.py`: Flask implementation of the loan service.
        - `requirements.txt`: Project dependencies.
    - **node-loan-service/**
        - `index.js`: Node.js with Express implementation of the loan service.
        - `package.json`: Project dependencies.
    - **PROBLEM.md**: Problem description and requirements.
    - **spring-boot-loan-service/**
        - `pom.xml`: Maven configuration for the Spring Boot project.
        - **src/**
            - **main/**
                - **java/**
                    - **com/**
                        - **example/**
                            - `LoanController.java`: Loan controller.
                            - `SpringBootLoanServiceApplication.java`: Spring Boot application.
                - **resources/**
                    - `application.properties`: Spring Boot application settings.

- **points-of-interest/**
    - **flask-poi-service/**
        - `app.py`: Flask implementation of the points of interest service.
        - `requirements.txt`: Project dependencies.
    - **node-poi-service/**
        - `db.json`: JSON database for points of interest.
        - `index.js`: Node.js with Express implementation of the points of interest service.
        - `package.json`: Project dependencies.
    - **PROBLEM.md**: Problem description and requirements.
    - **spring-boot-poi-service/**
        - `pom.xml`: Maven configuration for the Spring Boot project.
        - **src/**
            - **main/**
                - **java/**
                    - **com/**
                        - **example/**
                            - `Poi.java`: Point of interest model.
                            - `PoiController.java`: Point of interest controller.
                            - `SpringBootPoiServiceApplication.java`: Spring Boot application.
                - **resources/**
                    - `application.properties`: Spring Boot application settings.

- **secure-password/**
    - **flask-password-service/**
        - `app.py`: Flask implementation of the password validation service.
        - `requirements.txt`: Project dependencies.
    - **node-password-service/**
        - `index.js`: Node.js with Express implementation of the password validation service.
        - `package.json`: Project dependencies.
        - `validations.js`: Password validation logic.
    - **PROBLEM.md**: Problem description and requirements.
    - **spring-boot-password-service/**
        - `pom.xml`: Maven configuration for the Spring Boot project.
        - **src/**
            - **main/**
                - **java/**
                    - **com/**
                        - **example/**
                            - `PasswordController.java`: Password validation controller.
                            - `PasswordRequest.java`: Password request model.
                            - `PasswordValidator.java`: Password validator.
                            - `SpringBootPasswordServiceApplication.java`: Spring Boot application.
                - **resources/**
                    - `application.properties`: Spring Boot application settings.

- **url-shortener/**
    - **flask-url-shortener/**
        - `app.py`: Flask implementation of the URL shortener service.
        - `requirements.txt`: Project dependencies.
    - **node-url-shortener/**
        - `index.js`: Node.js with Express implementation of the URL shortener service.
        - `package.json`: Project dependencies.
        - `urlService.js`: URL shortening logic.
    - **PROBLEM.md**: Problem description and requirements.
    - **spring-boot-url-shortener/**
        - `pom.xml`: Maven configuration for the Spring Boot project.
        - **src/**
            - **main/**
                - **java/**
                    - **com/**
                        - **example/**
                            - `UrlController.java`: URL shortener controller.
                            - `UrlRequest.java`: URL request model.
                            - `UrlService.java`: URL shortening service.
                            - `UrlShortenerApplication.java`: Spring Boot application.
                - **resources/**
                    - `application.properties`: Spring Boot application settings.

## 🛠️ Running the Project

To run one of the projects locally, follow the steps below:

1. **Ensure the corresponding technology is installed**:
    - **Node.js**: [Node.js](https://nodejs.org/)
    - **Python**: [Python](https://www.python.org/)
    - **Java**: [Java JDK](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)

2. **Clone the Repository**:
    - Copy the repository URL and run the following command in your terminal:

      ```bash
      git clone <REPOSITORY_URL>
      ```

3. **Install Dependencies**:
    - For Node.js, run:

      ```bash
      npm install
      ```

    - For Python, create a virtual environment and install dependencies:

      ```bash
      python -m venv venv
      source venv/bin/activate
      pip install -r requirements.txt
      ```

    - For Java, use Maven to install dependencies:

      ```bash
      mvn install
      ```

4. **Run the Project**:
    - For Node.js, start the server:

      ```bash
      npm start
      ```

    - For Python, run:

      ```bash
      python app.py
      ```

    - For Java, start the application:

      ```bash
      mvn spring-boot:run
      ```

## 🌐 Deployment

For information on how to deploy the projects, refer to the specific documentation for each technology or hosting platform used.

## License

Licensed under [MIT](LICENSE).

## Contributing

Follow the [contributing guidelines](CONTRIBUTING.md) to contribute to the project.
