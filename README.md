## Glide - Image Loading Library for Android  

Glide is a fast and efficient image loading library for Android that simplifies handling and displaying images from various sources such as URLs, local storage, and resources. Developed by **Bumptech**, Glide is widely used for its smooth performance, automatic caching, and ease of integration.  

### 🔹 Features  
- **Fast Image Loading**: Efficiently loads images with smooth scrolling support.  
- **Automatic Caching**: Stores images in memory and disk cache to reduce redundant network calls.  
- **GIF Support**: Supports static and animated GIFs.  
- **Transformations**: Easily apply transformations like cropping, rounding, and blurring.  
- **Placeholder & Error Handling**: Display placeholder images while loading and handle errors gracefully.  

### 🔹 Installation  

#### 📌 Using `build.gradle` (Module: app)  
Add the following dependencies to your `build.gradle`:  
```gradle
dependencies {
    implementation 'com.github.bumptech.glide:glide:4.16.0'
    annotationProcessor 'com.github.bumptech.glide:compiler:4.16.0'
}
```  

#### 📌 Using `libs.versions.toml` (If needed)  
If you encounter issues when adding dependencies directly in `build.gradle`, you may need to define them in `libs.versions.toml` and use them in your dependencies:  

1. **Add Glide to `libs.versions.toml`**  
   ```toml
   [versions]
   glide = "4.16.0"

   [libraries]
   glide = { module = "com.github.bumptech.glide:glide", version.ref = "glide" }
   compiler.glide = { module = "com.github.bumptech.glide:compiler", version.ref = "glide" }
   ```  

2. **Use these dependencies in `build.gradle`**  
   ```gradle
   dependencies {
       implementation(libs.glide)
       annotationProcessor(libs.compiler.glide)
   }
   ```  

### 🔹 Basic Usage  
Load an image from a URL into an `ImageView`:  
```java
Glide.with(context)
    .load("https://example.com/image.jpg")
    .placeholder(R.drawable.placeholder) // Optional: Placeholder while loading
    .error(R.drawable.error_image) // Optional: Error image if loading fails
    .into(imageView);
```  

### 🔹 Advanced Features  
- **Apply Transformations**:  
  ```java
  Glide.with(context)
      .load(imageUrl)
      .apply(RequestOptions.circleCropTransform()) // Example: Circle crop
      .into(imageView);
  ```  
- **Load GIFs**:  
  ```java
  Glide.with(context)
      .asGif()
      .load(gifUrl)
      .into(imageView);
  ```  

### 🔹 More Resources  
- Official Documentation: [https://bumptech.github.io/glide/](https://bumptech.github.io/glide/)  
- GitHub Repository: [https://github.com/bumptech/glide](https://github.com/bumptech/glide)  
