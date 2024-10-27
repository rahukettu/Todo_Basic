# Todo_Basic App
Simple Android Studio app that fetches the todo list from Retrofit api.

## Overview

The **Todo Basic App** is an Android application built with Kotlin that allows users to easily access Todo list via a RESTful API.

## Features

- Fetches Todos from API.
- User-friendly interface optimized for mobile devices.

## Technologies Used

- **Language**: [Kotlin](https://kotlinlang.org/)
- **Framework**: [Android SDK](https://developer.android.com/sdk)
- **Architecture**: MVVM (Model-View-ViewModel)
- **Networking**: [Retrofit](https://square.github.io/retrofit/)

## Getting Started

To get a local copy of the app up and running, follow these steps:

### Prerequisites

Make sure you have the following installed:

- [Android Studio](https://developer.android.com/studio) (latest version)
- [Kotlin](https://kotlinlang.org/) (comes integrated with Android Studio)

### Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/rahukettu/Todo_Basic.git

    Open the project in Android Studio:
        Launch Android Studio and select Open an existing Android Studio project.
        Navigate to the cloned directory and open it.

    Sync the project:
        Android Studio will prompt you to sync the project. Click on Sync Now to download the required dependencies.

    Set up environment variables:
        Create a local.properties file in the root directory and add your API keys and other configuration settings.
   For example:

        plaintext

        API_URL=https://api.example.com/Todo_Basic

    Build and run the app:
        Connect an Android device or start an Android emulator.
        Click on the Run button (the green play button) in Android Studio.

Usage

    Launch the app on your device or emulator.
    On the homepage, you can view a list of Todos.

API Documentation

The app interacts with the following API endpoints:

    GET /api/todos: Retrieves a list of available Todos.
  

Example API Call

Here's how to make a simple API call using Retrofit in Kotlin:

kotlin
```
val service: ApiService = retrofit.create(ApiService::class.java)
LiveData<List<Todo>> get() = _todos 
{ init
getTodosList() {
vievModelScope.launch() {
  try {
    val todosApi = NewWorkModule.getInstance()
    val todoList = todosApi.getTodos()
    _todos.value = todoList
  } catch (e: Exception) {
                Log.d("TODOVIEWMODEL", e.message.toString())
            }
        }
  }

```
Contributing

Contributions are welcome! Please follow these steps:

    Fork the repository.
    Create a new branch:

    ```bash

git checkout -b feature/YourFeatureName

Commit your changes:

 ```

git commit -m "Add some feature"

Push to the branch:


    git push origin feature/YourFeatureName

    Open a Pull Request.
 ```

License

This project is licensed under the GNU General License - see the LICENSE file for details.


Acknowledgements

    Thank you to all contributors and the open-source community for their support.
    Special thanks to API Provider for providing the Todos data.

Contact

For any inquiries, please contact:

 rahukettu@gmx.com


