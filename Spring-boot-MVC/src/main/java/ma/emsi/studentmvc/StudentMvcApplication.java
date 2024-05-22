package ma.emsi.studentmvc;

import ma.emsi.studentmvc.Repository.StudentRepository;
import ma.emsi.studentmvc.entites.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class StudentMvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentMvcApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args -> {
            studentRepository.save(new Student(null,"Mohamed","kh"));
            studentRepository.save(new Student(null,"khadija","Lachhab"));
            studentRepository.save(new Student(null,"Salma","Jermoumi"));

            studentRepository.findAll().forEach(s->{
                System.out.println(s.getNom());
            });

        };
    }

}
