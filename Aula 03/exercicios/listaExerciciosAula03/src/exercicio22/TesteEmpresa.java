package exercicio22;

public class TesteEmpresa {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("Eduarda MEI", "12.123.123/0001-00", 1);

        System.out.println(empresa);
        empresa.contratar();
        empresa.demitir();
        System.out.println(empresa);
    }
}
