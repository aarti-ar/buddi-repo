Feature: Buddi Homepage

  Scenario: To check that user able to click on Login tab from the home page
    Given user is on the buddi home page and verify the title "Buddi Limited | Buddi: Personal Alarm Services For The Elderly"
    When   user click on the Login tab on the homepage
    Then  user should navigate to the Login Page
