Feature: Claim Submission

Scenario Outline: A&I Happy Path Claim Submission

Given User is in CDP homepage
Then User selects "<ClaimType>"
Then User accepts terms and conditions
Then User selects a "<InsuranceType>" and enter details
Then User enters "<PersonalDetails>"
And User enters "<ClaimDetails>" and navigate to bank details
Then User enters "<BankDetails>" and review details

Examples:
|ClaimType|InsuranceType|PersonalDetails|ClaimDetails|BankDetails|
|Personal Accident|Employer|Myself|PADetails|Foreign|
|Critical Illness|UnionAssociation|SomeoneElse|CIDetails|Norwegian|
|Accidental Death|PurchasedMyself|spouse|ADDetails|Norwegian|