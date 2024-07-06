# CS307-24S-Project2

南方科技大学 2024 Spring CS307 数据库原理 Project2

得分 97/105

Project 说明及要求：https://github.com/ShellyLeee/CS307-24S-Project2/blob/main/project2_intro.pdf

## 项目情况

1. 项目简介：

   基本要求：在project1的基础上，建立一个后端API Library来执行各种数据增删改查操作，并建立前端界面实现用户与后端数据库的交互操作。

   具体实现：我们开发了一个前后端分离的深圳地铁管理系统，允许用户在前端网页上执行操作，发送HTTP请求到后端地铁信息数据库进行数据的增删改查操作，并将结果返回到前端。 我们采用了**Springboot Gradle**后端框架，并添加了 **MyBatis**、**Thymeleaf**、**JDBC** 和 **JPA** 的依赖。

   本项目使用了 **JAVA、HTML 和 SQL **语言，使用的数据库是**PostgreSQL**。

2. 项目结构（仅摘选主要部分）

   运行时，在配置好`build.gradle` 和`application.properties` 等环境后，运行`Cs30724SpringProject2Application.java` 即可。注意要根据自己主机的配置来调整设置。

   ```
   .
   └── CS307-24Spring-Project2
       ├── build.gradle
       ├── settings.gradle
       └── src
           ├── main
           │   ├── java
           │   │   └── cs307
           │   │       └── cs30724springproject2
           │   │           ├── Cs30724SpringProject2Application.java
           │   │           ├── controller
           │   │           ├── entity
           │   │           ├── mapper
           │   │           └── service
           │   └── resources
           │       ├── application.properties
           │       ├── mapper (XML files)
           │       └── templates (HTML files)
           └── test
               └── java
                   └── cs307
                       └── cs30724springproject2
                           └── Cs30724SpringProject2ApplicationTests.java
   ```

3. 实现功能

   - 基础任务

     - [x] **API Specification**
       - [x] **Task1 Add, modify, delete a station** 
       - [x] **Task2 Add, modify, delete a new line**
       - [x] **Task3 Place and remove stations at a specified location on a line**
       - [x] **Task4 Search the name of the station that is the n-th station ahead/behind a specific station on a line**
       - [x] **Task5 Boarding functionality for a passenger or card**
       - [x] **Task6 Exit functionality for a passenger or card** 
       - [x] **Task7 View all information about passengers or cards who have boarded but have not yet exited at the current time**


     - [x] **Functional Requirements:**
       - [x] **Web Interface Building**
       - [x] **Preparing testing data: import data in `price.xlsx` and all data from project 1.**

   - 高级任务
     - [x] **Task2 Further enhance the usability of the APIs** 
       - [x] **(2) Business carriage in the subway**
       - [x] **(3) Add and appropriately utilize the condition of stations**
       - [x] **(4)  Establish a system to integrate buses and subways**
       - [x] **(5)  Implement a multi-parameter search for ride records**

     - [x] **Task3 Implement a real back-end server, with the technology of package management,  using HTTP/RESTful Web, connection pools and implementing backend frameworks with ORM mapping**
     - [x] **Task4 Elegant and useful page display design** 
     - [x] **Task5 Appropriately utilize index and view**
     - [x] **Task7 Support high-concurrency with proper pressure tests**

4. 可以改进的部分
   - 由于时间关系没能做完高级部分的所有任务，所以原Project高级部分的所有未完成任务都可以继续完成（如Task1、2、5、6）
   - 部分高级任务的实现有待改进（如Task5）
   - 可以考虑增加功能与提升操作效率：还需要学习Springboot提供的各种功能（如数据库连接池、用户登录功能）



## 项目报告

https://github.com/ShellyLeee/CS307-24S-Project2/blob/main/Project2%20Report.pdf

