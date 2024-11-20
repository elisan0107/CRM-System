package com.yrgo.services.customers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.yrgo.domain.Call;
import com.yrgo.domain.Customer;

public class CustomerManagementMockImpl implements CustomerManagementService {
	private HashMap<String,Customer> customerMap; // here you save string(?)-what with a new Customer.

	public CustomerManagementMockImpl() { // created Customers inside the constructor is test-data //GPT4
		customerMap = new HashMap<String,Customer>();
		customerMap.put("OB74", new Customer("OB74" ,"Fargo Ltd", "some notes"));
		customerMap.put("NV10", new Customer("NV10" ,"North Ltd", "some other notes"));
		customerMap.put("RM210", new Customer("RM210" ,"River Ltd", "some more notes"));
	}

	// newCustomer (below) - simulates dynamic runtime behavior
	@Override
	public void newCustomer(Customer newCustomer) {
		// Retrieve the customer's ID dynamically using the correct method name
		String customerId = newCustomer.getCustomerId();

		// Store the customer in the map using the ID as the key
		customerMap.put(customerId, newCustomer);
	}
	@Override
	public Customer findCustomerById(String customerId) throws CustomerNotFoundException {
		// Check if the customer exists in the map
		if (customerMap.containsKey(customerId)) {
			return customerMap.get(customerId); // Return the customer if found
		} else {
			// Thrown i exceptiof the customer is not found
			throw new CustomerNotFoundException();
		}
	}



	@Override
	public void updateCustomer(Customer changedCustomer) {
		// create method to update a customers. What?
		// my example might be to: update the companyName or notes of a Customer.
		// Where do you update it?
		// You have to enter the Map and then pick out the specific id of the Customer,
		// then you need to ...
		// How do you change an already created object?
	}

	@Override
	public void deleteCustomer(Customer oldCustomer) {
		// Use the customer's ID to remove it from the map
		String customerId = oldCustomer.getCustomerId();
		customerMap.remove(customerId);
	}

	@Override
	public List<Customer> findCustomersByName(String searchName) {
		// Create a list to store customers with matching names
		List<Customer> matchingCustomers = new ArrayList<>();

		// Loop through all entries in the customerMap
		for (Map.Entry<String, Customer> entry : customerMap.entrySet()) {
			// Retrieve the customer's company name
			String customerName = entry.getValue().getCompanyName();

			// Compare the provided search name with the customer name
			if (searchName.equals(customerName)) {
				matchingCustomers.add(entry.getValue()); // Add matching customer to the list
			}
		}

		// Return the list of matching customers
		return matchingCustomers;
	}


	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer getFullCustomerDetail(String customerId) throws CustomerNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void recordCall(String customerId, Call callDetails) throws CustomerNotFoundException {
		//First find the customer

		//Call the addCall on the customer

	}

}
