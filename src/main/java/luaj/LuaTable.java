package luaj;

import java.io.IOException;
import java.util.Map;
import java.util.Set;

public class LuaTable extends LuaValue implements Metatable {
    public static final int MAX_LEN = 16777215;
    private static final int MIN_HASH_CAPACITY = 2;
    private static final LuaString N = valueOf("n");
    private static final Slot[] NOBUCKETS = new Slot[0];
    private static volatile Set<LuaTable> dumped = null;
    private static volatile int totalCnt = 0;
    private LuaValue[] array;
    private Slot[] hash;
    protected int hashEntries;
    protected Metatable m_metatable;

    public interface Slot {
        Slot add(Slot slot);

        int arraykey(int i);

        StrongSlot find(LuaValue luaValue);

        StrongSlot first();

        boolean keyeq(LuaValue luaValue);

        int keyindex(int i);

        Slot relink(Slot slot);

        Slot remove(StrongSlot strongSlot);

        Slot rest();

        Slot set(StrongSlot strongSlot, LuaValue luaValue);
    }

    public interface StrongSlot extends Slot {
        LuaValue key();

        Varargs toVarargs();

        LuaValue value();
    }

    public LuaTable() {
        throw new RuntimeException("Stub!");
    }

    public LuaTable(int narray, int nhash) {
        throw new RuntimeException("Stub!");
    }

    public LuaTable(LuaValue[] named, LuaValue[] unnamed, Varargs lastarg) {
        throw new RuntimeException("Stub!");
    }

    public LuaTable(Varargs varargs) {
        throw new RuntimeException("Stub!");
    }

