## Glide - Image Loading Library for Android  

Glide is a fast and efficient image loading library for Android that simplifies handling and displaying images from various sources such as URLs, local storage, and resources. Developed by **Bumptech**, Glide is widely used for its smooth performance, automatic caching, and ease of integration.  

### 🔹 Features  
- **Fast Image Loading**: Efficiently loads images with smooth scrolling support.  
- **Automatic Caching**: Stores images in memory and disk cache to reduce redundant network calls.  
- **GIF Support**: Supports static and animated GIFs.  
- **Transformations**: Easily apply transformations like cropping, rounding, and blurring.  
- **Placeholder & Error Handling**: Display placeholder images while loading and handle errors gracefully.  

### 🔹 Installation  
To use Glide, add the dependency in your `build.gradle` (Module: app):  
```gradle
dependencies {
    implementation 'com.github.bumptech.glide:glide:4.16.0'
    annotationProcessor 'com.github.bumptech.glide:compiler:4.16.0'
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

---

