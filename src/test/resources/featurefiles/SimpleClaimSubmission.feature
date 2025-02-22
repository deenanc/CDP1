Feature: Claim Submission

Scenario Outline: A&I Happy Path Claim Submission

Given User is in CDP homepage
Then User selects "<ClaimType>"
Then User accepts terms and conditions

Examples:
|ClaimType|
|Personal Accident|
|Critical Illness|
|Accidental Death|