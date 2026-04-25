# 📦 SMART LOGISTICS & CARGO SIMULATION SYSTEM

An advanced Java-based simulation system that models the full lifecycle of a cargo distribution terminal — from package arrival to city-based sorting and delivery tracking.

---

## 🚀 KEY TECHNICAL FEATURES

### 🌳 Balanced Search Trees (AVL Tree)
- Used in `DestinationSorter` for city-based sorting  
- Maintains alphabetical order  
- Ensures **O(log n)** time complexity for search and insertion  

---

### 🧩 Dynamic Hash Table (Chaining)
- Implemented in `ParcelTracker` for real-time shipment tracking  
- Uses **Linked List Chaining** for collision handling  
- Automatically resizes when load factor reaches **75%**  

---

### 🔄 Circular Queue
- Managed by `ArrivalBuffer`  
- Handles terminal entry with limited capacity  
- Preserves **FIFO (First-In-First-Out)** logic  
- Optimized for efficient memory usage  

---

## 📊 SIMULATION CAPABILITIES & ANALYSIS

The system runs dynamic simulations based on parameters defined in `config.txt`.

### ⚙️ Features
- **Misrouting Simulation**  
  - Simulates incorrect deliveries  
  - Handles return (`Returned`) processes  

- **Performance Metrics**
  - Average waiting time  
  - System efficiency  
  - Queue density  

---

### 📈 SAMPLE SIMULATION REPORT


Total Processed Shipments: 895

Average Waiting Time: 101.98 ticks

Maximum Queue Density: 4 packages

City Receiving the Most Shipments: Hamburg (142 parcels)


---

## 📂 PROJECT STRUCTURE


├── src/ # Java source files

├── config/ # Simulation parameters (config.txt)

├── docs/ # Reports and logs

│ ├── report.txt

│ ├── log.txt

│ └── tracker_export.txt

└── README.md


---

## ⚙️ GETTING STARTED

### 📌 Requirements
- Java JDK 8 or higher  

---

### ▶️ Installation & Execution

Clone the repository:
git clone https://github.com/Ilaydabzdmr/DataStructuresTerm_Project.git

Compile the project:
javac src/*.java -d bin

Run the simulation:
java -cp bin Main

## 📄 LICENSE

This project is licensed under the MIT License.
