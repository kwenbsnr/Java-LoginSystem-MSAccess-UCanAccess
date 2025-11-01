# 🖥️ Java Login System Using MS Access

This project is a simple **Java-based login system** that connects to a **Microsoft Access database** using the **UCanAccess JDBC driver**.  
It allows users to log in using stored credentials (`Username` and `Password`) from an Access `.accdb` file.

---


## 📁 Project Structure

```
LoginApp/
│
├─ .vscode/
│  ├─ launch.json
│  └─ settings.json
│
├─ src/
│  ├─ LoginApp.java
│
├─ UCanAccess-5.0.1.bin/
│  │
│  ├─ lib/
│  │  ├─ commons-lang3-3.8.1.jar
│  │  ├─ commons-logging-1.2.jar
│  │  ├─ hsqldb-2.5.0.jar
│  │  └─ jackcess-3.0.1.jar
│  │
│  ├─ licenses/
│  │  ├─ apache-license-2.0.txt
│  │  ├─ hsqldb_lic.txt
│  │  ├─ hypersonic_lic.txt
│  │  ├─ lgpl-2.1.txt
│  │  └─ licenses.txt
│  │
│  ├─ loader/
│  │  └─ ucanload.jar
│  │
│  ├─ console.bat
│  ├─ console.sh
│  ├─ copyright.txt
│  ├─ ucanaccess-5.0.1.jar
│  └─ version.txt
│
└─ LoginDB.accdb
```

## ▶️ How to Compile and Run (Manual Way)

Step 1: Open Terminal
Navigate to the src folder:
  cd "C:\Users\USER\Documents\EVENT DRIVEN SOURCE CODES\LoginApp\src"

Step 2: Compile
  ``javac -cp "../UCanAccess-5.0.1.bin/ucanaccess-5.0.1.jar;../UCanAccess-5.0.1.bin/lib/*" LoginApp.java``

Step 3: Run
  `java -cp "../UCanAccess-5.0.1.bin/ucanaccess-5.0.1.jar;../UCanAccess-5.0.1.bin/lib/*;." LoginApp`


## 🗃️ Database Information

Database name: LoginDB.accdb

Table name: Users

**ID	  Username	  Password**

1	    admin	      admin123

2	    student	    pass123


## 🧩 Notes

• If you move this project folder, update the dbURL path in your Java file.

• Do not delete or move the UCanAccess-5.0.1.bin folder.

• If you want to add more users, open LoginDB.accdb in MS Access and insert new records into the Users table.


Language: Java

Database: Microsoft Access

Driver: UCanAccess 5.0.1






