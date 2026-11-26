# Grade Calculator

A command-line Java utility that calculates the unweighted arithmetic mean of one or more grades. Supply individual grades from 0 through 100, using a period for decimal fractions. The program displays the average to two decimal places.

## Build and run

Install a Java Development Kit (JDK 8 or later). In the project directory, run:

```sh
javac GradeCalculator.java
java GradeCalculator 95 85 60
```

Output:

```text
Average: 80.00
```

Every argument represents one grade with equal weight. Missing, nonnumeric and out-of-range grades produce an error and a nonzero exit status.

## Release history

See [RELEASE_NOTES.md](RELEASE_NOTES.md) for the changes in each release.
