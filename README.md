
# Java Basic Socket Programming

This project demonstrates a basic implementation of socket programming in Java. It consists of a server program (`MyServer.java`) and a client program (`MyClient.java`). The server and client communicate using sockets to exchange messages. The client sends messages to the server, which the server processes (converts to uppercase) and sends back to the client.

## Features

- Server listens for client connections on port 6666.
- Client connects to the server and sends messages.
- Server processes the client's messages by converting them to uppercase.
- Communication continues until the client sends the message `exit`.
- Proper closing of sockets after communication ends.

## Getting Started

Follow the steps below to set up and run the project.

### Prerequisites

- Java Development Kit (JDK) installed.
- Basic understanding of Java programming.

### Steps to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/itspriyambhattacharya/javaBasicSocketProgramming.git
   cd javaBasicSocketProgramming
   ```

2. Compile the Java files:
   ```bash
   javac MyServer.java MyClient.java
   ```

3. Run the server:
   ```bash
   java MyServer
   ```
   The server will start and wait for client connections.

4. Run the client in a new terminal window:
   ```bash
   java MyClient
   ```

5. Enter messages in the client terminal to send them to the server. The server will process the messages and respond with the uppercase version.

6. To terminate the connection, type `exit` in the client terminal.

### Example Output

#### Server Output:
```
Server is running on port 6666
Client connected
Client Message: hello
Client Message: exit
```

#### Client Output:
```
Connected to Server
Enter a String: hello
SERVER: HELLO
Enter a String: exit
```

## File Descriptions

- **MyServer.java**: Implements the server-side logic. Listens for client connections and processes messages from the client.
- **MyClient.java**: Implements the client-side logic. Connects to the server, sends messages, and receives responses.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
