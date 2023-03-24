
public class EntryValidator {
	 public static boolean validateName(String name) {
	        // Check if the name is not empty and contains only letters
	        return !name.isEmpty() && name.matches("^[a-zA-Z]+$");
	    }

	    public static boolean validateClassName(String className) {
	        // Check if the class name is not empty and starts with a letter
	        // followed by letters, digits, or underscores
	        return !className.isEmpty() && className.matches("^[a-zA-Z][a-zA-Z0-9_]*$");
	    }

}
