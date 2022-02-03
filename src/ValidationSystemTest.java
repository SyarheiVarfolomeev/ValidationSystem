import java.util.regex.Pattern;

public class ValidationSystemTest {
    public static void main(String[] args) {

        ValidationSystem sss = new ValidationSystem();
        Validator validator = sss.CreateValidator(TypeValidator.INTEGER);
        System.out.println(validator.validate(2));

    }
}
