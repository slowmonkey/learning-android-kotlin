Followed the following tutorial: https://www.raywenderlich.com/4738-your-first-kotlin-android-app/lessons/5

# Installation and Setup

1. Install Android Studio
2. Launch Android Studio
3. On the Android Studio welcome screen, Click Configure
4. Click `Check for Updates` to ensure the IDE is updated.
5. In the Configure menu click `SDK Manager`
   1. Ensure SDK Platforms are up to date.
   2. Ensure SDK Tools are up to date.

# My first Android Kotlin app

1. Create a new project.
2. Click on `AVD Manager` to add a new emulator, choose something like `Pixel 2`. Ensure it's an x86 CPU/ABI image. This will run faster.

# TODO list to create the game.

1. Create a canvas/page/activity?
2. Create a `Tap Me` button
   1. Button needs a way to record the number of clicks.
   2. Number of clicks should only record once the game is started.
   3. Number of clicks should only record while the count down is going.
3. Create a `Start` button
   1. Button needs to start a count down timer.
4. Game needs to know when the count down timer finishes to show the results.
5. Store the results on a score table.

## Tap Me Button ToDo

1. Handle a tap
2. Increment a score
3. Show countdown timer
4. Start the game

# What am I learning?

- var, val, object instantiation in Kotlin.
- resource values to be stored in strings.xml, helps with translations later.
- layout creating with TextView and Button and constrain settings.
- Only one activity at the moment.
- Orientation changes cause the main activity to be re-created. Use saveInstanceState.
- Changing and setting colours via the styles.xml and colors.xml
- Adding an animation
  - This was a bit harder. Had to understand what's in the set tag and what animation to run.
- Adding a menu
- Adding an icon. Should be 512x512 pixels in size and png format