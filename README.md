# freegemas
Bejeweled-like game for PC, Android and possibly HTML.

Code and assets were taken from here: https://github.com/saltares/freegemas-gdx
and adapted for modern version of LibGdx (definitely 1.9.3)

#Using:
In Android Studio or IntelliJ Idea select "Import" and choose build.gradle
from root of project.

For Eclipse execute command "gradlew eclipse" via command prompt in root of project.
Then use "Import existing project" in Eclipse.

Versions of android build tools for this project:
- buildToolsVersion "23.0.3"
- compileSdkVersion 23
- ...
- targetSdkVersion 23

Download them in Android SDK or change it to yours in android/build.gradle
before import.

For launch on desktop create new configuration:
- Type: Gradle
- Gradle project: - choose "desktop" through folder icon on right
- Tasks: type "run"
