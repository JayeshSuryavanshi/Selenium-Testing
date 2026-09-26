# Selenium-Testing

A small demo of automated browser testing using [Selenium](https://www.selenium.dev/) WebDriver and Java. Created as a Software Testing & Quality Assurance (STQA) mini-project, it drives a real website through Chrome.

## What the test does

The program ([`src/main/java/STQA_Mini_2.java`](src/main/java/STQA_Mini_2.java)) launches Chrome via `ChromeDriver` and navigates through a sequence of pages on a WordPress site, waiting for each to load:

1. Opens the site home page (`https://jayeshsuryawanshi.wordpress.com/`).
2. Navigates to a blog post page.
3. Navigates to the *Contact* page.
4. Navigates to the *About* page.
5. Prints status messages and closes the browser.

It demonstrates the basics of driving a browser with Selenium WebDriver: creating a `WebDriver`, navigating with `driver.get(...)`, using implicit waits, and tearing down with `driver.quit()`.

## Prerequisites

- **Java JDK 11+**
- **Maven** (dependencies are declared in [`pom.xml`](pom.xml); no libraries are vendored in the repo)
- **Google Chrome** installed

> No `chromedriver` binary is required. Selenium 4.6+ ships **Selenium Manager**, which downloads a ChromeDriver matching your installed Chrome automatically.

## How to run

```sh
mvn -q compile exec:java
```

Chrome opens and steps through the pages automatically; progress is printed to the console.

## Tech stack

- **Language:** Java 11
- **Automation:** Selenium 4 WebDriver
- **Build:** Maven
- **Browser:** Google Chrome (driver auto-managed by Selenium Manager)

## Project structure

| Path | Description |
|------|-------------|
| `src/main/java/STQA_Mini_2.java` | The Selenium WebDriver test program. |
| `pom.xml` | Maven build with the `selenium-java` dependency. |
| `STQA 2 - Abstract.pdf` / `.docx` | Project abstract / report. |
