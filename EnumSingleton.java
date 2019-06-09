package Program;

import java.io.Serializable;

public enum EnumSingleton implements Serializable {
    SINGLETON;

    protected Object readResolve() {

        return SINGLETON;

    }
}
