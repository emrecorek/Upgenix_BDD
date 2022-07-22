@UPGNX-434
Feature: As a Posmanager, I should be able to create and to see my meetings and events on my calendar from "Calendar" module


  Background: Login successfully
    When user goes to the login page
    And user enters correct credentials
      | username | posmanager15@info.com |
      | password | posmanager            |
    And user login successfully
    Then user clicks calendar



  Scenario: User first lands on weekly display

    When user clicks calendar

  @wip
  Scenario: User can change display between Day-Week-Month
    Given user on the calendar page
    When user clicks on the day section
    And user sees daily display
    And user clicks on the month section
    And user sees monthly display
    And user clicks on the week section
    Then user sees weekly display



  Scenario: User can create event by clicking on time box on daily display
    Given user on the calendar page
    When user click on any time box
    And user sees little create box
    And user writes the summary of the event in the inbox
    Then user clicks on the create button and sees event




  Scenario: User can edit a created event
    Given user on the calendar page
    When user clicks on the created event
    And user sees event in the opening box
    And user clicks the edit button
    And user sees edit box
    And user writes new summary in the meeting subject inbox "Business Meeting"
    And user clicks the save button
    Then user sees the edited event name "Business Meeting"
