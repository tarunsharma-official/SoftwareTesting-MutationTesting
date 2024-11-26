# Instruction to Run The Code

## Prerequisites

Install Maven for doing Mutation Testing.

## PIT(Java)

1. Clone/Download the project
2. Navigate to Code/Unit or Code/Integration 
3. To Run the test cases, use:
4.     mvn package
5. Run the following command to perform Mutation Testing
6.     mvn org.pitest:pitest-maven:mutationCoverage
7. View the mutation testing results in target/pit-reports/index.html.
