/**
 * Escreva uma descrição da classe AppStart aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class AppStart
{
    private Size size;
    public AppStart()
    {
        
    }
    
    public void main()
    {
        System.out.println("Name         : " + size.MEDIUM.name());
        System.out.println("toString()   : " + size.MEDIUM.toString());
        System.out.println("Ordem        : " + size.MEDIUM.ordinal());
        System.out.println("Valor Mínimo : " + size.MEDIUM.getMinValue());
        System.out.println("Valor Máximo : " + size.MEDIUM.getMaxValue());
        System.out.println("Código       : " + size.MEDIUM.getCode());
    }
}