    public LuaTable(Varargs varargs, int firstarg) {
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
    public boolean istable() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public LuaTable checktable() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public LuaTable opttable(LuaTable defval) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public void presize(int narray) {
        throw new RuntimeException("Stub!");
    }

    public void presize(int narray, int nhash) {
        throw new RuntimeException("Stub!");
    }

    private static LuaValue[] resize(LuaValue[] old, int n) {
        throw new RuntimeException("Stub!");
    }

    public int getArrayLength() {
        throw new RuntimeException("Stub!");
    }

    public int getHashLength() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public LuaValue getmetatable() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public LuaValue setmetatable(LuaValue metatable) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public LuaValue get(int key) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public LuaValue get(LuaValue key) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public LuaValue rawget(int key) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public LuaValue rawget(LuaValue key) {
        throw new RuntimeException("Stub!");
    }

    protected LuaValue hashget(LuaValue key) {
        throw new RuntimeException("Stub!");
    }

    private StrongSlot slotget(LuaValue key) {
        throw new RuntimeException("Stub!");
    }

    public long getchecklong(LuaValue key) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public void set(int key, LuaValue value) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public void set(LuaValue key, LuaValue value) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public void rawset(int key, LuaValue value) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public void rawset(LuaValue key, LuaValue value) {
        throw new RuntimeException("Stub!");
    }

    private boolean arrayset(int key, LuaValue value) {
        throw new RuntimeException("Stub!");
    }

    public LuaValue remove(int pos, int n) {
        throw new RuntimeException("Stub!");
    }

    public void insert(int pos, LuaValue value) {
        throw new RuntimeException("Stub!");
    }

    public LuaValue concat(LuaString sep, int i, int j) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public int length() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public LuaValue len() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public int rawlen() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public Varargs next(LuaValue key) {
        throw new RuntimeException("Stub!");
    }

    public LuaValue testIterator() {
        throw new RuntimeException("Stub!");
    }

    public Iterator iterator() {
        throw new RuntimeException("Stub!");
    }

    public class Iterator {
        private int i = -1;
        private Slot slot = null;
        private StrongSlot first = null;

        public Iterator() {
        }

        public boolean next() {
            throw new RuntimeException("Stub!");
        }

        public int intkey() {
            throw new RuntimeException("Stub!");
        }

        public LuaValue key() {
            throw new RuntimeException("Stub!");
        }

        public LuaValue value() {
            throw new RuntimeException("Stub!");
        }

        public Varargs varargs() {
            throw new RuntimeException("Stub!");
        }
    }

    @Override
    public Varargs inext(LuaValue key) {
        throw new RuntimeException("Stub!");
    }

    public void hashset(LuaValue key, LuaValue value) {
        throw new RuntimeException("Stub!");
    }

    public static int hashmod(int hashCode, int mask) {
        throw new RuntimeException("Stub!");
    }

    public static int hashSlot(LuaValue key, int hashMask) {
        throw new RuntimeException("Stub!");
    }

    private int hashSlot(LuaValue key) {
        throw new RuntimeException("Stub!");
    }

    private void hashRemove(LuaValue key) {
        throw new RuntimeException("Stub!");
    }

    private int countHashKeys() {
        throw new RuntimeException("Stub!");
    }

    private void dropWeakArrayValues() {
        throw new RuntimeException("Stub!");
    }

    private int countIntKeys(int[] nums) {
        throw new RuntimeException("Stub!");
    }

    static int log2(int x) {
        throw new RuntimeException("Stub!");
    }

    private void rehash(int newKey) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public Slot entry(LuaValue key, LuaValue value) {
        throw new RuntimeException("Stub!");
    }

    protected static boolean isLargeKey(LuaValue key) {
        throw new RuntimeException("Stub!");
    }

    public void sort(LuaValue comparator) {
        throw new RuntimeException("Stub!");
    }

    private void heapSort(int count, LuaValue cmpfunc) {
        throw new RuntimeException("Stub!");
    }

    private void heapify(int count, LuaValue cmpfunc) {
        throw new RuntimeException("Stub!");
    }

    private void siftDown(int start, int end, LuaValue cmpfunc) {
        throw new RuntimeException("Stub!");
    }

    private boolean compare(int i, int j, LuaValue cmpfunc) {
        throw new RuntimeException("Stub!");
    }

    public LuaValue[] keys() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public boolean eq_b(LuaValue val) {
        throw new RuntimeException("Stub!");
    }

    public Varargs unpack(long i, long j) {
        throw new RuntimeException("Stub!");
    }

    private static class LinkSlot implements StrongSlot {
        private Entry entry;
        private Slot next;

        LinkSlot(Entry entry, Slot next) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public LuaValue key() {
            throw new RuntimeException("Stub!");
        }

        @Override
        public int keyindex(int hashMask) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public LuaValue value() {
            throw new RuntimeException("Stub!");
        }

        @Override
        public Varargs toVarargs() {
            throw new RuntimeException("Stub!");
        }

        @Override
        public StrongSlot first() {
            throw new RuntimeException("Stub!");
        }

        @Override
        public StrongSlot find(LuaValue key) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public boolean keyeq(LuaValue key) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public Slot rest() {
            throw new RuntimeException("Stub!");
        }

        @Override
        public int arraykey(int max) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public Slot set(StrongSlot target, LuaValue value) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public Slot add(Slot entry) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public Slot remove(StrongSlot target) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public Slot relink(Slot rest) {
            throw new RuntimeException("Stub!");
        }

        private Slot setnext(Slot next) {
            throw new RuntimeException("Stub!");
        }

        public String toString() {
            throw new RuntimeException("Stub!");
        }
    }

    public static abstract class Entry extends Varargs implements StrongSlot {
        @Override
        public abstract LuaValue key();

        @Override
        public abstract boolean keyeq(LuaValue luaValue);

        @Override
        public abstract int keyindex(int i);

        abstract Entry set(LuaValue luaValue);

        public abstract LuaValue value();

        Entry() {
            throw new RuntimeException("Stub!");
        }

        @Override
        public int arraykey(int max) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public LuaValue arg(int i) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public int narg() {
            throw new RuntimeException("Stub!");
        }

        @Override
        public Varargs toVarargs() {
            throw new RuntimeException("Stub!");
        }

        @Override
        public LuaValue arg1() {
            throw new RuntimeException("Stub!");
        }

        @Override
        public Varargs subargs(int start) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public StrongSlot first() {
            throw new RuntimeException("Stub!");
        }

        @Override
        public Slot rest() {
            throw new RuntimeException("Stub!");
        }

        @Override
        public StrongSlot find(LuaValue key) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public Slot set(StrongSlot target, LuaValue value) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public Slot add(Slot entry) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public Slot remove(StrongSlot target) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public Slot relink(Slot rest) {
            throw new RuntimeException("Stub!");
        }
    }

    public static class IntKeyEntry extends Entry {
        private final int key;
        private LuaValue value;

        IntKeyEntry(int key, LuaValue value) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public LuaValue key() {
            throw new RuntimeException("Stub!");
        }

        @Override
        public int arraykey(int max) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public LuaValue value() {
            throw new RuntimeException("Stub!");
        }

        @Override
        public Entry set(LuaValue value) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public int keyindex(int mask) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public boolean keyeq(LuaValue key) {
            throw new RuntimeException("Stub!");
        }
    }

    private static abstract class ValueEntry extends Entry {
        protected final LuaValue key;

        ValueEntry(LuaValue key) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public final LuaValue key() {
            throw new RuntimeException("Stub!");
        }

        @Override
        public final int keyindex(int mask) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public final boolean keyeq(LuaValue key) {
            throw new RuntimeException("Stub!");
        }
    }

    public void unsafehashset(int index, LuaString key, boolean value) {
        throw new RuntimeException("Stub!");
    }

    public void unsafehashset(int index, LuaString key, int value) {
        throw new RuntimeException("Stub!");
    }

    public void unsafehashset(int index, LuaString key, long value) {
        throw new RuntimeException("Stub!");
    }

    public void unsafehashset(int index, LuaString key, float value) {
        throw new RuntimeException("Stub!");
    }

    public void unsafehashset(int index, LuaString key, double value) {
        throw new RuntimeException("Stub!");
    }

    public static Entry defaultEntry(LuaValue key, LuaValue value) {
        throw new RuntimeException("Stub!");
    }

    public static class NormalEntry extends ValueEntry {
        private LuaValue value;

        public NormalEntry(LuaValue key, LuaValue value) {
            super(key);
            throw new RuntimeException("Stub!");
        }

        @Override
        public LuaValue value() {
            throw new RuntimeException("Stub!");
        }

        @Override
        public Entry set(LuaValue value) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public Varargs toVarargs() {
            throw new RuntimeException("Stub!");
        }
    }

    public static class BooleanValueEntry extends ValueEntry {
        private boolean value;

        BooleanValueEntry(LuaValue key, boolean value) {
            super(key);
            throw new RuntimeException("Stub!");
        }

        @Override
        public LuaValue value() {
            throw new RuntimeException("Stub!");
        }

        @Override
        public Entry set(LuaValue value) {
            throw new RuntimeException("Stub!");
        }
    }

    public static class FloatValueEntry extends ValueEntry {
        private float value;

        FloatValueEntry(LuaValue key, float value) {
            super(key);
            throw new RuntimeException("Stub!");
        }

        @Override
        public LuaValue value() {
            throw new RuntimeException("Stub!");
        }

        @Override
        public Entry set(LuaValue value) {
            throw new RuntimeException("Stub!");
        }
    }

    public static class DoubleValueEntry extends ValueEntry {
        private double value;

        DoubleValueEntry(LuaValue key, double value) {
            super(key);
            throw new RuntimeException("Stub!");
        }

        @Override
        public LuaValue value() {
            throw new RuntimeException("Stub!");
        }

        @Override
        public Entry set(LuaValue value) {
            throw new RuntimeException("Stub!");
        }
    }

    public static class IntValueEntry extends ValueEntry {
        private int value;

        IntValueEntry(LuaValue key, int value) {
            super(key);
            throw new RuntimeException("Stub!");
        }

        @Override
        public LuaValue value() {
            throw new RuntimeException("Stub!");
        }

        int getValue() {
            throw new RuntimeException("Stub!");
        }

        @Override
        public Entry set(LuaValue value) {
            throw new RuntimeException("Stub!");
        }
    }

    public static class LongValueEntry extends ValueEntry {
        private long value;

        LongValueEntry(LuaValue key, long value) {
            super(key);
            throw new RuntimeException("Stub!");
        }

        @Override
        public LuaValue value() {
            throw new RuntimeException("Stub!");
        }

        long getValue() {
            throw new RuntimeException("Stub!");
        }

        @Override
        public Entry set(LuaValue value) {
            throw new RuntimeException("Stub!");
        }
    }

    public static class DeadSlot implements Slot {
        private final Object key;
        private Slot next;

        private DeadSlot(LuaValue key, Slot next) {
            throw new RuntimeException("Stub!");
        }

        DeadSlot(LuaValue luaValue, Slot slot, DeadSlot deadSlot) {
            throw new RuntimeException("Stub!");
        }

        private LuaValue key() {
            throw new RuntimeException("Stub!");
        }

        @Override
        public int keyindex(int hashMask) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public StrongSlot first() {
            throw new RuntimeException("Stub!");
        }

        @Override
        public StrongSlot find(LuaValue key) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public boolean keyeq(LuaValue key) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public Slot rest() {
            throw new RuntimeException("Stub!");
        }

        @Override
        public int arraykey(int max) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public Slot set(StrongSlot target, LuaValue value) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public Slot add(Slot newEntry) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public Slot remove(StrongSlot target) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public Slot relink(Slot rest) {
            throw new RuntimeException("Stub!");
        }

        public String toString() {
            throw new RuntimeException("Stub!");
        }
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
    public LuaValue wrap(LuaValue value) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public LuaValue arrayget(LuaValue[] array, int index) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public String tojstring() {
        throw new RuntimeException("Stub!");
    }

    public String tojstring(Appendable out, Map<LuaValue, LuaValue> allow) throws IOException {
        throw new RuntimeException("Stub!");
    }

    private Appendable dump(String level, Appendable out, Map<LuaValue, LuaValue> allow) throws IOException {
        throw new RuntimeException("Stub!");
    }

    public int getHashEntries() {
        throw new RuntimeException("Stub!");
    }
}