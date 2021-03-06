CREATE TABLE `EMPLOYEE` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `LAST_NAME` varchar(15) DEFAULT NULL,
  `EMAIL` varchar(30) DEFAULT NULL,
  `BIRTH` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `CREATE_TIME` timestamp NULL DEFAULT NULL,
  `DEPT_ID` int DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


CREATE TABLE `DEPARTMENT` (
  `ID` int NOT NULL,
  `DEPAARTMENT_NAME` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
