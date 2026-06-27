# 🚀 Selenium Java TestNG Automation Framework

A professional, scalable, and maintainable UI Automation Framework developed using **Java, Selenium WebDriver, TestNG, Maven**, and the **Page Object Model (POM)** design pattern.

This framework demonstrates industry-standard automation practices including parallel execution, retry mechanism, data-driven testing, reporting, logging, screenshots, CI/CD integration, and cross-browser support.

---

# 📌 Features

- ✅ Selenium WebDriver 4
- ✅ Java 17
- ✅ TestNG Framework
- ✅ Maven Build Management
- ✅ Page Object Model (POM)
- ✅ Base Test Architecture
- ✅ Base Page with Common Methods
- ✅ Driver Factory using ThreadLocal
- ✅ Cross Browser Support (Chrome, Edge, Firefox)
- ✅ Explicit Waits
- ✅ Configurable Environment using Properties File
- ✅ Data Driven Testing using CSV
- ✅ Data Driven Testing using Excel (Apache POI)
- ✅ Extent HTML Reports
- ✅ Log4j2 Logging
- ✅ Automatic Screenshot on Test Failure
- ✅ Retry Failed Tests
- ✅ Parallel Test Execution
- ✅ GitHub Actions CI/CD
- ✅ Clean Project Structure
- ✅ Easy to Extend

---

# 🛠 Tech Stack

| Technology | Version |
|------------|----------|
| Java | 17 |
| Selenium WebDriver | 4.x |
| TestNG | 7.x |
| Maven | Latest |
| Apache POI | 5.x |
| Extent Reports | 5.x |
| Log4j2 | Latest |
| WebDriverManager | Latest |
| GitHub Actions | CI/CD |

---

# 📂 Project Structure

```
Selenium-Java-TestNG-Automation-Framework
│
├── .github
│   └── workflows
│       └── ci.yml
│
├── logs
│
├── reports
│
├── screenshots
│
├── src
│   ├── test
│   │   ├── java
│   │   │
│   │   ├── base
│   │   │      BaseTest.java
│   │   │      BasePage.java
│   │   │
│   │   ├── pages
│   │   │      LoginPage.java
│   │   │      ProductsPage.java
│   │   │      CartPage.java
│   │   │      CheckoutPage.java
│   │   │
│   │   ├── tests
│   │   │      LoginTest.java
│   │   │      AddToCartTest.java
│   │   │      CheckoutTest.java
│   │   │
│   │   ├── listeners
│   │   │      RetryAnalyzer.java
│   │   │      RetryTransformer.java
│   │   │      TestListener.java
│   │   │
│   │   └── utils
│   │          ConfigReader.java
│   │          DriverFactory.java
│   │          CSVReaderUtil.java
│   │          ExcelReaderUtil.java
│   │          LoggerUtil.java
│   │
│   └── resources
│         config.properties
│         log4j2.xml
│         loginData.csv
│         loginData.xlsx
│
├── testng.xml
├── pom.xml
└── README.md
```

---

# 📊 Framework Architecture

```
TestNG
   │
   ▼
BaseTest
   │
   ▼
DriverFactory
   │
   ▼
WebDriver
   │
   ▼
Page Objects
   │
   ▼
Test Classes
   │
   ▼
Extent Report
Log4j Logs
Screenshots
```

---

# 📄 Test Data

The framework supports two types of external data sources.

## CSV

```
src/test/resources/testdata/loginData.csv
```

## Excel

```
src/test/resources/testdata/loginData.xlsx
```

---

# 📈 Reports

After execution, Extent Reports are generated automatically.

```
reports/
```

---

# 📝 Logs

Execution logs are generated automatically.

```
logs/
```

---

# 📸 Screenshots

Failed test screenshots are captured automatically.

```
screenshots/
```

---

# 🔁 Retry Mechanism

Failed tests are automatically retried using TestNG Retry Analyzer.

Maximum retries:

```
2
```

---

# ⚡ Parallel Execution

Tests can execute simultaneously using TestNG.

Example:

```xml
<suite parallel="classes" thread-count="3">
```

---

# 🌐 Cross Browser Execution

Supported browsers:

- Chrome
- Firefox
- Edge

Configured using:

```
config.properties
```

---

# 🚀 Continuous Integration

GitHub Actions workflow automatically runs the framework on:

- Push
- Pull Request

Workflow file:

```
.github/workflows/ci.yml
```

---

# ▶️ How to Run

## Clone Repository

```bash
git clone https://github.com/yourusername/selenium-java-testng-automation-framework.git
```

---

## Open Project

Open with IntelliJ IDEA or Eclipse.

---

## Install Dependencies

```bash
mvn clean install
```

---

## Execute Tests

```bash
mvn clean test
```

---

## Execute from TestNG

Run:

```
testng.xml
```

---

# 📋 Current Test Scenarios

### Login

- Valid Login
- Invalid Login
- Locked User Login

### Products

- Add Product to Cart

### Cart

- Verify Product in Cart

### Checkout

- Complete Checkout
- Verify Order Confirmation

---

# 📌 Design Patterns Used

- Page Object Model (POM)
- Factory Pattern
- Singleton Configuration
- ThreadLocal Driver
- Utility Classes

---

# 📚 Dependencies

- Selenium
- TestNG
- Apache POI
- WebDriverManager
- Log4j2
- Extent Reports
- Maven

---

# 🎯 Future Enhancements

- Docker Integration
- Selenium Grid
- Jenkins Pipeline
- REST Assured API Automation
- Database Validation
- Allure Reporting
- BrowserStack Integration
- Azure DevOps Pipeline

---

# 👨‍💻 Author

## Wajid Ali

**Senior Software Quality Assurance Engineer**

### Skills

- Selenium WebDriver
- Java
- TestNG
- Maven
- REST API Testing
- SQL
- Postman
- Git
- Jenkins
- CI/CD
- Manual Testing
- Automation Testing

---

# ⭐ If you like this project

Please consider giving it a ⭐ on GitHub.

It helps others discover the project and supports future improvements.