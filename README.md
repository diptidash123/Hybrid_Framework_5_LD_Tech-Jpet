Project Overview:

This project automates user authentication and registration workflows using Java, Selenium WebDriver, and the Page Object Model (POM) design pattern.
It demonstrates automation of login, registration, search functionality, and page validations in a modular and maintainable framework.

Functionalities Automated:
1️. User Login Workflow

Methods: login()
Clicking “Sign In” button and opening the login form

Entering username (Andrew123) and password (andrewTest@123) after clearing existing field values

Submitting the login form by clicking Login

Verifying successful user authentication/login flow

Testing Types: Functional Testing, UI Validation, End-to-End Login Automation

2.User Registration & Search Navigation

Methods: searchProduct(), registerUser()

Search Functionality: Enter text in the search box (e.g., "Fish"), perform search, and navigate back to the main page

Navigation to Sign-In/Registration: Click Sign In → redirected to login page → Click Register Now → redirected to registration page

Registration Form Submission: Enter user credentials (username, password, repeat password), select optional subscription checkbox, and submit form

Page Validations: Verify URL and page title post-registration

Testing Types: Functional Testing, Data-Driven Input, Page & Navigation Validation, UI Interaction

Technical Concepts Used:

Page Object Model (POM): Modular and maintainable automation design

Selenium WebDriver: UI automation and interaction handling

Java: Core language for automation logic

Data Handling: Optional data-driven testing via form inputs

Validation: URL, page title, and functional flow checks
