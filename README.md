Spring -Assignment 2

Introduction
You will continue with the CRM System project. In this project we have now two services:
CustomerManagementService and
DiaryManagementService

Both of them work independently:

The CustomerManagementService only deals with the customers.
And the DiaryManagementService only records action.

This assignment is dealing with a new feature: When we record a call, there are two steps that we should do:
We have to update the customerManagementService with the details of the new call. There is a method in this class, recordCall() but it just records that a customer called.
There is more information that should be stored and also there are details of any action as the result of the call should be stored. And these details are not in CustomerManagementService.
They are stored in DiaryManagementService.

**We have to update the diaryService with any action from that call.**

Do exactly the same way that we did in our Bookstore project **(the workshop?)**
Task1. 

There is a third interface in the service package which is called CallHandlingService.
This interface has a method called recordCall .

**CallHandlingService -> recordCall -> diaryManagementService -> recordAction**
**Task 1**: Write a class CallHandlingServiceImpl which implements CallHandlingService interface. The implementation of the recordCall method can have 2 steps: 
- [ ] Step 1: The recordCall method will call the customerManagementService and the method recordCall in this service.
- [ ] Step 2: Then it can call the diaryManagementService and its recordAction method.
- [ ] Implement all the methods or the ones that you are using in this assignment in DiaryManagementServiceMockImpl)

So in this way customerManagementService and diaryManagementService are not tied together directly but they become dependencies of the call handling service.

**Task 2**:
- [ ] Do the necessary changes in the application.xml file:
- [ ] Make a bean for the callService
- [ ] Use constructor property for this bean

**Task 3**
- [ ] Run your SimpleClient class which is your client (you can download from here or write your own client code) and see if your code works.

- [ ] Submission
Send a link to your github repository that includes this assignment.
