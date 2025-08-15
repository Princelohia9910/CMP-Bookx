# CMP-Bookx 📚

CMP-Bookx is a cross-platform mobile application designed to deliver a seamless book reading experience on Android and iOS. Built leveraging the power of Kotlin Multiplatform Mobile (KMM), CMP-Bookx demonstrates the efficiency of code sharing while maintaining native performance and user experience for both platforms.

---

## 🚀 Features

- 📚 **Read and manage your book library** across Android and iOS
- 🔄 **Cross-platform codebase:** Shared business logic, networking, and persistence
- 🎨 **Native UI:** Platform-specific interfaces for a familiar user experience
- ⚡ **Offline support:** Access your library even without an internet connection
- 🔒 **Data synchronization:** Secure and efficient syncing across devices (planned)

---

## 🛠️ Tech Stack

### Core Technologies

- **Kotlin Multiplatform Mobile (KMM):** Enables sharing core logic between Android and iOS.
- **Kotlin (99.2%):** Primary language for business logic, networking, and data management.
- **Swift (0.8%):** Used for building native iOS UI and integrating with shared Kotlin code.

### Android

- **Jetpack Libraries:** ViewModel, LiveData, Navigation for robust app architecture.
- **UI:** Jetpack Compose or XML layouts for modern, reactive UI.
- **Dependency Injection:** Koin or Dagger for managing dependencies.

### iOS

- **SwiftUI or UIKit:** For building intuitive and responsive native UIs.
- **Swift Integration:** Seamlessly bridges KMM shared logic with native iOS features.

### Shared Libraries

- **Ktor:** Cross-platform networking for API communication.
- **SQLDelight:** Type-safe, shared database layer for both platforms.
- **Kotlinx.serialization:** Efficient data parsing and JSON serialization.
- **Coroutines:** Asynchronous and concurrent task management.

---

## 📁 Project Structure

```
CMP-Bookx/
│
├── shared/                # Shared Kotlin code (network, database, business logic)
│   ├── src/
│   └── build.gradle.kts
│
├── androidApp/            # Android-specific code (UI, platform features)
│   ├── src/
│   └── build.gradle.kts
│
├── iosApp/                # iOS-specific code (UI, platform features)
│   ├── Sources/
│   └── Podfile
│
└── build.gradle.kts       # Project build configuration
```

---

## 🚦 Getting Started

### Prerequisites

- **Android Studio (latest)**
- **Xcode (latest)**
- **Kotlin Multiplatform plugin**
- **CocoaPods** (for iOS)


## 📸 Screenshots
<img width="379" alt="Screenshot 2025-02-11 at 12 38 49 AM" src="https://github.com/user-attachments/assets/4e4ffbdf-3992-4b05-818a-2d4df3397119" />
<img width="379" alt="Screenshot 2025-02-11 at 12 38 55 AM" src="https://github.com/user-attachments/assets/3e2760a5-5636-49ae-baf2-9d17fd4fd920" />
<img width="379" alt="Screenshot 2025-02-11 at 12 38 09 AM" src="https://github.com/user-attachments/assets/d3505c44-6e76-4bc5-9456-e0b69c25426e" />

## 📹 Video Demo
Watch the video demo of CMP-Bookpedia to see it in action:
[Watch the video](https://drive.google.com/file/d/1vsrbG2nE2DMoxk6k1fPutTU67l97Ait5/view?usp=sharing)


## 📦 Installation
1. Clone the repository:
   ```sh
   git clone https://github.com/your-username/CMP-Bookpedia.git
   cd CMP-Bookpedia
   ```
2. Install dependencies:
   ```sh
   npm install
   ```
3. Start the application:
   ```sh
   npm start
   ```

## 🤝 Contributing
Contributions are welcome! Please fork the repository and submit a pull request.

## 📄 License
This project is licensed under the MIT License.

## 📧 Contact
For any queries, reach out to (princelohia9910@gmail.com).


