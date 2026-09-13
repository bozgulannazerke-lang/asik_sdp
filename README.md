# Travel Package Builder

**Course:** Software Design Patterns  
**Pattern:** Builder Pattern  
**Language:** Java

---

## Project Overview

This project demonstrates the Builder Design Pattern in Java.

The program creates travel packages step by step. A travel package can have a destination, duration, hotel, meal plan, flight, transfer, and excursions.

The Builder Pattern is useful here because different travel packages can have different options.

---

## Project Structure

The project contains the following classes:

- **TravelPackage** - the product that we create.
- **TravelPackageBuilder** - an interface with methods for building the package.
- **ConcreteTravelPackageBuilder** - implements the builder and creates the travel package.
- **TravelDirector** - creates predefined travel packages.
- **Main** - runs the program and shows the results.

---

## Clean Code Principles

### 1. Validated Construction

The `build()` method checks important values before creating a package.

```java
if (destination == null || destination.isEmpty()) {
    throw new IllegalStateException("Destination cannot be empty");
}

if (durationDays <= 0) {
    throw new IllegalStateException("Duration must be more than 0 days");
}
```

This prevents creating a travel package with invalid data.

### 2. Meaningful Names

Methods and variables have clear names that show what they do.

```java
setDestination(String destination);
setIncludesFlight(boolean includesFlight);
```

These names are easier to understand than short names such as `setD()` or `setF()`.

### 3. Small Methods

Each setter changes one value and returns the builder.

```java
public TravelPackageBuilder setIncludesTransfer(boolean includesTransfer) {
    this.includesTransfer = includesTransfer;
    return this;
}
```

This keeps the methods simple and focused.

### 4. Method Chaining

The builder supports method chaining.

```java
builder.setDestination("Paris")
       .setDurationDays(5)
       .setIncludesFlight(true);
```

This makes the package construction easier to read.

### 5. Default Values

The builder has default values for some options.

```java
this.hotelCategory = "Standard";
this.mealPlan = "Bed & Breakfast";
this.includesFlight = false;
```

This means that not every option has to be specified when creating a package.

---

## How to Run

1. Open the project in IntelliJ IDEA.
2. Open `Main.java`.
3. Run the `main` method.
4. The program will display different travel packages.

---

## Example Packages

The program demonstrates:

- Luxury Tour
- Budget Tour
- Custom Tour

Each package can have different options.

---

## Conclusion

This project shows how the Builder Pattern can be used to create travel packages step by step.

It makes it easier to create different package configurations without using a constructor with many parameters.