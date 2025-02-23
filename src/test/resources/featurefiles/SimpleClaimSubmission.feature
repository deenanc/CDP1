Feature: Claim Submission

Scenario Outline: A&I Happy Path Claim Submission

Given User is in CDP homepage
Then User selects "<ClaimType>"
Then User accepts terms and conditions
Then User selects a "<InsuranceType>" and enter details
Then User enters "<PersonalDetails>"

Examples:
|ClaimType|InsuranceType|PersonalDetails|
|Personal Accident|Employer|Myself|
|Critical Illness|UnionAssociation|SomeoneElse|
|Accidental Death|PurchasedMyself|spouse|