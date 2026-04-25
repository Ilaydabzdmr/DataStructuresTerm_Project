📦 Smart Logistics & Cargo Simulation System
This project is an advanced Java application that simulates the operational processes of a cargo distribution terminal using complex data structures. The system manages the entire process end-to-end, from the arrival of packages at the terminal to city-based sorting and final delivery tracking.

🚀 Key Technical Features
The project is built on three fundamental data structures to ensure high performance and scalability:

Balanced Search Trees (AVL Tree): The DestinationSorter class performs city-based sorting. An AVL tree is used for alphabetical ordering and fast access, ensuring that search and insertion operations consistently run in O(\log n) time complexity.

Dynamic Hash Table (Chaining): The ParcelTracker class tracks the status of all shipments in real time. The Linked List Chaining method is used to handle collisions, and a resize mechanism is integrated to automatically expand the table when the load factor reaches 75%.

Circular Queue: ArrivalBuffer manages the terminal entry with limited capacity. The circular structure ensures efficient memory usage while preserving the FIFO (First-In-First-Out) principle.

📊 Simulation Capabilities & Analysis
The system runs a dynamic simulation based on parameters defined in config.txt. Key features include:

Misrouting: The probability of shipments being sent to the wrong city is simulated, and return (Returned) processes are managed.

Performance Metrics: At the end of each simulation, the average waiting time and system efficiency are reported.

Sample Simulation Report (based on report.txt data):
Total Processed Shipments: 895
Average Waiting Time: 101.98 ticks
Maximum Queue Density: 4 packages
City Receiving the Most Shipments: Hamburg (142 Parcels)

📂 Project Structure
Plaintext
├── src/ # Java source files (.java)
├── config/ # Simulation parameters (config.txt)
├── docs/ # Simulation reports and log files
│ ├── report.txt # Final statistics report
│ ├── log.txt # Step-by-step simulation logs
│ └── tracker_export.txt # Hash table dump
└── README.md # Project documentation

🚀 Getting Started
Requirements
Java JDK 8 or higher

Installation and Execution
Clone the project:
git clone https://github.com/Ilaydabzdmr/DataStructuresTerm_Project-2.git

Compile the source code:
javac src/*.java -d bin

Run the simulation:
java -cp bin Main

📄 License
This project is licensed under the MIT License.