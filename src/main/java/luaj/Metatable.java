package luaj;

public interface Metatable {
    LuaValue arrayget(LuaValue[] luaValueArr, int i);

    LuaTable.Slot entry(LuaValue luaValue, LuaValue luaValue2);

    LuaValue toLuaValue();

    boolean useWeakKeys();

    boolean useWeakValues();

    LuaValue wrap(LuaValue luaValue);
}