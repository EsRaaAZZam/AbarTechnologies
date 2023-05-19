Feature: Validate currency

  Scenario Outline: validate subscriber STC in Emirates
    Given website is opened and user need it to be in language "<preferredLanguage>"
    When user click on country icon on sunscriber STC screen
    When choose Country Bahrain


    Examples:
    preferredLanguage |
      | en |
      | ar |

  Scenario Outline: validate subscriber STC in Emirates
    Given website is opened and user need it to be in language "<preferredLanguage>"
    When user click on country icon on sunscriber STC screen
    When choose Country Saudia Arabia


    Examples:
      | preferredLanguage |
      | en                |
      | ar                |


  Scenario Outline: validate subscriber STC in Emirates
    Given website is opened and user need it to be in language "<preferredLanguage>"
    When user click on country icon on sunscriber STC screen
    When choose Country Kuwait Arabia


    Examples:
      | preferredLanguage |
      | en                |
      | ar                |


