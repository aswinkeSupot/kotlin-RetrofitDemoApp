# 1. Add Dependency
## 1. Add Retrofit dependency in app level build.gradle.kts
Reference URL - https://square.github.io/retrofit/  (Go to download option)
  - For getting the latest version go to github for retrofit - https://github.com/square/retrofit
```
dependencies {
    implementation ("com.squareup.retrofit2:retrofit:2.11.0")
}
```

## 2. Add Converter dependency in app level build.gradle.kts
Reference URL - https://square.github.io/retrofit/
  - also add the save version on retrofitVersion
```
dependencies {
    implementation ("com.squareup.retrofit2:converter-gson:2.11.0")
}
```

## 3. Add LiveData dependency in app level build.gradle.kts
 - **Reference URL -**  [LifeCycle Document](https://developer.android.com/jetpack/androidx/releases/lifecycle)
```
dependencies {
    // LifeCycle
    val lifecycle_version = "2.8.6"
    // LiveData
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:$lifecycle_version")
}
```

## 4. Add Kotlin coroutines dependency in app level build.gradle.kts
 - **Reference URL -** [Coroutine Document](https://developer.android.com/kotlin/coroutines)
```
dependencies {
    // Add Coroutines dependency
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.3")
}
```

# 2. Add Permissions in AndroidManifest.xml
```
    <uses-permission android:name="android.permission.INTERNET"/>
    <uses-permission android:name="android.permission.ACCESS_NETWORK_STATE"/>
    <uses-permission android:name="android.permission.ACCESS_WIFI_STATE"/>
```


# 3. Three steps to use Retrofit Library There are Three Steps
 - **Reference URL for Fake API -** [Fake API list's Site](https://www.devtoolsdaily.com/fake_json_api/)
 - **We are using the Companies API -** [Companies List](https://testapi.devtoolsdaily.com/companies/)
### 1. Data Class
```
For fetching response we need to create POJO class that automatically parse
the JSON data using GSON in background. We just need to create this POJO Class.
```
  - **i.  Create CompaniesList.kt (kotlin Class)**
  - **ii. Create Company.kt (Kotlin Data Class)**

### 2. Service Interface 
```
We need to create an Interface to define our different methods that will be
 used for network transactions. Also known as API interface. 
```
 - **i. Create RetrofitService.kt (Kotlin interface)**

### 3. Retrofit Instance 
```
Since we are using Retrofit for Network calls, let's create a class that
 provides us the instance of the Retrofit.
```
 - **i. Create RetrofitInstance.kt (Kotlin Class)**


# Error : if the below error occur
```
FATAL EXCEPTION: main
       Process: com.aswin.retrofitdemoapp, PID: 21551
       java.lang.IllegalArgumentException: Unable to create call adapter for retrofit2.Response<com.aswin.retrofitdemoapp.model.CompaniesList>
       for method RetrofitService.getAllCompanies
```
  - Solution
```
in RetrofitService.kt class we need to change the "fun" to "suspend function".
For that
 i. first need to add Kotlin coroutines dependency:
   dependencies {
      // Add Coroutines dependency
      implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.3")
   }

 ii. need to add suspend for fun in RetrofitService.kt 
    @GET("/companies")
    suspend fun getAllCompanies(): Response<CompaniesList>

```



































