public class FaturamentoEstados {
    public static void main(String[] args) {
        double sp = 67836.43;
        double rj = 36678.66;
        double mg = 29229.88;
        double es = 27165.48;
        double outros = 19849.53;

        double totalFaturamento = sp + rj + mg + es + outros;

        System.out.println("São Paulo: " + (sp * 100) / totalFaturamento);
        System.out.println("Rio de Janeiro: " + (rj * 100) / totalFaturamento);
        System.out.println("Minas Gerais: " + (mg * 100) / totalFaturamento);
        System.out.println("Espírito Santo: " + (es * 100) / totalFaturamento);
        System.out.println("Outros: " + (outros * 100) / totalFaturamento);
    }
}
