package de.gematik.ti.schema.gen.vsd.utils;

public class IntegerWrapper {

    public Integer integer;

    public IntegerWrapper() {
        this.integer = new Integer(0);
    }

    public IntegerWrapper(int integer) {
        this(new Integer(integer));
    }

    public IntegerWrapper(Integer integer) {
        this.integer = integer;
    }

    public static IntegerWrapper valueOf(String string) {
        return new IntegerWrapper(Integer.valueOf(string));
    }

    @Override
    public String toString() {
        return this.integer.toString();
    }

    public int toInt() {
        return this.integer.intValue();
    }
}
