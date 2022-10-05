@Login
Feature: Login
  As a user, I want to login in Swag Labs web.

  @LGI001
  Scenario: LGI001 - User want to login without input username and password
    Then User click on LOGIN button

  @LGI002
  Scenario: LGI002 - User want to login only input registered username
    Then User input registered username only "standard_user"
    Then User click on LOGIN button

  @LGI003
  Scenario: LGI003 - User want to login only input registered password
    Then User input registered password only "secret_sauce"
    Then User click on LOGIN button

  @LGI004
  Scenario: LGI004 - User want to login using incorrect credential
    Then User input incorrect username "xxxxxxxx"
    Then User input incorrect password "xxxxxxxx"
    Then User click on LOGIN button

  @LGI005
  Scenario: LGI005 - User want to login using correct credential
    Then User input registered username "standard_user"
    Then User input registered password "secret_sauce"
    Then User click on LOGIN button