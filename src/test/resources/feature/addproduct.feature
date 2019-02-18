#Author: jhvergar@bancolombia.com.co

Feature: Add a product in the cart
  I as a user in the webpage
  I want to add a product in the shopping cart
  To see it added in the cart page

  @addproduct
  Scenario:  Added product successfuly
    Given that the user open the application
    When user search the product iphone
    And user select an iPhone XR
    And user add the product to the shopping cart
    Then user verifies that the iphone is added in the shopping cart page