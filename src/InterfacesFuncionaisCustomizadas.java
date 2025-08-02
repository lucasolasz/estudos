public class InterfacesFuncionaisCustomizadas {
  
    private static FourIntegersFunction sumAll = (i1, i2, i3, i4) -> i1+ i2+ i3+ i4;
    private static FourIntegersFunction multiplyAll = (i1, i2, i3, i4) -> i1* i2* i3* i4;
    public static void main(String[] args) throws Exception {
        System.out.println("Somatorio : " + sumAll.calculate(1, 2, 3, 4));
        System.out.println("Multiplicação : " + multiplyAll.calculate(1, 2, 3, 4));
    }

    @FunctionalInterface
    public interface FourIntegersFunction{
        Integer calculate (Integer i1, Integer i2, Integer i3, Integer i4);
    }

}
