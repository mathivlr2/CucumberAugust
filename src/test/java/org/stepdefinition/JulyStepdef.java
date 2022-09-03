package org.stepdefinition;



import java.util.List;
import java.util.Map;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class JulyStepdef {
	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition() {
		
		// asList
//	    List<String> asList = table.asList();
//	    System.out.println(asList.get(0));
//	    System.out.println(asList.get(1));
//	    System.out.println(asList.get(2));
//	    System.out.println(asList.get(3));
		
		// asLists
//		List<List<String>> asLists = table.asLists();
		
		// To get the first list
//		System.out.println(asLists.get(0));
		
		// To get the elements in the list
//		System.out.println(asLists.get(0).get(0));
//		System.out.println(asLists.get(0).get(1));
//		System.out.println(asLists.get(0).get(2));
//		
//		System.out.println(asLists.get(1).get(0));
//		System.out.println(asLists.get(1).get(1));
//		System.out.println(asLists.get(1).get(2));
		
		
	}

	@When("I complete action")
	public void i_complete_action(DataTable table) {
		
		// asMap
//		Map<String, String> asMap = table.asMap(String.class, String.class);
//		System.out.println(asMap.get("1"));
//		System.out.println(asMap.get("2"));
//		System.out.println(asMap.get("3"));
//		System.out.println(asMap.get("4"));
		
		// asMaps
//		List<Map<String, String>> asMaps = table.asMaps();		
//		System.out.println(asMaps.get(0));
//		System.out.println(asMaps.get(1));
//		System.out.println(asMaps.get(2));
		
	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
	    
	}
}
