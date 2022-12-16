
  Feature: Select and validate

    Background:

      Given Me encuentro en la pagina de https://www.mercadolibre.com.co/

      Scenario Outline: <Select and validate>

        When Reload the page and validate the logo on the page.

        And  I choose a product I save its name

        Then Valid if the product is the same

        Examples:
          | validation name            |
          | validates the product name |