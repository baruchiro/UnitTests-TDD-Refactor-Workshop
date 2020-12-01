package com.gildedrose.gildedroseStepDefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

import java.util.*;

import com.gildedrose.*;

public class StepDefinitions {

    ArrayList<Item> items = new ArrayList<Item>();

    @Given("I add an item {string} with quality {int} and sellIn {int}")
    public void i_add_an_item_with_quality_and_sell_in(String itemType, Integer quality, Integer sellIn) {
        items.add(new Item(itemType, quality, sellIn));
    }

    @Then("I have {int} item")
    public void i_have_item(Integer int1) {
        assertEquals(1,items.size());
    }

}
