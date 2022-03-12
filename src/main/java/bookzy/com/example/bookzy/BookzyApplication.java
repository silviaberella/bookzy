package bookzy.com.example.bookzy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookzyApplication {
	private final String message = "Welcome to my Bookzy Store";
	//public App() {}
	public static void main(String[] args) {
		SpringApplication.run(BookzyApplication.class, args);
		System.out.println(new App().getMessage());
	}

	private final String getMessage() {
		return message;
	}

}
