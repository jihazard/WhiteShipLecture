# Spring Application 
 * Spring Boot 서버 작성방법
    ~~~java
    @SpringBootApplication
    public class SpringInitApplication {
        public static void main(String[] args) {
         //1   
         SpringApplication.run(SpringInitApplication.class,args);
    
         //2
         new SpringApplicationBuilder().sources(SpringInitApplication.class).run(args);
         //3  
         SpringApplication app = new SpringApplication(SpringInitApplication.class);   
         app.run(args);
        }
    }
   
    ~~~
    

