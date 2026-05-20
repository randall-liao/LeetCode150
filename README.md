# LeetCode150

A multi-language monorepo for practicing Data Structures and Algorithms (DSA), featuring solutions for LeetCode 150, LeetCode 75, and foundational DSA implementations.

## Java

### Running Tests
`mvn test` is configured to keep successful runs compact. Detailed reports are in `target/surefire-reports/`.

For verbose output:
```bash
mvn test -Dsurefire.useFile=false -Dsurefire.printSummary=true
```

## Python

The Python environment is managed by Poetry.

### Setup
Run this from the project root:
```bash
poetry install
poetry run pre-commit install
```

### Running Tests
You can run all tests from the project root:
```bash
poetry run pytest
```
