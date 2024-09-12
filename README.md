## 🌐 [English Version of README](README_EN.md)

<p align="center">
  <img src="https://avatars3.githubusercontent.com/u/30732658?v=4&s=200.jpg" alt="BackEndBR" width="230" />
</p>

# Desafios

Aqui você encontrará uma coleção de desafios projetados para aprimorar suas habilidades de programação com foco em backend.

## 🔨 Funcionalidades do Projeto

Os desafios cobrem uma variedade de tópicos para você aprimorar suas habilidades em desenvolvimento backend, incluindo:

- **Criptografia**: Implementação de criptografia para proteger campos sensíveis em um banco de dados.
- **Autenticação**: Validação de tokens de acesso recebidos via HTTP.
- **Empréstimos**: Determinação de modalidades de empréstimo com base em critérios específicos.
- **Senha segura**: Validação de senhas de acordo com critérios de segurança definidos.
- **Encurtador de URLs**: Serviço para encurtar URLs longas e redirecionar para as URLs originais.
- **Pontos de Interesse por GPS**: Implementação de um serviço para localizar pontos de interesse próximos com base em coordenadas GPS.

### Exemplo Visual do Projeto

Para uma visão mais detalhada e visual dos projetos, consulte os diretórios individuais para exemplos de implementação.

## ✔️ Técnicas e Tecnologias Utilizadas

Os desafios são implementados utilizando diversas tecnologias e frameworks. Aqui estão algumas das tecnologias utilizadas:

- **JavaScript (Node.js com Express)**: Para serviços web e APIs.
- **Python (Flask)**: Para serviços web e APIs.
- **Java (Spring Boot)**: Para serviços web e APIs.

## 📁 Estrutura do Projeto

Cada desafio possui sua própria estrutura de projeto. Exemplos de estrutura incluem:

