package luaj.lib;

import luaj.LuaValue;
import luaj.Varargs;

public abstract class OneArgFunction extends LibFunction {
    @Override
    public abstract LuaValue call(LuaValue luaValue);

    @Override
    public final LuaValue call() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public final LuaValue call(LuaValue arg1, LuaValue arg2) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public LuaValue call(LuaValue arg1, LuaValue arg2, LuaValue arg3) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public Varargs invoke(Varargs varargs) {
        throw new RuntimeException("Stub!");
    }
}