package example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link PersonValue}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutablePersonValue.builder()}.
 */
@Generated(from = "PersonValue", generator = "Immutables")
@SuppressWarnings({"all"})
@javax.annotation.Generated("org.immutables.processor.ProxyProcessor")
public final class ImmutablePersonValue extends PersonValue {
  private final String name;
  private final String address;

  private ImmutablePersonValue(String name, String address) {
    this.name = name;
    this.address = address;
  }

  /**
   * @return The value of the {@code name} attribute
   */
  @Override
  String name() {
    return name;
  }

  /**
   * @return The value of the {@code address} attribute
   */
  @Override
  String address() {
    return address;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PersonValue#name() name} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for name
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePersonValue withName(String value) {
    String newValue = Objects.requireNonNull(value, "name");
    if (this.name.equals(newValue)) return this;
    return new ImmutablePersonValue(newValue, this.address);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PersonValue#address() address} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for address
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePersonValue withAddress(String value) {
    String newValue = Objects.requireNonNull(value, "address");
    if (this.address.equals(newValue)) return this;
    return new ImmutablePersonValue(this.name, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutablePersonValue} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutablePersonValue
        && equalTo((ImmutablePersonValue) another);
  }

  private boolean equalTo(ImmutablePersonValue another) {
    return name.equals(another.name)
        && address.equals(another.address);
  }

  /**
   * Computes a hash code from attributes: {@code name}, {@code address}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + name.hashCode();
    h += (h << 5) + address.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code PersonValue} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "PersonValue{"
        + "name=" + name
        + ", address=" + address
        + "}";
  }

  /**
   * Creates an immutable copy of a {@link PersonValue} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable PersonValue instance
   */
  public static ImmutablePersonValue copyOf(PersonValue instance) {
    if (instance instanceof ImmutablePersonValue) {
      return (ImmutablePersonValue) instance;
    }
    return ImmutablePersonValue.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutablePersonValue ImmutablePersonValue}.
   * <pre>
   * ImmutablePersonValue.builder()
   *    .name(String) // required {@link PersonValue#name() name}
   *    .address(String) // required {@link PersonValue#address() address}
   *    .build();
   * </pre>
   * @return A new ImmutablePersonValue builder
   */
  public static ImmutablePersonValue.Builder builder() {
    return new ImmutablePersonValue.Builder();
  }

  /**
   * Builds instances of type {@link ImmutablePersonValue ImmutablePersonValue}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "PersonValue", generator = "Immutables")
  public static final class Builder {
    private static final long INIT_BIT_NAME = 0x1L;
    private static final long INIT_BIT_ADDRESS = 0x2L;
    private long initBits = 0x3L;

    private String name;
    private String address;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code PersonValue} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(PersonValue instance) {
      Objects.requireNonNull(instance, "instance");
      name(instance.name());
      address(instance.address());
      return this;
    }

    /**
     * Initializes the value for the {@link PersonValue#name() name} attribute.
     * @param name The value for name 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder name(String name) {
      this.name = Objects.requireNonNull(name, "name");
      initBits &= ~INIT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the value for the {@link PersonValue#address() address} attribute.
     * @param address The value for address 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder address(String address) {
      this.address = Objects.requireNonNull(address, "address");
      initBits &= ~INIT_BIT_ADDRESS;
      return this;
    }

    /**
     * Builds a new {@link ImmutablePersonValue ImmutablePersonValue}.
     * @return An immutable instance of PersonValue
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutablePersonValue build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutablePersonValue(name, address);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_NAME) != 0) attributes.add("name");
      if ((initBits & INIT_BIT_ADDRESS) != 0) attributes.add("address");
      return "Cannot build PersonValue, some of required attributes are not set " + attributes;
    }
  }
}
