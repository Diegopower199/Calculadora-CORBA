package sumaApp;

public class _sumaStub extends org.omg.CORBA.portable.ObjectImpl implements sumaApp.suma {

    public double sumar(double primerNumero, double segundoNumero) {
        org.omg.CORBA.portable.InputStream $in = null;
        try {
            org.omg.CORBA.portable.OutputStream $out = _request("sumar", true);
            $out.write_double(primerNumero);
            $out.write_double(segundoNumero);
            $in = _invoke($out);
            double $result = $in.read_double();
            return $result;
        } catch (org.omg.CORBA.portable.ApplicationException $ex) {
            $in = $ex.getInputStream();
            String _id = $ex.getId();
            throw new org.omg.CORBA.MARSHAL(_id);
        } catch (org.omg.CORBA.portable.RemarshalException $rm) {
            return sumar(primerNumero, segundoNumero);
        } finally {
            _releaseReply($in);
        }
    } // sumar

    public double restar(double primerNumero, double segundoNumero) {
        org.omg.CORBA.portable.InputStream $in = null;
        try {
            org.omg.CORBA.portable.OutputStream $out = _request("restar", true);
            $out.write_double(primerNumero);
            $out.write_double(segundoNumero);
            $in = _invoke($out);
            double $result = $in.read_double();
            return $result;
        } catch (org.omg.CORBA.portable.ApplicationException $ex) {
            $in = $ex.getInputStream();
            String _id = $ex.getId();
            throw new org.omg.CORBA.MARSHAL(_id);
        } catch (org.omg.CORBA.portable.RemarshalException $rm) {
            return restar(primerNumero, segundoNumero);
        } finally {
            _releaseReply($in);
        }
    } // restar

    public double multiplicar(double primerNumero, double segundoNumero) {
        org.omg.CORBA.portable.InputStream $in = null;
        try {
            org.omg.CORBA.portable.OutputStream $out = _request("multiplicar", true);
            $out.write_double(primerNumero);
            $out.write_double(segundoNumero);
            $in = _invoke($out);
            double $result = $in.read_double();
            return $result;
        } catch (org.omg.CORBA.portable.ApplicationException $ex) {
            $in = $ex.getInputStream();
            String _id = $ex.getId();
            throw new org.omg.CORBA.MARSHAL(_id);
        } catch (org.omg.CORBA.portable.RemarshalException $rm) {
            return multiplicar(primerNumero, segundoNumero);
        } finally {
            _releaseReply($in);
        }
    } // multiplicar

    public double dividir(double primerNumero, double segundoNumero) {
        org.omg.CORBA.portable.InputStream $in = null;
        try {
            org.omg.CORBA.portable.OutputStream $out = _request("dividir", true);
            $out.write_double(primerNumero);
            $out.write_double(segundoNumero);
            $in = _invoke($out);
            double $result = $in.read_double();
            return $result;
        } catch (org.omg.CORBA.portable.ApplicationException $ex) {
            $in = $ex.getInputStream();
            String _id = $ex.getId();
            throw new org.omg.CORBA.MARSHAL(_id);
        } catch (org.omg.CORBA.portable.RemarshalException $rm) {
            return dividir(primerNumero, segundoNumero);
        } finally {
            _releaseReply($in);
        }
    } // dividir

    public double raizCuadrada(double primerNumero) {
        org.omg.CORBA.portable.InputStream $in = null;
        try {
            org.omg.CORBA.portable.OutputStream $out = _request("raizCuadrada", true);
            $out.write_double(primerNumero);
            $in = _invoke($out);
            double $result = $in.read_double();
            return $result;
        } catch (org.omg.CORBA.portable.ApplicationException $ex) {
            $in = $ex.getInputStream();
            String _id = $ex.getId();
            throw new org.omg.CORBA.MARSHAL(_id);
        } catch (org.omg.CORBA.portable.RemarshalException $rm) {
            return raizCuadrada(primerNumero);
        } finally {
            _releaseReply($in);
        }
    } // raizCuadrada

    public double potencia(double primerNumero, double segundoNumero) {
        org.omg.CORBA.portable.InputStream $in = null;
        try {
            org.omg.CORBA.portable.OutputStream $out = _request("potencia", true);
            $out.write_double(primerNumero);
            $out.write_double(segundoNumero);
            $in = _invoke($out);
            double $result = $in.read_double();
            return $result;
        } catch (org.omg.CORBA.portable.ApplicationException $ex) {
            $in = $ex.getInputStream();
            String _id = $ex.getId();
            throw new org.omg.CORBA.MARSHAL(_id);
        } catch (org.omg.CORBA.portable.RemarshalException $rm) {
            return potencia(primerNumero, segundoNumero);
        } finally {
            _releaseReply($in);
        }
    } // potencia

    public double seno(double primerNumero) {
        org.omg.CORBA.portable.InputStream $in = null;
        try {
            org.omg.CORBA.portable.OutputStream $out = _request("seno", true);
            $out.write_double(primerNumero);
            $in = _invoke($out);
            double $result = $in.read_double();
            return $result;
        } catch (org.omg.CORBA.portable.ApplicationException $ex) {
            $in = $ex.getInputStream();
            String _id = $ex.getId();
            throw new org.omg.CORBA.MARSHAL(_id);
        } catch (org.omg.CORBA.portable.RemarshalException $rm) {
            return seno(primerNumero);
        } finally {
            _releaseReply($in);
        }
    } // seno

