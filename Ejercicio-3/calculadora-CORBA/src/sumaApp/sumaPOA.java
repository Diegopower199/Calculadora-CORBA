package sumaApp;

public abstract class sumaPOA extends org.omg.PortableServer.Servant
        implements sumaApp.sumaOperations, org.omg.CORBA.portable.InvokeHandler {

    private static java.util.Hashtable _methods = new java.util.Hashtable();
    static {
        _methods.put("sumar", new java.lang.Integer(0));
        _methods.put("restar", new java.lang.Integer(1));
        _methods.put("multiplicar", new java.lang.Integer(2));
        _methods.put("dividir", new java.lang.Integer(3));
        _methods.put("raizCuadrada", new java.lang.Integer(4));
        _methods.put("potencia", new java.lang.Integer(5));
        _methods.put("seno", new java.lang.Integer(6));
        _methods.put("coseno", new java.lang.Integer(7));
        _methods.put("tangente", new java.lang.Integer(8));
        _methods.put("logaritmoNeperiano", new java.lang.Integer(9));
        _methods.put("logaritmoBaseDiez", new java.lang.Integer(10));
        _methods.put("decimalToBinario", new java.lang.Integer(11));
        _methods.put("binarioToDecimal", new java.lang.Integer(12));
        _methods.put("shutdown", new java.lang.Integer(13));
    }

    public org.omg.CORBA.portable.OutputStream _invoke(String $method,
            org.omg.CORBA.portable.InputStream in,
            org.omg.CORBA.portable.ResponseHandler $rh) {
        org.omg.CORBA.portable.OutputStream out = null;
        java.lang.Integer __method = (java.lang.Integer) _methods.get($method);
        if (__method == null)
            throw new org.omg.CORBA.BAD_OPERATION(0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

        switch (__method.intValue()) {
            case 0: // sumaApp/suma/sumar
            {
                double primerNumero = in.read_double();
                double segundoNumero = in.read_double();
                double $result = (double) 0;
                $result = this.sumar(primerNumero, segundoNumero);
                out = $rh.createReply();
                out.write_double($result);
                break;
            }

            case 1: // sumaApp/suma/restar
            {
                double primerNumero = in.read_double();
                double segundoNumero = in.read_double();
                double $result = (double) 0;
                $result = this.restar(primerNumero, segundoNumero);
                out = $rh.createReply();
                out.write_double($result);
                break;
            }

            case 2: // sumaApp/suma/multiplicar
            {
                double primerNumero = in.read_double();
                double segundoNumero = in.read_double();
                double $result = (double) 0;
                $result = this.multiplicar(primerNumero, segundoNumero);
                out = $rh.createReply();
                out.write_double($result);
                break;
            }

            case 3: // sumaApp/suma/dividir
            {
                double primerNumero = in.read_double();
                double segundoNumero = in.read_double();
                double $result = (double) 0;
                $result = this.dividir(primerNumero, segundoNumero);
                out = $rh.createReply();
                out.write_double($result);
                break;
            }

            case 4: // sumaApp/suma/raizCuadrada
            {
                double primerNumero = in.read_double();
                double $result = (double) 0;
                $result = this.raizCuadrada(primerNumero);
                out = $rh.createReply();
                out.write_double($result);
                break;
            }

            case 5: // sumaApp/suma/potencia
            {
                double primerNumero = in.read_double();
                double segundoNumero = in.read_double();
                double $result = (double) 0;
                $result = this.potencia(primerNumero, segundoNumero);
                out = $rh.createReply();
                out.write_double($result);
                break;
            }

            case 6: // sumaApp/suma/seno
            {
                double primerNumero = in.read_double();
                double $result = (double) 0;
                $result = this.seno(primerNumero);
                out = $rh.createReply();
                out.write_double($result);
                break;
            }

            case 7: // sumaApp/suma/coseno
            {
                double primerNumero = in.read_double();
                double $result = (double) 0;
                $result = this.coseno(primerNumero);
                out = $rh.createReply();
                out.write_double($result);
                break;
            }

            case 8: // sumaApp/suma/tangente
            {
                double primerNumero = in.read_double();
                double $result = (double) 0;
                $result = this.tangente(primerNumero);
                out = $rh.createReply();
                out.write_double($result);
                break;
            }

            case 9: // sumaApp/suma/logaritmoNeperiano
            {
                double primerNumero = in.read_double();
                double $result = (double) 0;
                $result = this.logaritmoNeperiano(primerNumero);
                out = $rh.createReply();
                out.write_double($result);
                break;
            }

            case 10: // sumaApp/suma/logaritmoBaseDiez
            {
                double primerNumero = in.read_double();
                double $result = (double) 0;
                $result = this.logaritmoBaseDiez(primerNumero);
                out = $rh.createReply();
                out.write_double($result);
                break;
            }

            case 11: // sumaApp/suma/decimalToBinario
            {
                int primerNumero = in.read_long();
                String $result = null;
                $result = this.decimalToBinario(primerNumero);
                out = $rh.createReply();
                out.write_string($result);
                break;
            }

            case 12: // sumaApp/suma/binarioToDecimal
            {
                String numeroEnBinario = in.read_string();
                int $result = (int) 0;
                $result = this.binarioToDecimal(numeroEnBinario);
                out = $rh.createReply();
                out.write_long($result);
                break;
            }

            case 13: // sumaApp/suma/shutdown
            {
                this.shutdown();
                out = $rh.createReply();
                break;
            }

            default:
                throw new org.omg.CORBA.BAD_OPERATION(0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
        }

        return out;
    } // _invoke

    // Type-specific CORBA::Object operations
    private static String[] __ids = {
            "IDL:sumaApp/suma:1.0" };

    public String[] _all_interfaces(org.omg.PortableServer.POA poa, byte[] objectId) {
        return (String[]) __ids.clone();
    }

    public suma _this() {
        return sumaHelper.narrow(
                super._this_object());
    }

    public suma _this(org.omg.CORBA.ORB orb) {
        return sumaHelper.narrow(
                super._this_object(orb));
    }

} // class sumaPOA
