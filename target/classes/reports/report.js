$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Adactin.feature");
formatter.feature({
  "line": 2,
  "name": "Login functionality for Adactin web application",
  "description": "Contains 2 test scenario with login details",
  "id": "login-functionality-for-adactin-web-application",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@TC"
    }
  ]
});
formatter.background({
  "line": 5,
  "name": "User launch the browser",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "User should launch the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User hold for \u00273\u0027 seconds",
  "keyword": "And "
});
formatter.match({
  "location": "AdactinStepDefinition.user_should_launch_the_browser()"
});
formatter.result({
  "duration": 3887429486,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 15
    }
  ],
  "location": "AdactinStepDefinition.user_hold_for_seconds(int)"
});
formatter.result({
  "duration": 3001557729,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "User verify for valid login credentials",
  "description": "",
  "id": "login-functionality-for-adactin-web-application;user-verify-for-valid-login-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@TC1"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "User should verify the Welcome to AdactIn Group of Hotels is displayed in the login page",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "User enters the username in the login page",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "User enters the password in the login page",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User clicks the Login button in the login page",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User hold for \u00273\u0027 seconds",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User clicks the Logout button in home page",
  "keyword": "And "
});
formatter.match({
  "location": "AdactinStepDefinition.user_should_verify_the_Welcome_to_AdactIn_Group_of_Hotels_is_displayed_in_the_login_page()"
});
formatter.result({
  "duration": 187031382,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefinition.user_enters_the_username_in_the_login_page()"
});
formatter.result({
  "duration": 302174539,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefinition.user_enters_the_password_in_the_login_page()"
});
formatter.result({
  "duration": 242628837,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefinition.user_clicks_the_Login_button_in_the_login_page()"
});
formatter.result({
  "duration": 7428915133,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 15
    }
  ],
  "location": "AdactinStepDefinition.user_hold_for_seconds(int)"
});
formatter.result({
  "duration": 2999855802,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefinition.user_clicks_the_Logout_button_in_home_page()"
});
formatter.result({
  "duration": 1237453131,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "User launch the browser",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "User should launch the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User hold for \u00273\u0027 seconds",
  "keyword": "And "
});
formatter.match({
  "location": "AdactinStepDefinition.user_should_launch_the_browser()"
});
formatter.result({
  "duration": 1027107962,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 15
    }
  ],
  "location": "AdactinStepDefinition.user_hold_for_seconds(int)"
});
formatter.result({
  "duration": 3000443655,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "User to verify whether the check-out date field accepts a later date than checkin date",
  "description": "",
  "id": "login-functionality-for-adactin-web-application;user-to-verify-whether-the-check-out-date-field-accepts-a-later-date-than-checkin-date",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 18,
      "name": "@TC2"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "User should verify the Welcome to AdactIn Group of Hotels is displayed in the login page",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "User enters the username in the login page",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "User enters the password in the login page",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "User clicks the Login button in the login page",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "User hold for \u00273\u0027 seconds",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "User select the location using drop down",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "User select the hotel using drop down",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "User select the room type using drop down",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "User select the no of rooms using drop down",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "User enter the check-in date",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "User enter the check-out date",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "User select the adult per room using drop down",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "User select the children per room using drop down",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "User clicks the search button",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "User should verify the error message is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "User waits for \u00273\u0027 seconds",
  "keyword": "When "
});
formatter.step({
  "line": 36,
  "name": "User clicks the Logout button in home page",
  "keyword": "And "
});
formatter.match({
  "location": "AdactinStepDefinition.user_should_verify_the_Welcome_to_AdactIn_Group_of_Hotels_is_displayed_in_the_login_page()"
});
formatter.result({
  "duration": 124985729,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefinition.user_enters_the_username_in_the_login_page()"
});
formatter.result({
  "duration": 259614522,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefinition.user_enters_the_password_in_the_login_page()"
});
formatter.result({
  "duration": 248368295,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefinition.user_clicks_the_Login_button_in_the_login_page()"
});
formatter.result({
  "duration": 1483763154,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 15
    }
  ],
  "location": "AdactinStepDefinition.user_hold_for_seconds(int)"
});
formatter.result({
  "duration": 2999401877,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefinition.user_select_the_location_using_drop_down()"
});
formatter.result({
  "duration": 420153449,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefinition.user_select_the_hotel_using_drop_down()"
});
formatter.result({
  "duration": 393470180,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefinition.user_select_the_room_type_using_drop_down()"
});
formatter.result({
  "duration": 398597688,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefinition.user_select_the_no_of_rooms_using_drop_down()"
});
formatter.result({
  "duration": 225939447,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefinition.user_enter_the_check_in_date()"
});
formatter.result({
  "duration": 274482677,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefinition.user_enter_the_check_out_date()"
});
formatter.result({
  "duration": 264339067,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefinition.user_select_the_adult_per_room_using_drop_down()"
});
formatter.result({
  "duration": 340172381,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefinition.user_select_the_children_per_room_using_drop_down()"
});
formatter.result({
  "duration": 386520252,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefinition.user_clicks_the_search_button()"
});
formatter.result({
  "duration": 130340397,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefinition.user_should_verify_the_error_message_is_displayed()"
});
formatter.result({
  "duration": 97240137,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 16
    }
  ],
  "location": "AdactinStepDefinition.user_waits_for_seconds(int)"
});
formatter.result({
  "duration": 3000768000,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefinition.user_clicks_the_Logout_button_in_home_page()"
});
formatter.result({
  "duration": 2252724248,
  "status": "passed"
});
});