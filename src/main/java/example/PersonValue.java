package example;

import org.immutables.value.Value;

@Value.Immutable
public abstract class PersonValue {
    abstract String name();
    abstract String address();
}
