import java.util.regex.Pattern;

public class StringValidator implements Validator<String>{
    @Override
    public String validate(String word) {
        boolean result = Pattern.matches("[A-Z]\\w*", word);
        if (result) {
            return "Данные валидны";
        } else {
            throw new ValidationFailedException("Данные не валидны");
        }
    }
}
