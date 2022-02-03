public class IntegerValidator implements Validator<Integer>{
    @Override
    public String validate(Integer n) {
        if (n >= 1 && n <= 10) {
            return "Данные валидны";
        } else {
                throw new ValidationFailedException("Данные не валидны");
        }
    }
}
