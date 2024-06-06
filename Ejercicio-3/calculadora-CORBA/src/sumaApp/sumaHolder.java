package sumaApp;

public final class sumaHolder implements org.omg.CORBA.portable.Streamable {
    public sumaApp.suma value = null;

    public sumaHolder() {
    }

    public sumaHolder(sumaApp.suma initialValue) {
        value = initialValue;
    }

    public void _read(org.omg.CORBA.portable.InputStream i) {
        value = sumaApp.sumaHelper.read(i);
    }

    public void _write(org.omg.CORBA.portable.OutputStream o) {
        sumaApp.sumaHelper.write(o, value);
    }

    public org.omg.CORBA.TypeCode _type() {
        return sumaApp.sumaHelper.type();
    }

}
