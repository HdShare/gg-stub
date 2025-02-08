package luaj.lib;

import luaj.LuaValue;
import luaj.Varargs;

public abstract class TwoArgFunction extends LibFunction {
    @Override
    public abstract LuaValue call(LuaValue luaValue, LuaValue luaValue2);

    @Override
    public final LuaValue call() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public final LuaValue call(LuaValue arg) {
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