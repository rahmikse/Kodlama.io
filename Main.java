
public class Main {

	public static void main(String[] args) {

		Register register = new Register();
		register.setFirstName("Rahmi");
		register.setLastName("Köse");
		register.seteMail("rahmikse19@gmail.com");
		register.setPassword("12345");
		register.setPasswordVerify("12345");
		register.setUpdateEmail("rahmikse1262@gmail.com");
		register.setUpdatePassword("6789");

		RegisterManager registerManager = new RegisterManager();
		registerManager.register(register);
		System.out.println("------------");
		registerManager.registerEmailUpdate(register);
		registerManager.registerUpdatePassword(register);

		System.out.println("-----------");
		Instructor instructor = new Instructor();
		instructor.setGivenLessons("Yazılım Geliştirici Yetiştirme Kampı (JAVA + REACT)");
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addLesson(instructor);
		
		System.out.println("----------");
		Student student1 = new Student();
		student1.setId(1);
		student1.setFirstName("Rahmi");
		student1.setLastName("Köse");
		student1.setTakenLessons("Yazılım Geliştirici Yetiştirme Kampı (JAVA + REACT)");
		StudentManager studentManager = new StudentManager();
		studentManager.add(student1);
		studentManager.addLesson(student1);
		
		System.out.println("----------");
		Student student2 = new Student();
		student2.setId(2);
		student2.setFirstName("Serhat");
		student2.setLastName("Köse");
		StudentManager studentManager2 = new StudentManager();
		student2.setTakenLessons("Yazılım Geliştirici Yetiştirme Kampı (JAVA + REACT)");
		studentManager2.add(student2);
		studentManager2.addLesson(student2);
		
		Student[] students= {student1,student2};
		
		
		studentManager.delete(student1);
		studentManager2.delete(student2);
		studentManager.getAll(students);
		
		
		

	}

}
