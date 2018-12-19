
public class Duplicate {

	public String duplicateChar(String string) {
		// TODO Auto-generated method stub
		String NewString = "";
		for(int str = 0;str<string.length(); str++){
			char ch = string.charAt(str);
			if(ch!= ' ')
				NewString = NewString+ch;
			string = string.replace(ch, ' ');
		}
		return NewString;
	}

}
