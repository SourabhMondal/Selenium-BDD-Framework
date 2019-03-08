Feature: this feature is about git verison control applicationn
  In addition, it will also validate the home page of git-scm

  Scenario Outline: to verify the git verison control application
    Given user open github application
    Then github home page loaded successfully
    When user click on "<Link1>" - link
    Then "<Link1>" page loaded successfully
    And user go back to github home
    When user click on "<Link2>" - link
    Then "<Link2>" page loaded successfully
    When user go back to github home
    Then github home page loaded successfully

    Examples: 
      | Link1 | Link2     |
      | About | Community |
