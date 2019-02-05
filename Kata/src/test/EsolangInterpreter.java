package test;

public class EsolangInterpreter {

	public static void main(String[] args) {
		
	}
	
	public static String interpreter(String code, String inputTape) {
        final boolean tape[] = new boolean[inputTape.length()];
        for (int i = 0; i < inputTape.length(); i++) {
            tape[i] = inputTape.charAt(i) == '1';
        }

        int pointer = 0;

        for (int i = 0; i < code.length(); i++) {
            switch (code.charAt(i)) {
                case '>': pointer++; break;
                case '<': pointer--; break;
                case '*': tape[pointer] = !tape[pointer]; break;

                case '[':
                    if (!tape[pointer]) {
                        int nested = 1;
                        while (i < code.length() && nested > 0) {
                            i++;
                            switch (code.charAt(i)) {
                                case '[': nested++; break;
                                case ']': nested--; break;
                            }
                        }
                    }
                    break;

                case ']':
                    if (tape[pointer]) {
                        int nested = 1;
                        while (i >= 0 && nested > 0) {
                            i--;
                            switch (code.charAt(i)) {
                                case '[': nested--; break;
                                case ']': nested++; break;
                            }
                        }
                    }
                    break;
            }

            if (pointer < 0 || pointer >= tape.length) {
                break;
            }
        }

        StringBuilder sb = new StringBuilder(tape.length);
        for (boolean b : tape) {
            sb.append(b ? '1' : '0');
        }

        return sb.toString();
    }
}
