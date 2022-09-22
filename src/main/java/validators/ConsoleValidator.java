package validators;

import exceptions.InvalidQCMChoiceException;

public class ConsoleValidator {
    public static void verifyAStringTrueOrFalse(String trueOrFalse) throws InvalidQCMChoiceException {
        if(!(trueOrFalse.equals("true")  || trueOrFalse.equals("false"))) {
            throw
                    new InvalidQCMChoiceException("you should enter either true or false ");
        }
    }
}