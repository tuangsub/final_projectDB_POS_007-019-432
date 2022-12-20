# final_projectDB_POS_007-019-432
1 ติดตั้งโปรแกรม  VSCode และ MySQL

2 โหลดโปรแกรมเสริมใน VSCode ได้แก่
	2.1 Java Extension Pack
	2.2 HTML CSS Support
	2.3 JavaScript (ES6) code snippets
	2.4 SQLTools MySQL/MariaDB
	2.5 Spring Boot Tools
	
3 เชื่อม VSCode กับ MySQL 

4 โหลดไฟล์ DatabaseProject รัน บรรทัดที่ 1และ 2

5 สร้าง Schemas ใน MySQL ชื่อ Pos

6 โหลด Folder โปรเจค ชื่อ Pos

7 แก้ไขไฟล์ application.properties ให้ localhost ,username , password ตรงกับฐานข้อมูลใน MySQL ของเครื่อง
    spring.datasource.url=jdbc:mysql://localhost:3306/menu
    spring.datasource.username=root
    spring.datasource.password=root (Tuangsubrattanathai ของผู้จัดทำ)

8 รันไฟล์ App

9 เปิดโปรแกรมเว็บเบราเซอร์ (Web Browser) ที่ใช้สำหรับเปิดเว็บไซต์ เช่น chrome, Microsoft edge เป็นต้น

10 ใส่ Port :  http://localhost:8080/menu
