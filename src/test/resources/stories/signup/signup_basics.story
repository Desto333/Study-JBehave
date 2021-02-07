Narrative:
This story covers basic tests of signup

Lifecycle:
Before:
Given I open signup page

Scenario: Type invalid year
Meta: @skip
When I close cookies warning
And I set month "<month>"
And I set day "<day>"
And I set year "<year>"
And I check share
And I press signup button
Then I see error "Enter a valid year."
And I do not see error "Select your birth month."
And Errors quantity on the page should be "7"
Examples:
|month|day|year|
|August|10|85|
|May|3|86|
|October|22|01|

Scenario: Confirm invalid email
Meta: @skip
When I close cookies warning
And I type email "test@mail.test"
And I type confirmation email "wrong@mail.test"
And I type name "TestName"
And I set gender "Male"
And I press signup button
Then Errors quantity on the page should be "6"
And I see error "The email addresses don't match."
And I see error "Error does not exist."

Scenario: Sign up with empty password
When I close cookies warning
And I type email "test@mail.test"
And I type confirmation email "test@mail.test"
And I type name "TestName"
And I press signup button
Then Errors quantity on the page should be "6"
And I see error "You need to enter a password."

Scenario: Type invalid values
When I close cookies warning
And I type email "test@mail.test"
And I type confirmation email "wrong@mail.test"
And I type password ""
And I type name ""
And I set day ""
And I set year ""
And I check share
And I press signup button
Then Errors quantity on the page should be "8"
And I see "8" error has text "Confirm you're not a robot."