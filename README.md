# Selenium-Testing

A small demo of automated browser testing using [Selenium](https://www.selenium.dev/) (open source) and Java. The project was created as a Software Testing & Quality Assurance (STQA) mini-project and drives a real website through the Chrome browser using Selenium WebDriver.

## What the test does

The single test program ([`STQA_Mini_2.java`](STQA_Mini_2.java)) launches Google Chrome via `ChromeDriver` and navigates through a sequence of pages on a WordPress site, waiting for each page to load:

1. Opens the site home page (`https://jayeshsuryawanshi.wordpress.com/`).
2. Navigates to a blog post page.
3. Navigates to the *Contact* page.
4. Navigates to the *About* page.
5. Prints status messages to the console and closes the browser.

The script uses `Thread.sleep(...)` for fixed pauses and `implicitlyWait(...)` for implicit waits between navigations. It demonstrates the basics of driving a browser with Selenium WebDriver: setting the driver system property, creating a `WebDriver` instance, navigating with `driver.get(...)`, and tearing down with `driver.close()`.

> Note: some element-interaction lines (`findElement` / `click` on specific element IDs) are present but commented out in the source; the active flow performs page navigations only.

## Prerequisites

- **Java JDK** (8 or later) to compile and run the program.
- **Selenium WebDriver** Java libraries (provided in this repo, see [Tech stack](#tech-stack)).
- **Google Chrome** installed on the machine.
- **ChromeDriver** matching your installed Chrome version. A `chromedriver.exe` (Windows) is committed for convenience.

## How to run

This project ships its dependencies as a `.zip` of compiled Selenium classes rather than a build tool (Maven/Gradle). To run it:

1. Unzip `Selenium_Libraries.zip` to a folder (e.g. `libs/`). It contains the Selenium and supporting `.class` files (`org/openqa`, Guava, Apache, ByteBuddy, etc.).
2. Make sure `chromedriver.exe` is present and compatible with your Chrome version. The source expects it at `./chromedriver.exe` (current directory):

   ```java
   System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
   ```

3. Compile, putting the unzipped libraries on the classpath:

   ```sh
   javac -cp "libs" STQA_Mini_2.java
   ```

4. Run:

   ```sh
   java -cp ".;libs" STQA_Mini_2     # Windows (use : instead of ; on macOS/Linux)
   ```

Chrome will open and step through the pages automatically; progress is printed to the console.

> On macOS/Linux you will need a platform-appropriate `chromedriver` binary instead of `chromedriver.exe`, and should use `:` as the classpath separator.

## Tech stack

- **Language:** Java
- **Test/automation framework:** Selenium WebDriver
- **Browser:** Google Chrome (via ChromeDriver)
- **Supporting libraries** (bundled in `Selenium_Libraries.zip`): Google Guava, Apache Commons, ByteBuddy

## Project structure

| File | Description |
|------|-------------|
| `STQA_Mini_2.java` | The Selenium WebDriver test program (main source). |
| `Selenium_Libraries.zip` | Bundled Selenium WebDriver and supporting library `.class` files (project dependencies). |
| `chromedriver.exe` | ChromeDriver browser-driver binary (Windows) used by Selenium to control Chrome. |
| `STQA 2 - Abstract.pdf` / `STQA 2 - Abstract.docx` | Project abstract / report document. |

## Notes

`Selenium_Libraries.zip` and `chromedriver.exe` are intentionally committed because they are the runtime dependencies this demo needs to compile and run; they are not build output.
