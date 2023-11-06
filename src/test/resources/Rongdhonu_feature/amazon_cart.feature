
Feature: Amazon cart feature


@Cart
Scenario: Verify Ronguser can add item in cart

Given Launch <"url"> pro
Then Type Toys on search field and click icon
Then Scrolldown and Checked on lego box
Then Click on Lego city toy 
Then Click on add to cart
Then  Verify Ronguser can add item in cart














