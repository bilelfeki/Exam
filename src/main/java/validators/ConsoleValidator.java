package validators;

import exceptions.InvalidQCMChoiceException;

public class ConsoleValidator {
    public static void verifyAStringTrueOrFalse(String trueOrFalse) throws InvalidQCMChoiceException {
        if(!(trueOrFalse.equals("true")  || trueOrFalse.equals("false"))) {
            InvalidQCMChoiceException invalidQCMChoiceException = new
                    InvalidQCMChoiceException("you should enter either true or false ");

            throw invalidQCMChoiceException;
        }
    }
}