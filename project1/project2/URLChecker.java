/* Here code starts*/
package chapter02;
import java.util.Scanner;
import java.util.regex.Matcher;
	import java.util.regex.Pattern;

class URLChecker{
	public stativ void main(String args[]){
Pattern Mypattern = Pattern.compile("^((https?|ftp)://|(www|ftp)\\.)[a-z0-9-}+(\\.[a-z0-9-)+[a-z]+)+([/?].*)?$");
Scanner input = new Scanner(System.in);
System.out.println("Enter the URL to be checked: ");
String name = input.nextLine();
Matcher Mymatcher = Mypattern.matcher(name);
Boolean Myboolean = Mymatcher.matches();

if(Myboolean == true) {
	System.out.println("URLis correct, you can go ahead with this");
	} else {
	System.out.println("URL is incorrect, Please check your URL.");
		}
	}
}
/* Here code ends*/