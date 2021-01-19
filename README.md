# flipper-android-no-op
No-op dependency when using Flipper Android in **release** mode.

[![](https://jitpack.io/v/prometey-dev/flipper-android-no-op.svg)](https://jitpack.io/#prometey-dev/flipper-android-no-op)
![GitHub](https://img.shields.io/github/license/theglenn/flipper-android-no-op.svg)
[![Contribute](https://img.shields.io/badge/contributions-friendly-b44ac1.svg)](https://egghead.io/series/how-to-contribute-to-an-open-source-project-on-github)

## Getting started

In your `build.gradle`:

```groovy
allprojects {
  repositories {
    ...
    maven { url 'https://jitpack.io' }
  }
}
...

dependencies {
    //The important part
    def flipper_version = '0.71.0'
    debugImplementation "com.facebook.flipper:flipper:$flipper_version"
    debugImplementation "com.facebook.flipper:flipper-network-plugin:$flipper_version"
    debugImplementation 'com.facebook.soloader:soloader:0.9.0'

    // Include `flipperandroidnoop` and  `soloadernoop` individually
    releaseImplementation 'com.github.prometey-dev.flipper-android-no-op:flipperandroidnoop:0.6.1'
    releaseImplementation 'com.github.prometey-dev.flipper-android-no-op:soloadernoop:0.4.0'

    // Includes both libraries
    releaseImplementation 'com.github.prometey-dev:flipper-android-no-op:0.6.1'
}
```

In your `Application` class same as [this](https://fbflipper.com/docs/getting-started/android-native#application-setup) :
```java
public class MyApplication extends Application {

  @Override public void onCreate() {
    super.onCreate();
    SoLoader.init(this, false);

    if (BuildConfig.DEBUG && FlipperUtils.shouldEnableFlipper(this)) {
      final FlipperClient client = AndroidFlipperClient.getInstance(this);
      client.addPlugin(new InspectorFlipperPlugin(this, DescriptorMapping.withDefaults()));
      client.start();
    }
  }
}
```
