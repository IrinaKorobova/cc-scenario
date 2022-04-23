Feature: search bar
  Scenario: product search
    Given url of NL 'https://www.nlstar.com/ru/'
    When open online store
    Then website is open start search 'UP2U'
  Scenario: search for non-existent products
    Given  url of NL 'https://www.nlstar.com/ru/'
    When open online store
    Then website is open start search 'U2'
    And assert that user got message 'Простите, по вашему запросу ничего не найдено.'





