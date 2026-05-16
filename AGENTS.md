# Project Overview
This project contains solutions and tests for algorithm challenges, primarily focusing on "LeetCode 150" and "LeetCode 75". It is a multi-language monorepo that supports both Java and Python solutions. 

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
  - Source code is in `python/quest/src` and tests in `python/quest/tests`. Other standalone scripts exist in `python/leetcode75/`.

## Building and Running

### Java
- **Compile:** `mvn compile`
- **Run Tests:** `mvn test`
- **Clean Build:** `mvn clean install`
*(Ensure you are using Java 25. If using SDKMAN, `sdk env` will activate the correct version).*

### Python
- **Setup Environment:** Navigate to `python/quest` and run `poetry install`.
- **Run Tests:** Inside `python/quest`, execute `poetry run pytest`.
- **Execute a Script:** `python python/leetcode75/.../<script_name>.py`

## Development Conventions
- **Mentorship & Learning Focus:** Interactions should prioritize guiding the user through the process over simply providing code. Always explain the underlying mechanism, promote best practices, and gain alignment before implementation.
- **Problem Solving Approach:**
  1. **Conceptualization:** Outline the approach textually before writing code.
  2. **Alternatives:** Discuss possible approaches (Brute Force vs. Optimized) and their trade-offs (Time/Space complexity).
  3. **Justification:** Explain why the chosen approach is the most efficient or suitable.
  4. **Code Quality:** Provide well-commented, production-grade code that is clean and readable. Explain why specific syntax or patterns were used.
- **Troubleshooting:** When resolving errors, diagnose the root cause, explain the options to fix it, and guide the user through the best path instead of silently resolving it.
- **Testing:**
  - Java: All new algorithms must have JUnit tests in `src/test/java`.
  - Python: All new algorithms in `quest` must have Pytest tests in `python/quest/tests/`.
- **Dependencies:**
  - Manage Java dependencies in `pom.xml`.
  - Manage Python dependencies in `python/quest/pyproject.toml` via Poetry.