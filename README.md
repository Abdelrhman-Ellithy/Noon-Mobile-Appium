# 📱 Noon Mobile App Test Automation Project 🛠️

**Noon Mobile App Test Project**! This project leverages the **Ellithium Test Automation Framework** which I created, integrated with **Appium** to ensure high-quality testing for the Noon mobile application. 🎉

---

## 📋 **Project Overview**

This repository is designed to automate the testing of the **Noon Mobile App**. The project includes:  

- ✅ **Automated test scripts** for **7 scenarios**.  
- 🐞 **Manual test cases** with **3 bug reports**.  
- 🎥 **Video recordings** for each test scenario execution.  
- 🌟 **Allure reporting** and **Cucumber integration**.  


---

## 🛠️ **Tech Stack & Tools**

| Category                 | Tools/Technologies Used           |  
|--------------------------|------------------------------------|  
| **Programming Language** | Java ☕                          |  
| **Test Automation**      | Appium 📱, Selenium 🌐           |  
| **Framework**            | Ellithium 🚀                    |  
| **Test Runner**          | Cucumber 🥒, TestNG ⚙️          |  
| **Reporting**            | Allure 🌟                       |  
| **IDE**                  | IntelliJ IDEA 💡                |  
| **Version Control**      | Git 🔗                          |  

---

## 📂 **Project Structure**

### Source Code Files
```
Noon-Appium
├── src
│   ├── main
│   │   ├── java
│   │   │   ├── Pages
│   │   │   │   └── SearchPage.java
│   │   │   ├── utility
│   │   │   │   └── videoRecorder.java
│   │   ├── resources
│   │   │   ├── features
│   │   │   │   └── Search.feature
│   │   │   ├── properties
│   │   │   │   └── allure.properties
│   │   │   │   └── config.properties
│   │   │   │   └── log4j2.properties
│   ├── test
│   │   ├── java
│   │   │   ├── Base
│   │   │   │   └── Base.java
│   │   │   │   └── Hooks.java
│   │   │   ├── Runner
│   │   │   │   └── TestRunner.java
│   │   │   ├── stepDefinitions
│   │   │   │   └── SearchStepDefinitions.java
│   │   ├── resources
│   │   │   ├── TestData
├── Test-Output
│   ├── Logs
│   │   └── Test.log
│   ├── Reports
│   │   ├── Allure
│   │   │   ├── allure-report
│   │   │   │   └── *.html
│   │   │   ├── allure-results
│   │   ├── Cucumber
│   │   │   └── cucumber.html
│   ├── ScreenShots
│   │   ├── Failed
│   ├── VideoRecords
│   ├── UpdateChecker
│   │   └── checker.json
├── TestRunner.xml
├── pom.xml
└── README.md
```

---

## 🚀 **Features**

| Feature                          | Description                                        |  
|----------------------------------|----------------------------------------------------|  
| 🔍 **Search Functionality Tests** | Validates various search scenarios in the app.    |  
| 🛠️ **Ellithium Integration**      | Leverages the latest in test automation!          |  
| 🎥 **Video Recording**            | Automatically records test executions.            |  
| 📊 **Allure Reporting**           | Interactive and detailed reports with insights.   |  
| 🌐 **Cross-Platform**             | Supports both Android and iOS devices.            |  

---

## 🎯 **Scenarios Tested**

1. 🟢 **User Search query is Accepted**
2. 🟢 **Only Relative Items Returned in the results**
2. 🟢 **Verify Search result updated according to the applied filter**
2. 🟢 **Verify Search result updated according to the applied Sorting manner**
2. 🟢 **Verify that the No Results Found message is displayed when there are no matching items**
2. 🟢 **Verify that user can search with product Company name**
2. 🟢 **Verify that user can search with partially product name**
---

## 📸 **Screenshots and Visuals**

### 🎥 Video Recordings:
https://drive.google.com/drive/folders/1R6pZlaa7ofFyYTlYwxNnk1GYfQaH51ob?usp=drive_link

### 📊 Allure Reports:
Test-Output\Reports\Allure\allure-report\Ellithium-Test-Report-2024-11-21-11-49-03AM.html

---

## ⚙️ **Setup Instructions**

### **Prerequisites**
- Install **Java** (version 21 or higher).  
- Install **Appium** (via npm).  
- Android SDK must be configured on your machine.  

### **How to Run**
1. Clone the repository:  
   ```bash
   git clone https://github.com/YourUsername/Noon-Appium.git
   ```  
2. Navigate to the project directory and install dependencies:  
   ```bash
   mvn clean install
   ```  
3. Connect your Android/iOS device and start the Appium server.  
4. Run the tests via TestNG or Cucumber:  
   ```bash
   mvn test
   ```  

---

## 🐞 **Bug Reports**

### Test Cases, BDD Scenarios, and Bugs are Availble in the Manual-Test-Cases-.xlsx file 


## 📜 **License**

This project is licensed under the [MIT License](LICENSE).
---

## 🙌 **Contributing**

Want to improve this project? Feel free to open a pull request or raise an issue. Contributions are welcome! 🎉  

---

## 🔗 **Useful Links**

- [Ellithium Framework GitHub](https://github.com/Abdelrhman-Ellithy/Ellithium)  
- [Appium Documentation](https://appium.io/docs/)  
