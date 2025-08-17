📱 News MVVM App - Jetpack Compose + MVVM + Hilt
A learning project built to explore and understand Android modern development concepts using Jetpack Compose, MVVM, Dagger 2, and Hilt. This app fetches real-time news articles from a public API and displays them in a modern Compose UI.


---

### ✨ Learning Goals / Features
This project was specifically created to understand and practice:
* MVVM — Implementing the Model-View-ViewModel architecture pattern.
* Dagger 2 — Learning dependency injection using Dagger 2.
* Hilt Migration — Migrating from Dagger 2 to Hilt for simplified DI.
* XML → Compose Migration — Converting an XML-based UI into Jetpack Compose.
Additional Features:
* Home screen displaying latest news articles with title, image, and short description
* Detail screen to read full news content in-app
* UI State management using sealed classes
* Network calls using Retrofit
* Modular, testable code with separation of concerns

---

### 🧱 Project Structure
news-mvvm-app/
│
├── data/                     # Data Layer
│   ├── api/                  # Retrofit service interface
│   │   └── NewsApiService.kt
│   └── repository/           # Repository implementation
│       └── NewsRepositoryImpl.kt
│
├── presentation/             # Presentation Layer (UI + ViewModel)
│   ├── ui/
│   │   ├── home/             # Home Screen
│   │   │   └── HomeScreen.kt
│   │   ├── detail/           # News Detail Screen
│   │   │   └── DetailScreen.kt
│   │   └── components/       # Reusable UI components
│   └── viewmodel/            # Hilt-injected ViewModel
│       └── NewsViewModel.kt
│
├── di/                       # Dependency Injection
│   └── AppModule.kt          # Hilt module
│
├── utils/
│   └── DateUtils.kt          # Formatter for news timestamps
│
├── MainActivity.kt           # Hosts NavGraph
└── NewsApp.kt                # @HiltAndroidApp application class

---

### 📡 API Integration


News data is fetched from a public news API (e.g., NewsAPI.org)
Retrofit handles network requests and parses JSON responses
Repository layer abstracts API calls for ViewModel consumption


### 💠 Tech Stack
* Tool	Purpose
* Kotlin	Language
* Jetpack Compose	Modern UI Toolkit
* MVVM	Architecture pattern
* Dagger 2	Initial Dependency Injection learning
* Hilt	Dependency Injection migration
* Retrofit	Networking
* Sealed Classes	UI State management
* ViewModel + StateFlow	Lifecycle-aware state


### 🚀 Getting Started


Clone the Repository

```bash
git clone [https://github.com/richarst12/portfolio-app-compose.git](https://github.com/richarst12/News_Mvvm_App.git)
cd News_Mvvm_App
```
Open in Android Studio
Open Android Studio.
Choose "Open an existing project".
Select this cloned folder.
Let Gradle sync and run the app on an emulator/device.

---


### 🔍 TODOs / Improvements
*  Add pagination for loading more news articles
*  MVVM Clean
*  Pull-to-refresh support on Home screen
*  Dark/Light theme toggle
*  Offline caching using Room
*  Unit and UI tests

---

### About Me
Richa Sharma | Android Engineer | Medium Blogger
🔗 LinkedIn
📝 Medium

---

❤️ Found this useful?
Leave a ⭐ on the repo and connect with me on Medium!

