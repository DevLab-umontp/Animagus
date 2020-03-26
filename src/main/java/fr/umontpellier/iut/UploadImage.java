package fr.umontpellier.iut;

public class UploadImage {

	public static CharSequence getLink(String messageRecue) {
		return "https://github.com/MathieuSoysal/Animagus.umontp/upload/master/images/animaux/"+messageRecue.substring(5);
	}
    
}