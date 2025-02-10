package lesson.twelve;

public class Creature {

	public static void main(String[] args) {
		try {
			checkArgs(args);
			System.out.println("This is a placeholder for Creature " + args[0]);
		} catch(NoArgumentsException e) {
			System.out.println("NoArgumentsException: " + e.getMessage());
		} finally {
			System.out.println("Program Terminated");
		}
	}
	
	public static void checkArgs(String[] args) throws NoArgumentsException {
		if (args.length == 0) {
			throw new NoArgumentsException("Must provide at least one argument");
		}
	}

}

class NoArgumentsException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NoArgumentsException(String m) {
		super(m);
	}
}