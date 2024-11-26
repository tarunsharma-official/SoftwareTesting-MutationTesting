# Instruction to Run The Code

## Prerequisites

Install Maven for doing Mutation Testing using [this](https://www.digitalocean.com/community/tutorials/install-maven-linux-ubuntu).

## Steps to perform

1. Clone/Download the project
2. Navigate to Code/Unit or Code/Integration 
3. To Run the test cases, use:
4.     mvn package
5. Run the following command to perform Mutation Testing
6.     mvn org.pitest:pitest-maven:mutationCoverage
7. View the mutation testing results in target/pit-reports/index.html.

## Contribution
  Unit Testing done by Tarun Sharma. <br/>
  Integration Testing done by Farman Ahmed.

## Repository [Link](https://github.com/tarunsharma-official/SoftwareTesting-MutationTesting)
