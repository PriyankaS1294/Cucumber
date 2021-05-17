Feature: Hotel Booking In Adactin Application
@smokeTest
Scenario Outline: Loggin In
Given user Launch The Application
When user Enter The "<username>" In Username Field
And user Enter The "<password>" In Password Field
Then user Click On The Login Button And Navigates To Search_Hotel Page
Examples:
           |username|password|
           |AAA|123|
           |NNN|245|
           |Priyanka12|Prinku@2020|

@sanityTest
Scenario:
When user Select The Location In Location Field
And user Select The Hotel In Hotels Field
And user Select The Room Type In Room Type Field
And user Select The Number Of Rooms In Number Of Rooms Field
And user Enter The Check In Date In Check In Date Field
And user Enter The Check Out Date In Check Out Date Field
And user Select The Adults Per Room In Adults Per Room Field
And user Select The Children Per Room In Children Per Room
Then user Click On Search Button And Navigates To Select_Hotel Page
@sanityTest
Scenario:
When user Click On Select Button In Select Field
Then user Click On Continue Button And Navigates To Book_Hotel Page
@sanityTest
Scenario:
When user Enter The First Name In First Name Field
And user Enter The Last Name In Last Name Field
And user Enter The Billing Address In Billing Address Field
And user Enter The Credit Card No In Credit Card No Field
And user Select The Credit Card Type In Credit Card Type Field
And user Select The Month In Month Field
And user Select The Year In Year Field
And user Enter The CVV Number In CVV Number Field
Then user Click On Book Now Button And Navigates To Booking_Confirmation Page
@regressionTest
Scenario:
Then user Click On Logout Button