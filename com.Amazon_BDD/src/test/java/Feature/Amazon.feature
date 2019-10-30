@Smoke
Feature: Amazon product information validation

Scenario: Successful obtainment of product information

Given User able to open browser
And Login with valid credential
Then Validate amazon home page
And Search iphone
Then Sort iphone High to Low price 
Then Find all iphone and total iphone number (model x) in 1st page
Then Find out total page number of iphone
Then Sort iphone Low to High price
And Find out highest and lowest price iphone X
And Add one iphone in cart
And Search HP laptop
Then Sort laptop High to Low price
Then Find all laptop and total number display in page one
Then Find out total page number of laptop
Then Sort laptop Low to High price
Then Find out highest and lowest price HP laptop
And Add one laptop in cart
And Provide invalide payment information
Then Validate payment failure
And Close the browser
