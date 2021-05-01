
public class StudentManager extends User {

	public void addLesson(Student student) {
		System.out.println(student.takenLessons+ " dersi başarıyla -Kurslarım- kısmına  eklendi");
	}
	public void add(Student student) {System.out.println(student.id + ". Öğrenci Eklendi");}		
	public void delete(Student student) {System.out.println("Öğrenci Silindi");}	
	public void getAll(Student[] student) {System.out.println("Öğrenciler Listelendi");}
	
}
