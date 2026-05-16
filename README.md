# LeetCode150

## Java test output

`mvn test` is intentionally configured to keep successful runs compact so logs stay readable and agent context is not wasted.

Detailed Surefire reports are still written to `target/surefire-reports/`.

To temporarily restore verbose console output while debugging, run:

```bash
mvn test -Dsurefire.useFile=false -Dsurefire.printSummary=true
```
