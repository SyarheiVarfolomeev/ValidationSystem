public class ValidationSystem {

    public Validator CreateValidator(TypeValidator typeValidator){
        switch(typeValidator){
            case STRING: return new StringValidator();
            case INTEGER: return new IntegerValidator();
        }return null;
    }
}
