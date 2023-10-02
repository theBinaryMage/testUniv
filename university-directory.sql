CREATE DATABASE  IF NOT EXISTS `university_directory`;
USE `university_directory`;

--
-- Table structure for table `professor`
--

DROP TABLE IF EXISTS `professor`;   

CREATE TABLE `professor` (
  `id` int NOT NULL AUTO_INCREMENT,
  `prof_name` varchar(45) DEFAULT NULL,
  `department` varchar(45) DEFAULT NULL,
  
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1; 


INSERT INTO `professor` VALUES 
	(1,'Prabhat Kumar','CSE'),
	(2,'Ravi Nandan','ECE'),
	(3,'Ishan Gupta','MECH'),
	(4,'Ramesh Babu','CIVIL'),
	(5,'Kishor Awasthi','EE');
    
--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;

CREATE TABLE `student` (
  `id` int NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `branch` varchar(45) DEFAULT NULL,
   PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;


    
    

--
-- Table structure for table `department`
--

DROP TABLE IF EXISTS `department`;   

CREATE TABLE `department` (
  `id` int NOT NULL AUTO_INCREMENT,
  `dept_name` varchar(45) DEFAULT NULL,
  `HOD` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1; 

INSERT INTO `department` VALUES 
	(1,'CSE','Prabhat Kumar'),
	(2,'ECE','Ramesh Gupta'),
	(3,'MECH','Ishan Gupta'),
	(4,'CIVIL','Ramesh Babu'),
	(5,'EE','KishorAwasthi');
    
    
    --
-- Data for table `student`
--

INSERT INTO `student` VALUES 
	(1,'Leslie','Andrews','CSE'),
	(2,'Emma','Baumgarten','ECE'),
	(3,'Avani','Gupta','MECH'),
	(4,'Yuri','Petrov','CIVIL'),
	(5,'Juan','Vega','CSE');
        
    
    

