Feature: Validate currency

  Scenario Outline: validate subscriber STC in Emirates
    Given website is opened and user need it to be in language "<preferredLanguage>"
    When user click on country icon on sunscriber STC screen
    When choose Country Bahrain
    And wait for page to load
    Then "<type1>" with price "<price1>" and "<type2>" with price "<price2>" and "<type3>" with price "<price3>"


    Examples:
      | preferredLanguage | type1 | type2     | type3   | price1      | price2      | price3      |
      | en                | LITE  | CLASSIC  | PREMIUM | 2 BHD/month | 3 BHD/month | 6 BHD/month |
      | ar                | لايت  | الأساسية | بريميوم | 2 BHD/month | 3 BHD/month | 6 BHD/month |

  Scenario Outline: validate subscriber STC in Emirates
    Given website is opened and user need it to be in language "<preferredLanguage>"
    When user click on country icon on sunscriber STC screen
    When choose Country Saudia Arabia
    And wait for page to load
    Then "<type1>" with price "<price1>" and "<type2>" with price "<price2>" and "<type3>" with price "<price3>"


    Examples:
      | preferredLanguage | type1 | type2     | type3   | price1       | price2       | price3       |
      | en                | LITE  | CLASSIC  | PREMIUM | 15 SAR/month | 25 SAR/month | 60 SAR/month |
      | ar                | لايت  | الأساسية | بريميوم | 15 SAR/month | 25 SAR/month | 60 SAR/month |

  Scenario Outline: validate subscriber STC in Emirates
    Given website is opened and user need it to be in language "<preferredLanguage>"
    When user click on country icon on sunscriber STC screen
    When choose Country Kuwait Arabia
    And wait for page to load
    Then "<type1>" with price "<price1>" and "<type2>" with price "<price2>" and "<type3>" with price "<price3>"



    Examples:
      | preferredLanguage | typ1 | type2    | type3   | price1        | price2        | price3        |
      | en                | LITE | CLASSIC  | PREMIUM | 1.2 KWD/month | 2.5 KWD/month | 4.8 KWD/month |
      | ar                | لايت | الأساسية | بريميوم | 1.2 KWD/month | 2.5 KWD/month | 4.8 KWD/month |


