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


# 2. Three steps to use Retrofit Library There are Three Steps
> **Reference URL for Fake API -** [Fake API list Page](https://www.devtoolsdaily.com/fake_json_api/)
> **We are using the Companies API -** [Companies List](https://testapi.devtoolsdaily.com/companies/)
### 1. Data Class
```
For fetching response we need to create POJO class that automatically parse
the JSON data using GSON in background. We just need to create this POJO Class
```
> **i  Create CompaniesList.kt (kotlin Class)**
> **ii Create Company.kt (Kotlin Data Class)**

### 2. Service Interface 

### 3. Retrofit Instance 



































