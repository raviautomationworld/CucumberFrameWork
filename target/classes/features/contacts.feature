Feature: Free CRM Contacts functionality

@contacts
Scenario: Verify Contacts with mandatory fields

	Given user logged into free CRM application with loggeduser
	|username|password|loggeduser|
	|ravi.aluvala4a3@gmail.com|Amma@143|Ravi Aluvala|
	When user click on contacts and new
	Then enter contact details
	|firstname|lastname|
	|firstname1|lastname1|
	|firstname2|lastname2|
	|firstname3|lastname3|