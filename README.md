# Java Collections Demo

A small Maven-based Java project that demonstrates how to use core **Java Collections** (`List`, `Set`, `Map`) with a simple `Student` model.

### What this project shows
- **List (`ArrayList`)**: duplicates are allowed; remove an element using `equals()`.
- **Set (`HashSet`)**: duplicates are ignored; removal relies on `equals()` + `hashCode()`.
- **Map (`HashMap`)**: key/value storage; remove an entry by key.
- **Model correctness**: `Student` implements `equals()` and `hashCode()` so collection operations behave as expected.

### Project structure
- `src/main/java/org/example/CollectionsDemo.java`: demo logic + `main()`
- `src/main/java/org/example/Student.java`: model used in collections
- `src/test/java/org/example/CollectionsDemoTest.java`: tests for list/set/map behavior

### Requirements
- **JDK**: 8+ (recommended: 11+)
- **Maven**: 3.x (recommended for building/testing)

If `mvn` is not recognized in PowerShell/Command Prompt, install Apache Maven and ensure the `bin` folder is added to your `PATH` (then reopen the terminal).

### Build

```bash
mvn clean package
```

### Run the demo

After building, run the main class from the compiled output:

```bash
java -cp target/classes org.example.CollectionsDemo
```

You can also run `CollectionsDemo.main()` directly from your IDE.

### Run without Maven (compile + run)

If you only want to run the demo and don’t want to set up Maven yet:

```bash
mkdir out
javac -d out src/main/java/org/example/*.java
java -cp out org.example.CollectionsDemo
```

### Run tests

```bash
mvn test
```

### Expected console output (example)
The exact ordering for `Set`/`Map` may vary because `HashSet`/`HashMap` are not ordered.

```text
Student List: [Student{id=1, name='Alice'}, Student{id=3, name='Charlie'}, Student{id=1, name='Alice'}]
Student Set: [Student{id=1, name='Alice'}, Student{id=2, name='Bob'}]
Student Map: {101=Student{id=1, name='Alice'}, 103=Student{id=3, name='Charlie'}}
```

