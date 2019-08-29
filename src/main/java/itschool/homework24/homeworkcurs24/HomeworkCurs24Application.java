package itschool.homework24.homeworkcurs24;

import itschool.homework24.homeworkcurs24.repository.DocumentRepository;
import itschool.homework24.homeworkcurs24.repository.MarkupRepository;
import itschool.homework24.homeworkcurs24.repository.model.Document;
import itschool.homework24.homeworkcurs24.repository.model.Markup;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HomeworkCurs24Application {

	public static void main(String[] args) {
		SpringApplication.run(HomeworkCurs24Application.class, args);
	}

	@Bean
	CommandLineRunner atStartup(DocumentRepository repo,MarkupRepository markup){
		return args -> {
			repo.save(new Document("name1","content1","Cipri"));
			repo.save(new Document("name2","content2","Steli"));
			repo.save(new Document("name3","content3","Marius"));
			repo.save(new Document("name4","content4","Cipri"));
			repo.save(new Document("name5","content5","Stania"));
			markup.save(new Markup(1,"markup1",5));
			markup.save(new Markup(1,"markup2",2));
			markup.save(new Markup(4,"markup1",3));
			markup.save(new Markup(2,"markup1",1));

		};
	}


}
