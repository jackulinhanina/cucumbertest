Feature: To validate the the login functionality of flipkart application
Scenario: To validate the  login functionality of flipkart application
Given  To launch browserand maximise the window
When   To launch the url of flipkart application
And    To pass the valid username in email field
Then   To close the entire browser



Scenario Outline: user can pass the login functionality of flipkart aplication
Given  user has to launch the browser and maximise the window
When   user has to hit the flipkart url
And    user has to pass the data"<emaildatas>" in email field
Then   To close the browser

Examples:

|emaildatas|
|hello@gmail.com|
|elvinahanina@gmail.com|
|rishiya@gmail.com|
|hanina@gmail.com|
|jackulin@gmail.com|


