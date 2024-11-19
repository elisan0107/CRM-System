**Spring Framework
Assignment-1**


We want to write a system that stores details about all the customers and everytime we get a new customer, we record their details. 

- [ ] everytime we get a new customer, we record their details


- [ ] everytime a customer calls the company, we should be able to record the details of the customer's call (TIME:DATE:NAME:ORIGIN, example: 10.30 15 November Jim from HB).


- [ ] System must be able to manage a diary for all the users of the system (like email alerts(?))


- [ ] Each customer can make many calls


- [ ] Each call is owned by a single customer



**Task 1**
- [ ] Complete and implement all the methods in the mock implementation of interface CustomerManagement with the name: CustomerManagementMockImpl


**Task 2**
- [ ] Configure the mock implementation of the interface in the applicaton.xml file using <beans> tag (You have a file application.xml in the src which is empty. If you make a maven project, move this file to resources under the main folder)


**Task 3**
- [ ] Write a class called SimpleClient in the client package that gets the service beans and tests their functionality
    - [ ] First create a container type  ClassPathXmlApplicationContext which accepts application.xml as an argument
    - [ ] Then create an object type CustomerManagementService with the help of the container (xml file)
    - [ ] Make a list of the customers and print them all.


