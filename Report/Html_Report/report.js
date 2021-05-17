$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Hotel Booking In Adactin Application",
  "description": "",
  "id": "hotel-booking-in-adactin-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Loggin In",
  "description": "",
  "id": "hotel-booking-in-adactin-application;loggin-in",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@smokeTest"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user Enter The \"\u003cusername\u003e\" In Username Field",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"\u003cpassword\u003e\" In Password Field",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user Click On The Login Button And Navigates To Search_Hotel Page",
  "keyword": "Then "
});
formatter.examples({
  "line": 8,
  "name": "",
  "description": "",
  "id": "hotel-booking-in-adactin-application;loggin-in;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 9,
      "id": "hotel-booking-in-adactin-application;loggin-in;;1"
    },
    {
      "cells": [
        "AAA",
        "123"
      ],
      "line": 10,
      "id": "hotel-booking-in-adactin-application;loggin-in;;2"
    },
    {
      "cells": [
        "NNN",
        "245"
      ],
      "line": 11,
      "id": "hotel-booking-in-adactin-application;loggin-in;;3"
    },
    {
      "cells": [
        "Priyanka12",
        "Prinku@2020"
      ],
      "line": 12,
      "id": "hotel-booking-in-adactin-application;loggin-in;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 10,
  "name": "Loggin In",
  "description": "",
  "id": "hotel-booking-in-adactin-application;loggin-in;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@smokeTest"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user Enter The \"AAA\" In Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"123\" In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user Click On The Login Button And Navigates To Search_Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Launch_The_Application()"
});
formatter.result({
  "duration": 7330093400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "AAA",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_Username_Field(String)"
});
formatter.result({
  "duration": 174110200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_Password_Field(String)"
});
formatter.result({
  "duration": 74367300,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Login_Button_And_Navigates_To_Search_Hotel_Page()"
});
formatter.result({
  "duration": 2543999600,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Loggin In",
  "description": "",
  "id": "hotel-booking-in-adactin-application;loggin-in;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@smokeTest"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user Enter The \"NNN\" In Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"245\" In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user Click On The Login Button And Navigates To Search_Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Launch_The_Application()"
});
formatter.result({
  "duration": 271168500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "NNN",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_Username_Field(String)"
});
formatter.result({
  "duration": 120936700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "245",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_Password_Field(String)"
});
formatter.result({
  "duration": 67397400,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Login_Button_And_Navigates_To_Search_Hotel_Page()"
});
formatter.result({
  "duration": 2341749100,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Loggin In",
  "description": "",
  "id": "hotel-booking-in-adactin-application;loggin-in;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@smokeTest"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user Enter The \"Priyanka12\" In Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"Prinku@2020\" In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user Click On The Login Button And Navigates To Search_Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Launch_The_Application()"
});
formatter.result({
  "duration": 267697400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Priyanka12",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_Username_Field(String)"
});
formatter.result({
  "duration": 123889800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Prinku@2020",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_Password_Field(String)"
});
formatter.result({
  "duration": 81110700,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Login_Button_And_Navigates_To_Search_Hotel_Page()"
});
formatter.result({
  "duration": 3915230300,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "",
  "description": "",
  "id": "hotel-booking-in-adactin-application;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 14,
      "name": "@sanityTest"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "user Select The Location In Location Field",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "user Select The Hotel In Hotels Field",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "user Select The Room Type In Room Type Field",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "user Select The Number Of Rooms In Number Of Rooms Field",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "user Enter The Check In Date In Check In Date Field",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "user Enter The Check Out Date In Check Out Date Field",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "user Select The Adults Per Room In Adults Per Room Field",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "user Select The Children Per Room In Children Per Room",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "user Click On Search Button And Navigates To Select_Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Location_In_Location_Field()"
});
formatter.result({
  "duration": 821347300,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Hotel_In_Hotels_Field()"
});
formatter.result({
  "duration": 229657900,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Room_Type_In_Room_Type_Field()"
});
formatter.result({
  "duration": 132288700,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Number_Of_Rooms_In_Number_Of_Rooms_Field()"
});
formatter.result({
  "duration": 195074200,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Check_In_Date_In_Check_In_Date_Field()"
});
formatter.result({
  "duration": 76442800,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Check_Out_Date_In_Check_Out_Date_Field()"
});
formatter.result({
  "duration": 109182200,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Adults_Per_Room_In_Adults_Per_Room_Field()"
});
formatter.result({
  "duration": 191179800,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Children_Per_Room_In_Children_Per_Room()"
});
formatter.result({
  "duration": 160745700,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_Search_Button_And_Navigates_To_Select_Hotel_Page()"
});
formatter.result({
  "duration": 3321009800,
  "status": "passed"
});
formatter.scenario({
  "line": 26,
  "name": "",
  "description": "",
  "id": "hotel-booking-in-adactin-application;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 25,
      "name": "@sanityTest"
    }
  ]
});
formatter.step({
  "line": 27,
  "name": "user Click On Select Button In Select Field",
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "user Click On Continue Button And Navigates To Book_Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Click_On_Select_Button_In_Select_Field()"
});
formatter.result({
  "duration": 86054600,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_Continue_Button_And_Navigates_To_Book_Hotel_Page()"
});
formatter.result({
  "duration": 5610435500,
  "status": "passed"
});
formatter.scenario({
  "line": 30,
  "name": "",
  "description": "",
  "id": "hotel-booking-in-adactin-application;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 29,
      "name": "@sanityTest"
    }
  ]
});
formatter.step({
  "line": 31,
  "name": "user Enter The First Name In First Name Field",
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": "user Enter The Last Name In Last Name Field",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "user Enter The Billing Address In Billing Address Field",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "user Enter The Credit Card No In Credit Card No Field",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "user Select The Credit Card Type In Credit Card Type Field",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "user Select The Month In Month Field",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "user Select The Year In Year Field",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "user Enter The CVV Number In CVV Number Field",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "user Click On Book Now Button And Navigates To Booking_Confirmation Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_First_Name_In_First_Name_Field()"
});
formatter.result({
  "duration": 348685700,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Last_Name_In_Last_Name_Field()"
});
formatter.result({
  "duration": 96821600,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Billing_Address_In_Billing_Address_Field()"
});
formatter.result({
  "duration": 115769600,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Credit_Card_No_In_Credit_Card_No_Field()"
});
formatter.result({
  "duration": 94243300,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Credit_Card_Type_In_Credit_Card_Type_Field()"
});
formatter.result({
  "duration": 178190600,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Month_In_Month_Field()"
});
formatter.result({
  "duration": 190476600,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Year_In_Year_Field()"
});
formatter.result({
  "duration": 143057500,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_CVV_Number_In_CVV_Number_Field()"
});
formatter.result({
  "duration": 82065800,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_Book_Now_Button_And_Navigates_To_Booking_Confirmation_Page()"
});
formatter.result({
  "duration": 5056587800,
  "status": "passed"
});
});