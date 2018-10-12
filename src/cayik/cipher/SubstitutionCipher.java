package cayik.cipher;

/*
 * This class expends from the MonoAlphabeticCipher-Class 
 * 
 * @autor cayik
 * @version 2018-10-11
 */
public class SubstitutionCipher extends MonoAlphabeticCipher{
	
	public SubstitutionCipher(String secretAlphabet) {
		super.setSecretAlphabet(secretAlphabet);
		
	}
	
	public void setSecretAlphabet(String secretAlphabet) {
		super.setSecretAlphabet(secretAlphabet);
	}
}
