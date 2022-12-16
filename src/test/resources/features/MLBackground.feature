
  Feature: Add product to cart

    Background:

      Given I am on the website of https://www.mercadolibre.com.co/

      Scenario Outline: <Scenario>

        When I choose a product

        Then Validate the interface add cart and return to home page


        Examples:

          | scenario                                  | url                              |
          | Choose a producer and add to cart         | https://www.mercadolibre.com.co/ |