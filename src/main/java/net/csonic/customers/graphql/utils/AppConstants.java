package net.csonic.customers.graphql.utils;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;

public final class AppConstants {

    // Hacemos privado el constructor para evitar instancias de esta clase
    private AppConstants() {
        throw new AssertionError("No se debe instanciar esta clase");
    }

    // Lista inmutable de tipos de cliente válidos
    public static final List<String> VALID_CUSTOMER_TYPES = Collections.unmodifiableList(
        Arrays.asList("AN", "CD", "CF", "CL", "CN", "CP", "CT", "CX", "DN", "FA", "FD", "GC", "GE", "NC", "VP", "XC")
    );
}
