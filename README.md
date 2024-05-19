<h1 align="center">WORLD SOCCER SCHEDULE & SCORES</h1>

## About this app

Ứng dụng hiển thị thông tin, lịch thi đấu các trận đá bóng wc 2022, xem highlight, vui vẻ cùng wc 
Các chức năng: Hiển thị trận đấu, bình chọn đọi thắng - thua, xem video highlight, chụp ảnh phông nền các cầu thủ, sound funny,..

Note : Api đã không còn sử dụng được nữa

## Image and design
[Link Figma](https://www.figma.com/design/nrvTYG02M9hLXfBuKwoly3/WorldCup2022_Prox_TTA?node-id=0%3A1&t=4qNS4fNdVHRXKSSv-1)

## Download App
Note: App đã bị xóa khỏi Ch play
[Link](https://play.google.com/store/apps/details?id=com.worldcup.soccerapp.footballapp.sports)
## Tech stack
- Minimum SDK level 24
- [Kotlin](https://kotlinlang.org/) based, [Coroutines](https://github.com/Kotlin/kotlinx.coroutines) + [Flow](https://kotlin.github.io/kotlinx.coroutines/kotlinx-coroutines-core/kotlinx.coroutines.flow/) for asynchronous.
- Jetpack
    - Lifecycle: Observe Android lifecycles and handle UI states upon the lifecycle changes.
    - ViewModel: Manages UI-related data holder and lifecycle aware. Allows data to survive configuration changes such as screen rotations.
    - DataBinding: Binds UI components in your layouts to data sources in your app using a declarative format rather than programmatically.
    - Room: Constructs Database by providing an abstraction layer over SQLite to allow fluent database access.
- Architecture
    - MVVM Architecture (View - DataBinding - ViewModel - Model)
- [Retrofit2 & OkHttp3](https://github.com/square/retrofit): Construct the REST APIs and paging network data.
- [Material-Components](https://github.com/material-components/material-components-android): Material design components for building ripple animation, and CardView.
- [Glide](https://github.com/bumptech/glide), [GlidePalette](https://github.com/florent37/GlidePalette): Loading images from network.
- [Timber](https://github.com/JakeWharton/timber): A logger with a small, extensible API.
