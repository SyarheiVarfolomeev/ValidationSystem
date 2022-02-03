public interface Validator <T>{

    String validate(T t)throws ValidationFailedException;
}
