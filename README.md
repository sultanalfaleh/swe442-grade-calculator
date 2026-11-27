
# Grade Calculator

## Project Overview

Grade Calculator is a Java command-line application developed for the SWE 442 - Software Configuration Management course.

The application calculates the average of student grades, determines the letter grade, and displays the highest and lowest grades.

This project demonstrates software configuration management using Git and GitHub, including feature branching, commits, pull requests, merge conflict resolution, and version releases.

## Project Features

### Version 1.0 - Initial Release
- Calculate the arithmetic average of student grades.
- Accept multiple grades between 0 and 100.
- Display the average with two decimal places.
- Validate user input and reject invalid grades.

### Version 1.1 - Feature Update
- Calculate the average grade.
- Convert the average into a letter grade (A, B, C, D, F).
- Display the highest grade.
- Display the lowest grade.
- Validate grades between 0 and 100.

## Letter Grade System

| Average Grade | Letter Grade |
|---------------|--------------|
| 90 - 100      | A            |
| 80 - <90      | B            |
| 70 - <80      | C            |
| 60 - <70      | D            |
| Below 60      | F            |

## Requirements

- Java Development Kit (JDK 8 or later).
- A terminal or command prompt.
- Git and GitHub for version control.

## How to Run

### Step 1: Compile the Java Program

```sh
javac GradeCalculator.java
```

### Step 2: Run the Program

```sh
java GradeCalculator 95 85 60
```

### Expected Output in v1.1

```text
Average: 80.00
Letter Grade: B
Highest Grade: 95.00
Lowest Grade: 60.00
```

### Output in v1.0

The initial version displayed only the average:

```text
Average: 80.00
```

## Input Validation

The program accepts numeric grades between 0 and 100.

For example, entering an invalid grade:

```sh
java GradeCalculator 110
```

Produces the following error:

```text
Grade out of range: 110. Use 0 to 100.
```

## Development Workflow

The project was developed using Git and GitHub.

### Main Branch
The main branch contains the stable version of the Grade Calculator.

### Feature Branch 1
Branch: `feature/grade-range`

Developer: Musaad Sultan Al-Faleh

- Added highest grade calculation.
- Added lowest grade calculation.
- Created Pull Request #1.
- Merged the feature into main.

### Feature Branch 2
Branch: `feature/letter-grade`

Developer: Fahad Fayez Al-Hamas

- Added letter grade calculation.
- Created Pull Request #2.
- Resolved a merge conflict.
- Merged the feature into main.

## Merge Conflict Resolution

During development, both feature branches modified the same section of GradeCalculator.java.

After merging the first feature branch, GitHub detected a merge conflict in the second pull request.

The conflict was resolved by combining both implementations, preserving the letter grade calculation and the highest and lowest grade calculations.

The final merged program was compiled and tested successfully.

## Version Control and Releases

### v1.0
Initial release with average grade calculation and input validation.

### v1.1
Updated release containing:
- Letter grade calculation.
- Highest and lowest grade calculation.
- Successfully merged feature branches.
- Resolved merge conflict.

See [RELEASE_NOTES.md](RELEASE_NOTES.md) for detailed release information.

## GitHub Pull Requests

- [Pull Request #1 - Grade Range](https://github.com/sultanalfaleh/swe442-grade-calculator/pull/1)
- [Pull Request #2 - Letter Grade](https://github.com/sultanalfaleh/swe442-grade-calculator/pull/2)

## Project Team

Course: SWE 442 - Software Configuration Management

- Sultan Khalif Al-Faleh
- Fahad Fayez Al-Hamas
- Musaad Sultan Al-Faleh

## Conclusion

The Grade Calculator project demonstrates the use of Git and GitHub for collaborative software development.

Through separate feature branches, pull requests, merge conflict resolution, and version tagging, the team successfully developed and managed two releases of a Java application.
