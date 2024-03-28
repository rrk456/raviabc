Feature: Facebook Login functionality

Scenario: verifying the Login functionality with valid credentilas

Given I visit the facebook website as a guest user
When I enter valid email  and password into the fields
And  click on Login button
Then User should able to see the Facebook Homepage
 