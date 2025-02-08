package luaj;

import java.lang.ref.WeakReference;

public class WeakTable implements Metatable {
    private final LuaValue backing;
    private final boolean weakkeys;
    private final boolean weakvalues;

    public static LuaTable make(boolean weakkeys, boolean weakvalues) {
        throw new RuntimeException("Stub!");
    }

    public WeakTable(boolean weakkeys, boolean weakvalues, LuaValue backing) {
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

    public static abstract class WeakSlot implements LuaTable.Slot {
        protected Object key;
        protected LuaTable.Slot next;
        protected Object value;

        protected abstract WeakSlot copy(LuaTable.Slot slot);

        @Override
        public abstract int keyindex(int i);

        public abstract LuaTable.Slot set(LuaValue luaValue);

        protected WeakSlot(Object key, Object value, LuaTable.Slot next) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public LuaTable.StrongSlot first() {
            throw new RuntimeException("Stub!");
        }

        @Override
        public LuaTable.StrongSlot find(LuaValue key) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public boolean keyeq(LuaValue key) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public LuaTable.Slot rest() {
            throw new RuntimeException("Stub!");
        }

        @Override
        public int arraykey(int max) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public LuaTable.Slot set(LuaTable.StrongSlot target, LuaValue value) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public LuaTable.Slot add(LuaTable.Slot entry) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public LuaTable.Slot remove(LuaTable.StrongSlot target) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public LuaTable.Slot relink(LuaTable.Slot rest) {
            throw new RuntimeException("Stub!");
        }

        public LuaValue strongkey() {
            throw new RuntimeException("Stub!");
        }

        public LuaValue strongvalue() {
            throw new RuntimeException("Stub!");
        }
    }

    static class WeakKeySlot extends WeakSlot {
        private final int keyhash;

        protected WeakKeySlot(LuaValue key, LuaValue value, LuaTable.Slot next) {
            super(WeakTable.weaken(key), value, next);
            throw new RuntimeException("Stub!");
        }

        protected WeakKeySlot(WeakKeySlot copyFrom, LuaTable.Slot next) {
            super(copyFrom.key, copyFrom.value, next);
            throw new RuntimeException("Stub!");
        }

        @Override
        public int keyindex(int mask) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public LuaTable.Slot set(LuaValue value) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public LuaValue strongkey() {
            throw new RuntimeException("Stub!");
        }

        @Override
        protected WeakSlot copy(LuaTable.Slot rest) {
            throw new RuntimeException("Stub!");
        }
    }

    static class WeakValueSlot extends WeakSlot {
        protected WeakValueSlot(LuaValue key, LuaValue value, LuaTable.Slot next) {
            super(key, WeakTable.weaken(value), next);
            throw new RuntimeException("Stub!");
        }

        protected WeakValueSlot(WeakValueSlot copyFrom, LuaTable.Slot next) {
            super(copyFrom.key, copyFrom.value, next);
            throw new RuntimeException("Stub!");
        }

        @Override
        public int keyindex(int mask) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public LuaTable.Slot set(LuaValue value) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public LuaValue strongvalue() {
            throw new RuntimeException("Stub!");
        }

        @Override
        protected WeakSlot copy(LuaTable.Slot next) {
            throw new RuntimeException("Stub!");
        }
    }

    static class WeakKeyAndValueSlot extends WeakSlot {
        private final int keyhash;

        protected WeakKeyAndValueSlot(LuaValue key, LuaValue value, LuaTable.Slot next) {
            super(WeakTable.weaken(key), WeakTable.weaken(value), next);
            throw new RuntimeException("Stub!");
        }

        protected WeakKeyAndValueSlot(WeakKeyAndValueSlot copyFrom, LuaTable.Slot next) {
            super(copyFrom.key, copyFrom.value, next);
            throw new RuntimeException("Stub!");
        }

        @Override
        public int keyindex(int hashMask) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public LuaTable.Slot set(LuaValue value) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public LuaValue strongkey() {
            throw new RuntimeException("Stub!");
        }

        @Override
        public LuaValue strongvalue() {
            throw new RuntimeException("Stub!");
        }

        @Override
        protected WeakSlot copy(LuaTable.Slot next) {
            throw new RuntimeException("Stub!");
        }
    }

    protected static LuaValue weaken(LuaValue value) {
        throw new RuntimeException("Stub!");
    }

    protected static LuaValue strengthen(Object ref) {
        throw new RuntimeException("Stub!");
    }

    public static class WeakValue extends LuaValue {
        WeakReference ref;

        protected WeakValue(LuaValue value) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public int type() {
            throw new RuntimeException("Stub!");
        }

        @Override
        public String typename() {
            throw new RuntimeException("Stub!");
        }

        @Override
        public String toString() {
            throw new RuntimeException("Stub!");
        }

        @Override
        public LuaValue strongvalue() {
            throw new RuntimeException("Stub!");
        }

        @Override
        public boolean raweq(LuaValue rhs) {
            throw new RuntimeException("Stub!");
        }
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