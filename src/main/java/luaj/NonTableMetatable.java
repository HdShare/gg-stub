package luaj;

public class NonTableMetatable implements Metatable {
    private final LuaValue value;

    public NonTableMetatable(LuaValue value) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public boolean useWeakKeys() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public boolean useWeakValues() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public LuaValue toLuaValue() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public LuaTable.Slot entry(LuaValue key, LuaValue value) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public LuaValue wrap(LuaValue value) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public LuaValue arrayget(LuaValue[] array, int index) {
        throw new RuntimeException("Stub!");
    }
}