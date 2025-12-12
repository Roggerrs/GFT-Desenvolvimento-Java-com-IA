# GitHub Copilot Instructions

## Project Overview
**GFT Desenvolvimento Java com IA** is an educational repository containing foundational Java learning projects with a focus on control flow, OOP, and practical examples. Three independent modules:
- `controle-fluxo/`: Console-based examples of conditionals, loops, and control structures
- `projeto-carro/`: Maven-based OOP project demonstrating inheritance (`Veiculo` → `Carro`)
- `SmartTV/`: Simple class modeling (no external dependencies)

## Build & Execution

### Non-Maven Projects (controle-fluxo/, SmartTV/)
- **Build**: Use VS Code's Java Extension or javac directly: `javac src/*.java -d bin/`
- **Run**: `java -cp bin ClassName` (e.g., `java -cp bin ForExample`)
- **Structure**: Simple `src/` → `bin/` compilation model; no external dependencies

### Maven Project (projeto-carro/)
- **Build**: `mvn clean compile` (Java 11 required per pom.xml)
- **Run Main**: `mvn exec:java -Dexec.mainClass="com.example.carro.Main"`
- **Tests**: `mvn test` (includes JUnit 4.13.2)
- **Package JAR**: `mvn package` (creates executable jar with Main class configured)
- **Key config**: Main class hardcoded in pom.xml `<mainClass>com.example.carro.Main</mainClass>`

## Architecture Patterns

### OOP in projeto-carro/
**Inheritance hierarchy**: `Veiculo` (base) ← `Carro` (subclass)
- `Veiculo.java`: Protected field `velocidade`, methods `acelerar()`, `frear()`, `getVelocidade()`
- `Carro.java`: Extends Veiculo with `cor`, `modelo` fields; **overrides `acelerar()`** (+20 vs +10 velocity)
- Key lesson: Demonstrate `@Override`, method overriding, super() initialization
- Test via `Main.java`: Shows both direct inheritance calls and polymorphism (Veiculo reference → Carro object)

### Input Validation Pattern (controle-fluxo/)
Recurring pattern across examples: **wrap `scanner.nextInt()/nextDouble()` in try-catch with `Integer.parseInt()` on `.nextLine()`**
```java
// GOOD: Safe input parsing
while (!valid) {
    try {
        value = Integer.parseInt(scanner.nextLine().trim());
        valid = true;
    } catch (NumberFormatException e) {
        System.out.println("⚠ Input invalid!");
    }
}

// ANTIPATTERN: Avoid direct nextInt() — leaves newline in buffer
```
- **Why**: `scanner.nextInt()` doesn't consume the newline; causes `nextLine()` to return empty string
- Common fix: Add `scanner.nextLine()` after numeric input to clear buffer
- **Apply when**: Adding user input or new control flow examples

### Conditional Flow Patterns
**Three increasingly complex styles** (see examples in controle-fluxo/):
1. **Simple if/else**: Age checks, basic validation
2. **Nested if/else**: Layered logic (age → salary → benefit determination)
3. **Switch-case**: Enumerable choices (e.g., array index to selection)
- Ternary operator used for inline true/false assignments: `String result = (condition) ? "yes" : "no"`
- When adding features: Use if/else for 2-3 conditions, switch for ≥4 discrete options

### Data Structure Usage
- **Arrays**: Fixed-size collections (String[] cargos, int[] numeros)
- **ArrayList**: Dynamic collections when size varies (import `java.util.ArrayList`)
- **Iteration**: Prefer enhanced for-loop (`for (String s : array)`) unless index needed

## Code Style Conventions

### Naming & Structure
- **Classes**: PascalCase, one per file (e.g., `SmartTv.java`, `Veiculo.java`)
- **Methods/fields**: camelCase (e.g., `aumentarVolume()`, `velocidade`)
- **Constants**: Not consistently present; when needed, use `UPPER_CASE`

### Documentation
- No Javadoc in codebase; use **single-line comments** before methods explaining logic
- Example output blocks included as multi-line comments at file bottom
- When adding methods: Include sample usage in comments if non-obvious

### Method Helpers
- Static helper methods for input validation (e.g., `lerInteiroValido()` in SwitchCaseExample.java)
- **Pattern**: Return validated value, handle exception loop inside helper
- Place helpers at **end of class**, before output examples

### Output Formatting
- Use `System.out.println()` for simple output
- Use `String.format()` or `printf()` for numbers: `String.format("R$ %.2f", value)`
- Include summary sections in output: `System.out.println("\n--- Resumo ---")`

## Testing Strategy
- **projeto-carro/**: JUnit 4 available; currently no test files in `src/test/java/`
- **Controle-fluxo/SmartTV/**: No automated tests; validation via manual execution and output comparison
- When adding tests to projeto-carro: Use `src/test/java/com/example/carro/` structure

## External Dependencies
- **Maven only**: JUnit 4.13.2 for testing
- **No external libs** in controle-fluxo/ or SmartTV/
- **Java 11 minimum** (per projeto-carro pom.xml)

## Common Maintenance Tasks

### Adding a New Control Flow Example
1. Create `NewExampleClassName.java` in `controle-fluxo/src/`
2. Include input validation with try-catch pattern for numeric input
3. Use ArrayList or arrays as needed; iterate with enhanced for-loop
4. Add multi-line output examples at bottom as comments
5. Run with: `javac src/*.java -d bin/ && java -cp bin NewExampleClassName`

### Extending projeto-carro/ OOP
1. Add new class in `src/main/java/com/example/carro/`
2. If adding inheritance: Extend `Veiculo`, use `@Override` for method overrides, call `super()` in constructor
3. Update `Main.java` to instantiate and test new class
4. Run with: `mvn clean compile && mvn exec:java -Dexec.mainClass="com.example.carro.Main"`

### Debugging
- **Compilation errors**: Check `.vscode/settings.json` has correct `java.project.sourcePaths` and `outputPath`
- **Runtime errors**: Verify package names match directory structure (e.g., `com.example.carro`)
- **Maven issues**: Clear `target/` folder: `mvn clean` before retry

## Key Files Reference
- **Base class**: `projeto-carro/src/main/java/com/example/carro/Veiculo.java`
- **Inheritance demo**: `projeto-carro/src/main/java/com/example/carro/Carro.java`
- **Validator pattern**: `controle-fluxo/src/CondicionalCompostaExample.java` (has `lerInteiroValido()`)
- **Complex control flow**: `controle-fluxo/src/CondicionalEncadeadaExample.java` (nested if/else)
- **Collections**: `controle-fluxo/src/ForArraysExample.java` (array/matrix operations)
