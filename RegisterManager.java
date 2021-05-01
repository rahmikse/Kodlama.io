
public class RegisterManager extends User {

	public void register(Register register) {
		System.out.println("Kayıt Ol - Kodlama.io");
		System.out.println("Adınız Soyadınız" + "\n" + register.firstName +" "+ register.lastName);
		System.out.println("E-Posta" + "\n" + register.eMail );
		System.out.println("Parola: "  + register.password + " Parola Doğrulama:" + register.passwordVerify);
		System.out.println("Kayıt Ol Butonu");
		System.out.println("Kullanıcı başarılı şekilde kayıt oldu.");
	}
	public void registerEmailUpdate(Register register) {
		System.out.println("Yeni E-Mail adresini giriniz :"+"\n"+ register.updateEmail);
		System.out.println("E-Mail başarıyla güncellendi");
	}
	
	public void registerUpdatePassword(Register register) {
		System.out.println("Yeni parolanızı giriniz :"+"\n"+ register.updatePassword);
		System.out.println("Parola başarıyla güncellendi");
	}
	
}
