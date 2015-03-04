Random readnig list project readme file:

About:

The project "RandomReadingList" is "lightweight" java desktop application. It stores location of user's favorite e-books in mysql database, and opens one random e-book whenever the user wants to read one.

Project Architecture:

The project "RandomReadingList" follows the MVC architecture. Mysql database system is used in the backend to store data. The hibernate framework is used to persist data between the database and the java model classes. 

NB: you can use any database system other than Mysql as long as you specify the correct dialect and other properties of the database to access 		it. configure "hibernate.cfg.xml" file located @ the default package of the application to suit with your needs. I will assume you are using
    mysql with the following properties:
    	1- Database name - RandomReadingList
    	2- username - root
    	3- password - abc123
 + a table named "BookList" in the Database specified above: sql script to generate create this table is attached with this readme file


=================================================================================================================================
The MVC design:

Model classes (located @package - com.randombook.model):
	RandomBook.java :
					- this is the main model class that talks with the mysql database, and its data is persisted with its corresponding database table using the Hibernate framework. This class is modeled in the database using "BookList" table. 
					- the attributes:
						 private int id - id of e-book
						 private String name - name of e-book
						 private String location - location of e-book

						 +getters() and setters() metheds to retrieve/store data about e-book on database
	HowManyBook.java :
	 			     - retrievs/updates the number of e-books currently saved to the database
	 			     - the current number of books in database is saved to local file named "howManyBooks.txt" instead of the database itself ,,,
	 			            just design decision
           			 - the file "howManyBooks.txt" should be present @ the top heirachy of the preject directory. It initialy holds the value 0 
           			   i.e currently no favorite book is added to database. 
Controller classes (located @ package - com.randombook.controller):
	AddController.java:
		controller/helper class to add user's favorite e-book to database

	GenerateController.java:
	  	controller/helper class to generate one random e-book from user's favorite e-book which are saved to database using the application
	Handler.java:
	    controller/helper class to listen user's button clicks 	  	

View class (located @package - com.randombook.gui):
	RandomReadGUI.java:
	   	    		   Extends the javax.swing	,JFrame class, to hold the UI components
=================================================================================================================================
Package - com.randomreadinglist.main
	  Entry point for the application - main() method is @ Main.java class of this package

Configuration:
	Since this application uses the Hibernate framework to persist data between the java model classes and Mysql database, setting mysql databse and configuring "hibernate.cfg.xml" in the default package is necessary.  

	    		    

Auther: 
		Kibrom Gebre
		E-mail: kibromgebre98@yahoo.com


	  	