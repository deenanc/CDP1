Feature: Claim Submission

Scenario Outline: A&I Happy Path Claim Submission

Given User is in CDP homepage
Then User selects "<ClaimType>"
Then User accepts terms and conditions
Then User selects a "<InsuranceType>" and enter details
Then User enters "<PersonalDetails>"
And User enters "<ClaimDetails>" and navigate to bank details

Examples:
|ClaimType|InsuranceType|PersonalDetails|ClaimDetails|
#|Personal Accident|Employer|Myself|PADetails|
#|Critical Illness|UnionAssociation|SomeoneElse|CIDetails|
|Accidental Death|PurchasedMyself|spouse|ADDetails|