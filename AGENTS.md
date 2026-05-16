# Project Overview
This project contains solutions and tests for algorithm challenges, primarily focusing on "LeetCode 150" and "LeetCode 75", as well as foundational Data Structures and Algorithms. It is a multi-language monorepo that supports both Java and Python solutions.

The primary goal of this repository is educational. It serves as a workspace for practicing Data Structures and Algorithms (DSA) with a focus on understanding the "Why" and "How" rather than just providing answers.

## Architecture & Technologies
- **Java**:
  - The root directory houses a Maven-based Java project.
  - **Version:** Java 25 LTS (managed via SDKMAN, pinned in `.sdkmanrc`).
  - **Testing:** JUnit Jupiter 5.12.0.
  - **Build Tool:** Maven (uses `maven-surefire-plugin` for tests).
  - Source code is located in `src/main/java` and tests in `src/test/java`.

- **Python**:
  - Located under the `python/` directory. Contains scripts and a Poetry-managed package named `quest`.
  - **Version:** Python >= 3.14 (pinned via `.python-version` at the root).
  - **Testing:** Pytest (>=9.0.2).
  - **Build/Package Tool:** Poetry.
  - **Modules**:
    - `arrayI` / `arrayII`: LeetCode array challenges.
    - `data_structures`: Foundational structures (Stacks, Queues, Linked Lists).
    - `sort`: Sorting algorithm implementations.
    - `tree`: Tree structures and traversals.
    - `two_pointer`: Two-pointer technique challenges.
  - Source code is in `python/quest/src` and tests in `python/quest/tests`. Other standalone scripts exist in `python/leetcode75/`.

## Building and Running

### Java
- **Compile:** `mvn compile`
- **Run Tests:** `mvn test`
- **Clean Build:** `mvn clean install`

### Python
The root directory is configured as a Poetry project that covers the `python/quest` sub-package.
- **Setup Environment:** `poetry install`
- **Run Tests:** `poetry run pytest`
- **Execute a Script:** `python python/leetcode75/.../<script_name>.py`

## Development Conventions
- **Mentorship & Learning Focus:** Interactions should prioritize guiding the user through the process over simply providing code. Always explain the underlying mechanism, promote best practices, and gain alignment before implementation.
- **Guide over Fix:** Never silently fix an error or jump directly into implementation unless the user explicitly asks for that. Explain what is happening, why it matters, and align on the approach first.
- **Problem Solving Approach:**
  1. **Conceptualization:** Outline the approach textually before writing code.
  2. **Alternatives:** Discuss possible approaches (Brute Force vs. Optimized) and their trade-offs (Time/Space complexity).
  3. **Justification:** Explain why the chosen approach is the most efficient or suitable.
  4. **Code Quality:** Provide well-commented, production-grade code that is clean and readable. Explain why specific syntax or patterns were used.
- **Troubleshooting:** When resolving errors:
  1. Diagnose the root cause clearly.
  2. Explain multiple solution paths when meaningful, including their trade-offs.
  3. Recommend the best path and guide the user through it instead of silently resolving it.
  4. Verify the fix and show how to prove it worked.
- **DSA Teaching:** For algorithm problems, emphasize pattern recognition and the reasoning behind each step. Structure responses around problem understanding, alternate approaches, chosen approach justification, solution code, and a walkthrough of important syntax or patterns.
- **Testing:**
  - Java: All new algorithms must have JUnit tests in `src/test/java`.
  - Java failures: If `mvn test` fails, inspect the detailed Surefire reports in `target/surefire-reports/` for per-test output and stack traces.
  - Python: All new algorithms in `quest` must have Pytest tests in `python/quest/tests/`.
- **Dependencies:**
  - Manage Java dependencies in `pom.xml`.
  - Manage Python dependencies in the root `pyproject.toml` (for global use) or `python/quest/pyproject.toml`.
