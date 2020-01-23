package value;

public class AssignmentValue extends Value {

    public static final AssignmentValue INSTANCE = new AssignmentValue();

    private AssignmentValue() { }

    @Override
    public boolean equals(Object obj) {
        return this == obj;
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