- **authentication/**
    - **flask-app/**
        - `app.py`: Implementação do serviço de autenticação em Flask.
        - `requirements.txt`: Dependências do projeto.
    - **node-express-app/**
        - `index.js`: Implementação do serviço de autenticação em Node.js com Express.
        - `package.json`: Dependências do projeto.
    - **PROBLEM.md**: Descrição do problema e requisitos.
    - **spring-boot-app/**
        - `pom.xml`: Configuração do Maven para o projeto Spring Boot.
        - **src/**
            - **main/**
                - **java/**
                    - **com/**
                        - **example/**
                            - `TokenController.java`: Controlador de autenticação.
                            - `TokenValidationApplication.java`: Aplicação Spring Boot.
                - **resources/**
                    - `application.properties`: Configurações da aplicação Spring Boot.

- **cryptography/**
    - **flask-crypto/**
        - `app.py`: Implementação do serviço de criptografia em Flask.
        - `requirements.txt`: Dependências do projeto.
    - **node-express-crypto/**
        - `crypto.js`: Implementação de criptografia em Node.js.
        - `index.js`: Aplicação Node.js com Express.
        - `package.json`: Dependências do projeto.
    - **PROBLEM.md**: Descrição do problema e requisitos.
    - **spring-boot-crypto/**
        - `pom.xml`: Configuração do Maven para o projeto Spring Boot.
        - **src/**
            - **main/**
                - **java/**
                    - **com/**
                        - **example/**
                            - `CryptoUtils.java`: Utilitários de criptografia.
                            - `ItemController.java`: Controlador de criptografia.
                            - `SpringBootCryptoApplication.java`: Aplicação Spring Boot.
                - **resources/**
                    - `application.properties`: Configurações da aplicação Spring Boot.

- **loans/**
    - **flask-loan-service/**
        - `app.py`: Implementação do serviço de empréstimos em Flask.
        - `requirements.txt`: Dependências do projeto.
    - **node-loan-service/**
        - `index.js`: Implementação do serviço de empréstimos em Node.js com Express.
        - `package.json`: Dependências do projeto.
    - **PROBLEM.md**: Descrição do problema e requisitos.
    - **spring-boot-loan-service/**
        - `pom.xml`: Configuração do Maven para o projeto Spring Boot.
        - **src/**
            - **main/**
                - **java/**
                    - **com/**
                        - **example/**
                            - `LoanController.java`: Controlador de empréstimos.
                            - `SpringBootLoanServiceApplication.java`: Aplicação Spring Boot.
                - **resources/**
                    - `application.properties`: Configurações da aplicação Spring Boot.

- **points-of-interest/**
    - **flask-poi-service/**
        - `app.py`: Implementação do serviço de pontos de interesse em Flask.
        - `requirements.txt`: Dependências do projeto.
    - **node-poi-service/**
        - `db.json`: Banco de dados JSON para pontos de interesse.
        - `index.js`: Implementação do serviço de pontos de interesse em Node.js com Express.
        - `package.json`: Dependências do projeto.
    - **PROBLEM.md**: Descrição do problema e requisitos.
    - **spring-boot-poi-service/**
        - `pom.xml`: Configuração do Maven para o projeto Spring Boot.
        - **src/**
            - **main/**
                - **java/**
                    - **com/**
                        - **example/**
                            - `Poi.java`: Modelo de ponto de interesse.
                            - `PoiController.java`: Controlador de pontos de interesse.
                            - `SpringBootPoiServiceApplication.java`: Aplicação Spring Boot.
                - **resources/**
                    - `application.properties`: Configurações da aplicação Spring Boot.

- **secure-password/**
    - **flask-password-service/**
        - `app.py`: Implementação do serviço de validação de senha em Flask.
        - `requirements.txt`: Dependências do projeto.
    - **node-password-service/**
        - `index.js`: Implementação do serviço de validação de senha em Node.js com Express.
        - `package.json`: Dependências do projeto.
        - `validations.js`: Lógica de validação de senha.
    - **PROBLEM.md**: Descrição do problema e requisitos.
    - **spring-boot-password-service/**
        - `pom.xml`: Configuração do Maven para o projeto Spring Boot.
        - **src/**
            - **main/**
                - **java/**
                    - **com/**
                        - **example/**
                            - `PasswordController.java`: Controlador de validação de senha.
                            - `PasswordRequest.java`: Modelo de solicitação de senha.
                            - `PasswordValidator.java`: Validador de senha.
                            - `SpringBootPasswordServiceApplication.java`: Aplicação Spring Boot.
                - **resources/**
                    - `application.properties`: Configurações da aplicação Spring Boot.

- **url-shortener/**
    - **flask-url-shortener/**
        - `app.py`: Implementação do serviço de encurtamento de URLs em Flask.
        - `requirements.txt`: Dependências do projeto.
    - **node-url-shortener/**
        - `index.js`: Implementação do serviço de encurtamento de URLs em Node.js com Express.
        - `package.json`: Dependências do projeto.
        - `urlService.js`: Lógica de encurtamento de URLs.
    - **PROBLEM.md**: Descrição do problema e requisitos.
    - **spring-boot-url-shortener/**
        - `pom.xml`: Configuração do Maven para o projeto Spring Boot.
        - **src/**
            - **main/**
                - **java/**
                    - **com/**
                        - **example/**
                            - `UrlController.java`: Controlador de encurtamento de URLs.
                            - `UrlRequest.java`: Modelo de solicitação de URL.
                            - `UrlService.java`: Serviço de encurtamento de URLs.
                            - `UrlShortenerApplication.java`: Aplicação Spring Boot.
                - **resources/**
                    - `application.properties`: Configurações da aplicação Spring Boot.

## 🛠️ Abrir e Rodar o Projeto

Para iniciar um dos projetos localmente, siga os passos abaixo:

1. **Certifique-se de que a tecnologia correspondente está instalada**:
    - **Node.js**: [Node.js](https://nodejs.org/)
    - **Python**: [Python](https://www.python.org/)
    - **Java**: [Java JDK](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)

2. **Clone o Repositório**:
    - Copie a URL do repositório e execute o comando abaixo no terminal:

      ```bash
      git clone <URL_DO_REPOSITORIO>
      ```

3. **Instale as Dependências**:
    - Para Node.js, execute:

      ```bash
      npm install
      ```

    - Para Python, crie um ambiente virtual e instale as dependências:

      ```bash
      python -m venv venv
      source venv/bin/activate
      pip install -r requirements.txt
      ```

    - Para Java, utilize o Maven para instalar as dependências:

      ```bash
      mvn install
      ```

4. **Execute o Projeto**:
    - Para Node.js, inicie o servidor:

      ```bash
      npm start
      ```

    - Para Python, execute:

      ```bash
      python app.py
      ```

    - Para Java, inicie a aplicação:

      ```bash
      mvn spring-boot:run
      ```

## 🌐 Deploy

Para informações sobre como fazer o deploy dos projetos, consulte a documentação específica para cada tecnologia ou plataforma de hospedagem utilizada.

## Licença

Licenciado sob [MIT](LICENSE).

## Contribuindo

Siga as [diretrizes de contribuição](CONTRIBUTING.md) para contribuir com o projeto.
