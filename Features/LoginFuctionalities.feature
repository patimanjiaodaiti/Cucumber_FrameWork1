# We use cucumber features to write gercins cz it organize the feature file
  @Regression @User1
Feature: Testing Login functions

  Background:

@Smoke
  Scenario Outline:Testing gmail Logins
    Given go to "https://www.gmail.com" website
    And User Enters '<UserName>' and '<PassWord>'
    Then title should contain 'patimaa'

    #single and double coats make it past primitive
    #'' || "" means hides the data to be visible and implements as string
    # '<>' => this is how we connect primitives to data table

    #JDBC:allows to java application get access to data base

    Examples:
      | UserName             | PassWord   |
      | patima0218@gmail.com | huhdjhdj   |
      | patima0218@gmail.com | jhddj      |
      | patima0218@gmail.om  | rabbemalla |