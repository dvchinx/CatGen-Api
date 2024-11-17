# 🐱 CatGen-Api  

**¡Una aplicación en Java para los amantes de los gatos!**  

CatGen-Api permite conectarse a **TheCatAPI** y muestra una imagen aleatoria de un gato en un `JFrame`. </br>
El título del `JFrame` corresponde al código único de la imagen obtenida desde la API.  

<img src="https://github.com/dvchinx/CatGen-Api/blob/main/imgs/3.png" alt="ScreenShot" width="250"> <img src="https://github.com/dvchinx/CatGen-Api/blob/main/imgs/2.png" alt="ScreenShot" width="250"> <img src="https://github.com/dvchinx/CatGen-Api/blob/main/imgs/1.png" alt="ScreenShot" width="250">

---

## 🚀 Características  
- **Conexión con TheCatAPI**: Recupera imágenes aleatorias de gatos con una sencilla integración.  
- **Interfaz Swing**: Muestra las imágenes directamente en un `JFrame`.  
- **Título descriptivo**: El `JFrame` muestra el código único de la imagen obtenida desde la API.  
- **Librerías modernas**: Utiliza `javax.swing`, `google.gson` y `squareup.okhttp` para una implementación robusta.  

---

## 🛠️ Tecnologías utilizadas  
- **Java 11+**  
- **Google Gson** para manejar respuestas JSON.  
- **Square OkHttp** para realizar solicitudes HTTP.  
- **Javax.swing** para la interfaz gráfica.  

---

## 📋 Requisitos previos  
1. Tener instalada la **JDK 11 o superior**.  
2. Clonar este repositorio:  
   ```bash
   git clone https://github.com/tu-usuario/CatGen-Api.git
   cd CatGen-Api

## ⚙️ Dependencias
Si estás usando Maven, agrega las siguientes dependencias al archivo pom.xml:

  ```
  <dependencies>

        <!-- Gson para parsear JSON -->
    <dependency>
        <groupId>com.google.code.gson</groupId>
        <artifactId>gson</artifactId>
        <version>2.8.9</version>
    </dependency>
        
        <!-- OkHttp para realizar solicitudes HTTP -->
    <dependency>
        <groupId>com.squareup.okhttp3</groupId>
        <artifactId>okhttp</artifactId>
        <version>4.10.0</version>
    </dependency>

  </dependencies>
  ```
