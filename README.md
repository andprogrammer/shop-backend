# shop-backend
Backend service that manages products, users, and shopping carts for an online store.

---

## System Requirements

- **Operating System**: Tested on Ubuntu 24.04.3 LTS (or newer).
- **Java Version**: JDK 21 (or later). You can install it using the instructions below.

  ### Installing JDK 21 on Ubuntu
    1. Open a terminal and update your package list:
       ```bash
       sudo apt update
       ```
    2. Install JDK 21:
       ```bash
       sudo apt install openjdk-21-jdk
       ```
    3. Verify the installation:
       ```bash
       java -version
       ```
       This should display something like: `openjdk version "21.0.0" 2023-09-19`.

## How to Run the Application

1. Clone the repository:
   ```bash
   git clone git@github.com:andprogrammer/shop-backend.git
   ```

2. To build the Docker image, use the following command:
    ```bash
    docker build -t shop-backend .
    
    docker run --rm shop-backend
    ```