    public double coseno(double primerNumero) {
        org.omg.CORBA.portable.InputStream $in = null;
        try {
            org.omg.CORBA.portable.OutputStream $out = _request("coseno", true);
            $out.write_double(primerNumero);
            $in = _invoke($out);
            double $result = $in.read_double();
            return $result;
        } catch (org.omg.CORBA.portable.ApplicationException $ex) {
            $in = $ex.getInputStream();
            String _id = $ex.getId();
            throw new org.omg.CORBA.MARSHAL(_id);
        } catch (org.omg.CORBA.portable.RemarshalException $rm) {
            return coseno(primerNumero);
        } finally {
            _releaseReply($in);
        }
    } // coseno

    public double tangente(double primerNumero) {
        org.omg.CORBA.portable.InputStream $in = null;
        try {
            org.omg.CORBA.portable.OutputStream $out = _request("tangente", true);
            $out.write_double(primerNumero);
            $in = _invoke($out);
            double $result = $in.read_double();
            return $result;
        } catch (org.omg.CORBA.portable.ApplicationException $ex) {
            $in = $ex.getInputStream();
            String _id = $ex.getId();
            throw new org.omg.CORBA.MARSHAL(_id);
        } catch (org.omg.CORBA.portable.RemarshalException $rm) {
            return tangente(primerNumero);
        } finally {
            _releaseReply($in);
        }
    } // tangente

    public double logaritmoNeperiano(double primerNumero) {
        org.omg.CORBA.portable.InputStream $in = null;
        try {
            org.omg.CORBA.portable.OutputStream $out = _request("logaritmoNeperiano", true);
            $out.write_double(primerNumero);
            $in = _invoke($out);
            double $result = $in.read_double();
            return $result;
        } catch (org.omg.CORBA.portable.ApplicationException $ex) {
            $in = $ex.getInputStream();
            String _id = $ex.getId();
            throw new org.omg.CORBA.MARSHAL(_id);
        } catch (org.omg.CORBA.portable.RemarshalException $rm) {
            return logaritmoNeperiano(primerNumero);
        } finally {
            _releaseReply($in);
        }
    } // logaritmoNeperiano

    public double logaritmoBaseDiez(double primerNumero) {
        org.omg.CORBA.portable.InputStream $in = null;
        try {
            org.omg.CORBA.portable.OutputStream $out = _request("logaritmoBaseDiez", true);
            $out.write_double(primerNumero);
            $in = _invoke($out);
            double $result = $in.read_double();
            return $result;
        } catch (org.omg.CORBA.portable.ApplicationException $ex) {
            $in = $ex.getInputStream();
            String _id = $ex.getId();
            throw new org.omg.CORBA.MARSHAL(_id);
        } catch (org.omg.CORBA.portable.RemarshalException $rm) {
            return logaritmoBaseDiez(primerNumero);
        } finally {
            _releaseReply($in);
        }
    } // logaritmoBaseDiez

    public String decimalToBinario(int primerNumero) {
        org.omg.CORBA.portable.InputStream $in = null;
        try {
            org.omg.CORBA.portable.OutputStream $out = _request("decimalToBinario", true);
            $out.write_long(primerNumero);
            $in = _invoke($out);
            String $result = $in.read_string();
            return $result;
        } catch (org.omg.CORBA.portable.ApplicationException $ex) {
            $in = $ex.getInputStream();
            String _id = $ex.getId();
            throw new org.omg.CORBA.MARSHAL(_id);
        } catch (org.omg.CORBA.portable.RemarshalException $rm) {
            return decimalToBinario(primerNumero);
        } finally {
            _releaseReply($in);
        }
    } // decimalToBinario

    public int binarioToDecimal(String numeroEnBinario) {
        org.omg.CORBA.portable.InputStream $in = null;
        try {
            org.omg.CORBA.portable.OutputStream $out = _request("binarioToDecimal", true);
            $out.write_string(numeroEnBinario);
            $in = _invoke($out);
            int $result = $in.read_long();
            return $result;
        } catch (org.omg.CORBA.portable.ApplicationException $ex) {
            $in = $ex.getInputStream();
            String _id = $ex.getId();
            throw new org.omg.CORBA.MARSHAL(_id);
        } catch (org.omg.CORBA.portable.RemarshalException $rm) {
            return binarioToDecimal(numeroEnBinario);
        } finally {
            _releaseReply($in);
        }
    } // binarioToDecimal

    public void shutdown() {
        org.omg.CORBA.portable.InputStream $in = null;
        try {
            org.omg.CORBA.portable.OutputStream $out = _request("shutdown", false);
            $in = _invoke($out);
            return;
        } catch (org.omg.CORBA.portable.ApplicationException $ex) {
            $in = $ex.getInputStream();
            String _id = $ex.getId();
            throw new org.omg.CORBA.MARSHAL(_id);
        } catch (org.omg.CORBA.portable.RemarshalException $rm) {
            shutdown();
        } finally {
            _releaseReply($in);
        }
    } // shutdown

    // Type-specific CORBA::Object operations
    private static String[] __ids = {
            "IDL:sumaApp/suma:1.0" };

    public String[] _ids() {
        return (String[]) __ids.clone();
    }

    private void readObject(java.io.ObjectInputStream s) throws java.io.IOException {
        String str = s.readUTF();
        String[] args = null;
        java.util.Properties props = null;
        org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init(args, props);
        try {
            org.omg.CORBA.Object obj = orb.string_to_object(str);
            org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate();
            _set_delegate(delegate);
        } finally {
            orb.destroy();
        }
    }

    private void writeObject(java.io.ObjectOutputStream s) throws java.io.IOException {
        String[] args = null;
        java.util.Properties props = null;
        org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init(args, props);
        try {
            String str = orb.object_to_string(this);
            s.writeUTF(str);
        } finally {
            orb.destroy();
        }
    }
} // class _sumaStub
