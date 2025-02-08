package luaj;

public abstract class LuaNumber extends LuaValue {
    public static LuaValue s_metatable;

    @Override
    public int type() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public String typename() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public LuaNumber checknumber() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public LuaNumber checknumber(String errmsg) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public LuaNumber optnumber(LuaNumber defval) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public LuaValue tonumber() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public boolean isnumber() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public boolean isstring() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public LuaValue getmetatable() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public LuaValue concat(LuaValue rhs) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public LuaValue concatTo(LuaNumber lhs) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public LuaValue concatTo(LuaString lhs) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public int strcmp(LuaString rhs) {
        throw new RuntimeException("Stub!");
    }
}