Feature: free CRM login feature

# Without Examples Keyword
#Scenario: free CRM login Test Case

#Given user is already on login page
#When title of login page is Free CRM
#Then user enters "ravi.aluvala4a3@gmail.com"
#And user enters "Amma@143"
#And user clicks on login button
#Then user is on home page

# Without Examples Keyword
@login
Scenario Outline: free CRM login Test Case with valid credentials

Given user is already on login page
When user enters username as "<username>"
And user enters password as "<password>"
And user clicks on login button
Then user is on home page

Examples:

| username | password |
| ravi.aluvala4a3@gmail.com | Amma@143 |


# Without Examples Keyword
@login
Scenario Outline: free CRM login Test Case with invalid credentials

Given user is already on login page
When user enters username as "<username>"
And user enters password as "<password>"
And user clicks on login button
Then verify invalid credential message is "Invalid login"

Examples:

| username | password |
| raviautomationworld@gmail.com | Amma@143 |